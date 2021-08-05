package typings.pulumiAws

import typings.pulumiAws.inputMod.iam.GetPolicyDocumentStatement
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPolicyDocumentMod {
  
  @JSImport("@pulumi/aws/iam/getPolicyDocument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPolicyDocument(): js.Promise[GetPolicyDocumentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolicyDocument")().asInstanceOf[js.Promise[GetPolicyDocumentResult]]
  inline def getPolicyDocument(args: Unit, opts: InvokeOptions): js.Promise[GetPolicyDocumentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolicyDocument")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetPolicyDocumentResult]]
  inline def getPolicyDocument(args: GetPolicyDocumentArgs): js.Promise[GetPolicyDocumentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolicyDocument")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetPolicyDocumentResult]]
  inline def getPolicyDocument(args: GetPolicyDocumentArgs, opts: InvokeOptions): js.Promise[GetPolicyDocumentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolicyDocument")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetPolicyDocumentResult]]
  
  trait GetPolicyDocumentArgs extends StObject {
    
    /**
      * An IAM policy document to import and override the
      * current policy document.  Statements with non-blank `sid`s in the override
      * document will overwrite statements with the same `sid` in the current document.
      * Statements without an `sid` cannot be overwritten.
      */
    val overrideJson: js.UndefOr[String] = js.undefined
    
    /**
      * An ID for the policy document.
      */
    val policyId: js.UndefOr[String] = js.undefined
    
    /**
      * An IAM policy document to import as a base for the
      * current policy document.  Statements with non-blank `sid`s in the current
      * policy document will overwrite statements with the same `sid` in the source
      * json.  Statements without an `sid` cannot be overwritten.
      */
    val sourceJson: js.UndefOr[String] = js.undefined
    
    /**
      * A nested configuration block (described below)
      * configuring one *statement* to be included in the policy document.
      */
    val statements: js.UndefOr[js.Array[GetPolicyDocumentStatement]] = js.undefined
    
    /**
      * IAM policy document version. Valid values: `2008-10-17`, `2012-10-17`. Defaults to `2012-10-17`. For more information, see the [AWS IAM User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html).
      */
    val version: js.UndefOr[String] = js.undefined
  }
  object GetPolicyDocumentArgs {
    
    inline def apply(): GetPolicyDocumentArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPolicyDocumentArgs]
    }
    
    extension [Self <: GetPolicyDocumentArgs](x: Self) {
      
      inline def setOverrideJson(value: String): Self = StObject.set(x, "overrideJson", value.asInstanceOf[js.Any])
      
      inline def setOverrideJsonUndefined: Self = StObject.set(x, "overrideJson", js.undefined)
      
      inline def setPolicyId(value: String): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
      
      inline def setPolicyIdUndefined: Self = StObject.set(x, "policyId", js.undefined)
      
      inline def setSourceJson(value: String): Self = StObject.set(x, "sourceJson", value.asInstanceOf[js.Any])
      
      inline def setSourceJsonUndefined: Self = StObject.set(x, "sourceJson", js.undefined)
      
      inline def setStatements(value: js.Array[GetPolicyDocumentStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
      
      inline def setStatementsVarargs(value: GetPolicyDocumentStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait GetPolicyDocumentResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The above arguments serialized as a standard JSON policy document.
      */
    val json: String
    
    val overrideJson: js.UndefOr[String] = js.undefined
    
    val policyId: js.UndefOr[String] = js.undefined
    
    val sourceJson: js.UndefOr[String] = js.undefined
    
    val statements: js.UndefOr[js.Array[typings.pulumiAws.outputMod.iam.GetPolicyDocumentStatement]] = js.undefined
    
    val version: js.UndefOr[String] = js.undefined
  }
  object GetPolicyDocumentResult {
    
    inline def apply(id: String, json: String): GetPolicyDocumentResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPolicyDocumentResult]
    }
    
    extension [Self <: GetPolicyDocumentResult](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setOverrideJson(value: String): Self = StObject.set(x, "overrideJson", value.asInstanceOf[js.Any])
      
      inline def setOverrideJsonUndefined: Self = StObject.set(x, "overrideJson", js.undefined)
      
      inline def setPolicyId(value: String): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
      
      inline def setPolicyIdUndefined: Self = StObject.set(x, "policyId", js.undefined)
      
      inline def setSourceJson(value: String): Self = StObject.set(x, "sourceJson", value.asInstanceOf[js.Any])
      
      inline def setSourceJsonUndefined: Self = StObject.set(x, "sourceJson", js.undefined)
      
      inline def setStatements(value: js.Array[typings.pulumiAws.outputMod.iam.GetPolicyDocumentStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
      
      inline def setStatementsVarargs(value: typings.pulumiAws.outputMod.iam.GetPolicyDocumentStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
