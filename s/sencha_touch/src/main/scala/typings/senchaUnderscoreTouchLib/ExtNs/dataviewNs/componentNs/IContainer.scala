package typings
package senchaUnderscoreTouchLib.ExtNs.dataviewNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContainer
  extends senchaUnderscoreTouchLib.ExtNs.IContainer

object IContainer {
  @scala.inline
  def apply(IContainer: senchaUnderscoreTouchLib.ExtNs.IContainer = null, destroy: () => scala.Unit = null): IContainer = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[IContainer]
  }
}

