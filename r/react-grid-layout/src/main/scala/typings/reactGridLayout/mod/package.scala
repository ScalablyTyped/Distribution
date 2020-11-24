package typings.reactGridLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ItemCallback = js.Function6[
    /* layout */ js.Array[typings.reactGridLayout.mod.Layout], 
    /* oldItem */ typings.reactGridLayout.mod.Layout, 
    /* newItem */ typings.reactGridLayout.mod.Layout, 
    /* placeholder */ typings.reactGridLayout.mod.Layout, 
    /* event */ typings.std.MouseEvent, 
    /* element */ typings.std.HTMLElement, 
    scala.Unit
  ]
  
  type Layouts = org.scalablytyped.runtime.StringDictionary[js.Array[typings.reactGridLayout.mod.Layout]]
  
  type ReactGridLayout = typings.react.mod.Component[typings.reactGridLayout.mod.ReactGridLayoutProps, js.Object, js.Any]
}
