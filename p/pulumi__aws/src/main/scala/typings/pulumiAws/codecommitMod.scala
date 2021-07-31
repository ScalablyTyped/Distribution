package typings.pulumiAws

import typings.pulumiAws.codecommitRepositoryMod.RepositoryArgs
import typings.pulumiAws.codecommitRepositoryMod.RepositoryState
import typings.pulumiAws.getRepositoryMod.GetRepositoryArgs
import typings.pulumiAws.getRepositoryMod.GetRepositoryResult
import typings.pulumiAws.triggerMod.TriggerArgs
import typings.pulumiAws.triggerMod.TriggerState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codecommitMod {
  
  @JSImport("@pulumi/aws/codecommit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/codecommit", "Repository")
  @js.native
  class Repository protected ()
    extends typings.pulumiAws.codecommitRepositoryMod.Repository {
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
  /* static members */
  object Repository {
    
    @JSImport("@pulumi/aws/codecommit", "Repository")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Repository resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.codecommitRepositoryMod.Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.codecommitRepositoryMod.Repository]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.codecommitRepositoryMod.Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.codecommitRepositoryMod.Repository]
    @scala.inline
    def get(name: String, id: Input[ID], state: RepositoryState): typings.pulumiAws.codecommitRepositoryMod.Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.codecommitRepositoryMod.Repository]
    @scala.inline
    def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): typings.pulumiAws.codecommitRepositoryMod.Repository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.codecommitRepositoryMod.Repository]
    
    /**
      * Returns true if the given object is an instance of Repository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codecommit/repository.Repository */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codecommit/repository.Repository */ Boolean]
  }
  
  @JSImport("@pulumi/aws/codecommit", "Trigger")
  @js.native
  class Trigger protected ()
    extends typings.pulumiAws.triggerMod.Trigger {
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
  /* static members */
  object Trigger {
    
    @JSImport("@pulumi/aws/codecommit", "Trigger")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Trigger resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.triggerMod.Trigger = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.triggerMod.Trigger]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.triggerMod.Trigger = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.triggerMod.Trigger]
    @scala.inline
    def get(name: String, id: Input[ID], state: TriggerState): typings.pulumiAws.triggerMod.Trigger = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.triggerMod.Trigger]
    @scala.inline
    def get(name: String, id: Input[ID], state: TriggerState, opts: CustomResourceOptions): typings.pulumiAws.triggerMod.Trigger = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.triggerMod.Trigger]
    
    /**
      * Returns true if the given object is an instance of Trigger.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codecommit/trigger.Trigger */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codecommit/trigger.Trigger */ Boolean]
  }
  
  @scala.inline
  def getRepository(args: GetRepositoryArgs): js.Promise[GetRepositoryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepository")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRepositoryResult]]
  @scala.inline
  def getRepository(args: GetRepositoryArgs, opts: InvokeOptions): js.Promise[GetRepositoryResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRepository")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRepositoryResult]]
}
