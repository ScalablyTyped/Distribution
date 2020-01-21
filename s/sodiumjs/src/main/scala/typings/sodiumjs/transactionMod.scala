package typings.sodiumjs

import typings.sodiumjs.vertexMod.Vertex
import typings.typescriptCollections.mod.PriorityQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Transaction", JSImport.Namespace)
@js.native
object transactionMod extends js.Object {
  @js.native
  class Entry protected () extends js.Object {
    def this(rank: Vertex, action: js.Function0[Unit]) = this()
    var rank: Vertex = js.native
    var seq: Double = js.native
    def action(): Unit = js.native
  }
  
  @js.native
  class Transaction () extends js.Object {
    var checkRegen: js.Any = js.native
    var entries: js.Any = js.native
    var inCallback: Double = js.native
    var lastQ: js.Any = js.native
    var postQ: js.Any = js.native
    var prioritizedQ: PriorityQueue[Entry] = js.native
    var sampleQ: js.Any = js.native
    var toRegen: js.Any = js.native
    def close(): Unit = js.native
    def isActive(): Boolean = js.native
    def last(h: js.Function0[Unit]): Unit = js.native
    /**
      * Add an action to run after all last() actions.
      */
    def post(childIx: Double, action: js.Function0[Unit]): Unit = js.native
    def prioritized(target: Vertex, action: js.Function0[Unit]): Unit = js.native
    def requestRegen(): Unit = js.native
    def sample(h: js.Function0[Unit]): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Entry extends js.Object {
    var nextSeq: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Transaction extends js.Object {
    var collectCyclesAtEnd: js.Any = js.native
    var currentTransaction: Transaction = js.native
    var onStartHooks: js.Any = js.native
    var runningOnStartHooks: js.Any = js.native
    def _collectCyclesAtEnd(): Unit = js.native
    /**
      * Add a runnable that will be executed whenever a transaction is started.
      * That runnable may start transactions itself, which will not cause the
      * hooks to be run recursively.
      *
      * The main use case of this is the implementation of a time/alarm system.
      */
    def onStart(r: js.Function0[Unit]): Unit = js.native
    def run[A](f: js.Function0[A]): A = js.native
  }
  
}

