package typings.snmpNative

import typings.snmpNative.mod.OID
import typings.snmpNative.snmpNativeNumbers.`0x02`
import typings.snmpNative.snmpNativeNumbers.`0x04`
import typings.snmpNative.snmpNativeNumbers.`0x05`
import typings.snmpNative.snmpNativeNumbers.`0x06`
import typings.snmpNative.snmpNativeNumbers.`0x30`
import typings.snmpNative.snmpNativeNumbers.`0x40`
import typings.snmpNative.snmpNativeNumbers.`0x41`
import typings.snmpNative.snmpNativeNumbers.`0x42`
import typings.snmpNative.snmpNativeNumbers.`0x43`
import typings.snmpNative.snmpNativeNumbers.`0x44`
import typings.snmpNative.snmpNativeNumbers.`0x45`
import typings.snmpNative.snmpNativeNumbers.`0x46`
import typings.snmpNative.snmpNativeNumbers.`0x80`
import typings.snmpNative.snmpNativeNumbers.`0x81`
import typings.snmpNative.snmpNativeNumbers.`0x82`
import typings.snmpNative.snmpNativeNumbers.`0xA0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  oid :snmp-native.snmp-native.OID} & snmp-native.snmp-native.Options */
  trait oidOIDOptions extends StObject {
    
    /**
      * The SNMP community name.
      */
    var community: js.UndefOr[String] = js.undefined
    
    /**
      * The host to send the request to. Any resolvable name is allowed in
      * addition to IP addresses.
      */
    var host: js.UndefOr[String] = js.undefined
    
    var oid: OID
    
    /**
      * The UDP port number to send the request to.
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * An array of timeout values. Values are times in milliseconds, the
      * length of the array is the total number of transmissions that will
      * occur. Defaults to four attempts with five seconds between each.
      *
      * Re-transmissions can be disabled by providing a single timeout
      * value.
      *
      *
      * @example
      * [ 5000 ] // Disable re-transmission
      *
      */
    var timeouts: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object oidOIDOptions {
    
    inline def apply(oid: OID): oidOIDOptions = {
      val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any])
      __obj.asInstanceOf[oidOIDOptions]
    }
    
    extension [Self <: oidOIDOptions](x: Self) {
      
      inline def setCommunity(value: String): Self = StObject.set(x, "community", value.asInstanceOf[js.Any])
      
      inline def setCommunityUndefined: Self = StObject.set(x, "community", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setOid(value: OID): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
      
      inline def setOidVarargs(value: Double*): Self = StObject.set(x, "oid", js.Array(value*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setTimeouts(value: js.Array[Double]): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
      
      inline def setTimeoutsUndefined: Self = StObject.set(x, "timeouts", js.undefined)
      
      inline def setTimeoutsVarargs(value: Double*): Self = StObject.set(x, "timeouts", js.Array(value*))
    }
  }
  
  /* Inlined {  oid :snmp-native.snmp-native.OID,   combinedTimeout :number | undefined} & snmp-native.snmp-native.Options */
  trait oidOIDcombinedTimeoutnumb extends StObject {
    
    var combinedTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The SNMP community name.
      */
    var community: js.UndefOr[String] = js.undefined
    
    /**
      * The host to send the request to. Any resolvable name is allowed in
      * addition to IP addresses.
      */
    var host: js.UndefOr[String] = js.undefined
    
    var oid: OID
    
    /**
      * The UDP port number to send the request to.
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * An array of timeout values. Values are times in milliseconds, the
      * length of the array is the total number of transmissions that will
      * occur. Defaults to four attempts with five seconds between each.
      *
      * Re-transmissions can be disabled by providing a single timeout
      * value.
      *
      *
      * @example
      * [ 5000 ] // Disable re-transmission
      *
      */
    var timeouts: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object oidOIDcombinedTimeoutnumb {
    
    inline def apply(oid: OID): oidOIDcombinedTimeoutnumb = {
      val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any])
      __obj.asInstanceOf[oidOIDcombinedTimeoutnumb]
    }
    
    extension [Self <: oidOIDcombinedTimeoutnumb](x: Self) {
      
      inline def setCombinedTimeout(value: Double): Self = StObject.set(x, "combinedTimeout", value.asInstanceOf[js.Any])
      
      inline def setCombinedTimeoutUndefined: Self = StObject.set(x, "combinedTimeout", js.undefined)
      
      inline def setCommunity(value: String): Self = StObject.set(x, "community", value.asInstanceOf[js.Any])
      
      inline def setCommunityUndefined: Self = StObject.set(x, "community", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setOid(value: OID): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
      
      inline def setOidVarargs(value: Double*): Self = StObject.set(x, "oid", js.Array(value*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setTimeouts(value: js.Array[Double]): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
      
      inline def setTimeoutsUndefined: Self = StObject.set(x, "timeouts", js.undefined)
      
      inline def setTimeoutsVarargs(value: Double*): Self = StObject.set(x, "timeouts", js.Array(value*))
    }
  }
  
  /* Inlined {  oid :snmp-native.snmp-native.OID,   type :snmp-native.snmp-native.DataTypes[keyof snmp-native.snmp-native.DataTypes] | null | undefined,   value :any | undefined} & snmp-native.snmp-native.Options */
  trait oidOIDtypeDataTypeskeyofD extends StObject {
    
    /**
      * The SNMP community name.
      */
    var community: js.UndefOr[String] = js.undefined
    
    /**
      * The host to send the request to. Any resolvable name is allowed in
      * addition to IP addresses.
      */
    var host: js.UndefOr[String] = js.undefined
    
    var oid: OID
    
    /**
      * The UDP port number to send the request to.
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * An array of timeout values. Values are times in milliseconds, the
      * length of the array is the total number of transmissions that will
      * occur. Defaults to four attempts with five seconds between each.
      *
      * Re-transmissions can be disabled by providing a single timeout
      * value.
      *
      *
      * @example
      * [ 5000 ] // Disable re-transmission
      *
      */
    var timeouts: js.UndefOr[js.Array[Double]] = js.undefined
    
    var `type`: js.UndefOr[
        `0x82` | `0x42` | `0x80` | `0x41` | `0xA0` | `0x02` | `0x30` | `0x44` | `0x46` | `0x45` | `0x06` | `0x43` | `0x05` | `0x04` | `0x40` | `0x81` | Null
      ] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object oidOIDtypeDataTypeskeyofD {
    
    inline def apply(oid: OID): oidOIDtypeDataTypeskeyofD = {
      val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any])
      __obj.asInstanceOf[oidOIDtypeDataTypeskeyofD]
    }
    
    extension [Self <: oidOIDtypeDataTypeskeyofD](x: Self) {
      
      inline def setCommunity(value: String): Self = StObject.set(x, "community", value.asInstanceOf[js.Any])
      
      inline def setCommunityUndefined: Self = StObject.set(x, "community", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setOid(value: OID): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
      
      inline def setOidVarargs(value: Double*): Self = StObject.set(x, "oid", js.Array(value*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setTimeouts(value: js.Array[Double]): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
      
      inline def setTimeoutsUndefined: Self = StObject.set(x, "timeouts", js.undefined)
      
      inline def setTimeoutsVarargs(value: Double*): Self = StObject.set(x, "timeouts", js.Array(value*))
      
      inline def setType(
        value: `0x82` | `0x42` | `0x80` | `0x41` | `0xA0` | `0x02` | `0x30` | `0x44` | `0x46` | `0x45` | `0x06` | `0x43` | `0x05` | `0x04` | `0x40` | `0x81`
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined {  oids :std.Array<snmp-native.snmp-native.OID>,   abortOnError :boolean | undefined,   combinedTimeout :number | undefined} & snmp-native.snmp-native.Options */
  trait oidsArrayOIDabortOnErrorb extends StObject {
    
    var abortOnError: js.UndefOr[Boolean] = js.undefined
    
    var combinedTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The SNMP community name.
      */
    var community: js.UndefOr[String] = js.undefined
    
    /**
      * The host to send the request to. Any resolvable name is allowed in
      * addition to IP addresses.
      */
    var host: js.UndefOr[String] = js.undefined
    
    var oids: js.Array[OID]
    
    /**
      * The UDP port number to send the request to.
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * An array of timeout values. Values are times in milliseconds, the
      * length of the array is the total number of transmissions that will
      * occur. Defaults to four attempts with five seconds between each.
      *
      * Re-transmissions can be disabled by providing a single timeout
      * value.
      *
      *
      * @example
      * [ 5000 ] // Disable re-transmission
      *
      */
    var timeouts: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object oidsArrayOIDabortOnErrorb {
    
    inline def apply(oids: js.Array[OID]): oidsArrayOIDabortOnErrorb = {
      val __obj = js.Dynamic.literal(oids = oids.asInstanceOf[js.Any])
      __obj.asInstanceOf[oidsArrayOIDabortOnErrorb]
    }
    
    extension [Self <: oidsArrayOIDabortOnErrorb](x: Self) {
      
      inline def setAbortOnError(value: Boolean): Self = StObject.set(x, "abortOnError", value.asInstanceOf[js.Any])
      
      inline def setAbortOnErrorUndefined: Self = StObject.set(x, "abortOnError", js.undefined)
      
      inline def setCombinedTimeout(value: Double): Self = StObject.set(x, "combinedTimeout", value.asInstanceOf[js.Any])
      
      inline def setCombinedTimeoutUndefined: Self = StObject.set(x, "combinedTimeout", js.undefined)
      
      inline def setCommunity(value: String): Self = StObject.set(x, "community", value.asInstanceOf[js.Any])
      
      inline def setCommunityUndefined: Self = StObject.set(x, "community", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setOids(value: js.Array[OID]): Self = StObject.set(x, "oids", value.asInstanceOf[js.Any])
      
      inline def setOidsVarargs(value: OID*): Self = StObject.set(x, "oids", js.Array(value*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setTimeouts(value: js.Array[Double]): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
      
      inline def setTimeoutsUndefined: Self = StObject.set(x, "timeouts", js.undefined)
      
      inline def setTimeoutsVarargs(value: Double*): Self = StObject.set(x, "timeouts", js.Array(value*))
    }
  }
}
