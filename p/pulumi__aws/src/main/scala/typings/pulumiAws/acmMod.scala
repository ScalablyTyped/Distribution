package typings.pulumiAws

import typings.pulumiAws.certificateMod.CertificateArgs
import typings.pulumiAws.certificateMod.CertificateState
import typings.pulumiAws.certificateValidationMod.CertificateValidationArgs
import typings.pulumiAws.certificateValidationMod.CertificateValidationState
import typings.pulumiAws.getCertificateMod.GetCertificateArgs
import typings.pulumiAws.getCertificateMod.GetCertificateResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acmMod {
  
  @JSImport("@pulumi/aws/acm", "Certificate")
  @js.native
  class Certificate protected ()
    extends typings.pulumiAws.certificateMod.Certificate {
    /**
      * Create a Certificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CertificateArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws/acm", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.certificateMod.Certificate = js.native
    @JSImport("@pulumi/aws/acm", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.certificateMod.Certificate = js.native
    @JSImport("@pulumi/aws/acm", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateState): typings.pulumiAws.certificateMod.Certificate = js.native
    @JSImport("@pulumi/aws/acm", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typings.pulumiAws.certificateMod.Certificate = js.native
    
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/acm", "Certificate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acm/certificate.Certificate */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/acm", "CertificateValidation")
  @js.native
  class CertificateValidation protected ()
    extends typings.pulumiAws.certificateValidationMod.CertificateValidation {
    /**
      * Create a CertificateValidation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateValidationArgs) = this()
    def this(name: String, args: CertificateValidationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CertificateValidation {
    
    /**
      * Get an existing CertificateValidation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/acm", "CertificateValidation.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.certificateValidationMod.CertificateValidation = js.native
    @JSImport("@pulumi/aws/acm", "CertificateValidation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.certificateValidationMod.CertificateValidation = js.native
    @JSImport("@pulumi/aws/acm", "CertificateValidation.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateValidationState): typings.pulumiAws.certificateValidationMod.CertificateValidation = js.native
    @JSImport("@pulumi/aws/acm", "CertificateValidation.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateValidationState, opts: CustomResourceOptions): typings.pulumiAws.certificateValidationMod.CertificateValidation = js.native
    
    /**
      * Returns true if the given object is an instance of CertificateValidation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/acm", "CertificateValidation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acm/certificateValidation.CertificateValidation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/acm", "getCertificate")
  @js.native
  def getCertificate(args: GetCertificateArgs): js.Promise[GetCertificateResult] = js.native
  @JSImport("@pulumi/aws/acm", "getCertificate")
  @js.native
  def getCertificate(args: GetCertificateArgs, opts: InvokeOptions): js.Promise[GetCertificateResult] = js.native
}
