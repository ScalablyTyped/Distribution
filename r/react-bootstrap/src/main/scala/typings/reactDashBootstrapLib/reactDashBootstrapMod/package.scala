package typings
package reactDashBootstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBootstrapMod {
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[
    T, 
    /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  type Sizes = reactDashBootstrapLib.reactDashBootstrapLibStrings.xs | reactDashBootstrapLib.reactDashBootstrapLibStrings.xsmall | reactDashBootstrapLib.reactDashBootstrapLibStrings.sm | reactDashBootstrapLib.reactDashBootstrapLibStrings.small | reactDashBootstrapLib.reactDashBootstrapLibStrings.medium | reactDashBootstrapLib.reactDashBootstrapLibStrings.lg | reactDashBootstrapLib.reactDashBootstrapLibStrings.large
}
