package typings.reactBootstrapTypeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AllTypeaheadOwnAndInjectedProps[T /* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */] = typings.reactBootstrapTypeahead.mod.TypeaheadProps[T] with typings.reactBootstrapTypeahead.mod.TypeaheadContainerProps[T]
  type HintedInputContext[T /* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */] = typings.std.Pick[
    typings.reactBootstrapTypeahead.mod.TypeaheadContext[T], 
    typings.reactBootstrapTypeahead.mod.HintedInputContextKeys
  ]
  type InputProps = typings.reactBootstrapTypeahead.mod.Omit[
    typings.react.mod.InputHTMLAttributes[typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.input], 
    typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.onBlur | typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.onChange | typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.onFocus | typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.onKeyDown
  ]
  type MenuHeaderProps = typings.reactBootstrapTypeahead.mod.Omit[
    typings.react.mod.HTMLProps[typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.li], 
    typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.className
  ]
  type MenuItemContext[T /* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */] = typings.std.Pick[
    typings.reactBootstrapTypeahead.mod.TypeaheadContext[T], 
    typings.reactBootstrapTypeahead.mod.MenuItemContextKeys
  ]
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type OverlayTypeaheadProps = typings.std.Pick[
    typings.reactBootstrapTypeahead.mod.TypeaheadProps[js.Any], 
    typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.align | typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.dropup | typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.flip | typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.onMenuHide | typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.onMenuShow | typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.onMenuToggle
  ]
  type StringPropertyNames[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends string? K : never}[keyof T] */ js.Any
  type TypeaheadInputProps[T /* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */] = typings.std.Pick[
    typings.reactBootstrapTypeahead.mod.TypeaheadProps[T], 
    typings.reactBootstrapTypeahead.mod.TypeaheadInputPropKeys
  ]
  type TypeaheadLabelKey[T /* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */] = typings.reactBootstrapTypeahead.mod.StringPropertyNames[T] | (js.Function1[/* option */ T, java.lang.String])
  type TypeaheadModel = java.lang.String | js.Object
  type TypeaheadResult[T /* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */] = T with typings.reactBootstrapTypeahead.AnonCustomOption
}
