package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.WorkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Worker")
@js.native
class Worker protected ()
  extends typings.std.Worker {
  def this(stringUrl: java.lang.String) = this()
  def this(stringUrl: typings.std.URL) = this()
  def this(stringUrl: java.lang.String, options: WorkerOptions) = this()
  def this(stringUrl: typings.std.URL, options: WorkerOptions) = this()
}

@JSGlobal("Worker")
@js.native
object Worker
  extends Instantiable1[
      (/* stringUrl */ java.lang.String) | (/* stringUrl */ typings.std.URL), 
      typings.std.Worker
    ]
     with Instantiable2[
      (/* stringUrl */ java.lang.String) | (/* stringUrl */ typings.std.URL), 
      /* options */ WorkerOptions, 
      typings.std.Worker
    ]

