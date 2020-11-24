package typings.sodiumjs

import typings.sodiumjs.cellMod.Cell
import typings.sodiumjs.lambdaMod.Lambda1_
import typings.sodiumjs.lambdaMod.Lambda2_
import typings.sodiumjs.lambdaMod.Lambda3_
import typings.sodiumjs.lambdaMod.Lambda4_
import typings.sodiumjs.lambdaMod.Lambda5_
import typings.sodiumjs.lambdaMod.Lambda6_
import typings.sodiumjs.lazyMod.Lazy
import typings.sodiumjs.listenerMod.Listener
import typings.sodiumjs.tuple2Mod.Tuple2
import typings.sodiumjs.vertexMod.Vertex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/Stream", JSImport.Namespace)
@js.native
object streamMod extends js.Object {
  
  @js.native
  class Stream[A] () extends js.Object {
    def this(vertex: Vertex) = this()
    
    /**
      * Accumulate on input event, outputting the new state each time.
      * @param f Function to apply to update the state. It may construct FRP logic or use
      *    {@link Cell#sample()} in which case it is equivalent to {@link Stream#snapshot(Cell)}ing the
      *    cell. Apart from this the function must be <em>referentially transparent</em>.
      */
    def accum[S](initState: S, f: js.Function2[/* a */ A, /* s */ S, S]): Cell[S] = js.native
    def accum[S](initState: S, f: Lambda2_[A, S, S]): Cell[S] = js.native
    
    /**
      * A variant of {@link accum(Object, Lambda2)} that takes an initial state returned by
      * {@link Cell#sampleLazy()}.
      */
    def accumLazy[S](initState: Lazy[S], f: js.Function2[/* a */ A, /* s */ S, S]): Cell[S] = js.native
    def accumLazy[S](initState: Lazy[S], f: Lambda2_[A, S, S]): Cell[S] = js.native
    
    /**
      * Transform an event with a generalized state loop (a Mealy machine). The function
      * is passed the input and the old state and returns the new state and output value.
      * @param f Function to apply to update the state. It may construct FRP logic or use
      *    {@link Cell#sample()} in which case it is equivalent to {@link Stream#snapshot(Cell)}ing the
      *    cell. Apart from this the function must be <em>referentially transparent</em>.
      */
    def collect[B, S](initState: S, f: js.Function2[/* a */ A, /* s */ S, Tuple2[B, S]]): Stream[B] = js.native
    def collect[B, S](initState: S, f: Lambda2_[A, S, Tuple2[B, S]]): Stream[B] = js.native
    
    /**
      * A variant of {@link collect(Object, Lambda2)} that takes an initial state returned by
      * {@link Cell#sampleLazy()}.
      */
    def collectLazy[B, S](initState: Lazy[S], f: js.Function2[/* a */ A, /* s */ S, Tuple2[B, S]]): Stream[B] = js.native
    def collectLazy[B, S](initState: Lazy[S], f: Lambda2_[A, S, Tuple2[B, S]]): Stream[B] = js.native
    
    @JSName("fantasy-land/concat")
    def `fantasy-landSlashconcat`(a: Stream[A]): Stream[A] = js.native
    
    @JSName("fantasy-land/empty")
    def `fantasy-landSlashempty`(): Stream[A] = js.native
    
    /**
      * Fantasy-land Algebraic Data Type Compatability.
      * Stream satisfies the Functor and Monoid Categories (and hence Semigroup)
      * @see {@link https://github.com/fantasyland/fantasy-land} for more info
      */
    @JSName("fantasy-land/map")
    def `fantasy-landSlashmap`[B](f: js.Function1[/* a */ A, B]): Stream[B] = js.native
    
    /**
      * Return a stream that only outputs events for which the predicate returns true.
      */
    def filter(f: js.Function1[/* a */ A, Boolean]): Stream[A] = js.native
    def filter(f: Lambda1_[A, Boolean]): Stream[A] = js.native
    
    /**
      * Return a stream that only outputs events that have present
      * values, discarding null values.
      */
    def filterNotNull(): Stream[A] = js.native
    
    var firings: js.Array[A] = js.native
    
    /**
      * Return a stream that only outputs events from the input stream
      * when the specified cell's value is true.
      */
    def gate(c: Cell[Boolean]): Stream[A] = js.native
    
    def getVertex__(): Vertex = js.native
    
    /**
      * Create a {@link Cell} with the specified initial value, that is updated
      * by this stream's event values.
      * <p>
      * There is an implicit delay: State updates caused by event firings don't become
      * visible as the cell's current value as viewed by {@link Stream#snapshot(Cell, Lambda2)}
      * until the following transaction. To put this another way,
      * {@link Stream#snapshot(Cell, Lambda2)} always sees the value of a cell as it was before
      * any state changes from the current transaction.
      */
    def hold(initValue: A): Cell[A] = js.native
    
    /**
      * A variant of {@link hold(Object)} with an initial value captured by {@link Cell#sampleLazy()}.
      */
    def holdLazy(initValue: Lazy[A]): Cell[A] = js.native
    
    def listen(h: js.Function1[/* a */ A, Unit]): js.Function0[Unit] = js.native
    
    def listen_(target: Vertex, h: js.Function1[/* a */ A, Unit], suppressEarlierFirings: Boolean): js.Function0[Unit] = js.native
    
    var listeners: js.Array[Listener[A]] = js.native
    
    /**
      * Transform the stream's event values according to the supplied function, so the returned
      * Stream's event values reflect the value of the function applied to the input
      * Stream's event values.
      * @param f Function to apply to convert the values. It may construct FRP logic or use
      *    {@link Cell#sample()} in which case it is equivalent to {@link Stream#snapshot(Cell)}ing the
      *    cell. Apart from this the function must be <em>referentially transparent</em>.
      */
    def map[B](f: js.Function1[/* a */ A, B]): Stream[B] = js.native
    def map[B](f: Lambda1_[A, B]): Stream[B] = js.native
    
    /**
      * Transform the stream's event values into the specified constant value.
      * @param b Constant value.
      */
    def mapTo[B](b: B): Stream[B] = js.native
    
    /**
      * Merge two streams of the same type into one, so that events on either input appear
      * on the returned stream.
      * <p>
      * If the events are simultaneous (that is, one event from this and one from <em>s</em>
      * occurring in the same transaction), combine them into one using the specified combining function
      * so that the returned stream is guaranteed only ever to have one event per transaction.
      * The event from <em>this</em> will appear at the left input of the combining function, and
      * the event from <em>s</em> will appear at the right.
      * @param f Function to combine the values. It may construct FRP logic or use
      *    {@link Cell#sample()}. Apart from this the function must be <em>referentially transparent</em>.
      */
    def merge(s: Stream[A], f: js.Function2[/* left */ A, /* right */ A, A]): Stream[A] = js.native
    def merge(s: Stream[A], f: Lambda2_[A, A, A]): Stream[A] = js.native
    
    /**
      * Return a stream that outputs only one value: the next event of the
      * input stream, starting from the transaction in which once() was invoked.
      */
    def once(): Stream[A] = js.native
    
    /**
      * Variant of {@link Stream#merge(Stream, Lambda2)} that merges two streams and will drop an event
      * in the simultaneous case.
      * <p>
      * In the case where two events are simultaneous (i.e. both
      * within the same transaction), the event from <em>this</em> will take precedence, and
      * the event from <em>s</em> will be dropped.
      * If you want to specify your own combining function, use {@link Stream#merge(Stream, Lambda2)}.
      * s1.orElse(s2) is equivalent to s1.merge(s2, (l, r) -&gt; l).
      * <p>
      * The name orElse() is used instead of merge() to make it really clear that care should
      * be taken, because events can be dropped.
      */
    def orElse(s: Stream[A]): Stream[A] = js.native
    
    /**
      * Return a stream whose events are the result of the combination using the specified
      * function of the input stream's event value and the value of the cell at that time.
      * <P>
      * There is an implicit delay: State updates caused by event firings being held with
      * {@link Stream#hold(Object)} don't become visible as the cell's current value until
      * the following transaction. To put this another way, {@link Stream#snapshot(Cell, Lambda2)}
      * always sees the value of a cell as it was before any state changes from the current
      * transaction.
      */
    def snapshot[B, C](b: Cell[B], f_ : js.Function2[/* a */ A, /* b */ B, C]): Stream[C] = js.native
    def snapshot[B, C](b: Cell[B], f_ : Lambda2_[A, B, C]): Stream[C] = js.native
    
    /**
      * Variant of {@link snapshot(Cell, Lambda2)} that captures the cell's value
      * at the time of the event firing, ignoring the stream's value.
      */
    def snapshot1[B](c: Cell[B]): Stream[B] = js.native
    
    /**
      * Return a stream whose events are the result of the combination using the specified
      * function of the input stream's event value and the value of the cells at that time.
      * <P>
      * There is an implicit delay: State updates caused by event firings being held with
      * {@link Stream#hold(Object)} don't become visible as the cell's current value until
      * the following transaction. To put this another way, snapshot()
      * always sees the value of a cell as it was before any state changes from the current
      * transaction.
      */
    def snapshot3[B, C, D](b: Cell[B], c: Cell[C], f_ : js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Stream[D] = js.native
    def snapshot3[B, C, D](b: Cell[B], c: Cell[C], f_ : Lambda3_[A, B, C, D]): Stream[D] = js.native
    
    /**
      * Return a stream whose events are the result of the combination using the specified
      * function of the input stream's event value and the value of the cells at that time.
      * <P>
      * There is an implicit delay: State updates caused by event firings being held with
      * {@link Stream#hold(Object)} don't become visible as the cell's current value until
      * the following transaction. To put this another way, snapshot()
      * always sees the value of a cell as it was before any state changes from the current
      * transaction.
      */
    def snapshot4[B, C, D, E](
      b: Cell[B],
      c: Cell[C],
      d: Cell[D],
      f_ : js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]
    ): Stream[E] = js.native
    def snapshot4[B, C, D, E](b: Cell[B], c: Cell[C], d: Cell[D], f_ : Lambda4_[A, B, C, D, E]): Stream[E] = js.native
    
    /**
      * Return a stream whose events are the result of the combination using the specified
      * function of the input stream's event value and the value of the cells at that time.
      * <P>
      * There is an implicit delay: State updates caused by event firings being held with
      * {@link Stream#hold(Object)} don't become visible as the cell's current value until
      * the following transaction. To put this another way, snapshot()
      * always sees the value of a cell as it was before any state changes from the current
      * transaction.
      */
    def snapshot5[B, C, D, E, F](
      b: Cell[B],
      c: Cell[C],
      d: Cell[D],
      e: Cell[E],
      f_ : js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]
    ): Stream[F] = js.native
    def snapshot5[B, C, D, E, F](b: Cell[B], c: Cell[C], d: Cell[D], e: Cell[E], f_ : Lambda5_[A, B, C, D, E, F]): Stream[F] = js.native
    
    /**
      * Return a stream whose events are the result of the combination using the specified
      * function of the input stream's event value and the value of the cells at that time.
      * <P>
      * There is an implicit delay: State updates caused by event firings being held with
      * {@link Stream#hold(Object)} don't become visible as the cell's current value until
      * the following transaction. To put this another way, snapshot()
      * always sees the value of a cell as it was before any state changes from the current
      * transaction.
      */
    def snapshot6[B, C, D, E, F, G](
      b: Cell[B],
      c: Cell[C],
      d: Cell[D],
      e: Cell[E],
      f: Cell[F],
      f_ : js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]
    ): Stream[G] = js.native
    def snapshot6[B, C, D, E, F, G](b: Cell[B], c: Cell[C], d: Cell[D], e: Cell[E], f: Cell[F], f_ : Lambda6_[A, B, C, D, E, F, G]): Stream[G] = js.native
    
    var vertex: Vertex = js.native
  }
  
  @js.native
  class StreamLoop[A] () extends StreamWithSend[A] {
    
    var assigned__ : Boolean = js.native
    
    /**
      * Resolve the loop to specify what the StreamLoop was a forward reference to. It
      * must be invoked inside the same transaction as the place where the StreamLoop is used.
      * This requires you to create an explicit transaction with {@link Transaction#run(Lambda0)}
      * or {@link Transaction#runVoid(Runnable)}.
      */
    def loop(sa_out: Stream[A]): Unit = js.native
  }
  
  @js.native
  class StreamWithSend[A] () extends Stream[A] {
    def this(vertex: Vertex) = this()
    
    def send_(a: A): Unit = js.native
    
    def setVertex__(vertex: Vertex): Unit = js.native
  }
}
