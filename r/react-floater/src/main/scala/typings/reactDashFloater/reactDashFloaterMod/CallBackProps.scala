package typings.reactDashFloater.reactDashFloaterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallBackProps extends js.Object {
  var action: Action
  var props: Props
}

object CallBackProps {
  @scala.inline
  def apply(action: Action, props: Props): CallBackProps = {
    val __obj = js.Dynamic.literal(action = action, props = props)
  
    __obj.asInstanceOf[CallBackProps]
  }
}

