package typings.sharepoint.SP.SiteHealth

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteHealthResult extends ClientValueObject {
  
  def get_messageAsText(): String = js.native
  
  def get_ruleHelpLink(): String = js.native
  
  def get_ruleId(): Guid = js.native
  
  def get_ruleIsRepairable(): Boolean = js.native
  
  def get_ruleName(): String = js.native
  
  def get_status(): SiteHealthStatusType = js.native
  
  def get_timeStamp(): Date = js.native
  
  def set_status(value: SiteHealthStatusType): Unit = js.native
  
  def set_timeStamp(value: Date): Unit = js.native
}
object SiteHealthResult {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_messageAsText: () => String,
    get_ruleHelpLink: () => String,
    get_ruleId: () => Guid,
    get_ruleIsRepairable: () => Boolean,
    get_ruleName: () => String,
    get_status: () => SiteHealthStatusType,
    get_timeStamp: () => Date,
    get_typeId: () => String,
    set_status: SiteHealthStatusType => Unit,
    set_timeStamp: Date => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SiteHealthResult = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_messageAsText = js.Any.fromFunction0(get_messageAsText), get_ruleHelpLink = js.Any.fromFunction0(get_ruleHelpLink), get_ruleId = js.Any.fromFunction0(get_ruleId), get_ruleIsRepairable = js.Any.fromFunction0(get_ruleIsRepairable), get_ruleName = js.Any.fromFunction0(get_ruleName), get_status = js.Any.fromFunction0(get_status), get_timeStamp = js.Any.fromFunction0(get_timeStamp), get_typeId = js.Any.fromFunction0(get_typeId), set_status = js.Any.fromFunction1(set_status), set_timeStamp = js.Any.fromFunction1(set_timeStamp), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SiteHealthResult]
  }
  
  @scala.inline
  implicit class SiteHealthResultOps[Self <: SiteHealthResult] (val x: Self) extends AnyVal {
    
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
    def setGet_messageAsText(value: () => String): Self = this.set("get_messageAsText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_ruleHelpLink(value: () => String): Self = this.set("get_ruleHelpLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_ruleId(value: () => Guid): Self = this.set("get_ruleId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_ruleIsRepairable(value: () => Boolean): Self = this.set("get_ruleIsRepairable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_ruleName(value: () => String): Self = this.set("get_ruleName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_status(value: () => SiteHealthStatusType): Self = this.set("get_status", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_timeStamp(value: () => Date): Self = this.set("get_timeStamp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_status(value: SiteHealthStatusType => Unit): Self = this.set("set_status", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_timeStamp(value: Date => Unit): Self = this.set("set_timeStamp", js.Any.fromFunction1(value))
  }
}
