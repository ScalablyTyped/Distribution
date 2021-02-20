package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acm {
  
  @js.native
  trait CertificateDomainValidationOption extends StObject {
    
    /**
      * A domain name for which the certificate should be issued
      */
    var domainName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the DNS record to create to validate the certificate
      */
    var resourceRecordName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of DNS record to create
      */
    var resourceRecordType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The value the DNS record needs to have
      */
    var resourceRecordValue: js.UndefOr[Input[String]] = js.native
  }
  object CertificateDomainValidationOption {
    
    @scala.inline
    def apply(): CertificateDomainValidationOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateDomainValidationOption]
    }
    
    @scala.inline
    implicit class CertificateDomainValidationOptionMutableBuilder[Self <: CertificateDomainValidationOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setResourceRecordName(value: Input[String]): Self = StObject.set(x, "resourceRecordName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceRecordNameUndefined: Self = StObject.set(x, "resourceRecordName", js.undefined)
      
      @scala.inline
      def setResourceRecordType(value: Input[String]): Self = StObject.set(x, "resourceRecordType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceRecordTypeUndefined: Self = StObject.set(x, "resourceRecordType", js.undefined)
      
      @scala.inline
      def setResourceRecordValue(value: Input[String]): Self = StObject.set(x, "resourceRecordValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceRecordValueUndefined: Self = StObject.set(x, "resourceRecordValue", js.undefined)
    }
  }
  
  @js.native
  trait CertificateOptions extends StObject {
    
    /**
      * Specifies whether certificate details should be added to a certificate transparency log. Valid values are `ENABLED` or `DISABLED`. See https://docs.aws.amazon.com/acm/latest/userguide/acm-concepts.html#concept-transparency for more details.
      */
    var certificateTransparencyLoggingPreference: js.UndefOr[Input[String]] = js.native
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
      def setCertificateTransparencyLoggingPreference(value: Input[String]): Self = StObject.set(x, "certificateTransparencyLoggingPreference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateTransparencyLoggingPreferenceUndefined: Self = StObject.set(x, "certificateTransparencyLoggingPreference", js.undefined)
    }
  }
}
