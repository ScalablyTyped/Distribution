package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storagegateway {
  
  trait GatewaySmbActiveDirectorySettings extends StObject {
    
    /**
      * The name of the domain that you want the gateway to join.
      */
    var domainName: String
    
    /**
      * The password of the user who has permission to add the gateway to the Active Directory domain.
      */
    var password: String
    
    /**
      * The user name of user who has permission to add the gateway to the Active Directory domain.
      */
    var username: String
  }
  object GatewaySmbActiveDirectorySettings {
    
    inline def apply(domainName: String, password: String, username: String): GatewaySmbActiveDirectorySettings = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewaySmbActiveDirectorySettings]
    }
    
    extension [Self <: GatewaySmbActiveDirectorySettings](x: Self) {
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait NfsFileShareCacheAttributes extends StObject {
    
    /**
      * Refreshes a file share's cache by using Time To Live (TTL).
      * TTL is the length of time since the last refresh after which access to the directory would cause the file gateway
      * to first refresh that directory's contents from the Amazon S3 bucket. Valid Values: 300 to 2,592,000 seconds (5 minutes to 30 days)
      */
    var cacheStaleTimeoutInSeconds: js.UndefOr[Double] = js.undefined
  }
  object NfsFileShareCacheAttributes {
    
    inline def apply(): NfsFileShareCacheAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NfsFileShareCacheAttributes]
    }
    
    extension [Self <: NfsFileShareCacheAttributes](x: Self) {
      
      inline def setCacheStaleTimeoutInSeconds(value: Double): Self = StObject.set(x, "cacheStaleTimeoutInSeconds", value.asInstanceOf[js.Any])
      
      inline def setCacheStaleTimeoutInSecondsUndefined: Self = StObject.set(x, "cacheStaleTimeoutInSeconds", js.undefined)
    }
  }
  
  trait NfsFileShareNfsFileShareDefaults extends StObject {
    
    /**
      * The Unix directory mode in the string form "nnnn". Defaults to `"0777"`.
      */
    var directoryMode: js.UndefOr[String] = js.undefined
    
    /**
      * The Unix file mode in the string form "nnnn". Defaults to `"0666"`.
      */
    var fileMode: js.UndefOr[String] = js.undefined
    
    /**
      * The default group ID for the file share (unless the files have another group ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
      */
    var groupId: js.UndefOr[Double] = js.undefined
    
    /**
      * The default owner ID for the file share (unless the files have another owner ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
      */
    var ownerId: js.UndefOr[Double] = js.undefined
  }
  object NfsFileShareNfsFileShareDefaults {
    
    inline def apply(): NfsFileShareNfsFileShareDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NfsFileShareNfsFileShareDefaults]
    }
    
    extension [Self <: NfsFileShareNfsFileShareDefaults](x: Self) {
      
      inline def setDirectoryMode(value: String): Self = StObject.set(x, "directoryMode", value.asInstanceOf[js.Any])
      
      inline def setDirectoryModeUndefined: Self = StObject.set(x, "directoryMode", js.undefined)
      
      inline def setFileMode(value: String): Self = StObject.set(x, "fileMode", value.asInstanceOf[js.Any])
      
      inline def setFileModeUndefined: Self = StObject.set(x, "fileMode", js.undefined)
      
      inline def setGroupId(value: Double): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      inline def setOwnerId(value: Double): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    }
  }
  
  trait SmbFileShareCacheAttributes extends StObject {
    
    /**
      * Refreshes a file share's cache by using Time To Live (TTL).
      * TTL is the length of time since the last refresh after which access to the directory would cause the file gateway
      * to first refresh that directory's contents from the Amazon S3 bucket. Valid Values: 300 to 2,592,000 seconds (5 minutes to 30 days)
      */
    var cacheStaleTimeoutInSeconds: js.UndefOr[Double] = js.undefined
  }
  object SmbFileShareCacheAttributes {
    
    inline def apply(): SmbFileShareCacheAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmbFileShareCacheAttributes]
    }
    
    extension [Self <: SmbFileShareCacheAttributes](x: Self) {
      
      inline def setCacheStaleTimeoutInSeconds(value: Double): Self = StObject.set(x, "cacheStaleTimeoutInSeconds", value.asInstanceOf[js.Any])
      
      inline def setCacheStaleTimeoutInSecondsUndefined: Self = StObject.set(x, "cacheStaleTimeoutInSeconds", js.undefined)
    }
  }
}
