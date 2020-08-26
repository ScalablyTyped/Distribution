package typings.pulumiAws.mod

import typings.pulumiAws.getRepositoryMod.GetRepositoryArgs
import typings.pulumiAws.getRepositoryMod.GetRepositoryResult
import typings.pulumiAws.repositoryMod.RepositoryArgs
import typings.pulumiAws.repositoryMod.RepositoryState
import typings.pulumiAws.triggerMod.TriggerArgs
import typings.pulumiAws.triggerMod.TriggerState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "codecommit")
@js.native
object codecommit extends js.Object {
  @js.native
  class Repository protected ()
    extends typings.pulumiAws.codecommitMod.Repository {
    /**
      * Create a Repository resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RepositoryArgs) = this()
    def this(name: String, args: RepositoryArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Trigger protected ()
    extends typings.pulumiAws.codecommitMod.Trigger {
    /**
      * Create a Trigger resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TriggerArgs) = this()
    def this(name: String, args: TriggerArgs, opts: CustomResourceOptions) = this()
  }
  
  def getRepository(args: GetRepositoryArgs): js.Promise[GetRepositoryResult] = js.native
  def getRepository(args: GetRepositoryArgs, opts: InvokeOptions): js.Promise[GetRepositoryResult] = js.native
  /* static members */
  @js.native
  object Repository extends js.Object {
    /**
      * Get an existing Repository resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.repositoryMod.Repository = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.repositoryMod.Repository = js.native
    def get(name: String, id: Input[ID], state: RepositoryState): typings.pulumiAws.repositoryMod.Repository = js.native
    def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): typings.pulumiAws.repositoryMod.Repository = js.native
    /**
      * Returns true if the given object is an instance of Repository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codecommit/repository.Repository */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Trigger extends js.Object {
    /**
      * Get an existing Trigger resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.triggerMod.Trigger = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.triggerMod.Trigger = js.native
    def get(name: String, id: Input[ID], state: TriggerState): typings.pulumiAws.triggerMod.Trigger = js.native
    def get(name: String, id: Input[ID], state: TriggerState, opts: CustomResourceOptions): typings.pulumiAws.triggerMod.Trigger = js.native
    /**
      * Returns true if the given object is an instance of Trigger.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codecommit/trigger.Trigger */ Boolean = js.native
  }
  
}

