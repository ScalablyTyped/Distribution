package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.gamelift.BuildStorageLocation
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("@pulumi/aws/gamelift/build", "Build")
  @js.native
  class Build protected () extends CustomResource {
    /**
      * Create a Build resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BuildArgs) = this()
    def this(name: String, args: BuildArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Gamelift Build ARN.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Name of the build
      */
    val name: Output_[String] = js.native
    
    /**
      * Operating system that the game server binaries are built to run on. e.g. `WINDOWS_2012` or `AMAZON_LINUX`.
      */
    val operatingSystem: Output_[String] = js.native
    
    /**
      * Information indicating where your game build files are stored. See below.
      */
    val storageLocation: Output_[BuildStorageLocation] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Version that is associated with this build.
      */
    val version: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Build {
    
    @JSImport("@pulumi/aws/gamelift/build", "Build")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Build resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Build = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Build]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Build = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Build]
    @scala.inline
    def get(name: String, id: Input[ID], state: BuildState): Build = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Build]
    @scala.inline
    def get(name: String, id: Input[ID], state: BuildState, opts: CustomResourceOptions): Build = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Build]
    
    /**
      * Returns true if the given object is an instance of Build.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/build.Build */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/gamelift/build.Build */ Boolean]
  }
  
  trait BuildArgs extends StObject {
    
    /**
      * Name of the build
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Operating system that the game server binaries are built to run on. e.g. `WINDOWS_2012` or `AMAZON_LINUX`.
      */
    val operatingSystem: Input[String]
    
    /**
      * Information indicating where your game build files are stored. See below.
      */
    val storageLocation: Input[typings.pulumiAws.inputMod.gamelift.BuildStorageLocation]
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Version that is associated with this build.
      */
    val version: js.UndefOr[Input[String]] = js.undefined
  }
  object BuildArgs {
    
    @scala.inline
    def apply(
      operatingSystem: Input[String],
      storageLocation: Input[typings.pulumiAws.inputMod.gamelift.BuildStorageLocation]
    ): BuildArgs = {
      val __obj = js.Dynamic.literal(operatingSystem = operatingSystem.asInstanceOf[js.Any], storageLocation = storageLocation.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildArgs]
    }
    
    @scala.inline
    implicit class BuildArgsMutableBuilder[Self <: BuildArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOperatingSystem(value: Input[String]): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageLocation(value: Input[typings.pulumiAws.inputMod.gamelift.BuildStorageLocation]): Self = StObject.set(x, "storageLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait BuildState extends StObject {
    
    /**
      * Gamelift Build ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the build
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Operating system that the game server binaries are built to run on. e.g. `WINDOWS_2012` or `AMAZON_LINUX`.
      */
    val operatingSystem: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Information indicating where your game build files are stored. See below.
      */
    val storageLocation: js.UndefOr[Input[typings.pulumiAws.inputMod.gamelift.BuildStorageLocation]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Version that is associated with this build.
      */
    val version: js.UndefOr[Input[String]] = js.undefined
  }
  object BuildState {
    
    @scala.inline
    def apply(): BuildState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildState]
    }
    
    @scala.inline
    implicit class BuildStateMutableBuilder[Self <: BuildState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOperatingSystem(value: Input[String]): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
      
      @scala.inline
      def setStorageLocation(value: Input[typings.pulumiAws.inputMod.gamelift.BuildStorageLocation]): Self = StObject.set(x, "storageLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageLocationUndefined: Self = StObject.set(x, "storageLocation", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
