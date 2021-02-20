package typings.sodiumjs

import typings.sodiumjs.lambdaMod.Lambda1_
import typings.sodiumjs.lambdaMod.Lambda2_
import typings.sodiumjs.lambdaMod.Lambda3_
import typings.sodiumjs.lambdaMod.Lambda4_
import typings.sodiumjs.lambdaMod.Lambda5_
import typings.sodiumjs.lambdaMod.Lambda6_
import typings.sodiumjs.lazyMod.Lazy
import typings.sodiumjs.streamMod.Stream
import typings.sodiumjs.vertexMod.Source
import typings.sodiumjs.vertexMod.Vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/Cell", "Cell")
  @js.native
  class Cell[A] protected () extends StObject {
    def this(initValue: A) = this()
    def this(initValue: A, str: Stream[A]) = this()
    
    /**
      * When transforming a value from a larger type to a smaller type, it is likely for duplicate changes to become
      * propergated. This function insures only distinct changes get propergated.
      */
    def calm(eq: js.Function2[/* a */ A, /* b */ A, Boolean]): Cell[A] = js.native
    
    /**
      * This function is the same as calm, except you do not need to pass an eq function. This function will use (===)
      * as its eq function. I.E. calling calmRefEq() is the same as calm((a,b) => a === b).
      */
    def calmRefEq(): Cell[A] = js.native
    
    var cleanup: js.Any = js.native
    
    @JSName("fantasy-land/ap")
    def `fantasy-landSlashap`[B](cf: Cell[js.Function1[/* a */ A, B]]): Cell[B] = js.native
    
    @JSName("fantasy-land/map")
    def `fantasy-landSlashmap`[B](f: js.Function1[/* a */ A, B]): Cell[B] = js.native
    
    def getStream__(): Stream[A] = js.native
    
    def getVertex__(): Vertex = js.native
    
    var lazyInitValue: Lazy[A] = js.native
    
    /**
      * Lift a binary function into cells, so the returned Cell always reflects the specified
      * function applied to the input cells' values.
      * @param fn Function to apply. It must be <em>referentially transparent</em>.
      */
    def lift[B, C](b: Cell[B], fn0: js.Function2[/* a */ A, /* b */ B, C]): Cell[C] = js.native
    def lift[B, C](b: Cell[B], fn0: Lambda2_[A, B, C]): Cell[C] = js.native
    
    /**
      * Lift a ternary function into cells, so the returned Cell always reflects the specified
      * function applied to the input cells' values.
      * @param fn Function to apply. It must be <em>referentially transparent</em>.
      */
    def lift3[B, C, D](b: Cell[B], c: Cell[C], fn0: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Cell[D] = js.native
    def lift3[B, C, D](b: Cell[B], c: Cell[C], fn0: Lambda3_[A, B, C, D]): Cell[D] = js.native
    
    /**
      * Lift a quaternary function into cells, so the returned Cell always reflects the specified
      * function applied to the input cells' values.
      * @param fn Function to apply. It must be <em>referentially transparent</em>.
      */
    def lift4[B, C, D, E](
      b: Cell[B],
      c: Cell[C],
      d: Cell[D],
      fn0: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]
    ): Cell[E] = js.native
    def lift4[B, C, D, E](b: Cell[B], c: Cell[C], d: Cell[D], fn0: Lambda4_[A, B, C, D, E]): Cell[E] = js.native
    
    /**
      * Lift a 5-argument function into cells, so the returned Cell always reflects the specified
      * function applied to the input cells' values.
      * @param fn Function to apply. It must be <em>referentially transparent</em>.
      */
    def lift5[B, C, D, E, F](
      b: Cell[B],
      c: Cell[C],
      d: Cell[D],
      e: Cell[E],
      fn0: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]
    ): Cell[F] = js.native
    def lift5[B, C, D, E, F](b: Cell[B], c: Cell[C], d: Cell[D], e: Cell[E], fn0: Lambda5_[A, B, C, D, E, F]): Cell[F] = js.native
    
    /**
      * Lift a 6-argument function into cells, so the returned Cell always reflects the specified
      * function applied to the input cells' values.
      * @param fn Function to apply. It must be <em>referentially transparent</em>.
      */
    def lift6[B, C, D, E, F, G](
      b: Cell[B],
      c: Cell[C],
      d: Cell[D],
      e: Cell[E],
      f: Cell[F],
      fn0: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]
    ): Cell[G] = js.native
    def lift6[B, C, D, E, F, G](b: Cell[B], c: Cell[C], d: Cell[D], e: Cell[E], f: Cell[F], fn0: Lambda6_[A, B, C, D, E, F, G]): Cell[G] = js.native
    
    /**
      * Listen for updates to the value of this cell. This is the observer pattern. The
      * returned {@link Listener} has a {@link Listener#unlisten()} method to cause the
      * listener to be removed. This is an OPERATIONAL mechanism is for interfacing between
      * the world of I/O and for FRP.
      * @param h The handler to execute when there's a new value.
      *   You should make no assumptions about what thread you are called on, and the
      *   handler should not block. You are not allowed to use {@link CellSink#send(Object)}
      *   or {@link StreamSink#send(Object)} in the handler.
      *   An exception will be thrown, because you are not meant to use this to create
      *   your own primitives.
      */
    def listen(h: js.Function1[/* a */ A, Unit]): js.Function0[Unit] = js.native
    
    /**
      * Transform the cell's value according to the supplied function, so the returned Cell
      * always reflects the value of the function applied to the input Cell's value.
      * @param f Function to apply to convert the values. It must be <em>referentially transparent</em>.
      */
    def map[B](f: js.Function1[/* a */ A, B]): Cell[B] = js.native
    def map[B](f: Lambda1_[A, B]): Cell[B] = js.native
    
    /**
      * Sample the cell's current value.
      * <p>
      * It should generally be avoided in favour of {@link listen(Handler)} so you don't
      * miss any updates, but in many circumstances it makes sense.
      * <p>
      * NOTE: In the Java and other versions of Sodium, using sample() inside map(), filter() and
      * merge() is encouraged. In the Javascript/Typescript version, not so much, for the
      * following reason: The memory management is different in the Javascript version, and this
      * requires us to track all dependencies. In order for the use of sample() inside
      * a closure to be correct, the cell that was sample()d inside the closure would have to be
      * declared explicitly using the helpers lambda1(), lambda2(), etc. Because this is
      * something that can be got wrong, we don't encourage this kind of use of sample() in
      * Javascript. Better and simpler to use snapshot().
      * <p>
      * NOTE: If you need to sample() a cell, you have to make sure it's "alive" in terms of
      * memory management or it will ignore updates. To make a cell work correctly
      * with sample(), you have to ensure that it's being used. One way to guarantee this is
      * to register a dummy listener on the cell. It will also work to have it referenced
      * by something that is ultimately being listened to.
      */
    def sample(): A = js.native
    
    /**
      * A variant of {@link sample()} that works with {@link CellLoop}s when they haven't been looped yet.
      * It should be used in any code that's general enough that it could be passed a {@link CellLoop}.
      * @see Stream#holdLazy(Lazy) Stream.holdLazy()
      */
    def sampleLazy(): Lazy[A] = js.native
    
    def sampleLazyNoTrans__(): Lazy[A] = js.native
    
    def sampleNoTrans__(): A = js.native
    
    /* protected */ def setStream(str: Stream[A]): Unit = js.native
    
    var str: js.Any = js.native
    
    /**
      * High order depenency traking. If any newly created sodium objects within a value of a cell of a sodium object
      * happen to accumulate state, this method will keep the accumulation of state up to date.
      */
    def tracking(extractor: js.Function1[/* a */ A, js.Array[Stream[_] | Cell[_]]]): Cell[A] = js.native
    
    var value: A = js.native
    
    var valueUpdate: A = js.native
    
    var vertex: js.Any = js.native
  }
  /* static members */
  object Cell {
    
    @JSImport("sodiumjs/dist/typings/sodium/Cell", "Cell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sodiumjs/dist/typings/sodium/Cell", "Cell._liftArray")
    @js.native
    def _liftArray: js.Any = js.native
    @scala.inline
    def _liftArray_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_liftArray")(x.asInstanceOf[js.Any])
    
    /**
      * Apply a value inside a cell to a function inside a cell. This is the
      * primitive for all function lifting.
      */
    @JSImport("sodiumjs/dist/typings/sodium/Cell", "Cell.apply")
    @js.native
    def apply[A, B](cf: Cell[js.Function1[/* a */ A, B]], ca: Cell[A]): Cell[B] = js.native
    @JSImport("sodiumjs/dist/typings/sodium/Cell", "Cell.apply")
    @js.native
    def apply[A, B](cf: Cell[js.Function1[/* a */ A, B]], ca: Cell[A], sources: js.Array[Source]): Cell[B] = js.native
    
    /**
      * Lift an array of cells into a cell of an array.
      */
    @JSImport("sodiumjs/dist/typings/sodium/Cell", "Cell.liftArray")
    @js.native
    def liftArray[A](ca: js.Array[Cell[A]]): Cell[js.Array[A]] = js.native
    
    /**
      * Unwrap a cell inside another cell to give a time-varying cell implementation.
      */
    @JSImport("sodiumjs/dist/typings/sodium/Cell", "Cell.switchC")
    @js.native
    def switchC[A](cca: Cell[Cell[A]]): Cell[A] = js.native
    
    /**
      * Unwrap a stream inside a cell to give a time-varying stream implementation.
      */
    @JSImport("sodiumjs/dist/typings/sodium/Cell", "Cell.switchS")
    @js.native
    def switchS[A](csa: Cell[Stream[A]]): Stream[A] = js.native
    
    /**
      * Fantasy-land Algebraic Data Type Compatability.
      * Cell satisfies the Functor, Apply, Applicative categories
      * @see {@link https://github.com/fantasyland/fantasy-land} for more info
      */
    @JSImport("sodiumjs/dist/typings/sodium/Cell", "Cell.fantasy-land/of")
    @js.native
    def `fantasy-landSlashof`[A](a: A): Cell[A] = js.native
  }
}
