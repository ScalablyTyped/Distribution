package typings
package steedLib.steedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Steed extends js.Object {
  @JSName("eachSeries")
  var eachSeries_Original: steedLib.Anon_Arr = js.native
  @JSName("mapSeries")
  var mapSeries_Original: steedLib.Anon_ArrCallback = js.native
  def each[T, E](arr: js.Array[T], iterator: SteedIterator[T, E]): scala.Unit = js.native
  def each[T, E](arr: js.Array[T], iterator: SteedIterator[T, E], callback: ErrorCallback[E]): scala.Unit = js.native
  def each[T, E](arr: Dictionary[T], iterator: SteedIterator[T, E]): scala.Unit = js.native
  def each[T, E](arr: Dictionary[T], iterator: SteedIterator[T, E], callback: ErrorCallback[E]): scala.Unit = js.native
  def eachSeries[T, E](arr: js.Array[T], iterator: SteedIterator[T, E]): scala.Unit = js.native
  def eachSeries[T, E](arr: js.Array[T], iterator: SteedIterator[T, E], callback: ErrorCallback[E]): scala.Unit = js.native
  def eachSeries[T, E](arr: Dictionary[T], iterator: SteedIterator[T, E]): scala.Unit = js.native
  def eachSeries[T, E](arr: Dictionary[T], iterator: SteedIterator[T, E], callback: ErrorCallback[E]): scala.Unit = js.native
  def map[T, R, E](arr: js.Array[T], iterator: SteedResultIterator[T, R, E]): scala.Unit = js.native
  def map[T, R, E](arr: js.Array[T], iterator: SteedResultIterator[T, R, E], callback: SteedResultArrayCallback[R, E]): scala.Unit = js.native
  def map[T, R, E](arr: Dictionary[T], iterator: SteedResultIterator[T, R, E]): scala.Unit = js.native
  def map[T, R, E](
    arr: Dictionary[T],
    iterator: SteedResultIterator[T, R, E],
    callback: SteedResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def mapSeries[T, R, E](arr: js.Array[T], iterator: SteedResultIterator[T, R, E]): scala.Unit = js.native
  def mapSeries[T, R, E](arr: js.Array[T], iterator: SteedResultIterator[T, R, E], callback: SteedResultArrayCallback[R, E]): scala.Unit = js.native
  def mapSeries[T, R, E](arr: Dictionary[T], iterator: SteedResultIterator[T, R, E]): scala.Unit = js.native
  def mapSeries[T, R, E](
    arr: Dictionary[T],
    iterator: SteedResultIterator[T, R, E],
    callback: SteedResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def parallel[T, E](tasks: js.Array[SteedFunction[T, E]]): scala.Unit = js.native
  def parallel[T, E](tasks: js.Array[SteedFunction[T, E]], callback: SteedResultArrayCallback[T, E]): scala.Unit = js.native
  def parallel[T, E](tasks: Dictionary[SteedFunction[T, E]]): scala.Unit = js.native
  def parallel[T, E](tasks: Dictionary[SteedFunction[T, E]], callback: SteedResultObjectCallback[T, E]): scala.Unit = js.native
  def queue[T, E](worker: SteedWorker[T, E]): SteedQueue[T] = js.native
  def queue[T, E](worker: SteedWorker[T, E], concurrency: scala.Double): SteedQueue[T] = js.native
  @JSName("queue")
  def queue_TRE[T, R, E](worker: SteedResultIterator[T, R, E]): SteedQueue[T] = js.native
  @JSName("queue")
  def queue_TRE[T, R, E](worker: SteedResultIterator[T, R, E], concurrency: scala.Double): SteedQueue[T] = js.native
  def series[T, E](tasks: js.Array[SteedFunction[T, E]]): scala.Unit = js.native
  def series[T, E](tasks: js.Array[SteedFunction[T, E]], callback: SteedResultArrayCallback[T, E]): scala.Unit = js.native
  def series[T, E](tasks: Dictionary[SteedFunction[T, E]]): scala.Unit = js.native
  def series[T, E](tasks: Dictionary[SteedFunction[T, E]], callback: SteedResultObjectCallback[T, E]): scala.Unit = js.native
  def waterfall[T, E](tasks: js.Array[js.Function]): scala.Unit = js.native
  def waterfall[T, E](tasks: js.Array[js.Function], callback: SteedResultCallback[T, E]): scala.Unit = js.native
}

