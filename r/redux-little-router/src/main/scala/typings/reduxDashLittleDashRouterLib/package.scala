package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashLittleDashRouterLib {
  type BlockCallback = js.Function2[
    /* location */ stdLib.Location, 
    /* action */ js.UndefOr[HistoryAction], 
    java.lang.String
  ]
  type ListenCallback = js.Function2[/* location */ stdLib.Location, /* action */ js.UndefOr[HistoryAction], scala.Unit]
  type Unsubscribe = js.Function0[scala.Unit]
}
