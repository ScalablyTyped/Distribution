package typings.pullStream

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Pipe data through a number of `pull-stream`s
    */
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply(): Unit = js.native
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply(pullStreams: (PossibleSource[_] | PossibleSink[_] | (PossibleThrough[_, _]))*): Source[_] | Sink[_] | (Through_[_, _]) | Unit = js.native
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply[In](sink: PossibleSink[In]): Sink[In] = js.native
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply[InOut](source: PossibleSource[InOut], sink: PossibleSink[InOut]): Unit = js.native
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply[In, Out](source: PossibleSource[In], t1: PossibleThrough[In, Out], sink: PossibleSink[Out]): Unit = js.native
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply[In, Out](t1: Through_[In, Out]): Through_[In, Out] = js.native
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply[In, P1, Out](
    source: PossibleSource[In],
    t1: PossibleThrough[In, P1],
    t2: PossibleThrough[P1, Out],
    sink: PossibleSink[Out]
  ): Unit = js.native
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply[In, P1, Out](t1: Through_[In, P1], t2: PossibleThrough[P1, Out]): Through_[In, Out] = js.native
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply[In, P1, P2, Out](
    source: PossibleSource[In],
    t1: PossibleThrough[In, P1],
    t2: PossibleThrough[P1, P2],
    t3: PossibleThrough[P2, Out],
    sink: PossibleSink[Out]
  ): Unit = js.native
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply[In, P1, P2, Out](t1: Through_[In, P1], t2: PossibleThrough[P1, P2], t3: PossibleThrough[P2, Out]): Through_[In, Out] = js.native
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply[In, P1, P2, P3, Out](
    source: PossibleSource[In],
    t1: PossibleThrough[In, P1],
    t2: PossibleThrough[P1, P2],
    t3: PossibleThrough[P2, P3],
    t4: PossibleThrough[P3, Out],
    sink: PossibleSink[Out]
  ): Unit = js.native
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply[In, P1, P2, P3, Out](
    t1: Through_[In, P1],
    t2: PossibleThrough[P1, P2],
    t3: PossibleThrough[P2, P3],
    t4: PossibleThrough[P3, Out]
  ): Through_[In, Out] = js.native
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply[In, P1, P2, P3, P4, Out](
    source: PossibleSource[In],
    t1: PossibleThrough[In, P1],
    t2: PossibleThrough[P1, P2],
    t3: PossibleThrough[P2, P3],
    t4: PossibleThrough[P3, P4],
    t5: PossibleThrough[P4, Out],
    sink: PossibleSink[Out]
  ): Unit = js.native
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply[In, P1, P2, P3, P4, Out](
    t1: Through_[In, P1],
    t2: PossibleThrough[P1, P2],
    t3: PossibleThrough[P2, P3],
    t4: PossibleThrough[P3, P4],
    t5: PossibleThrough[P4, Out]
  ): Through_[In, Out] = js.native
  @JSImport("pull-stream", JSImport.Namespace)
  @js.native
  def apply[In, P1, P2, P3, P4, P5, Out](
    t1: Through_[In, P1],
    t2: PossibleThrough[P1, P2],
    t3: PossibleThrough[P2, P3],
    t4: PossibleThrough[P3, P4],
    t5: PossibleThrough[P4, P5],
    t6: PossibleThrough[P5, Out]
  ): Through_[In, Out] = js.native
  
  @JSImport("pull-stream", "asyncMap")
  @js.native
  val asyncMap: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof asyncMapImport */ js.Any = js.native
  
  @JSImport("pull-stream", "collect")
  @js.native
  val collect: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof collectImport */ js.Any = js.native
  
  @JSImport("pull-stream", "concat")
  @js.native
  val concat: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof concatImport */ js.Any = js.native
  
  @JSImport("pull-stream", "count")
  @js.native
  val count: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof countImport */ js.Any = js.native
  
  @JSImport("pull-stream", "drain")
  @js.native
  val drain: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof drainImport */ js.Any = js.native
  
  @JSImport("pull-stream", "empty")
  @js.native
  val empty: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof emptyImport */ js.Any = js.native
  
  @JSImport("pull-stream", "error")
  @js.native
  val error: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof errorImport */ js.Any = js.native
  
  @JSImport("pull-stream", "filter")
  @js.native
  val filter: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof filterImport */ js.Any = js.native
  
  @JSImport("pull-stream", "filterNot")
  @js.native
  val filterNot: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof filterNotImport */ js.Any = js.native
  
  @JSImport("pull-stream", "find")
  @js.native
  val find: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof findImport */ js.Any = js.native
  
  @JSImport("pull-stream", "flatten")
  @js.native
  val flatten: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof flattenImport */ js.Any = js.native
  
  @JSImport("pull-stream", "infinite")
  @js.native
  val infinite: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof infiniteImport */ js.Any = js.native
  
  @JSImport("pull-stream", "keys")
  @js.native
  val keys: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof keysImport */ js.Any = js.native
  
  @JSImport("pull-stream", "log")
  @js.native
  val log: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof logImport */ js.Any = js.native
  
  @JSImport("pull-stream", "map")
  @js.native
  val map: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof mapImport */ js.Any = js.native
  
  @JSImport("pull-stream", "nonUnique")
  @js.native
  val nonUnique: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof nonUniqueImport */ js.Any = js.native
  
  @JSImport("pull-stream", "onEnd")
  @js.native
  val onEnd: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof onEndImport */ js.Any = js.native
  
  @JSImport("pull-stream", "once")
  @js.native
  val once: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof onceImport */ js.Any = js.native
  
  @JSImport("pull-stream", "reduce")
  @js.native
  val reduce: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof reduceImport */ js.Any = js.native
  
  @JSImport("pull-stream", "take")
  @js.native
  val take: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof takeImport */ js.Any = js.native
  
  @JSImport("pull-stream", "through")
  @js.native
  val through: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof throughImport */ js.Any = js.native
  
  @JSImport("pull-stream", "unique")
  @js.native
  val unique: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof uniqueImport */ js.Any = js.native
  
  @JSImport("pull-stream", "values")
  @js.native
  val values: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof valuesImport */ js.Any = js.native
  
  type Abort = Error | Boolean | Null
  
  type Duplex[In, Out] = DuplexSource[In] with DuplexSink[Out]
  
  @js.native
  trait DuplexSink[Out] extends StObject {
    
    def sink(source: Source[Out]): Unit = js.native
    @JSName("sink")
    var sink_Original: Sink[Out] = js.native
  }
  
  @js.native
  trait DuplexSource[In] extends StObject {
    
    def source(endOrError: Abort, cb: SourceCallback[In]): Unit = js.native
    @JSName("source")
    var source_Original: Source[In] = js.native
  }
  
  type DuplexThrough[In, Out] = DuplexSource[In] with DuplexSink[Out]
  
  type EndOrError = Abort
  
  type PossibleSink[T] = Sink[T] | DuplexSink[T]
  
  type PossibleSource[T] = Source[T] | DuplexSource[T]
  
  type PossibleThrough[In, Out] = (Through_[In, Out]) | (DuplexThrough[In, Out])
  
  type Sink[T] = js.Function1[/* source */ Source[T], Unit]
  
  type Source[T] = js.Function2[/* endOrError */ Abort, /* cb */ SourceCallback[T], Unit]
  
  type SourceCallback[T] = js.Function2[/* end */ EndOrError, /* data */ js.UndefOr[T], Unit]
  
  type Through_[T, U] = js.Function1[/* source */ Source[T], Source[U]]
}
