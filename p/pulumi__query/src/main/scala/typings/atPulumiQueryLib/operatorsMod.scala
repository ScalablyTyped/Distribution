package typings
package atPulumiQueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/query/operators", JSImport.Namespace)
@js.native
object operatorsMod extends js.Object {
  def aggregate[TSource, TAccumulate](
    seed: TAccumulate,
    func: js.Function2[/* acc */ TAccumulate, /* t */ TSource, TAccumulate | js.Promise[TAccumulate]]
  ): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TAccumulate] = js.native
  def all[TSource](predicate: js.Function1[/* t */ TSource, scala.Boolean | js.Promise[scala.Boolean]]): atPulumiQueryLib.interfacesMod.Evaluator[TSource, scala.Boolean] = js.native
  def any[TSource](): atPulumiQueryLib.interfacesMod.Evaluator[TSource, scala.Boolean] = js.native
  def any[TSource](predicate: js.Function1[/* t */ TSource, scala.Boolean | js.Promise[scala.Boolean]]): atPulumiQueryLib.interfacesMod.Evaluator[TSource, scala.Boolean] = js.native
  def average[TSource](): atPulumiQueryLib.interfacesMod.Evaluator[TSource, scala.Double] = js.native
  def average[TSource](selector: js.Function1[/* t */ TSource, scala.Double | js.Promise[scala.Double]]): atPulumiQueryLib.interfacesMod.Evaluator[TSource, scala.Double] = js.native
  @JSName("average")
  def average_TSourcePromise[TSource](): js.Promise[scala.Double] = js.native
  def concat[TSource](iter: atPulumiQueryLib.interfacesMod.AsyncIterable[TSource]): atPulumiQueryLib.interfacesMod.Operator[TSource, TSource] = js.native
  def contains[TSource](value: TSource): atPulumiQueryLib.interfacesMod.Evaluator[TSource, scala.Boolean] = js.native
  def count[TSource](): atPulumiQueryLib.interfacesMod.Evaluator[TSource, scala.Double] = js.native
  def count[TSource](predicate: js.Function1[/* t */ TSource, scala.Boolean | js.Promise[scala.Boolean]]): atPulumiQueryLib.interfacesMod.Evaluator[TSource, scala.Double] = js.native
  def defaultIfEmpty[TSource](defaultValue: TSource): atPulumiQueryLib.interfacesMod.Operator[TSource, TSource] = js.native
  def distinct[TSource](): atPulumiQueryLib.interfacesMod.Operator[TSource, TSource] = js.native
  def elementAt[TSource](index: scala.Double): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TSource] = js.native
  def elementAtOrDefault[TSource](defaultValue: TSource, index: scala.Double): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TSource] = js.native
  def except[TSource](second: atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TSource]): atPulumiQueryLib.interfacesMod.Operator[TSource, TSource] = js.native
  def filter[TSource](f: js.Function2[/* t */ TSource, /* i */ scala.Double, scala.Boolean | js.Promise[scala.Boolean]]): atPulumiQueryLib.interfacesMod.Operator[TSource, TSource] = js.native
  def first[TSource](): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TSource] = js.native
  def first[TSource](predicate: js.Function1[/* t */ TSource, scala.Boolean | js.Promise[scala.Boolean]]): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TSource] = js.native
  def firstOrDefault[TSource](defaultValue: TSource): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TSource] = js.native
  def firstOrDefault[TSource](
    defaultValue: TSource,
    predicate: js.Function1[/* t */ TSource, scala.Boolean | js.Promise[scala.Boolean]]
  ): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TSource] = js.native
  def flatMap[TSource, TInner, TResult](
    selector: js.Function2[
      /* t */ TSource, 
      /* index */ scala.Double, 
      atPulumiQueryLib.interfacesMod.AsyncQuerySource[TInner]
    ]
  ): atPulumiQueryLib.interfacesMod.Operator[TSource, TResult] = js.native
  def flatMap[TSource, TInner, TResult](
    selector: js.Function2[
      /* t */ TSource, 
      /* index */ scala.Double, 
      atPulumiQueryLib.interfacesMod.AsyncQuerySource[TInner]
    ],
    resultSelector: js.Function2[/* t */ TSource, /* ti */ TInner, TResult | js.Promise[TResult]]
  ): atPulumiQueryLib.interfacesMod.Operator[TSource, TResult] = js.native
  def groupBy[TSource, TKey, TResult](keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]]): js.Function1[
    /* source */ atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TSource], 
    atPulumiQueryLib.interfacesMod.AsyncIterableIterator[atPulumiQueryLib.interfacesMod.GroupedAsyncIterableIterator[TKey, TResult]]
  ] = js.native
  def groupBy[TSource, TKey, TResult](
    keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]],
    elementSelector: js.Function1[/* t */ TSource, TResult | js.Promise[TResult]]
  ): js.Function1[
    /* source */ atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TSource], 
    atPulumiQueryLib.interfacesMod.AsyncIterableIterator[atPulumiQueryLib.interfacesMod.GroupedAsyncIterableIterator[TKey, TResult]]
  ] = js.native
  def groupJoin[TOuter, TInner, TKey, TResult](
    inner: atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TInner],
    outerKeySelector: js.Function1[/* to */ TOuter, TKey | js.Promise[TKey]],
    innerKeySelector: js.Function1[/* ti */ TInner, TKey | js.Promise[TKey]],
    resultSelector: js.Function2[
      /* to */ TOuter, 
      /* ti */ atPulumiQueryLib.interfacesMod.AsyncQuerySource[TInner], 
      TResult | js.Promise[TResult]
    ]
  ): atPulumiQueryLib.interfacesMod.Operator[TOuter, TResult] = js.native
  def intersect[TSource](second: atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TSource]): atPulumiQueryLib.interfacesMod.Operator[TSource, TSource] = js.native
  def join[TOuter, TInner, TKey, TResult](
    inner: atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TInner],
    outerKeySelector: js.Function1[/* to */ TOuter, TKey | js.Promise[TKey]],
    innerKeySelector: js.Function1[/* ti */ TInner, TKey | js.Promise[TKey]],
    resultSelector: js.Function2[/* to */ TOuter, /* ti */ TInner, TResult | js.Promise[TResult]]
  ): atPulumiQueryLib.interfacesMod.Operator[TOuter, TResult] = js.native
  def last[TSource](): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TSource] = js.native
  def last[TSource](predicate: js.Function1[/* t */ TSource, scala.Boolean | js.Promise[scala.Boolean]]): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TSource] = js.native
  def lastOrDefault[TSource](defaultValue: TSource): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TSource] = js.native
  def lastOrDefault[TSource](
    defaultValue: TSource,
    predicate: js.Function1[/* t */ TSource, scala.Boolean | js.Promise[scala.Boolean]]
  ): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TSource] = js.native
  def map[TSource, TResult](f: js.Function2[/* t */ TSource, /* i */ scala.Double, TResult | js.Promise[TResult]]): atPulumiQueryLib.interfacesMod.Operator[TSource, TResult] = js.native
  def max[TSource](): atPulumiQueryLib.interfacesMod.Evaluator[TSource, scala.Double] = js.native
  def max[TSource](selector: js.Function1[/* t */ TSource, scala.Double | js.Promise[scala.Double]]): atPulumiQueryLib.interfacesMod.Evaluator[TSource, scala.Double] = js.native
  @JSName("max")
  def max_TSourcePromise[TSource](): js.Promise[scala.Double] = js.native
  def min[TSource](): atPulumiQueryLib.interfacesMod.Evaluator[TSource, scala.Double] = js.native
  def min[TSource](selector: js.Function1[/* t */ TSource, scala.Double | js.Promise[scala.Double]]): atPulumiQueryLib.interfacesMod.Evaluator[TSource, scala.Double] = js.native
  @JSName("min")
  def min_TSourcePromise[TSource](): js.Promise[scala.Double] = js.native
  def ofType[TSource, TResult /* <: TSource */](typeGuard: js.Function1[/* o */ TSource, /* is TResult */ scala.Boolean]): atPulumiQueryLib.interfacesMod.Operator[TSource, TResult] = js.native
  def orderBy[TSource](
    keySelector: js.Function1[
      /* t */ TSource, 
      atPulumiQueryLib.interfacesMod.OrderKey | js.Promise[atPulumiQueryLib.interfacesMod.OrderKey]
    ]
  ): atPulumiQueryLib.interfacesMod.Operator[TSource, TSource] = js.native
  def orderByDescending[TSource](
    keySelector: js.Function1[
      /* t */ TSource, 
      atPulumiQueryLib.interfacesMod.OrderKey | js.Promise[atPulumiQueryLib.interfacesMod.OrderKey]
    ]
  ): atPulumiQueryLib.interfacesMod.Operator[TSource, TSource] = js.native
  def reverse[TSource](): atPulumiQueryLib.interfacesMod.Operator[TSource, TSource] = js.native
  def single[TSource](): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TSource] = js.native
  def single[TSource](predicate: js.Function1[/* t */ TSource, scala.Boolean | js.Promise[scala.Boolean]]): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TSource] = js.native
  def singleOrDefault[TSource](defaultValue: TSource): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TSource] = js.native
  def singleOrDefault[TSource](
    defaultValue: TSource,
    predicate: js.Function1[/* t */ TSource, scala.Boolean | js.Promise[scala.Boolean]]
  ): atPulumiQueryLib.interfacesMod.Evaluator[TSource, TSource] = js.native
  def skip[TSource](n: scala.Double): atPulumiQueryLib.interfacesMod.Operator[TSource, TSource] = js.native
  def skipWhile[TSource](
    predicate: js.Function2[/* t */ TSource, /* i */ scala.Double, scala.Boolean | js.Promise[scala.Boolean]]
  ): atPulumiQueryLib.interfacesMod.Operator[TSource, TSource] = js.native
  def sum[TSource](): atPulumiQueryLib.interfacesMod.Evaluator[TSource, scala.Double] = js.native
  def sum[TSource](selector: js.Function1[/* t */ TSource, scala.Double | js.Promise[scala.Double]]): atPulumiQueryLib.interfacesMod.Evaluator[TSource, scala.Double] = js.native
  @JSName("sum")
  def sum_TSourcePromise[TSource](): js.Promise[scala.Double] = js.native
  def take[TSource](n: scala.Double): atPulumiQueryLib.interfacesMod.Operator[TSource, TSource] = js.native
  def takeWhile[TSource](
    predicate: js.Function2[/* t */ TSource, /* i */ scala.Double, scala.Boolean | js.Promise[scala.Boolean]]
  ): atPulumiQueryLib.interfacesMod.Operator[TSource, TSource] = js.native
  def toArray[TSource](): atPulumiQueryLib.interfacesMod.Evaluator[TSource, js.Array[TSource]] = js.native
  def toMap[TKey, TSource, TResult](keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]]): atPulumiQueryLib.interfacesMod.Evaluator[TSource, stdLib.Map[TKey, TResult]] = js.native
  def toMap[TKey, TSource, TResult](
    keySelector: js.Function1[/* t */ TSource, TKey | js.Promise[TKey]],
    elementSelector: js.Function1[/* t */ TSource, TResult | js.Promise[TResult]]
  ): atPulumiQueryLib.interfacesMod.Evaluator[TSource, stdLib.Map[TKey, TResult]] = js.native
  def union[TSource](second: atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TSource]): atPulumiQueryLib.interfacesMod.Operator[TSource, TSource] = js.native
  def zip[TSource1, TSource2, TResult](
    source1: atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TSource1],
    source2: atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TSource2]
  ): atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TResult] = js.native
  def zip[TSource1, TSource2, TResult](
    source1: atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TSource1],
    source2: atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TSource2],
    resultSelector: js.Function2[/* t1 */ TSource1, /* t2 */ TSource2, TResult | js.Promise[TResult]]
  ): atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TResult] = js.native
}

