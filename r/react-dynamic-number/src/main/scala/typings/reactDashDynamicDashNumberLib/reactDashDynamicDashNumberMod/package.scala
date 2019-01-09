package typings
package reactDashDynamicDashNumberLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDynamicDashNumberMod {
  type BaseInputProps = stdLib.Partial[
    Omit[
      reactLib.reactMod.ReactNs.DetailedHTMLProps[
        reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement], 
        reactLib.HTMLInputElement
      ], 
      reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.ref | reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.value | reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.onChange | reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.placeholder
    ]
  ]
  type DynamicNumber = reactLib.reactMod.Component[DynamicNumberProps, js.Object, js.Any]
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[
    T, 
    /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
