package typings.reactMapGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ContextViewStateChangeHandler = js.Function1[/* info */ typings.reactMapGl.mod.ContextViewStateChangeInfo, scala.Unit]
  type ContextViewportChangeHandler = js.Function3[
    /* viewState */ typings.reactMapGl.mod.ViewportProps, 
    /* interactionState */ typings.reactMapGl.mod.ExtraState, 
    /* oldViewState */ typings.reactMapGl.mod.ViewportProps, 
    scala.Unit
  ]
  type EasingFunction = js.Function1[/* t */ scala.Double, scala.Double]
  type EventManager = js.Any
  type SVGRedrawOptions = typings.reactMapGl.mod.HTMLRedrawOptions
  type ViewStateChangeHandler = js.Function1[/* info */ typings.reactMapGl.mod.ViewStateChangeInfo, scala.Unit]
  type ViewportChangeHandler = js.Function1[/* viewState */ typings.reactMapGl.mod.ViewportProps, scala.Unit]
}
