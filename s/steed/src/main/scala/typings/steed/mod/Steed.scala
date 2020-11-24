package typings.steed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Steed extends js.Object {
  
  def each[T, E](arr: js.Array[T], iterator: SteedIterator[T, E]): Unit = js.native
  def each[T, E](arr: js.Array[T], iterator: SteedIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  def each[T, E](arr: Dictionary[T], iterator: SteedIterator[T, E]): Unit = js.native
  def each[T, E](arr: Dictionary[T], iterator: SteedIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  
  var eachSeries: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof steed.each */ js.Any = js.native
  
  def map[T, R, E](arr: js.Array[T], iterator: SteedResultIterator[T, R, E]): Unit = js.native
  def map[T, R, E](arr: js.Array[T], iterator: SteedResultIterator[T, R, E], callback: SteedResultArrayCallback[R, E]): Unit = js.native
  def map[T, R, E](arr: Dictionary[T], iterator: SteedResultIterator[T, R, E]): Unit = js.native
  def map[T, R, E](
    arr: Dictionary[T],
    iterator: SteedResultIterator[T, R, E],
    callback: SteedResultArrayCallback[R, E]
  ): Unit = js.native
  
  var mapSeries: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof steed.map */ js.Any = js.native
  
  def parallel[T, E](tasks: js.Array[SteedFunction[T, E]]): Unit = js.native
  def parallel[T, E](tasks: js.Array[SteedFunction[T, E]], callback: SteedResultArrayCallback[T, E]): Unit = js.native
  def parallel[T, E](tasks: Dictionary[SteedFunction[T, E]]): Unit = js.native
  def parallel[T, E](tasks: Dictionary[SteedFunction[T, E]], callback: SteedResultObjectCallback[T, E]): Unit = js.native
  
  def queue[T, E](worker: SteedWorker[T, E]): SteedQueue[T] = js.native
  def queue[T, E](worker: SteedWorker[T, E], concurrency: Double): SteedQueue[T] = js.native
  @JSName("queue")
  def queue_TRE[T, R, E](worker: SteedResultIterator[T, R, E]): SteedQueue[T] = js.native
  @JSName("queue")
  def queue_TRE[T, R, E](worker: SteedResultIterator[T, R, E], concurrency: Double): SteedQueue[T] = js.native
  
  def series[T, E](tasks: js.Array[SteedFunction[T, E]]): Unit = js.native
  def series[T, E](tasks: js.Array[SteedFunction[T, E]], callback: SteedResultArrayCallback[T, E]): Unit = js.native
  def series[T, E](tasks: Dictionary[SteedFunction[T, E]]): Unit = js.native
  def series[T, E](tasks: Dictionary[SteedFunction[T, E]], callback: SteedResultObjectCallback[T, E]): Unit = js.native
  
  def waterfall[T, E](tasks: js.Array[js.Function]): Unit = js.native
  def waterfall[T, E](tasks: js.Array[js.Function], callback: SteedResultCallback[T, E]): Unit = js.native
}
