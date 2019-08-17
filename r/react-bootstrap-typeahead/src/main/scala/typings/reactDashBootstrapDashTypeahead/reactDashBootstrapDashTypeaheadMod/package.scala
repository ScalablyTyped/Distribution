package typings.reactDashBootstrapDashTypeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBootstrapDashTypeaheadMod {
  import typings.react.reactMod.HTMLProps
  import typings.react.reactMod.InputHTMLAttributes
  import typings.reactDashBootstrapDashTypeahead.Anon_CustomOption
  import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.align
  import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.className
  import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.dropup
  import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.flip
  import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.input
  import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.li
  import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.onBlur
  import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.onChange
  import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.onFocus
  import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.onKeyDown
  import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.onMenuHide
  import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.onMenuShow
  import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.onMenuToggle
  import typings.std.Exclude
  import typings.std.Pick

  type AllTypeaheadOwnAndInjectedProps[T /* <: TypeaheadModel */] = TypeaheadProps[T] with TypeaheadContainerProps[T]
  type HintedInputContext[T /* <: TypeaheadModel */] = Pick[TypeaheadContext[T], HintedInputContextKeys]
  type InputProps = Omit[InputHTMLAttributes[input], onBlur | onChange | onFocus | onKeyDown]
  type MenuHeaderProps = Omit[HTMLProps[li], className]
  type MenuItemContext[T /* <: TypeaheadModel */] = Pick[TypeaheadContext[T], MenuItemContextKeys]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type OverlayTypeaheadProps = Pick[
    TypeaheadProps[js.Any], 
    align | dropup | flip | onMenuHide | onMenuShow | onMenuToggle
  ]
  type StringPropertyNames[T /* <: js.Object */] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends string? K : never}[keyof T] */ js.Any
  type TypeaheadInputProps[T /* <: TypeaheadModel */] = Pick[TypeaheadProps[T], TypeaheadInputPropKeys]
  type TypeaheadLabelKey[T /* <: TypeaheadModel */] = StringPropertyNames[T] | (js.Function1[/* option */ T, String])
  type TypeaheadModel = String | js.Object
  type TypeaheadResult[T /* <: TypeaheadModel */] = T with Anon_CustomOption
}
