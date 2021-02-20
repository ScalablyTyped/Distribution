package typings.pulumiAws

import typings.pulumiAws.inputMod.iam.GetPolicyDocumentStatement
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPolicyDocumentMod {
  
  @JSImport("@pulumi/aws/iam/getPolicyDocument", "getPolicyDocument")
  @js.native
  def getPolicyDocument(): js.Promise[GetPolicyDocumentResult] = js.native
  @JSImport("@pulumi/aws/iam/getPolicyDocument", "getPolicyDocument")
  @js.native
  def getPolicyDocument(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetPolicyDocumentResult] = js.native
  @JSImport("@pulumi/aws/iam/getPolicyDocument", "getPolicyDocument")
  @js.native
  def getPolicyDocument(args: GetPolicyDocumentArgs): js.Promise[GetPolicyDocumentResult] = js.native
  @JSImport("@pulumi/aws/iam/getPolicyDocument", "getPolicyDocument")
  @js.native
  def getPolicyDocument(args: GetPolicyDocumentArgs, opts: InvokeOptions): js.Promise[GetPolicyDocumentResult] = js.native
  
  @js.native
  trait GetPolicyDocumentArgs extends StObject {
    
    /**
      * An IAM policy document to import and override the
      * current policy document.  Statements with non-blank `sid`s in the override
      * document will overwrite statements with the same `sid` in the current document.
      * Statements without an `sid` cannot be overwritten.
      */
    val overrideJson: js.UndefOr[String] = js.native
    
    /**
      * An ID for the policy document.
      */
    val policyId: js.UndefOr[String] = js.native
    
    /**
      * An IAM policy document to import as a base for the
      * current policy document.  Statements with non-blank `sid`s in the current
      * policy document will overwrite statements with the same `sid` in the source
      * json.  Statements without an `sid` cannot be overwritten.
      */
    val sourceJson: js.UndefOr[String] = js.native
    
    /**
      * A nested configuration block (described below)
      * configuring one *statement* to be included in the policy document.
      */
    val statements: js.UndefOr[js.Array[GetPolicyDocumentStatement]] = js.native
    
    /**
      * IAM policy document version. Valid values: `2008-10-17`, `2012-10-17`. Defaults to `2012-10-17`. For more information, see the [AWS IAM User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html).
      */
    val version: js.UndefOr[String] = js.native
  }
  object GetPolicyDocumentArgs {
    
    @scala.inline
    def apply(): GetPolicyDocumentArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPolicyDocumentArgs]
    }
    
    @scala.inline
    implicit class GetPolicyDocumentArgsMutableBuilder[Self <: GetPolicyDocumentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverrideJson(value: String): Self = StObject.set(x, "overrideJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideJsonUndefined: Self = StObject.set(x, "overrideJson", js.undefined)
      
      @scala.inline
      def setPolicyId(value: String): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyIdUndefined: Self = StObject.set(x, "policyId", js.undefined)
      
      @scala.inline
      def setSourceJson(value: String): Self = StObject.set(x, "sourceJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceJsonUndefined: Self = StObject.set(x, "sourceJson", js.undefined)
      
      @scala.inline
      def setStatements(value: js.Array[GetPolicyDocumentStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
      
      @scala.inline
      def setStatementsVarargs(value: GetPolicyDocumentStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait GetPolicyDocumentResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The above arguments serialized as a standard JSON policy document.
      */
    val json: String = js.native
    
    val overrideJson: js.UndefOr[String] = js.native
    
    val policyId: js.UndefOr[String] = js.native
    
    val sourceJson: js.UndefOr[String] = js.native
    
    val statements: js.UndefOr[js.Array[typings.pulumiAws.outputMod.iam.GetPolicyDocumentStatement]] = js.native
    
    val version: js.UndefOr[String] = js.native
  }
  object GetPolicyDocumentResult {
    
    @scala.inline
    def apply(id: String, json: String): GetPolicyDocumentResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPolicyDocumentResult]
    }
    
    @scala.inline
    implicit class GetPolicyDocumentResultMutableBuilder[Self <: GetPolicyDocumentResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideJson(value: String): Self = StObject.set(x, "overrideJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideJsonUndefined: Self = StObject.set(x, "overrideJson", js.undefined)
      
      @scala.inline
      def setPolicyId(value: String): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyIdUndefined: Self = StObject.set(x, "policyId", js.undefined)
      
      @scala.inline
      def setSourceJson(value: String): Self = StObject.set(x, "sourceJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceJsonUndefined: Self = StObject.set(x, "sourceJson", js.undefined)
      
      @scala.inline
      def setStatements(value: js.Array[typings.pulumiAws.outputMod.iam.GetPolicyDocumentStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
      
      @scala.inline
      def setStatementsVarargs(value: typings.pulumiAws.outputMod.iam.GetPolicyDocumentStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
