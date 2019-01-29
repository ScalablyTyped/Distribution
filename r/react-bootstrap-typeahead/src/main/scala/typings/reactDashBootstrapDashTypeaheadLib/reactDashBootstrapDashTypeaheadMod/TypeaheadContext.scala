package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeaheadContext[T /* <: TypeaheadModel */] extends js.Object {
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  var hintText: js.UndefOr[java.lang.String] = js.undefined
  var initialItem: js.UndefOr[T] = js.undefined
  var isOnlyResult: js.UndefOr[scala.Boolean] = js.undefined
  var onActiveItemChange: js.UndefOr[js.Function1[/* options */ T, scala.Unit]] = js.undefined
  var onAdd: js.UndefOr[js.Function1[/* option */ T, scala.Unit]] = js.undefined
  var onInitialItemChange: js.UndefOr[js.Function1[/* option */ T, scala.Unit]] = js.undefined
  var onMenuItemClick: js.UndefOr[js.Function2[/* option */ T, /* e */ reactLib.Event, scala.Unit]] = js.undefined
  var selectHintOnEnter: js.UndefOr[scala.Boolean] = js.undefined
}

