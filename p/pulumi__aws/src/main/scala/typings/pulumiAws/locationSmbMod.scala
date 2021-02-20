package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.datasync.LocationSmbMountOptions
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationSmbMod {
  
  @JSImport("@pulumi/aws/datasync/locationSmb", "LocationSmb")
  @js.native
  class LocationSmb protected () extends CustomResource {
    /**
      * Create a LocationSmb resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LocationSmbArgs) = this()
    def this(name: String, args: LocationSmbArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A list of DataSync Agent ARNs with which this location will be associated.
      */
    val agentArns: Output_[js.Array[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Location.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the Windows domain the SMB server belongs to.
      */
    val domain: Output_[String] = js.native
    
    /**
      * Configuration block containing mount options used by DataSync to access the SMB Server. Can be `AUTOMATIC`, `SMB2`, or `SMB3`.
      */
    val mountOptions: Output_[js.UndefOr[LocationSmbMountOptions]] = js.native
    
    /**
      * The password of the user who can mount the share and has file permissions in the SMB.
      */
    val password: Output_[String] = js.native
    
    /**
      * Specifies the IP address or DNS name of the SMB server. The DataSync Agent(s) use this to mount the SMB share.
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
    
    /**
      * The user who can mount the share and has file and folder permissions in the SMB share.
      */
    val user: Output_[String] = js.native
  }
  /* static members */
  object LocationSmb {
    
    /**
      * Get an existing LocationSmb resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/datasync/locationSmb", "LocationSmb.get")
    @js.native
    def get(name: String, id: Input[ID]): LocationSmb = js.native
    @JSImport("@pulumi/aws/datasync/locationSmb", "LocationSmb.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LocationSmb = js.native
    @JSImport("@pulumi/aws/datasync/locationSmb", "LocationSmb.get")
    @js.native
    def get(name: String, id: Input[ID], state: LocationSmbState): LocationSmb = js.native
    @JSImport("@pulumi/aws/datasync/locationSmb", "LocationSmb.get")
    @js.native
    def get(name: String, id: Input[ID], state: LocationSmbState, opts: CustomResourceOptions): LocationSmb = js.native
    
    /**
      * Returns true if the given object is an instance of LocationSmb.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/datasync/locationSmb", "LocationSmb.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/locationSmb.LocationSmb */ Boolean = js.native
  }
  
  @js.native
  trait LocationSmbArgs extends StObject {
    
    /**
      * A list of DataSync Agent ARNs with which this location will be associated.
      */
    val agentArns: Input[js.Array[Input[String]]] = js.native
    
    /**
      * The name of the Windows domain the SMB server belongs to.
      */
    val domain: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block containing mount options used by DataSync to access the SMB Server. Can be `AUTOMATIC`, `SMB2`, or `SMB3`.
      */
    val mountOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.datasync.LocationSmbMountOptions]] = js.native
    
    /**
      * The password of the user who can mount the share and has file permissions in the SMB.
      */
    val password: Input[String] = js.native
    
    /**
      * Specifies the IP address or DNS name of the SMB server. The DataSync Agent(s) use this to mount the SMB share.
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
    
    /**
      * The user who can mount the share and has file and folder permissions in the SMB share.
      */
    val user: Input[String] = js.native
  }
  object LocationSmbArgs {
    
    @scala.inline
    def apply(
      agentArns: Input[js.Array[Input[String]]],
      password: Input[String],
      serverHostname: Input[String],
      subdirectory: Input[String],
      user: Input[String]
    ): LocationSmbArgs = {
      val __obj = js.Dynamic.literal(agentArns = agentArns.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], serverHostname = serverHostname.asInstanceOf[js.Any], subdirectory = subdirectory.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationSmbArgs]
    }
    
    @scala.inline
    implicit class LocationSmbArgsMutableBuilder[Self <: LocationSmbArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgentArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "agentArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentArnsVarargs(value: Input[String]*): Self = StObject.set(x, "agentArns", js.Array(value :_*))
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setMountOptions(value: Input[typings.pulumiAws.inputMod.datasync.LocationSmbMountOptions]): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountOptionsUndefined: Self = StObject.set(x, "mountOptions", js.undefined)
      
      @scala.inline
      def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerHostname(value: Input[String]): Self = StObject.set(x, "serverHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdirectory(value: Input[String]): Self = StObject.set(x, "subdirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocationSmbState extends StObject {
    
    /**
      * A list of DataSync Agent ARNs with which this location will be associated.
      */
    val agentArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Location.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the Windows domain the SMB server belongs to.
      */
    val domain: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block containing mount options used by DataSync to access the SMB Server. Can be `AUTOMATIC`, `SMB2`, or `SMB3`.
      */
    val mountOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.datasync.LocationSmbMountOptions]] = js.native
    
    /**
      * The password of the user who can mount the share and has file permissions in the SMB.
      */
    val password: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the IP address or DNS name of the SMB server. The DataSync Agent(s) use this to mount the SMB share.
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
    
    /**
      * The user who can mount the share and has file and folder permissions in the SMB share.
      */
    val user: js.UndefOr[Input[String]] = js.native
  }
  object LocationSmbState {
    
    @scala.inline
    def apply(): LocationSmbState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationSmbState]
    }
    
    @scala.inline
    implicit class LocationSmbStateMutableBuilder[Self <: LocationSmbState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgentArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "agentArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentArnsUndefined: Self = StObject.set(x, "agentArns", js.undefined)
      
      @scala.inline
      def setAgentArnsVarargs(value: Input[String]*): Self = StObject.set(x, "agentArns", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setMountOptions(value: Input[typings.pulumiAws.inputMod.datasync.LocationSmbMountOptions]): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountOptionsUndefined: Self = StObject.set(x, "mountOptions", js.undefined)
      
      @scala.inline
      def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
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
      
      @scala.inline
      def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
