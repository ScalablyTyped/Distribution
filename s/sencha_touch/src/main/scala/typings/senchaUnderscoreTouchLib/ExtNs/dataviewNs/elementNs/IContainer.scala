package typings
package senchaUnderscoreTouchLib.ExtNs.dataviewNs.elementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContainer
  extends senchaUnderscoreTouchLib.ExtNs.IComponent

object IContainer {
  @scala.inline
  def apply(
    IComponent: senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    destroy: js.Function0[scala.Unit] = null
  ): IContainer = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    __obj.asInstanceOf[IContainer]
  }
}

