package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.acmpca.CertificateAuthorityCertificateAuthorityConfiguration
import typings.pulumiAws.outputMod.acmpca.CertificateAuthorityRevocationConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificateAuthorityMod {
  
  @JSImport("@pulumi/aws/acmpca/certificateAuthority", "CertificateAuthority")
  @js.native
  class CertificateAuthority protected () extends CustomResource {
    /**
      * Create a CertificateAuthority resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateAuthorityArgs) = this()
    def this(name: String, args: CertificateAuthorityArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the certificate authority.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
      */
    val certificate: Output_[String] = js.native
    
    /**
      * Nested argument containing algorithms and certificate subject information. Defined below.
      */
    val certificateAuthorityConfiguration: Output_[CertificateAuthorityCertificateAuthorityConfiguration] = js.native
    
    /**
      * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
      */
    val certificateChain: Output_[String] = js.native
    
    /**
      * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
      */
    val certificateSigningRequest: Output_[String] = js.native
    
    /**
      * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
      */
    val notAfter: Output_[String] = js.native
    
    /**
      * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
      */
    val notBefore: Output_[String] = js.native
    
    /**
      * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
      */
    val permanentDeletionTimeInDays: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * Nested argument containing revocation configuration. Defined below.
      */
    val revocationConfiguration: Output_[js.UndefOr[CertificateAuthorityRevocationConfiguration]] = js.native
    
    /**
      * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
      */
    val serial: Output_[String] = js.native
    
    /**
      * Status of the certificate authority.
      */
    val status: Output_[String] = js.native
    
    /**
      * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
      */
    val `type`: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object CertificateAuthority {
    
    /**
      * Get an existing CertificateAuthority resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/acmpca/certificateAuthority", "CertificateAuthority.get")
    @js.native
    def get(name: String, id: Input[ID]): CertificateAuthority = js.native
    @JSImport("@pulumi/aws/acmpca/certificateAuthority", "CertificateAuthority.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CertificateAuthority = js.native
    @JSImport("@pulumi/aws/acmpca/certificateAuthority", "CertificateAuthority.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateAuthorityState): CertificateAuthority = js.native
    @JSImport("@pulumi/aws/acmpca/certificateAuthority", "CertificateAuthority.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateAuthorityState, opts: CustomResourceOptions): CertificateAuthority = js.native
    
    /**
      * Returns true if the given object is an instance of CertificateAuthority.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/acmpca/certificateAuthority", "CertificateAuthority.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acmpca/certificateAuthority.CertificateAuthority */ Boolean = js.native
  }
  
  @js.native
  trait CertificateAuthorityArgs extends StObject {
    
    /**
      * Nested argument containing algorithms and certificate subject information. Defined below.
      */
    val certificateAuthorityConfiguration: Input[
        typings.pulumiAws.inputMod.acmpca.CertificateAuthorityCertificateAuthorityConfiguration
      ] = js.native
    
    /**
      * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
      */
    val permanentDeletionTimeInDays: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Nested argument containing revocation configuration. Defined below.
      */
    val revocationConfiguration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.acmpca.CertificateAuthorityRevocationConfiguration]
      ] = js.native
    
    /**
      * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object CertificateAuthorityArgs {
    
    @scala.inline
    def apply(
      certificateAuthorityConfiguration: Input[
          typings.pulumiAws.inputMod.acmpca.CertificateAuthorityCertificateAuthorityConfiguration
        ]
    ): CertificateAuthorityArgs = {
      val __obj = js.Dynamic.literal(certificateAuthorityConfiguration = certificateAuthorityConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateAuthorityArgs]
    }
    
    @scala.inline
    implicit class CertificateAuthorityArgsMutableBuilder[Self <: CertificateAuthorityArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificateAuthorityConfiguration(
        value: Input[
              typings.pulumiAws.inputMod.acmpca.CertificateAuthorityCertificateAuthorityConfiguration
            ]
      ): Self = StObject.set(x, "certificateAuthorityConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setPermanentDeletionTimeInDays(value: Input[Double]): Self = StObject.set(x, "permanentDeletionTimeInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermanentDeletionTimeInDaysUndefined: Self = StObject.set(x, "permanentDeletionTimeInDays", js.undefined)
      
      @scala.inline
      def setRevocationConfiguration(value: Input[typings.pulumiAws.inputMod.acmpca.CertificateAuthorityRevocationConfiguration]): Self = StObject.set(x, "revocationConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevocationConfigurationUndefined: Self = StObject.set(x, "revocationConfiguration", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CertificateAuthorityState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the certificate authority.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
      */
    val certificate: js.UndefOr[Input[String]] = js.native
    
    /**
      * Nested argument containing algorithms and certificate subject information. Defined below.
      */
    val certificateAuthorityConfiguration: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.acmpca.CertificateAuthorityCertificateAuthorityConfiguration
        ]
      ] = js.native
    
    /**
      * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
      */
    val certificateChain: js.UndefOr[Input[String]] = js.native
    
    /**
      * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
      */
    val certificateSigningRequest: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
      */
    val notAfter: js.UndefOr[Input[String]] = js.native
    
    /**
      * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
      */
    val notBefore: js.UndefOr[Input[String]] = js.native
    
    /**
      * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
      */
    val permanentDeletionTimeInDays: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Nested argument containing revocation configuration. Defined below.
      */
    val revocationConfiguration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.acmpca.CertificateAuthorityRevocationConfiguration]
      ] = js.native
    
    /**
      * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
      */
    val serial: js.UndefOr[Input[String]] = js.native
    
    /**
      * Status of the certificate authority.
      */
    val status: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object CertificateAuthorityState {
    
    @scala.inline
    def apply(): CertificateAuthorityState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateAuthorityState]
    }
    
    @scala.inline
    implicit class CertificateAuthorityStateMutableBuilder[Self <: CertificateAuthorityState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCertificate(value: Input[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateAuthorityConfiguration(
        value: Input[
              typings.pulumiAws.inputMod.acmpca.CertificateAuthorityCertificateAuthorityConfiguration
            ]
      ): Self = StObject.set(x, "certificateAuthorityConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateAuthorityConfigurationUndefined: Self = StObject.set(x, "certificateAuthorityConfiguration", js.undefined)
      
      @scala.inline
      def setCertificateChain(value: Input[String]): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
      
      @scala.inline
      def setCertificateSigningRequest(value: Input[String]): Self = StObject.set(x, "certificateSigningRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateSigningRequestUndefined: Self = StObject.set(x, "certificateSigningRequest", js.undefined)
      
      @scala.inline
      def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setNotAfter(value: Input[String]): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
      
      @scala.inline
      def setNotBefore(value: Input[String]): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
      
      @scala.inline
      def setPermanentDeletionTimeInDays(value: Input[Double]): Self = StObject.set(x, "permanentDeletionTimeInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermanentDeletionTimeInDaysUndefined: Self = StObject.set(x, "permanentDeletionTimeInDays", js.undefined)
      
      @scala.inline
      def setRevocationConfiguration(value: Input[typings.pulumiAws.inputMod.acmpca.CertificateAuthorityRevocationConfiguration]): Self = StObject.set(x, "revocationConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevocationConfigurationUndefined: Self = StObject.set(x, "revocationConfiguration", js.undefined)
      
      @scala.inline
      def setSerial(value: Input[String]): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
