package typings.reactNativeCalendarPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DateChangedCallback = js.Function1[/* date */ typings.moment.mod.Moment, scala.Unit]
  type DisabledDatesFunc = js.Function1[/* date */ typings.moment.mod.Moment, scala.Boolean]
  type MomentParsable = typings.moment.mod.MomentInput
  type SwipeCallback = js.Function1[
    /* swipeDirection */ typings.reactNativeCalendarPicker.mod.SwipeDirection, 
    scala.Unit
  ]
}
