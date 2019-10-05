package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Worker")
@js.native
class WorkerCls protected () extends Worker {
  def this(stringUrl: java.lang.String) = this()
  def this(stringUrl: URL) = this()
  def this(stringUrl: java.lang.String, options: WorkerOptions) = this()
  def this(stringUrl: URL, options: WorkerOptions) = this()
}

