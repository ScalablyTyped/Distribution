package typings.reactThreeFiber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object canvasMod {
  
  type Camera = typings.three.mod.OrthographicCamera | typings.three.mod.PerspectiveCamera
  
  type ComputeOffsetsFunction = js.Function1[
    /* event */ typings.reactThreeFiber.canvasMod.DomEvent, 
    typings.reactThreeFiber.anon.OffsetX
  ]
  
  type FilterFunction = js.Function2[
    /* items */ js.Array[typings.three.raycasterMod.Intersection], 
    /* state */ typings.reactThreeFiber.canvasMod.SharedCanvasContext, 
    js.Array[typings.three.raycasterMod.Intersection]
  ]
  
  type RenderCallback = js.Function2[
    /* state */ typings.reactThreeFiber.canvasMod.CanvasContext, 
    /* delta */ scala.Double, 
    scala.Unit
  ]
  
  type ThreeEvent[T] = T with typings.reactThreeFiber.canvasMod.Intersection with typings.reactThreeFiber.anon.Camera[T]
  
  type ViewportData = typings.reactThreeFiber.canvasMod.Viewport with (js.Function2[
    /* camera */ typings.reactThreeFiber.canvasMod.Camera, 
    /* target */ typings.three.mod.Vector3, 
    typings.reactThreeFiber.canvasMod.Viewport
  ])
}
