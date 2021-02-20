package typings.pulumiAws

import typings.pulumiAws.swfDomainMod.DomainArgs
import typings.pulumiAws.swfDomainMod.DomainState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swfMod {
  
  @JSImport("@pulumi/aws/swf", "Domain")
  @js.native
  class Domain protected ()
    extends typings.pulumiAws.swfDomainMod.Domain {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainArgs) = this()
    def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Domain {
    
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/swf", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.swfDomainMod.Domain = js.native
    @JSImport("@pulumi/aws/swf", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.swfDomainMod.Domain = js.native
    @JSImport("@pulumi/aws/swf", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainState): typings.pulumiAws.swfDomainMod.Domain = js.native
    @JSImport("@pulumi/aws/swf", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): typings.pulumiAws.swfDomainMod.Domain = js.native
    
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/swf", "Domain.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/swf/domain.Domain */ Boolean = js.native
  }
}
