package typings.reactJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Json = typings.react.mod.Component[typings.reactJson.mod.JsonProperties, js.Object, js.Any]
  type OnChangeHandler = js.Function1[/* value */ js.Any, scala.Unit]
}
