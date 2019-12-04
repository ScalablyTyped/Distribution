package typings.reactDashDnd.libDecoratorsDecorateHandlerMod

import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handler[Props] extends js.Object {
  var ref: RefObject[_]
  def receiveProps(props: Props): Unit
}

object Handler {
  @scala.inline
  def apply[Props](receiveProps: Props => Unit, ref: RefObject[_]): Handler[Props] = {
    val __obj = js.Dynamic.literal(receiveProps = js.Any.fromFunction1(receiveProps), ref = ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Handler[Props]]
  }
}

