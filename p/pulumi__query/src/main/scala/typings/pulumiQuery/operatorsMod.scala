package typings.pulumiQuery

import typings.pulumiQuery.interfacesMod.AsyncIterable
import typings.pulumiQuery.interfacesMod.AsyncQuerySource
import typings.pulumiQuery.interfacesMod.AsyncQueryable
import typings.pulumiQuery.interfacesMod.Evaluator
import typings.pulumiQuery.interfacesMod.GroupedAsyncIterable
import typings.pulumiQuery.interfacesMod.Operator
import typings.pulumiQuery.interfacesMod.OrderKey
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsMod {
  
  @JSImport("@pulumi/query/operators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def aggregate[TSource, TAccumulate](
    seed: TAccumulate,
    func: js.Function2[/* acc */ TAccumulate, /* t */ TSource, TAccumulate | js.Promise[TAccumulate]]
  ): Evaluator[TSource, TAccumulate] = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregate")(seed.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Evaluator[TSource, TAccumulate]]
  
  inline def all[TSource](predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(predicate.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, Boolean]]
  
  inline def any[TSource](): Evaluator[TSource, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")().asInstanceOf[Evaluator[TSource, Boolean]]
  inline def any[TSource](predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(predicate.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, Boolean]]
  
  inline def average[TSource](): Evaluator[TSource, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("average")().asInstanceOf[Evaluator[TSource, Double]]
  inline def average[TSource](selector: js.Function1[/* t */ TSource, Double | js.Promise[Double]]): Evaluator[TSource, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(selector.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, Double]]
  
  inline def average_TSource_Promise[TSource](): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("average")().asInstanceOf[js.Promise[Double]]
  
  inline def concat[TSource, TSource2](iter: AsyncIterable[TSource2]): Operator[TSource, TSource | TSource2] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(iter.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TSource | TSource2]]
  
  inline def contains[TSource](value: TSource): Evaluator[TSource, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(value.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, Boolean]]
  
  inline def count[TSource](): Evaluator[TSource, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[Evaluator[TSource, Double]]
  inline def count[TSource](predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(predicate.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, Double]]
  
  inline def defaultIfEmpty[TSource](defaultValue: TSource): Operator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TSource]]
  
  inline def distinct[TSource](): Operator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")().asInstanceOf[Operator[TSource, TSource]]
  
  inline def elementAt[TSource](index: Double): Evaluator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, TSource]]
  
  inline def elementAtOrDefault[TSource](defaultValue: TSource, index: Double): Evaluator[TSource, TSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("elementAtOrDefault")(defaultValue.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Evaluator[TSource, TSource]]
  
  inline def except[TSource](second: AsyncIterable[TSource]): Operator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("except")(second.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TSource]]
  
  inline def filter[TSource](f: js.Function2[/* t */ TSource, /* i */ Double, Boolean | js.Promise[Boolean]]): Operator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TSource]]
  
  inline def first[TSource](): Evaluator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[Evaluator[TSource, TSource]]
  inline def first[TSource](predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, TSource]]
  
  inline def firstOrDefault[TSource](defaultValue: TSource): Evaluator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("firstOrDefault")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, TSource]]
  inline def firstOrDefault[TSource](defaultValue: TSource, predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, TSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("firstOrDefault")(defaultValue.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Evaluator[TSource, TSource]]
  
  inline def flatMap[TSource, TInner, TResult](
    selector: js.Function2[
      /* t */ TSource, 
      /* index */ Double, 
      AsyncQuerySource[TInner] | js.Promise[AsyncQuerySource[TInner]]
    ]
  ): Operator[TSource, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(selector.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TResult]]
  inline def flatMap[TSource, TInner, TResult](
    selector: js.Function2[
      /* t */ TSource, 
      /* index */ Double, 
      AsyncQuerySource[TInner] | js.Promise[AsyncQuerySource[TInner]]
    ],
    resultSelector: js.Function2[/* t */ TSource, /* ti */ TInner, TResult | js.Promise[TResult]]
  ): Operator[TSource, TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(selector.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Operator[TSource, TResult]]
  
  inline def groupBy[TSource, TKey, TResult](keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]]): js.Function1[
    /* source */ AsyncIterable[TSource], 
    AsyncIterable[GroupedAsyncIterable[TKey, TResult]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* source */ AsyncIterable[TSource], 
    AsyncIterable[GroupedAsyncIterable[TKey, TResult]]
  ]]
  inline def groupBy[TSource, TKey, TResult](
    keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]],
    elementSelector: js.Function1[/* t */ TSource, TResult | js.Promise[TResult]]
  ): js.Function1[
    /* source */ AsyncIterable[TSource], 
    AsyncIterable[GroupedAsyncIterable[TKey, TResult]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* source */ AsyncIterable[TSource], 
    AsyncIterable[GroupedAsyncIterable[TKey, TResult]]
  ]]
  
  inline def groupJoin[TOuter, TInner, TKey, TResult](
    inner: AsyncIterable[TInner],
    outerKeySelector: js.Function1[/* to */ TOuter, TKey | js.Promise[TKey]],
    innerKeySelector: js.Function1[/* ti */ TInner, TKey | js.Promise[TKey]],
    resultSelector: js.Function2[/* to */ TOuter, /* ti */ AsyncQueryable[TInner], TResult | js.Promise[TResult]]
  ): Operator[TOuter, TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupJoin")(inner.asInstanceOf[js.Any], outerKeySelector.asInstanceOf[js.Any], innerKeySelector.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Operator[TOuter, TResult]]
  
  inline def intersect[TSource](second: AsyncIterable[TSource]): Operator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(second.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TSource]]
  
  inline def join[TOuter, TInner, TKey, TResult](
    inner: AsyncIterable[TInner],
    outerKeySelector: js.Function1[/* to */ TOuter, TKey | js.Promise[TKey]],
    innerKeySelector: js.Function1[/* ti */ TInner, TKey | js.Promise[TKey]],
    resultSelector: js.Function2[/* to */ TOuter, /* ti */ TInner, TResult | js.Promise[TResult]]
  ): Operator[TOuter, TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(inner.asInstanceOf[js.Any], outerKeySelector.asInstanceOf[js.Any], innerKeySelector.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Operator[TOuter, TResult]]
  
  inline def last[TSource](): Evaluator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[Evaluator[TSource, TSource]]
  inline def last[TSource](predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, TSource]]
  
  inline def lastOrDefault[TSource](defaultValue: TSource): Evaluator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastOrDefault")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, TSource]]
  inline def lastOrDefault[TSource](defaultValue: TSource, predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, TSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("lastOrDefault")(defaultValue.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Evaluator[TSource, TSource]]
  
  inline def map[TSource, TResult](f: js.Function2[/* t */ TSource, /* i */ Double, TResult | js.Promise[TResult]]): Operator[TSource, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TResult]]
  
  inline def max[TSource](): Evaluator[TSource, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[Evaluator[TSource, Double]]
  inline def max[TSource](selector: js.Function1[/* t */ TSource, Double | js.Promise[Double]]): Evaluator[TSource, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(selector.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, Double]]
  
  inline def max_TSource_Promise[TSource](): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[js.Promise[Double]]
  
  inline def min[TSource](): Evaluator[TSource, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[Evaluator[TSource, Double]]
  inline def min[TSource](selector: js.Function1[/* t */ TSource, Double | js.Promise[Double]]): Evaluator[TSource, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(selector.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, Double]]
  
  inline def min_TSource_Promise[TSource](): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[js.Promise[Double]]
  
  inline def ofType[TSource, TResult /* <: TSource */](typeGuard: js.Function1[/* o */ TSource, /* is TResult */ Boolean]): Operator[TSource, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")(typeGuard.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TResult]]
  
  inline def orderBy[TSource](keySelector: js.Function1[/* t */ TSource, OrderKey | js.Promise[OrderKey]]): Operator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(keySelector.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TSource]]
  
  inline def orderByDescending[TSource](keySelector: js.Function1[/* t */ TSource, OrderKey | js.Promise[OrderKey]]): Operator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByDescending")(keySelector.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TSource]]
  
  inline def reverse[TSource](): Operator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[Operator[TSource, TSource]]
  
  inline def single[TSource](): Evaluator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")().asInstanceOf[Evaluator[TSource, TSource]]
  inline def single[TSource](predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(predicate.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, TSource]]
  
  inline def singleOrDefault[TSource](defaultValue: TSource): Evaluator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleOrDefault")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, TSource]]
  inline def singleOrDefault[TSource](defaultValue: TSource, predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, TSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("singleOrDefault")(defaultValue.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Evaluator[TSource, TSource]]
  
  inline def skip[TSource](n: Double): Operator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(n.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TSource]]
  
  inline def skipWhile[TSource](predicate: js.Function2[/* t */ TSource, /* i */ Double, Boolean | js.Promise[Boolean]]): Operator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TSource]]
  
  inline def sum[TSource](): Evaluator[TSource, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")().asInstanceOf[Evaluator[TSource, Double]]
  inline def sum[TSource](selector: js.Function1[/* t */ TSource, Double | js.Promise[Double]]): Evaluator[TSource, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(selector.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, Double]]
  
  inline def sum_TSource_Promise[TSource](): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")().asInstanceOf[js.Promise[Double]]
  
  inline def take[TSource](n: Double): Operator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(n.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TSource]]
  
  inline def takeWhile[TSource](predicate: js.Function2[/* t */ TSource, /* i */ Double, Boolean | js.Promise[Boolean]]): Operator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TSource]]
  
  inline def toArray[TSource](): Evaluator[TSource, js.Array[TSource]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[Evaluator[TSource, js.Array[TSource]]]
  
  inline def toMap[TKey, TSource, TResult](keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]]): Evaluator[TSource, Map[TKey, TResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(keySelector.asInstanceOf[js.Any]).asInstanceOf[Evaluator[TSource, Map[TKey, TResult]]]
  inline def toMap[TKey, TSource, TResult](
    keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]],
    elementSelector: js.Function1[/* t */ TSource, TResult | js.Promise[TResult]]
  ): Evaluator[TSource, Map[TKey, TResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any])).asInstanceOf[Evaluator[TSource, Map[TKey, TResult]]]
  
  inline def union[TSource](second: AsyncIterable[TSource]): Operator[TSource, TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(second.asInstanceOf[js.Any]).asInstanceOf[Operator[TSource, TSource]]
  
  inline def zip[TSource1, TSource2, TResult](source1: AsyncIterable[TSource1], source2: AsyncIterable[TSource2]): AsyncIterable[TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[TResult]]
  inline def zip[TSource1, TSource2, TResult](
    source1: AsyncIterable[TSource1],
    source2: AsyncIterable[TSource2],
    resultSelector: js.Function2[/* t1 */ TSource1, /* t2 */ TSource2, TResult | js.Promise[TResult]]
  ): AsyncIterable[TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[TResult]]
}
