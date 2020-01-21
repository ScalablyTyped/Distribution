package typings.reactCalendarTimeline

import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: String
  var ref: Ref[_]
  var style: CSSProperties
}

object AnonClassName {
  @scala.inline
  def apply(className: String, style: CSSProperties, ref: Ref[_] = null): AnonClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName]
  }
}

