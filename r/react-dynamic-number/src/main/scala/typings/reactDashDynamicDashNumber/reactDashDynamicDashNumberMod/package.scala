package typings.reactDashDynamicDashNumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDynamicDashNumberMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod.DetailedHTMLProps
  import typings.react.reactMod.InputHTMLAttributes
  import typings.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.onChange
  import typings.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.placeholder
  import typings.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.ref
  import typings.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.value
  import typings.std.HTMLInputElement
  import typings.std.Partial
  import typings.std.Pick

  type BaseInputProps = Partial[
    Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      ref | value | onChange | placeholder
    ]
  ]
  type DynamicNumber = Component[DynamicNumberProps, js.Object, js.Any]
  type Omit[T, K /* <: String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
