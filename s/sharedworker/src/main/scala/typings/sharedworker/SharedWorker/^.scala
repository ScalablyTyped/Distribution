package typings.sharedworker.SharedWorker

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.sharedworker.SharedWorkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SharedWorker")
@js.native
class ^ protected ()
  extends typings.sharedworker.SharedWorker.SharedWorker {
  /**
    *
    * @param {string} stringUrl                          Pathname to JavaScript file
    * @param {string|SharedWorkerOptions} [options]      Name of the worker to execute
    *                                                    or an object containing option properties
    */
  def this(stringUrl: String) = this()
  def this(stringUrl: String, options: String) = this()
  def this(stringUrl: String, options: SharedWorkerOptions) = this()
}

@JSGlobal("SharedWorker")
@js.native
object ^
  extends TopLevel[
      (/**
  *
  * @param {string} stringUrl                          Pathname to JavaScript file
  * @param {string|SharedWorkerOptions} [options]      Name of the worker to execute
  *                                                    or an object containing option properties
  */
Instantiable1[/* stringUrl */ String, typings.sharedworker.SharedWorker.SharedWorker]) with (Instantiable2[
        /* stringUrl */ String, 
        /* options */ String, 
        typings.sharedworker.SharedWorker.SharedWorker
      ]) with (Instantiable2[
        /* stringUrl */ String, 
        /* options */ SharedWorkerOptions, 
        typings.sharedworker.SharedWorker.SharedWorker
      ])
    ]

