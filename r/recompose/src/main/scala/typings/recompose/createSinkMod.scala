package typings.recompose

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#createsink
@JSImport("recompose/createSink", JSImport.Namespace)
@js.native
object createSinkMod extends js.Object {
  def default(callback: js.Function1[/* props */ js.Object, Unit]): ComponentClass[_, ComponentState] = js.native
}

