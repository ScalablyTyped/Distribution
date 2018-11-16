package typings
package reactDashTrackingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashTrackingMod {
  type Track[T, P, S] = js.Function2[
    /* trackingInfo */ js.UndefOr[TrackingInfo[stdLib.Pick[T, java.lang.String], P, S]], 
    /* options */ js.UndefOr[Options[stdLib.Partial[T]]], 
    reactDashTrackingLib.Decorator
  ]
  type TrackingInfo[T, P, S] = T | (js.Function3[/* props */ P, /* state */ S, /* args */ js.Any, T])
}
