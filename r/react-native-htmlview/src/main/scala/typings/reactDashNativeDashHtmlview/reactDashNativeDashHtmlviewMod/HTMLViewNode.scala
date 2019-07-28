package typings.reactDashNativeDashHtmlview.reactDashNativeDashHtmlviewMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLViewNode extends js.Object {
  var attribs: StringDictionary[String]
  var data: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object HTMLViewNode {
  @scala.inline
  def apply(attribs: StringDictionary[String], data: String = null, name: String = null, `type`: String = null): HTMLViewNode = {
    val __obj = js.Dynamic.literal(attribs = attribs)
    if (data != null) __obj.updateDynamic("data")(data)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HTMLViewNode]
  }
}

