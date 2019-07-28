package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.gameliftAliasMod.AliasArgs
import typings.atPulumiAws.gameliftAliasMod.AliasState
import typings.atPulumiAws.gameliftBuildMod.BuildArgs
import typings.atPulumiAws.gameliftBuildMod.BuildState
import typings.atPulumiAws.gameliftFleetMod.FleetArgs
import typings.atPulumiAws.gameliftFleetMod.FleetState
import typings.atPulumiAws.gameliftGameSessionQueueMod.GameSessionQueueArgs
import typings.atPulumiAws.gameliftGameSessionQueueMod.GameSessionQueueState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "gamelift")
@js.native
object gameliftNs extends js.Object {
  @js.native
  class Alias protected ()
    extends typings.atPulumiAws.gameliftMod.Alias {
    /**
      * Create a Alias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AliasArgs) = this()
    def this(name: String, args: AliasArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Build protected ()
    extends typings.atPulumiAws.gameliftMod.Build {
    /**
      * Create a Build resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BuildArgs) = this()
    def this(name: String, args: BuildArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Fleet protected ()
    extends typings.atPulumiAws.gameliftMod.Fleet {
    /**
      * Create a Fleet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FleetArgs) = this()
    def this(name: String, args: FleetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class GameSessionQueue protected ()
    extends typings.atPulumiAws.gameliftMod.GameSessionQueue {
    /**
      * Create a GameSessionQueue resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: GameSessionQueueArgs) = this()
    def this(name: String, args: GameSessionQueueArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Alias extends js.Object {
    /**
      * Get an existing Alias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.gameliftAliasMod.Alias = js.native
    def get(name: String, id: Input[ID], state: AliasState): typings.atPulumiAws.gameliftAliasMod.Alias = js.native
    def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): typings.atPulumiAws.gameliftAliasMod.Alias = js.native
    /**
      * Returns true if the given object is an instance of Alias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/alias.Alias */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Build extends js.Object {
    /**
      * Get an existing Build resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.gameliftBuildMod.Build = js.native
    def get(name: String, id: Input[ID], state: BuildState): typings.atPulumiAws.gameliftBuildMod.Build = js.native
    def get(name: String, id: Input[ID], state: BuildState, opts: CustomResourceOptions): typings.atPulumiAws.gameliftBuildMod.Build = js.native
    /**
      * Returns true if the given object is an instance of Build.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/build.Build */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Fleet extends js.Object {
    /**
      * Get an existing Fleet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.gameliftFleetMod.Fleet = js.native
    def get(name: String, id: Input[ID], state: FleetState): typings.atPulumiAws.gameliftFleetMod.Fleet = js.native
    def get(name: String, id: Input[ID], state: FleetState, opts: CustomResourceOptions): typings.atPulumiAws.gameliftFleetMod.Fleet = js.native
    /**
      * Returns true if the given object is an instance of Fleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/fleet.Fleet */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object GameSessionQueue extends js.Object {
    /**
      * Get an existing GameSessionQueue resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.gameliftGameSessionQueueMod.GameSessionQueue = js.native
    def get(name: String, id: Input[ID], state: GameSessionQueueState): typings.atPulumiAws.gameliftGameSessionQueueMod.GameSessionQueue = js.native
    def get(name: String, id: Input[ID], state: GameSessionQueueState, opts: CustomResourceOptions): typings.atPulumiAws.gameliftGameSessionQueueMod.GameSessionQueue = js.native
    /**
      * Returns true if the given object is an instance of GameSessionQueue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/gameSessionQueue.GameSessionQueue */ Boolean = js.native
  }
  
}

