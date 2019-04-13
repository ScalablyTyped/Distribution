package typings
package qDashIoLib.QioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForEachCallback extends js.Object {
  def apply(chunk: java.lang.String): qLib.qMod.Promise[_] = js.native
  def apply(chunk: nodeLib.Buffer): qLib.qMod.Promise[_] = js.native
}

