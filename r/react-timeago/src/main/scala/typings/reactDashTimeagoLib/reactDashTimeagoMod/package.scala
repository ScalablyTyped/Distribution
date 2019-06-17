package typings
package reactDashTimeagoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashTimeagoMod {
  type Formatter = js.Function5[
    /* value */ scala.Double, 
    /* unit */ Unit, 
    /* suffix */ Suffix, 
    /* epochMiliseconds */ scala.Double, 
    /* nextFormatter */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object
    ], 
    reactLib.reactMod.ReactNode
  ]
  type ReactTimeago[T /* <: reactLib.reactMod.ComponentType[js.Object] */] = reactLib.reactMod.Component[ReactTimeagoProps[T] with reactLib.reactMod.ComponentProps[T], js.Object, js.Any]
}
