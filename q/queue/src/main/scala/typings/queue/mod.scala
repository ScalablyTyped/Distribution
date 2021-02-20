package typings.queue

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("queue", JSImport.Default)
  @js.native
  val default: QueueConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("queue", JSImport.Default)
  @js.native
  class defaultCls () extends Queue {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Ensures the queue is always running if jobs are available. Useful in situations where you are using a queue only for concurrency control.
      *
      * @default false
      */
    var autostart: js.UndefOr[Boolean] = js.native
    
    /**
      * Max number of jobs the queue should process concurrently.
      *
      * @default Infinity
      */
    var concurrency: js.UndefOr[Double] = js.native
    
    /**
      * An array to set job callback arguments on.
      *
      * @default null
      */
    var results: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * Milliseconds to wait for a job to execute its callback.
      *
      * @default 0
      */
    var timeout: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setResults(value: js.Array[_]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setResultsVarargs(value: js.Any*): Self = StObject.set(x, "results", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
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
      * Jobs pending + jobs to process.
      */
    val length: Double = js.native
    
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
      * An array to set job callback arguments on.
      */
    var results: js.Array[_] | Null = js.native
    
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
    def slice(start: js.UndefOr[scala.Nothing], end: Double): Queue = js.native
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
      * Milliseconds to wait for a job to execute its callback.
      */
    var timeout: Double = js.native
    
    /**
      * Adds one or more elements to the front of the Queue and returns the new length of the Queue.
      *
      * @param workers Workers to insert at the start of the Queue.
      */
    def unshift(workers: QueueWorker*): Double = js.native
  }
  
  @js.native
  trait QueueConstructor
    extends Instantiable0[Queue]
       with Instantiable1[/* options */ Options, Queue] {
    
    def apply(): Queue = js.native
    def apply(options: Options): Queue = js.native
  }
  
  @js.native
  trait QueueWorker extends StObject {
    
    def apply(): Unit = js.native
    def apply(callback: QueueWorkerCallback): Unit = js.native
    
    /**
      * Override queue timeout.
      */
    var timeout: js.UndefOr[Double] = js.native
  }
  
  type QueueWorkerCallback = js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[js.Object], Unit]
  
  type _To = QueueConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: QueueConstructor = default
}
