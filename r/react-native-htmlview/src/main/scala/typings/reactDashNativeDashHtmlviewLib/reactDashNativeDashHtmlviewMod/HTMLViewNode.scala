package typings
package reactDashNativeDashHtmlviewLib.reactDashNativeDashHtmlviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLViewNode extends js.Object {
  var attribs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var data: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object HTMLViewNode {
  @scala.inline
  def apply(
    attribs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    data: java.lang.String = null,
    name: java.lang.String = null,
    `type`: java.lang.String = null
  ): HTMLViewNode = {
    val __obj = js.Dynamic.literal(attribs = attribs)
    if (data != null) __obj.updateDynamic("data")(data)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HTMLViewNode]
  }
}

