package typings.resourceLoader.resourceLoaderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Smaller version of the async library constructs.
  *
  * @namespace async
  */
object async {
  
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
  @JSImport("resource-loader", "async.eachSeries")
  @js.native
  def eachSeries(
    array: js.Array[_],
    iterator: js.Function1[/* repeated */ js.Any, _],
    callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  @JSImport("resource-loader", "async.eachSeries")
  @js.native
  def eachSeries(
    array: js.Array[_],
    iterator: js.Function1[/* repeated */ js.Any, _],
    callback: js.Function1[/* repeated */ js.Any, _],
    deferNext: Boolean
  ): Unit = js.native
  
  /**
    * Async queue implementation,
    *
    * @memberof async
    * @function queue
    * @param {function} worker - The worker function to call for each task.
    * @param {number} concurrency - How many workers to run in parrallel.
    * @return {*} The async queue object.
    */
  @JSImport("resource-loader", "async.queue")
  @js.native
  def queue(worker: js.Function1[/* repeated */ js.Any, _], concurrency: Double): js.Any = js.native
}
