package typings.reactDashInlinesvg.reactDashInlinesvgMod

import typings.react.reactMod.ReactNode
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
    val __obj = js.Dynamic.literal(content = content, hasCache = hasCache, status = status)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
}

