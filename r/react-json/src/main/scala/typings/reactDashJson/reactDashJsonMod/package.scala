package typings.reactDashJson

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashJsonMod {
  type Json = Component[JsonProperties, js.Object, js.Any]
  type OnChangeHandler = js.Function1[/* value */ js.Any, Unit]
}
