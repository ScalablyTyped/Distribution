package typings
package reactDashTableLib.libHocSelectTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SelectTableAdditionalProps extends js.Object {
  var SelectAllInputComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[SelectAllInputComponent]] = js.undefined
  var SelectInputComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[SelectInputComponentProps]] = js.undefined
  var isSelected: js.UndefOr[js.Function1[/* key */ java.lang.String, scala.Boolean]] = js.undefined
  /**
       * Default: _id
       */
  var keyField: js.UndefOr[java.lang.String] = js.undefined
  var selectAll: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Default: checkbox
       */
  var selectType: js.UndefOr[SelectType] = js.undefined
  var toggleAll: js.UndefOr[js.Function0[_]] = js.undefined
  var toggleSelection: js.UndefOr[
    js.Function3[/* key */ java.lang.String, /* shiftKeyPressed */ scala.Boolean, /* row */ js.Any, _]
  ] = js.undefined
}

