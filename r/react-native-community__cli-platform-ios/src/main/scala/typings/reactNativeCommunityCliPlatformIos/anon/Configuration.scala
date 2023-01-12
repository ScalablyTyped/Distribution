package typings.reactNativeCommunityCliPlatformIos.anon

import typings.reactNativeCommunityCliPlatformIos.reactNativeCommunityCliPlatformIosBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  var configuration: String
  
  var device: js.UndefOr[String | `true`] = js.undefined
  
  var packager: Boolean
  
  var port: Double
  
  var projectPath: String
  
  var scheme: js.UndefOr[String] = js.undefined
  
  var simulator: js.UndefOr[String] = js.undefined
  
  var terminal: js.UndefOr[String] = js.undefined
  
  var udid: js.UndefOr[String] = js.undefined
  
  var verbose: Boolean
}
object Configuration {
  
  inline def apply(configuration: String, packager: Boolean, port: Double, projectPath: String, verbose: Boolean): Configuration = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], projectPath = projectPath.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: String | `true`): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setPackager(value: Boolean): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProjectPath(value: String): Self = StObject.set(x, "projectPath", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setSimulator(value: String): Self = StObject.set(x, "simulator", value.asInstanceOf[js.Any])
    
    inline def setSimulatorUndefined: Self = StObject.set(x, "simulator", js.undefined)
    
    inline def setTerminal(value: String): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
    
    inline def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
    
    inline def setUdid(value: String): Self = StObject.set(x, "udid", value.asInstanceOf[js.Any])
    
    inline def setUdidUndefined: Self = StObject.set(x, "udid", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
