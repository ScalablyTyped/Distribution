package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.acmpca.GetCertificateAuthorityRevocationConfiguration
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCertificateAuthorityMod {
  
  @JSImport("@pulumi/aws/acmpca/getCertificateAuthority", "getCertificateAuthority")
  @js.native
  def getCertificateAuthority(args: GetCertificateAuthorityArgs): js.Promise[GetCertificateAuthorityResult] = js.native
  @JSImport("@pulumi/aws/acmpca/getCertificateAuthority", "getCertificateAuthority")
  @js.native
  def getCertificateAuthority(args: GetCertificateAuthorityArgs, opts: InvokeOptions): js.Promise[GetCertificateAuthorityResult] = js.native
  
  @js.native
  trait GetCertificateAuthorityArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the certificate authority.
      */
    val arn: String = js.native
    
    /**
      * Nested attribute containing revocation configuration.
      * * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
      * * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
      * * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
      * * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
      * * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
      */
    val revocationConfigurations: js.UndefOr[js.Array[GetCertificateAuthorityRevocationConfiguration]] = js.native
    
    /**
      * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetCertificateAuthorityArgs {
    
    @scala.inline
    def apply(arn: String): GetCertificateAuthorityArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCertificateAuthorityArgs]
    }
    
    @scala.inline
    implicit class GetCertificateAuthorityArgsMutableBuilder[Self <: GetCertificateAuthorityArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevocationConfigurations(value: js.Array[GetCertificateAuthorityRevocationConfiguration]): Self = StObject.set(x, "revocationConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevocationConfigurationsUndefined: Self = StObject.set(x, "revocationConfigurations", js.undefined)
      
      @scala.inline
      def setRevocationConfigurationsVarargs(value: GetCertificateAuthorityRevocationConfiguration*): Self = StObject.set(x, "revocationConfigurations", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetCertificateAuthorityResult extends StObject {
    
    val arn: String = js.native
    
    /**
      * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
      */
    val certificate: String = js.native
    
    /**
      * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
      */
    val certificateChain: String = js.native
    
    /**
      * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
      */
    val certificateSigningRequest: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
      */
    val notAfter: String = js.native
    
    /**
      * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
      */
    val notBefore: String = js.native
    
    /**
      * Nested attribute containing revocation configuration.
      * * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
      * * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
      * * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
      * * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
      * * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
      */
    val revocationConfigurations: js.Array[
        typings.pulumiAws.outputMod.acmpca.GetCertificateAuthorityRevocationConfiguration
      ] = js.native
    
    /**
      * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
      */
    val serial: String = js.native
    
    /**
      * Status of the certificate authority.
      */
    val status: String = js.native
    
    /**
      * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * The type of the certificate authority.
      */
    val `type`: String = js.native
  }
  object GetCertificateAuthorityResult {
    
    @scala.inline
    def apply(
      arn: String,
      certificate: String,
      certificateChain: String,
      certificateSigningRequest: String,
      id: String,
      notAfter: String,
      notBefore: String,
      revocationConfigurations: js.Array[
          typings.pulumiAws.outputMod.acmpca.GetCertificateAuthorityRevocationConfiguration
        ],
      serial: String,
      status: String,
      tags: StringDictionary[String],
      `type`: String
    ): GetCertificateAuthorityResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], certificate = certificate.asInstanceOf[js.Any], certificateChain = certificateChain.asInstanceOf[js.Any], certificateSigningRequest = certificateSigningRequest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any], revocationConfigurations = revocationConfigurations.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCertificateAuthorityResult]
    }
    
    @scala.inline
    implicit class GetCertificateAuthorityResultMutableBuilder[Self <: GetCertificateAuthorityResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateChain(value: String): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateSigningRequest(value: String): Self = StObject.set(x, "certificateSigningRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotAfter(value: String): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotBefore(value: String): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevocationConfigurations(
        value: js.Array[
              typings.pulumiAws.outputMod.acmpca.GetCertificateAuthorityRevocationConfiguration
            ]
      ): Self = StObject.set(x, "revocationConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevocationConfigurationsVarargs(value: typings.pulumiAws.outputMod.acmpca.GetCertificateAuthorityRevocationConfiguration*): Self = StObject.set(x, "revocationConfigurations", js.Array(value :_*))
      
      @scala.inline
      def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
