package typings.reactNativeWindows.anon

import typings.reactNativeWindows.reactNativeWindowsStrings.car
import typings.reactNativeWindows.reactNativeWindowsStrings.desk
import typings.reactNativeWindows.reactNativeWindowsStrings.normal_
import typings.reactNativeWindows.reactNativeWindowsStrings.tv
import typings.reactNativeWindows.reactNativeWindowsStrings.unknown
import typings.reactNativeWindows.reactNativeWindowsStrings.watch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-windows.react-native-windows/rntypes.PlatformConstants & {  Version :number,   Release :string,   Serial :string,   Fingerprint :string,   Model :string,   Brand :string,   Manufacturer :string,   ServerHost :string | undefined,   uiMode :'car' | 'desk' | 'normal' | 'tv' | 'watch' | 'unknown'} */
trait PlatformConstantsVersionn extends StObject {
  
  var Brand: String
  
  var Fingerprint: String
  
  var Manufacturer: String
  
  var Model: String
  
  var Release: String
  
  var Serial: String
  
  var ServerHost: js.UndefOr[String] = js.undefined
  
  var Version: Double
  
  var isTesting: Boolean
  
  var reactNativeVersion: Major
  
  var uiMode: car | desk | normal_ | tv | watch | unknown
}
object PlatformConstantsVersionn {
  
  inline def apply(
    Brand: String,
    Fingerprint: String,
    Manufacturer: String,
    Model: String,
    Release: String,
    Serial: String,
    Version: Double,
    isTesting: Boolean,
    reactNativeVersion: Major,
    uiMode: car | desk | normal_ | tv | watch | unknown
  ): PlatformConstantsVersionn = {
    val __obj = js.Dynamic.literal(Brand = Brand.asInstanceOf[js.Any], Fingerprint = Fingerprint.asInstanceOf[js.Any], Manufacturer = Manufacturer.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Release = Release.asInstanceOf[js.Any], Serial = Serial.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], isTesting = isTesting.asInstanceOf[js.Any], reactNativeVersion = reactNativeVersion.asInstanceOf[js.Any], uiMode = uiMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformConstantsVersionn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlatformConstantsVersionn] (val x: Self) extends AnyVal {
    
    inline def setBrand(value: String): Self = StObject.set(x, "Brand", value.asInstanceOf[js.Any])
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "Fingerprint", value.asInstanceOf[js.Any])
    
    inline def setIsTesting(value: Boolean): Self = StObject.set(x, "isTesting", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "Manufacturer", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setReactNativeVersion(value: Major): Self = StObject.set(x, "reactNativeVersion", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: String): Self = StObject.set(x, "Release", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: String): Self = StObject.set(x, "Serial", value.asInstanceOf[js.Any])
    
    inline def setServerHost(value: String): Self = StObject.set(x, "ServerHost", value.asInstanceOf[js.Any])
    
    inline def setServerHostUndefined: Self = StObject.set(x, "ServerHost", js.undefined)
    
    inline def setUiMode(value: car | desk | normal_ | tv | watch | unknown): Self = StObject.set(x, "uiMode", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
