package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iotCertificateMod {
  
  @JSImport("@pulumi/aws/iot/certificate", "Certificate")
  @js.native
  class Certificate protected () extends CustomResource {
    /**
      * Create a Certificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateArgs) = this()
    def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Boolean flag to indicate if the certificate should be active
      */
    val active: Output_[Boolean] = js.native
    
    /**
      * The ARN of the created certificate.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The certificate data, in PEM format.
      */
    val certificatePem: Output_[String] = js.native
    
    /**
      * The certificate signing request. Review
      * [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
      * for more information on generating a certificate from a certificate signing request (CSR).
      * If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
      * for more information on generating keys and a certificate.
      */
    val csr: Output_[js.UndefOr[String]] = js.native
    
    /**
      * When no CSR is provided, the private key.
      */
    val privateKey: Output_[String] = js.native
    
    /**
      * When no CSR is provided, the public key.
      */
    val publicKey: Output_[String] = js.native
  }
  /* static members */
  object Certificate {
    
    /**
      * Get an existing Certificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iot/certificate", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID]): Certificate = js.native
    @JSImport("@pulumi/aws/iot/certificate", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Certificate = js.native
    @JSImport("@pulumi/aws/iot/certificate", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateState): Certificate = js.native
    @JSImport("@pulumi/aws/iot/certificate", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): Certificate = js.native
    
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iot/certificate", "Certificate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/certificate.Certificate */ Boolean = js.native
  }
  
  @js.native
  trait CertificateArgs extends StObject {
    
    /**
      * Boolean flag to indicate if the certificate should be active
      */
    val active: Input[Boolean] = js.native
    
    /**
      * The certificate signing request. Review
      * [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
      * for more information on generating a certificate from a certificate signing request (CSR).
      * If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
      * for more information on generating keys and a certificate.
      */
    val csr: js.UndefOr[Input[String]] = js.native
  }
  object CertificateArgs {
    
    @scala.inline
    def apply(active: Input[Boolean]): CertificateArgs = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateArgs]
    }
    
    @scala.inline
    implicit class CertificateArgsMutableBuilder[Self <: CertificateArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Input[Boolean]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsr(value: Input[String]): Self = StObject.set(x, "csr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsrUndefined: Self = StObject.set(x, "csr", js.undefined)
    }
  }
  
  @js.native
  trait CertificateState extends StObject {
    
    /**
      * Boolean flag to indicate if the certificate should be active
      */
    val active: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ARN of the created certificate.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The certificate data, in PEM format.
      */
    val certificatePem: js.UndefOr[Input[String]] = js.native
    
    /**
      * The certificate signing request. Review
      * [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
      * for more information on generating a certificate from a certificate signing request (CSR).
      * If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
      * for more information on generating keys and a certificate.
      */
    val csr: js.UndefOr[Input[String]] = js.native
    
    /**
      * When no CSR is provided, the private key.
      */
    val privateKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * When no CSR is provided, the public key.
      */
    val publicKey: js.UndefOr[Input[String]] = js.native
  }
  object CertificateState {
    
    @scala.inline
    def apply(): CertificateState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateState]
    }
    
    @scala.inline
    implicit class CertificateStateMutableBuilder[Self <: CertificateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Input[Boolean]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCertificatePem(value: Input[String]): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificatePemUndefined: Self = StObject.set(x, "certificatePem", js.undefined)
      
      @scala.inline
      def setCsr(value: Input[String]): Self = StObject.set(x, "csr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsrUndefined: Self = StObject.set(x, "csr", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: Input[String]): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      @scala.inline
      def setPublicKey(value: Input[String]): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    }
  }
}
