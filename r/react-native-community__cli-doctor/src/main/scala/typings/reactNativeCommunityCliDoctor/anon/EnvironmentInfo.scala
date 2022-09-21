package typings.reactNativeCommunityCliDoctor.anon

import typings.reactNativeCommunityCliDoctor.typesMod.Loader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentInfo extends StObject {
  
  var environmentInfo: typings.reactNativeCommunityCliDoctor.typesMod.EnvironmentInfo
  
  var loader: Loader
  
  def logManualInstallation(hasHealthcheckUrlCommandMessage: Command): Unit
}
object EnvironmentInfo {
  
  inline def apply(
    environmentInfo: typings.reactNativeCommunityCliDoctor.typesMod.EnvironmentInfo,
    loader: Loader,
    logManualInstallation: Command => Unit
  ): EnvironmentInfo = {
    val __obj = js.Dynamic.literal(environmentInfo = environmentInfo.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], logManualInstallation = js.Any.fromFunction1(logManualInstallation))
    __obj.asInstanceOf[EnvironmentInfo]
  }
  
  extension [Self <: EnvironmentInfo](x: Self) {
    
    inline def setEnvironmentInfo(value: typings.reactNativeCommunityCliDoctor.typesMod.EnvironmentInfo): Self = StObject.set(x, "environmentInfo", value.asInstanceOf[js.Any])
    
    inline def setLoader(value: Loader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLogManualInstallation(value: Command => Unit): Self = StObject.set(x, "logManualInstallation", js.Any.fromFunction1(value))
  }
}
