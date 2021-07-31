package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acm {
  
  trait CertificateDomainValidationOption extends StObject {
    
    /**
      * A domain name for which the certificate should be issued
      */
    var domainName: String
    
    /**
      * The name of the DNS record to create to validate the certificate
      */
    var resourceRecordName: String
    
    /**
      * The type of DNS record to create
      */
    var resourceRecordType: String
    
    /**
      * The value the DNS record needs to have
      */
    var resourceRecordValue: String
  }
  object CertificateDomainValidationOption {
    
    @scala.inline
    def apply(
      domainName: String,
      resourceRecordName: String,
      resourceRecordType: String,
      resourceRecordValue: String
    ): CertificateDomainValidationOption = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], resourceRecordName = resourceRecordName.asInstanceOf[js.Any], resourceRecordType = resourceRecordType.asInstanceOf[js.Any], resourceRecordValue = resourceRecordValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateDomainValidationOption]
    }
    
    @scala.inline
    implicit class CertificateDomainValidationOptionMutableBuilder[Self <: CertificateDomainValidationOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceRecordName(value: String): Self = StObject.set(x, "resourceRecordName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceRecordType(value: String): Self = StObject.set(x, "resourceRecordType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceRecordValue(value: String): Self = StObject.set(x, "resourceRecordValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateOptions extends StObject {
    
    /**
      * Specifies whether certificate details should be added to a certificate transparency log. Valid values are `ENABLED` or `DISABLED`. See https://docs.aws.amazon.com/acm/latest/userguide/acm-concepts.html#concept-transparency for more details.
      */
    var certificateTransparencyLoggingPreference: js.UndefOr[String] = js.undefined
  }
  object CertificateOptions {
    
    @scala.inline
    def apply(): CertificateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateOptions]
    }
    
    @scala.inline
    implicit class CertificateOptionsMutableBuilder[Self <: CertificateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificateTransparencyLoggingPreference(value: String): Self = StObject.set(x, "certificateTransparencyLoggingPreference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateTransparencyLoggingPreferenceUndefined: Self = StObject.set(x, "certificateTransparencyLoggingPreference", js.undefined)
    }
  }
}
