package typings
package atRebassGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atRebassGridMod {
  type BoxComponent = styledDashComponentsLib.styledDashComponentsMod.StyledComponent[
    reactLib.reactMod.ReactNs.ForwardRefExoticComponent[stdLib.Partial[BoxProps]], 
    js.Any, 
    js.Object, 
    scala.Nothing
  ]
  type FlexComponent = styledDashComponentsLib.styledDashComponentsMod.StyledComponent[
    reactLib.reactMod.ReactNs.ForwardRefExoticComponent[stdLib.Partial[FlexProps]], 
    js.Any, 
    js.Object, 
    scala.Nothing
  ]
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[
    T, 
    /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  type ResponsiveProp = scala.Double | java.lang.String | (js.Array[java.lang.String | scala.Double])
}
