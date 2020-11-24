package typings.sharepoint.SP

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeInfo extends ClientValueObject {
  
  def get_errorFile(): String = js.native
  
  def get_errors(): Double = js.native
  
  def get_lastUpdated(): Date = js.native
  
  def get_logFile(): String = js.native
  
  def get_requestDate(): Date = js.native
  
  def get_retryCount(): Double = js.native
  
  def get_startTime(): Date = js.native
  
  def get_status(): UpgradeStatus = js.native
  
  def get_upgradeType(): UpgradeType = js.native
  
  def get_warnings(): Double = js.native
}
object UpgradeInfo {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_errorFile: () => String,
    get_errors: () => Double,
    get_lastUpdated: () => Date,
    get_logFile: () => String,
    get_requestDate: () => Date,
    get_retryCount: () => Double,
    get_startTime: () => Date,
    get_status: () => UpgradeStatus,
    get_typeId: () => String,
    get_upgradeType: () => UpgradeType,
    get_warnings: () => Double,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): UpgradeInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_errorFile = js.Any.fromFunction0(get_errorFile), get_errors = js.Any.fromFunction0(get_errors), get_lastUpdated = js.Any.fromFunction0(get_lastUpdated), get_logFile = js.Any.fromFunction0(get_logFile), get_requestDate = js.Any.fromFunction0(get_requestDate), get_retryCount = js.Any.fromFunction0(get_retryCount), get_startTime = js.Any.fromFunction0(get_startTime), get_status = js.Any.fromFunction0(get_status), get_typeId = js.Any.fromFunction0(get_typeId), get_upgradeType = js.Any.fromFunction0(get_upgradeType), get_warnings = js.Any.fromFunction0(get_warnings), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[UpgradeInfo]
  }
  
  @scala.inline
  implicit class UpgradeInfoOps[Self <: UpgradeInfo] (val x: Self) extends AnyVal {
    
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
    def setGet_errorFile(value: () => String): Self = this.set("get_errorFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_errors(value: () => Double): Self = this.set("get_errors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_lastUpdated(value: () => Date): Self = this.set("get_lastUpdated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_logFile(value: () => String): Self = this.set("get_logFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_requestDate(value: () => Date): Self = this.set("get_requestDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_retryCount(value: () => Double): Self = this.set("get_retryCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_startTime(value: () => Date): Self = this.set("get_startTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_status(value: () => UpgradeStatus): Self = this.set("get_status", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_upgradeType(value: () => UpgradeType): Self = this.set("get_upgradeType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_warnings(value: () => Double): Self = this.set("get_warnings", js.Any.fromFunction0(value))
  }
}
