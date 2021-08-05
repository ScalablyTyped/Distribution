package typings.pulumiKubernetes

import typings.pulumiKubernetes.leaseListMod.LeaseListArgs
import typings.pulumiKubernetes.leaseMod.LeaseArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coordinationV1beta1Mod {
  
  @JSImport("@pulumi/kubernetes/coordination/v1beta1", "Lease")
  @js.native
  class Lease protected ()
    extends typings.pulumiKubernetes.leaseMod.Lease {
    /**
      * Create a Lease resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LeaseArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: LeaseArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Lease {
    
    @JSImport("@pulumi/kubernetes/coordination/v1beta1", "Lease")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Lease resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.leaseMod.Lease = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.leaseMod.Lease]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.leaseMod.Lease = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.leaseMod.Lease]
    
    /**
      * Returns true if the given object is an instance of Lease.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1beta1/lease.Lease */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1beta1/lease.Lease */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/coordination/v1beta1", "LeaseList")
  @js.native
  class LeaseList protected ()
    extends typings.pulumiKubernetes.leaseListMod.LeaseList {
    /**
      * Create a LeaseList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LeaseListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: LeaseListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LeaseList {
    
    @JSImport("@pulumi/kubernetes/coordination/v1beta1", "LeaseList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LeaseList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.leaseListMod.LeaseList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.leaseListMod.LeaseList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.leaseListMod.LeaseList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.leaseListMod.LeaseList]
    
    /**
      * Returns true if the given object is an instance of LeaseList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1beta1/leaseList.LeaseList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1beta1/leaseList.LeaseList */ Boolean]
  }
}
