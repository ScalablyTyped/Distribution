package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer extends js.Object {
  def complete(res: CompletedResult): scala.Unit = js.native
  def error(err: java.lang.String): scala.Unit = js.native
  def error(err: Error): scala.Unit = js.native
  def next(res: Next): scala.Unit = js.native
}

