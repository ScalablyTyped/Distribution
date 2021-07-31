package typings.pulumiAws.mod

import typings.pulumiAws.s3outpostsEndpointMod.EndpointArgs
import typings.pulumiAws.s3outpostsEndpointMod.EndpointState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3outposts {
  
  @JSImport("@pulumi/aws", "s3outposts.Endpoint")
  @js.native
  class Endpoint protected ()
    extends typings.pulumiAws.s3outpostsMod.Endpoint {
    /**
      * Create a Endpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointArgs) = this()
    def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Endpoint {
    
    @JSImport("@pulumi/aws", "s3outposts.Endpoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.s3outpostsEndpointMod.Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3outpostsEndpointMod.Endpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.s3outpostsEndpointMod.Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3outpostsEndpointMod.Endpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: EndpointState): typings.pulumiAws.s3outpostsEndpointMod.Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3outpostsEndpointMod.Endpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typings.pulumiAws.s3outpostsEndpointMod.Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3outpostsEndpointMod.Endpoint]
    
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3outposts/endpoint.Endpoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3outposts/endpoint.Endpoint */ Boolean]
  }
}
