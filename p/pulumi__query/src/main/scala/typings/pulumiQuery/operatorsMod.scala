package typings.pulumiQuery

import typings.pulumiQuery.interfacesMod.AsyncIterable
import typings.pulumiQuery.interfacesMod.AsyncIterableIterator
import typings.pulumiQuery.interfacesMod.AsyncQuerySource
import typings.pulumiQuery.interfacesMod.Evaluator
import typings.pulumiQuery.interfacesMod.GroupedAsyncIterableIterator
import typings.pulumiQuery.interfacesMod.Operator
import typings.pulumiQuery.interfacesMod.OrderKey
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/query/operators", JSImport.Namespace)
@js.native
object operatorsMod extends js.Object {
  
  def aggregate[TSource, TAccumulate](
    seed: TAccumulate,
    func: js.Function2[/* acc */ TAccumulate, /* t */ TSource, TAccumulate | js.Promise[TAccumulate]]
  ): Evaluator[TSource, TAccumulate] = js.native
  
  def all[TSource](predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, Boolean] = js.native
  
  def any[TSource](): Evaluator[TSource, Boolean] = js.native
  def any[TSource](predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, Boolean] = js.native
  
  def average[TSource](): Evaluator[TSource, Double] = js.native
  def average[TSource](selector: js.Function1[/* t */ TSource, Double | js.Promise[Double]]): Evaluator[TSource, Double] = js.native
  @JSName("average")
  def average_TSource_Promise[TSource](): js.Promise[Double] = js.native
  
  def concat[TSource](iter: AsyncIterable[TSource]): Operator[TSource, TSource] = js.native
  
  def contains[TSource](value: TSource): Evaluator[TSource, Boolean] = js.native
  
  def count[TSource](): Evaluator[TSource, Double] = js.native
  def count[TSource](predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, Double] = js.native
  
  def defaultIfEmpty[TSource](defaultValue: TSource): Operator[TSource, TSource] = js.native
  
  def distinct[TSource](): Operator[TSource, TSource] = js.native
  
  def elementAt[TSource](index: Double): Evaluator[TSource, TSource] = js.native
  
  def elementAtOrDefault[TSource](defaultValue: TSource, index: Double): Evaluator[TSource, TSource] = js.native
  
  def except[TSource](second: AsyncIterableIterator[TSource]): Operator[TSource, TSource] = js.native
  
  def filter[TSource](f: js.Function2[/* t */ TSource, /* i */ Double, Boolean | js.Promise[Boolean]]): Operator[TSource, TSource] = js.native
  
  def first[TSource](): Evaluator[TSource, TSource] = js.native
  def first[TSource](predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, TSource] = js.native
  
  def firstOrDefault[TSource](defaultValue: TSource): Evaluator[TSource, TSource] = js.native
  def firstOrDefault[TSource](defaultValue: TSource, predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, TSource] = js.native
  
  def flatMap[TSource, TInner, TResult](selector: js.Function2[/* t */ TSource, /* index */ Double, AsyncQuerySource[TInner]]): Operator[TSource, TResult] = js.native
  def flatMap[TSource, TInner, TResult](
    selector: js.Function2[/* t */ TSource, /* index */ Double, AsyncQuerySource[TInner]],
    resultSelector: js.Function2[/* t */ TSource, /* ti */ TInner, TResult | js.Promise[TResult]]
  ): Operator[TSource, TResult] = js.native
  
  def groupBy[TSource, TKey, TResult](keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]]): js.Function1[
    /* source */ AsyncIterableIterator[TSource], 
    AsyncIterableIterator[GroupedAsyncIterableIterator[TKey, TResult]]
  ] = js.native
  def groupBy[TSource, TKey, TResult](
    keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]],
    elementSelector: js.Function1[/* t */ TSource, TResult | js.Promise[TResult]]
  ): js.Function1[
    /* source */ AsyncIterableIterator[TSource], 
    AsyncIterableIterator[GroupedAsyncIterableIterator[TKey, TResult]]
  ] = js.native
  
  def groupJoin[TOuter, TInner, TKey, TResult](
    inner: AsyncIterableIterator[TInner],
    outerKeySelector: js.Function1[/* to */ TOuter, TKey | js.Promise[TKey]],
    innerKeySelector: js.Function1[/* ti */ TInner, TKey | js.Promise[TKey]],
    resultSelector: js.Function2[/* to */ TOuter, /* ti */ AsyncQuerySource[TInner], TResult | js.Promise[TResult]]
  ): Operator[TOuter, TResult] = js.native
  
  def intersect[TSource](second: AsyncIterableIterator[TSource]): Operator[TSource, TSource] = js.native
  
  def join[TOuter, TInner, TKey, TResult](
    inner: AsyncIterableIterator[TInner],
    outerKeySelector: js.Function1[/* to */ TOuter, TKey | js.Promise[TKey]],
    innerKeySelector: js.Function1[/* ti */ TInner, TKey | js.Promise[TKey]],
    resultSelector: js.Function2[/* to */ TOuter, /* ti */ TInner, TResult | js.Promise[TResult]]
  ): Operator[TOuter, TResult] = js.native
  
  def last[TSource](): Evaluator[TSource, TSource] = js.native
  def last[TSource](predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, TSource] = js.native
  
  def lastOrDefault[TSource](defaultValue: TSource): Evaluator[TSource, TSource] = js.native
  def lastOrDefault[TSource](defaultValue: TSource, predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, TSource] = js.native
  
  def map[TSource, TResult](f: js.Function2[/* t */ TSource, /* i */ Double, TResult | js.Promise[TResult]]): Operator[TSource, TResult] = js.native
  
  def max[TSource](): Evaluator[TSource, Double] = js.native
  def max[TSource](selector: js.Function1[/* t */ TSource, Double | js.Promise[Double]]): Evaluator[TSource, Double] = js.native
  @JSName("max")
  def max_TSource_Promise[TSource](): js.Promise[Double] = js.native
  
  def min[TSource](): Evaluator[TSource, Double] = js.native
  def min[TSource](selector: js.Function1[/* t */ TSource, Double | js.Promise[Double]]): Evaluator[TSource, Double] = js.native
  @JSName("min")
  def min_TSource_Promise[TSource](): js.Promise[Double] = js.native
  
  def ofType[TSource, TResult /* <: TSource */](typeGuard: js.Function1[/* o */ TSource, /* is TResult */ Boolean]): Operator[TSource, TResult] = js.native
  
  def orderBy[TSource](keySelector: js.Function1[/* t */ TSource, OrderKey | js.Promise[OrderKey]]): Operator[TSource, TSource] = js.native
  
  def orderByDescending[TSource](keySelector: js.Function1[/* t */ TSource, OrderKey | js.Promise[OrderKey]]): Operator[TSource, TSource] = js.native
  
  def reverse[TSource](): Operator[TSource, TSource] = js.native
  
  def single[TSource](): Evaluator[TSource, TSource] = js.native
  def single[TSource](predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, TSource] = js.native
  
  def singleOrDefault[TSource](defaultValue: TSource): Evaluator[TSource, TSource] = js.native
  def singleOrDefault[TSource](defaultValue: TSource, predicate: js.Function1[/* t */ TSource, Boolean | js.Promise[Boolean]]): Evaluator[TSource, TSource] = js.native
  
  def skip[TSource](n: Double): Operator[TSource, TSource] = js.native
  
  def skipWhile[TSource](predicate: js.Function2[/* t */ TSource, /* i */ Double, Boolean | js.Promise[Boolean]]): Operator[TSource, TSource] = js.native
  
  def sum[TSource](): Evaluator[TSource, Double] = js.native
  def sum[TSource](selector: js.Function1[/* t */ TSource, Double | js.Promise[Double]]): Evaluator[TSource, Double] = js.native
  @JSName("sum")
  def sum_TSource_Promise[TSource](): js.Promise[Double] = js.native
  
  def take[TSource](n: Double): Operator[TSource, TSource] = js.native
  
  def takeWhile[TSource](predicate: js.Function2[/* t */ TSource, /* i */ Double, Boolean | js.Promise[Boolean]]): Operator[TSource, TSource] = js.native
  
  def toArray[TSource](): Evaluator[TSource, js.Array[TSource]] = js.native
  
  def toMap[TKey, TSource, TResult](keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]]): Evaluator[TSource, Map[TKey, TResult]] = js.native
  def toMap[TKey, TSource, TResult](
    keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]],
    elementSelector: js.Function1[/* t */ TSource, TResult | js.Promise[TResult]]
  ): Evaluator[TSource, Map[TKey, TResult]] = js.native
  
  def union[TSource](second: AsyncIterableIterator[TSource]): Operator[TSource, TSource] = js.native
  
  def zip[TSource1, TSource2, TResult](source1: AsyncIterableIterator[TSource1], source2: AsyncIterableIterator[TSource2]): AsyncIterableIterator[TResult] = js.native
  def zip[TSource1, TSource2, TResult](
    source1: AsyncIterableIterator[TSource1],
    source2: AsyncIterableIterator[TSource2],
    resultSelector: js.Function2[/* t1 */ TSource1, /* t2 */ TSource2, TResult | js.Promise[TResult]]
  ): AsyncIterableIterator[TResult] = js.native
}
