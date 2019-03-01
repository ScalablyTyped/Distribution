package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabel extends IComponent {
  /** [Config Option] (String) */
  @JSName("html")
  var html_ILabel: js.UndefOr[java.lang.String] = js.undefined
}

object ILabel {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    baseCls: java.lang.String = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    html: java.lang.String = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null
  ): ILabel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (html != null) __obj.updateDynamic("html")(html)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    __obj.asInstanceOf[ILabel]
  }
}

