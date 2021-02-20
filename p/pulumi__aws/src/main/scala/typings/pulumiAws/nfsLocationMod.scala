package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.datasync.NfsLocationOnPremConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nfsLocationMod {
  
  @JSImport("@pulumi/aws/datasync/nfsLocation", "NfsLocation")
  @js.native
  class NfsLocation protected () extends CustomResource {
    /**
      * Create a NfsLocation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NfsLocationArgs) = this()
    def this(name: String, args: NfsLocationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Location.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Configuration block containing information for connecting to the NFS File System.
      */
    val onPremConfig: Output_[NfsLocationOnPremConfig] = js.native
    
    /**
      * Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
      */
    val serverHostname: Output_[String] = js.native
    
    /**
      * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
      */
    val subdirectory: Output_[String] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    val uri: Output_[String] = js.native
  }
  /* static members */
  object NfsLocation {
    
    /**
      * Get an existing NfsLocation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/datasync/nfsLocation", "NfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID]): NfsLocation = js.native
    @JSImport("@pulumi/aws/datasync/nfsLocation", "NfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NfsLocation = js.native
    @JSImport("@pulumi/aws/datasync/nfsLocation", "NfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID], state: NfsLocationState): NfsLocation = js.native
    @JSImport("@pulumi/aws/datasync/nfsLocation", "NfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID], state: NfsLocationState, opts: CustomResourceOptions): NfsLocation = js.native
    
    /**
      * Returns true if the given object is an instance of NfsLocation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/datasync/nfsLocation", "NfsLocation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/nfsLocation.NfsLocation */ Boolean = js.native
  }
  
  @js.native
  trait NfsLocationArgs extends StObject {
    
    /**
      * Configuration block containing information for connecting to the NFS File System.
      */
    val onPremConfig: Input[typings.pulumiAws.inputMod.datasync.NfsLocationOnPremConfig] = js.native
    
    /**
      * Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
      */
    val serverHostname: Input[String] = js.native
    
    /**
      * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
      */
    val subdirectory: Input[String] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object NfsLocationArgs {
    
    @scala.inline
    def apply(
      onPremConfig: Input[typings.pulumiAws.inputMod.datasync.NfsLocationOnPremConfig],
      serverHostname: Input[String],
      subdirectory: Input[String]
    ): NfsLocationArgs = {
      val __obj = js.Dynamic.literal(onPremConfig = onPremConfig.asInstanceOf[js.Any], serverHostname = serverHostname.asInstanceOf[js.Any], subdirectory = subdirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[NfsLocationArgs]
    }
    
    @scala.inline
    implicit class NfsLocationArgsMutableBuilder[Self <: NfsLocationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnPremConfig(value: Input[typings.pulumiAws.inputMod.datasync.NfsLocationOnPremConfig]): Self = StObject.set(x, "onPremConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerHostname(value: Input[String]): Self = StObject.set(x, "serverHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdirectory(value: Input[String]): Self = StObject.set(x, "subdirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait NfsLocationState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Location.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block containing information for connecting to the NFS File System.
      */
    val onPremConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.datasync.NfsLocationOnPremConfig]] = js.native
    
    /**
      * Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
      */
    val serverHostname: js.UndefOr[Input[String]] = js.native
    
    /**
      * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
      */
    val subdirectory: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    val uri: js.UndefOr[Input[String]] = js.native
  }
  object NfsLocationState {
    
    @scala.inline
    def apply(): NfsLocationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NfsLocationState]
    }
    
    @scala.inline
    implicit class NfsLocationStateMutableBuilder[Self <: NfsLocationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setOnPremConfig(value: Input[typings.pulumiAws.inputMod.datasync.NfsLocationOnPremConfig]): Self = StObject.set(x, "onPremConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPremConfigUndefined: Self = StObject.set(x, "onPremConfig", js.undefined)
      
      @scala.inline
      def setServerHostname(value: Input[String]): Self = StObject.set(x, "serverHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerHostnameUndefined: Self = StObject.set(x, "serverHostname", js.undefined)
      
      @scala.inline
      def setSubdirectory(value: Input[String]): Self = StObject.set(x, "subdirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdirectoryUndefined: Self = StObject.set(x, "subdirectory", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUri(value: Input[String]): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
