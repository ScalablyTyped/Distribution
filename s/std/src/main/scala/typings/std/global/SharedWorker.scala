package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.WorkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SharedWorker")
@js.native
class SharedWorker protected ()
  extends typings.std.SharedWorker {
  def this(scriptURL: java.lang.String) = this()
  def this(scriptURL: java.lang.String, options: java.lang.String) = this()
  def this(scriptURL: java.lang.String, options: WorkerOptions) = this()
}

@JSGlobal("SharedWorker")
@js.native
object SharedWorker
  extends Instantiable1[/* scriptURL */ java.lang.String, typings.std.SharedWorker]
     with Instantiable2[
      /* scriptURL */ java.lang.String, 
      (/* options */ java.lang.String) | (/* options */ WorkerOptions), 
      typings.std.SharedWorker
    ]

