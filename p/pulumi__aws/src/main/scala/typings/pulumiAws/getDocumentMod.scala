package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDocumentMod {
  
  @JSImport("@pulumi/aws/ssm/getDocument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocument(args: GetDocumentArgs): js.Promise[GetDocumentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDocumentResult]]
  inline def getDocument(args: GetDocumentArgs, opts: InvokeOptions): js.Promise[GetDocumentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDocumentResult]]
  
  trait GetDocumentArgs extends StObject {
    
    /**
      * Returns the document in the specified format. The document format can be either JSON or YAML. JSON is the default format.
      */
    val documentFormat: js.UndefOr[String] = js.undefined
    
    /**
      * The document version for which you want information.
      */
    val documentVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the Systems Manager document.
      */
    val name: String
  }
  object GetDocumentArgs {
    
    inline def apply(name: String): GetDocumentArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDocumentArgs]
    }
    
    extension [Self <: GetDocumentArgs](x: Self) {
      
      inline def setDocumentFormat(value: String): Self = StObject.set(x, "documentFormat", value.asInstanceOf[js.Any])
      
      inline def setDocumentFormatUndefined: Self = StObject.set(x, "documentFormat", js.undefined)
      
      inline def setDocumentVersion(value: String): Self = StObject.set(x, "documentVersion", value.asInstanceOf[js.Any])
      
      inline def setDocumentVersionUndefined: Self = StObject.set(x, "documentVersion", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetDocumentResult extends StObject {
    
    /**
      * The ARN of the document.
      */
    val arn: String
    
    /**
      * The contents of the document.
      */
    val content: String
    
    val documentFormat: js.UndefOr[String] = js.undefined
    
    /**
      * The type of the document.
      */
    val documentType: String
    
    val documentVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
  }
  object GetDocumentResult {
    
    inline def apply(arn: String, content: String, documentType: String, id: String, name: String): GetDocumentResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], documentType = documentType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDocumentResult]
    }
    
    extension [Self <: GetDocumentResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDocumentFormat(value: String): Self = StObject.set(x, "documentFormat", value.asInstanceOf[js.Any])
      
      inline def setDocumentFormatUndefined: Self = StObject.set(x, "documentFormat", js.undefined)
      
      inline def setDocumentType(value: String): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
      
      inline def setDocumentVersion(value: String): Self = StObject.set(x, "documentVersion", value.asInstanceOf[js.Any])
      
      inline def setDocumentVersionUndefined: Self = StObject.set(x, "documentVersion", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
