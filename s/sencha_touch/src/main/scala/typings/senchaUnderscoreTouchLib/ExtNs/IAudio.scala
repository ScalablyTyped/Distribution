package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAudio extends IMedia {
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_IAudio: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_IAudio: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

object IAudio {
  @scala.inline
  def apply(
    IMedia: IMedia = null,
    cls: js.Any = null,
    getCls: js.Function0[java.lang.String] = null,
    getUrl: js.Function0[java.lang.String] = null,
    setCls: js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setUrl: js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit] = null,
    url: java.lang.String = null
  ): IAudio = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IMedia)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (getCls != null) __obj.updateDynamic("getCls")(getCls)
    if (getUrl != null) __obj.updateDynamic("getUrl")(getUrl)
    if (setCls != null) __obj.updateDynamic("setCls")(setCls)
    if (setUrl != null) __obj.updateDynamic("setUrl")(setUrl)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IAudio]
  }
}

