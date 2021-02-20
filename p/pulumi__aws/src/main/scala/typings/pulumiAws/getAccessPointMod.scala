package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.efs.GetAccessPointPosixUser
import typings.pulumiAws.outputMod.efs.GetAccessPointRootDirectory
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAccessPointMod {
  
  @JSImport("@pulumi/aws/efs/getAccessPoint", "getAccessPoint")
  @js.native
  def getAccessPoint(args: GetAccessPointArgs): js.Promise[GetAccessPointResult] = js.native
  @JSImport("@pulumi/aws/efs/getAccessPoint", "getAccessPoint")
  @js.native
  def getAccessPoint(args: GetAccessPointArgs, opts: InvokeOptions): js.Promise[GetAccessPointResult] = js.native
  
  @js.native
  trait GetAccessPointArgs extends StObject {
    
    /**
      * The ID that identifies the file system.
      */
    val accessPointId: String = js.native
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetAccessPointArgs {
    
    @scala.inline
    def apply(accessPointId: String): GetAccessPointArgs = {
      val __obj = js.Dynamic.literal(accessPointId = accessPointId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessPointArgs]
    }
    
    @scala.inline
    implicit class GetAccessPointArgsMutableBuilder[Self <: GetAccessPointArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPointId(value: String): Self = StObject.set(x, "accessPointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetAccessPointResult extends StObject {
    
    val accessPointId: String = js.native
    
    /**
      * Amazon Resource Name of the file system.
      */
    val arn: String = js.native
    
    /**
      * Amazon Resource Name of the file system.
      */
    val fileSystemArn: String = js.native
    
    /**
      * The ID of the file system for which the access point is intended.
      */
    val fileSystemId: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val ownerId: String = js.native
    
    /**
      * Single element list containing operating system user and group applied to all file system requests made using the access point.
      */
    val posixUsers: js.Array[GetAccessPointPosixUser] = js.native
    
    val rootDirectories: js.Array[GetAccessPointRootDirectory] = js.native
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetAccessPointResult {
    
    @scala.inline
    def apply(
      accessPointId: String,
      arn: String,
      fileSystemArn: String,
      fileSystemId: String,
      id: String,
      ownerId: String,
      posixUsers: js.Array[GetAccessPointPosixUser],
      rootDirectories: js.Array[GetAccessPointRootDirectory]
    ): GetAccessPointResult = {
      val __obj = js.Dynamic.literal(accessPointId = accessPointId.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], fileSystemArn = fileSystemArn.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], posixUsers = posixUsers.asInstanceOf[js.Any], rootDirectories = rootDirectories.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessPointResult]
    }
    
    @scala.inline
    implicit class GetAccessPointResultMutableBuilder[Self <: GetAccessPointResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPointId(value: String): Self = StObject.set(x, "accessPointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemArn(value: String): Self = StObject.set(x, "fileSystemArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosixUsers(value: js.Array[GetAccessPointPosixUser]): Self = StObject.set(x, "posixUsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosixUsersVarargs(value: GetAccessPointPosixUser*): Self = StObject.set(x, "posixUsers", js.Array(value :_*))
      
      @scala.inline
      def setRootDirectories(value: js.Array[GetAccessPointRootDirectory]): Self = StObject.set(x, "rootDirectories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirectoriesVarargs(value: GetAccessPointRootDirectory*): Self = StObject.set(x, "rootDirectories", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
