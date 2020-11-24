package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReorderingRule extends ClientValueObject {
  
  def get_boost(): Double = js.native
  
  def get_matchType(): ReorderingRuleMatchType = js.native
  
  def get_matchValue(): String = js.native
  
  def set_boost(value: Double): Unit = js.native
  
  def set_matchType(value: ReorderingRuleMatchType): Unit = js.native
  
  def set_matchValue(value: String): Unit = js.native
}
object ReorderingRule {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_boost: () => Double,
    get_matchType: () => ReorderingRuleMatchType,
    get_matchValue: () => String,
    get_typeId: () => String,
    set_boost: Double => Unit,
    set_matchType: ReorderingRuleMatchType => Unit,
    set_matchValue: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ReorderingRule = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_boost = js.Any.fromFunction0(get_boost), get_matchType = js.Any.fromFunction0(get_matchType), get_matchValue = js.Any.fromFunction0(get_matchValue), get_typeId = js.Any.fromFunction0(get_typeId), set_boost = js.Any.fromFunction1(set_boost), set_matchType = js.Any.fromFunction1(set_matchType), set_matchValue = js.Any.fromFunction1(set_matchValue), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ReorderingRule]
  }
  
  @scala.inline
  implicit class ReorderingRuleOps[Self <: ReorderingRule] (val x: Self) extends AnyVal {
    
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
    def setGet_boost(value: () => Double): Self = this.set("get_boost", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_matchType(value: () => ReorderingRuleMatchType): Self = this.set("get_matchType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_matchValue(value: () => String): Self = this.set("get_matchValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_boost(value: Double => Unit): Self = this.set("set_boost", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_matchType(value: ReorderingRuleMatchType => Unit): Self = this.set("set_matchType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_matchValue(value: String => Unit): Self = this.set("set_matchValue", js.Any.fromFunction1(value))
  }
}
