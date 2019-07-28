package typings.recompose

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#setstatic
@JSImport("recompose/setStatic", JSImport.Namespace)
@js.native
object setStaticMod extends js.Object {
  def default(key: String, value: js.Any): js.Function1[/* component */ ComponentType[_], ComponentType[_]] = js.native
}

