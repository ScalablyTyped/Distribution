package typings.steed

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("steed", JSImport.Namespace)
  @js.native
  val ^ : Steed = js.native
  
  type Dictionary[T] = StringDictionary[T]
  
  type ErrorCallback[T] = js.Function1[/* err */ js.UndefOr[T], Unit]
  
  @js.native
  trait Steed extends StObject {
    
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
  
  type SteedFunction[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E], /* result */ js.UndefOr[T], Unit], 
    Unit
  ]
  
  type SteedIterator[T, E] = js.Function2[/* item */ T, /* callback */ ErrorCallback[E], Unit]
  
  @js.native
  trait SteedQueue[T] extends StObject {
    
    var concurrency: Double = js.native
    
    def drain(): js.Any = js.native
    
    def empty(): js.Any = js.native
    
    def idle(): Boolean = js.native
    
    def kill(): Unit = js.native
    
    def length(): Double = js.native
    
    def pause(): Unit = js.native
    
    def push[E](task: T): Unit = js.native
    def push[E](task: T, callback: SteedResultCallback[T, E]): Unit = js.native
    def push[E](task: js.Array[T]): Unit = js.native
    def push[E](task: js.Array[T], callback: SteedResultCallback[T, E]): Unit = js.native
    
    def resume(): Unit = js.native
    
    def saturated(): js.Any = js.native
    
    def unshift[E](task: T): Unit = js.native
    def unshift[E](task: T, callback: ErrorCallback[E]): Unit = js.native
    def unshift[E](task: js.Array[T]): Unit = js.native
    def unshift[E](task: js.Array[T], callback: ErrorCallback[E]): Unit = js.native
  }
  
  type SteedResultArrayCallback[T, E] = js.Function2[/* err */ E, /* results */ js.Array[T], Unit]
  
  type SteedResultCallback[T, E] = js.Function2[/* err */ E, /* result */ T, Unit]
  
  type SteedResultIterator[T, R, E] = js.Function2[/* item */ T, /* callback */ SteedResultCallback[R, E], Unit]
  
  type SteedResultObjectCallback[T, E] = js.Function2[/* err */ E, /* results */ Dictionary[T], Unit]
  
  type SteedWorker[T, E] = js.Function2[/* task */ T, /* callback */ ErrorCallback[E], Unit]
  
  type _To = Steed
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Steed = ^
}
