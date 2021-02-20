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

object dmsCertificateMod {
  
  @JSImport("@pulumi/aws/dms/certificate", "Certificate")
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
      * The Amazon Resource Name (ARN) for the certificate.
      */
    val certificateArn: Output_[String] = js.native
    
    /**
      * The certificate identifier.
      */
    val certificateId: Output_[String] = js.native
    
    /**
      * The contents of the .pem X.509 certificate file for the certificate. Either `certificatePem` or `certificateWallet` must be set.
      */
    val certificatePem: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The contents of the Oracle Wallet certificate for use with SSL. Either `certificatePem` or `certificateWallet` must be set.
      */
    val certificateWallet: Output_[js.UndefOr[String]] = js.native
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
    @JSImport("@pulumi/aws/dms/certificate", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID]): Certificate = js.native
    @JSImport("@pulumi/aws/dms/certificate", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Certificate = js.native
    @JSImport("@pulumi/aws/dms/certificate", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateState): Certificate = js.native
    @JSImport("@pulumi/aws/dms/certificate", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): Certificate = js.native
    
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dms/certificate", "Certificate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/certificate.Certificate */ Boolean = js.native
  }
  
  @js.native
  trait CertificateArgs extends StObject {
    
    /**
      * The certificate identifier.
      */
    val certificateId: Input[String] = js.native
    
    /**
      * The contents of the .pem X.509 certificate file for the certificate. Either `certificatePem` or `certificateWallet` must be set.
      */
    val certificatePem: js.UndefOr[Input[String]] = js.native
    
    /**
      * The contents of the Oracle Wallet certificate for use with SSL. Either `certificatePem` or `certificateWallet` must be set.
      */
    val certificateWallet: js.UndefOr[Input[String]] = js.native
  }
  object CertificateArgs {
    
    @scala.inline
    def apply(certificateId: Input[String]): CertificateArgs = {
      val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateArgs]
    }
    
    @scala.inline
    implicit class CertificateArgsMutableBuilder[Self <: CertificateArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificateId(value: Input[String]): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificatePem(value: Input[String]): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificatePemUndefined: Self = StObject.set(x, "certificatePem", js.undefined)
      
      @scala.inline
      def setCertificateWallet(value: Input[String]): Self = StObject.set(x, "certificateWallet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateWalletUndefined: Self = StObject.set(x, "certificateWallet", js.undefined)
    }
  }
  
  @js.native
  trait CertificateState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) for the certificate.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The certificate identifier.
      */
    val certificateId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The contents of the .pem X.509 certificate file for the certificate. Either `certificatePem` or `certificateWallet` must be set.
      */
    val certificatePem: js.UndefOr[Input[String]] = js.native
    
    /**
      * The contents of the Oracle Wallet certificate for use with SSL. Either `certificatePem` or `certificateWallet` must be set.
      */
    val certificateWallet: js.UndefOr[Input[String]] = js.native
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
      def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      @scala.inline
      def setCertificateId(value: Input[String]): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
      
      @scala.inline
      def setCertificatePem(value: Input[String]): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificatePemUndefined: Self = StObject.set(x, "certificatePem", js.undefined)
      
      @scala.inline
      def setCertificateWallet(value: Input[String]): Self = StObject.set(x, "certificateWallet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateWalletUndefined: Self = StObject.set(x, "certificateWallet", js.undefined)
    }
  }
}
