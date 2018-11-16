package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerContext extends Context {
  def accept(): scala.Unit = js.native
  def accept(options: sipDotJsLib.sipDotJsMod.SessionNs.AcceptOptions): scala.Unit = js.native
  def progress(): scala.Unit = js.native
  def progress(options: sipDotJsLib.sipDotJsMod.SessionNs.ProgressOptions): scala.Unit = js.native
  def reject(): scala.Unit = js.native
  def reject(options: sipDotJsLib.sipDotJsMod.SessionNs.CommonOptions): scala.Unit = js.native
  def reply(): scala.Unit = js.native
  def reply(options: sipDotJsLib.sipDotJsMod.SessionNs.CommonOptions): scala.Unit = js.native
}

