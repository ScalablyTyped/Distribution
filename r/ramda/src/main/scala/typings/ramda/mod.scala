package typings.ramda

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.ramda.ramdaBooleans.`false`
import typings.ramda.ramdaNumbers.`10`
import typings.ramda.ramdaNumbers.`1`
import typings.ramda.ramdaNumbers.`2`
import typings.ramda.ramdaNumbers.`3`
import typings.ramda.ramdaNumbers.`4`
import typings.ramda.ramdaNumbers.`5`
import typings.ramda.ramdaNumbers.`6`
import typings.ramda.ramdaNumbers.`7`
import typings.ramda.ramdaNumbers.`8`
import typings.ramda.ramdaNumbers.`9`
import typings.ramda.ramdaStrings.Array
import typings.ramda.ramdaStrings.Function
import typings.ramda.ramdaStrings.Number
import typings.ramda.ramdaStrings.Object
import typings.ramda.ramdaStrings.Undefined
import typings.ramda.ramdaStrings.deep
import typings.ramda.ramdaStrings.flat
import typings.ramda.toolsMod.Arity1Fn
import typings.ramda.toolsMod.Arity2Fn
import typings.ramda.toolsMod.AssocPartialOne
import typings.ramda.toolsMod.ComposeWithFns
import typings.ramda.toolsMod.Evolvable
import typings.ramda.toolsMod.Evolve
import typings.ramda.toolsMod.Evolver
import typings.ramda.toolsMod.Filter
import typings.ramda.toolsMod.Functor
import typings.ramda.toolsMod.KeyValuePair
import typings.ramda.toolsMod.Lens
import typings.ramda.toolsMod.Merge
import typings.ramda.toolsMod.MergeAll
import typings.ramda.toolsMod.ObjPred
import typings.ramda.toolsMod.Ord
import typings.ramda.toolsMod.Path
import typings.ramda.toolsMod.PipeWithFns
import typings.ramda.toolsMod.Placeholder
import typings.ramda.toolsMod.Pred
import typings.ramda.toolsMod.Reduced
import typings.ramda.toolsMod.SafePred
import typings.ramda.toolsMod.ValueOfRecord
import typings.std.Date
import typings.std.Exclude
import typings.std.Omit
import typings.std.Parameters
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val __ : Placeholder = js.native
  val filter: Filter = js.native
  val reject: Filter = js.native
  def F(): Boolean = js.native
  def T(): Boolean = js.native
  def add(a: Double): js.Function1[/* b */ Double, Double] = js.native
  def add(a: Double, b: Double): Double = js.native
  def addIndex[T](fn: js.Function2[/* f */ js.Function1[/* item */ T, Unit], /* list */ js.Array[T], js.Array[T]]): js.Any = js.native
  def addIndex[T, U](
    fn: js.Function3[
      /* f */ js.Function2[/* acc */ U, /* item */ T, U], 
      /* aci */ U, 
      /* list */ js.Array[T], 
      U
    ]
  ): js.Any = js.native
  @JSName("addIndex")
  def addIndex_TU[T, U](fn: js.Function2[/* f */ js.Function1[/* item */ T, U], /* list */ js.Array[T], js.Array[U]]): js.Any = js.native
  def adjust[T](index: Double, fn: js.Function1[/* a */ T, T]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def adjust[T](index: Double, fn: js.Function1[/* a */ T, T], list: js.Array[T]): js.Array[T] = js.native
  def all[T](fn: js.Function1[/* a */ T, Boolean]): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def all[T](fn: js.Function1[/* a */ T, Boolean], list: js.Array[T]): Boolean = js.native
  def allPass(preds: js.Array[Pred]): Pred = js.native
  def always[T](`val`: T): js.Function0[T] = js.native
  def and(): js.Function1[/* val2 */ js.Any, Boolean] = js.native
  def and(fn1: String): js.Function1[/* val2 */ js.Any, Boolean] = js.native
  def and(fn1: String, val2: js.Any): Boolean = js.native
  def and(fn1: Boolean): js.Function1[/* val2 */ js.Any, Boolean] = js.native
  def and(fn1: Boolean, val2: js.Any): Boolean = js.native
  def and(fn1: Double): js.Function1[/* val2 */ js.Any, Boolean] = js.native
  def and(fn1: Double, val2: js.Any): Boolean = js.native
  def and(fn1: Null, val2: js.Any): Boolean = js.native
  def and[T /* <: AnonAnd */](fn1: T): js.Function1[/* val2 */ js.Any, Boolean] = js.native
  def and[T /* <: AnonAnd */](fn1: T, val2: js.Any): Boolean = js.native
  def any[T](fn: js.Function1[/* a */ T, Boolean]): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def any[T](fn: js.Function1[/* a */ T, Boolean], list: js.Array[T]): Boolean = js.native
  def anyPass[T](preds: js.Array[SafePred[T]]): SafePred[T] = js.native
  def ap[T, U](fns: js.Array[js.Function1[/* a */ T, U]]): js.Function1[/* vs */ js.Array[T], js.Array[U]] = js.native
  def ap[T, U](fns: js.Array[js.Function1[/* a */ T, U]], vs: js.Array[T]): js.Array[U] = js.native
  def ap[X0, X1, R](fn: js.Function2[/* x1 */ X1, /* x0 */ X0, R], fn1: js.Function1[/* x1 */ X1, X0]): js.Function1[/* x1 */ X1, R] = js.native
  def aperture(n: Double): js.Function1[/* list */ js.Array[_], js.Array[js.Array[_]]] = js.native
  def aperture[T](n: Double, list: js.Array[T]): js.Array[js.Array[T]] = js.native
  @JSName("aperture")
  def aperture_1[T](n: `1`, list: js.Array[T]): js.Array[js.Array[T]] = js.native
  @JSName("aperture")
  def aperture_10[T](n: `10`, list: js.Array[T]): js.Array[js.Tuple10[T, T, T, T, T, T, T, T, T, T]] = js.native
  @JSName("aperture")
  def aperture_2[T](n: `2`, list: js.Array[T]): js.Array[js.Tuple2[T, T]] = js.native
  @JSName("aperture")
  def aperture_3[T](n: `3`, list: js.Array[T]): js.Array[js.Tuple3[T, T, T]] = js.native
  @JSName("aperture")
  def aperture_4[T](n: `4`, list: js.Array[T]): js.Array[js.Tuple4[T, T, T, T]] = js.native
  @JSName("aperture")
  def aperture_5[T](n: `5`, list: js.Array[T]): js.Array[js.Tuple5[T, T, T, T, T]] = js.native
  @JSName("aperture")
  def aperture_6[T](n: `6`, list: js.Array[T]): js.Array[js.Tuple6[T, T, T, T, T, T]] = js.native
  @JSName("aperture")
  def aperture_7[T](n: `7`, list: js.Array[T]): js.Array[js.Tuple7[T, T, T, T, T, T, T]] = js.native
  @JSName("aperture")
  def aperture_8[T](n: `8`, list: js.Array[T]): js.Array[js.Tuple8[T, T, T, T, T, T, T, T]] = js.native
  @JSName("aperture")
  def aperture_9[T](n: `9`, list: js.Array[T]): js.Array[js.Tuple9[T, T, T, T, T, T, T, T, T]] = js.native
  def append[T](el: T): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  def append[T](el: T, list: js.Array[T]): js.Array[T] = js.native
  @JSName("apply")
  def apply[T, TResult](fn: js.Function2[/* arg0 */ T, /* repeated */ T, TResult]): js.Function1[/* args */ js.Array[_], TResult] = js.native
  @JSName("apply")
  def apply[T, U, TResult](fn: js.Function2[/* arg0 */ T, /* repeated */ T, TResult], args: js.Array[U]): TResult = js.native
  def applySpec[Obj /* <: Record[String, js.Function1[/* repeated */ _, _]] */](obj: Obj): js.Function1[
    /* args */ Parameters[ValueOfRecord[Obj]], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in keyof Obj ]: std.ReturnType<Obj[Key]>}
    */ typings.ramda.ramdaStrings.applySpec with Obj
  ] = js.native
  def applySpec[T](obj: js.Any): js.Function1[/* repeated */ js.Any, T] = js.native
  def applyTo[T](el: T): js.Function1[/* fn */ js.Function1[/* t */ T, _], _] = js.native
  def applyTo[T, U](el: T, fn: js.Function1[/* t */ T, U]): U = js.native
  def ascend[T](fn: js.Function1[/* obj */ T, _]): js.Function2[/* a */ T, /* b */ T, Double] = js.native
  def ascend[T](fn: js.Function1[/* obj */ T, _], a: T, b: T): Double = js.native
  def assoc[K /* <: String */](prop: K): AssocPartialOne[K] = js.native
  def assoc[T, U](__ : Placeholder, `val`: T, obj: U): js.Function1[/* prop */ String, (Record[String, T]) with U] = js.native
  def assoc[U, K /* <: String */](prop: K, __ : Placeholder, obj: U): js.Function1[/* val */ js.Any, (Record[K, _]) with U] = js.native
  def assoc[T, K /* <: String */](prop: K, `val`: T): js.Function1[/* obj */ js.Any, (Record[K, T]) with js.Any] = js.native
  def assoc[T, U, K /* <: String */](prop: K, `val`: T, obj: U): (Record[K, T]) with U = js.native
  def assocPath[T, U](__ : Placeholder, `val`: T, obj: U): js.Function1[/* path */ Path, U] = js.native
  def assocPath[T, U](path: Path): js.Any = js.native
  def assocPath[T, U](path: Path, __ : Placeholder, obj: U): js.Function1[/* val */ T, U] = js.native
  def assocPath[T, U](path: Path, `val`: T): js.Function1[/* obj */ U, U] = js.native
  def assocPath[T, U](path: Path, `val`: T, obj: U): U = js.native
  def binary(fn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def bind[T](fn: js.Function1[/* repeated */ js.Any, _], thisObj: T): js.Function1[/* repeated */ js.Any, _] = js.native
  def both(pred1: Pred): js.Function1[/* pred2 */ Pred, Pred] = js.native
  def both(pred1: Pred, pred2: Pred): Pred = js.native
  def call(fn: js.Function1[/* repeated */ js.Any, js.Function1[/* repeated */ _, _]], args: js.Any*): js.Any = js.native
  def chain[T, U](fn: js.Function1[/* n */ T, js.Array[U]]): js.Function1[/* list */ js.Array[T], js.Array[U]] = js.native
  def chain[T, U](fn: js.Function1[/* n */ T, js.Array[U]], list: js.Array[T]): js.Array[U] = js.native
  def chain[X0, X1, R](fn: js.Function2[/* x0 */ X0, /* x1 */ X1, R], fn1: js.Function1[/* x1 */ X1, X0]): js.Function1[/* x1 */ X1, R] = js.native
  def clamp[T](min: T): js.Function1[/* max */ T, js.Function1[/* value */ T, T]] = js.native
  def clamp[T](min: T, max: T): js.Function1[/* value */ T, T] = js.native
  def clamp[T](min: T, max: T, value: T): T = js.native
  @JSName("clamp")
  def clamp_T_Function2[T](min: T): js.Function2[/* max */ T, /* value */ T, T] = js.native
  def clone[T](value: T): T = js.native
  def clone[T](value: js.Array[T]): js.Array[T] = js.native
  def comparator[T](pred: js.Function2[/* a */ T, /* b */ T, Boolean]): js.Function2[/* x */ T, /* y */ T, Double] = js.native
  def complement(pred: js.Function1[/* repeated */ js.Any, Boolean]): js.Function1[/* repeated */ js.Any, Boolean] = js.native
  def compose[T1](fn0: js.Function0[T1]): js.Function0[T1] = js.native
  def compose[V0, T1](fn0: js.Function1[/* x0 */ V0, T1]): js.Function1[/* x0 */ V0, T1] = js.native
  def compose[T1, T2](fn1: js.Function1[/* x */ T1, T2], fn0: js.Function0[T1]): js.Function0[T2] = js.native
  def compose[V0, V1, T1](fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1]): js.Function2[/* x0 */ V0, /* x1 */ V1, T1] = js.native
  def compose[V0, T1, T2](fn1: js.Function1[/* x */ T1, T2], fn0: js.Function1[/* x0 */ V0, T1]): js.Function1[/* x0 */ V0, T2] = js.native
  def compose[T1, T2, T3](fn2: js.Function1[/* x */ T2, T3], fn1: js.Function1[/* x */ T1, T2], fn0: js.Function0[T1]): js.Function0[T3] = js.native
  def compose[V0, V1, V2, T1](fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1]): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1] = js.native
  def compose[V0, V1, T1, T2](fn1: js.Function1[/* x */ T1, T2], fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1]): js.Function2[/* x0 */ V0, /* x1 */ V1, T2] = js.native
  def compose[V0, T1, T2, T3](
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function1[/* x */ V0, T1]
  ): js.Function1[/* x */ V0, T3] = js.native
  def compose[T1, T2, T3, T4](
    fn3: js.Function1[/* x */ T3, T4],
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function0[T1]
  ): js.Function0[T4] = js.native
  def compose[V0, V1, V2, T1, T2](fn1: js.Function1[/* x */ T1, T2], fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1]): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T2] = js.native
  def compose[V0, V1, T1, T2, T3](
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1]
  ): js.Function2[/* x0 */ V0, /* x1 */ V1, T3] = js.native
  def compose[V0, T1, T2, T3, T4](
    fn3: js.Function1[/* x */ T3, T4],
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function1[/* x */ V0, T1]
  ): js.Function1[/* x */ V0, T4] = js.native
  def compose[T1, T2, T3, T4, T5](
    fn4: js.Function1[/* x */ T4, T5],
    fn3: js.Function1[/* x */ T3, T4],
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function0[T1]
  ): js.Function0[T5] = js.native
  def compose[V0, V1, V2, T1, T2, T3](
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1]
  ): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T3] = js.native
  def compose[V0, V1, T1, T2, T3, T4](
    fn3: js.Function1[/* x */ T3, T4],
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1]
  ): js.Function2[/* x0 */ V0, /* x1 */ V1, T4] = js.native
  def compose[V0, T1, T2, T3, T4, T5](
    fn4: js.Function1[/* x */ T4, T5],
    fn3: js.Function1[/* x */ T3, T4],
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function1[/* x */ V0, T1]
  ): js.Function1[/* x */ V0, T5] = js.native
  def compose[T1, T2, T3, T4, T5, T6](
    fn5: js.Function1[/* x */ T5, T6],
    fn4: js.Function1[/* x */ T4, T5],
    fn3: js.Function1[/* x */ T3, T4],
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function0[T1]
  ): js.Function0[T6] = js.native
  def compose[V0, V1, V2, T1, T2, T3, T4](
    fn3: js.Function1[/* x */ T3, T4],
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1]
  ): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T4] = js.native
  def compose[V0, V1, T1, T2, T3, T4, T5](
    fn4: js.Function1[/* x */ T4, T5],
    fn3: js.Function1[/* x */ T3, T4],
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1]
  ): js.Function2[/* x0 */ V0, /* x1 */ V1, T5] = js.native
  def compose[V0, T1, T2, T3, T4, T5, T6](
    fn5: js.Function1[/* x */ T5, T6],
    fn4: js.Function1[/* x */ T4, T5],
    fn3: js.Function1[/* x */ T3, T4],
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function1[/* x */ V0, T1]
  ): js.Function1[/* x */ V0, T6] = js.native
  def compose[V0, V1, V2, T1, T2, T3, T4, T5](
    fn4: js.Function1[/* x */ T4, T5],
    fn3: js.Function1[/* x */ T3, T4],
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1]
  ): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T5] = js.native
  def compose[V0, V1, T1, T2, T3, T4, T5, T6](
    fn5: js.Function1[/* x */ T5, T6],
    fn4: js.Function1[/* x */ T4, T5],
    fn3: js.Function1[/* x */ T3, T4],
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1]
  ): js.Function2[/* x0 */ V0, /* x1 */ V1, T6] = js.native
  def compose[V0, V1, V2, T1, T2, T3, T4, T5, T6](
    fn5: js.Function1[/* x */ T5, T6],
    fn4: js.Function1[/* x */ T4, T5],
    fn3: js.Function1[/* x */ T3, T4],
    fn2: js.Function1[/* x */ T2, T3],
    fn1: js.Function1[/* x */ T1, T2],
    fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1]
  ): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T6] = js.native
  def composeK[V0, T1](fn0: js.Function1[/* x0 */ V0, js.Array[T1]]): js.Function1[/* x0 */ V0, js.Array[T1]] = js.native
  def composeK[V0, T1, T2](fn1: js.Function1[/* x */ T1, js.Array[T2]], fn0: js.Function1[/* x0 */ V0, js.Array[T1]]): js.Function1[/* x0 */ V0, js.Array[T2]] = js.native
  def composeK[V0, T1, T2, T3](
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn0: js.Function1[/* x */ V0, js.Array[T1]]
  ): js.Function1[/* x */ V0, js.Array[T3]] = js.native
  def composeK[V0, T1, T2, T3, T4](
    fn3: js.Function1[/* x */ T3, js.Array[T4]],
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn0: js.Function1[/* x */ V0, js.Array[T1]]
  ): js.Function1[/* x */ V0, js.Array[T4]] = js.native
  def composeK[V0, T1, T2, T3, T4, T5](
    fn4: js.Function1[/* x */ T4, js.Array[T5]],
    fn3: js.Function1[/* x */ T3, js.Array[T4]],
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn0: js.Function1[/* x */ V0, js.Array[T1]]
  ): js.Function1[/* x */ V0, js.Array[T5]] = js.native
  def composeK[V0, T1, T2, T3, T4, T5, T6](
    fn5: js.Function1[/* x */ T5, js.Array[T6]],
    fn4: js.Function1[/* x */ T4, js.Array[T5]],
    fn3: js.Function1[/* x */ T3, js.Array[T4]],
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn0: js.Function1[/* x */ V0, js.Array[T1]]
  ): js.Function1[/* x */ V0, js.Array[T6]] = js.native
  def composeP[V0, T1](fn0: js.Function1[/* x0 */ V0, js.Promise[T1]]): js.Function1[/* x0 */ V0, js.Promise[T1]] = js.native
  def composeP[V0, T1, T2](fn1: js.Function1[/* x */ T1, js.Promise[T2]], fn0: js.Function1[/* x0 */ V0, js.Promise[T1]]): js.Function1[/* x0 */ V0, js.Promise[T2]] = js.native
  def composeP[V0, T1, T2, T3](
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn0: js.Function1[/* x */ V0, js.Promise[T1]]
  ): js.Function1[/* x */ V0, js.Promise[T3]] = js.native
  def composeP[V0, T1, T2, T3, T4](
    fn3: js.Function1[/* x */ T3, js.Promise[T4]],
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn0: js.Function1[/* x */ V0, js.Promise[T1]]
  ): js.Function1[/* x */ V0, js.Promise[T4]] = js.native
  def composeP[V0, T1, T2, T3, T4, T5](
    fn4: js.Function1[/* x */ T4, js.Promise[T5]],
    fn3: js.Function1[/* x */ T3, js.Promise[T4]],
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn0: js.Function1[/* x */ V0, js.Promise[T1]]
  ): js.Function1[/* x */ V0, js.Promise[T5]] = js.native
  def composeP[V0, T1, T2, T3, T4, T5, T6](
    fn5: js.Function1[/* x */ T5, js.Promise[T6]],
    fn4: js.Function1[/* x */ T4, js.Promise[T5]],
    fn3: js.Function1[/* x */ T3, js.Promise[T4]],
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn0: js.Function1[/* x */ V0, js.Promise[T1]]
  ): js.Function1[/* x */ V0, js.Promise[T6]] = js.native
  def composeWith(composer: js.Function1[/* a */ js.Any, _]): js.Function1[/* fns */ ComposeWithFns[_, _], js.Function1[/* x */ _, _]] = js.native
  def composeWith[V0, T](composer: js.Function1[/* a */ js.Any, _], fns: ComposeWithFns[V0, T]): js.Function1[/* x0 */ V0, T] = js.native
  def concat(list1: String): js.Function1[/* list2 */ String, String] = js.native
  def concat(list1: String, list2: String): String = js.native
  def concat[T](list1: js.Array[T]): js.Function1[/* list2 */ js.Array[T], js.Array[T]] = js.native
  def concat[T](list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  def concat[T](placeholder: Placeholder): js.Function2[/* list2 */ js.Array[T], /* list1 */ js.Array[T], js.Array[T]] = js.native
  def concat[T](placeholder: Placeholder, list2: js.Array[T]): js.Function1[/* list1 */ js.Array[T], js.Array[T]] = js.native
  def cond(fns: js.Array[js.Tuple2[Pred, js.Function1[/* repeated */ _, _]]]): js.Function1[/* repeated */ js.Any, _] = js.native
  @JSName("cond")
  def cond_AB[A, B](fns: js.Array[js.Tuple2[SafePred[A], js.Function1[/* repeated */ A, B]]]): js.Function1[/* repeated */ A, B] = js.native
  def construct[A /* <: js.Array[_] */, T](constructor: js.Function1[/* a */ A, T]): js.Function1[/* a */ A, T] = js.native
  def construct[A /* <: js.Array[_] */, T](constructor: AnonInstantiable[A, T]): js.Function1[/* a */ A, T] = js.native
  def constructN[A /* <: js.Array[_] */, T](n: Double, constructor: js.Function1[/* a */ A, T]): js.Function1[/* a */ Partial[A], T] = js.native
  def constructN[A /* <: js.Array[_] */, T](n: Double, constructor: AnonInstantiable[A, T]): js.Function1[/* a */ Partial[A], T] = js.native
  def contains(__ : Placeholder): js.Function2[/* list */ String, /* a */ String, Boolean] = js.native
  def contains(__ : Placeholder, list: String): js.Function1[/* a */ String, Boolean] = js.native
  def contains(a: String): js.Function1[/* list */ String, Boolean] = js.native
  def contains(a: String, list: String): Boolean = js.native
  def contains[T](__ : Placeholder, list: js.Array[T]): js.Function1[/* a */ T, Boolean] = js.native
  def contains[T](a: T): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def contains[T](a: T, list: js.Array[T]): Boolean = js.native
  @JSName("contains")
  def contains_T[T](__ : Placeholder): js.Function2[/* list */ js.Array[T], /* a */ T, Boolean] = js.native
  def converge(after: js.Function1[/* repeated */ js.Any, _], fns: js.Array[js.Function1[/* repeated */ _, _]]): js.Function1[/* repeated */ js.Any, _] = js.native
  def countBy[T](fn: js.Function1[/* a */ T, String | Double]): js.Function1[/* list */ js.Array[T], StringDictionary[Double]] = js.native
  def countBy[T](fn: js.Function1[/* a */ T, String | Double], list: js.Array[T]): StringDictionary[Double] = js.native
  def curry[F /* <: js.Function1[/* args */ js.Any, _] */](f: F): js.Any = js.native
  def curryN(length: Double, fn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def dec(n: Double): Double = js.native
  def defaultTo[T](a: T): js.Function1[/* b */ js.UndefOr[js.Any | Null], T | _] = js.native
  def defaultTo[T, U](a: T, b: U): T | U = js.native
  @JSName("defaultTo")
  def defaultTo_TU_Union[T, U](a: T): T | U = js.native
  def descend[T](fn: js.Function1[/* obj */ T, _]): js.Function2[/* a */ T, /* b */ T, Double] = js.native
  def descend[T](fn: js.Function1[/* obj */ T, _], a: T, b: T): Double = js.native
  def difference[T](list1: js.Array[T]): js.Function1[/* list2 */ js.Array[T], js.Array[T]] = js.native
  def difference[T](list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  def differenceWith[T1, T2](pred: js.Function2[/* a */ T1, /* b */ T2, Boolean]): js.Function2[/* list1 */ js.Array[T1], /* list2 */ js.Array[T2], js.Array[T1]] = js.native
  def differenceWith[T1, T2](pred: js.Function2[/* a */ T1, /* b */ T2, Boolean], list1: js.Array[T1]): js.Function1[/* list2 */ js.Array[T2], js.Array[T1]] = js.native
  def differenceWith[T1, T2](pred: js.Function2[/* a */ T1, /* b */ T2, Boolean], list1: js.Array[T1], list2: js.Array[T2]): js.Array[T1] = js.native
  def dissoc(prop: String): js.Function1[/* obj */ js.Any, _] = js.native
  def dissoc[T](prop: String, obj: js.Any): T = js.native
  def dissocPath[T](path: Path): js.Function1[/* obj */ js.Any, T] = js.native
  def dissocPath[T](path: Path, obj: js.Any): T = js.native
  def divide(__ : Placeholder): js.Function2[/* b */ Double, /* a */ Double, Double] = js.native
  def divide(__ : Placeholder, b: Double): js.Function1[/* a */ Double, Double] = js.native
  def divide(a: Double): js.Function1[/* b */ Double, Double] = js.native
  def divide(a: Double, b: Double): Double = js.native
  def drop(n: Double, xs: String): String = js.native
  def drop[T](n: Double): FnCall[T] = js.native
  def drop[T](n: Double, xs: js.Array[T]): js.Array[T] = js.native
  def dropLast(n: Double, xs: String): String = js.native
  def dropLast[T](n: Double): FnCallXs[T] = js.native
  def dropLast[T](n: Double, xs: js.Array[T]): js.Array[T] = js.native
  def dropLastWhile[T](fn: js.Function1[/* a */ T, Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def dropLastWhile[T](fn: js.Function1[/* a */ T, Boolean], list: js.Array[T]): js.Array[T] = js.native
  def dropRepeats[T](list: js.Array[T]): js.Array[T] = js.native
  def dropRepeatsWith[T](predicate: js.Function2[/* left */ T, /* right */ T, Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def dropRepeatsWith[T](predicate: js.Function2[/* left */ T, /* right */ T, Boolean], list: js.Array[T]): js.Array[T] = js.native
  def dropWhile[T](fn: js.Function1[/* a */ T, Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def dropWhile[T](fn: js.Function1[/* a */ T, Boolean], list: js.Array[T]): js.Array[T] = js.native
  def either(pred1: Pred): js.Function1[/* pred2 */ Pred, Pred] = js.native
  def either(pred1: Pred, pred2: Pred): Pred = js.native
  def empty[T](x: T): T = js.native
  def endsWith(a: String): js.Function1[/* list */ String, Boolean] = js.native
  def endsWith(a: String, list: String): Boolean = js.native
  def endsWith[T](a: T): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def endsWith[T](a: T, list: js.Array[T]): Boolean = js.native
  def endsWith[T](a: js.Array[T]): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def endsWith[T](a: js.Array[T], list: js.Array[T]): Boolean = js.native
  def eqBy[T, U](fn: js.Function1[/* a */ T, U]): js.Any = js.native
  def eqBy[T, U](fn: js.Function1[/* a */ T, U], a: T): js.Function1[/* b */ T, Boolean] = js.native
  def eqBy[T, U](fn: js.Function1[/* a */ T, U], a: T, b: T): Boolean = js.native
  def eqProps[P /* <: String */](prop: P): js.Function2[/* obj1 */ Record[P, _], /* obj2 */ Record[P, _], Boolean] = js.native
  def eqProps[T](prop: String, obj1: T): js.Function1[/* obj2 */ js.Any, Boolean] = js.native
  def eqProps[T, U](prop: String, obj1: T, obj2: U): Boolean = js.native
  def equals[T](a: T, b: T): Boolean = js.native
  def evolve[E /* <: Evolver[_] */](transformations: E): js.Function1[/* obj */ Evolvable[E], Evolve[Evolvable[E], E]] = js.native
  def evolve[E /* <: Evolver[_] */, V /* <: Evolvable[E] */](transformations: E, obj: V): Evolve[V, E] = js.native
  def find[T](fn: js.Function1[/* a */ T, Boolean]): js.Function1[/* list */ js.Array[T], js.UndefOr[T]] = js.native
  def find[T](fn: js.Function1[/* a */ T, Boolean], list: js.Array[T]): js.UndefOr[T] = js.native
  def findIndex[T](fn: js.Function1[/* a */ T, Boolean]): js.Function1[/* list */ js.Array[T], Double] = js.native
  def findIndex[T](fn: js.Function1[/* a */ T, Boolean], list: js.Array[T]): Double = js.native
  def findLast[T](fn: js.Function1[/* a */ T, Boolean]): js.Function1[/* list */ js.Array[T], js.UndefOr[T]] = js.native
  def findLast[T](fn: js.Function1[/* a */ T, Boolean], list: js.Array[T]): js.UndefOr[T] = js.native
  def findLastIndex[T](fn: js.Function1[/* a */ T, Boolean]): js.Function1[/* list */ js.Array[T], Double] = js.native
  def findLastIndex[T](fn: js.Function1[/* a */ T, Boolean], list: js.Array[T]): Double = js.native
  def flatten[T /* <: js.Array[_] */](list: T): js.Any = js.native
  def flip[F /* <: js.Function1[/* args */ js.Any, _] */, P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.F.Parameters<F> */ js.Any */](fn: F): js.Any = js.native
  def flip[T, U, TResult](fn: js.Function2[/* arg0 */ T, /* arg1 */ U, TResult]): js.Function2[/* arg1 */ U, /* arg0 */ js.UndefOr[T], TResult] = js.native
  def forEach[T](fn: js.Function1[/* x */ T, Unit]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def forEach[T](fn: js.Function1[/* x */ T, Unit], list: js.Array[T]): js.Array[T] = js.native
  def forEachObjIndexed[T](
    fn: js.Function3[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      /* key */ String, 
      /* obj */ T, 
      Unit
    ]
  ): js.Function1[/* obj */ T, T] = js.native
  def forEachObjIndexed[T](
    fn: js.Function3[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      /* key */ String, 
      /* obj */ T, 
      Unit
    ],
    obj: T
  ): T = js.native
  def fromPairs[V](pairs: js.Array[KeyValuePair[Double, V]]): NumberDictionary[V] = js.native
  @JSName("fromPairs")
  def fromPairs_V_StringDictionary[V](pairs: js.Array[KeyValuePair[String, V]]): StringDictionary[V] = js.native
  def groupBy[T](fn: js.Function1[/* a */ T, String]): js.Function1[/* list */ js.Array[T], StringDictionary[js.Array[T]]] = js.native
  def groupBy[T](fn: js.Function1[/* a */ T, String], list: js.Array[T]): StringDictionary[js.Array[T]] = js.native
  def groupWith[T](fn: js.Function2[/* x */ T, /* y */ T, Boolean]): js.Function1[/* list */ js.Array[T], js.Array[js.Array[T]]] = js.native
  def groupWith[T](fn: js.Function2[/* x */ T, /* y */ T, Boolean], list: String): js.Array[String] = js.native
  def groupWith[T](fn: js.Function2[/* x */ T, /* y */ T, Boolean], list: js.Array[T]): js.Array[js.Array[T]] = js.native
  def gt(__ : Placeholder): js.Function2[/* b */ Double, /* a */ Double, Boolean] = js.native
  def gt(__ : Placeholder, b: Double): js.Function1[/* a */ Double, Boolean] = js.native
  def gt(a: Double): js.Function1[/* b */ Double, Boolean] = js.native
  def gt(a: Double, b: Double): Boolean = js.native
  def gte(__ : Placeholder): js.Function2[/* b */ Double, /* a */ Double, Boolean] = js.native
  def gte(__ : Placeholder, b: Double): js.Function1[/* a */ Double, Boolean] = js.native
  def gte(a: Double): js.Function1[/* b */ Double, Boolean] = js.native
  def gte(a: Double, b: Double): Boolean = js.native
  def has(s: String): js.Function1[/* obj */ js.Any, Boolean] = js.native
  def has[T](__ : Placeholder): js.Function2[/* obj */ T, /* s */ String, Boolean] = js.native
  def has[T](__ : Placeholder, obj: T): js.Function1[/* s */ String, Boolean] = js.native
  def has[T](s: String, obj: T): Boolean = js.native
  def hasIn(s: String): js.Function1[/* obj */ js.Any, Boolean] = js.native
  def hasIn[T](s: String, obj: T): Boolean = js.native
  def hasPath(list: js.Array[String]): js.Function1[/* obj */ js.Any, Boolean] = js.native
  def hasPath[T](list: js.Array[String], obj: T): Boolean = js.native
  def head(list: js.Array[js.Any]): js.UndefOr[scala.Nothing] = js.native
  def head(str: String): String = js.native
  @JSName("head")
  def head_T_Any[T /* <: js.Any */](list: js.Array[T]): js.UndefOr[T] = js.native
  def identical[T](a: T): js.Function1[/* b */ T, Boolean] = js.native
  def identical[T](a: T, b: T): Boolean = js.native
  def identity[T](a: T): T = js.native
  def ifElse(fn: Pred, onTrue: Arity1Fn, onFalse: Arity1Fn): Arity1Fn = js.native
  def ifElse(fn: Pred, onTrue: Arity2Fn, onFalse: Arity2Fn): Arity2Fn = js.native
  def inc(n: Double): Double = js.native
  def includes(s: String): js.Function1[/* list */ js.Array[String] | String, Boolean] = js.native
  def includes(s: String, list: String): Boolean = js.native
  def includes(s: String, list: js.Array[String]): Boolean = js.native
  def includes[T](target: T): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def includes[T](target: T, list: js.Array[T]): Boolean = js.native
  def indexBy[T](fn: js.Function1[/* a */ T, String]): js.Function1[/* list */ js.Array[T], StringDictionary[T]] = js.native
  def indexBy[T](fn: js.Function1[/* a */ T, String], list: js.Array[T]): StringDictionary[T] = js.native
  def indexOf[T](target: T): js.Function1[/* list */ js.Array[T], Double] = js.native
  def indexOf[T](target: T, list: js.Array[T]): Double = js.native
  def init(list: String): String = js.native
  def init[T](list: js.Array[T]): js.Array[T] = js.native
  def innerJoin[T1, T2](pred: js.Function2[/* a */ T1, /* b */ T2, Boolean]): js.Function2[/* list1 */ js.Array[T1], /* list2 */ js.Array[T2], js.Array[T1]] = js.native
  def innerJoin[T1, T2](pred: js.Function2[/* a */ T1, /* b */ T2, Boolean], list1: js.Array[T1]): js.Function1[/* list2 */ js.Array[T2], js.Array[T1]] = js.native
  def innerJoin[T1, T2](pred: js.Function2[/* a */ T1, /* b */ T2, Boolean], list1: js.Array[T1], list2: js.Array[T2]): js.Array[T1] = js.native
  def insert(index: Double): js.Function2[/* elt */ js.Any, /* list */ js.Array[_], js.Array[_]] = js.native
  def insert[T](index: Double, elt: T): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def insert[T](index: Double, elt: T, list: js.Array[T]): js.Array[T] = js.native
  def insertAll(index: Double): js.Function2[/* elts */ js.Array[_], /* list */ js.Array[_], js.Array[_]] = js.native
  def insertAll[T](index: Double, elts: js.Array[T]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def insertAll[T](index: Double, elts: js.Array[T], list: js.Array[T]): js.Array[T] = js.native
  def intersection[T](list1: js.Array[T]): js.Function1[/* list2 */ js.Array[T], js.Array[T]] = js.native
  def intersection[T](list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  def intersectionWith[T](pred: js.Function2[/* a */ T, /* b */ T, Boolean], list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  def intersperse[T](separator: T): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def intersperse[T](separator: T, list: js.Array[T]): js.Array[T] = js.native
  def into(acc: js.Any): js.Function2[/* xf */ js.Function1[/* repeated */ js.Any, _], /* list */ js.Array[_], js.Array[_]] = js.native
  def into(acc: js.Any, xf: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  def into[T](acc: js.Any, xf: js.Function1[/* repeated */ js.Any, _], list: js.Array[T]): js.Array[T] = js.native
  def invert[T](obj: T): StringDictionary[js.Array[String]] = js.native
  def invertObj(obj: NumberDictionary[String]): StringDictionary[String] = js.native
  def invertObj(obj: StringDictionary[String]): StringDictionary[String] = js.native
  def invoker(arity: Double, method: String): js.Function1[/* repeated */ js.Any, _] = js.native
  def is(ctor: js.Any): js.Function1[/* val */ js.Any, Boolean] = js.native
  def is(ctor: js.Any, `val`: js.Any): Boolean = js.native
  def isEmpty(value: js.Any): Boolean = js.native
  def isNil(value: js.Any): Boolean = js.native
  def join(x: String): js.Function1[/* xs */ js.Array[_], String] = js.native
  def join(x: String, xs: js.Array[_]): String = js.native
  def juxt[A /* <: js.Array[_] */, U](fns: js.Array[js.Function1[/* args */ A, U]]): js.Function1[/* args */ A, js.Array[U]] = js.native
  def juxt[A /* <: js.Array[_] */, R1, R2](fns: js.Tuple2[js.Function1[/* a */ A, R1], js.Function1[/* a */ A, R2]]): js.Function1[/* a */ A, js.Tuple2[R1, R2]] = js.native
  def juxt[A /* <: js.Array[_] */, R1, R2, R3](
    fns: js.Tuple3[
      js.Function1[/* a */ A, R1], 
      js.Function1[/* a */ A, R2], 
      js.Function1[/* a */ A, R3]
    ]
  ): js.Function1[/* a */ A, js.Tuple3[R1, R2, R3]] = js.native
  def juxt[A /* <: js.Array[_] */, R1, R2, R3, R4](
    fns: js.Tuple4[
      js.Function1[/* a */ A, R1], 
      js.Function1[/* a */ A, R2], 
      js.Function1[/* a */ A, R3], 
      js.Function1[/* a */ A, R4]
    ]
  ): js.Function1[/* a */ A, js.Tuple4[R1, R2, R3, R4]] = js.native
  def juxt[A /* <: js.Array[_] */, R1, R2, R3, R4, R5](
    fns: js.Tuple5[
      js.Function1[/* a */ A, R1], 
      js.Function1[/* a */ A, R2], 
      js.Function1[/* a */ A, R3], 
      js.Function1[/* a */ A, R4], 
      js.Function1[/* a */ A, R5]
    ]
  ): js.Function1[/* a */ A, js.Tuple5[R1, R2, R3, R4, R5]] = js.native
  def keys[T](x: T): js.Array[String] = js.native
  def keysIn[T](obj: T): js.Array[String] = js.native
  @JSName("keys")
  def keys_T_Object[T /* <: js.Object */](x: T): js.Array[String] = js.native
  def last(list: js.Array[js.Any]): js.UndefOr[scala.Nothing] = js.native
  def last(str: String): String = js.native
  def lastIndexOf[T](target: T, list: js.Array[T]): Double = js.native
  @JSName("last")
  def last_T_Any[T /* <: js.Any */](list: js.Array[T]): js.UndefOr[T] = js.native
  def length[T](list: js.Array[T]): Double = js.native
  def lens[T, U, V](getter: js.Function1[/* s */ T, U], setter: js.Function2[/* a */ U, /* s */ T, V]): Lens = js.native
  def lensIndex(n: Double): Lens = js.native
  def lensPath(path: Path): Lens = js.native
  def lensProp(str: String): AnonCall = js.native
  def lift(fn: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Any = js.native
  def liftN(n: Double, fn: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Any = js.native
  def lt(__ : Placeholder): js.Function2[/* b */ Double, /* a */ Double, Boolean] = js.native
  def lt(__ : Placeholder, b: Double): js.Function1[/* a */ Double, Boolean] = js.native
  def lt(a: Double): js.Function1[/* b */ Double, Boolean] = js.native
  def lt(a: Double, b: Double): Boolean = js.native
  def lte(__ : Placeholder): js.Function2[/* b */ Double, /* a */ Double, Boolean] = js.native
  def lte(__ : Placeholder, b: Double): js.Function1[/* a */ Double, Boolean] = js.native
  def lte(a: Double): js.Function1[/* b */ Double, Boolean] = js.native
  def lte(a: Double, b: Double): Boolean = js.native
  def map[T, U](
    fn: js.Function1[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T & keyof U] */ /* x */ js.Any) | (/* x */ T), 
      (/* import warning: importer.ImportType#apply Failed type conversion: U[keyof T & keyof U] */ js.Any) | U
    ]
  ): js.Function1[/* list */ js.Array[T], js.Array[U]] = js.native
  def map[T, U](
    fn: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T & keyof U] */ /* x */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: U[keyof T & keyof U] */ js.Any
    ],
    list: T
  ): U = js.native
  def map[T, U](fn: js.Function1[/* x */ T, U], list: js.Array[T]): js.Array[U] = js.native
  def map[T, U](fn: js.Function1[/* x */ T, U], obj: Functor[T]): Functor[U] = js.native
  def mapAccum[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]]): js.Function2[/* acc */ U, /* list */ js.Array[T], js.Tuple2[U, js.Array[TResult]]] = js.native
  def mapAccum[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]], acc: U): js.Function1[/* list */ js.Array[T], js.Tuple2[U, js.Array[TResult]]] = js.native
  def mapAccum[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]], acc: U, list: js.Array[T]): js.Tuple2[U, js.Array[TResult]] = js.native
  def mapAccumRight[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]]): js.Function2[/* acc */ U, /* list */ js.Array[T], js.Tuple2[U, js.Array[TResult]]] = js.native
  def mapAccumRight[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]], acc: U): js.Function1[/* list */ js.Array[T], js.Tuple2[U, js.Array[TResult]]] = js.native
  def mapAccumRight[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]], acc: U, list: js.Array[T]): js.Tuple2[U, js.Array[TResult]] = js.native
  def mapObjIndexed[T, TResult](fn: js.Function3[/* value */ T, /* key */ String, /* obj */ js.UndefOr[js.Any], TResult]): js.Function1[/* obj */ js.Any, StringDictionary[TResult]] = js.native
  def mapObjIndexed[T, TResult](
    fn: js.Function3[/* value */ T, /* key */ String, /* obj */ js.UndefOr[js.Any], TResult],
    obj: js.Any
  ): StringDictionary[TResult] = js.native
  def mapObjIndexed[T, TResult](
    fn: js.Function3[/* value */ T, /* key */ String, /* obj */ js.UndefOr[StringDictionary[T]], TResult],
    obj: StringDictionary[T]
  ): StringDictionary[TResult] = js.native
  @JSName("mapObjIndexed")
  def mapObjIndexed_TTResultTKey_String[T, TResult, TKey /* <: String */](fn: js.Function3[/* value */ T, /* key */ TKey, /* obj */ js.UndefOr[Record[TKey, T]], TResult]): js.Function1[/* obj */ Record[TKey, T], Record[TKey, TResult]] = js.native
  @JSName("mapObjIndexed")
  def mapObjIndexed_TTResultTKey_String_Record[T, TResult, TKey /* <: String */](
    fn: js.Function3[/* value */ T, /* key */ TKey, /* obj */ js.UndefOr[Record[TKey, T]], TResult],
    obj: Record[TKey, T]
  ): Record[TKey, TResult] = js.native
  def `match`(regexp: RegExp): js.Function1[/* str */ String, js.Array[String]] = js.native
  def `match`(regexp: RegExp, str: String): js.Array[String] = js.native
  def mathMod(__ : Placeholder): js.Function2[/* b */ Double, /* a */ Double, Double] = js.native
  def mathMod(__ : Placeholder, b: Double): js.Function1[/* a */ Double, Double] = js.native
  def mathMod(a: Double): js.Function1[/* b */ Double, Double] = js.native
  def mathMod(a: Double, b: Double): Double = js.native
  def max(a: String): js.Function1[/* b */ String, String] = js.native
  def max(a: String, b: String): String = js.native
  def max(a: Boolean): js.Function1[/* b */ Boolean, Boolean] = js.native
  def max(a: Boolean, b: Boolean): Boolean = js.native
  def max(a: Double): js.Function1[/* b */ Double, Double] = js.native
  def max(a: Double, b: Double): Double = js.native
  def max(a: Date): js.Function1[/* b */ Date, Date] = js.native
  def max(a: Date, b: Date): Date = js.native
  def maxBy[T](keyFn: js.Function1[/* a */ T, Ord]): js.Any = js.native
  def maxBy[T](keyFn: js.Function1[/* a */ T, Ord], a: T): js.Function1[/* b */ T, T] = js.native
  def maxBy[T](keyFn: js.Function1[/* a */ T, Ord], a: T, b: T): T = js.native
  def mean(list: js.Array[Double]): Double = js.native
  def median(list: js.Array[Double]): Double = js.native
  def memoizeWith[T /* <: js.Function1[/* repeated */ js.Any, _] */](keyFn: js.Function1[/* v */ Parameters[T], String], fn: T): T = js.native
  def merge(__ : Placeholder): js.Function2[/* b */ js.Object, /* a */ js.Object, Merge[js.Object, js.Object, flat]] = js.native
  def merge[O2 /* <: js.Object */](__ : Placeholder, b: O2): js.Function1[/* a */ js.Object, Merge[O2, js.Object, flat]] = js.native
  def merge[O1 /* <: js.Object */](a: O1): js.Function1[/* b */ js.Object, Merge[js.Object, O1, flat]] = js.native
  def merge[O1 /* <: js.Object */, O2 /* <: js.Object */](a: O1, b: O2): Merge[O2, O1, flat] = js.native
  def mergeAll[Os /* <: js.Array[js.Object] */](list: Os): MergeAll[Os] = js.native
  def mergeDeepLeft[O1 /* <: js.Object */](o1: O1): js.Function1[/* o2 */ js.Object, Merge[O1, js.Object, deep]] = js.native
  def mergeDeepLeft[O1 /* <: js.Object */, O2 /* <: js.Object */](o1: O1, o2: O2): Merge[O1, O2, deep] = js.native
  def mergeDeepRight[O1 /* <: js.Object */](a: O1): js.Function1[/* o2 */ js.Object, Merge[js.Object, O1, deep]] = js.native
  def mergeDeepRight[O1 /* <: js.Object */, O2 /* <: js.Object */](o1: O1, o2: O2): Merge[O2, O1, deep] = js.native
  def mergeDeepWith[T1, T2](fn: js.Function2[/* x */ js.Any, /* z */ js.Any, _]): js.Function2[/* a */ T1, /* b */ T2, _] = js.native
  def mergeDeepWith[T1, T2](fn: js.Function2[/* x */ js.Any, /* z */ js.Any, _], a: T1): js.Function1[/* b */ T2, _] = js.native
  def mergeDeepWith[T1, T2](fn: js.Function2[/* x */ js.Any, /* z */ js.Any, _], a: T1, b: T2): js.Any = js.native
  def mergeDeepWithKey[T1, T2](fn: js.Function3[/* k */ String, /* x */ js.Any, /* z */ js.Any, _]): js.Function2[/* a */ T1, /* b */ T2, _] = js.native
  def mergeDeepWithKey[T1, T2](fn: js.Function3[/* k */ String, /* x */ js.Any, /* z */ js.Any, _], a: T1): js.Function1[/* b */ T2, _] = js.native
  def mergeDeepWithKey[T1, T2](fn: js.Function3[/* k */ String, /* x */ js.Any, /* z */ js.Any, _], a: T1, b: T2): js.Any = js.native
  def mergeLeft[O1 /* <: js.Object */](a: O1): js.Function1[/* b */ js.Object, Merge[O1, js.Object, flat]] = js.native
  def mergeLeft[O1 /* <: js.Object */, O2 /* <: js.Object */](a: O1, b: O2): Merge[O1, O2, flat] = js.native
  def mergeRight[O1 /* <: js.Object */](a: O1): js.Function1[/* b */ js.Object, Merge[js.Object, O1, flat]] = js.native
  def mergeRight[O1 /* <: js.Object */, O2 /* <: js.Object */](a: O1, b: O2): Merge[O2, O1, flat] = js.native
  def mergeWith(fn: js.Function2[/* x */ js.Any, /* z */ js.Any, _]): js.Function2[/* a */ js.Any, /* b */ js.Any, _] = js.native
  def mergeWith[U](fn: js.Function2[/* x */ js.Any, /* z */ js.Any, _], a: U): js.Function1[/* b */ js.Any, _] = js.native
  def mergeWith[U, V](fn: js.Function2[/* x */ js.Any, /* z */ js.Any, _], a: U, b: V): js.Any = js.native
  def mergeWithKey(fn: js.Function3[/* str */ String, /* x */ js.Any, /* z */ js.Any, _]): js.Function2[/* a */ js.Any, /* b */ js.Any, _] = js.native
  def mergeWithKey[U](fn: js.Function3[/* str */ String, /* x */ js.Any, /* z */ js.Any, _], a: U): js.Function1[/* b */ js.Any, _] = js.native
  def mergeWithKey[U, V](fn: js.Function3[/* str */ String, /* x */ js.Any, /* z */ js.Any, _], a: U, b: V): js.Any = js.native
  def min(a: String): js.Function1[/* b */ String, String] = js.native
  def min(a: String, b: String): String = js.native
  def min(a: Boolean): js.Function1[/* b */ Boolean, Boolean] = js.native
  def min(a: Boolean, b: Boolean): Boolean = js.native
  def min(a: Double): js.Function1[/* b */ Double, Double] = js.native
  def min(a: Double, b: Double): Double = js.native
  def min(a: Date): js.Function1[/* b */ Date, Date] = js.native
  def min(a: Date, b: Date): Date = js.native
  def minBy[T](keyFn: js.Function1[/* a */ T, Ord]): js.Any = js.native
  def minBy[T](keyFn: js.Function1[/* a */ T, Ord], a: T): js.Function1[/* b */ T, T] = js.native
  def minBy[T](keyFn: js.Function1[/* a */ T, Ord], a: T, b: T): T = js.native
  def modulo(__ : Placeholder): js.Function2[/* b */ Double, /* a */ Double, Double] = js.native
  def modulo(__ : Placeholder, b: Double): js.Function1[/* a */ Double, Double] = js.native
  def modulo(a: Double): js.Function1[/* b */ Double, Double] = js.native
  def modulo(a: Double, b: Double): Double = js.native
  def move(from: Double): FnCallToList = js.native
  def move(from: Double, to: Double): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  def move[T](from: Double, to: Double, list: js.Array[T]): js.Array[T] = js.native
  def multiply(a: Double): js.Function1[/* b */ Double, Double] = js.native
  def multiply(a: Double, b: Double): Double = js.native
  def nAry(n: Double): js.Function1[/* fn */ js.Function1[/* repeated */ js.Any, _], js.Function1[/* repeated */ _, _]] = js.native
  def nAry(n: Double, fn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def negate(n: Double): Double = js.native
  def none[T](fn: js.Function1[/* a */ T, Boolean]): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def none[T](fn: js.Function1[/* a */ T, Boolean], list: js.Array[T]): Boolean = js.native
  def not(value: js.Any): Boolean = js.native
  def nth(n: Double): js.Function1[/* list */ js.Array[_], js.UndefOr[_]] = js.native
  def nth[T](n: Double, list: js.Array[T]): js.UndefOr[T] = js.native
  def nthArg(n: Double): js.Function1[/* repeated */ js.Any, _] = js.native
  def o[T2, R](f: js.Function1[/* x */ T2, R]): FnCallGV[T2, R] = js.native
  def o[T1, T2, R](f: js.Function1[/* x */ T2, R], g: js.Function1[/* x */ T1, T2]): js.Function1[/* v */ T1, R] = js.native
  def o[T1, T2, R](f: js.Function1[/* x */ T2, R], g: js.Function1[/* x */ T1, T2], v: T1): R = js.native
  def objOf[K /* <: String */](key: K): js.Function1[/* value */ js.Any, Record[K, _]] = js.native
  def objOf[T, K /* <: String */](key: K, value: T): Record[K, T] = js.native
  def of[T](x: T): js.Array[T] = js.native
  def omit[K /* <: String */](names: js.Array[K]): js.Function1[/* obj */ js.Any, Omit[_, K]] = js.native
  def omit[T, K /* <: String */](names: js.Array[K], obj: T): Omit[T, K] = js.native
  def once(fn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  @JSName("once")
  def once_T[T](fn: js.Function1[/* repeated */ js.Any, T]): js.Function1[/* repeated */ js.Any, T] = js.native
  def or[T](a: T): js.Function1[/* b */ js.Any, T | _] = js.native
  def or[T /* <: AnonOr */, U](fn1: T, val2: U): T | U = js.native
  @JSName("or")
  def or_TU[T, U](a: T, b: U): T | U = js.native
  @JSName("or")
  def or_T_AnonOr[T /* <: AnonOr */](fn1: T): js.Function1[/* val2 */ js.Any, T | _] = js.native
  def otherwise[A, B](onError: js.Function1[/* error */ js.Any, B | js.Promise[B]]): js.Function1[/* promise */ js.Promise[A], js.Promise[B]] = js.native
  def otherwise[A, B](onError: js.Function1[/* error */ js.Any, B | js.Promise[B]], promise: js.Promise[A]): js.Promise[B] = js.native
  def over(lens: Lens): js.Function2[/* fn */ Arity1Fn, /* value */ js.Any, _] = js.native
  def over(lens: Lens, fn: Arity1Fn): js.Function1[/* value */ js.Any, _] = js.native
  def over[T](lens: Lens, fn: Arity1Fn, value: T): T = js.native
  def over[T](lens: Lens, fn: Arity1Fn, value: js.Array[T]): js.Array[T] = js.native
  def pair[F, S](fst: F, snd: S): js.Tuple2[F, S] = js.native
  def partial[T](fn: js.Function1[/* repeated */ js.Any, T], args: js.Array[_]): js.Function1[/* repeated */ js.Any, T] = js.native
  def partial[V0, V1, T](fn: js.Function2[/* x0 */ V0, /* x1 */ V1, T], args: js.Array[V0]): js.Function1[/* x1 */ V1, T] = js.native
  def partial[V0, V1, V2, T](fn: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T], args: js.Array[V0]): js.Function2[/* x1 */ V1, /* x2 */ V2, T] = js.native
  def partial[V0, V1, V2, T](fn: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T], args: js.Tuple2[V0, V1]): js.Function1[/* x2 */ V2, T] = js.native
  def partial[V0, V1, V2, V3, T](fn: js.Function4[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, /* x3 */ V3, T], args: js.Array[V0]): js.Function3[/* x1 */ V1, /* x2 */ V2, /* x3 */ V3, T] = js.native
  def partial[V0, V1, V2, V3, T](fn: js.Function4[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, /* x3 */ V3, T], args: js.Tuple2[V0, V1]): js.Function2[/* x2 */ V2, /* x3 */ V3, T] = js.native
  def partial[V0, V1, V2, V3, T](
    fn: js.Function4[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, /* x3 */ V3, T],
    args: js.Tuple3[V0, V1, V2]
  ): js.Function1[/* x2 */ V3, T] = js.native
  def partialRight[T](fn: js.Function1[/* repeated */ js.Any, T], args: js.Array[_]): js.Function1[/* repeated */ js.Any, T] = js.native
  def partialRight[V0, V1, T](fn: js.Function2[/* x0 */ V0, /* x1 */ V1, T], args: js.Array[V1]): js.Function1[/* x1 */ V0, T] = js.native
  def partialRight[V0, V1, V2, T](fn: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T], args: js.Array[V2]): js.Function2[/* x1 */ V0, /* x2 */ V1, T] = js.native
  def partialRight[V0, V1, V2, T](fn: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T], args: js.Tuple2[V1, V2]): js.Function1[/* x2 */ V0, T] = js.native
  def partialRight[V0, V1, V2, V3, T](fn: js.Function4[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, /* x3 */ V3, T], args: js.Array[V3]): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T] = js.native
  def partialRight[V0, V1, V2, V3, T](fn: js.Function4[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, /* x3 */ V3, T], args: js.Tuple2[V2, V3]): js.Function2[/* x0 */ V0, /* x1 */ V1, T] = js.native
  def partialRight[V0, V1, V2, V3, T](
    fn: js.Function4[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, /* x3 */ V3, T],
    args: js.Tuple3[V1, V2, V3]
  ): js.Function1[/* x0 */ V0, T] = js.native
  def partition(fn: js.Function1[/* a */ String, Boolean]): js.Function1[/* list */ js.Array[String], js.Tuple2[js.Array[String], js.Array[String]]] = js.native
  def partition(fn: js.Function1[/* a */ String, Boolean], list: js.Array[String]): js.Tuple2[js.Array[String], js.Array[String]] = js.native
  @JSName("partition")
  def partition_T[T](fn: js.Function1[/* a */ T, Boolean]): js.Function1[/* list */ js.Array[T], js.Tuple2[js.Array[T], js.Array[T]]] = js.native
  @JSName("partition")
  def partition_T[T](fn: js.Function1[/* a */ T, Boolean], list: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def path[T](path: Path): js.Function1[/* obj */ js.Any, js.UndefOr[T]] = js.native
  def path[T](path: Path, obj: js.Any): js.UndefOr[T] = js.native
  def pathEq(path: Path): js.Any = js.native
  def pathEq(path: Path, `val`: js.Any): js.Function1[/* obj */ js.Any, Boolean] = js.native
  def pathEq(path: Path, `val`: js.Any, obj: js.Any): Boolean = js.native
  def pathOr[T](defaultValue: T): js.Any = js.native
  def pathOr[T](defaultValue: T, path: Path): js.Function1[/* obj */ js.Any, T] = js.native
  def pathOr[T](defaultValue: T, path: Path, obj: js.Any): T = js.native
  def pathSatisfies[T, U](pred: js.Function1[/* val */ T, Boolean]): js.Any = js.native
  def pathSatisfies[T, U](pred: js.Function1[/* val */ T, Boolean], path: Path): js.Function1[/* obj */ U, Boolean] = js.native
  def pathSatisfies[T, U](pred: js.Function1[/* val */ T, Boolean], path: Path, obj: U): Boolean = js.native
  def pick[K /* <: String */](names: js.Array[K]): js.Function1[/* obj */ js.Any, Pick[_, Exclude[String, Exclude[String, K]]]] = js.native
  def pick[T, K /* <: String */](names: js.Array[K], obj: T): Pick[T, Exclude[String, Exclude[String, K]]] = js.native
  def pickAll(names: js.Array[String]): js.Function1[/* obj */ js.Any, _] = js.native
  def pickAll[T, U](names: js.Array[String], obj: T): U = js.native
  def pickBy(pred: ObjPred): js.Function1[/* obj */ js.Any, _] = js.native
  def pickBy[T, U](pred: ObjPred, obj: T): U = js.native
  def pipe[T1](fn0: js.Function0[T1]): js.Function0[T1] = js.native
  def pipe[T1, T2](fn0: js.Function0[T1], fn1: js.Function1[/* x */ T1, T2]): js.Function0[T2] = js.native
  def pipe[V0, T1](fn0: js.Function1[/* x0 */ V0, T1]): js.Function1[/* x0 */ V0, T1] = js.native
  def pipe[T1, T2, T3](fn0: js.Function0[T1], fn1: js.Function1[/* x */ T1, T2], fn2: js.Function1[/* x */ T2, T3]): js.Function0[T3] = js.native
  def pipe[V0, T1, T2](fn0: js.Function1[/* x0 */ V0, T1], fn1: js.Function1[/* x */ T1, T2]): js.Function1[/* x0 */ V0, T2] = js.native
  def pipe[V0, V1, T1](fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1]): js.Function2[/* x0 */ V0, /* x1 */ V1, T1] = js.native
  def pipe[T1, T2, T3, T4](
    fn0: js.Function0[T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4]
  ): js.Function0[T4] = js.native
  def pipe[V0, T1, T2, T3](
    fn0: js.Function1[/* x */ V0, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3]
  ): js.Function1[/* x */ V0, T3] = js.native
  def pipe[V0, V1, T1, T2](fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1], fn1: js.Function1[/* x */ T1, T2]): js.Function2[/* x0 */ V0, /* x1 */ V1, T2] = js.native
  def pipe[V0, V1, V2, T1](fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1]): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1] = js.native
  def pipe[T1, T2, T3, T4, T5](
    fn0: js.Function0[T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5]
  ): js.Function0[T5] = js.native
  def pipe[V0, T1, T2, T3, T4](
    fn0: js.Function1[/* x */ V0, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4]
  ): js.Function1[/* x */ V0, T4] = js.native
  def pipe[V0, V1, T1, T2, T3](
    fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3]
  ): js.Function2[/* x0 */ V0, /* x1 */ V1, T3] = js.native
  def pipe[V0, V1, V2, T1, T2](fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1], fn1: js.Function1[/* x */ T1, T2]): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T2] = js.native
  def pipe[T1, T2, T3, T4, T5, T6](
    fn0: js.Function0[T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6]
  ): js.Function0[T6] = js.native
  def pipe[V0, T1, T2, T3, T4, T5](
    fn0: js.Function1[/* x */ V0, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5]
  ): js.Function1[/* x */ V0, T5] = js.native
  def pipe[V0, V1, T1, T2, T3, T4](
    fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4]
  ): js.Function2[/* x0 */ V0, /* x1 */ V1, T4] = js.native
  def pipe[V0, V1, V2, T1, T2, T3](
    fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3]
  ): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T3] = js.native
  def pipe[T1, T2, T3, T4, T5, T6, T7](
    fn0: js.Function0[T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn: js.Function1[/* x */ T6, T7]
  ): js.Function0[T7] = js.native
  def pipe[V0, T1, T2, T3, T4, T5, T6](
    fn0: js.Function1[/* x */ V0, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6]
  ): js.Function1[/* x */ V0, T6] = js.native
  def pipe[V0, V1, T1, T2, T3, T4, T5](
    fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5]
  ): js.Function2[/* x0 */ V0, /* x1 */ V1, T5] = js.native
  def pipe[V0, V1, V2, T1, T2, T3, T4](
    fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4]
  ): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T4] = js.native
  def pipe[T1, T2, T3, T4, T5, T6, T7, T8](
    fn0: js.Function0[T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn6: js.Function1[/* x */ T6, T7],
    fn: js.Function1[/* x */ T7, T8]
  ): js.Function0[T8] = js.native
  def pipe[V0, T1, T2, T3, T4, T5, T6, T7](
    fn0: js.Function1[/* x */ V0, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn: js.Function1[/* x */ T6, T7]
  ): js.Function1[/* x */ V0, T7] = js.native
  def pipe[V0, V1, T1, T2, T3, T4, T5, T6](
    fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6]
  ): js.Function2[/* x0 */ V0, /* x1 */ V1, T6] = js.native
  def pipe[V0, V1, V2, T1, T2, T3, T4, T5](
    fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5]
  ): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T5] = js.native
  def pipe[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    fn0: js.Function0[T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn6: js.Function1[/* x */ T6, T7],
    fn7: js.Function1[/* x */ T7, T8],
    fn8: js.Function1[/* x */ T8, T9]
  ): js.Function0[T9] = js.native
  def pipe[V0, T1, T2, T3, T4, T5, T6, T7, T8](
    fn0: js.Function1[/* x */ V0, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn6: js.Function1[/* x */ T6, T7],
    fn: js.Function1[/* x */ T7, T8]
  ): js.Function1[/* x */ V0, T8] = js.native
  def pipe[V0, V1, T1, T2, T3, T4, T5, T6, T7](
    fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn6: js.Function1[/* x */ T6, T7]
  ): js.Function2[/* x0 */ V0, /* x1 */ V1, T7] = js.native
  def pipe[V0, V1, V2, T1, T2, T3, T4, T5, T6](
    fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6]
  ): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T6] = js.native
  def pipe[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    fn0: js.Function0[T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn6: js.Function1[/* x */ T6, T7],
    fn7: js.Function1[/* x */ T7, T8],
    fn8: js.Function1[/* x */ T8, T9],
    fn9: js.Function1[/* x */ T9, T10]
  ): js.Function0[T10] = js.native
  def pipe[V0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    fn0: js.Function1[/* x0 */ V0, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn6: js.Function1[/* x */ T6, T7],
    fn7: js.Function1[/* x */ T7, T8],
    fn8: js.Function1[/* x */ T8, T9]
  ): js.Function1[/* x0 */ V0, T9] = js.native
  def pipe[V0, V1, T1, T2, T3, T4, T5, T6, T7, T8](
    fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn6: js.Function1[/* x */ T6, T7],
    fn7: js.Function1[/* x */ T7, T8]
  ): js.Function2[/* x0 */ V0, /* x1 */ V1, T8] = js.native
  def pipe[V0, V1, V2, T1, T2, T3, T4, T5, T6, T7](
    fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn6: js.Function1[/* x */ T6, T7]
  ): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T7] = js.native
  def pipe[V0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    fn0: js.Function1[/* x0 */ V0, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn6: js.Function1[/* x */ T6, T7],
    fn7: js.Function1[/* x */ T7, T8],
    fn8: js.Function1[/* x */ T8, T9],
    fn9: js.Function1[/* x */ T9, T10]
  ): js.Function1[/* x0 */ V0, T10] = js.native
  def pipe[V0, V1, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn6: js.Function1[/* x */ T6, T7],
    fn7: js.Function1[/* x */ T7, T8],
    fn8: js.Function1[/* x */ T8, T9]
  ): js.Function2[/* x0 */ V0, /* x1 */ V1, T9] = js.native
  def pipe[V0, V1, V2, T1, T2, T3, T4, T5, T6, T7, T8](
    fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn6: js.Function1[/* x */ T6, T7],
    fn7: js.Function1[/* x */ T7, T8]
  ): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T8] = js.native
  def pipe[V0, V1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    fn0: js.Function2[/* x0 */ V0, /* x1 */ V1, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn6: js.Function1[/* x */ T6, T7],
    fn7: js.Function1[/* x */ T7, T8],
    fn8: js.Function1[/* x */ T8, T9],
    fn9: js.Function1[/* x */ T9, T10]
  ): js.Function2[/* x0 */ V0, /* x1 */ V1, T10] = js.native
  def pipe[V0, V1, V2, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn6: js.Function1[/* x */ T6, T7],
    fn7: js.Function1[/* x */ T7, T8],
    fn8: js.Function1[/* x */ T8, T9]
  ): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T9] = js.native
  def pipe[V0, V1, V2, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    fn0: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T1],
    fn1: js.Function1[/* x */ T1, T2],
    fn2: js.Function1[/* x */ T2, T3],
    fn3: js.Function1[/* x */ T3, T4],
    fn4: js.Function1[/* x */ T4, T5],
    fn5: js.Function1[/* x */ T5, T6],
    fn6: js.Function1[/* x */ T6, T7],
    fn7: js.Function1[/* x */ T7, T8],
    fn8: js.Function1[/* x */ T8, T9],
    fn9: js.Function1[/* x */ T9, T10]
  ): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T10] = js.native
  def pipeK[V0, T1](fn0: js.Function1[/* x0 */ V0, js.Array[T1]]): js.Function1[/* x0 */ V0, js.Array[T1]] = js.native
  def pipeK[V0, T1, T2](fn0: js.Function1[/* x0 */ V0, js.Array[T1]], fn1: js.Function1[/* x */ T1, js.Array[T2]]): js.Function1[/* x0 */ V0, js.Array[T2]] = js.native
  def pipeK[V0, T1, T2, T3](
    fn0: js.Function1[/* x */ V0, js.Array[T1]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn2: js.Function1[/* x */ T2, js.Array[T3]]
  ): js.Function1[/* x */ V0, js.Array[T3]] = js.native
  def pipeK[V0, T1, T2, T3, T4](
    fn0: js.Function1[/* x */ V0, js.Array[T1]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn3: js.Function1[/* x */ T3, js.Array[T4]]
  ): js.Function1[/* x */ V0, js.Array[T4]] = js.native
  def pipeK[V0, T1, T2, T3, T4, T5](
    fn0: js.Function1[/* x */ V0, js.Array[T1]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn3: js.Function1[/* x */ T3, js.Array[T4]],
    fn4: js.Function1[/* x */ T4, js.Array[T5]]
  ): js.Function1[/* x */ V0, js.Array[T5]] = js.native
  def pipeK[V0, T1, T2, T3, T4, T5, T6](
    fn0: js.Function1[/* x */ V0, js.Array[T1]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn3: js.Function1[/* x */ T3, js.Array[T4]],
    fn4: js.Function1[/* x */ T4, js.Array[T5]],
    fn5: js.Function1[/* x */ T5, js.Array[T6]]
  ): js.Function1[/* x */ V0, js.Array[T6]] = js.native
  def pipeK[V0, T1, T2, T3, T4, T5, T6, T7](
    fn0: js.Function1[/* x */ V0, js.Array[T1]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn3: js.Function1[/* x */ T3, js.Array[T4]],
    fn4: js.Function1[/* x */ T4, js.Array[T5]],
    fn5: js.Function1[/* x */ T5, js.Array[T6]],
    fn: js.Function1[/* x */ T6, js.Array[T7]]
  ): js.Function1[/* x */ V0, js.Array[T7]] = js.native
  def pipeK[V0, T1, T2, T3, T4, T5, T6, T7, T8](
    fn0: js.Function1[/* x */ V0, js.Array[T1]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn3: js.Function1[/* x */ T3, js.Array[T4]],
    fn4: js.Function1[/* x */ T4, js.Array[T5]],
    fn5: js.Function1[/* x */ T5, js.Array[T6]],
    fn6: js.Function1[/* x */ T6, js.Array[T7]],
    fn: js.Function1[/* x */ T7, js.Array[T8]]
  ): js.Function1[/* x */ V0, js.Array[T8]] = js.native
  def pipeK[V0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    fn0: js.Function1[/* x0 */ V0, js.Array[T1]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn3: js.Function1[/* x */ T3, js.Array[T4]],
    fn4: js.Function1[/* x */ T4, js.Array[T5]],
    fn5: js.Function1[/* x */ T5, js.Array[T6]],
    fn6: js.Function1[/* x */ T6, js.Array[T7]],
    fn7: js.Function1[/* x */ T7, js.Array[T8]],
    fn8: js.Function1[/* x */ T8, js.Array[T9]]
  ): js.Function1[/* x0 */ V0, js.Array[T9]] = js.native
  def pipeK[V0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    fn0: js.Function1[/* x0 */ V0, js.Array[T1]],
    fn1: js.Function1[/* x */ T1, js.Array[T2]],
    fn2: js.Function1[/* x */ T2, js.Array[T3]],
    fn3: js.Function1[/* x */ T3, js.Array[T4]],
    fn4: js.Function1[/* x */ T4, js.Array[T5]],
    fn5: js.Function1[/* x */ T5, js.Array[T6]],
    fn6: js.Function1[/* x */ T6, js.Array[T7]],
    fn7: js.Function1[/* x */ T7, js.Array[T8]],
    fn8: js.Function1[/* x */ T8, js.Array[T9]],
    fn9: js.Function1[/* x */ T9, js.Array[T10]]
  ): js.Function1[/* x0 */ V0, js.Array[T10]] = js.native
  def pipeP[V0, T1](fn0: js.Function1[/* x0 */ V0, js.Promise[T1]]): js.Function1[/* x0 */ V0, js.Promise[T1]] = js.native
  def pipeP[V0, T1, T2](fn0: js.Function1[/* x0 */ V0, js.Promise[T1]], fn1: js.Function1[/* x */ T1, js.Promise[T2]]): js.Function1[/* x0 */ V0, js.Promise[T2]] = js.native
  def pipeP[V0, T1, T2, T3](
    fn0: js.Function1[/* x */ V0, js.Promise[T1]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn2: js.Function1[/* x */ T2, js.Promise[T3]]
  ): js.Function1[/* x */ V0, js.Promise[T3]] = js.native
  def pipeP[V0, T1, T2, T3, T4](
    fn0: js.Function1[/* x */ V0, js.Promise[T1]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn3: js.Function1[/* x */ T3, js.Promise[T4]]
  ): js.Function1[/* x */ V0, js.Promise[T4]] = js.native
  def pipeP[V0, T1, T2, T3, T4, T5](
    fn0: js.Function1[/* x */ V0, js.Promise[T1]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn3: js.Function1[/* x */ T3, js.Promise[T4]],
    fn4: js.Function1[/* x */ T4, js.Promise[T5]]
  ): js.Function1[/* x */ V0, js.Promise[T5]] = js.native
  def pipeP[V0, T1, T2, T3, T4, T5, T6](
    fn0: js.Function1[/* x */ V0, js.Promise[T1]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn3: js.Function1[/* x */ T3, js.Promise[T4]],
    fn4: js.Function1[/* x */ T4, js.Promise[T5]],
    fn5: js.Function1[/* x */ T5, js.Promise[T6]]
  ): js.Function1[/* x */ V0, js.Promise[T6]] = js.native
  def pipeP[V0, T1, T2, T3, T4, T5, T6, T7](
    fn0: js.Function1[/* x */ V0, js.Promise[T1]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn3: js.Function1[/* x */ T3, js.Promise[T4]],
    fn4: js.Function1[/* x */ T4, js.Promise[T5]],
    fn5: js.Function1[/* x */ T5, js.Promise[T6]],
    fn: js.Function1[/* x */ T6, js.Promise[T7]]
  ): js.Function1[/* x */ V0, js.Promise[T7]] = js.native
  def pipeP[V0, T1, T2, T3, T4, T5, T6, T7, T8](
    fn0: js.Function1[/* x */ V0, js.Promise[T1]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn3: js.Function1[/* x */ T3, js.Promise[T4]],
    fn4: js.Function1[/* x */ T4, js.Promise[T5]],
    fn5: js.Function1[/* x */ T5, js.Promise[T6]],
    fn6: js.Function1[/* x */ T6, js.Promise[T7]],
    fn: js.Function1[/* x */ T7, js.Promise[T8]]
  ): js.Function1[/* x */ V0, js.Promise[T8]] = js.native
  def pipeP[V0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    fn0: js.Function1[/* x0 */ V0, js.Promise[T1]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn3: js.Function1[/* x */ T3, js.Promise[T4]],
    fn4: js.Function1[/* x */ T4, js.Promise[T5]],
    fn5: js.Function1[/* x */ T5, js.Promise[T6]],
    fn6: js.Function1[/* x */ T6, js.Promise[T7]],
    fn7: js.Function1[/* x */ T7, js.Promise[T8]],
    fn8: js.Function1[/* x */ T8, js.Promise[T9]]
  ): js.Function1[/* x0 */ V0, js.Promise[T9]] = js.native
  def pipeP[V0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    fn0: js.Function1[/* x0 */ V0, js.Promise[T1]],
    fn1: js.Function1[/* x */ T1, js.Promise[T2]],
    fn2: js.Function1[/* x */ T2, js.Promise[T3]],
    fn3: js.Function1[/* x */ T3, js.Promise[T4]],
    fn4: js.Function1[/* x */ T4, js.Promise[T5]],
    fn5: js.Function1[/* x */ T5, js.Promise[T6]],
    fn6: js.Function1[/* x */ T6, js.Promise[T7]],
    fn7: js.Function1[/* x */ T7, js.Promise[T8]],
    fn8: js.Function1[/* x */ T8, js.Promise[T9]],
    fn9: js.Function1[/* x */ T9, js.Promise[T10]]
  ): js.Function1[/* x0 */ V0, js.Promise[T10]] = js.native
  def pipeWith(composer: js.Function1[/* a */ js.Any, _]): js.Function1[/* fns */ PipeWithFns[_, _], js.Function1[/* x0 */ _, _]] = js.native
  def pipeWith[V0, T](composer: js.Function1[/* a */ js.Any, _], fns: PipeWithFns[V0, T]): js.Function1[/* x0 */ V0, T] = js.native
  def pluck(p: Double): js.Function1[/* list */ js.Array[NumberDictionary[_]], js.Array[_]] = js.native
  def pluck[P /* <: String */](p: P): js.Function1[/* list */ js.Array[Record[P, _]], js.Array[_]] = js.native
  def pluck[T](p: Double, list: js.Array[NumberDictionary[T]]): js.Array[T] = js.native
  def pluck[K /* <: String */, T](p: K, list: js.Array[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def prepend[T](el: T): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def prepend[T](el: T, list: js.Array[T]): js.Array[T] = js.native
  def product(list: js.Array[Double]): Double = js.native
  def project[T, U](props: js.Array[String]): js.Function1[/* objs */ js.Array[T], js.Array[U]] = js.native
  def project[T, U](props: js.Array[String], objs: js.Array[T]): js.Array[U] = js.native
  def prop[T](__ : Placeholder, obj: T): js.Function1[
    /* p */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def prop[P /* <: String */](p: P): js.Function1[/* obj */ Record[P, _], _] = js.native
  def prop[P /* <: String */, T](p: P, obj: T): /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any = js.native
  def propEq(name: String): FnCallValObj = js.native
  def propEq(name: Double): Fn0 = js.native
  def propEq[V](name: String, `val`: V): js.Function1[/* obj */ Record[String, V], Boolean] = js.native
  def propEq[V](name: String, `val`: V, obj: Record[String, V]): Boolean = js.native
  def propEq[V](name: Double, `val`: V): js.Function1[/* obj */ Record[Double, V], Boolean] = js.native
  def propEq[V](name: Double, `val`: V, obj: Record[Double, V]): Boolean = js.native
  def propIs(`type`: js.Any): FnCallNameObj = js.native
  def propIs(`type`: js.Any, name: String): js.Function1[/* obj */ js.Any, Boolean] = js.native
  def propIs(`type`: js.Any, name: String, obj: js.Any): Boolean = js.native
  def propOr[U](__ : Placeholder, p: String, obj: U): js.Function1[/* val */ js.Any, _] = js.native
  def propOr[T](`val`: T): js.Function2[/* p */ String, /* obj */ js.Any, _] = js.native
  def propOr[T](`val`: T, p: String): js.Function1[/* obj */ js.Any, _] = js.native
  def propOr[T, U](`val`: T, __ : Placeholder, obj: U): js.Function1[/* p */ String, _] = js.native
  def propOr[T, U, V](`val`: T, p: String, obj: U): V = js.native
  def propSatisfies[T, U](pred: js.Function1[/* val */ T, Boolean]): js.Any = js.native
  def propSatisfies[T, U](pred: js.Function1[/* val */ T, Boolean], name: String): js.Function1[/* obj */ U, Boolean] = js.native
  def propSatisfies[T, U](pred: js.Function1[/* val */ T, Boolean], name: String, obj: U): Boolean = js.native
  @JSName("prop")
  def prop_P_StringT[P /* <: String */, T](p: P): js.Function1[/* obj */ Record[P, T], T] = js.native
  def props[P /* <: String */](ps: js.Array[P]): js.Function1[/* obj */ Record[P, _], js.Array[_]] = js.native
  def props[P /* <: String */, T](ps: js.Array[P], obj: Record[P, T]): js.Array[T] = js.native
  @JSName("props")
  def props_P_StringT[P /* <: String */, T](ps: js.Array[P]): js.Function1[/* obj */ Record[P, T], js.Array[T]] = js.native
  def range(from: Double): js.Function1[/* to */ Double, js.Array[Double]] = js.native
  def range(from: Double, to: Double): js.Array[Double] = js.native
  def reduce[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult | Reduced[TResult]]): js.Function2[/* acc */ TResult, /* list */ js.Array[T], TResult] = js.native
  def reduce[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult | Reduced[TResult]], acc: TResult): js.Function1[/* list */ js.Array[T], TResult] = js.native
  def reduce[T, TResult](
    fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult | Reduced[TResult]],
    acc: TResult,
    list: js.Array[T]
  ): TResult = js.native
  def reduceBy[T, TResult](valueFn: js.Function2[/* acc */ TResult, /* elem */ T, TResult]): js.Any = js.native
  def reduceBy[T, TResult](valueFn: js.Function2[/* acc */ TResult, /* elem */ T, TResult], acc: TResult): js.Any = js.native
  def reduceBy[T, TResult](
    valueFn: js.Function2[/* acc */ TResult, /* elem */ T, TResult],
    acc: TResult,
    keyFn: js.Function1[/* elem */ T, String]
  ): js.Function1[/* list */ js.Array[T], StringDictionary[TResult]] = js.native
  def reduceBy[T, TResult](
    valueFn: js.Function2[/* acc */ TResult, /* elem */ T, TResult],
    acc: TResult,
    keyFn: js.Function1[/* elem */ T, String],
    list: js.Array[T]
  ): StringDictionary[TResult] = js.native
  def reduceRight[T, TResult](fn: js.Function2[/* elem */ T, /* acc */ TResult, TResult]): js.Function2[/* acc */ TResult, /* list */ js.Array[T], TResult] = js.native
  def reduceRight[T, TResult](fn: js.Function2[/* elem */ T, /* acc */ TResult, TResult], acc: TResult): js.Function1[/* list */ js.Array[T], TResult] = js.native
  def reduceRight[T, TResult](fn: js.Function2[/* elem */ T, /* acc */ TResult, TResult], acc: TResult, list: js.Array[T]): TResult = js.native
  def reduceWhile[T, TResult](predicate: js.Function2[/* acc */ TResult, /* elem */ T, Boolean]): js.Any = js.native
  def reduceWhile[T, TResult](
    predicate: js.Function2[/* acc */ TResult, /* elem */ T, Boolean],
    fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult]
  ): js.Any = js.native
  def reduceWhile[T, TResult](
    predicate: js.Function2[/* acc */ TResult, /* elem */ T, Boolean],
    fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult],
    acc: TResult
  ): js.Function1[/* list */ js.Array[T], TResult] = js.native
  def reduceWhile[T, TResult](
    predicate: js.Function2[/* acc */ TResult, /* elem */ T, Boolean],
    fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult],
    acc: TResult,
    list: js.Array[T]
  ): TResult = js.native
  def reduced[T](elem: T): Reduced[T] = js.native
  def remove[T](start: Double): js.Function2[/* count */ Double, /* list */ js.Array[T], js.Array[T]] = js.native
  def remove[T](start: Double, count: Double): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def remove[T](start: Double, count: Double, list: js.Array[T]): js.Array[T] = js.native
  def repeat[T](a: T): js.Function1[/* n */ Double, js.Array[T]] = js.native
  def repeat[T](a: T, n: Double): js.Array[T] = js.native
  def replace(pattern: String): js.Function1[
    /* replacement */ String | (js.Function2[/* match */ String, /* repeated */ js.Any, String]), 
    js.Function1[/* str */ String, String]
  ] = js.native
  def replace(pattern: String, replacement: String): js.Function1[/* str */ String, String] = js.native
  def replace(pattern: String, replacement: String, str: String): String = js.native
  def replace(pattern: String, replacement: js.Function2[/* match */ String, /* repeated */ js.Any, String]): js.Function1[/* str */ String, String] = js.native
  def replace(
    pattern: String,
    replacement: js.Function2[/* match */ String, /* repeated */ js.Any, String],
    str: String
  ): String = js.native
  def replace(pattern: RegExp): js.Function1[
    /* replacement */ String | (js.Function2[/* match */ String, /* repeated */ js.Any, String]), 
    js.Function1[/* str */ String, String]
  ] = js.native
  def replace(pattern: RegExp, replacement: String): js.Function1[/* str */ String, String] = js.native
  def replace(pattern: RegExp, replacement: String, str: String): String = js.native
  def replace(pattern: RegExp, replacement: js.Function2[/* match */ String, /* repeated */ js.Any, String]): js.Function1[/* str */ String, String] = js.native
  def replace(
    pattern: RegExp,
    replacement: js.Function2[/* match */ String, /* repeated */ js.Any, String],
    str: String
  ): String = js.native
  def reverse(str: String): String = js.native
  def reverse[T](list: js.Array[T]): js.Array[T] = js.native
  def scan[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, _]): js.Function2[/* acc */ TResult, /* list */ js.Array[T], js.Array[TResult]] = js.native
  def scan[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, _], acc: TResult): js.Function1[/* list */ js.Array[T], js.Array[TResult]] = js.native
  def scan[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, _], acc: TResult, list: js.Array[T]): js.Array[TResult] = js.native
  def set(lens: Lens): js.Function2[/* a */ js.Any, /* obj */ js.Any, _] = js.native
  def set[U](lens: Lens, a: U): js.Function1[/* obj */ js.Any, _] = js.native
  def set[T, U](lens: Lens, a: U, obj: T): T = js.native
  def slice(a: Double): FnCallBList = js.native
  def slice(a: Double, b: Double): FnCallList = js.native
  def slice(a: Double, b: Double, list: String): String = js.native
  def slice[T](a: Double, b: Double, list: js.Array[T]): js.Array[T] = js.native
  def sort[T](fn: js.Function2[/* a */ T, /* b */ T, Double]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def sort[T](fn: js.Function2[/* a */ T, /* b */ T, Double], list: js.Array[T]): js.Array[T] = js.native
  def sortBy(fn: js.Function1[/* a */ js.Any, Ord]): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  def sortBy[T](fn: js.Function1[/* a */ T, Ord], list: js.Array[T]): js.Array[T] = js.native
  def sortWith[T](fns: js.Array[js.Function2[/* a */ T, /* b */ T, Double]]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def sortWith[T](fns: js.Array[js.Function2[/* a */ T, /* b */ T, Double]], list: js.Array[T]): js.Array[T] = js.native
  def split(sep: String): js.Function1[/* str */ String, js.Array[String]] = js.native
  def split(sep: String, str: String): js.Array[String] = js.native
  def split(sep: RegExp): js.Function1[/* str */ String, js.Array[String]] = js.native
  def split(sep: RegExp, str: String): js.Array[String] = js.native
  def splitAt(index: Double): Fn1 = js.native
  def splitAt(index: Double, list: String): js.Tuple2[String, String] = js.native
  def splitAt[T](index: Double, list: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def splitEvery(a: Double): Fn2 = js.native
  def splitEvery(a: Double, list: String): js.Array[String] = js.native
  def splitEvery[T](a: Double, list: js.Array[T]): js.Array[js.Array[T]] = js.native
  def splitWhen[T](pred: js.Function1[/* val */ T, Boolean]): js.Function1[/* list */ js.Array[_], js.Array[js.Array[_]]] = js.native
  def splitWhen[T, U](pred: js.Function1[/* val */ T, Boolean], list: js.Array[U]): js.Array[js.Array[U]] = js.native
  def startsWith(a: String): js.Function1[/* list */ String, Boolean] = js.native
  def startsWith(a: String, list: String): Boolean = js.native
  def startsWith[T](a: T): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def startsWith[T](a: T, list: js.Array[T]): Boolean = js.native
  def startsWith[T](a: js.Array[T]): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def startsWith[T](a: js.Array[T], list: js.Array[T]): Boolean = js.native
  def subtract(__ : Placeholder): js.Function2[/* b */ Double, /* a */ Double, Double] = js.native
  def subtract(__ : Placeholder, b: Double): js.Function1[/* a */ Double, Double] = js.native
  def subtract(a: Double): js.Function1[/* b */ Double, Double] = js.native
  def subtract(a: Double, b: Double): Double = js.native
  def sum(list: js.Array[Double]): Double = js.native
  def symmetricDifference[T](list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  def symmetricDifference[T](list: js.Array[T]): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  def symmetricDifferenceWith[T](pred: js.Function2[/* a */ T, /* b */ T, Boolean]): js.Any = js.native
  def symmetricDifferenceWith[T](pred: js.Function2[/* a */ T, /* b */ T, Boolean], list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  def tail(list: String): String = js.native
  def tail[T /* <: js.Any */](list: js.Array[T]): js.Array[T] = js.native
  def take(n: Double): Fn3 = js.native
  def take(n: Double, xs: String): String = js.native
  def take[T](n: Double, xs: js.Array[T]): js.Array[T] = js.native
  def takeLast(n: Double): Fn4 = js.native
  def takeLast(n: Double, xs: String): String = js.native
  def takeLast[T](n: Double, xs: js.Array[T]): js.Array[T] = js.native
  def takeLastWhile[T](pred: js.Function1[/* a */ T, Boolean]): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  def takeLastWhile[T](pred: js.Function1[/* a */ T, Boolean], list: js.Array[T]): js.Array[T] = js.native
  def takeWhile[T](fn: js.Function1[/* x */ T, Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def takeWhile[T](fn: js.Function1[/* x */ T, Boolean], list: js.Array[T]): js.Array[T] = js.native
  def tap[T](fn: js.Function1[/* a */ T, _]): js.Function1[/* value */ T, T] = js.native
  def tap[T](fn: js.Function1[/* a */ T, _], value: T): T = js.native
  def test(regexp: RegExp): js.Function1[/* str */ String, Boolean] = js.native
  def test(regexp: RegExp, str: String): Boolean = js.native
  def `then`[A, B](onSuccess: js.Function1[/* a */ A, B | js.Promise[B]]): js.Function1[/* promise */ js.Promise[A], js.Promise[B]] = js.native
  def `then`[A, B](onSuccess: js.Function1[/* a */ A, B | js.Promise[B]], promise: js.Promise[A]): js.Promise[B] = js.native
  def thunkify[F /* <: js.Function1[/* repeated */ js.Any, _] */](fn: F): js.Any = js.native
  def times[T](fn: js.Function1[/* i */ Double, T]): js.Function1[/* n */ Double, js.Array[T]] = js.native
  def times[T](fn: js.Function1[/* i */ Double, T], n: Double): js.Array[T] = js.native
  def toLower(str: String): String = js.native
  def toPairs[S](obj: NumberDictionary[S]): js.Array[js.Tuple2[String, S]] = js.native
  def toPairs[S](obj: StringDictionary[S]): js.Array[js.Tuple2[String, S]] = js.native
  def toPairsIn[S](obj: NumberDictionary[S]): js.Array[js.Tuple2[String, S]] = js.native
  def toPairsIn[S](obj: StringDictionary[S]): js.Array[js.Tuple2[String, S]] = js.native
  def toString[T](`val`: T): String = js.native
  def toUpper(str: String): String = js.native
  def transduce[T, U](xf: js.Function1[/* arg */ js.Array[T], js.Array[T]]): js.Function3[
    /* fn */ js.Function2[/* acc */ js.Array[U], /* val */ U, js.Array[U]], 
    /* acc */ js.Array[T], 
    /* list */ js.Array[T], 
    U
  ] = js.native
  def transduce[T, U](
    xf: js.Function1[/* arg */ js.Array[T], js.Array[T]],
    fn: js.Function2[/* acc */ js.Array[U], /* val */ U, js.Array[U]]
  ): js.Function2[/* acc */ js.Array[T], /* list */ js.Array[T], U] = js.native
  def transduce[T, U](
    xf: js.Function1[/* arg */ js.Array[T], js.Array[T]],
    fn: js.Function2[/* acc */ js.Array[U], /* val */ U, js.Array[U]],
    acc: js.Array[T]
  ): js.Function1[/* list */ js.Array[T], U] = js.native
  def transduce[T, U](
    xf: js.Function1[/* arg */ js.Array[T], js.Array[T]],
    fn: js.Function2[/* acc */ js.Array[U], /* val */ U, js.Array[U]],
    acc: js.Array[T],
    list: js.Array[T]
  ): U = js.native
  def transpose[T](list: js.Array[js.Array[T]]): js.Array[js.Array[T]] = js.native
  def traverse[A, B](of: js.Function1[/* a */ B, js.Array[B]]): js.Function2[
    /* fn */ js.Function1[/* t */ A, js.Array[B]], 
    /* list */ js.Array[A], 
    js.Array[js.Array[B]]
  ] = js.native
  def traverse[A, B](of: js.Function1[/* a */ B, js.Array[B]], fn: js.Function1[/* t */ A, js.Array[B]]): js.Function1[/* list */ js.Array[A], js.Array[js.Array[B]]] = js.native
  def traverse[A, B](
    of: js.Function1[/* a */ B, js.Array[B]],
    fn: js.Function1[/* t */ A, js.Array[B]],
    list: js.Array[A]
  ): js.Array[js.Array[B]] = js.native
  def trim(str: String): String = js.native
  def tryCatch[T](tryer: js.Function1[/* repeated */ js.Any, T], catcher: js.Function1[/* repeated */ js.Any, T]): js.Function1[/* repeated */ js.Any, T] = js.native
  def `type`(`val`: js.Any): Object | Number | typings.ramda.ramdaStrings.Boolean | typings.ramda.ramdaStrings.String | typings.ramda.ramdaStrings.Null | Array | typings.ramda.ramdaStrings.RegExp | Function | Undefined = js.native
  def unapply[T](fn: js.Function1[/* args */ js.Array[_], T]): js.Function1[/* repeated */ js.Any, T] = js.native
  def unary[T](fn: js.Function2[/* a */ T, /* repeated */ js.Any, _]): js.Function1[/* a */ T, _] = js.native
  def uncurryN[T](len: Double, fn: js.Function1[/* a */ js.Any, _]): js.Function1[/* repeated */ js.Any, T] = js.native
  @JSName("unfold")
  def unfold_false[T, TResult](fn: js.Function1[/* seed */ T, (js.Tuple2[TResult, T]) | `false`]): js.Function1[/* seed */ T, js.Array[TResult]] = js.native
  @JSName("unfold")
  def unfold_false[T, TResult](fn: js.Function1[/* seed */ T, (js.Tuple2[TResult, T]) | `false`], seed: T): js.Array[TResult] = js.native
  def union[T](as: js.Array[T]): js.Function1[/* bs */ js.Array[T], js.Array[T]] = js.native
  def union[T](as: js.Array[T], bs: js.Array[T]): js.Array[T] = js.native
  def unionWith[T](pred: js.Function2[/* a */ T, /* b */ T, Boolean]): js.Any = js.native
  def unionWith[T](pred: js.Function2[/* a */ T, /* b */ T, Boolean], list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  def uniq[T](list: js.Array[T]): js.Array[T] = js.native
  def uniqBy[T, U](fn: js.Function1[/* a */ T, U]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def uniqBy[T, U](fn: js.Function1[/* a */ T, U], list: js.Array[T]): js.Array[T] = js.native
  def uniqWith[T, U](pred: js.Function2[/* x */ T, /* y */ T, Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def uniqWith[T, U](pred: js.Function2[/* x */ T, /* y */ T, Boolean], list: js.Array[T]): js.Array[T] = js.native
  def unless[T, U](pred: js.Function1[/* a */ T, Boolean], whenFalseFn: js.Function1[/* a */ T, U]): js.Function1[/* obj */ T, U] = js.native
  def unless[T, U](pred: js.Function1[/* a */ T, Boolean], whenFalseFn: js.Function1[/* a */ T, U], obj: T): U = js.native
  def unnest[T /* <: js.Array[_] */](list: T): js.Any = js.native
  def until[T, U](pred: js.Function1[/* val */ T, Boolean], fn: js.Function1[/* val */ T, U]): js.Function1[/* init */ U, U] = js.native
  def until[T, U](pred: js.Function1[/* val */ T, Boolean], fn: js.Function1[/* val */ T, U], init: U): U = js.native
  def update[T](index: Double, value: T): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def update[T](index: Double, value: T, list: js.Array[T]): js.Array[T] = js.native
  def useWith(
    fn: js.Function1[/* repeated */ js.Any, _],
    transformers: js.Array[js.Function1[/* repeated */ _, _]]
  ): js.Function1[/* repeated */ js.Any, _] = js.native
  def values[T /* <: js.Object */, K /* <: String */](obj: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def valuesIn[T](obj: js.Any): js.Array[T] = js.native
  def view[T, U](lens: Lens): js.Function1[/* obj */ T, U] = js.native
  def view[T, U](lens: Lens, obj: T): U = js.native
  def when[T, U](pred: js.Function1[/* a */ T, Boolean], whenTrueFn: js.Function1[/* a */ T, U]): js.Function1[/* obj */ T, U] = js.native
  def when[T, U](pred: js.Function1[/* a */ T, Boolean], whenTrueFn: js.Function1[/* a */ T, U], obj: T): U = js.native
  def where[T](spec: T): js.Function1[/* testObj */ js.Any, Boolean] = js.native
  def where[T, U](spec: T, testObj: U): Boolean = js.native
  def whereEq[T](spec: T): js.Function1[/* obj */ js.Any, Boolean] = js.native
  def whereEq[T, U](spec: T, obj: U): Boolean = js.native
  @JSName("where")
  def where_ObjFunc2[ObjFunc2](spec: ObjFunc2): js.Function1[/* testObj */ js.Any, Boolean] = js.native
  @JSName("where")
  def where_ObjFunc2U[ObjFunc2, U](spec: ObjFunc2, testObj: U): Boolean = js.native
  def without[T](list1: js.Array[T]): js.Function1[/* list2 */ js.Array[T], js.Array[T]] = js.native
  def without[T](list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  def xprod[K](as: js.Array[K]): js.Function1[/* bs */ js.Array[_], js.Array[KeyValuePair[K, _]]] = js.native
  def xprod[K, V](as: js.Array[K], bs: js.Array[V]): js.Array[KeyValuePair[K, V]] = js.native
  def zip[K](list1: js.Array[K]): js.Function1[/* list2 */ js.Array[_], js.Array[KeyValuePair[K, _]]] = js.native
  def zip[K, V](list1: js.Array[K], list2: js.Array[V]): js.Array[KeyValuePair[K, V]] = js.native
  def zipObj(keys: js.Array[Double | String]): js.Function1[/* values */ js.Array[_], StringDictionary[_]] = js.native
  def zipObj[T](keys: js.Array[String], values: js.Array[T]): StringDictionary[T] = js.native
  @JSName("zipObj")
  def zipObj_T_NumberDictionary[T](keys: js.Array[Double], values: js.Array[T]): NumberDictionary[T] = js.native
  def zipWith[T, U, TResult](fn: js.Function2[/* x */ T, /* y */ U, TResult]): js.Function2[/* list1 */ js.Array[T], /* list2 */ js.Array[U], js.Array[TResult]] = js.native
  def zipWith[T, U, TResult](fn: js.Function2[/* x */ T, /* y */ U, TResult], list1: js.Array[T]): js.Function1[/* list2 */ js.Array[U], js.Array[TResult]] = js.native
  def zipWith[T, U, TResult](fn: js.Function2[/* x */ T, /* y */ U, TResult], list1: js.Array[T], list2: js.Array[U]): js.Array[TResult] = js.native
}

