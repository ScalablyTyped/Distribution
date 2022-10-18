package typings.sodiumjs

import typings.sodiumjs.distTypingsSodiumVertexMod.Vertex
import typings.typescriptCollections.mod.PriorityQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsSodiumTransactionMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/Transaction", "Entry")
  @js.native
  open class Entry protected () extends StObject {
    def this(rank: Vertex, action: js.Function0[Unit]) = this()
    
    def action(): Unit = js.native
    
    var rank: Vertex = js.native
    
    var seq: Double = js.native
  }
  /* static members */
  object Entry {
    
    @JSImport("sodiumjs/dist/typings/sodium/Transaction", "Entry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sodiumjs/dist/typings/sodium/Transaction", "Entry.nextSeq")
    @js.native
    def nextSeq: Any = js.native
    inline def nextSeq_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextSeq")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sodiumjs/dist/typings/sodium/Transaction", "Transaction")
  @js.native
  open class Transaction () extends StObject {
    
    /* private */ var checkRegen: Any = js.native
    
    def close(): Unit = js.native
    
    /* private */ var entries: Any = js.native
    
    var inCallback: Double = js.native
    
    def isActive(): Boolean = js.native
    
    def last(h: js.Function0[Unit]): Unit = js.native
    
    /* private */ var lastQ: Any = js.native
    
    /**
      * Add an action to run after all last() actions.
      */
    def post(childIx: Double, action: js.Function0[Unit]): Unit = js.native
    
    /* private */ var postQ: Any = js.native
    
    def prioritized(target: Vertex, action: js.Function0[Unit]): Unit = js.native
    
    var prioritizedQ: PriorityQueue[Entry] = js.native
    
    def requestRegen(): Unit = js.native
    
    def sample(h: js.Function0[Unit]): Unit = js.native
    
    /* private */ var sampleQ: Any = js.native
    
    /* private */ var toRegen: Any = js.native
  }
  /* static members */
  object Transaction {
    
    @JSImport("sodiumjs/dist/typings/sodium/Transaction", "Transaction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _collectCyclesAtEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_collectCyclesAtEnd")().asInstanceOf[Unit]
    
    @JSImport("sodiumjs/dist/typings/sodium/Transaction", "Transaction.collectCyclesAtEnd")
    @js.native
    def collectCyclesAtEnd: Any = js.native
    inline def collectCyclesAtEnd_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collectCyclesAtEnd")(x.asInstanceOf[js.Any])
    
    @JSImport("sodiumjs/dist/typings/sodium/Transaction", "Transaction.currentTransaction")
    @js.native
    def currentTransaction: Transaction = js.native
    inline def currentTransaction_=(x: Transaction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentTransaction")(x.asInstanceOf[js.Any])
    
    /**
      * Add a runnable that will be executed whenever a transaction is started.
      * That runnable may start transactions itself, which will not cause the
      * hooks to be run recursively.
      *
      * The main use case of this is the implementation of a time/alarm system.
      */
    inline def onStart(r: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onStart")(r.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("sodiumjs/dist/typings/sodium/Transaction", "Transaction.onStartHooks")
    @js.native
    def onStartHooks: Any = js.native
    inline def onStartHooks_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStartHooks")(x.asInstanceOf[js.Any])
    
    inline def run[A](f: js.Function0[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(f.asInstanceOf[js.Any]).asInstanceOf[A]
    
    @JSImport("sodiumjs/dist/typings/sodium/Transaction", "Transaction.runningOnStartHooks")
    @js.native
    def runningOnStartHooks: Any = js.native
    inline def runningOnStartHooks_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runningOnStartHooks")(x.asInstanceOf[js.Any])
  }
}
