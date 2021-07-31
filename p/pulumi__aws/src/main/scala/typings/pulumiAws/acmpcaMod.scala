package typings.pulumiAws

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acmpcaMod {
  
  @JSImport("@pulumi/aws/acmpca", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/acmpca", "CertificateAuthority")
  @js.native
  class CertificateAuthority protected ()
    extends typings.pulumiAws.certificateAuthorityMod.CertificateAuthority {
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
    
    @JSImport("@pulumi/aws/acmpca", "CertificateAuthority")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CertificateAuthority resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.certificateAuthorityMod.CertificateAuthority = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.certificateAuthorityMod.CertificateAuthority]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.certificateAuthorityMod.CertificateAuthority = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.certificateAuthorityMod.CertificateAuthority]
    @scala.inline
    def get(name: String, id: Input[ID], state: CertificateAuthorityState): typings.pulumiAws.certificateAuthorityMod.CertificateAuthority = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.certificateAuthorityMod.CertificateAuthority]
    @scala.inline
    def get(name: String, id: Input[ID], state: CertificateAuthorityState, opts: CustomResourceOptions): typings.pulumiAws.certificateAuthorityMod.CertificateAuthority = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.certificateAuthorityMod.CertificateAuthority]
    
    /**
      * Returns true if the given object is an instance of CertificateAuthority.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acmpca/certificateAuthority.CertificateAuthority */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/acmpca/certificateAuthority.CertificateAuthority */ Boolean]
  }
  
  @scala.inline
  def getCertificateAuthority(args: GetCertificateAuthorityArgs): js.Promise[GetCertificateAuthorityResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCertificateAuthority")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetCertificateAuthorityResult]]
  @scala.inline
  def getCertificateAuthority(args: GetCertificateAuthorityArgs, opts: InvokeOptions): js.Promise[GetCertificateAuthorityResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCertificateAuthority")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCertificateAuthorityResult]]
}
