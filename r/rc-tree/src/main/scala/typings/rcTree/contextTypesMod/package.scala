package typings.rcTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object contextTypesMod {
  type NodeDragEventHandler = js.Function2[
    /* e */ typings.react.mod.MouseEvent[typings.std.HTMLDivElement, typings.react.mod.NativeMouseEvent], 
    /* node */ typings.rcTree.interfaceMod.NodeInstance, 
    scala.Unit
  ]
  type NodeMouseEventHandler = js.Function2[
    /* e */ typings.react.mod.MouseEvent[typings.std.HTMLDivElement, typings.react.mod.NativeMouseEvent], 
    /* node */ typings.rcTree.interfaceMod.EventDataNode, 
    scala.Unit
  ]
}
