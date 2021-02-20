package typings.pulumiKubernetes

import typings.pulumiKubernetes.v1CertificateSigningRequestListMod.CertificateSigningRequestListArgs
import typings.pulumiKubernetes.v1CertificateSigningRequestMod.CertificateSigningRequestArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificatesV1Mod {
  
  @JSImport("@pulumi/kubernetes/certificates/v1", "CertificateSigningRequest")
  @js.native
  class CertificateSigningRequest protected ()
    extends typings.pulumiKubernetes.v1CertificateSigningRequestMod.CertificateSigningRequest {
    /**
      * Create a CertificateSigningRequest resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CertificateSigningRequestArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CertificateSigningRequestArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CertificateSigningRequest {
    
    /**
      * Get an existing CertificateSigningRequest resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/certificates/v1", "CertificateSigningRequest.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CertificateSigningRequestMod.CertificateSigningRequest = js.native
    @JSImport("@pulumi/kubernetes/certificates/v1", "CertificateSigningRequest.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CertificateSigningRequestMod.CertificateSigningRequest = js.native
    
    /**
      * Returns true if the given object is an instance of CertificateSigningRequest.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/certificates/v1", "CertificateSigningRequest.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1/certificateSigningRequest.CertificateSigningRequest */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/certificates/v1", "CertificateSigningRequestList")
  @js.native
  class CertificateSigningRequestList protected ()
    extends typings.pulumiKubernetes.v1CertificateSigningRequestListMod.CertificateSigningRequestList {
    /**
      * Create a CertificateSigningRequestList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CertificateSigningRequestListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CertificateSigningRequestListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CertificateSigningRequestList {
    
    /**
      * Get an existing CertificateSigningRequestList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/certificates/v1", "CertificateSigningRequestList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CertificateSigningRequestListMod.CertificateSigningRequestList = js.native
    @JSImport("@pulumi/kubernetes/certificates/v1", "CertificateSigningRequestList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CertificateSigningRequestListMod.CertificateSigningRequestList = js.native
    
    /**
      * Returns true if the given object is an instance of CertificateSigningRequestList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/certificates/v1", "CertificateSigningRequestList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1/certificateSigningRequestList.CertificateSigningRequestList */ Boolean = js.native
  }
}
