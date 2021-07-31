package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.workspaces.GetWorkspaceWorkspaceProperty
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getWorkspaceMod {
  
  @JSImport("@pulumi/aws/workspaces/getWorkspace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getWorkspace(): js.Promise[GetWorkspaceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")().asInstanceOf[js.Promise[GetWorkspaceResult]]
  @scala.inline
  def getWorkspace(args: Unit, opts: InvokeOptions): js.Promise[GetWorkspaceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetWorkspaceResult]]
  @scala.inline
  def getWorkspace(args: GetWorkspaceArgs): js.Promise[GetWorkspaceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetWorkspaceResult]]
  @scala.inline
  def getWorkspace(args: GetWorkspaceArgs, opts: InvokeOptions): js.Promise[GetWorkspaceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetWorkspaceResult]]
  
  trait GetWorkspaceArgs extends StObject {
    
    /**
      * The ID of the directory for the WorkSpace. You have to specify `userName` along with `directoryId`. You cannot combine this parameter with `workspaceId`.
      */
    val directoryId: js.UndefOr[String] = js.undefined
    
    /**
      * The tags for the WorkSpace.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The user name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace. You cannot combine this parameter with `workspaceId`.
      */
    val userName: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the WorkSpace. You cannot combine this parameter with `directoryId`.
      */
    val workspaceId: js.UndefOr[String] = js.undefined
  }
  object GetWorkspaceArgs {
    
    @scala.inline
    def apply(): GetWorkspaceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetWorkspaceArgs]
    }
    
    @scala.inline
    implicit class GetWorkspaceArgsMutableBuilder[Self <: GetWorkspaceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectoryId(value: String): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryIdUndefined: Self = StObject.set(x, "directoryId", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
      
      @scala.inline
      def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
    }
  }
  
  trait GetWorkspaceResult extends StObject {
    
    val bundleId: String
    
    /**
      * The name of the WorkSpace, as seen by the operating system.
      */
    val computerName: String
    
    val directoryId: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The IP address of the WorkSpace.
      */
    val ipAddress: String
    
    val rootVolumeEncryptionEnabled: Boolean
    
    /**
      * The operational state of the WorkSpace.
      */
    val state: String
    
    val tags: StringDictionary[String]
    
    val userName: String
    
    val userVolumeEncryptionEnabled: Boolean
    
    val volumeEncryptionKey: String
    
    val workspaceId: String
    
    val workspaceProperties: js.Array[GetWorkspaceWorkspaceProperty]
  }
  object GetWorkspaceResult {
    
    @scala.inline
    def apply(
      bundleId: String,
      computerName: String,
      directoryId: String,
      id: String,
      ipAddress: String,
      rootVolumeEncryptionEnabled: Boolean,
      state: String,
      tags: StringDictionary[String],
      userName: String,
      userVolumeEncryptionEnabled: Boolean,
      volumeEncryptionKey: String,
      workspaceId: String,
      workspaceProperties: js.Array[GetWorkspaceWorkspaceProperty]
    ): GetWorkspaceResult = {
      val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], computerName = computerName.asInstanceOf[js.Any], directoryId = directoryId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userVolumeEncryptionEnabled = userVolumeEncryptionEnabled.asInstanceOf[js.Any], volumeEncryptionKey = volumeEncryptionKey.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any], workspaceProperties = workspaceProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetWorkspaceResult]
    }
    
    @scala.inline
    implicit class GetWorkspaceResultMutableBuilder[Self <: GetWorkspaceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputerName(value: String): Self = StObject.set(x, "computerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryId(value: String): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootVolumeEncryptionEnabled(value: Boolean): Self = StObject.set(x, "rootVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserVolumeEncryptionEnabled(value: Boolean): Self = StObject.set(x, "userVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeEncryptionKey(value: String): Self = StObject.set(x, "volumeEncryptionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceProperties(value: js.Array[GetWorkspaceWorkspaceProperty]): Self = StObject.set(x, "workspaceProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspacePropertiesVarargs(value: GetWorkspaceWorkspaceProperty*): Self = StObject.set(x, "workspaceProperties", js.Array(value :_*))
    }
  }
}
