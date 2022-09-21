package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTimeInfo extends StObject {
  
  /**
    * name of the field containing event time
    * @type {string}
    * @memberof EventTimeInfo
    */
  var field: String
  
  /**
    * format of time field, can be one of: milliseconds_since_epoch, seconds_since_epoch
    * @type {string}
    * @memberof EventTimeInfo
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * default time zone, in standard IANA format
    * @type {string}
    * @memberof EventTimeInfo
    */
  var time_zone: js.UndefOr[String] = js.undefined
}
object EventTimeInfo {
  
  inline def apply(field: String): EventTimeInfo = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTimeInfo]
  }
  
  extension [Self <: EventTimeInfo](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
  }
}
