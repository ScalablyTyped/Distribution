package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#createeventhandler
@JSImport("recompose/createEventHandler", JSImport.Namespace)
@js.native
object createEventHandlerMod extends js.Object {
  def createEventHandlerWithConfig(config: recomposeLib.recomposeMod.ObservableConfig): js.Function0[
    recomposeLib.recomposeMod.EventHandlerOf[_, recomposeLib.recomposeMod.Subscribable[_]]
  ] = js.native
  def default[T, TSubs /* <: recomposeLib.recomposeMod.Subscribable[T] */](): recomposeLib.recomposeMod.EventHandlerOf[T, TSubs] = js.native
}

