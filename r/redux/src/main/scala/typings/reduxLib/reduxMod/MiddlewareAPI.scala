package typings
package reduxLib.reduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareAPI[D /* <: Dispatch[AnyAction] */, S] extends js.Object {
  var dispatch: D
  def getState(): S
}

