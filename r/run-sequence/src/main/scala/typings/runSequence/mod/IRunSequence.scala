package typings.runSequence.mod

import typings.gulp.mod.Gulp
import typings.gulp.mod.TaskCallback
import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRunSequence extends js.Object {
  def apply(streams: (String | js.Array[String] | TaskCallback)*): ReadWriteStream = js.native
  def use(gulp: Gulp): IRunSequence = js.native
}

