package typings.pulumiAws

import typings.pulumiAws.pulumiAwsStrings.any
import typings.pulumiAws.pulumiAwsStrings.expire
import typings.pulumiAws.pulumiAwsStrings.imageCountMoreThan
import typings.pulumiAws.pulumiAwsStrings.sinceImagePushed
import typings.pulumiAws.pulumiAwsStrings.tagged
import typings.pulumiAws.pulumiAwsStrings.untagged
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lifecyclePolicyDocumentMod {
  
  @js.native
  trait Action extends StObject {
    
    /**
      * The specified action type - the only supported value is `expire`.
      */
    var `type`: Input[expire] = js.native
  }
  object Action {
    
    @scala.inline
    def apply(`type`: Input[expire]): Action = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Input[expire]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LifecyclePolicyDocument extends StObject {
    
    var rules: js.Array[PolicyRule] = js.native
  }
  object LifecyclePolicyDocument {
    
    @scala.inline
    def apply(rules: js.Array[PolicyRule]): LifecyclePolicyDocument = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecyclePolicyDocument]
    }
    
    @scala.inline
    implicit class LifecyclePolicyDocumentMutableBuilder[Self <: LifecyclePolicyDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[PolicyRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: PolicyRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PolicyRule extends StObject {
    
    /**
      * The action to perform when selection criteria is met.
      */
    var action: Action = js.native
    
    /**
      * An optional description for the rule.
      */
    var description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Indicate the Rule Priority - each rule must have a different priority.
      */
    var rulePriority: Input[Double] = js.native
    
    /**
      * The selection criteria for the rule.
      */
    var selection: Selection = js.native
  }
  object PolicyRule {
    
    @scala.inline
    def apply(action: Action, rulePriority: Input[Double], selection: Selection): PolicyRule = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], rulePriority = rulePriority.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyRule]
    }
    
    @scala.inline
    implicit class PolicyRuleMutableBuilder[Self <: PolicyRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setRulePriority(value: Input[Double]): Self = StObject.set(x, "rulePriority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelection(value: Selection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Selection extends StObject {
    
    /**
      * The maximum number of images or the max age for which to apply the image selection.
      */
    var countNumber: Input[Double] = js.native
    
    /**
      * Indicate whether to evaluate the rule based on `imageCountMoreThan` or `sinceImagePushed`.
      */
    var countType: Input[imageCountMoreThan | sinceImagePushed] = js.native
    
    /**
      * The unit of time e.g. days for which to apply the selection.
      */
    var countUnit: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specify one or more image tag prefixes for selection.
      */
    var tagPrefixList: js.UndefOr[Input[String] | js.Array[Input[String]]] = js.native
    
    /**
      * Indicate whether to select `tagged`, `untagged` or `any` images in the repository.
      */
    var tagStatus: Input[tagged | untagged | any] = js.native
  }
  object Selection {
    
    @scala.inline
    def apply(
      countNumber: Input[Double],
      countType: Input[imageCountMoreThan | sinceImagePushed],
      tagStatus: Input[tagged | untagged | any]
    ): Selection = {
      val __obj = js.Dynamic.literal(countNumber = countNumber.asInstanceOf[js.Any], countType = countType.asInstanceOf[js.Any], tagStatus = tagStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selection]
    }
    
    @scala.inline
    implicit class SelectionMutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountNumber(value: Input[Double]): Self = StObject.set(x, "countNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountType(value: Input[imageCountMoreThan | sinceImagePushed]): Self = StObject.set(x, "countType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUnit(value: Input[String]): Self = StObject.set(x, "countUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUnitUndefined: Self = StObject.set(x, "countUnit", js.undefined)
      
      @scala.inline
      def setTagPrefixList(value: Input[String] | js.Array[Input[String]]): Self = StObject.set(x, "tagPrefixList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagPrefixListUndefined: Self = StObject.set(x, "tagPrefixList", js.undefined)
      
      @scala.inline
      def setTagPrefixListVarargs(value: Input[String]*): Self = StObject.set(x, "tagPrefixList", js.Array(value :_*))
      
      @scala.inline
      def setTagStatus(value: Input[tagged | untagged | any]): Self = StObject.set(x, "tagStatus", value.asInstanceOf[js.Any])
    }
  }
}
