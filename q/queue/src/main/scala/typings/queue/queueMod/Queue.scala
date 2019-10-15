package typings.queue.queueMod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue extends EventEmitter {
  /**
    * Ensures the queue is always running if jobs are available.
    */
  var autostart: Boolean = js.native
  /**
    * Max number of jobs the queue should process concurrently.
    */
  var concurrency: Double = js.native
  /**
    * Jobs pending + jobs to process.
    */
  val length: Double = js.native
  /**
    * An array to set job callback arguments on.
    */
  var results: js.Array[_] | Null = js.native
  /**
    * Milliseconds to wait for a job to execute its callback.
    */
  var timeout: Double = js.native
  /**
    * Stop and empty the queue immediately.
    *
    * @param error error of why the stop has occurred, to be passed to start callback if supplied.
    */
  def end(): Unit = js.native
  def end(error: Error): Unit = js.native
  /**
    * Returns the first (least) index of an element within the Queue equal to the specified value, or -1 if none is found.
    *
    * @param searchElement The value to locate in the Queue.
    * @param fromIndex The Queue index at which to begin the search. If omitted, the search starts at index 0.
    */
  def indexOf(searchElement: QueueWorker): Double = js.native
  def indexOf(searchElement: QueueWorker, fromIndex: Double): Double = js.native
  /**
    * Returns the last (greatest) index of an element within the Queue equal to the specified value, or -1 if none is found.
    *
    * @param searchElement The value to locate in the Queue.
    * @param fromIndex The Queue index at which to begin the search. If omitted, the search starts at the last index in the Queue.
    */
  def lastIndexOf(searchElement: QueueWorker): Double = js.native
  def lastIndexOf(searchElement: QueueWorker, fromIndex: Double): Double = js.native
  /**
    * Removes the last element from the Queue and returns that element.
    */
  def pop(): js.UndefOr[QueueWorker] = js.native
  /**
    * Adds one or more elements to the end of the Queue and returns the new length of the Queue.
    *
    * @param workers New workers of the Queue.
    */
  def push(workers: QueueWorker*): Double = js.native
  /**
    * Reverses the order of the elements of the Queue in place.
    */
  def reverse(): Queue = js.native
  /**
    * Removes the first element from the Queue and returns that element.
    */
  def shift(): js.UndefOr[QueueWorker] = js.native
  /**
    * Extracts a section of the Queue and returns Queue.
    *
    * @param start The beginning of the specified portion of the Queue.
    * @param end The end of the specified portion of the Queue.
    */
  def slice(): Queue = js.native
  def slice(start: Double): Queue = js.native
  def slice(start: Double, end: Double): Queue = js.native
  /**
    * Adds and/or removes elements from the queue.
    *
    * @param start The zero-based location in the Queue from which to start removing elements.
    * @param deleteCount The number of elements to remove.
    */
  def splice(start: Double): Queue = js.native
  def splice(start: Double, deleteCount: Double): Queue = js.native
  /**
    * Adds and/or removes elements from the queue.
    *
    * @param start The zero-based location in the Queue from which to start removing elements.
    * @param deleteCount The number of elements to remove.
    * @param workers Workers to insert into the Queue in place of the deleted elements.
    */
  def splice(start: Double, deleteCount: Double, workers: QueueWorker*): Queue = js.native
  /**
    * Starts the queue.
    *
    * @param callback Callback to be called when the queue empties or when an error occurs.
    */
  def start(): Unit = js.native
  def start(callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  /**
    * Stops the queue.
    */
  def stop(): Unit = js.native
  /**
    * Adds one or more elements to the front of the Queue and returns the new length of the Queue.
    *
    * @param workers Workers to insert at the start of the Queue.
    */
  def unshift(workers: QueueWorker*): Double = js.native
}

