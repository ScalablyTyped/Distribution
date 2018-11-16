package typings
package runDashSequenceLib.runDashSequenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRunSequence extends js.Object {
  def apply(
    streams: (java.lang.String | js.Array[java.lang.String] | gulpLib.gulpMod.GulpClientNs.TaskCallback)*
  ): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def use(gulp: gulpLib.gulpMod.GulpClientNs.Gulp): IRunSequence = js.native
}

