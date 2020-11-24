package typings.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esCollectionMod {
  
  type CollectionCellGroupRenderer = js.Function1[
    /* params */ typings.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams, 
    js.Array[typings.react.mod.ReactNode]
  ]
  
  type CollectionCellRenderer = js.Function1[
    /* params */ typings.reactVirtualized.esCollectionMod.CollectionCellRendererParams, 
    typings.react.mod.ReactNode
  ]
  
  type CollectionCellSizeAndPositionGetter = js.Function1[
    /* params */ typings.reactVirtualized.mod.Index, 
    typings.reactVirtualized.esCollectionMod.CollectionCellSizeAndPosition
  ]
}
