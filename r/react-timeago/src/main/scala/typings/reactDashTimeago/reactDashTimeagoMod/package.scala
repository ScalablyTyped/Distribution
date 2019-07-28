package typings.reactDashTimeago

import typings.react.reactMod.Component
import typings.react.reactMod.ComponentProps
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashTimeagoMod {
  type Formatter = js.Function5[
    /* value */ Double, 
    /* unit */ Unit, 
    /* suffix */ Suffix, 
    /* epochMiliseconds */ Double, 
    /* nextFormatter */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object
    ], 
    ReactNode
  ]
  type ReactTimeago[T /* <: ComponentType[js.Object] */] = Component[ReactTimeagoProps[T] with ComponentProps[T], js.Object, js.Any]
}
