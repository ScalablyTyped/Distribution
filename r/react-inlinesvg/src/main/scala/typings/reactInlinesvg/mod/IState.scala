package typings.reactInlinesvg.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  var content: String
  var element: ReactNode
  var hasCache: Boolean
  var status: String
}

object IState {
  @scala.inline
  def apply(content: String, hasCache: Boolean, status: String, element: ReactNode = null): IState = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], hasCache = hasCache.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
}

