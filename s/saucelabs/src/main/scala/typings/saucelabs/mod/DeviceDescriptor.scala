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
  implicit class DeviceDescriptorOps[Self <: DeviceDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbiType(value: String): Self = this.set("abiType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbiType: Self = this.set("abiType", js.undefined)
    
    @scala.inline
    def setApiLevel(value: Double): Self = this.set("apiLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiLevel: Self = this.set("apiLevel", js.undefined)
    
    @scala.inline
    def setCpuCores(value: Double): Self = this.set("cpuCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuCores: Self = this.set("cpuCores", js.undefined)
    
    @scala.inline
    def setCpuFrequency(value: Double): Self = this.set("cpuFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuFrequency: Self = this.set("cpuFrequency", js.undefined)
    
    @scala.inline
    def setCpuType(value: ARM | X86): Self = this.set("cpuType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuType: Self = this.set("cpuType", js.undefined)
    
    @scala.inline
    def setDefaultOrientation(value: PORTRAIT | LANDSCAPE): Self = this.set("defaultOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOrientation: Self = this.set("defaultOrientation", js.undefined)
    
    @scala.inline
    def setDeviceFamily(value: ANY | IPHONE | IPAD): Self = this.set("deviceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceFamily: Self = this.set("deviceFamily", js.undefined)
    
    @scala.inline
    def setDisableMtp(value: Boolean): Self = this.set("disableMtp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMtp: Self = this.set("disableMtp", js.undefined)
    
    @scala.inline
    def setDpi(value: Double): Self = this.set("dpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDpi: Self = this.set("dpi", js.undefined)
    
    @scala.inline
    def setDpiName(value: String): Self = this.set("dpiName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDpiName: Self = this.set("dpiName", js.undefined)
    
    @scala.inline
    def setHasOnScreenButtons(value: Boolean): Self = this.set("hasOnScreenButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasOnScreenButtons: Self = this.set("hasOnScreenButtons", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInternalOrientation(value: PORTRAIT | LANDSCAPE): Self = this.set("internalOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalOrientation: Self = this.set("internalOrientation", js.undefined)
    
    @scala.inline
    def setInternalStorageSize(value: Double): Self = this.set("internalStorageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalStorageSize: Self = this.set("internalStorageSize", js.undefined)
    
    @scala.inline
    def setIsAlternativeIoEnabled(value: Boolean): Self = this.set("isAlternativeIoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAlternativeIoEnabled: Self = this.set("isAlternativeIoEnabled", js.undefined)
    
    @scala.inline
    def setIsArm(value: Boolean): Self = this.set("isArm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsArm: Self = this.set("isArm", js.undefined)
    
    @scala.inline
    def setIsKeyGuardDisabled(value: Boolean): Self = this.set("isKeyGuardDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsKeyGuardDisabled: Self = this.set("isKeyGuardDisabled", js.undefined)
    
    @scala.inline
    def setIsPrivate(value: Boolean): Self = this.set("isPrivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPrivate: Self = this.set("isPrivate", js.undefined)
    
    @scala.inline
    def setIsRooted(value: Boolean): Self = this.set("isRooted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRooted: Self = this.set("isRooted", js.undefined)
    
    @scala.inline
    def setIsTablet(value: Boolean): Self = this.set("isTablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTablet: Self = this.set("isTablet", js.undefined)
    
    @scala.inline
    def setManufacturerVarargs(value: String*): Self = this.set("manufacturer", js.Array(value :_*))
    
    @scala.inline
    def setManufacturer(value: js.Array[String]): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setModelNumber(value: String): Self = this.set("modelNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelNumber: Self = this.set("modelNumber", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOs(value: ANDROID | IOS): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    
    @scala.inline
    def setOsVersion(value: String): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsVersion: Self = this.set("osVersion", js.undefined)
    
    @scala.inline
    def setPixelsPerPoint(value: Double): Self = this.set("pixelsPerPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelsPerPoint: Self = this.set("pixelsPerPoint", js.undefined)
    
    @scala.inline
    def setRamSize(value: Double): Self = this.set("ramSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRamSize: Self = this.set("ramSize", js.undefined)
    
    @scala.inline
    def setResolutionHeight(value: Double): Self = this.set("resolutionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolutionHeight: Self = this.set("resolutionHeight", js.undefined)
    
    @scala.inline
    def setResolutionWidth(value: Double): Self = this.set("resolutionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolutionWidth: Self = this.set("resolutionWidth", js.undefined)
    
    @scala.inline
    def setScreenSize(value: Double): Self = this.set("screenSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenSize: Self = this.set("screenSize", js.undefined)
    
    @scala.inline
    def setSdCardSize(value: Double): Self = this.set("sdCardSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdCardSize: Self = this.set("sdCardSize", js.undefined)
    
    @scala.inline
    def setSupportsAppiumWebAppTesting(value: Boolean): Self = this.set("supportsAppiumWebAppTesting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsAppiumWebAppTesting: Self = this.set("supportsAppiumWebAppTesting", js.undefined)
    
    @scala.inline
    def setSupportsGlobalProxy(value: Boolean): Self = this.set("supportsGlobalProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsGlobalProxy: Self = this.set("supportsGlobalProxy", js.undefined)
    
    @scala.inline
    def setSupportsManualWebTesting(value: Boolean): Self = this.set("supportsManualWebTesting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsManualWebTesting: Self = this.set("supportsManualWebTesting", js.undefined)
    
    @scala.inline
    def setSupportsMinicapSocketConnection(value: Boolean): Self = this.set("supportsMinicapSocketConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsMinicapSocketConnection: Self = this.set("supportsMinicapSocketConnection", js.undefined)
    
    @scala.inline
    def setSupportsMockLocations(value: Boolean): Self = this.set("supportsMockLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsMockLocations: Self = this.set("supportsMockLocations", js.undefined)
    
    @scala.inline
    def setSupportsMultiTouch(value: Boolean): Self = this.set("supportsMultiTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsMultiTouch: Self = this.set("supportsMultiTouch", js.undefined)
    
    @scala.inline
    def setSupportsQualityReport(value: Boolean): Self = this.set("supportsQualityReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsQualityReport: Self = this.set("supportsQualityReport", js.undefined)
    
    @scala.inline
    def setSupportsXcuiTest(value: Boolean): Self = this.set("supportsXcuiTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsXcuiTest: Self = this.set("supportsXcuiTest", js.undefined)
  }
}
