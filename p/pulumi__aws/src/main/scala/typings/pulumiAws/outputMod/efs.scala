package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object efs {
  
  @js.native
  trait AccessPointPosixUser extends StObject {
    
    /**
      * The POSIX group ID used for all file system operations using this access point.
      */
    var gid: Double = js.native
    
    /**
      * Secondary POSIX group IDs used for all file system operations using this access point.
      */
    var secondaryGids: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * The POSIX user ID used for all file system operations using this access point.
      */
    var uid: Double = js.native
  }
  object AccessPointPosixUser {
    
    @scala.inline
    def apply(gid: Double, uid: Double): AccessPointPosixUser = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessPointPosixUser]
    }
    
    @scala.inline
    implicit class AccessPointPosixUserMutableBuilder[Self <: AccessPointPosixUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryGids(value: js.Array[Double]): Self = StObject.set(x, "secondaryGids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryGidsUndefined: Self = StObject.set(x, "secondaryGids", js.undefined)
      
      @scala.inline
      def setSecondaryGidsVarargs(value: Double*): Self = StObject.set(x, "secondaryGids", js.Array(value :_*))
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccessPointRootDirectory extends StObject {
    
    /**
      * Specifies the POSIX IDs and permissions to apply to the access point's Root Directory. See Creation Info below.
      */
    var creationInfo: AccessPointRootDirectoryCreationInfo = js.native
    
    /**
      * Specifies the path on the EFS file system to expose as the root directory to NFS clients using the access point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not exist, you are required to provide `creationInfo`.
      */
    var path: String = js.native
  }
  object AccessPointRootDirectory {
    
    @scala.inline
    def apply(creationInfo: AccessPointRootDirectoryCreationInfo, path: String): AccessPointRootDirectory = {
      val __obj = js.Dynamic.literal(creationInfo = creationInfo.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessPointRootDirectory]
    }
    
    @scala.inline
    implicit class AccessPointRootDirectoryMutableBuilder[Self <: AccessPointRootDirectory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationInfo(value: AccessPointRootDirectoryCreationInfo): Self = StObject.set(x, "creationInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccessPointRootDirectoryCreationInfo extends StObject {
    
    /**
      * Specifies the POSIX group ID to apply to the `rootDirectory`.
      */
    var ownerGid: Double = js.native
    
    /**
      * Specifies the POSIX user ID to apply to the `rootDirectory`.
      */
    var ownerUid: Double = js.native
    
    /**
      * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file's mode bits.
      */
    var permissions: String = js.native
  }
  object AccessPointRootDirectoryCreationInfo {
    
    @scala.inline
    def apply(ownerGid: Double, ownerUid: Double, permissions: String): AccessPointRootDirectoryCreationInfo = {
      val __obj = js.Dynamic.literal(ownerGid = ownerGid.asInstanceOf[js.Any], ownerUid = ownerUid.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessPointRootDirectoryCreationInfo]
    }
    
    @scala.inline
    implicit class AccessPointRootDirectoryCreationInfoMutableBuilder[Self <: AccessPointRootDirectoryCreationInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOwnerGid(value: Double): Self = StObject.set(x, "ownerGid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUid(value: Double): Self = StObject.set(x, "ownerUid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissions(value: String): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileSystemLifecyclePolicy extends StObject {
    
    /**
      * Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_7_DAYS`, `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
      */
    var transitionToIa: String = js.native
  }
  object FileSystemLifecyclePolicy {
    
    @scala.inline
    def apply(transitionToIa: String): FileSystemLifecyclePolicy = {
      val __obj = js.Dynamic.literal(transitionToIa = transitionToIa.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSystemLifecyclePolicy]
    }
    
    @scala.inline
    implicit class FileSystemLifecyclePolicyMutableBuilder[Self <: FileSystemLifecyclePolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransitionToIa(value: String): Self = StObject.set(x, "transitionToIa", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetAccessPointPosixUser extends StObject {
    
    /**
      * Group ID
      */
    var gid: Double = js.native
    
    /**
      * Secondary group IDs
      */
    var secondaryGids: js.Array[Double] = js.native
    
    /**
      * User Id
      * * `rootDirectory`- Single element list containing information on the directory on the Amazon EFS file system that the access point provides access to.
      */
    var uid: Double = js.native
  }
  object GetAccessPointPosixUser {
    
    @scala.inline
    def apply(gid: Double, secondaryGids: js.Array[Double], uid: Double): GetAccessPointPosixUser = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], secondaryGids = secondaryGids.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessPointPosixUser]
    }
    
    @scala.inline
    implicit class GetAccessPointPosixUserMutableBuilder[Self <: GetAccessPointPosixUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryGids(value: js.Array[Double]): Self = StObject.set(x, "secondaryGids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryGidsVarargs(value: Double*): Self = StObject.set(x, "secondaryGids", js.Array(value :_*))
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetAccessPointRootDirectory extends StObject {
    
    /**
      * Single element list containing information on the creation permissions of the directory
      */
    var creationInfos: js.Array[GetAccessPointRootDirectoryCreationInfo] = js.native
    
    /**
      * Path exposed as the root directory
      */
    var path: String = js.native
  }
  object GetAccessPointRootDirectory {
    
    @scala.inline
    def apply(creationInfos: js.Array[GetAccessPointRootDirectoryCreationInfo], path: String): GetAccessPointRootDirectory = {
      val __obj = js.Dynamic.literal(creationInfos = creationInfos.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessPointRootDirectory]
    }
    
    @scala.inline
    implicit class GetAccessPointRootDirectoryMutableBuilder[Self <: GetAccessPointRootDirectory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationInfos(value: js.Array[GetAccessPointRootDirectoryCreationInfo]): Self = StObject.set(x, "creationInfos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationInfosVarargs(value: GetAccessPointRootDirectoryCreationInfo*): Self = StObject.set(x, "creationInfos", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetAccessPointRootDirectoryCreationInfo extends StObject {
    
    /**
      * POSIX owner group ID
      */
    var ownerGid: Double = js.native
    
    /**
      * POSIX owner user ID
      */
    var ownerUid: Double = js.native
    
    /**
      * POSIX permissions mode
      */
    var permissions: String = js.native
  }
  object GetAccessPointRootDirectoryCreationInfo {
    
    @scala.inline
    def apply(ownerGid: Double, ownerUid: Double, permissions: String): GetAccessPointRootDirectoryCreationInfo = {
      val __obj = js.Dynamic.literal(ownerGid = ownerGid.asInstanceOf[js.Any], ownerUid = ownerUid.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessPointRootDirectoryCreationInfo]
    }
    
    @scala.inline
    implicit class GetAccessPointRootDirectoryCreationInfoMutableBuilder[Self <: GetAccessPointRootDirectoryCreationInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOwnerGid(value: Double): Self = StObject.set(x, "ownerGid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUid(value: Double): Self = StObject.set(x, "ownerUid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissions(value: String): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetFileSystemLifecyclePolicy extends StObject {
    
    var transitionToIa: String = js.native
  }
  object GetFileSystemLifecyclePolicy {
    
    @scala.inline
    def apply(transitionToIa: String): GetFileSystemLifecyclePolicy = {
      val __obj = js.Dynamic.literal(transitionToIa = transitionToIa.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFileSystemLifecyclePolicy]
    }
    
    @scala.inline
    implicit class GetFileSystemLifecyclePolicyMutableBuilder[Self <: GetFileSystemLifecyclePolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransitionToIa(value: String): Self = StObject.set(x, "transitionToIa", value.asInstanceOf[js.Any])
    }
  }
}
