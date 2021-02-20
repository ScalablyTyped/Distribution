package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trafficMirrorFilterMod {
  
  @JSImport("@pulumi/aws/ec2/trafficMirrorFilter", "TrafficMirrorFilter")
  @js.native
  class TrafficMirrorFilter protected () extends CustomResource {
    /**
      * Create a TrafficMirrorFilter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TrafficMirrorFilterArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TrafficMirrorFilterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A description of the filter.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * List of amazon network services that should be mirrored. Valid values: `amazon-dns`.
      */
    val networkServices: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object TrafficMirrorFilter {
    
    /**
      * Get an existing TrafficMirrorFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/trafficMirrorFilter", "TrafficMirrorFilter.get")
    @js.native
    def get(name: String, id: Input[ID]): TrafficMirrorFilter = js.native
    @JSImport("@pulumi/aws/ec2/trafficMirrorFilter", "TrafficMirrorFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TrafficMirrorFilter = js.native
    @JSImport("@pulumi/aws/ec2/trafficMirrorFilter", "TrafficMirrorFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: TrafficMirrorFilterState): TrafficMirrorFilter = js.native
    @JSImport("@pulumi/aws/ec2/trafficMirrorFilter", "TrafficMirrorFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: TrafficMirrorFilterState, opts: CustomResourceOptions): TrafficMirrorFilter = js.native
    
    /**
      * Returns true if the given object is an instance of TrafficMirrorFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/trafficMirrorFilter", "TrafficMirrorFilter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/trafficMirrorFilter.TrafficMirrorFilter */ Boolean = js.native
  }
  
  @js.native
  trait TrafficMirrorFilterArgs extends StObject {
    
    /**
      * A description of the filter.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of amazon network services that should be mirrored. Valid values: `amazon-dns`.
      */
    val networkServices: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object TrafficMirrorFilterArgs {
    
    @scala.inline
    def apply(): TrafficMirrorFilterArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrafficMirrorFilterArgs]
    }
    
    @scala.inline
    implicit class TrafficMirrorFilterArgsMutableBuilder[Self <: TrafficMirrorFilterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setNetworkServices(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "networkServices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkServicesUndefined: Self = StObject.set(x, "networkServices", js.undefined)
      
      @scala.inline
      def setNetworkServicesVarargs(value: Input[String]*): Self = StObject.set(x, "networkServices", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait TrafficMirrorFilterState extends StObject {
    
    /**
      * A description of the filter.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of amazon network services that should be mirrored. Valid values: `amazon-dns`.
      */
    val networkServices: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object TrafficMirrorFilterState {
    
    @scala.inline
    def apply(): TrafficMirrorFilterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrafficMirrorFilterState]
    }
    
    @scala.inline
    implicit class TrafficMirrorFilterStateMutableBuilder[Self <: TrafficMirrorFilterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setNetworkServices(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "networkServices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkServicesUndefined: Self = StObject.set(x, "networkServices", js.undefined)
      
      @scala.inline
      def setNetworkServicesVarargs(value: Input[String]*): Self = StObject.set(x, "networkServices", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
