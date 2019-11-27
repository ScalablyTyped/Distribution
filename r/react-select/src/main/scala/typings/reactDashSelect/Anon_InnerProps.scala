package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InnerProps extends js.Object {
  /** Props that will be passed on to the children. */
  var innerProps: js.Any
  /** The focused state of the select. */
  var isFocused: Boolean
  /** Whether the text is right to left */
  var isRtl: Boolean
  /** Set size of the container. */
  var size: Double
}

object Anon_InnerProps {
  @scala.inline
  def apply(innerProps: js.Any, isFocused: Boolean, isRtl: Boolean, size: Double): Anon_InnerProps = {
    val __obj = js.Dynamic.literal(innerProps = innerProps.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_InnerProps]
  }
}

