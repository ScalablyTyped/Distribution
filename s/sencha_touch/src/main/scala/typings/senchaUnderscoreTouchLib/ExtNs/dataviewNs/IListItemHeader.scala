package typings
package senchaUnderscoreTouchLib.ExtNs.dataviewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListItemHeader
  extends senchaUnderscoreTouchLib.ExtNs.IComponent

object IListItemHeader {
  @scala.inline
  def apply(
    IComponent: senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    baseCls: java.lang.String = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null
  ): IListItemHeader = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    __obj.asInstanceOf[IListItemHeader]
  }
}

