package typings
package reactDashBootstrapDashTypeaheadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBootstrapDashTypeaheadMod {
  type AllTypeaheadOwnAndInjectedProps[T /* <: TypeaheadModel */] = TypeaheadProps[T] with TypeaheadContainerProps[T]
  type HintedInputContext[T /* <: TypeaheadModel */] = stdLib.Pick[TypeaheadContext[T], HintedInputContextKeys]
  type InputProps = Omit[
    reactLib.reactMod.InputHTMLAttributes[
      reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.input
    ], 
    reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onBlur | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onChange | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onFocus | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onKeyDown
  ]
  type MenuHeaderProps = Omit[
    reactLib.reactMod.HTMLProps[reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.li], 
    reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.className
  ]
  type MenuItemContext[T /* <: TypeaheadModel */] = stdLib.Pick[TypeaheadContext[T], MenuItemContextKeys]
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type OverlayTypeaheadProps = stdLib.Pick[
    TypeaheadProps[js.Any], 
    reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.align | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.dropup | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.flip | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onMenuHide | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onMenuShow | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.onMenuToggle
  ]
  type StringPropertyNames[T /* <: js.Object */] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: K}[keyof T] */ js.Any
  type TypeaheadInputProps[T /* <: TypeaheadModel */] = stdLib.Pick[TypeaheadProps[T], TypeaheadInputPropKeys]
  type TypeaheadLabelKey[T /* <: TypeaheadModel */] = StringPropertyNames[T] | (js.Function1[/* option */ T, java.lang.String])
  type TypeaheadModel = java.lang.String | js.Object
  type TypeaheadResult[T /* <: TypeaheadModel */] = T with reactDashBootstrapDashTypeaheadLib.Anon_CustomOption
}
