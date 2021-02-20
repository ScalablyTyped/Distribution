package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storagegateway {
  
  @js.native
  trait GatewaySmbActiveDirectorySettings extends StObject {
    
    /**
      * The name of the domain that you want the gateway to join.
      */
    var domainName: Input[String] = js.native
    
    /**
      * The password of the user who has permission to add the gateway to the Active Directory domain.
      */
    var password: Input[String] = js.native
    
    /**
      * The user name of user who has permission to add the gateway to the Active Directory domain.
      */
    var username: Input[String] = js.native
  }
  object GatewaySmbActiveDirectorySettings {
    
    @scala.inline
    def apply(domainName: Input[String], password: Input[String], username: Input[String]): GatewaySmbActiveDirectorySettings = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewaySmbActiveDirectorySettings]
    }
    
    @scala.inline
    implicit class GatewaySmbActiveDirectorySettingsMutableBuilder[Self <: GatewaySmbActiveDirectorySettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NfsFileShareCacheAttributes extends StObject {
    
    /**
      * Refreshes a file share's cache by using Time To Live (TTL).
      * TTL is the length of time since the last refresh after which access to the directory would cause the file gateway
      * to first refresh that directory's contents from the Amazon S3 bucket. Valid Values: 300 to 2,592,000 seconds (5 minutes to 30 days)
      */
    var cacheStaleTimeoutInSeconds: js.UndefOr[Input[Double]] = js.native
  }
  object NfsFileShareCacheAttributes {
    
    @scala.inline
    def apply(): NfsFileShareCacheAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NfsFileShareCacheAttributes]
    }
    
    @scala.inline
    implicit class NfsFileShareCacheAttributesMutableBuilder[Self <: NfsFileShareCacheAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheStaleTimeoutInSeconds(value: Input[Double]): Self = StObject.set(x, "cacheStaleTimeoutInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheStaleTimeoutInSecondsUndefined: Self = StObject.set(x, "cacheStaleTimeoutInSeconds", js.undefined)
    }
  }
  
  @js.native
  trait NfsFileShareNfsFileShareDefaults extends StObject {
    
    /**
      * The Unix directory mode in the string form "nnnn". Defaults to `"0777"`.
      */
    var directoryMode: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Unix file mode in the string form "nnnn". Defaults to `"0666"`.
      */
    var fileMode: js.UndefOr[Input[String]] = js.native
    
    /**
      * The default group ID for the file share (unless the files have another group ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
      */
    var groupId: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The default owner ID for the file share (unless the files have another owner ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
      */
    var ownerId: js.UndefOr[Input[Double]] = js.native
  }
  object NfsFileShareNfsFileShareDefaults {
    
    @scala.inline
    def apply(): NfsFileShareNfsFileShareDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NfsFileShareNfsFileShareDefaults]
    }
    
    @scala.inline
    implicit class NfsFileShareNfsFileShareDefaultsMutableBuilder[Self <: NfsFileShareNfsFileShareDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectoryMode(value: Input[String]): Self = StObject.set(x, "directoryMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryModeUndefined: Self = StObject.set(x, "directoryMode", js.undefined)
      
      @scala.inline
      def setFileMode(value: Input[String]): Self = StObject.set(x, "fileMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileModeUndefined: Self = StObject.set(x, "fileMode", js.undefined)
      
      @scala.inline
      def setGroupId(value: Input[Double]): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      @scala.inline
      def setOwnerId(value: Input[Double]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    }
  }
  
  @js.native
  trait SmbFileShareCacheAttributes extends StObject {
    
    /**
      * Refreshes a file share's cache by using Time To Live (TTL).
      * TTL is the length of time since the last refresh after which access to the directory would cause the file gateway
      * to first refresh that directory's contents from the Amazon S3 bucket. Valid Values: 300 to 2,592,000 seconds (5 minutes to 30 days)
      */
    var cacheStaleTimeoutInSeconds: js.UndefOr[Input[Double]] = js.native
  }
  object SmbFileShareCacheAttributes {
    
    @scala.inline
    def apply(): SmbFileShareCacheAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmbFileShareCacheAttributes]
    }
    
    @scala.inline
    implicit class SmbFileShareCacheAttributesMutableBuilder[Self <: SmbFileShareCacheAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheStaleTimeoutInSeconds(value: Input[Double]): Self = StObject.set(x, "cacheStaleTimeoutInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheStaleTimeoutInSecondsUndefined: Self = StObject.set(x, "cacheStaleTimeoutInSeconds", js.undefined)
    }
  }
}
