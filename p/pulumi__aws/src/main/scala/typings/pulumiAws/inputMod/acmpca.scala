package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acmpca {
  
  @js.native
  trait CertificateAuthorityCertificateAuthorityConfiguration extends StObject {
    
    /**
      * Type of the public key algorithm and size, in bits, of the key pair that your key pair creates when it issues a certificate. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
      */
    var keyAlgorithm: Input[String] = js.native
    
    /**
      * Name of the algorithm your private CA uses to sign certificate requests. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
      */
    var signingAlgorithm: Input[String] = js.native
    
    /**
      * Nested argument that contains X.500 distinguished name information. At least one nested attribute must be specified.
      */
    var subject: Input[CertificateAuthorityCertificateAuthorityConfigurationSubject] = js.native
  }
  object CertificateAuthorityCertificateAuthorityConfiguration {
    
    @scala.inline
    def apply(
      keyAlgorithm: Input[String],
      signingAlgorithm: Input[String],
      subject: Input[CertificateAuthorityCertificateAuthorityConfigurationSubject]
    ): CertificateAuthorityCertificateAuthorityConfiguration = {
      val __obj = js.Dynamic.literal(keyAlgorithm = keyAlgorithm.asInstanceOf[js.Any], signingAlgorithm = signingAlgorithm.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateAuthorityCertificateAuthorityConfiguration]
    }
    
    @scala.inline
    implicit class CertificateAuthorityCertificateAuthorityConfigurationMutableBuilder[Self <: CertificateAuthorityCertificateAuthorityConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyAlgorithm(value: Input[String]): Self = StObject.set(x, "keyAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningAlgorithm(value: Input[String]): Self = StObject.set(x, "signingAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: Input[CertificateAuthorityCertificateAuthorityConfigurationSubject]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CertificateAuthorityCertificateAuthorityConfigurationSubject extends StObject {
    
    /**
      * Fully qualified domain name (FQDN) associated with the certificate subject. Must be less than or equal to 64 characters in length.
      */
    var commonName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Two digit code that specifies the country in which the certificate subject located. Must be less than or equal to 2 characters in length.
      */
    var country: js.UndefOr[Input[String]] = js.native
    
    /**
      * Disambiguating information for the certificate subject. Must be less than or equal to 64 characters in length.
      */
    var distinguishedNameQualifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third. Must be less than or equal to 3 characters in length.
      */
    var generationQualifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * First name. Must be less than or equal to 16 characters in length.
      */
    var givenName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Concatenation that typically contains the first letter of the `givenName`, the first letter of the middle name if one exists, and the first letter of the `surname`. Must be less than or equal to 5 characters in length.
      */
    var initials: js.UndefOr[Input[String]] = js.native
    
    /**
      * The locality (such as a city or town) in which the certificate subject is located. Must be less than or equal to 128 characters in length.
      */
    var locality: js.UndefOr[Input[String]] = js.native
    
    /**
      * Legal name of the organization with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
      */
    var organization: js.UndefOr[Input[String]] = js.native
    
    /**
      * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
      */
    var organizationalUnit: js.UndefOr[Input[String]] = js.native
    
    /**
      * Typically a shortened version of a longer `givenName`. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza. Must be less than or equal to 128 characters in length.
      */
    var pseudonym: js.UndefOr[Input[String]] = js.native
    
    /**
      * State in which the subject of the certificate is located. Must be less than or equal to 128 characters in length.
      */
    var state: js.UndefOr[Input[String]] = js.native
    
    /**
      * Family name. In the US and the UK for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first. Must be less than or equal to 40 characters in length.
      */
    var surname: js.UndefOr[Input[String]] = js.native
    
    /**
      * A title such as Mr. or Ms. which is pre-pended to the name to refer formally to the certificate subject. Must be less than or equal to 64 characters in length.
      */
    var title: js.UndefOr[Input[String]] = js.native
  }
  object CertificateAuthorityCertificateAuthorityConfigurationSubject {
    
    @scala.inline
    def apply(): CertificateAuthorityCertificateAuthorityConfigurationSubject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateAuthorityCertificateAuthorityConfigurationSubject]
    }
    
    @scala.inline
    implicit class CertificateAuthorityCertificateAuthorityConfigurationSubjectMutableBuilder[Self <: CertificateAuthorityCertificateAuthorityConfigurationSubject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommonName(value: Input[String]): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
      
      @scala.inline
      def setCountry(value: Input[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setDistinguishedNameQualifier(value: Input[String]): Self = StObject.set(x, "distinguishedNameQualifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistinguishedNameQualifierUndefined: Self = StObject.set(x, "distinguishedNameQualifier", js.undefined)
      
      @scala.inline
      def setGenerationQualifier(value: Input[String]): Self = StObject.set(x, "generationQualifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerationQualifierUndefined: Self = StObject.set(x, "generationQualifier", js.undefined)
      
      @scala.inline
      def setGivenName(value: Input[String]): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
      
      @scala.inline
      def setInitials(value: Input[String]): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialsUndefined: Self = StObject.set(x, "initials", js.undefined)
      
      @scala.inline
      def setLocality(value: Input[String]): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
      
      @scala.inline
      def setOrganization(value: Input[String]): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
      
      @scala.inline
      def setOrganizationalUnit(value: Input[String]): Self = StObject.set(x, "organizationalUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationalUnitUndefined: Self = StObject.set(x, "organizationalUnit", js.undefined)
      
      @scala.inline
      def setPseudonym(value: Input[String]): Self = StObject.set(x, "pseudonym", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPseudonymUndefined: Self = StObject.set(x, "pseudonym", js.undefined)
      
      @scala.inline
      def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setSurname(value: Input[String]): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
      
      @scala.inline
      def setTitle(value: Input[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait CertificateAuthorityRevocationConfiguration extends StObject {
    
    /**
      * Nested argument containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority. Defined below.
      */
    var crlConfiguration: js.UndefOr[Input[CertificateAuthorityRevocationConfigurationCrlConfiguration]] = js.native
  }
  object CertificateAuthorityRevocationConfiguration {
    
    @scala.inline
    def apply(): CertificateAuthorityRevocationConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateAuthorityRevocationConfiguration]
    }
    
    @scala.inline
    implicit class CertificateAuthorityRevocationConfigurationMutableBuilder[Self <: CertificateAuthorityRevocationConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrlConfiguration(value: Input[CertificateAuthorityRevocationConfigurationCrlConfiguration]): Self = StObject.set(x, "crlConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrlConfigurationUndefined: Self = StObject.set(x, "crlConfiguration", js.undefined)
    }
  }
  
  @js.native
  trait CertificateAuthorityRevocationConfigurationCrlConfiguration extends StObject {
    
    /**
      * Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public. Must be less than or equal to 253 characters in length.
      */
    var customCname: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
      */
    var enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Number of days until a certificate expires. Must be between 1 and 5000.
      */
    var expirationInDays: Input[Double] = js.native
    
    /**
      * Name of the S3 bucket that contains the CRL. If you do not provide a value for the `customCname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket. Must be less than or equal to 255 characters in length.
      */
    var s3BucketName: js.UndefOr[Input[String]] = js.native
  }
  object CertificateAuthorityRevocationConfigurationCrlConfiguration {
    
    @scala.inline
    def apply(expirationInDays: Input[Double]): CertificateAuthorityRevocationConfigurationCrlConfiguration = {
      val __obj = js.Dynamic.literal(expirationInDays = expirationInDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateAuthorityRevocationConfigurationCrlConfiguration]
    }
    
    @scala.inline
    implicit class CertificateAuthorityRevocationConfigurationCrlConfigurationMutableBuilder[Self <: CertificateAuthorityRevocationConfigurationCrlConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomCname(value: Input[String]): Self = StObject.set(x, "customCname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomCnameUndefined: Self = StObject.set(x, "customCname", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setExpirationInDays(value: Input[Double]): Self = StObject.set(x, "expirationInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketName(value: Input[String]): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketNameUndefined: Self = StObject.set(x, "s3BucketName", js.undefined)
    }
  }
  
  @js.native
  trait GetCertificateAuthorityRevocationConfiguration extends StObject {
    
    var crlConfigurations: js.UndefOr[js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]] = js.native
  }
  object GetCertificateAuthorityRevocationConfiguration {
    
    @scala.inline
    def apply(): GetCertificateAuthorityRevocationConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCertificateAuthorityRevocationConfiguration]
    }
    
    @scala.inline
    implicit class GetCertificateAuthorityRevocationConfigurationMutableBuilder[Self <: GetCertificateAuthorityRevocationConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrlConfigurations(value: js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]): Self = StObject.set(x, "crlConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrlConfigurationsUndefined: Self = StObject.set(x, "crlConfigurations", js.undefined)
      
      @scala.inline
      def setCrlConfigurationsVarargs(value: GetCertificateAuthorityRevocationConfigurationCrlConfiguration*): Self = StObject.set(x, "crlConfigurations", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetCertificateAuthorityRevocationConfigurationCrlConfiguration extends StObject {
    
    var customCname: js.UndefOr[String] = js.native
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var expirationInDays: js.UndefOr[Double] = js.native
    
    var s3BucketName: js.UndefOr[String] = js.native
  }
  object GetCertificateAuthorityRevocationConfigurationCrlConfiguration {
    
    @scala.inline
    def apply(): GetCertificateAuthorityRevocationConfigurationCrlConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]
    }
    
    @scala.inline
    implicit class GetCertificateAuthorityRevocationConfigurationCrlConfigurationMutableBuilder[Self <: GetCertificateAuthorityRevocationConfigurationCrlConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomCname(value: String): Self = StObject.set(x, "customCname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomCnameUndefined: Self = StObject.set(x, "customCname", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setExpirationInDays(value: Double): Self = StObject.set(x, "expirationInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationInDaysUndefined: Self = StObject.set(x, "expirationInDays", js.undefined)
      
      @scala.inline
      def setS3BucketName(value: String): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketNameUndefined: Self = StObject.set(x, "s3BucketName", js.undefined)
    }
  }
}
