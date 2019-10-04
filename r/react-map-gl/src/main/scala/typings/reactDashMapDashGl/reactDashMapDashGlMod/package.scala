package typings.reactDashMapDashGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMapDashGlMod {
  import typings.std.Partial

  type ContextViewStateChangeHandler = js.Function1[/* info */ ContextViewStateChangeInfo, Unit]
  type ContextViewportChangeHandler = js.Function3[
    /* viewState */ ViewportProps, 
    /* interactionState */ ExtraState, 
    /* oldViewState */ ViewportProps, 
    Unit
  ]
  type EasingFunction = js.Function1[/* t */ Double, Double]
  type EventManager = js.Any
  type MapStateProps = Partial[ViewportProps with InteractiveState]
  type SVGRedrawOptions = HTMLRedrawOptions
  type ViewStateChangeHandler = js.Function1[/* info */ ViewStateChangeInfo, Unit]
  type ViewportChangeHandler = js.Function1[/* viewState */ ViewportProps, Unit]
}
