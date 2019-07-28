package typings.runDashSequence.runDashSequenceMod

import typings.gulp.gulpMod.Gulp
import typings.gulp.gulpMod.TaskCallback
import typings.node.NodeJSNs.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRunSequence extends js.Object {
  def apply(streams: (String | js.Array[String] | TaskCallback)*): ReadWriteStream = js.native
  def use(gulp: Gulp): IRunSequence = js.native
}

