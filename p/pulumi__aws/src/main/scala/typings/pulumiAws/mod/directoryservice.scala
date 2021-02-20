package typings.pulumiAws.mod

import typings.pulumiAws.conditionalForwaderMod.ConditionalForwaderArgs
import typings.pulumiAws.conditionalForwaderMod.ConditionalForwaderState
import typings.pulumiAws.directoryMod.DirectoryArgs
import typings.pulumiAws.directoryMod.DirectoryState
import typings.pulumiAws.getDirectoryMod.GetDirectoryArgs
import typings.pulumiAws.getDirectoryMod.GetDirectoryResult
import typings.pulumiAws.logServiceMod.LogServiceArgs
import typings.pulumiAws.logServiceMod.LogServiceState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directoryservice {
  
  @JSImport("@pulumi/aws", "directoryservice.ConditionalForwader")
  @js.native
  class ConditionalForwader protected ()
    extends typings.pulumiAws.directoryserviceMod.ConditionalForwader {
    /**
      * Create a ConditionalForwader resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConditionalForwaderArgs) = this()
    def this(name: String, args: ConditionalForwaderArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ConditionalForwader {
    
    /**
      * Get an existing ConditionalForwader resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "directoryservice.ConditionalForwader.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.conditionalForwaderMod.ConditionalForwader = js.native
    @JSImport("@pulumi/aws", "directoryservice.ConditionalForwader.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.conditionalForwaderMod.ConditionalForwader = js.native
    @JSImport("@pulumi/aws", "directoryservice.ConditionalForwader.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConditionalForwaderState): typings.pulumiAws.conditionalForwaderMod.ConditionalForwader = js.native
    @JSImport("@pulumi/aws", "directoryservice.ConditionalForwader.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConditionalForwaderState, opts: CustomResourceOptions): typings.pulumiAws.conditionalForwaderMod.ConditionalForwader = js.native
    
    /**
      * Returns true if the given object is an instance of ConditionalForwader.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "directoryservice.ConditionalForwader.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/conditionalForwader.ConditionalForwader */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "directoryservice.Directory")
  @js.native
  class Directory protected ()
    extends typings.pulumiAws.directoryserviceMod.Directory {
    /**
      * Create a Directory resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DirectoryArgs) = this()
    def this(name: String, args: DirectoryArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Directory {
    
    /**
      * Get an existing Directory resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "directoryservice.Directory.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.directoryMod.Directory = js.native
    @JSImport("@pulumi/aws", "directoryservice.Directory.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.directoryMod.Directory = js.native
    @JSImport("@pulumi/aws", "directoryservice.Directory.get")
    @js.native
    def get(name: String, id: Input[ID], state: DirectoryState): typings.pulumiAws.directoryMod.Directory = js.native
    @JSImport("@pulumi/aws", "directoryservice.Directory.get")
    @js.native
    def get(name: String, id: Input[ID], state: DirectoryState, opts: CustomResourceOptions): typings.pulumiAws.directoryMod.Directory = js.native
    
    /**
      * Returns true if the given object is an instance of Directory.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "directoryservice.Directory.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/directory.Directory */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "directoryservice.LogService")
  @js.native
  class LogService protected ()
    extends typings.pulumiAws.directoryserviceMod.LogService {
    /**
      * Create a LogService resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogServiceArgs) = this()
    def this(name: String, args: LogServiceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LogService {
    
    /**
      * Get an existing LogService resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "directoryservice.LogService.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.logServiceMod.LogService = js.native
    @JSImport("@pulumi/aws", "directoryservice.LogService.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.logServiceMod.LogService = js.native
    @JSImport("@pulumi/aws", "directoryservice.LogService.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogServiceState): typings.pulumiAws.logServiceMod.LogService = js.native
    @JSImport("@pulumi/aws", "directoryservice.LogService.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogServiceState, opts: CustomResourceOptions): typings.pulumiAws.logServiceMod.LogService = js.native
    
    /**
      * Returns true if the given object is an instance of LogService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "directoryservice.LogService.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/logService.LogService */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "directoryservice.getDirectory")
  @js.native
  def getDirectory(args: GetDirectoryArgs): js.Promise[GetDirectoryResult] = js.native
  @JSImport("@pulumi/aws", "directoryservice.getDirectory")
  @js.native
  def getDirectory(args: GetDirectoryArgs, opts: InvokeOptions): js.Promise[GetDirectoryResult] = js.native
}
