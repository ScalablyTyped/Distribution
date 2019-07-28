package typings.reactDashFlatpickr

import typings.react.reactMod.Component
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashFlatpickrMod {
  type DatePicker = Component[DateTimePickerProps, js.Object, js.Any]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
