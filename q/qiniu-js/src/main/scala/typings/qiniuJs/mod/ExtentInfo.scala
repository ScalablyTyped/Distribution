package typings.qiniuJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtentInfo
  extends StObject
     with /* key */ StringDictionary[ExtentInfoValue] {
  
  var DateTime: ExtentInfoValue
  
  var ExposureBiasValue: ExtentInfoValue
  
  var ExposureTime: ExtentInfoValue
  
  var ISOSpeedRatings: ExtentInfoValue
  
  var Model: ExtentInfoValue
  
  var ResolutionUnit: ExtentInfoValue
}
object ExtentInfo {
  
  inline def apply(
    DateTime: ExtentInfoValue,
    ExposureBiasValue: ExtentInfoValue,
    ExposureTime: ExtentInfoValue,
    ISOSpeedRatings: ExtentInfoValue,
    Model: ExtentInfoValue,
    ResolutionUnit: ExtentInfoValue
  ): ExtentInfo = {
    val __obj = js.Dynamic.literal(DateTime = DateTime.asInstanceOf[js.Any], ExposureBiasValue = ExposureBiasValue.asInstanceOf[js.Any], ExposureTime = ExposureTime.asInstanceOf[js.Any], ISOSpeedRatings = ISOSpeedRatings.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], ResolutionUnit = ResolutionUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtentInfo]
  }
  
  extension [Self <: ExtentInfo](x: Self) {
    
    inline def setDateTime(value: ExtentInfoValue): Self = StObject.set(x, "DateTime", value.asInstanceOf[js.Any])
    
    inline def setExposureBiasValue(value: ExtentInfoValue): Self = StObject.set(x, "ExposureBiasValue", value.asInstanceOf[js.Any])
    
    inline def setExposureTime(value: ExtentInfoValue): Self = StObject.set(x, "ExposureTime", value.asInstanceOf[js.Any])
    
    inline def setISOSpeedRatings(value: ExtentInfoValue): Self = StObject.set(x, "ISOSpeedRatings", value.asInstanceOf[js.Any])
    
    inline def setModel(value: ExtentInfoValue): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setResolutionUnit(value: ExtentInfoValue): Self = StObject.set(x, "ResolutionUnit", value.asInstanceOf[js.Any])
  }
}
