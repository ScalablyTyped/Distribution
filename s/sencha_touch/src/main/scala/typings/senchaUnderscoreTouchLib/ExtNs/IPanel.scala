package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel extends IContainer {
  /** [Config Option] (Number/Boolean/String) */
  var bodyBorder: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/Boolean/String) */
  var bodyMargin: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/Boolean/String) */
  var bodyPadding: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of bodyBorder
  		* @returns Number/Boolean/String
  		*/
  var getBodyBorder: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of bodyMargin
  		* @returns Number/Boolean/String
  		*/
  var getBodyMargin: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of bodyPadding
  		* @returns Number/Boolean/String
  		*/
  var getBodyPadding: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of bodyBorder
  		* @param bodyBorder Number/Boolean/String The new value.
  		*/
  var setBodyBorder: js.UndefOr[js.Function1[/* bodyBorder */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of bodyMargin
  		* @param bodyMargin Number/Boolean/String The new value.
  		*/
  var setBodyMargin: js.UndefOr[js.Function1[/* bodyMargin */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of bodyPadding
  		* @param bodyPadding Number/Boolean/String The new value.
  		*/
  var setBodyPadding: js.UndefOr[js.Function1[/* bodyPadding */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IPanel {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    baseCls: java.lang.String = null,
    bodyBorder: js.Any = null,
    bodyMargin: js.Any = null,
    bodyPadding: js.Any = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getBodyBorder: js.Function0[_] = null,
    getBodyMargin: js.Function0[_] = null,
    getBodyPadding: js.Function0[_] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setBodyBorder: js.Function1[/* bodyBorder */ js.UndefOr[js.Any], scala.Unit] = null,
    setBodyMargin: js.Function1[/* bodyMargin */ js.UndefOr[js.Any], scala.Unit] = null,
    setBodyPadding: js.Function1[/* bodyPadding */ js.UndefOr[js.Any], scala.Unit] = null
  ): IPanel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (bodyBorder != null) __obj.updateDynamic("bodyBorder")(bodyBorder)
    if (bodyMargin != null) __obj.updateDynamic("bodyMargin")(bodyMargin)
    if (bodyPadding != null) __obj.updateDynamic("bodyPadding")(bodyPadding)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getBodyBorder != null) __obj.updateDynamic("getBodyBorder")(getBodyBorder)
    if (getBodyMargin != null) __obj.updateDynamic("getBodyMargin")(getBodyMargin)
    if (getBodyPadding != null) __obj.updateDynamic("getBodyPadding")(getBodyPadding)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setBodyBorder != null) __obj.updateDynamic("setBodyBorder")(setBodyBorder)
    if (setBodyMargin != null) __obj.updateDynamic("setBodyMargin")(setBodyMargin)
    if (setBodyPadding != null) __obj.updateDynamic("setBodyPadding")(setBodyPadding)
    __obj.asInstanceOf[IPanel]
  }
}

