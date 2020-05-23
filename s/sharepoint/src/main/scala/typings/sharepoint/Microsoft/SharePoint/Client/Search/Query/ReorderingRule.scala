package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReorderingRule extends ClientValueObject {
  def get_boost(): Double
  def get_matchType(): ReorderingRuleMatchType
  def get_matchValue(): String
  def set_boost(value: Double): Unit
  def set_matchType(value: ReorderingRuleMatchType): Unit
  def set_matchValue(value: String): Unit
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
}

