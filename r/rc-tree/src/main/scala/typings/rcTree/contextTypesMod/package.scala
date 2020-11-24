package typings.rcTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object contextTypesMod {
  
  type NodeDragEventHandler[T] = js.Function2[
    /* e */ typings.react.mod.MouseEvent[T, typings.react.mod.NativeMouseEvent], 
    /* node */ typings.rcTree.interfaceMod.NodeInstance, 
    scala.Unit
  ]
  
  type NodeMouseEventHandler[T] = js.Function2[
    /* e */ typings.react.mod.MouseEvent[T, typings.react.mod.NativeMouseEvent], 
    /* node */ typings.rcTree.interfaceMod.EventDataNode, 
    scala.Unit
  ]
}
