package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  /**
    * Run the task, passing in additional task run options.
    */
  def run(): js.Promise[scala.Unit] = js.native
  def run(options: TaskRunOptions): js.Promise[scala.Unit] = js.native
}

