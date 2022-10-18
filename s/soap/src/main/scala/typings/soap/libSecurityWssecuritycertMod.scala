package typings.soap

import org.scalablytyped.runtime.StringDictionary
import typings.soap.libTypesMod.ISecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityWssecuritycertMod {
  
  @JSImport("soap/lib/security/WSSecurityCert", "WSSecurityCert")
  @js.native
  open class WSSecurityCert protected ()
    extends StObject
       with ISecurity {
    def this(privatePEM: Any, publicP12PEM: Any, password: Any) = this()
    def this(privatePEM: Any, publicP12PEM: Any, password: Any, options: IWSSecurityCertOptions) = this()
    
    /* private */ var additionalReferences: Any = js.native
    
    /* private */ var created: Any = js.native
    
    /* private */ var expires: Any = js.native
    
    /* private */ var hasTimeStamp: Any = js.native
    
    @JSName("postProcess")
    def postProcess_MWSSecurityCert(xml: Any, envelopeKey: Any): String = js.native
    
    /* private */ var publicP12PEM: Any = js.native
    
    /* private */ var signatureTransformations: Any = js.native
    
    /* private */ var signer: Any = js.native
    
    /* private */ var signerOptions: Any = js.native
    
    /* private */ var x509Id: Any = js.native
  }
  
  trait IWSSecurityCertOptions extends StObject {
    
    var additionalReferences: js.UndefOr[js.Array[String]] = js.undefined
    
    var hasTimeStamp: js.UndefOr[Boolean] = js.undefined
    
    var signatureAlgorithm: js.UndefOr[String] = js.undefined
    
    var signatureTransformations: js.UndefOr[js.Array[String]] = js.undefined
    
    var signerOptions: js.UndefOr[IXmlSignerOptions] = js.undefined
  }
  object IWSSecurityCertOptions {
    
    inline def apply(): IWSSecurityCertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWSSecurityCertOptions]
    }
    
    extension [Self <: IWSSecurityCertOptions](x: Self) {
      
      inline def setAdditionalReferences(value: js.Array[String]): Self = StObject.set(x, "additionalReferences", value.asInstanceOf[js.Any])
      
      inline def setAdditionalReferencesUndefined: Self = StObject.set(x, "additionalReferences", js.undefined)
      
      inline def setAdditionalReferencesVarargs(value: String*): Self = StObject.set(x, "additionalReferences", js.Array(value*))
      
      inline def setHasTimeStamp(value: Boolean): Self = StObject.set(x, "hasTimeStamp", value.asInstanceOf[js.Any])
      
      inline def setHasTimeStampUndefined: Self = StObject.set(x, "hasTimeStamp", js.undefined)
      
      inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
      
      inline def setSignatureTransformations(value: js.Array[String]): Self = StObject.set(x, "signatureTransformations", value.asInstanceOf[js.Any])
      
      inline def setSignatureTransformationsUndefined: Self = StObject.set(x, "signatureTransformations", js.undefined)
      
      inline def setSignatureTransformationsVarargs(value: String*): Self = StObject.set(x, "signatureTransformations", js.Array(value*))
      
      inline def setSignerOptions(value: IXmlSignerOptions): Self = StObject.set(x, "signerOptions", value.asInstanceOf[js.Any])
      
      inline def setSignerOptionsUndefined: Self = StObject.set(x, "signerOptions", js.undefined)
    }
  }
  
  trait IXmlSignerOptions extends StObject {
    
    var attrs: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var existingPrefixes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object IXmlSignerOptions {
    
    inline def apply(): IXmlSignerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IXmlSignerOptions]
    }
    
    extension [Self <: IXmlSignerOptions](x: Self) {
      
      inline def setAttrs(value: StringDictionary[String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setExistingPrefixes(value: StringDictionary[String]): Self = StObject.set(x, "existingPrefixes", value.asInstanceOf[js.Any])
      
      inline def setExistingPrefixesUndefined: Self = StObject.set(x, "existingPrefixes", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
