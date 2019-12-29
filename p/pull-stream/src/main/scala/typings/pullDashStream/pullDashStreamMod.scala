package typings.pullDashStream

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream", JSImport.Namespace)
@js.native
object pullDashStreamMod extends js.Object {
  val asyncMap: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof asyncMapImport */ js.Any = js.native
  val collect: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof collectImport */ js.Any = js.native
  val concat: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof concatImport */ js.Any = js.native
  val count: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof countImport */ js.Any = js.native
  val drain: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof drainImport */ js.Any = js.native
  val empty: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof emptyImport */ js.Any = js.native
  val error: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof errorImport */ js.Any = js.native
  val filter: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof filterImport */ js.Any = js.native
  val filterNot: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof filterNotImport */ js.Any = js.native
  val find: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof findImport */ js.Any = js.native
  val flatten: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof flattenImport */ js.Any = js.native
  val infinite: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof infiniteImport */ js.Any = js.native
  val keys: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof keysImport */ js.Any = js.native
  val log: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof logImport */ js.Any = js.native
  val map: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof mapImport */ js.Any = js.native
  val nonUnique: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof nonUniqueImport */ js.Any = js.native
  val onEnd: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof onEndImport */ js.Any = js.native
  val once: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof onceImport */ js.Any = js.native
  val reduce: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof reduceImport */ js.Any = js.native
  val take: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof takeImport */ js.Any = js.native
  val through: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof throughImport */ js.Any = js.native
  val unique: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof uniqueImport */ js.Any = js.native
  val values: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof valuesImport */ js.Any = js.native
  /**
    * Pipe data through a number of `pull-stream`s
    */
  def apply(): js.UndefOr[scala.Nothing] = js.native
  def apply(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param pullStreams because its type ReadonlyArray<pull.Source<any> | pull.Sink<any> | pull.Through<any, any>> is not an array type */ pullStreams: js.Array[Source[_] | Sink[_] | (Through[_, _])]
  ): js.UndefOr[Source[_] | Sink[_] | (Through[_, _])] = js.native
  def apply[In](sink: Sink[In]): Sink[In] = js.native
  def apply[Out](source: Source[Out]): Source[Out] = js.native
  def apply[InOut](source: Source[InOut], sink: Sink[InOut]): js.UndefOr[scala.Nothing] = js.native
  def apply[In, Out](source: Source[In], t1: Through[In, Out], sink: Sink[Out]): js.UndefOr[scala.Nothing] = js.native
  def apply[In, Out](t1: Through[In, Out], sink: Sink[Out]): Sink[In] = js.native
  def apply[In, P1, Out](source: Source[In], t1: Through[In, P1], t2: Through[P1, Out], sink: Sink[Out]): js.UndefOr[scala.Nothing] = js.native
  def apply[In, P1, Out](t1: Through[In, P1], t2: Through[P1, Out], sink: Sink[Out]): Sink[In] = js.native
  def apply[In, P1, P2, Out](
    source: Source[In],
    t1: Through[In, P1],
    t2: Through[P1, P2],
    t3: Through[P2, Out],
    sink: Sink[Out]
  ): js.UndefOr[scala.Nothing] = js.native
  def apply[In, P1, P2, Out](t1: Through[In, P1], t2: Through[P1, P2], t3: Through[P2, Out], sink: Sink[Out]): Sink[In] = js.native
  def apply[In, P1, P2, P3, Out](
    source: Source[In],
    t1: Through[In, P1],
    t2: Through[P1, P2],
    t3: Through[P2, P3],
    t4: Through[P3, Out],
    sink: Sink[Out]
  ): js.UndefOr[scala.Nothing] = js.native
  def apply[In, P1, P2, P3, Out](
    t1: Through[In, P1],
    t2: Through[P1, P2],
    t3: Through[P2, P3],
    t4: Through[P3, Out],
    sink: Sink[Out]
  ): Sink[In] = js.native
  def apply[In, P1, P2, P3, P4, Out](
    source: Source[In],
    t1: Through[In, P1],
    t2: Through[P1, P2],
    t3: Through[P2, P3],
    t4: Through[P3, P4],
    t5: Through[P4, Out],
    sink: Sink[Out]
  ): js.UndefOr[scala.Nothing] = js.native
  def apply[In, P1, P2, P3, P4, Out](
    t1: Through[In, P1],
    t2: Through[P1, P2],
    t3: Through[P2, P3],
    t4: Through[P3, P4],
    t5: Through[P4, Out],
    sink: Sink[Out]
  ): Sink[In] = js.native
  def apply[In, P1, P2, P3, P4, P5, Out](
    t1: Through[In, P1],
    t2: Through[P1, P2],
    t3: Through[P2, P3],
    t4: Through[P3, P4],
    t5: Through[P4, P5],
    t6: Through[P5, Out],
    sink: Sink[Out]
  ): Sink[In] = js.native
  type Sink[T] = js.Function1[/* source */ Source[T], js.UndefOr[scala.Nothing]]
  type Source[T] = js.Function2[
    /* endOrError */ Error | Boolean | Null, 
    /* cb */ js.Function2[/* endOrError */ Error | Boolean | Null, /* data */ T, js.Any], 
    js.UndefOr[scala.Nothing]
  ]
  type Through[T, U] = js.Function1[/* source */ Source[T], Source[U]]
}

