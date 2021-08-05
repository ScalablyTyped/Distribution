package typings.resourceLoader.resourceLoaderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Smaller version of the async library constructs.
  *
  * @namespace async
  */
object async {
  
  @JSImport("resource-loader", "async")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Iterates an array in series.
    *
    * @memberof async
    * @function eachSeries
    * @param {Array.<*>} array - Array to iterate.
    * @param {function} iterator - Function to call for each element.
    * @param {function} callback - Function to call when done, or on error.
    * @param {boolean} [deferNext=false] - Break synchronous each loop by calling next with a setTimeout of 1.
    */
  inline def eachSeries(
    array: js.Array[js.Any],
    iterator: js.Function1[/* repeated */ js.Any, js.Any],
    callback: js.Function1[/* repeated */ js.Any, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachSeries")(array.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def eachSeries(
    array: js.Array[js.Any],
    iterator: js.Function1[/* repeated */ js.Any, js.Any],
    callback: js.Function1[/* repeated */ js.Any, js.Any],
    deferNext: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachSeries")(array.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], deferNext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Async queue implementation,
    *
    * @memberof async
    * @function queue
    * @param {function} worker - The worker function to call for each task.
    * @param {number} concurrency - How many workers to run in parrallel.
    * @return {*} The async queue object.
    */
  inline def queue(worker: js.Function1[/* repeated */ js.Any, js.Any], concurrency: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("queue")(worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
