package typings.storybookCoreServer.anon

import typings.storybookCoreCommon.distTs3Dot9TypesMod.VersionCheck
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagerTotalTime extends StObject {
  
  var address: String
  
  var managerTotalTime: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var name: String
  
  var networkAddress: String
  
  var previewTotalTime: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var updateInfo: VersionCheck
  
  var version: String
}
object ManagerTotalTime {
  
  inline def apply(address: String, name: String, networkAddress: String, updateInfo: VersionCheck, version: String): ManagerTotalTime = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], networkAddress = networkAddress.asInstanceOf[js.Any], updateInfo = updateInfo.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagerTotalTime]
  }
  
  extension [Self <: ManagerTotalTime](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setManagerTotalTime(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "managerTotalTime", value.asInstanceOf[js.Any])
    
    inline def setManagerTotalTimeUndefined: Self = StObject.set(x, "managerTotalTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetworkAddress(value: String): Self = StObject.set(x, "networkAddress", value.asInstanceOf[js.Any])
    
    inline def setPreviewTotalTime(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "previewTotalTime", value.asInstanceOf[js.Any])
    
    inline def setPreviewTotalTimeUndefined: Self = StObject.set(x, "previewTotalTime", js.undefined)
    
    inline def setUpdateInfo(value: VersionCheck): Self = StObject.set(x, "updateInfo", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
