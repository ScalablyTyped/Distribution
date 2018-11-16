package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Partial) */ 
trait MapboxProps extends js.Object {
  var altitude: js.UndefOr[scala.Double] = js.undefined
  var attributionControl: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[js.Object] = js.undefined
  var height: scala.Double
  var mapStyle: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var mapboxApiAccessToken: js.UndefOr[java.lang.String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ MapError, scala.Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined
  var reuseMap: js.UndefOr[scala.Boolean] = js.undefined
  var reuseMaps: js.UndefOr[scala.Boolean] = js.undefined
  var transformRequest: js.UndefOr[
    js.Function2[
      /* url */ js.UndefOr[java.lang.String], 
      /* resourceType */ js.UndefOr[java.lang.String], 
      MapRequest
    ]
  ] = js.undefined
  var viewState: js.UndefOr[Viewport] = js.undefined
  var width: scala.Double
}

