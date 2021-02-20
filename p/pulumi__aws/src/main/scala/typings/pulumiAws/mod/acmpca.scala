package typings.pulumiAws.mod

import typings.pulumiAws.certificateAuthorityMod.CertificateAuthorityArgs
import typings.pulumiAws.certificateAuthorityMod.CertificateAuthorityState
import typings.pulumiAws.getCertificateAuthorityMod.GetCertificateAuthorityArgs
import typings.pulumiAws.getCertificateAuthorityMod.GetCertificateAuthorityResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acmpca {
  
  @JSImport("@pulumi/aws", "acmpca.CertificateAuthority")
  @js.native
  class CertificateAuthority protected ()
    extends typings.pulumiAws.acmpcaMod.CertificateAuthority {
    /**
      * Create a CertificateAuthority resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateAuthorityArgs) = this()
    def this(name: String, args: CertificateAuthorityArgs, opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws", "acmpca.CertificateAuthority.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.certificateAuthorityMod.CertificateAuthority = js.native
    @JSImport("@pulumi/aws", "acmpca.CertificateAuthority.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.certificateAuthorityMod.CertificateAuthority = js.native
    @JSImport("@pulumi/aws", "acmpca.CertificateAuthority.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateAuthorityState): typings.pulumiAws.certificateAuthorityMod.CertificateAuthority = js.native
    @JSImport("@pulumi/aws", "acmpca.CertificateAuthority.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateAuthorityState, opts: CustomResourceOptions): typings.pulumiAws.certificateAuthorityMod.CertificateAuthority = js.native
    
    /**
      * Returns true if the given object is an instance of CertificateAuthority.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "acmpca.CertificateAuthority.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acmpca/certificateAuthority.CertificateAuthority */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "acmpca.getCertificateAuthority")
  @js.native
  def getCertificateAuthority(args: GetCertificateAuthorityArgs): js.Promise[GetCertificateAuthorityResult] = js.native
  @JSImport("@pulumi/aws", "acmpca.getCertificateAuthority")
  @js.native
  def getCertificateAuthority(args: GetCertificateAuthorityArgs, opts: InvokeOptions): js.Promise[GetCertificateAuthorityResult] = js.native
}
