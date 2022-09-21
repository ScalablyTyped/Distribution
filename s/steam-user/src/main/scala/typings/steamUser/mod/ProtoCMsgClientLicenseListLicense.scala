package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtoCMsgClientLicenseListLicense extends StObject {
  
  var access_token: String
  
  var change_number: Double
  
  var flags: ELicenseFlags
  
  var initial_period: Double
  
  var initial_time_unit: Double
  
  var license_type: ELicenseType
  
  var master_package_id: Double
  
  var minute_limit: Double
  
  var minutes_used: Double
  
  var owner_id: Double
  
  var package_id: Double
  
  var payment_method: EPaymentMethod
  
  var purchase_country_code: String
  
  var renewal_period: Double
  
  var renewal_time_unit: Double
  
  var territory_code: Double
  
  var time_created: Double
  
  var time_next_process: Double
}
object ProtoCMsgClientLicenseListLicense {
  
  inline def apply(
    access_token: String,
    change_number: Double,
    flags: ELicenseFlags,
    initial_period: Double,
    initial_time_unit: Double,
    license_type: ELicenseType,
    master_package_id: Double,
    minute_limit: Double,
    minutes_used: Double,
    owner_id: Double,
    package_id: Double,
    payment_method: EPaymentMethod,
    purchase_country_code: String,
    renewal_period: Double,
    renewal_time_unit: Double,
    territory_code: Double,
    time_created: Double,
    time_next_process: Double
  ): ProtoCMsgClientLicenseListLicense = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], change_number = change_number.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], initial_period = initial_period.asInstanceOf[js.Any], initial_time_unit = initial_time_unit.asInstanceOf[js.Any], license_type = license_type.asInstanceOf[js.Any], master_package_id = master_package_id.asInstanceOf[js.Any], minute_limit = minute_limit.asInstanceOf[js.Any], minutes_used = minutes_used.asInstanceOf[js.Any], owner_id = owner_id.asInstanceOf[js.Any], package_id = package_id.asInstanceOf[js.Any], payment_method = payment_method.asInstanceOf[js.Any], purchase_country_code = purchase_country_code.asInstanceOf[js.Any], renewal_period = renewal_period.asInstanceOf[js.Any], renewal_time_unit = renewal_time_unit.asInstanceOf[js.Any], territory_code = territory_code.asInstanceOf[js.Any], time_created = time_created.asInstanceOf[js.Any], time_next_process = time_next_process.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtoCMsgClientLicenseListLicense]
  }
  
  extension [Self <: ProtoCMsgClientLicenseListLicense](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setChange_number(value: Double): Self = StObject.set(x, "change_number", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: ELicenseFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setInitial_period(value: Double): Self = StObject.set(x, "initial_period", value.asInstanceOf[js.Any])
    
    inline def setInitial_time_unit(value: Double): Self = StObject.set(x, "initial_time_unit", value.asInstanceOf[js.Any])
    
    inline def setLicense_type(value: ELicenseType): Self = StObject.set(x, "license_type", value.asInstanceOf[js.Any])
    
    inline def setMaster_package_id(value: Double): Self = StObject.set(x, "master_package_id", value.asInstanceOf[js.Any])
    
    inline def setMinute_limit(value: Double): Self = StObject.set(x, "minute_limit", value.asInstanceOf[js.Any])
    
    inline def setMinutes_used(value: Double): Self = StObject.set(x, "minutes_used", value.asInstanceOf[js.Any])
    
    inline def setOwner_id(value: Double): Self = StObject.set(x, "owner_id", value.asInstanceOf[js.Any])
    
    inline def setPackage_id(value: Double): Self = StObject.set(x, "package_id", value.asInstanceOf[js.Any])
    
    inline def setPayment_method(value: EPaymentMethod): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    inline def setPurchase_country_code(value: String): Self = StObject.set(x, "purchase_country_code", value.asInstanceOf[js.Any])
    
    inline def setRenewal_period(value: Double): Self = StObject.set(x, "renewal_period", value.asInstanceOf[js.Any])
    
    inline def setRenewal_time_unit(value: Double): Self = StObject.set(x, "renewal_time_unit", value.asInstanceOf[js.Any])
    
    inline def setTerritory_code(value: Double): Self = StObject.set(x, "territory_code", value.asInstanceOf[js.Any])
    
    inline def setTime_created(value: Double): Self = StObject.set(x, "time_created", value.asInstanceOf[js.Any])
    
    inline def setTime_next_process(value: Double): Self = StObject.set(x, "time_next_process", value.asInstanceOf[js.Any])
  }
}
