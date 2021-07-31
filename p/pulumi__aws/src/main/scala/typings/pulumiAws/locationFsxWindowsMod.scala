package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationFsxWindowsMod {
  
  @JSImport("@pulumi/aws/datasync/locationFsxWindows", "LocationFsxWindows")
  @js.native
  class LocationFsxWindows protected () extends CustomResource {
    /**
      * Create a LocationFsxWindows resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LocationFsxWindowsArgs) = this()
    def this(name: String, args: LocationFsxWindowsArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Location.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The time that the FSx for Windows location was created.
      */
    val creationTime: Output_[String] = js.native
    
    /**
      * The name of the Windows domain that the FSx for Windows server belongs to.
      */
    val domain: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) for the FSx for Windows file system.
      */
    val fsxFilesystemArn: Output_[String] = js.native
    
    /**
      * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
      */
    val password: Output_[String] = js.native
    
    /**
      * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
      */
    val securityGroupArns: Output_[js.Array[String]] = js.native
    
    /**
      * Subdirectory to perform actions as source or destination.
      */
    val subdirectory: Output_[String] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The URL of the FSx for Windows location that was described.
      */
    val uri: Output_[String] = js.native
    
    /**
      * The user who has the permissions to access files and folders in the FSx for Windows file system.
      */
    val user: Output_[String] = js.native
  }
  /* static members */
  object LocationFsxWindows {
    
    @JSImport("@pulumi/aws/datasync/locationFsxWindows", "LocationFsxWindows")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LocationFsxWindows resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): LocationFsxWindows = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LocationFsxWindows]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LocationFsxWindows = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LocationFsxWindows]
    @scala.inline
    def get(name: String, id: Input[ID], state: LocationFsxWindowsState): LocationFsxWindows = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LocationFsxWindows]
    @scala.inline
    def get(name: String, id: Input[ID], state: LocationFsxWindowsState, opts: CustomResourceOptions): LocationFsxWindows = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LocationFsxWindows]
    
    /**
      * Returns true if the given object is an instance of LocationFsxWindows.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/locationFsxWindows.LocationFsxWindows */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/datasync/locationFsxWindows.LocationFsxWindows */ Boolean]
  }
  
  trait LocationFsxWindowsArgs extends StObject {
    
    /**
      * The name of the Windows domain that the FSx for Windows server belongs to.
      */
    val domain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) for the FSx for Windows file system.
      */
    val fsxFilesystemArn: Input[String]
    
    /**
      * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
      */
    val password: Input[String]
    
    /**
      * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
      */
    val securityGroupArns: Input[js.Array[Input[String]]]
    
    /**
      * Subdirectory to perform actions as source or destination.
      */
    val subdirectory: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The user who has the permissions to access files and folders in the FSx for Windows file system.
      */
    val user: Input[String]
  }
  object LocationFsxWindowsArgs {
    
    @scala.inline
    def apply(
      fsxFilesystemArn: Input[String],
      password: Input[String],
      securityGroupArns: Input[js.Array[Input[String]]],
      user: Input[String]
    ): LocationFsxWindowsArgs = {
      val __obj = js.Dynamic.literal(fsxFilesystemArn = fsxFilesystemArn.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], securityGroupArns = securityGroupArns.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationFsxWindowsArgs]
    }
    
    @scala.inline
    implicit class LocationFsxWindowsArgsMutableBuilder[Self <: LocationFsxWindowsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setFsxFilesystemArn(value: Input[String]): Self = StObject.set(x, "fsxFilesystemArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupArnsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupArns", js.Array(value :_*))
      
      @scala.inline
      def setSubdirectory(value: Input[String]): Self = StObject.set(x, "subdirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdirectoryUndefined: Self = StObject.set(x, "subdirectory", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocationFsxWindowsState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Location.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The time that the FSx for Windows location was created.
      */
    val creationTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the Windows domain that the FSx for Windows server belongs to.
      */
    val domain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) for the FSx for Windows file system.
      */
    val fsxFilesystemArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
      */
    val password: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
      */
    val securityGroupArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Subdirectory to perform actions as source or destination.
      */
    val subdirectory: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Location.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The URL of the FSx for Windows location that was described.
      */
    val uri: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The user who has the permissions to access files and folders in the FSx for Windows file system.
      */
    val user: js.UndefOr[Input[String]] = js.undefined
  }
  object LocationFsxWindowsState {
    
    @scala.inline
    def apply(): LocationFsxWindowsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationFsxWindowsState]
    }
    
    @scala.inline
    implicit class LocationFsxWindowsStateMutableBuilder[Self <: LocationFsxWindowsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCreationTime(value: Input[String]): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setFsxFilesystemArn(value: Input[String]): Self = StObject.set(x, "fsxFilesystemArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsxFilesystemArnUndefined: Self = StObject.set(x, "fsxFilesystemArn", js.undefined)
      
      @scala.inline
      def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setSecurityGroupArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupArnsUndefined: Self = StObject.set(x, "securityGroupArns", js.undefined)
      
      @scala.inline
      def setSecurityGroupArnsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupArns", js.Array(value :_*))
      
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
