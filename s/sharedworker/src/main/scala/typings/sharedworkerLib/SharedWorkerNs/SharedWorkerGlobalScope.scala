package typings
package sharedworkerLib.SharedWorkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkerGlobalScope
  extends stdLib.Worker {
  def onconnect(event: stdLib.MessageEvent): scala.Unit = js.native
}

