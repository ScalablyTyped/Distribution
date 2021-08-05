package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.efs.GetAccessPointPosixUser
import typings.pulumiAws.outputMod.efs.GetAccessPointRootDirectory
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAccessPointMod {
  
  @JSImport("@pulumi/aws/efs/getAccessPoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAccessPoint(args: GetAccessPointArgs): js.Promise[GetAccessPointResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessPoint")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAccessPointResult]]
  inline def getAccessPoint(args: GetAccessPointArgs, opts: InvokeOptions): js.Promise[GetAccessPointResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAccessPoint")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAccessPointResult]]
  
  trait GetAccessPointArgs extends StObject {
    
    /**
      * The ID that identifies the file system.
      */
    val accessPointId: String
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetAccessPointArgs {
    
    inline def apply(accessPointId: String): GetAccessPointArgs = {
      val __obj = js.Dynamic.literal(accessPointId = accessPointId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessPointArgs]
    }
    
    extension [Self <: GetAccessPointArgs](x: Self) {
      
      inline def setAccessPointId(value: String): Self = StObject.set(x, "accessPointId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetAccessPointResult extends StObject {
    
    val accessPointId: String
    
    /**
      * Amazon Resource Name of the file system.
      */
    val arn: String
    
    /**
      * Amazon Resource Name of the file system.
      */
    val fileSystemArn: String
    
    /**
      * The ID of the file system for which the access point is intended.
      */
    val fileSystemId: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val ownerId: String
    
    /**
      * Single element list containing operating system user and group applied to all file system requests made using the access point.
      */
    val posixUsers: js.Array[GetAccessPointPosixUser]
    
    val rootDirectories: js.Array[GetAccessPointRootDirectory]
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetAccessPointResult {
    
    inline def apply(
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
    
    extension [Self <: GetAccessPointResult](x: Self) {
      
      inline def setAccessPointId(value: String): Self = StObject.set(x, "accessPointId", value.asInstanceOf[js.Any])
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setFileSystemArn(value: String): Self = StObject.set(x, "fileSystemArn", value.asInstanceOf[js.Any])
      
      inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setPosixUsers(value: js.Array[GetAccessPointPosixUser]): Self = StObject.set(x, "posixUsers", value.asInstanceOf[js.Any])
      
      inline def setPosixUsersVarargs(value: GetAccessPointPosixUser*): Self = StObject.set(x, "posixUsers", js.Array(value :_*))
      
      inline def setRootDirectories(value: js.Array[GetAccessPointRootDirectory]): Self = StObject.set(x, "rootDirectories", value.asInstanceOf[js.Any])
      
      inline def setRootDirectoriesVarargs(value: GetAccessPointRootDirectory*): Self = StObject.set(x, "rootDirectories", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
