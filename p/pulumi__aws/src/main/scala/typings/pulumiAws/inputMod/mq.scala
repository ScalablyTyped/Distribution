package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mq {
  
  trait BrokerConfiguration extends StObject {
    
    /**
      * The Configuration ID.
      */
    var id: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Revision of the Configuration.
      */
    var revision: js.UndefOr[Input[Double]] = js.undefined
  }
  object BrokerConfiguration {
    
    inline def apply(): BrokerConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrokerConfiguration]
    }
    
    extension [Self <: BrokerConfiguration](x: Self) {
      
      inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRevision(value: Input[Double]): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    }
  }
  
  trait BrokerEncryptionOptions extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of Key Management Service (KMS) Customer Master Key (CMK) to use for encryption at rest. Requires setting `useAwsOwnedKey` to `false`. To perform drift detection when AWS managed CMKs or customer managed CMKs are in use, this value must be configured.
      */
    var kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Boolean to enable an AWS owned Key Management Service (KMS) Customer Master Key (CMK) that is not in your account. Defaults to `true`. Setting to `false` without configuring `kmsKeyId` will create an AWS managed Customer Master Key (CMK) aliased to `aws/mq` in your account.
      */
    var useAwsOwnedKey: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object BrokerEncryptionOptions {
    
    inline def apply(): BrokerEncryptionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrokerEncryptionOptions]
    }
    
    extension [Self <: BrokerEncryptionOptions](x: Self) {
      
      inline def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      inline def setUseAwsOwnedKey(value: Input[Boolean]): Self = StObject.set(x, "useAwsOwnedKey", value.asInstanceOf[js.Any])
      
      inline def setUseAwsOwnedKeyUndefined: Self = StObject.set(x, "useAwsOwnedKey", js.undefined)
    }
  }
  
  trait BrokerInstance extends StObject {
    
    var consoleUrl: js.UndefOr[Input[String]] = js.undefined
    
    var endpoints: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    var ipAddress: js.UndefOr[Input[String]] = js.undefined
  }
  object BrokerInstance {
    
    inline def apply(): BrokerInstance = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrokerInstance]
    }
    
    extension [Self <: BrokerInstance](x: Self) {
      
      inline def setConsoleUrl(value: Input[String]): Self = StObject.set(x, "consoleUrl", value.asInstanceOf[js.Any])
      
      inline def setConsoleUrlUndefined: Self = StObject.set(x, "consoleUrl", js.undefined)
      
      inline def setEndpoints(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
      
      inline def setEndpointsVarargs(value: Input[String]*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
      
      inline def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    }
  }
  
  trait BrokerLogs extends StObject {
    
    /**
      * Enables audit logging. User management action made using JMX or the ActiveMQ Web Console is logged. Defaults to `false`.
      */
    var audit: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Enables general logging via CloudWatch. Defaults to `false`.
      */
    var general: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object BrokerLogs {
    
    inline def apply(): BrokerLogs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrokerLogs]
    }
    
    extension [Self <: BrokerLogs](x: Self) {
      
      inline def setAudit(value: Input[Boolean]): Self = StObject.set(x, "audit", value.asInstanceOf[js.Any])
      
      inline def setAuditUndefined: Self = StObject.set(x, "audit", js.undefined)
      
      inline def setGeneral(value: Input[Boolean]): Self = StObject.set(x, "general", value.asInstanceOf[js.Any])
      
      inline def setGeneralUndefined: Self = StObject.set(x, "general", js.undefined)
    }
  }
  
  trait BrokerMaintenanceWindowStartTime extends StObject {
    
    /**
      * The day of the week. e.g. `MONDAY`, `TUESDAY`, or `WEDNESDAY`
      */
    var dayOfWeek: Input[String]
    
    /**
      * The time, in 24-hour format. e.g. `02:00`
      */
    var timeOfDay: Input[String]
    
    /**
      * The time zone, UTC by default, in either the Country/City format, or the UTC offset format. e.g. `CET`
      */
    var timeZone: Input[String]
  }
  object BrokerMaintenanceWindowStartTime {
    
    inline def apply(dayOfWeek: Input[String], timeOfDay: Input[String], timeZone: Input[String]): BrokerMaintenanceWindowStartTime = {
      val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any], timeOfDay = timeOfDay.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerMaintenanceWindowStartTime]
    }
    
    extension [Self <: BrokerMaintenanceWindowStartTime](x: Self) {
      
      inline def setDayOfWeek(value: Input[String]): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setTimeOfDay(value: Input[String]): Self = StObject.set(x, "timeOfDay", value.asInstanceOf[js.Any])
      
      inline def setTimeZone(value: Input[String]): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    }
  }
  
  trait BrokerUser extends StObject {
    
    /**
      * Whether to enable access to the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) for the user.
      */
    var consoleAccess: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The list of groups (20 maximum) to which the ActiveMQ user belongs.
      */
    var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The password of the user. It must be 12 to 250 characters long, at least 4 unique characters, and must not contain commas.
      */
    var password: Input[String]
    
    /**
      * The username of the user.
      */
    var username: Input[String]
  }
  object BrokerUser {
    
    inline def apply(password: Input[String], username: Input[String]): BrokerUser = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerUser]
    }
    
    extension [Self <: BrokerUser](x: Self) {
      
      inline def setConsoleAccess(value: Input[Boolean]): Self = StObject.set(x, "consoleAccess", value.asInstanceOf[js.Any])
      
      inline def setConsoleAccessUndefined: Self = StObject.set(x, "consoleAccess", js.undefined)
      
      inline def setGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      inline def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetBrokerLogs extends StObject {
    
    var audit: js.UndefOr[Boolean] = js.undefined
    
    var general: js.UndefOr[Boolean] = js.undefined
  }
  object GetBrokerLogs {
    
    inline def apply(): GetBrokerLogs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetBrokerLogs]
    }
    
    extension [Self <: GetBrokerLogs](x: Self) {
      
      inline def setAudit(value: Boolean): Self = StObject.set(x, "audit", value.asInstanceOf[js.Any])
      
      inline def setAuditUndefined: Self = StObject.set(x, "audit", js.undefined)
      
      inline def setGeneral(value: Boolean): Self = StObject.set(x, "general", value.asInstanceOf[js.Any])
      
      inline def setGeneralUndefined: Self = StObject.set(x, "general", js.undefined)
    }
  }
}
