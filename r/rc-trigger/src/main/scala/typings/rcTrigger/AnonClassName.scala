package typings.rcTrigger

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: String
  var style: CSSProperties
}

object AnonClassName {
  @scala.inline
  def apply(className: String, style: CSSProperties): AnonClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClassName]
  }
}

