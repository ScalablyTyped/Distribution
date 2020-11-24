package typings.reactTimeago

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Formatter = js.Function5[
    /* value */ scala.Double, 
    /* unit */ typings.reactTimeago.mod.Unit, 
    /* suffix */ typings.reactTimeago.mod.Suffix, 
    /* epochMiliseconds */ scala.Double, 
    /* nextFormatter */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object
    ], 
    typings.react.mod.ReactNode
  ]
  
  type ReactTimeago[T /* <: typings.react.mod.ComponentType[js.Object] */] = typings.react.mod.Component[
    typings.reactTimeago.mod.ReactTimeagoProps[T] with typings.react.mod.ComponentProps[T], 
    js.Object, 
    js.Any
  ]
}
