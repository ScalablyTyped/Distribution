package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acm {
  
  trait CertificateDomainValidationOption extends StObject {
    
    /**
      * A domain name for which the certificate should be issued
      */
    var domainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the DNS record to create to validate the certificate
      */
    var resourceRecordName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of DNS record to create
      */
    var resourceRecordType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The value the DNS record needs to have
      */
    var resourceRecordValue: js.UndefOr[Input[String]] = js.undefined
  }
  object CertificateDomainValidationOption {
    
    inline def apply(): CertificateDomainValidationOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateDomainValidationOption]
    }
    
    extension [Self <: CertificateDomainValidationOption](x: Self) {
      
      inline def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      inline def setResourceRecordName(value: Input[String]): Self = StObject.set(x, "resourceRecordName", value.asInstanceOf[js.Any])
      
      inline def setResourceRecordNameUndefined: Self = StObject.set(x, "resourceRecordName", js.undefined)
      
      inline def setResourceRecordType(value: Input[String]): Self = StObject.set(x, "resourceRecordType", value.asInstanceOf[js.Any])
      
      inline def setResourceRecordTypeUndefined: Self = StObject.set(x, "resourceRecordType", js.undefined)
      
      inline def setResourceRecordValue(value: Input[String]): Self = StObject.set(x, "resourceRecordValue", value.asInstanceOf[js.Any])
      
      inline def setResourceRecordValueUndefined: Self = StObject.set(x, "resourceRecordValue", js.undefined)
    }
  }
  
  trait CertificateOptions extends StObject {
    
    /**
      * Specifies whether certificate details should be added to a certificate transparency log. Valid values are `ENABLED` or `DISABLED`. See https://docs.aws.amazon.com/acm/latest/userguide/acm-concepts.html#concept-transparency for more details.
      */
    var certificateTransparencyLoggingPreference: js.UndefOr[Input[String]] = js.undefined
  }
  object CertificateOptions {
    
    inline def apply(): CertificateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateOptions]
    }
    
    extension [Self <: CertificateOptions](x: Self) {
      
      inline def setCertificateTransparencyLoggingPreference(value: Input[String]): Self = StObject.set(x, "certificateTransparencyLoggingPreference", value.asInstanceOf[js.Any])
      
      inline def setCertificateTransparencyLoggingPreferenceUndefined: Self = StObject.set(x, "certificateTransparencyLoggingPreference", js.undefined)
    }
  }
}
