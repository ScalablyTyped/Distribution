package typings.sharedworker

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SharedWorker")
@js.native
class SharedWorker protected ()
  extends typings.sharedworker.SharedWorkerNs.SharedWorker {
  /***
    *
    * @param {string} stringUrl    Pathname to JavaScript file
    * @param {string} name         Name of the worker to execute
    */
  def this(stringUrl: String) = this()
  def this(stringUrl: String, name: String) = this()
}

@JSGlobal("SharedWorker")
@js.native
object SharedWorker
  extends /***
  *
  * @param {string} stringUrl    Pathname to JavaScript file
  * @param {string} name         Name of the worker to execute
  */
Instantiable1[/* stringUrl */ String, typings.sharedworker.SharedWorkerNs.SharedWorker]
     with Instantiable2[
      /* stringUrl */ String, 
      /* name */ String, 
      typings.sharedworker.SharedWorkerNs.SharedWorker
    ]

