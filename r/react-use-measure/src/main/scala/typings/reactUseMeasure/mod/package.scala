package typings.reactUseMeasure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HTMLOrSVGElement = typings.std.HTMLElement | typings.std.SVGElement
  
  type ResizeObserverCallback = js.Function2[
    /* entries */ js.Array[js.Any], 
    /* observer */ typings.reactUseMeasure.mod.ResizeObserver, 
    scala.Unit
  ]
  
  type Result = js.Tuple3[
    js.Function1[
      /* element */ typings.reactUseMeasure.mod.HTMLOrSVGElement | scala.Null, 
      scala.Unit
    ], 
    typings.reactUseMeasure.mod.RectReadOnly, 
    js.Function0[scala.Unit]
  ]
}
