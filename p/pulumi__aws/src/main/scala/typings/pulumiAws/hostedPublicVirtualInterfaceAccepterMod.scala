package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostedPublicVirtualInterfaceAccepterMod {
  
  @JSImport("@pulumi/aws/directconnect/hostedPublicVirtualInterfaceAccepter", "HostedPublicVirtualInterfaceAccepter")
  @js.native
  class HostedPublicVirtualInterfaceAccepter protected () extends CustomResource {
    /**
      * Create a HostedPublicVirtualInterfaceAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedPublicVirtualInterfaceAccepterArgs) = this()
    def this(name: String, args: HostedPublicVirtualInterfaceAccepterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the virtual interface.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The ID of the Direct Connect virtual interface to accept.
      */
    val virtualInterfaceId: Output_[String] = js.native
  }
  /* static members */
  object HostedPublicVirtualInterfaceAccepter {
    
    @JSImport("@pulumi/aws/directconnect/hostedPublicVirtualInterfaceAccepter", "HostedPublicVirtualInterfaceAccepter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HostedPublicVirtualInterfaceAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): HostedPublicVirtualInterfaceAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[HostedPublicVirtualInterfaceAccepter]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): HostedPublicVirtualInterfaceAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HostedPublicVirtualInterfaceAccepter]
    @scala.inline
    def get(name: String, id: Input[ID], state: HostedPublicVirtualInterfaceAccepterState): HostedPublicVirtualInterfaceAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[HostedPublicVirtualInterfaceAccepter]
    @scala.inline
    def get(
      name: String,
      id: Input[ID],
      state: HostedPublicVirtualInterfaceAccepterState,
      opts: CustomResourceOptions
    ): HostedPublicVirtualInterfaceAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HostedPublicVirtualInterfaceAccepter]
    
    /**
      * Returns true if the given object is an instance of HostedPublicVirtualInterfaceAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPublicVirtualInterfaceAccepter.HostedPublicVirtualInterfaceAccepter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/hostedPublicVirtualInterfaceAccepter.HostedPublicVirtualInterfaceAccepter */ Boolean]
  }
  
  trait HostedPublicVirtualInterfaceAccepterArgs extends StObject {
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ID of the Direct Connect virtual interface to accept.
      */
    val virtualInterfaceId: Input[String]
  }
  object HostedPublicVirtualInterfaceAccepterArgs {
    
    @scala.inline
    def apply(virtualInterfaceId: Input[String]): HostedPublicVirtualInterfaceAccepterArgs = {
      val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedPublicVirtualInterfaceAccepterArgs]
    }
    
    @scala.inline
    implicit class HostedPublicVirtualInterfaceAccepterArgsMutableBuilder[Self <: HostedPublicVirtualInterfaceAccepterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVirtualInterfaceId(value: Input[String]): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostedPublicVirtualInterfaceAccepterState extends StObject {
    
    /**
      * The ARN of the virtual interface.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ID of the Direct Connect virtual interface to accept.
      */
    val virtualInterfaceId: js.UndefOr[Input[String]] = js.undefined
  }
  object HostedPublicVirtualInterfaceAccepterState {
    
    @scala.inline
    def apply(): HostedPublicVirtualInterfaceAccepterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedPublicVirtualInterfaceAccepterState]
    }
    
    @scala.inline
    implicit class HostedPublicVirtualInterfaceAccepterStateMutableBuilder[Self <: HostedPublicVirtualInterfaceAccepterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVirtualInterfaceId(value: Input[String]): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
    }
  }
}
