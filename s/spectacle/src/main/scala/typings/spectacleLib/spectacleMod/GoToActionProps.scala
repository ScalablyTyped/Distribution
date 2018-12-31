package typings
package spectacleLib.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoToActionProps extends js.Object {
  var margin: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var padding: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var render: js.UndefOr[
    js.Function1[
      /* goToSlide */ js.UndefOr[js.Function1[/* slide */ scala.Double | java.lang.String, scala.Unit]], 
      scala.Unit
    ]
  ] = js.undefined
  var slide: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

