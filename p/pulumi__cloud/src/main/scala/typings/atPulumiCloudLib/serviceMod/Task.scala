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
  def run(): stdLib.Promise[scala.Unit] = js.native
  /**
       * Run the task, passing in additional task run options.
       */
  def run(options: TaskRunOptions): stdLib.Promise[scala.Unit] = js.native
}

