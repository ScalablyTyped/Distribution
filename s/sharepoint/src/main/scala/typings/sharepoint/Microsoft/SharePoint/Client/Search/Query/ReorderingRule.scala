package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReorderingRule
  extends StObject
     with ClientValueObject {
  
  def get_boost(): Double
  
  def get_matchType(): ReorderingRuleMatchType
  
  def get_matchValue(): String
  
  def set_boost(value: Double): Unit
  
  def set_matchType(value: ReorderingRuleMatchType): Unit
  
  def set_matchValue(value: String): Unit
}
object ReorderingRule {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
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
  
  extension [Self <: ReorderingRule](x: Self) {
    
    inline def setGet_boost(value: () => Double): Self = StObject.set(x, "get_boost", js.Any.fromFunction0(value))
    
    inline def setGet_matchType(value: () => ReorderingRuleMatchType): Self = StObject.set(x, "get_matchType", js.Any.fromFunction0(value))
    
    inline def setGet_matchValue(value: () => String): Self = StObject.set(x, "get_matchValue", js.Any.fromFunction0(value))
    
    inline def setSet_boost(value: Double => Unit): Self = StObject.set(x, "set_boost", js.Any.fromFunction1(value))
    
    inline def setSet_matchType(value: ReorderingRuleMatchType => Unit): Self = StObject.set(x, "set_matchType", js.Any.fromFunction1(value))
    
    inline def setSet_matchValue(value: String => Unit): Self = StObject.set(x, "set_matchValue", js.Any.fromFunction1(value))
  }
}
