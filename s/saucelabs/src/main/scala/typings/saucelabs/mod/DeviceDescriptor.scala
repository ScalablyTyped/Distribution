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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceDescriptor
  extends /* key */ StringDictionary[js.Any] {
  
  var abiType: js.UndefOr[String] = js.native
  
  var apiLevel: js.UndefOr[Double] = js.native
  
  var cpuCores: js.UndefOr[Double] = js.native
  
  var cpuFrequency: js.UndefOr[Double] = js.native
  
  var cpuType: js.UndefOr[ARM | X86] = js.native
  
  var defaultOrientation: js.UndefOr[PORTRAIT | LANDSCAPE] = js.native
  
  var deviceFamily: js.UndefOr[ANY | IPHONE | IPAD] = js.native
  
  var disableMtp: js.UndefOr[Boolean] = js.native
  
  var dpi: js.UndefOr[Double] = js.native
  
  var dpiName: js.UndefOr[String] = js.native
  
  var hasOnScreenButtons: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[Id] = js.native
  
  var internalOrientation: js.UndefOr[PORTRAIT | LANDSCAPE] = js.native
  
  var internalStorageSize: js.UndefOr[Double] = js.native
  
  var isAlternativeIoEnabled: js.UndefOr[Boolean] = js.native
  
  var isArm: js.UndefOr[Boolean] = js.native
  
  var isKeyGuardDisabled: js.UndefOr[Boolean] = js.native
  
  var isPrivate: js.UndefOr[Boolean] = js.native
  
  var isRooted: js.UndefOr[Boolean] = js.native
  
  var isTablet: js.UndefOr[Boolean] = js.native
  
  var manufacturer: js.UndefOr[js.Array[String]] = js.native
  
  var modelNumber: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var os: js.UndefOr[ANDROID | IOS] = js.native
  
  var osVersion: js.UndefOr[String] = js.native
  
  var pixelsPerPoint: js.UndefOr[Double] = js.native
  
  var ramSize: js.UndefOr[Double] = js.native
  
  var resolutionHeight: js.UndefOr[Double] = js.native
  
  var resolutionWidth: js.UndefOr[Double] = js.native
  
  var screenSize: js.UndefOr[Double] = js.native
  
  var sdCardSize: js.UndefOr[Double] = js.native
  
  var supportsAppiumWebAppTesting: js.UndefOr[Boolean] = js.native
  
  var supportsGlobalProxy: js.UndefOr[Boolean] = js.native
  
  var supportsManualWebTesting: js.UndefOr[Boolean] = js.native
  
  var supportsMinicapSocketConnection: js.UndefOr[Boolean] = js.native
  
  var supportsMockLocations: js.UndefOr[Boolean] = js.native
  
  var supportsMultiTouch: js.UndefOr[Boolean] = js.native
  
  var supportsQualityReport: js.UndefOr[Boolean] = js.native
  
  var supportsXcuiTest: js.UndefOr[Boolean] = js.native
}
object DeviceDescriptor {
  
  @scala.inline
  def apply(): DeviceDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDescriptor]
  }
  
  @scala.inline
  implicit class DeviceDescriptorMutableBuilder[Self <: DeviceDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbiType(value: String): Self = StObject.set(x, "abiType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbiTypeUndefined: Self = StObject.set(x, "abiType", js.undefined)
    
    @scala.inline
    def setApiLevel(value: Double): Self = StObject.set(x, "apiLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiLevelUndefined: Self = StObject.set(x, "apiLevel", js.undefined)
    
    @scala.inline
    def setCpuCores(value: Double): Self = StObject.set(x, "cpuCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCoresUndefined: Self = StObject.set(x, "cpuCores", js.undefined)
    
    @scala.inline
    def setCpuFrequency(value: Double): Self = StObject.set(x, "cpuFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuFrequencyUndefined: Self = StObject.set(x, "cpuFrequency", js.undefined)
    
    @scala.inline
    def setCpuType(value: ARM | X86): Self = StObject.set(x, "cpuType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuTypeUndefined: Self = StObject.set(x, "cpuType", js.undefined)
    
    @scala.inline
    def setDefaultOrientation(value: PORTRAIT | LANDSCAPE): Self = StObject.set(x, "defaultOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOrientationUndefined: Self = StObject.set(x, "defaultOrientation", js.undefined)
    
    @scala.inline
    def setDeviceFamily(value: ANY | IPHONE | IPAD): Self = StObject.set(x, "deviceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceFamilyUndefined: Self = StObject.set(x, "deviceFamily", js.undefined)
    
    @scala.inline
    def setDisableMtp(value: Boolean): Self = StObject.set(x, "disableMtp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMtpUndefined: Self = StObject.set(x, "disableMtp", js.undefined)
    
    @scala.inline
    def setDpi(value: Double): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpiName(value: String): Self = StObject.set(x, "dpiName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpiNameUndefined: Self = StObject.set(x, "dpiName", js.undefined)
    
    @scala.inline
    def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    @scala.inline
    def setHasOnScreenButtons(value: Boolean): Self = StObject.set(x, "hasOnScreenButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasOnScreenButtonsUndefined: Self = StObject.set(x, "hasOnScreenButtons", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInternalOrientation(value: PORTRAIT | LANDSCAPE): Self = StObject.set(x, "internalOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalOrientationUndefined: Self = StObject.set(x, "internalOrientation", js.undefined)
    
    @scala.inline
    def setInternalStorageSize(value: Double): Self = StObject.set(x, "internalStorageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalStorageSizeUndefined: Self = StObject.set(x, "internalStorageSize", js.undefined)
    
    @scala.inline
    def setIsAlternativeIoEnabled(value: Boolean): Self = StObject.set(x, "isAlternativeIoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAlternativeIoEnabledUndefined: Self = StObject.set(x, "isAlternativeIoEnabled", js.undefined)
    
    @scala.inline
    def setIsArm(value: Boolean): Self = StObject.set(x, "isArm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsArmUndefined: Self = StObject.set(x, "isArm", js.undefined)
    
    @scala.inline
    def setIsKeyGuardDisabled(value: Boolean): Self = StObject.set(x, "isKeyGuardDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsKeyGuardDisabledUndefined: Self = StObject.set(x, "isKeyGuardDisabled", js.undefined)
    
    @scala.inline
    def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrivateUndefined: Self = StObject.set(x, "isPrivate", js.undefined)
    
    @scala.inline
    def setIsRooted(value: Boolean): Self = StObject.set(x, "isRooted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRootedUndefined: Self = StObject.set(x, "isRooted", js.undefined)
    
    @scala.inline
    def setIsTablet(value: Boolean): Self = StObject.set(x, "isTablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTabletUndefined: Self = StObject.set(x, "isTablet", js.undefined)
    
    @scala.inline
    def setManufacturer(value: js.Array[String]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    @scala.inline
    def setManufacturerVarargs(value: String*): Self = StObject.set(x, "manufacturer", js.Array(value :_*))
    
    @scala.inline
    def setModelNumber(value: String): Self = StObject.set(x, "modelNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelNumberUndefined: Self = StObject.set(x, "modelNumber", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOs(value: ANDROID | IOS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    @scala.inline
    def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    @scala.inline
    def setPixelsPerPoint(value: Double): Self = StObject.set(x, "pixelsPerPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsPerPointUndefined: Self = StObject.set(x, "pixelsPerPoint", js.undefined)
    
    @scala.inline
    def setRamSize(value: Double): Self = StObject.set(x, "ramSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamSizeUndefined: Self = StObject.set(x, "ramSize", js.undefined)
    
    @scala.inline
    def setResolutionHeight(value: Double): Self = StObject.set(x, "resolutionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionHeightUndefined: Self = StObject.set(x, "resolutionHeight", js.undefined)
    
    @scala.inline
    def setResolutionWidth(value: Double): Self = StObject.set(x, "resolutionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionWidthUndefined: Self = StObject.set(x, "resolutionWidth", js.undefined)
    
    @scala.inline
    def setScreenSize(value: Double): Self = StObject.set(x, "screenSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenSizeUndefined: Self = StObject.set(x, "screenSize", js.undefined)
    
    @scala.inline
    def setSdCardSize(value: Double): Self = StObject.set(x, "sdCardSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdCardSizeUndefined: Self = StObject.set(x, "sdCardSize", js.undefined)
    
    @scala.inline
    def setSupportsAppiumWebAppTesting(value: Boolean): Self = StObject.set(x, "supportsAppiumWebAppTesting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsAppiumWebAppTestingUndefined: Self = StObject.set(x, "supportsAppiumWebAppTesting", js.undefined)
    
    @scala.inline
    def setSupportsGlobalProxy(value: Boolean): Self = StObject.set(x, "supportsGlobalProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsGlobalProxyUndefined: Self = StObject.set(x, "supportsGlobalProxy", js.undefined)
    
    @scala.inline
    def setSupportsManualWebTesting(value: Boolean): Self = StObject.set(x, "supportsManualWebTesting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsManualWebTestingUndefined: Self = StObject.set(x, "supportsManualWebTesting", js.undefined)
    
    @scala.inline
    def setSupportsMinicapSocketConnection(value: Boolean): Self = StObject.set(x, "supportsMinicapSocketConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsMinicapSocketConnectionUndefined: Self = StObject.set(x, "supportsMinicapSocketConnection", js.undefined)
    
    @scala.inline
    def setSupportsMockLocations(value: Boolean): Self = StObject.set(x, "supportsMockLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsMockLocationsUndefined: Self = StObject.set(x, "supportsMockLocations", js.undefined)
    
    @scala.inline
    def setSupportsMultiTouch(value: Boolean): Self = StObject.set(x, "supportsMultiTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsMultiTouchUndefined: Self = StObject.set(x, "supportsMultiTouch", js.undefined)
    
    @scala.inline
    def setSupportsQualityReport(value: Boolean): Self = StObject.set(x, "supportsQualityReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsQualityReportUndefined: Self = StObject.set(x, "supportsQualityReport", js.undefined)
    
    @scala.inline
    def setSupportsXcuiTest(value: Boolean): Self = StObject.set(x, "supportsXcuiTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsXcuiTestUndefined: Self = StObject.set(x, "supportsXcuiTest", js.undefined)
  }
}
