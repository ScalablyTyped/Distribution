package typings.reactDashCalendarDashTimeline

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: String
  var ref: Ref[_]
  var style: CSSProperties
}

object Anon_ClassName {
  @scala.inline
  def apply(className: String, style: CSSProperties, ref: Ref[_] = null): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName]
  }
}

