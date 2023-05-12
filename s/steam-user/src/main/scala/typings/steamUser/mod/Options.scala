package typings.steamUser.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "Response Types"
//#region "General Interfaces"
trait Options extends StObject {
  
  var additionalHeaders: js.UndefOr[Record[String, String]] = js.undefined
  
  var autoRelogin: js.UndefOr[Boolean] = js.undefined
  
  var changelistUpdateInterval: js.UndefOr[Double] = js.undefined
  
  var dataDirectory: js.UndefOr[String | Null] = js.undefined
  
  var enablePicsCache: js.UndefOr[Boolean] = js.undefined
  
  var httpProxy: js.UndefOr[String | Null] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var localAddress: js.UndefOr[String | Null] = js.undefined
  
  var localPort: js.UndefOr[Double | Null] = js.undefined
  
  var machineIdFormat: js.UndefOr[js.Tuple3[String, String, String]] = js.undefined
  
  var machineIdType: js.UndefOr[EMachineIDType] = js.undefined
  
  var ownershipFilter: js.UndefOr[OwnsFilterObject | OwnsFilterFunction] = js.undefined
  
  var picsCacheAll: js.UndefOr[Boolean] = js.undefined
  
  var protocol: js.UndefOr[EConnectionProtocol] = js.undefined
  
  var saveAppTickets: js.UndefOr[Boolean] = js.undefined
  
  var singleSentryfile: js.UndefOr[Boolean] = js.undefined
  
  var socksProxy: js.UndefOr[String | Null] = js.undefined
  
  var webCompatibilityMode: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setAdditionalHeaders(value: Record[String, String]): Self = StObject.set(x, "additionalHeaders", value.asInstanceOf[js.Any])
    
    inline def setAdditionalHeadersUndefined: Self = StObject.set(x, "additionalHeaders", js.undefined)
    
    inline def setAutoRelogin(value: Boolean): Self = StObject.set(x, "autoRelogin", value.asInstanceOf[js.Any])
    
    inline def setAutoReloginUndefined: Self = StObject.set(x, "autoRelogin", js.undefined)
    
    inline def setChangelistUpdateInterval(value: Double): Self = StObject.set(x, "changelistUpdateInterval", value.asInstanceOf[js.Any])
    
    inline def setChangelistUpdateIntervalUndefined: Self = StObject.set(x, "changelistUpdateInterval", js.undefined)
    
    inline def setDataDirectory(value: String): Self = StObject.set(x, "dataDirectory", value.asInstanceOf[js.Any])
    
    inline def setDataDirectoryNull: Self = StObject.set(x, "dataDirectory", null)
    
    inline def setDataDirectoryUndefined: Self = StObject.set(x, "dataDirectory", js.undefined)
    
    inline def setEnablePicsCache(value: Boolean): Self = StObject.set(x, "enablePicsCache", value.asInstanceOf[js.Any])
    
    inline def setEnablePicsCacheUndefined: Self = StObject.set(x, "enablePicsCache", js.undefined)
    
    inline def setHttpProxy(value: String): Self = StObject.set(x, "httpProxy", value.asInstanceOf[js.Any])
    
    inline def setHttpProxyNull: Self = StObject.set(x, "httpProxy", null)
    
    inline def setHttpProxyUndefined: Self = StObject.set(x, "httpProxy", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalAddressNull: Self = StObject.set(x, "localAddress", null)
    
    inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
    
    inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    
    inline def setLocalPortNull: Self = StObject.set(x, "localPort", null)
    
    inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
    
    inline def setMachineIdFormat(value: js.Tuple3[String, String, String]): Self = StObject.set(x, "machineIdFormat", value.asInstanceOf[js.Any])
    
    inline def setMachineIdFormatUndefined: Self = StObject.set(x, "machineIdFormat", js.undefined)
    
    inline def setMachineIdType(value: EMachineIDType): Self = StObject.set(x, "machineIdType", value.asInstanceOf[js.Any])
    
    inline def setMachineIdTypeUndefined: Self = StObject.set(x, "machineIdType", js.undefined)
    
    inline def setOwnershipFilter(value: OwnsFilterObject | OwnsFilterFunction): Self = StObject.set(x, "ownershipFilter", value.asInstanceOf[js.Any])
    
    inline def setOwnershipFilterFunction3(
      value: (/* element */ ProtoCMsgClientLicenseListLicense, /* index */ Double, /* array */ js.Array[ProtoCMsgClientLicenseListLicense]) => Boolean
    ): Self = StObject.set(x, "ownershipFilter", js.Any.fromFunction3(value))
    
    inline def setOwnershipFilterUndefined: Self = StObject.set(x, "ownershipFilter", js.undefined)
    
    inline def setPicsCacheAll(value: Boolean): Self = StObject.set(x, "picsCacheAll", value.asInstanceOf[js.Any])
    
    inline def setPicsCacheAllUndefined: Self = StObject.set(x, "picsCacheAll", js.undefined)
    
    inline def setProtocol(value: EConnectionProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setSaveAppTickets(value: Boolean): Self = StObject.set(x, "saveAppTickets", value.asInstanceOf[js.Any])
    
    inline def setSaveAppTicketsUndefined: Self = StObject.set(x, "saveAppTickets", js.undefined)
    
    inline def setSingleSentryfile(value: Boolean): Self = StObject.set(x, "singleSentryfile", value.asInstanceOf[js.Any])
    
    inline def setSingleSentryfileUndefined: Self = StObject.set(x, "singleSentryfile", js.undefined)
    
    inline def setSocksProxy(value: String): Self = StObject.set(x, "socksProxy", value.asInstanceOf[js.Any])
    
    inline def setSocksProxyNull: Self = StObject.set(x, "socksProxy", null)
    
    inline def setSocksProxyUndefined: Self = StObject.set(x, "socksProxy", js.undefined)
    
    inline def setWebCompatibilityMode(value: Boolean): Self = StObject.set(x, "webCompatibilityMode", value.asInstanceOf[js.Any])
    
    inline def setWebCompatibilityModeUndefined: Self = StObject.set(x, "webCompatibilityMode", js.undefined)
  }
}
