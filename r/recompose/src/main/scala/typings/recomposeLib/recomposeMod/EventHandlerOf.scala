package typings
package recomposeLib.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// createEventHandler: https://github.com/acdlite/recompose/blob/master/docs/API.md#createEventHandler
trait EventHandlerOf[T, TSubs /* <: Subscribable[T] */] extends js.Object {
  var handler: js.Function1[/* value */ T, scala.Unit]
  var stream: TSubs
}

