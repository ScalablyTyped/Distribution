package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDocumentMod {
  
  @JSImport("@pulumi/aws/ssm/getDocument", "getDocument")
  @js.native
  def getDocument(args: GetDocumentArgs): js.Promise[GetDocumentResult] = js.native
  @JSImport("@pulumi/aws/ssm/getDocument", "getDocument")
  @js.native
  def getDocument(args: GetDocumentArgs, opts: InvokeOptions): js.Promise[GetDocumentResult] = js.native
  
  @js.native
  trait GetDocumentArgs extends StObject {
    
    /**
      * Returns the document in the specified format. The document format can be either JSON or YAML. JSON is the default format.
      */
    val documentFormat: js.UndefOr[String] = js.native
    
    /**
      * The document version for which you want information.
      */
    val documentVersion: js.UndefOr[String] = js.native
    
    /**
      * The name of the Systems Manager document.
      */
    val name: String = js.native
  }
  object GetDocumentArgs {
    
    @scala.inline
    def apply(name: String): GetDocumentArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDocumentArgs]
    }
    
    @scala.inline
    implicit class GetDocumentArgsMutableBuilder[Self <: GetDocumentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocumentFormat(value: String): Self = StObject.set(x, "documentFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentFormatUndefined: Self = StObject.set(x, "documentFormat", js.undefined)
      
      @scala.inline
      def setDocumentVersion(value: String): Self = StObject.set(x, "documentVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentVersionUndefined: Self = StObject.set(x, "documentVersion", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetDocumentResult extends StObject {
    
    /**
      * The ARN of the document.
      */
    val arn: String = js.native
    
    /**
      * The contents of the document.
      */
    val content: String = js.native
    
    val documentFormat: js.UndefOr[String] = js.native
    
    /**
      * The type of the document.
      */
    val documentType: String = js.native
    
    val documentVersion: js.UndefOr[String] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
  }
  object GetDocumentResult {
    
    @scala.inline
    def apply(arn: String, content: String, documentType: String, id: String, name: String): GetDocumentResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], documentType = documentType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDocumentResult]
    }
    
    @scala.inline
    implicit class GetDocumentResultMutableBuilder[Self <: GetDocumentResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentFormat(value: String): Self = StObject.set(x, "documentFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentFormatUndefined: Self = StObject.set(x, "documentFormat", js.undefined)
      
      @scala.inline
      def setDocumentType(value: String): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentVersion(value: String): Self = StObject.set(x, "documentVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentVersionUndefined: Self = StObject.set(x, "documentVersion", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
