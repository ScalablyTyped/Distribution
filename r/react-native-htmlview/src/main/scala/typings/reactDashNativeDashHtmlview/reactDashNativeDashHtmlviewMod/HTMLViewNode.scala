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
    val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLViewNode]
  }
}

