package typings.pulumiKubernetes

import typings.pulumiKubernetes.ingressClassListMod.IngressClassListArgs
import typings.pulumiKubernetes.ingressClassMod.IngressClassArgs
import typings.pulumiKubernetes.v1beta1IngressListMod.IngressListArgs
import typings.pulumiKubernetes.v1beta1IngressMod.IngressArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkingV1beta1Mod {
  
  @JSImport("@pulumi/kubernetes/networking/v1beta1", "Ingress")
  @js.native
  class Ingress protected ()
    extends typings.pulumiKubernetes.v1beta1IngressMod.Ingress {
    /**
      * Create a Ingress resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IngressArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: IngressArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Ingress {
    
    /**
      * Get an existing Ingress resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/networking/v1beta1", "Ingress.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1IngressMod.Ingress = js.native
    @JSImport("@pulumi/kubernetes/networking/v1beta1", "Ingress.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1IngressMod.Ingress = js.native
    
    /**
      * Returns true if the given object is an instance of Ingress.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/networking/v1beta1", "Ingress.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/ingress.Ingress */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/networking/v1beta1", "IngressClass")
  @js.native
  class IngressClass protected ()
    extends typings.pulumiKubernetes.ingressClassMod.IngressClass {
    /**
      * Create a IngressClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IngressClassArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: IngressClassArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IngressClass {
    
    /**
      * Get an existing IngressClass resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/networking/v1beta1", "IngressClass.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.ingressClassMod.IngressClass = js.native
    @JSImport("@pulumi/kubernetes/networking/v1beta1", "IngressClass.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.ingressClassMod.IngressClass = js.native
    
    /**
      * Returns true if the given object is an instance of IngressClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/networking/v1beta1", "IngressClass.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/ingressClass.IngressClass */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/networking/v1beta1", "IngressClassList")
  @js.native
  class IngressClassList protected ()
    extends typings.pulumiKubernetes.ingressClassListMod.IngressClassList {
    /**
      * Create a IngressClassList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IngressClassListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: IngressClassListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IngressClassList {
    
    /**
      * Get an existing IngressClassList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/networking/v1beta1", "IngressClassList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.ingressClassListMod.IngressClassList = js.native
    @JSImport("@pulumi/kubernetes/networking/v1beta1", "IngressClassList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.ingressClassListMod.IngressClassList = js.native
    
    /**
      * Returns true if the given object is an instance of IngressClassList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/networking/v1beta1", "IngressClassList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/ingressClassList.IngressClassList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/networking/v1beta1", "IngressList")
  @js.native
  class IngressList protected ()
    extends typings.pulumiKubernetes.v1beta1IngressListMod.IngressList {
    /**
      * Create a IngressList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IngressListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: IngressListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IngressList {
    
    /**
      * Get an existing IngressList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/networking/v1beta1", "IngressList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1IngressListMod.IngressList = js.native
    @JSImport("@pulumi/kubernetes/networking/v1beta1", "IngressList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1IngressListMod.IngressList = js.native
    
    /**
      * Returns true if the given object is an instance of IngressList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/networking/v1beta1", "IngressList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/ingressList.IngressList */ Boolean = js.native
  }
}
