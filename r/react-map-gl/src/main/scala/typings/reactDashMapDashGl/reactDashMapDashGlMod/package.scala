package typings.reactDashMapDashGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMapDashGlMod {
  import typings.std.Partial

  type EasingFunction = js.Function1[/* t */ Double, Double]
  type EventManager = js.Any
  type MapStateProps = Partial[ViewportProps with InteractiveState]
  type SVGRedrawOptions = HTMLRedrawOptions
  type ViewStateChangeHandler = js.Function1[/* info */ ViewStateChangeInfo, Unit]
  type ViewportChangeHandler = js.Function1[/* viewState */ ViewState, Unit]
}
