package typings.reactCalendarTimeline.anon

import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName extends js.Object {
  var className: String
  var ref: Ref[_]
  var style: CSSProperties
}

object ClassName {
  @scala.inline
  def apply(className: String, style: CSSProperties, ref: Ref[_] = null): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
}

