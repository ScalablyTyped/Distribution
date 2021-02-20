package typings.soap

import org.scalablytyped.runtime.StringDictionary
import typings.soap.typesMod.ISecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wssecuritycertMod {
  
  @JSImport("soap/lib/security/WSSecurityCert", "WSSecurityCert")
  @js.native
  class WSSecurityCert protected () extends ISecurity {
    def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any) = this()
    def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any, options: IWSSecurityCertOptions) = this()
    
    var additionalReferences: js.Any = js.native
    
    var created: js.Any = js.native
    
    var expires: js.Any = js.native
    
    var hasTimeStamp: js.Any = js.native
    
    @JSName("postProcess")
    def postProcess_MWSSecurityCert(xml: js.Any, envelopeKey: js.Any): String = js.native
    
    var publicP12PEM: js.Any = js.native
    
    var signatureTransformations: js.Any = js.native
    
    var signer: js.Any = js.native
    
    var signerOptions: js.Any = js.native
    
    var x509Id: js.Any = js.native
  }
  
  @js.native
  trait IWSSecurityCertOptions extends StObject {
    
    var additionalReferences: js.UndefOr[js.Array[String]] = js.native
    
    var hasTimeStamp: js.UndefOr[Boolean] = js.native
    
    var signatureAlgorithm: js.UndefOr[String] = js.native
    
    var signatureTransformations: js.UndefOr[js.Array[String]] = js.native
    
    var signerOptions: js.UndefOr[IXmlSignerOptions] = js.native
  }
  object IWSSecurityCertOptions {
    
    @scala.inline
    def apply(): IWSSecurityCertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWSSecurityCertOptions]
    }
    
    @scala.inline
    implicit class IWSSecurityCertOptionsMutableBuilder[Self <: IWSSecurityCertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalReferences(value: js.Array[String]): Self = StObject.set(x, "additionalReferences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalReferencesUndefined: Self = StObject.set(x, "additionalReferences", js.undefined)
      
      @scala.inline
      def setAdditionalReferencesVarargs(value: String*): Self = StObject.set(x, "additionalReferences", js.Array(value :_*))
      
      @scala.inline
      def setHasTimeStamp(value: Boolean): Self = StObject.set(x, "hasTimeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTimeStampUndefined: Self = StObject.set(x, "hasTimeStamp", js.undefined)
      
      @scala.inline
      def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
      
      @scala.inline
      def setSignatureTransformations(value: js.Array[String]): Self = StObject.set(x, "signatureTransformations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureTransformationsUndefined: Self = StObject.set(x, "signatureTransformations", js.undefined)
      
      @scala.inline
      def setSignatureTransformationsVarargs(value: String*): Self = StObject.set(x, "signatureTransformations", js.Array(value :_*))
      
      @scala.inline
      def setSignerOptions(value: IXmlSignerOptions): Self = StObject.set(x, "signerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignerOptionsUndefined: Self = StObject.set(x, "signerOptions", js.undefined)
    }
  }
  
  @js.native
  trait IXmlSignerOptions extends StObject {
    
    var attrs: js.UndefOr[StringDictionary[String]] = js.native
    
    var existingPrefixes: js.UndefOr[StringDictionary[String]] = js.native
    
    var prefix: js.UndefOr[String] = js.native
  }
  object IXmlSignerOptions {
    
    @scala.inline
    def apply(): IXmlSignerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IXmlSignerOptions]
    }
    
    @scala.inline
    implicit class IXmlSignerOptionsMutableBuilder[Self <: IXmlSignerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: StringDictionary[String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setExistingPrefixes(value: StringDictionary[String]): Self = StObject.set(x, "existingPrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExistingPrefixesUndefined: Self = StObject.set(x, "existingPrefixes", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
