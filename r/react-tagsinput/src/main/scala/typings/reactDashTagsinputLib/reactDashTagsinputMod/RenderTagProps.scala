package typings
package reactDashTagsinputLib.reactDashTagsinputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderTagProps extends TagProps {
  val disabled: scala.Boolean
  val tag: reactDashTagsinputLib.Tag
  def getTagDisplayValue(tag: reactDashTagsinputLib.Tag): java.lang.String
  def onRemove(tagIndex: scala.Double): scala.Unit
}

object RenderTagProps {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    getTagDisplayValue: reactDashTagsinputLib.Tag => java.lang.String,
    onRemove: scala.Double => scala.Unit,
    tag: reactDashTagsinputLib.Tag,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): RenderTagProps = {
    val __obj = js.Dynamic.literal(disabled = disabled, getTagDisplayValue = js.Any.fromFunction1(getTagDisplayValue), onRemove = js.Any.fromFunction1(onRemove), tag = tag)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RenderTagProps]
  }
}

