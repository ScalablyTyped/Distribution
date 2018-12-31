package typings
package reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeoutProperties extends js.Object {
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var buttonWidth: js.UndefOr[scala.Double] = js.undefined
  var close: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var left: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.undefined
  var onClose: js.UndefOr[
    js.Function3[
      /* sectionId */ scala.Double, 
      /* rowId */ scala.Double, 
      /* direction */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var onOpen: js.UndefOr[
    js.Function3[
      /* sectionId */ scala.Double, 
      /* rowId */ scala.Double, 
      /* direction */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var openLeft: js.UndefOr[scala.Boolean] = js.undefined
  var openRight: js.UndefOr[scala.Boolean] = js.undefined
  var right: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.undefined
  var rowId: js.UndefOr[scala.Double] = js.undefined
  var scroll: js.UndefOr[js.Function1[/* scrollEnabled */ scala.Boolean, scala.Unit]] = js.undefined
  var sectionId: js.UndefOr[scala.Double] = js.undefined
  var sensitivity: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

