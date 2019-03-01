package typings
package senchaUnderscoreTouchLib.ExtNs.scrollNs.indicatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRounded extends IAbstract {
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_IRounded: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_IRounded: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

object IRounded {
  @scala.inline
  def apply(
    IAbstract: IAbstract = null,
    cls: js.Any = null,
    getCls: js.Function0[java.lang.String] = null,
    setCls: js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit] = null
  ): IRounded = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IAbstract)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (getCls != null) __obj.updateDynamic("getCls")(getCls)
    if (setCls != null) __obj.updateDynamic("setCls")(setCls)
    __obj.asInstanceOf[IRounded]
  }
}

