package typings.speedtestNet.mod

import typings.speedtestNet.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppData extends StObject {
  
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
  implicit class AppDataMutableBuilder[Self <: AppData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIspName(value: String): Self = StObject.set(x, "ispName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicense(value: Message): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseKey(value: String): Self = StObject.set(x, "licenseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultFormat(value: String): Self = StObject.set(x, "resultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveTestResultUrl(value: String): Self = StObject.set(x, "saveTestResultUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceLevel(value: Double): Self = StObject.set(x, "traceLevel", value.asInstanceOf[js.Any])
  }
}
