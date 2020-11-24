package typings.speedtestNet.mod

import typings.speedtestNet.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppData extends js.Object {
  
  var ispName: String = js.native
  
  var license: Message = js.native
  
  var licenseKey: String = js.native
  
  var resultFormat: String = js.native
  
  var saveTestResultUrl: String = js.native
  
  var traceLevel: Double = js.native
}
object AppData {
  
  @scala.inline
  def apply(
    ispName: String,
    license: Message,
    licenseKey: String,
    resultFormat: String,
    saveTestResultUrl: String,
    traceLevel: Double
  ): AppData = {
    val __obj = js.Dynamic.literal(ispName = ispName.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], licenseKey = licenseKey.asInstanceOf[js.Any], resultFormat = resultFormat.asInstanceOf[js.Any], saveTestResultUrl = saveTestResultUrl.asInstanceOf[js.Any], traceLevel = traceLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppData]
  }
  
  @scala.inline
  implicit class AppDataOps[Self <: AppData] (val x: Self) extends AnyVal {
    
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
    def setIspName(value: String): Self = this.set("ispName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicense(value: Message): Self = this.set("license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseKey(value: String): Self = this.set("licenseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultFormat(value: String): Self = this.set("resultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveTestResultUrl(value: String): Self = this.set("saveTestResultUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceLevel(value: Double): Self = this.set("traceLevel", value.asInstanceOf[js.Any])
  }
}
