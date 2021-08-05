package typings.pulumiKubernetes.mod

import typings.pulumiKubernetes.v1CertificateSigningRequestListMod.CertificateSigningRequestListArgs
import typings.pulumiKubernetes.v1CertificateSigningRequestMod.CertificateSigningRequestArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificates {
  
  object v1 {
    
    @JSImport("@pulumi/kubernetes", "certificates.v1.CertificateSigningRequest")
    @js.native
    class CertificateSigningRequest protected ()
      extends typings.pulumiKubernetes.certificatesMod.v1.CertificateSigningRequest {
      /**
        * Create a CertificateSigningRequest resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CertificateSigningRequestArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CertificateSigningRequestArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object CertificateSigningRequest {
      
      @JSImport("@pulumi/kubernetes", "certificates.v1.CertificateSigningRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CertificateSigningRequest resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CertificateSigningRequestMod.CertificateSigningRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CertificateSigningRequestMod.CertificateSigningRequest]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CertificateSigningRequestMod.CertificateSigningRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CertificateSigningRequestMod.CertificateSigningRequest]
      
      /**
        * Returns true if the given object is an instance of CertificateSigningRequest.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1/certificateSigningRequest.CertificateSigningRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1/certificateSigningRequest.CertificateSigningRequest */ Boolean]
    }
    
    @JSImport("@pulumi/kubernetes", "certificates.v1.CertificateSigningRequestList")
    @js.native
    class CertificateSigningRequestList protected ()
      extends typings.pulumiKubernetes.certificatesMod.v1.CertificateSigningRequestList {
      /**
        * Create a CertificateSigningRequestList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CertificateSigningRequestListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CertificateSigningRequestListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object CertificateSigningRequestList {
      
      @JSImport("@pulumi/kubernetes", "certificates.v1.CertificateSigningRequestList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CertificateSigningRequestList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CertificateSigningRequestListMod.CertificateSigningRequestList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CertificateSigningRequestListMod.CertificateSigningRequestList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CertificateSigningRequestListMod.CertificateSigningRequestList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CertificateSigningRequestListMod.CertificateSigningRequestList]
      
      /**
        * Returns true if the given object is an instance of CertificateSigningRequestList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1/certificateSigningRequestList.CertificateSigningRequestList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1/certificateSigningRequestList.CertificateSigningRequestList */ Boolean]
    }
  }
  
  object v1beta1 {
    
    @JSImport("@pulumi/kubernetes", "certificates.v1beta1.CertificateSigningRequest")
    @js.native
    class CertificateSigningRequest protected ()
      extends typings.pulumiKubernetes.certificatesMod.v1beta1.CertificateSigningRequest {
      /**
        * Create a CertificateSigningRequest resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.certificateSigningRequestMod.CertificateSigningRequestArgs
      ) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.certificateSigningRequestMod.CertificateSigningRequestArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object CertificateSigningRequest {
      
      @JSImport("@pulumi/kubernetes", "certificates.v1beta1.CertificateSigningRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CertificateSigningRequest resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.certificateSigningRequestMod.CertificateSigningRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.certificateSigningRequestMod.CertificateSigningRequest]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.certificateSigningRequestMod.CertificateSigningRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.certificateSigningRequestMod.CertificateSigningRequest]
      
      /**
        * Returns true if the given object is an instance of CertificateSigningRequest.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequest.CertificateSigningRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequest.CertificateSigningRequest */ Boolean]
    }
    
    @JSImport("@pulumi/kubernetes", "certificates.v1beta1.CertificateSigningRequestList")
    @js.native
    class CertificateSigningRequestList protected ()
      extends typings.pulumiKubernetes.certificatesMod.v1beta1.CertificateSigningRequestList {
      /**
        * Create a CertificateSigningRequestList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.certificateSigningRequestListMod.CertificateSigningRequestListArgs
      ) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.certificateSigningRequestListMod.CertificateSigningRequestListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object CertificateSigningRequestList {
      
      @JSImport("@pulumi/kubernetes", "certificates.v1beta1.CertificateSigningRequestList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CertificateSigningRequestList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.certificateSigningRequestListMod.CertificateSigningRequestList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.certificateSigningRequestListMod.CertificateSigningRequestList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.certificateSigningRequestListMod.CertificateSigningRequestList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.certificateSigningRequestListMod.CertificateSigningRequestList]
      
      /**
        * Returns true if the given object is an instance of CertificateSigningRequestList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList.CertificateSigningRequestList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList.CertificateSigningRequestList */ Boolean]
    }
  }
}
