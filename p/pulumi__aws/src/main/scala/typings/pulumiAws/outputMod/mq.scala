package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mq {
  
  @js.native
  trait BrokerConfiguration extends StObject {
    
    /**
      * The Configuration ID.
      */
    var id: String = js.native
    
    /**
      * Revision of the Configuration.
      */
    var revision: Double = js.native
  }
  object BrokerConfiguration {
    
    @scala.inline
    def apply(id: String, revision: Double): BrokerConfiguration = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerConfiguration]
    }
    
    @scala.inline
    implicit class BrokerConfigurationMutableBuilder[Self <: BrokerConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BrokerEncryptionOptions extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of Key Management Service (KMS) Customer Master Key (CMK) to use for encryption at rest. Requires setting `useAwsOwnedKey` to `false`. To perform drift detection when AWS managed CMKs or customer managed CMKs are in use, this value must be configured.
      */
    var kmsKeyId: String = js.native
    
    /**
      * Boolean to enable an AWS owned Key Management Service (KMS) Customer Master Key (CMK) that is not in your account. Defaults to `true`. Setting to `false` without configuring `kmsKeyId` will create an AWS managed Customer Master Key (CMK) aliased to `aws/mq` in your account.
      */
    var useAwsOwnedKey: js.UndefOr[Boolean] = js.native
  }
  object BrokerEncryptionOptions {
    
    @scala.inline
    def apply(kmsKeyId: String): BrokerEncryptionOptions = {
      val __obj = js.Dynamic.literal(kmsKeyId = kmsKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerEncryptionOptions]
    }
    
    @scala.inline
    implicit class BrokerEncryptionOptionsMutableBuilder[Self <: BrokerEncryptionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAwsOwnedKey(value: Boolean): Self = StObject.set(x, "useAwsOwnedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAwsOwnedKeyUndefined: Self = StObject.set(x, "useAwsOwnedKey", js.undefined)
    }
  }
  
  @js.native
  trait BrokerInstance extends StObject {
    
    var consoleUrl: String = js.native
    
    var endpoints: js.Array[String] = js.native
    
    var ipAddress: String = js.native
  }
  object BrokerInstance {
    
    @scala.inline
    def apply(consoleUrl: String, endpoints: js.Array[String], ipAddress: String): BrokerInstance = {
      val __obj = js.Dynamic.literal(consoleUrl = consoleUrl.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerInstance]
    }
    
    @scala.inline
    implicit class BrokerInstanceMutableBuilder[Self <: BrokerInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsoleUrl(value: String): Self = StObject.set(x, "consoleUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoints(value: js.Array[String]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsVarargs(value: String*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
      
      @scala.inline
      def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BrokerLogs extends StObject {
    
    /**
      * Enables audit logging. User management action made using JMX or the ActiveMQ Web Console is logged. Defaults to `false`.
      */
    var audit: js.UndefOr[Boolean] = js.native
    
    /**
      * Enables general logging via CloudWatch. Defaults to `false`.
      */
    var general: js.UndefOr[Boolean] = js.native
  }
  object BrokerLogs {
    
    @scala.inline
    def apply(): BrokerLogs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrokerLogs]
    }
    
    @scala.inline
    implicit class BrokerLogsMutableBuilder[Self <: BrokerLogs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudit(value: Boolean): Self = StObject.set(x, "audit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuditUndefined: Self = StObject.set(x, "audit", js.undefined)
      
      @scala.inline
      def setGeneral(value: Boolean): Self = StObject.set(x, "general", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneralUndefined: Self = StObject.set(x, "general", js.undefined)
    }
  }
  
  @js.native
  trait BrokerMaintenanceWindowStartTime extends StObject {
    
    /**
      * The day of the week. e.g. `MONDAY`, `TUESDAY`, or `WEDNESDAY`
      */
    var dayOfWeek: String = js.native
    
    /**
      * The time, in 24-hour format. e.g. `02:00`
      */
    var timeOfDay: String = js.native
    
    /**
      * The time zone, UTC by default, in either the Country/City format, or the UTC offset format. e.g. `CET`
      */
    var timeZone: String = js.native
  }
  object BrokerMaintenanceWindowStartTime {
    
    @scala.inline
    def apply(dayOfWeek: String, timeOfDay: String, timeZone: String): BrokerMaintenanceWindowStartTime = {
      val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any], timeOfDay = timeOfDay.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerMaintenanceWindowStartTime]
    }
    
    @scala.inline
    implicit class BrokerMaintenanceWindowStartTimeMutableBuilder[Self <: BrokerMaintenanceWindowStartTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeOfDay(value: String): Self = StObject.set(x, "timeOfDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BrokerUser extends StObject {
    
    /**
      * Whether to enable access to the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) for the user.
      */
    var consoleAccess: js.UndefOr[Boolean] = js.native
    
    /**
      * The list of groups (20 maximum) to which the ActiveMQ user belongs.
      */
    var groups: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The password of the user. It must be 12 to 250 characters long, at least 4 unique characters, and must not contain commas.
      */
    var password: String = js.native
    
    /**
      * The username of the user.
      */
    var username: String = js.native
  }
  object BrokerUser {
    
    @scala.inline
    def apply(password: String, username: String): BrokerUser = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerUser]
    }
    
    @scala.inline
    implicit class BrokerUserMutableBuilder[Self <: BrokerUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsoleAccess(value: Boolean): Self = StObject.set(x, "consoleAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsoleAccessUndefined: Self = StObject.set(x, "consoleAccess", js.undefined)
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetBrokerConfiguration extends StObject {
    
    var id: String = js.native
    
    var revision: Double = js.native
  }
  object GetBrokerConfiguration {
    
    @scala.inline
    def apply(id: String, revision: Double): GetBrokerConfiguration = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBrokerConfiguration]
    }
    
    @scala.inline
    implicit class GetBrokerConfigurationMutableBuilder[Self <: GetBrokerConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetBrokerEncryptionOption extends StObject {
    
    var kmsKeyId: String = js.native
    
    var useAwsOwnedKey: Boolean = js.native
  }
  object GetBrokerEncryptionOption {
    
    @scala.inline
    def apply(kmsKeyId: String, useAwsOwnedKey: Boolean): GetBrokerEncryptionOption = {
      val __obj = js.Dynamic.literal(kmsKeyId = kmsKeyId.asInstanceOf[js.Any], useAwsOwnedKey = useAwsOwnedKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBrokerEncryptionOption]
    }
    
    @scala.inline
    implicit class GetBrokerEncryptionOptionMutableBuilder[Self <: GetBrokerEncryptionOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAwsOwnedKey(value: Boolean): Self = StObject.set(x, "useAwsOwnedKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetBrokerInstance extends StObject {
    
    var consoleUrl: String = js.native
    
    var endpoints: js.Array[String] = js.native
    
    var ipAddress: String = js.native
  }
  object GetBrokerInstance {
    
    @scala.inline
    def apply(consoleUrl: String, endpoints: js.Array[String], ipAddress: String): GetBrokerInstance = {
      val __obj = js.Dynamic.literal(consoleUrl = consoleUrl.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBrokerInstance]
    }
    
    @scala.inline
    implicit class GetBrokerInstanceMutableBuilder[Self <: GetBrokerInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsoleUrl(value: String): Self = StObject.set(x, "consoleUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoints(value: js.Array[String]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsVarargs(value: String*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
      
      @scala.inline
      def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetBrokerLogs extends StObject {
    
    var audit: Boolean = js.native
    
    var general: Boolean = js.native
  }
  object GetBrokerLogs {
    
    @scala.inline
    def apply(audit: Boolean, general: Boolean): GetBrokerLogs = {
      val __obj = js.Dynamic.literal(audit = audit.asInstanceOf[js.Any], general = general.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBrokerLogs]
    }
    
    @scala.inline
    implicit class GetBrokerLogsMutableBuilder[Self <: GetBrokerLogs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudit(value: Boolean): Self = StObject.set(x, "audit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneral(value: Boolean): Self = StObject.set(x, "general", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetBrokerMaintenanceWindowStartTime extends StObject {
    
    var dayOfWeek: String = js.native
    
    var timeOfDay: String = js.native
    
    var timeZone: String = js.native
  }
  object GetBrokerMaintenanceWindowStartTime {
    
    @scala.inline
    def apply(dayOfWeek: String, timeOfDay: String, timeZone: String): GetBrokerMaintenanceWindowStartTime = {
      val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any], timeOfDay = timeOfDay.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBrokerMaintenanceWindowStartTime]
    }
    
    @scala.inline
    implicit class GetBrokerMaintenanceWindowStartTimeMutableBuilder[Self <: GetBrokerMaintenanceWindowStartTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeOfDay(value: String): Self = StObject.set(x, "timeOfDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetBrokerUser extends StObject {
    
    var consoleAccess: Boolean = js.native
    
    var groups: js.Array[String] = js.native
    
    var username: String = js.native
  }
  object GetBrokerUser {
    
    @scala.inline
    def apply(consoleAccess: Boolean, groups: js.Array[String], username: String): GetBrokerUser = {
      val __obj = js.Dynamic.literal(consoleAccess = consoleAccess.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBrokerUser]
    }
    
    @scala.inline
    implicit class GetBrokerUserMutableBuilder[Self <: GetBrokerUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsoleAccess(value: Boolean): Self = StObject.set(x, "consoleAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
