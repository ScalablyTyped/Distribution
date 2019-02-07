package typings
package reactDashBootstrapDashTypeaheadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBootstrapDashTypeaheadMod {
  type AllTypeaheadOwnAndInjectedProps[T /* <: TypeaheadModel */] = TypeaheadProps[T] with TypeaheadContainerProps[T]
  type HintedInputContext[T /* <: TypeaheadModel */] = stdLib.Pick[TypeaheadContext[T], HintedInputContextKeys]
  type HintedInputContextKeys = reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.hintText | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.initialItem | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onAdd | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.selectHintOnEnter
  type InputProps = Omit[
    reactLib.reactMod.ReactNs.InputHTMLAttributes[
      reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.input
    ], 
    reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onBlur | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onChange | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onFocus | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onKeyDown
  ]
  type MenuHeaderProps = Omit[
    reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.li], 
    reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.className
  ]
  type MenuItemContext[T /* <: TypeaheadModel */] = stdLib.Pick[TypeaheadContext[T], MenuItemContextKeys]
  type MenuItemContextKeys = reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.activeIndex | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.isOnlyResult | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onActiveItemChange | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onInitialItemChange | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onMenuItemClick
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type OverlayTypeaheadProps = stdLib.Pick[
    TypeaheadProps[js.Any], 
    reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.align | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.dropup | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.flip | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onMenuHide | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onMenuShow | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onMenuToggle
  ]
  type StringPropertyNames[T /* <: js.Object */] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: K}[keyof T] */ js.Any
  type TypeaheadAlign = reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.justify | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.left | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.right
  type TypeaheadBsSizes = reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.large | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.lg | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.small | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.sm
  type TypeaheadInputPropKeys = reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.bsSize | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.disabled | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.inputProps | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.labelKey | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.multiple | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onBlur | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onChange | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onFocus | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onKeyDown | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.placeholder | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.renderToken | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.selected
  type TypeaheadInputProps[T /* <: TypeaheadModel */] = stdLib.Pick[TypeaheadProps[T], TypeaheadInputPropKeys]
  type TypeaheadLabelKey[T /* <: TypeaheadModel */] = StringPropertyNames[T] | (js.Function1[/* option */ T, java.lang.String])
  type TypeaheadMenuPropsPick = reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.labelKey | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.newSelectionPrefix | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.options | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.renderMenuItemChildren
  type TypeaheadModel = java.lang.String | js.Object
  type TypeaheadResult[T /* <: TypeaheadModel */] = T with reactDashBootstrapDashTypeaheadLib.Anon_CustomOption
}
