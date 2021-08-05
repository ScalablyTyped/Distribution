package typings.pulumiKubernetes

import typings.pulumiKubernetes.v1IngressClassListMod.IngressClassListArgs
import typings.pulumiKubernetes.v1IngressClassMod.IngressClassArgs
import typings.pulumiKubernetes.v1IngressListMod.IngressListArgs
import typings.pulumiKubernetes.v1IngressMod.IngressArgs
import typings.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyListArgs
import typings.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicyArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkingV1Mod {
  
  @JSImport("@pulumi/kubernetes/networking/v1", "Ingress")
  @js.native
  class Ingress protected ()
    extends typings.pulumiKubernetes.v1IngressMod.Ingress {
    /**
      * Create a Ingress resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IngressArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: IngressArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Ingress {
    
    @JSImport("@pulumi/kubernetes/networking/v1", "Ingress")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Ingress resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1IngressMod.Ingress = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1IngressMod.Ingress]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1IngressMod.Ingress = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1IngressMod.Ingress]
    
    /**
      * Returns true if the given object is an instance of Ingress.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/ingress.Ingress */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/ingress.Ingress */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/networking/v1", "IngressClass")
  @js.native
  class IngressClass protected ()
    extends typings.pulumiKubernetes.v1IngressClassMod.IngressClass {
    /**
      * Create a IngressClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IngressClassArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: IngressClassArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IngressClass {
    
    @JSImport("@pulumi/kubernetes/networking/v1", "IngressClass")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IngressClass resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1IngressClassMod.IngressClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1IngressClassMod.IngressClass]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1IngressClassMod.IngressClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1IngressClassMod.IngressClass]
    
    /**
      * Returns true if the given object is an instance of IngressClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/ingressClass.IngressClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/ingressClass.IngressClass */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/networking/v1", "IngressClassList")
  @js.native
  class IngressClassList protected ()
    extends typings.pulumiKubernetes.v1IngressClassListMod.IngressClassList {
    /**
      * Create a IngressClassList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IngressClassListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: IngressClassListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IngressClassList {
    
    @JSImport("@pulumi/kubernetes/networking/v1", "IngressClassList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IngressClassList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1IngressClassListMod.IngressClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1IngressClassListMod.IngressClassList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1IngressClassListMod.IngressClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1IngressClassListMod.IngressClassList]
    
    /**
      * Returns true if the given object is an instance of IngressClassList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/ingressClassList.IngressClassList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/ingressClassList.IngressClassList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/networking/v1", "IngressList")
  @js.native
  class IngressList protected ()
    extends typings.pulumiKubernetes.v1IngressListMod.IngressList {
    /**
      * Create a IngressList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IngressListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: IngressListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IngressList {
    
    @JSImport("@pulumi/kubernetes/networking/v1", "IngressList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IngressList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1IngressListMod.IngressList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1IngressListMod.IngressList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1IngressListMod.IngressList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1IngressListMod.IngressList]
    
    /**
      * Returns true if the given object is an instance of IngressList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/ingressList.IngressList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/ingressList.IngressList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/networking/v1", "NetworkPolicy")
  @js.native
  class NetworkPolicy protected ()
    extends typings.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicy {
    /**
      * Create a NetworkPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: NetworkPolicyArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: NetworkPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object NetworkPolicy {
    
    @JSImport("@pulumi/kubernetes/networking/v1", "NetworkPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NetworkPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicy]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicy]
    
    /**
      * Returns true if the given object is an instance of NetworkPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/networkPolicy.NetworkPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/networkPolicy.NetworkPolicy */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/networking/v1", "NetworkPolicyList")
  @js.native
  class NetworkPolicyList protected ()
    extends typings.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyList {
    /**
      * Create a NetworkPolicyList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: NetworkPolicyListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: NetworkPolicyListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object NetworkPolicyList {
    
    @JSImport("@pulumi/kubernetes/networking/v1", "NetworkPolicyList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NetworkPolicyList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyList]
    
    /**
      * Returns true if the given object is an instance of NetworkPolicyList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/networkPolicyList.NetworkPolicyList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/networkPolicyList.NetworkPolicyList */ Boolean]
  }
}
