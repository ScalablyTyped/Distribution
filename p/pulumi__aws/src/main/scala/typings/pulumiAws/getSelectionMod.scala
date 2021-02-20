package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSelectionMod {
  
  @JSImport("@pulumi/aws/backup/getSelection", "getSelection")
  @js.native
  def getSelection(args: GetSelectionArgs): js.Promise[GetSelectionResult] = js.native
  @JSImport("@pulumi/aws/backup/getSelection", "getSelection")
  @js.native
  def getSelection(args: GetSelectionArgs, opts: InvokeOptions): js.Promise[GetSelectionResult] = js.native
  
  @js.native
  trait GetSelectionArgs extends StObject {
    
    /**
      * The backup plan ID associated with the selection of resources.
      */
    val planId: String = js.native
    
    /**
      * The backup selection ID.
      */
    val selectionId: String = js.native
  }
  object GetSelectionArgs {
    
    @scala.inline
    def apply(planId: String, selectionId: String): GetSelectionArgs = {
      val __obj = js.Dynamic.literal(planId = planId.asInstanceOf[js.Any], selectionId = selectionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSelectionArgs]
    }
    
    @scala.inline
    implicit class GetSelectionArgsMutableBuilder[Self <: GetSelectionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionId(value: String): Self = StObject.set(x, "selectionId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetSelectionResult extends StObject {
    
    /**
      * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
      */
    val iamRoleArn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The display name of a resource selection document.
      */
    val name: String = js.native
    
    val planId: String = js.native
    
    /**
      * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
      */
    val resources: js.Array[String] = js.native
    
    val selectionId: String = js.native
  }
  object GetSelectionResult {
    
    @scala.inline
    def apply(
      iamRoleArn: String,
      id: String,
      name: String,
      planId: String,
      resources: js.Array[String],
      selectionId: String
    ): GetSelectionResult = {
      val __obj = js.Dynamic.literal(iamRoleArn = iamRoleArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], selectionId = selectionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSelectionResult]
    }
    
    @scala.inline
    implicit class GetSelectionResultMutableBuilder[Self <: GetSelectionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIamRoleArn(value: String): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setSelectionId(value: String): Self = StObject.set(x, "selectionId", value.asInstanceOf[js.Any])
    }
  }
}
