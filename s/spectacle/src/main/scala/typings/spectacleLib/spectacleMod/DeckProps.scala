package typings
package spectacleLib.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeckProps extends js.Object {
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var autoplayDuration: js.UndefOr[scala.Double] = js.undefined
  var autoplayLoop: js.UndefOr[scala.Boolean] = js.undefined
  var autoplayOnStart: js.UndefOr[scala.Boolean] = js.undefined
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  var globalStyles: js.UndefOr[scala.Boolean] = js.undefined
  var history: js.UndefOr[js.Any] = js.undefined
  var onStateChange: js.UndefOr[
    js.Function2[
      /* previousState */ js.UndefOr[java.lang.String], 
      /* nextState */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var progress: js.UndefOr[progressType] = js.undefined
   // Needs a type, see https://github.com/ReactTraining/history
  var showFullscreenControl: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var transition: js.UndefOr[coreDashJsLib.Array[transitionType]] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
}

