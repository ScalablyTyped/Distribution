package typings
package reactDashMdLib.libSelectFieldsSelectFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(reactDashMdLib.libTextFieldsTextFieldMod.SharedTextFieldProps because Would inherit conflicting mutable fields List(block, fullWidth))*/
trait SharedSelectFieldProps
  extends reactDashMdLib.libMenusMenuMod.BaseMenuProps {
  var defaultValue: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var deleteKeys: js.UndefOr[scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String])] = js.undefined
  var dropdownIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var getItemProps: js.UndefOr[js.Function1[/* data */ js.Object, js.Object]] = js.undefined
  var itemLabel: js.UndefOr[java.lang.String] = js.undefined
  var itemProps: js.UndefOr[java.lang.String] = js.undefined
  var itemValue: js.UndefOr[java.lang.String] = js.undefined
  var keyboardMatchingTimeout: js.UndefOr[scala.Double] = js.undefined
  var menuId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var menuItems: js.UndefOr[
    js.Array[
      scala.Double | java.lang.String | js.Object | reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  var menuTransitionEnterTimeout: js.UndefOr[scala.Double] = js.undefined
  var menuTransitionLeaveTiemout: js.UndefOr[scala.Double] = js.undefined
  var menuTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function4[
      /* value */ scala.Double | java.lang.String, 
      /* selectedIndex */ scala.Double, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ FieldDataProps, 
      scala.Unit
    ]
  ] = js.undefined
  var onVisibilityChange: js.UndefOr[
    js.Function2[
      /* visible */ scala.Boolean, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var position: js.UndefOr[reactDashMdLib.libHelpersLayoverMod.LayoverPositions] = js.undefined
  var simplifiedMenu: js.UndefOr[scala.Boolean] = js.undefined
  var stripActiveItem: js.UndefOr[scala.Boolean] = js.undefined
  var toggleClassName: js.UndefOr[java.lang.String] = js.undefined
  var toggleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var toolbar: js.UndefOr[scala.Boolean] = js.undefined
  var transitionTime: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

