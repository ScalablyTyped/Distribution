package typings.senchaUnderscoreTouch.ExtNs.dataviewNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContainer
  extends typings.senchaUnderscoreTouch.ExtNs.IContainer

object IContainer {
  @scala.inline
  def apply(IContainer: typings.senchaUnderscoreTouch.ExtNs.IContainer = null, destroy: () => Unit = null): IContainer = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[IContainer]
  }
}

