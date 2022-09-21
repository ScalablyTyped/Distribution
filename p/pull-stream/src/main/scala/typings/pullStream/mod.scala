package typings.pullStream

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Pipe data through a number of `pull-stream`s
    */
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(pullStreams: (PossibleSource[Any] | PossibleSink[Any] | (PossibleThrough[Any, Any]))*): Source[Any] | Sink[Any] | (Through_[Any, Any]) | Unit = ^.asInstanceOf[js.Dynamic].apply(pullStreams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Source[Any] | Sink[Any] | (Through_[Any, Any]) | Unit]
  inline def apply[In](sink: PossibleSink[In]): Sink[In] = ^.asInstanceOf[js.Dynamic].apply(sink.asInstanceOf[js.Any]).asInstanceOf[Sink[In]]
  inline def apply[InOut](source: PossibleSource[InOut], sink: PossibleSink[InOut]): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[In, Out](source: PossibleSource[In], t1: PossibleThrough[In, Out], sink: PossibleSink[Out]): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[In, Out](t1: Through_[In, Out]): Through_[In, Out] = ^.asInstanceOf[js.Dynamic].apply(t1.asInstanceOf[js.Any]).asInstanceOf[Through_[In, Out]]
  inline def apply[In, P1, Out](
    source: PossibleSource[In],
    t1: PossibleThrough[In, P1],
    t2: PossibleThrough[P1, Out],
    sink: PossibleSink[Out]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[In, P1, Out](t1: Through_[In, P1], t2: PossibleThrough[P1, Out]): Through_[In, Out] = (^.asInstanceOf[js.Dynamic].apply(t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any])).asInstanceOf[Through_[In, Out]]
  inline def apply[In, P1, P2, Out](
    source: PossibleSource[In],
    t1: PossibleThrough[In, P1],
    t2: PossibleThrough[P1, P2],
    t3: PossibleThrough[P2, Out],
    sink: PossibleSink[Out]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[In, P1, P2, Out](t1: Through_[In, P1], t2: PossibleThrough[P1, P2], t3: PossibleThrough[P2, Out]): Through_[In, Out] = (^.asInstanceOf[js.Dynamic].apply(t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any])).asInstanceOf[Through_[In, Out]]
  inline def apply[In, P1, P2, P3, Out](
    source: PossibleSource[In],
    t1: PossibleThrough[In, P1],
    t2: PossibleThrough[P1, P2],
    t3: PossibleThrough[P2, P3],
    t4: PossibleThrough[P3, Out],
    sink: PossibleSink[Out]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[In, P1, P2, P3, Out](
    t1: Through_[In, P1],
    t2: PossibleThrough[P1, P2],
    t3: PossibleThrough[P2, P3],
    t4: PossibleThrough[P3, Out]
  ): Through_[In, Out] = (^.asInstanceOf[js.Dynamic].apply(t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any])).asInstanceOf[Through_[In, Out]]
  inline def apply[In, P1, P2, P3, P4, Out](
    source: PossibleSource[In],
    t1: PossibleThrough[In, P1],
    t2: PossibleThrough[P1, P2],
    t3: PossibleThrough[P2, P3],
    t4: PossibleThrough[P3, P4],
    t5: PossibleThrough[P4, Out],
    sink: PossibleSink[Out]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[In, P1, P2, P3, P4, Out](
    t1: Through_[In, P1],
    t2: PossibleThrough[P1, P2],
    t3: PossibleThrough[P2, P3],
    t4: PossibleThrough[P3, P4],
    t5: PossibleThrough[P4, Out]
  ): Through_[In, Out] = (^.asInstanceOf[js.Dynamic].apply(t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any])).asInstanceOf[Through_[In, Out]]
  inline def apply[In, P1, P2, P3, P4, P5, Out](
    t1: Through_[In, P1],
    t2: PossibleThrough[P1, P2],
    t3: PossibleThrough[P2, P3],
    t4: PossibleThrough[P3, P4],
    t5: PossibleThrough[P4, P5],
    t6: PossibleThrough[P5, Out]
  ): Through_[In, Out] = (^.asInstanceOf[js.Dynamic].apply(t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any])).asInstanceOf[Through_[In, Out]]
  
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pull-stream", "asyncMap")
  @js.native
  val asyncMap: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof asyncMapImport */ Any = js.native
  
  @JSImport("pull-stream", "collect")
  @js.native
  val collect: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof collectImport */ Any = js.native
  
  @JSImport("pull-stream", "concat")
  @js.native
  val concat: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof concatImport */ Any = js.native
  
  @JSImport("pull-stream", "count")
  @js.native
  val count: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof countImport */ Any = js.native
  
  @JSImport("pull-stream", "drain")
  @js.native
  val drain: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof drainImport */ Any = js.native
  
  @JSImport("pull-stream", "empty")
  @js.native
  val empty: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof emptyImport */ Any = js.native
  
  @JSImport("pull-stream", "error")
  @js.native
  val error: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof errorImport */ Any = js.native
  
  @JSImport("pull-stream", "filter")
  @js.native
  val filter: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof filterImport */ Any = js.native
  
  @JSImport("pull-stream", "filterNot")
  @js.native
  val filterNot: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof filterNotImport */ Any = js.native
  
  @JSImport("pull-stream", "find")
  @js.native
  val find: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof findImport */ Any = js.native
  
  @JSImport("pull-stream", "flatten")
  @js.native
  val flatten: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof flattenImport */ Any = js.native
  
  @JSImport("pull-stream", "infinite")
  @js.native
  val infinite: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof infiniteImport */ Any = js.native
  
  @JSImport("pull-stream", "keys")
  @js.native
  val keys: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof keysImport */ Any = js.native
  
  @JSImport("pull-stream", "log")
  @js.native
  val log: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof logImport */ Any = js.native
  
  @JSImport("pull-stream", "map")
  @js.native
  val map: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof mapImport */ Any = js.native
  
  @JSImport("pull-stream", "nonUnique")
  @js.native
  val nonUnique: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof nonUniqueImport */ Any = js.native
  
  @JSImport("pull-stream", "onEnd")
  @js.native
  val onEnd: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof onEndImport */ Any = js.native
  
  @JSImport("pull-stream", "once")
  @js.native
  val once: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof onceImport */ Any = js.native
  
  @JSImport("pull-stream", "reduce")
  @js.native
  val reduce: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof reduceImport */ Any = js.native
  
  @JSImport("pull-stream", "take")
  @js.native
  val take: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof takeImport */ Any = js.native
  
  @JSImport("pull-stream", "through")
  @js.native
  val through: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof throughImport */ Any = js.native
  
  @JSImport("pull-stream", "unique")
  @js.native
  val unique: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof uniqueImport */ Any = js.native
  
  @JSImport("pull-stream", "values")
  @js.native
  val values: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof valuesImport */ Any = js.native
  
  type Abort = js.Error | Boolean | Null
  
  trait Duplex[In, Out]
    extends StObject
       with DuplexSource[In]
       with DuplexSink[Out]
  object Duplex {
    
    inline def apply[In, Out](
      sink: /* source */ Source[Out] => Unit,
      source: (/* endOrError */ Abort, /* cb */ SourceCallback[In]) => Unit
    ): Duplex[In, Out] = {
      val __obj = js.Dynamic.literal(sink = js.Any.fromFunction1(sink), source = js.Any.fromFunction2(source))
      __obj.asInstanceOf[Duplex[In, Out]]
    }
  }
  
  trait DuplexSink[Out] extends StObject {
    
    def sink(source: Source[Out]): Unit
    @JSName("sink")
    var sink_Original: Sink[Out]
  }
  object DuplexSink {
    
    inline def apply[Out](sink: /* source */ Source[Out] => Unit): DuplexSink[Out] = {
      val __obj = js.Dynamic.literal(sink = js.Any.fromFunction1(sink))
      __obj.asInstanceOf[DuplexSink[Out]]
    }
    
    extension [Self <: DuplexSink[?], Out](x: Self & DuplexSink[Out]) {
      
      inline def setSink(value: /* source */ Source[Out] => Unit): Self = StObject.set(x, "sink", js.Any.fromFunction1(value))
    }
  }
  
  trait DuplexSource[In] extends StObject {
    
    def source(endOrError: Abort, cb: SourceCallback[In]): Unit
    @JSName("source")
    var source_Original: Source[In]
  }
  object DuplexSource {
    
    inline def apply[In](source: (/* endOrError */ Abort, /* cb */ SourceCallback[In]) => Unit): DuplexSource[In] = {
      val __obj = js.Dynamic.literal(source = js.Any.fromFunction2(source))
      __obj.asInstanceOf[DuplexSource[In]]
    }
    
    extension [Self <: DuplexSource[?], In](x: Self & DuplexSource[In]) {
      
      inline def setSource(value: (/* endOrError */ Abort, /* cb */ SourceCallback[In]) => Unit): Self = StObject.set(x, "source", js.Any.fromFunction2(value))
    }
  }
  
  trait DuplexThrough[In, Out]
    extends StObject
       with DuplexSource[In]
       with DuplexSink[Out]
  object DuplexThrough {
    
    inline def apply[In, Out](
      sink: /* source */ Source[Out] => Unit,
      source: (/* endOrError */ Abort, /* cb */ SourceCallback[In]) => Unit
    ): DuplexThrough[In, Out] = {
      val __obj = js.Dynamic.literal(sink = js.Any.fromFunction1(sink), source = js.Any.fromFunction2(source))
      __obj.asInstanceOf[DuplexThrough[In, Out]]
    }
  }
  
  type EndOrError = Abort
  
  type PossibleSink[T] = Sink[T] | DuplexSink[T]
  
  type PossibleSource[T] = Source[T] | DuplexSource[T]
  
  type PossibleThrough[In, Out] = (Through_[In, Out]) | (DuplexThrough[In, Out])
  
  type Sink[T] = js.Function1[/* source */ Source[T], Unit]
  
  type Source[T] = js.Function2[/* endOrError */ Abort, /* cb */ SourceCallback[T], Unit]
  
  type SourceCallback[T] = js.Function2[/* end */ EndOrError, /* data */ js.UndefOr[T], Unit]
  
  type Through_[T, U] = js.Function1[/* source */ Source[T], Source[U]]
}
