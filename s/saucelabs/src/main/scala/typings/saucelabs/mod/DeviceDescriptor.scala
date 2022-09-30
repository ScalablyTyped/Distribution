package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.ANDROID
import typings.saucelabs.saucelabsStrings.ANY
import typings.saucelabs.saucelabsStrings.ARM
import typings.saucelabs.saucelabsStrings.IOS
import typings.saucelabs.saucelabsStrings.IPAD
import typings.saucelabs.saucelabsStrings.IPHONE
import typings.saucelabs.saucelabsStrings.LANDSCAPE
import typings.saucelabs.saucelabsStrings.PORTRAIT
import typings.saucelabs.saucelabsStrings.X86
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDescriptor
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var abiType: js.UndefOr[String] = js.undefined
  
  var apiLevel: js.UndefOr[Double] = js.undefined
  
  var cpuCores: js.UndefOr[Double] = js.undefined
  
  var cpuFrequency: js.UndefOr[Double] = js.undefined
  
  var cpuType: js.UndefOr[ARM | X86] = js.undefined
  
  var defaultOrientation: js.UndefOr[PORTRAIT | LANDSCAPE] = js.undefined
  
  var deviceFamily: js.UndefOr[ANY | IPHONE | IPAD] = js.undefined
  
  var disableMtp: js.UndefOr[Boolean] = js.undefined
  
  var dpi: js.UndefOr[Double] = js.undefined
  
  var dpiName: js.UndefOr[String] = js.undefined
  
  var hasOnScreenButtons: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var internalOrientation: js.UndefOr[PORTRAIT | LANDSCAPE] = js.undefined
  
  var internalStorageSize: js.UndefOr[Double] = js.undefined
  
  var isAlternativeIoEnabled: js.UndefOr[Boolean] = js.undefined
  
  var isArm: js.UndefOr[Boolean] = js.undefined
  
  var isKeyGuardDisabled: js.UndefOr[Boolean] = js.undefined
  
  var isPrivate: js.UndefOr[Boolean] = js.undefined
  
  var isRooted: js.UndefOr[Boolean] = js.undefined
  
  var isTablet: js.UndefOr[Boolean] = js.undefined
  
  var manufacturer: js.UndefOr[js.Array[String]] = js.undefined
  
  var modelNumber: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var os: js.UndefOr[ANDROID | IOS] = js.undefined
  
  var osVersion: js.UndefOr[String] = js.undefined
  
  var pixelsPerPoint: js.UndefOr[Double] = js.undefined
  
  var ramSize: js.UndefOr[Double] = js.undefined
  
  var resolutionHeight: js.UndefOr[Double] = js.undefined
  
  var resolutionWidth: js.UndefOr[Double] = js.undefined
  
  var screenSize: js.UndefOr[Double] = js.undefined
  
  var sdCardSize: js.UndefOr[Double] = js.undefined
  
  var supportsAppiumWebAppTesting: js.UndefOr[Boolean] = js.undefined
  
  var supportsGlobalProxy: js.UndefOr[Boolean] = js.undefined
  
  var supportsManualWebTesting: js.UndefOr[Boolean] = js.undefined
  
  var supportsMinicapSocketConnection: js.UndefOr[Boolean] = js.undefined
  
  var supportsMockLocations: js.UndefOr[Boolean] = js.undefined
  
  var supportsMultiTouch: js.UndefOr[Boolean] = js.undefined
  
  var supportsQualityReport: js.UndefOr[Boolean] = js.undefined
  
  var supportsXcuiTest: js.UndefOr[Boolean] = js.undefined
}
object DeviceDescriptor {
  
  inline def apply(): DeviceDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDescriptor]
  }
  
  extension [Self <: DeviceDescriptor](x: Self) {
    
    inline def setAbiType(value: String): Self = StObject.set(x, "abiType", value.asInstanceOf[js.Any])
    
    inline def setAbiTypeUndefined: Self = StObject.set(x, "abiType", js.undefined)
    
    inline def setApiLevel(value: Double): Self = StObject.set(x, "apiLevel", value.asInstanceOf[js.Any])
    
    inline def setApiLevelUndefined: Self = StObject.set(x, "apiLevel", js.undefined)
    
    inline def setCpuCores(value: Double): Self = StObject.set(x, "cpuCores", value.asInstanceOf[js.Any])
    
    inline def setCpuCoresUndefined: Self = StObject.set(x, "cpuCores", js.undefined)
    
    inline def setCpuFrequency(value: Double): Self = StObject.set(x, "cpuFrequency", value.asInstanceOf[js.Any])
    
    inline def setCpuFrequencyUndefined: Self = StObject.set(x, "cpuFrequency", js.undefined)
    
    inline def setCpuType(value: ARM | X86): Self = StObject.set(x, "cpuType", value.asInstanceOf[js.Any])
    
    inline def setCpuTypeUndefined: Self = StObject.set(x, "cpuType", js.undefined)
    
    inline def setDefaultOrientation(value: PORTRAIT | LANDSCAPE): Self = StObject.set(x, "defaultOrientation", value.asInstanceOf[js.Any])
    
    inline def setDefaultOrientationUndefined: Self = StObject.set(x, "defaultOrientation", js.undefined)
    
    inline def setDeviceFamily(value: ANY | IPHONE | IPAD): Self = StObject.set(x, "deviceFamily", value.asInstanceOf[js.Any])
    
    inline def setDeviceFamilyUndefined: Self = StObject.set(x, "deviceFamily", js.undefined)
    
    inline def setDisableMtp(value: Boolean): Self = StObject.set(x, "disableMtp", value.asInstanceOf[js.Any])
    
    inline def setDisableMtpUndefined: Self = StObject.set(x, "disableMtp", js.undefined)
    
    inline def setDpi(value: Double): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    inline def setDpiName(value: String): Self = StObject.set(x, "dpiName", value.asInstanceOf[js.Any])
    
    inline def setDpiNameUndefined: Self = StObject.set(x, "dpiName", js.undefined)
    
    inline def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    inline def setHasOnScreenButtons(value: Boolean): Self = StObject.set(x, "hasOnScreenButtons", value.asInstanceOf[js.Any])
    
    inline def setHasOnScreenButtonsUndefined: Self = StObject.set(x, "hasOnScreenButtons", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternalOrientation(value: PORTRAIT | LANDSCAPE): Self = StObject.set(x, "internalOrientation", value.asInstanceOf[js.Any])
    
    inline def setInternalOrientationUndefined: Self = StObject.set(x, "internalOrientation", js.undefined)
    
    inline def setInternalStorageSize(value: Double): Self = StObject.set(x, "internalStorageSize", value.asInstanceOf[js.Any])
    
    inline def setInternalStorageSizeUndefined: Self = StObject.set(x, "internalStorageSize", js.undefined)
    
    inline def setIsAlternativeIoEnabled(value: Boolean): Self = StObject.set(x, "isAlternativeIoEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsAlternativeIoEnabledUndefined: Self = StObject.set(x, "isAlternativeIoEnabled", js.undefined)
    
    inline def setIsArm(value: Boolean): Self = StObject.set(x, "isArm", value.asInstanceOf[js.Any])
    
    inline def setIsArmUndefined: Self = StObject.set(x, "isArm", js.undefined)
    
    inline def setIsKeyGuardDisabled(value: Boolean): Self = StObject.set(x, "isKeyGuardDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsKeyGuardDisabledUndefined: Self = StObject.set(x, "isKeyGuardDisabled", js.undefined)
    
    inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    
    inline def setIsPrivateUndefined: Self = StObject.set(x, "isPrivate", js.undefined)
    
    inline def setIsRooted(value: Boolean): Self = StObject.set(x, "isRooted", value.asInstanceOf[js.Any])
    
    inline def setIsRootedUndefined: Self = StObject.set(x, "isRooted", js.undefined)
    
    inline def setIsTablet(value: Boolean): Self = StObject.set(x, "isTablet", value.asInstanceOf[js.Any])
    
    inline def setIsTabletUndefined: Self = StObject.set(x, "isTablet", js.undefined)
    
    inline def setManufacturer(value: js.Array[String]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setManufacturerVarargs(value: String*): Self = StObject.set(x, "manufacturer", js.Array(value*))
    
    inline def setModelNumber(value: String): Self = StObject.set(x, "modelNumber", value.asInstanceOf[js.Any])
    
    inline def setModelNumberUndefined: Self = StObject.set(x, "modelNumber", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOs(value: ANDROID | IOS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setPixelsPerPoint(value: Double): Self = StObject.set(x, "pixelsPerPoint", value.asInstanceOf[js.Any])
    
    inline def setPixelsPerPointUndefined: Self = StObject.set(x, "pixelsPerPoint", js.undefined)
    
    inline def setRamSize(value: Double): Self = StObject.set(x, "ramSize", value.asInstanceOf[js.Any])
    
    inline def setRamSizeUndefined: Self = StObject.set(x, "ramSize", js.undefined)
    
    inline def setResolutionHeight(value: Double): Self = StObject.set(x, "resolutionHeight", value.asInstanceOf[js.Any])
    
    inline def setResolutionHeightUndefined: Self = StObject.set(x, "resolutionHeight", js.undefined)
    
    inline def setResolutionWidth(value: Double): Self = StObject.set(x, "resolutionWidth", value.asInstanceOf[js.Any])
    
    inline def setResolutionWidthUndefined: Self = StObject.set(x, "resolutionWidth", js.undefined)
    
    inline def setScreenSize(value: Double): Self = StObject.set(x, "screenSize", value.asInstanceOf[js.Any])
    
    inline def setScreenSizeUndefined: Self = StObject.set(x, "screenSize", js.undefined)
    
    inline def setSdCardSize(value: Double): Self = StObject.set(x, "sdCardSize", value.asInstanceOf[js.Any])
    
    inline def setSdCardSizeUndefined: Self = StObject.set(x, "sdCardSize", js.undefined)
    
    inline def setSupportsAppiumWebAppTesting(value: Boolean): Self = StObject.set(x, "supportsAppiumWebAppTesting", value.asInstanceOf[js.Any])
    
    inline def setSupportsAppiumWebAppTestingUndefined: Self = StObject.set(x, "supportsAppiumWebAppTesting", js.undefined)
    
    inline def setSupportsGlobalProxy(value: Boolean): Self = StObject.set(x, "supportsGlobalProxy", value.asInstanceOf[js.Any])
    
    inline def setSupportsGlobalProxyUndefined: Self = StObject.set(x, "supportsGlobalProxy", js.undefined)
    
    inline def setSupportsManualWebTesting(value: Boolean): Self = StObject.set(x, "supportsManualWebTesting", value.asInstanceOf[js.Any])
    
    inline def setSupportsManualWebTestingUndefined: Self = StObject.set(x, "supportsManualWebTesting", js.undefined)
    
    inline def setSupportsMinicapSocketConnection(value: Boolean): Self = StObject.set(x, "supportsMinicapSocketConnection", value.asInstanceOf[js.Any])
    
    inline def setSupportsMinicapSocketConnectionUndefined: Self = StObject.set(x, "supportsMinicapSocketConnection", js.undefined)
    
    inline def setSupportsMockLocations(value: Boolean): Self = StObject.set(x, "supportsMockLocations", value.asInstanceOf[js.Any])
    
    inline def setSupportsMockLocationsUndefined: Self = StObject.set(x, "supportsMockLocations", js.undefined)
    
    inline def setSupportsMultiTouch(value: Boolean): Self = StObject.set(x, "supportsMultiTouch", value.asInstanceOf[js.Any])
    
    inline def setSupportsMultiTouchUndefined: Self = StObject.set(x, "supportsMultiTouch", js.undefined)
    
    inline def setSupportsQualityReport(value: Boolean): Self = StObject.set(x, "supportsQualityReport", value.asInstanceOf[js.Any])
    
    inline def setSupportsQualityReportUndefined: Self = StObject.set(x, "supportsQualityReport", js.undefined)
    
    inline def setSupportsXcuiTest(value: Boolean): Self = StObject.set(x, "supportsXcuiTest", value.asInstanceOf[js.Any])
    
    inline def setSupportsXcuiTestUndefined: Self = StObject.set(x, "supportsXcuiTest", js.undefined)
  }
}
