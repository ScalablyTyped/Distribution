package typings.pulumiAws

import typings.pulumiAws.s3outpostsEndpointMod.EndpointArgs
import typings.pulumiAws.s3outpostsEndpointMod.EndpointState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3outpostsMod {
  
  @JSImport("@pulumi/aws/s3outposts", "Endpoint")
  @js.native
  class Endpoint protected ()
    extends typings.pulumiAws.s3outpostsEndpointMod.Endpoint {
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
    
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3outposts", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.s3outpostsEndpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/s3outposts", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.s3outpostsEndpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/s3outposts", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState): typings.pulumiAws.s3outpostsEndpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/s3outposts", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typings.pulumiAws.s3outpostsEndpointMod.Endpoint = js.native
    
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3outposts", "Endpoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3outposts/endpoint.Endpoint */ Boolean = js.native
  }
}
