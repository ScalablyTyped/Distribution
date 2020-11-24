package typings.rcVirtualList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfaceMod {
  
  type GetKey[T] = js.Function1[/* item */ T, typings.react.mod.Key]
  
  type RenderFunc[T] = js.Function3[
    /* item */ T, 
    /* index */ scala.Double, 
    /* props */ typings.rcVirtualList.anon.Style, 
    typings.react.mod.ReactNode
  ]
}
