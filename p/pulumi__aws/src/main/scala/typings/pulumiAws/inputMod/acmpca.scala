package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acmpca {
  
  trait CertificateAuthorityCertificateAuthorityConfiguration extends StObject {
    
    /**
      * Type of the public key algorithm and size, in bits, of the key pair that your key pair creates when it issues a certificate. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
      */
    var keyAlgorithm: Input[String]
    
    /**
      * Name of the algorithm your private CA uses to sign certificate requests. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
      */
    var signingAlgorithm: Input[String]
    
    /**
      * Nested argument that contains X.500 distinguished name information. At least one nested attribute must be specified.
      */
    var subject: Input[CertificateAuthorityCertificateAuthorityConfigurationSubject]
  }
  object CertificateAuthorityCertificateAuthorityConfiguration {
    
    inline def apply(
      keyAlgorithm: Input[String],
      signingAlgorithm: Input[String],
      subject: Input[CertificateAuthorityCertificateAuthorityConfigurationSubject]
    ): CertificateAuthorityCertificateAuthorityConfiguration = {
      val __obj = js.Dynamic.literal(keyAlgorithm = keyAlgorithm.asInstanceOf[js.Any], signingAlgorithm = signingAlgorithm.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateAuthorityCertificateAuthorityConfiguration]
    }
    
    extension [Self <: CertificateAuthorityCertificateAuthorityConfiguration](x: Self) {
      
      inline def setKeyAlgorithm(value: Input[String]): Self = StObject.set(x, "keyAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSigningAlgorithm(value: Input[String]): Self = StObject.set(x, "signingAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: Input[CertificateAuthorityCertificateAuthorityConfigurationSubject]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateAuthorityCertificateAuthorityConfigurationSubject extends StObject {
    
    /**
      * Fully qualified domain name (FQDN) associated with the certificate subject. Must be less than or equal to 64 characters in length.
      */
    var commonName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Two digit code that specifies the country in which the certificate subject located. Must be less than or equal to 2 characters in length.
      */
    var country: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Disambiguating information for the certificate subject. Must be less than or equal to 64 characters in length.
      */
    var distinguishedNameQualifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third. Must be less than or equal to 3 characters in length.
      */
    var generationQualifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * First name. Must be less than or equal to 16 characters in length.
      */
    var givenName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Concatenation that typically contains the first letter of the `givenName`, the first letter of the middle name if one exists, and the first letter of the `surname`. Must be less than or equal to 5 characters in length.
      */
    var initials: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The locality (such as a city or town) in which the certificate subject is located. Must be less than or equal to 128 characters in length.
      */
    var locality: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Legal name of the organization with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
      */
    var organization: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
      */
    var organizationalUnit: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Typically a shortened version of a longer `givenName`. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza. Must be less than or equal to 128 characters in length.
      */
    var pseudonym: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * State in which the subject of the certificate is located. Must be less than or equal to 128 characters in length.
      */
    var state: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Family name. In the US and the UK for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first. Must be less than or equal to 40 characters in length.
      */
    var surname: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A title such as Mr. or Ms. which is pre-pended to the name to refer formally to the certificate subject. Must be less than or equal to 64 characters in length.
      */
    var title: js.UndefOr[Input[String]] = js.undefined
  }
  object CertificateAuthorityCertificateAuthorityConfigurationSubject {
    
    inline def apply(): CertificateAuthorityCertificateAuthorityConfigurationSubject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateAuthorityCertificateAuthorityConfigurationSubject]
    }
    
    extension [Self <: CertificateAuthorityCertificateAuthorityConfigurationSubject](x: Self) {
      
      inline def setCommonName(value: Input[String]): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      inline def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
      
      inline def setCountry(value: Input[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setDistinguishedNameQualifier(value: Input[String]): Self = StObject.set(x, "distinguishedNameQualifier", value.asInstanceOf[js.Any])
      
      inline def setDistinguishedNameQualifierUndefined: Self = StObject.set(x, "distinguishedNameQualifier", js.undefined)
      
      inline def setGenerationQualifier(value: Input[String]): Self = StObject.set(x, "generationQualifier", value.asInstanceOf[js.Any])
      
      inline def setGenerationQualifierUndefined: Self = StObject.set(x, "generationQualifier", js.undefined)
      
      inline def setGivenName(value: Input[String]): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
      
      inline def setInitials(value: Input[String]): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
      
      inline def setInitialsUndefined: Self = StObject.set(x, "initials", js.undefined)
      
      inline def setLocality(value: Input[String]): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
      
      inline def setOrganization(value: Input[String]): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
      
      inline def setOrganizationalUnit(value: Input[String]): Self = StObject.set(x, "organizationalUnit", value.asInstanceOf[js.Any])
      
      inline def setOrganizationalUnitUndefined: Self = StObject.set(x, "organizationalUnit", js.undefined)
      
      inline def setPseudonym(value: Input[String]): Self = StObject.set(x, "pseudonym", value.asInstanceOf[js.Any])
      
      inline def setPseudonymUndefined: Self = StObject.set(x, "pseudonym", js.undefined)
      
      inline def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setSurname(value: Input[String]): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
      
      inline def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
      
      inline def setTitle(value: Input[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait CertificateAuthorityRevocationConfiguration extends StObject {
    
    /**
      * Nested argument containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority. Defined below.
      */
    var crlConfiguration: js.UndefOr[Input[CertificateAuthorityRevocationConfigurationCrlConfiguration]] = js.undefined
  }
  object CertificateAuthorityRevocationConfiguration {
    
    inline def apply(): CertificateAuthorityRevocationConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateAuthorityRevocationConfiguration]
    }
    
    extension [Self <: CertificateAuthorityRevocationConfiguration](x: Self) {
      
      inline def setCrlConfiguration(value: Input[CertificateAuthorityRevocationConfigurationCrlConfiguration]): Self = StObject.set(x, "crlConfiguration", value.asInstanceOf[js.Any])
      
      inline def setCrlConfigurationUndefined: Self = StObject.set(x, "crlConfiguration", js.undefined)
    }
  }
  
  trait CertificateAuthorityRevocationConfigurationCrlConfiguration extends StObject {
    
    /**
      * Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public. Must be less than or equal to 253 characters in length.
      */
    var customCname: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
      */
    var enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Number of days until a certificate expires. Must be between 1 and 5000.
      */
    var expirationInDays: Input[Double]
    
    /**
      * Name of the S3 bucket that contains the CRL. If you do not provide a value for the `customCname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket. Must be less than or equal to 255 characters in length.
      */
    var s3BucketName: js.UndefOr[Input[String]] = js.undefined
  }
  object CertificateAuthorityRevocationConfigurationCrlConfiguration {
    
    inline def apply(expirationInDays: Input[Double]): CertificateAuthorityRevocationConfigurationCrlConfiguration = {
      val __obj = js.Dynamic.literal(expirationInDays = expirationInDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateAuthorityRevocationConfigurationCrlConfiguration]
    }
    
    extension [Self <: CertificateAuthorityRevocationConfigurationCrlConfiguration](x: Self) {
      
      inline def setCustomCname(value: Input[String]): Self = StObject.set(x, "customCname", value.asInstanceOf[js.Any])
      
      inline def setCustomCnameUndefined: Self = StObject.set(x, "customCname", js.undefined)
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setExpirationInDays(value: Input[Double]): Self = StObject.set(x, "expirationInDays", value.asInstanceOf[js.Any])
      
      inline def setS3BucketName(value: Input[String]): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
      
      inline def setS3BucketNameUndefined: Self = StObject.set(x, "s3BucketName", js.undefined)
    }
  }
  
  trait GetCertificateAuthorityRevocationConfiguration extends StObject {
    
    var crlConfigurations: js.UndefOr[js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]] = js.undefined
  }
  object GetCertificateAuthorityRevocationConfiguration {
    
    inline def apply(): GetCertificateAuthorityRevocationConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCertificateAuthorityRevocationConfiguration]
    }
    
    extension [Self <: GetCertificateAuthorityRevocationConfiguration](x: Self) {
      
      inline def setCrlConfigurations(value: js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]): Self = StObject.set(x, "crlConfigurations", value.asInstanceOf[js.Any])
      
      inline def setCrlConfigurationsUndefined: Self = StObject.set(x, "crlConfigurations", js.undefined)
      
      inline def setCrlConfigurationsVarargs(value: GetCertificateAuthorityRevocationConfigurationCrlConfiguration*): Self = StObject.set(x, "crlConfigurations", js.Array(value :_*))
    }
  }
  
  trait GetCertificateAuthorityRevocationConfigurationCrlConfiguration extends StObject {
    
    var customCname: js.UndefOr[String] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var expirationInDays: js.UndefOr[Double] = js.undefined
    
    var s3BucketName: js.UndefOr[String] = js.undefined
  }
  object GetCertificateAuthorityRevocationConfigurationCrlConfiguration {
    
    inline def apply(): GetCertificateAuthorityRevocationConfigurationCrlConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]
    }
    
    extension [Self <: GetCertificateAuthorityRevocationConfigurationCrlConfiguration](x: Self) {
      
      inline def setCustomCname(value: String): Self = StObject.set(x, "customCname", value.asInstanceOf[js.Any])
      
      inline def setCustomCnameUndefined: Self = StObject.set(x, "customCname", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setExpirationInDays(value: Double): Self = StObject.set(x, "expirationInDays", value.asInstanceOf[js.Any])
      
      inline def setExpirationInDaysUndefined: Self = StObject.set(x, "expirationInDays", js.undefined)
      
      inline def setS3BucketName(value: String): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
      
      inline def setS3BucketNameUndefined: Self = StObject.set(x, "s3BucketName", js.undefined)
    }
  }
}
