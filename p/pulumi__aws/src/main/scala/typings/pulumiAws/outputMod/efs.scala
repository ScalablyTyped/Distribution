package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object efs {
  
  trait AccessPointPosixUser extends StObject {
    
    /**
      * The POSIX group ID used for all file system operations using this access point.
      */
    var gid: Double
    
    /**
      * Secondary POSIX group IDs used for all file system operations using this access point.
      */
    var secondaryGids: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The POSIX user ID used for all file system operations using this access point.
      */
    var uid: Double
  }
  object AccessPointPosixUser {
    
    inline def apply(gid: Double, uid: Double): AccessPointPosixUser = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessPointPosixUser]
    }
    
    extension [Self <: AccessPointPosixUser](x: Self) {
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setSecondaryGids(value: js.Array[Double]): Self = StObject.set(x, "secondaryGids", value.asInstanceOf[js.Any])
      
      inline def setSecondaryGidsUndefined: Self = StObject.set(x, "secondaryGids", js.undefined)
      
      inline def setSecondaryGidsVarargs(value: Double*): Self = StObject.set(x, "secondaryGids", js.Array(value :_*))
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccessPointRootDirectory extends StObject {
    
    /**
      * Specifies the POSIX IDs and permissions to apply to the access point's Root Directory. See Creation Info below.
      */
    var creationInfo: AccessPointRootDirectoryCreationInfo
    
    /**
      * Specifies the path on the EFS file system to expose as the root directory to NFS clients using the access point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not exist, you are required to provide `creationInfo`.
      */
    var path: String
  }
  object AccessPointRootDirectory {
    
    inline def apply(creationInfo: AccessPointRootDirectoryCreationInfo, path: String): AccessPointRootDirectory = {
      val __obj = js.Dynamic.literal(creationInfo = creationInfo.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessPointRootDirectory]
    }
    
    extension [Self <: AccessPointRootDirectory](x: Self) {
      
      inline def setCreationInfo(value: AccessPointRootDirectoryCreationInfo): Self = StObject.set(x, "creationInfo", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccessPointRootDirectoryCreationInfo extends StObject {
    
    /**
      * Specifies the POSIX group ID to apply to the `rootDirectory`.
      */
    var ownerGid: Double
    
    /**
      * Specifies the POSIX user ID to apply to the `rootDirectory`.
      */
    var ownerUid: Double
    
    /**
      * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file's mode bits.
      */
    var permissions: String
  }
  object AccessPointRootDirectoryCreationInfo {
    
    inline def apply(ownerGid: Double, ownerUid: Double, permissions: String): AccessPointRootDirectoryCreationInfo = {
      val __obj = js.Dynamic.literal(ownerGid = ownerGid.asInstanceOf[js.Any], ownerUid = ownerUid.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessPointRootDirectoryCreationInfo]
    }
    
    extension [Self <: AccessPointRootDirectoryCreationInfo](x: Self) {
      
      inline def setOwnerGid(value: Double): Self = StObject.set(x, "ownerGid", value.asInstanceOf[js.Any])
      
      inline def setOwnerUid(value: Double): Self = StObject.set(x, "ownerUid", value.asInstanceOf[js.Any])
      
      inline def setPermissions(value: String): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileSystemLifecyclePolicy extends StObject {
    
    /**
      * Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_7_DAYS`, `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
      */
    var transitionToIa: String
  }
  object FileSystemLifecyclePolicy {
    
    inline def apply(transitionToIa: String): FileSystemLifecyclePolicy = {
      val __obj = js.Dynamic.literal(transitionToIa = transitionToIa.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSystemLifecyclePolicy]
    }
    
    extension [Self <: FileSystemLifecyclePolicy](x: Self) {
      
      inline def setTransitionToIa(value: String): Self = StObject.set(x, "transitionToIa", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetAccessPointPosixUser extends StObject {
    
    /**
      * Group ID
      */
    var gid: Double
    
    /**
      * Secondary group IDs
      */
    var secondaryGids: js.Array[Double]
    
    /**
      * User Id
      * * `rootDirectory`- Single element list containing information on the directory on the Amazon EFS file system that the access point provides access to.
      */
    var uid: Double
  }
  object GetAccessPointPosixUser {
    
    inline def apply(gid: Double, secondaryGids: js.Array[Double], uid: Double): GetAccessPointPosixUser = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], secondaryGids = secondaryGids.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessPointPosixUser]
    }
    
    extension [Self <: GetAccessPointPosixUser](x: Self) {
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setSecondaryGids(value: js.Array[Double]): Self = StObject.set(x, "secondaryGids", value.asInstanceOf[js.Any])
      
      inline def setSecondaryGidsVarargs(value: Double*): Self = StObject.set(x, "secondaryGids", js.Array(value :_*))
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetAccessPointRootDirectory extends StObject {
    
    /**
      * Single element list containing information on the creation permissions of the directory
      */
    var creationInfos: js.Array[GetAccessPointRootDirectoryCreationInfo]
    
    /**
      * Path exposed as the root directory
      */
    var path: String
  }
  object GetAccessPointRootDirectory {
    
    inline def apply(creationInfos: js.Array[GetAccessPointRootDirectoryCreationInfo], path: String): GetAccessPointRootDirectory = {
      val __obj = js.Dynamic.literal(creationInfos = creationInfos.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessPointRootDirectory]
    }
    
    extension [Self <: GetAccessPointRootDirectory](x: Self) {
      
      inline def setCreationInfos(value: js.Array[GetAccessPointRootDirectoryCreationInfo]): Self = StObject.set(x, "creationInfos", value.asInstanceOf[js.Any])
      
      inline def setCreationInfosVarargs(value: GetAccessPointRootDirectoryCreationInfo*): Self = StObject.set(x, "creationInfos", js.Array(value :_*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetAccessPointRootDirectoryCreationInfo extends StObject {
    
    /**
      * POSIX owner group ID
      */
    var ownerGid: Double
    
    /**
      * POSIX owner user ID
      */
    var ownerUid: Double
    
    /**
      * POSIX permissions mode
      */
    var permissions: String
  }
  object GetAccessPointRootDirectoryCreationInfo {
    
    inline def apply(ownerGid: Double, ownerUid: Double, permissions: String): GetAccessPointRootDirectoryCreationInfo = {
      val __obj = js.Dynamic.literal(ownerGid = ownerGid.asInstanceOf[js.Any], ownerUid = ownerUid.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessPointRootDirectoryCreationInfo]
    }
    
    extension [Self <: GetAccessPointRootDirectoryCreationInfo](x: Self) {
      
      inline def setOwnerGid(value: Double): Self = StObject.set(x, "ownerGid", value.asInstanceOf[js.Any])
      
      inline def setOwnerUid(value: Double): Self = StObject.set(x, "ownerUid", value.asInstanceOf[js.Any])
      
      inline def setPermissions(value: String): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetFileSystemLifecyclePolicy extends StObject {
    
    var transitionToIa: String
  }
  object GetFileSystemLifecyclePolicy {
    
    inline def apply(transitionToIa: String): GetFileSystemLifecyclePolicy = {
      val __obj = js.Dynamic.literal(transitionToIa = transitionToIa.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFileSystemLifecyclePolicy]
    }
    
    extension [Self <: GetFileSystemLifecyclePolicy](x: Self) {
      
      inline def setTransitionToIa(value: String): Self = StObject.set(x, "transitionToIa", value.asInstanceOf[js.Any])
    }
  }
}
