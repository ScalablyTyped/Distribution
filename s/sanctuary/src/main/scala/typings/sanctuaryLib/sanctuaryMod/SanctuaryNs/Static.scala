package typings
package sanctuaryLib.sanctuaryMod.SanctuaryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var Either: sanctuaryLib.sanctuaryMod.TypeRep = js.native
  var Maybe: sanctuaryLib.sanctuaryMod.TypeRep = js.native
  var Nothing: sanctuaryLib.sanctuaryMod.Maybe[_] = js.native
  //  Combinator
  def I[A](x: A): A = js.native
  def Just[A](x: A): sanctuaryLib.sanctuaryMod.Maybe[A] = js.native
  def K[A](x: A): js.Function1[/* y */ js.Any, A] = js.native
  def Left[A](x: A): sanctuaryLib.sanctuaryMod.Either[A, _] = js.native
  def Right[A](x: A): sanctuaryLib.sanctuaryMod.Either[_, A] = js.native
  def T[A](x: A): js.Function1[/* f */ sanctuaryLib.Fn[A, _], _] = js.native
  def add(p: sanctuaryLib.FiniteNumber): js.Function1[/* q */ sanctuaryLib.FiniteNumber, sanctuaryLib.FiniteNumber] = js.native
  def allPass[A](p: js.Array[sanctuaryLib.Predicate[A]]): sanctuaryLib.Predicate[A] = js.native
  def alt[A](x: sanctuaryLib.sanctuaryMod.Alt[A]): js.Function1[/* y */ sanctuaryLib.sanctuaryMod.Alt[A], sanctuaryLib.sanctuaryMod.Alt[A]] = js.native
  //  Logic
  def and(p: scala.Boolean): js.Function1[/* q */ scala.Boolean, scala.Boolean] = js.native
  def anyPass[A](p: js.Array[sanctuaryLib.Predicate[A]]): sanctuaryLib.Predicate[A] = js.native
  def ap[A, B](p: sanctuaryLib.sanctuaryMod.Apply[sanctuaryLib.Fn[A, B]]): js.Function1[/* q */ sanctuaryLib.sanctuaryMod.Apply[A], sanctuaryLib.sanctuaryMod.Apply[B]] = js.native
  def apFirst[A](x: sanctuaryLib.sanctuaryMod.Apply[A]): js.Function1[/* y */ sanctuaryLib.sanctuaryMod.Apply[_], sanctuaryLib.sanctuaryMod.Apply[A]] = js.native
  def apSecond(x: sanctuaryLib.sanctuaryMod.Apply[_]): js.Function1[/* y */ sanctuaryLib.sanctuaryMod.Apply[_], sanctuaryLib.sanctuaryMod.Apply[_]] = js.native
  //  Array
  //  TODO: Fantasyland overloads, non-curried versions
  def append[A](x: A): sanctuaryLib.Anon_Xs[A] = js.native
  def at(p: sanctuaryLib.Integer): sanctuaryLib.Anon_QA = js.native
  def bimap[A, B](p: sanctuaryLib.Fn[A, B]): js.Function1[
    /* q */ sanctuaryLib.Fn[_, _], 
    js.Function1[
      /* r */ sanctuaryLib.sanctuaryMod.Bifunctor[A, _], 
      sanctuaryLib.sanctuaryMod.Bifunctor[B, _]
    ]
  ] = js.native
  def chain[A, B](f: sanctuaryLib.Fn[A, sanctuaryLib.sanctuaryMod.Chain[B]]): js.Function1[
    /* chain_ */ sanctuaryLib.sanctuaryMod.Chain[A], 
    sanctuaryLib.sanctuaryMod.Chain[B]
  ] = js.native
  def chainRec(typeRep: sanctuaryLib.sanctuaryMod.TypeRep): sanctuaryLib.Anon_F = js.native
  @JSName("chain")
  def chain_ABX[A, B, X](f: sanctuaryLib.Fn2[A, X, B]): js.Function1[/* chain_ */ sanctuaryLib.Fn[X, A], sanctuaryLib.Fn[X, B]] = js.native
  def complement[A](p: sanctuaryLib.Predicate[A]): sanctuaryLib.Predicate[A] = js.native
  //  Composition
  def compose[B, C](f: sanctuaryLib.Fn[B, C]): js.Function1[/* g */ sanctuaryLib.Fn[_, B], sanctuaryLib.Fn[_, C]] = js.native
  def compose[B, C](x: sanctuaryLib.sanctuaryMod.Semigroupoid[B, C]): js.Function1[
    /* y */ sanctuaryLib.sanctuaryMod.Semigroupoid[_, B], 
    sanctuaryLib.sanctuaryMod.Semigroupoid[_, C]
  ] = js.native
  def concat(x: java.lang.String): js.Function1[/* y */ java.lang.String, java.lang.String] = js.native
  def concat[A](x: js.Array[A]): js.Function1[/* y */ js.Array[A], js.Array[A]] = js.native
  def concat[A](x: sanctuaryLib.sanctuaryMod.Semigroup[A]): js.Function1[
    /* y */ sanctuaryLib.sanctuaryMod.Semigroup[A], 
    sanctuaryLib.sanctuaryMod.Semigroup[A]
  ] = js.native
  def concat[A](x: sanctuaryLib.sanctuaryMod.StrMap[A]): js.Function1[/* y */ sanctuaryLib.sanctuaryMod.StrMap[A], sanctuaryLib.sanctuaryMod.StrMap[A]] = js.native
  def contramap[A, B](f: sanctuaryLib.Fn[B, A]): sanctuaryLib.Anon_Contravariant[A, B] = js.native
  //  Function
  def curry2[A, B, C](f: sanctuaryLib.`Fn2_`[A, B, C]): sanctuaryLib.Fn2[A, B, C] = js.native
  def curry3[A, B, C, D](f: sanctuaryLib.`Fn3_`[A, B, C, D]): sanctuaryLib.Fn3[A, B, C, D] = js.native
  def curry4[A, B, C, D, E](f: sanctuaryLib.`Fn4_`[A, B, C, D, E]): sanctuaryLib.Fn4[A, B, C, D, E] = js.native
  def curry5[A, B, C, D, E, F](f: sanctuaryLib.`Fn5_`[A, B, C, D, E, F]): sanctuaryLib.Fn5[A, B, C, D, E, F] = js.native
  def div(p: sanctuaryLib.NonZeroFiniteNumber): js.Function1[/* q */ sanctuaryLib.FiniteNumber, sanctuaryLib.FiniteNumber] = js.native
  def drop(n: sanctuaryLib.Integer): sanctuaryLib.sanctuaryMod.ListToMaybeList = js.native
  def dropLast(n: sanctuaryLib.Integer): sanctuaryLib.sanctuaryMod.ListToMaybeList = js.native
  def dropWhile[A](pred: sanctuaryLib.Predicate[A]): js.Function1[
    /* foldable */ sanctuaryLib.sanctuaryMod.Foldable[A], 
    sanctuaryLib.sanctuaryMod.Foldable[A]
  ] = js.native
  def either[A, C](p: sanctuaryLib.Fn[A, C]): js.Function1[
    /* q */ sanctuaryLib.Fn[_, C], 
    js.Function1[/* r */ sanctuaryLib.sanctuaryMod.Either[A, _], C]
  ] = js.native
  def eitherToMaybe[B](p: sanctuaryLib.sanctuaryMod.Either[_, B]): sanctuaryLib.sanctuaryMod.Maybe[B] = js.native
  def elem[A](p: A): js.Function1[
    /* q */ sanctuaryLib.sanctuaryMod.Foldable[A] | sanctuaryLib.sanctuaryMod.StrMap[A] | js.Array[A], 
    scala.Boolean
  ] = js.native
  def empty(p: sanctuaryLib.sanctuaryMod.TypeRep): sanctuaryLib.sanctuaryMod.Monoid[_] = js.native
  def encase[A, B](p: sanctuaryLib.Fn[A, B]): sanctuaryLib.Fn[A, sanctuaryLib.sanctuaryMod.Maybe[B]] = js.native
  def encase2[A, B, C](p: sanctuaryLib.Fn2[A, B, C]): sanctuaryLib.Fn2[A, B, sanctuaryLib.sanctuaryMod.Maybe[C]] = js.native
  def encase3[A, B, C, D](p: sanctuaryLib.Fn3[A, B, C, D]): sanctuaryLib.Fn3[A, B, C, sanctuaryLib.sanctuaryMod.Maybe[D]] = js.native
  def encaseEither[L](p: sanctuaryLib.Fn[stdLib.Error, L]): js.Function1[
    /* q */ sanctuaryLib.Fn[_, _], 
    sanctuaryLib.Fn[_, sanctuaryLib.sanctuaryMod.Either[L, _]]
  ] = js.native
  def encaseEither2[L](p: sanctuaryLib.Fn[stdLib.Error, L]): js.Function1[
    /* q */ sanctuaryLib.Fn2[_, _, _], 
    sanctuaryLib.Fn2[_, _, sanctuaryLib.sanctuaryMod.Either[L, _]]
  ] = js.native
  def encaseEither3[L](p: sanctuaryLib.Fn[stdLib.Error, L]): js.Function1[
    /* q */ sanctuaryLib.Fn3[_, _, _, _], 
    sanctuaryLib.Fn3[_, _, _, sanctuaryLib.sanctuaryMod.Either[L, _]]
  ] = js.native
  //  Fantasy Land
  def equals[A](x: sanctuaryLib.sanctuaryMod.Setoid[A]): js.Function1[/* y */ sanctuaryLib.sanctuaryMod.Setoid[A], scala.Boolean] = js.native
  //  Integer
  def even(n: sanctuaryLib.Integer): scala.Boolean = js.native
  def extend[A, B](f: sanctuaryLib.Fn[sanctuaryLib.sanctuaryMod.Extend[A], B]): js.Function1[
    /* extend_ */ sanctuaryLib.sanctuaryMod.Extend[A], 
    sanctuaryLib.sanctuaryMod.Extend[B]
  ] = js.native
  def extract[A](comonad: sanctuaryLib.sanctuaryMod.Comonad[A]): A = js.native
  def filter[A](pred: sanctuaryLib.Predicate[A]): sanctuaryLib.Anon_M[A] = js.native
  def filterM[A](pred: sanctuaryLib.Predicate[A]): sanctuaryLib.Anon_M[A] = js.native
  def find[A](p: sanctuaryLib.Predicate[A]): js.Function1[
    /* q */ js.Array[A] | sanctuaryLib.sanctuaryMod.StrMap[A] | sanctuaryLib.sanctuaryMod.Foldable[A], 
    sanctuaryLib.sanctuaryMod.Maybe[A]
  ] = js.native
  def flip[A, B, C](f: sanctuaryLib.Fn2[A, B, C]): sanctuaryLib.Fn2[B, A, C] = js.native
  def fromEither[B](p: B): js.Function1[/* q */ sanctuaryLib.sanctuaryMod.Either[_, B], B] = js.native
  def fromMaybe[A](p: A): js.Function1[/* q */ sanctuaryLib.sanctuaryMod.Maybe[A], A] = js.native
  def `fromMaybe_`[A](p: sanctuaryLib.Thunk[A]): js.Function1[/* q */ sanctuaryLib.sanctuaryMod.Maybe[A], A] = js.native
  def get(p: sanctuaryLib.Predicate[_]): js.Function1[
    /* q */ java.lang.String, 
    js.Function1[/* r */ _, sanctuaryLib.sanctuaryMod.Maybe[_]]
  ] = js.native
  def gets(p: sanctuaryLib.Predicate[_]): js.Function1[
    /* q */ js.Array[java.lang.String], 
    js.Function1[/* r */ _, sanctuaryLib.sanctuaryMod.Maybe[_]]
  ] = js.native
  def groupBy[A](f: sanctuaryLib.Fn2[A, A, scala.Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[js.Array[A]]] = js.native
  def gt[A](x: sanctuaryLib.sanctuaryMod.Ord[A]): js.Function1[/* y */ sanctuaryLib.sanctuaryMod.Ord[A], scala.Boolean] = js.native
  def gte[A](x: sanctuaryLib.sanctuaryMod.Ord[A]): js.Function1[/* y */ sanctuaryLib.sanctuaryMod.Ord[A], scala.Boolean] = js.native
  def head(xs: java.lang.String): sanctuaryLib.sanctuaryMod.Maybe[java.lang.String] = js.native
  def head[A](xs: js.Array[A]): sanctuaryLib.sanctuaryMod.Maybe[A] = js.native
  def id[A](p: sanctuaryLib.sanctuaryMod.TypeRep): (sanctuaryLib.Fn[A, A]) | sanctuaryLib.sanctuaryMod.Category[_] = js.native
  def ifElse[A, B](p: sanctuaryLib.Predicate[A]): js.Function1[
    /* q */ sanctuaryLib.Fn[A, B], 
    js.Function1[/* r */ sanctuaryLib.Fn[A, B], sanctuaryLib.Fn[A, B]]
  ] = js.native
  def init(xs: java.lang.String): sanctuaryLib.sanctuaryMod.Maybe[java.lang.String] = js.native
  def init[A](xs: js.Array[A]): sanctuaryLib.sanctuaryMod.Maybe[js.Array[A]] = js.native
  def is(typeRep: sanctuaryLib.sanctuaryMod.TypeRep): js.Function1[/* x */ js.Any, scala.Boolean] = js.native
  def isJust(p: sanctuaryLib.sanctuaryMod.Maybe[_]): scala.Boolean = js.native
  //  TODO: Either
  def isLeft(p: sanctuaryLib.sanctuaryMod.Either[_, _]): scala.Boolean = js.native
  //  TODO: Maybe
  def isNothing(p: sanctuaryLib.sanctuaryMod.Maybe[_]): scala.Boolean = js.native
  def isRight(p: sanctuaryLib.sanctuaryMod.Either[_, _]): scala.Boolean = js.native
  def join[A](`chain_`: js.Array[js.Array[A]]): js.Array[A] = js.native
  def join[A](`chain_`: sanctuaryLib.sanctuaryMod.Chain[sanctuaryLib.sanctuaryMod.Chain[A]]): sanctuaryLib.sanctuaryMod.Chain[A] = js.native
  def join[A](`chain_`: sanctuaryLib.sanctuaryMod.Maybe[sanctuaryLib.sanctuaryMod.Maybe[A]]): sanctuaryLib.sanctuaryMod.Maybe[A] = js.native
  def join[A, B](`chain_`: sanctuaryLib.Fn2[B, B, A]): sanctuaryLib.Fn[B, A] = js.native
  def joinWith(p: java.lang.String): js.Function1[/* q */ js.Array[java.lang.String], java.lang.String] = js.native
  def justs[A](p: js.Array[sanctuaryLib.sanctuaryMod.Maybe[A]]): js.Array[A] = js.native
  //  StrMap
  def keys(p: sanctuaryLib.sanctuaryMod.StrMap[_]): js.Array[java.lang.String] = js.native
  def last(xs: java.lang.String): sanctuaryLib.sanctuaryMod.Maybe[java.lang.String] = js.native
  def last[A](xs: js.Array[A]): sanctuaryLib.sanctuaryMod.Maybe[A] = js.native
  def lefts[A](p: js.Array[sanctuaryLib.sanctuaryMod.Either[A, _]]): js.Array[A] = js.native
  def lift2[A, B, C](f: sanctuaryLib.Fn2[A, B, C]): sanctuaryLib.Anon_X[A, B, C] = js.native
  def lift3[A, B, C, D](f: sanctuaryLib.Fn3[A, B, C, D]): sanctuaryLib.Anon_XY[A, B, C, D] = js.native
  def lines(s: java.lang.String): js.Array[java.lang.String] = js.native
  def lt[A](x: sanctuaryLib.sanctuaryMod.Ord[A]): js.Function1[/* y */ sanctuaryLib.sanctuaryMod.Ord[A], scala.Boolean] = js.native
  def lte[A](x: sanctuaryLib.sanctuaryMod.Ord[A]): js.Function1[/* y */ sanctuaryLib.sanctuaryMod.Ord[A], scala.Boolean] = js.native
  def map[A, B](p: sanctuaryLib.Fn[A, B]): sanctuaryLib.Anon_Q[A, B] = js.native
  def mapMaybe[A](p: sanctuaryLib.Fn[A, sanctuaryLib.sanctuaryMod.Maybe[_]]): js.Function1[/* q */ js.Array[A], js.Array[A]] = js.native
  def `match`(pattern: stdLib.RegExp): js.Function1[
    /* q */ java.lang.String, 
    js.Array[sanctuaryLib.sanctuaryMod.Maybe[sanctuaryLib.sanctuaryMod.MatchObj]]
  ] = js.native
  def matchAll(pattern: stdLib.RegExp): js.Function1[/* q */ java.lang.String, js.Array[sanctuaryLib.sanctuaryMod.MatchObj]] = js.native
  def max[A](x: sanctuaryLib.sanctuaryMod.Ord[A]): js.Function1[/* y */ sanctuaryLib.sanctuaryMod.Ord[A], A] = js.native
  def maybe[B](p: B): js.Function1[
    /* q */ sanctuaryLib.Fn[_, B], 
    js.Function1[/* r */ sanctuaryLib.sanctuaryMod.Maybe[_], B]
  ] = js.native
  def maybeToEither[A](p: A): js.Function1[/* q */ sanctuaryLib.sanctuaryMod.Maybe[_], sanctuaryLib.sanctuaryMod.Either[A, _]] = js.native
  def maybeToNullable[A](p: sanctuaryLib.sanctuaryMod.Maybe[A]): sanctuaryLib.Nullable[A] = js.native
  def `maybe_`[B](p: sanctuaryLib.Thunk[B]): js.Function1[
    /* q */ sanctuaryLib.Fn[_, B], 
    js.Function1[/* r */ sanctuaryLib.sanctuaryMod.Maybe[_], B]
  ] = js.native
  def mean(p: js.Array[sanctuaryLib.FiniteNumber]): sanctuaryLib.sanctuaryMod.Maybe[sanctuaryLib.FiniteNumber] = js.native
  def mean(p: sanctuaryLib.sanctuaryMod.Foldable[sanctuaryLib.FiniteNumber]): sanctuaryLib.sanctuaryMod.Maybe[sanctuaryLib.FiniteNumber] = js.native
  def min[A](x: sanctuaryLib.sanctuaryMod.Ord[A]): js.Function1[/* y */ sanctuaryLib.sanctuaryMod.Ord[A], A] = js.native
  def mult(x: sanctuaryLib.FiniteNumber): js.Function1[/* q */ sanctuaryLib.FiniteNumber, sanctuaryLib.FiniteNumber] = js.native
  //  Number
  def negate(n: sanctuaryLib.ValidNumber): sanctuaryLib.ValidNumber = js.native
  def not(p: scala.Boolean): scala.Boolean = js.native
  def odd(n: sanctuaryLib.Integer): scala.Boolean = js.native
  def of[A](typeRep: sanctuaryLib.sanctuaryMod.TypeRep): js.Function1[/* x */ A, sanctuaryLib.Fn[_, A]] = js.native
  def on[A, B, C](p: sanctuaryLib.Fn2[B, B, C]): js.Function1[/* q */ sanctuaryLib.Fn[A, B], js.Function1[/* r */ A, sanctuaryLib.Fn[A, C]]] = js.native
  def or(p: scala.Boolean): js.Function1[/* q */ scala.Boolean, scala.Boolean] = js.native
  def pairs[A](p: sanctuaryLib.sanctuaryMod.StrMap[A]): js.Array[sanctuaryLib.Pair[java.lang.String, A]] = js.native
  //  Parse
  def parseDate(s: java.lang.String): sanctuaryLib.sanctuaryMod.Maybe[stdLib.Date] = js.native
  def parseFloat(s: java.lang.String): sanctuaryLib.sanctuaryMod.Maybe[scala.Double] = js.native
  def parseInt(p: sanctuaryLib.Integer): js.Function1[/* q */ java.lang.String, sanctuaryLib.sanctuaryMod.Maybe[sanctuaryLib.Integer]] = js.native
  def parseJson(p: sanctuaryLib.Predicate[_]): js.Function1[/* q */ java.lang.String, sanctuaryLib.sanctuaryMod.Maybe[_]] = js.native
  def pipe(fs: js.Array[sanctuaryLib.Fn[_, _]]): js.Function1[/* x */ js.Any, _] = js.native
  def pipe[A, B, C](fs: js.Tuple2[sanctuaryLib.Fn[A, B], sanctuaryLib.Fn[B, C]]): js.Function1[/* x */ A, C] = js.native
  def pipe[A, B, C, D](fs: js.Tuple3[sanctuaryLib.Fn[A, B], sanctuaryLib.Fn[B, C], sanctuaryLib.Fn[C, D]]): js.Function1[/* x */ A, D] = js.native
  def pipe[A, B, C, D, E](
    fs: js.Tuple4[
      sanctuaryLib.Fn[A, B], 
      sanctuaryLib.Fn[B, C], 
      sanctuaryLib.Fn[C, D], 
      sanctuaryLib.Fn[D, E]
    ]
  ): js.Function1[/* x */ A, E] = js.native
  def pipe[A, B, C, D, E, F](
    fs: js.Tuple5[
      sanctuaryLib.Fn[A, B], 
      sanctuaryLib.Fn[B, C], 
      sanctuaryLib.Fn[C, D], 
      sanctuaryLib.Fn[D, E], 
      sanctuaryLib.Fn[E, F]
    ]
  ): js.Function1[/* x */ A, F] = js.native
  @JSName("pipe")
  def pipe_AB[A, B](fs: js.Array[sanctuaryLib.Fn[A, B]]): js.Function1[/* x */ A, B] = js.native
  def pluck(key: java.lang.String): js.Function1[
    /* xs */ sanctuaryLib.sanctuaryMod.Functor[_], 
    sanctuaryLib.sanctuaryMod.Functor[_]
  ] = js.native
  def pow(p: sanctuaryLib.FiniteNumber): js.Function1[/* q */ sanctuaryLib.FiniteNumber, sanctuaryLib.FiniteNumber] = js.native
  def prepend[A](x: A): sanctuaryLib.Anon_Xs[A] = js.native
  def product(p: js.Array[sanctuaryLib.FiniteNumber]): sanctuaryLib.FiniteNumber = js.native
  def product(p: sanctuaryLib.sanctuaryMod.Foldable[sanctuaryLib.FiniteNumber]): sanctuaryLib.FiniteNumber = js.native
  def promap[A, B](p: sanctuaryLib.Fn[A, B]): js.Function1[/* q */ sanctuaryLib.Fn[_, _], sanctuaryLib.Anon_R[B, _, A, _]] = js.native
  //  Object
  def prop(p: java.lang.String): js.Function1[/* q */ js.Any, _] = js.native
  def props(p: js.Array[java.lang.String]): js.Function1[/* q */ js.Any, _] = js.native
  def range(from: sanctuaryLib.Integer): js.Function1[/* to */ sanctuaryLib.Integer, js.Array[sanctuaryLib.Integer]] = js.native
  def reduce[A, B](p: sanctuaryLib.Fn2[B, A, B]): js.Function1[
    /* q */ B, 
    js.Function1[
      /* r */ js.Array[A] | sanctuaryLib.sanctuaryMod.StrMap[A] | sanctuaryLib.sanctuaryMod.Maybe[A] | (sanctuaryLib.sanctuaryMod.Either[_, A]) | sanctuaryLib.sanctuaryMod.Foldable[A], 
      B
    ]
  ] = js.native
  //  RegExp
  def regex(p: java.lang.String): js.Function1[/* q */ java.lang.String, stdLib.RegExp] = js.native
  def regexEscape(s: java.lang.String): java.lang.String = js.native
  def reverse[A](foldable: js.Array[A]): js.Array[A] = js.native
  def reverse[A](foldable: sanctuaryLib.sanctuaryMod.Foldable[A]): sanctuaryLib.sanctuaryMod.Foldable[A] = js.native
  def rights[B](p: js.Array[sanctuaryLib.sanctuaryMod.Either[_, B]]): js.Array[B] = js.native
  def sequence(typeRep: sanctuaryLib.sanctuaryMod.TypeRep): js.Function1[
    /* traversable */ sanctuaryLib.sanctuaryMod.Traversable[sanctuaryLib.sanctuaryMod.Applicative[_]], 
    sanctuaryLib.sanctuaryMod.Applicative[sanctuaryLib.sanctuaryMod.Traversable[_]]
  ] = js.native
  //  List
  def slice(p: sanctuaryLib.Integer): js.Function1[/* q */ sanctuaryLib.Integer, sanctuaryLib.sanctuaryMod.ListToMaybeList] = js.native
  def sort[A](foldable: js.Array[A]): js.Array[A] = js.native
  def sort[A](foldable: sanctuaryLib.sanctuaryMod.Foldable[A]): sanctuaryLib.sanctuaryMod.Foldable[A] = js.native
  def sortBy[A](f: sanctuaryLib.Fn[A, sanctuaryLib.sanctuaryMod.Ord[_]]): sanctuaryLib.Anon_Foldable[A] = js.native
  def splitOn(separator: java.lang.String): js.Function1[/* q */ java.lang.String, js.Array[java.lang.String]] = js.native
  def splitOnRegex(pattern: stdLib.RegExp): js.Function1[/* q */ java.lang.String, js.Array[java.lang.String]] = js.native
  def stripPrefix(prefix: java.lang.String): js.Function1[/* q */ java.lang.String, sanctuaryLib.sanctuaryMod.Maybe[java.lang.String]] = js.native
  def stripSuffix(suffix: java.lang.String): js.Function1[/* q */ java.lang.String, sanctuaryLib.sanctuaryMod.Maybe[java.lang.String]] = js.native
  def sub(p: sanctuaryLib.FiniteNumber): js.Function1[/* q */ sanctuaryLib.FiniteNumber, sanctuaryLib.FiniteNumber] = js.native
  def sum(p: js.Array[sanctuaryLib.FiniteNumber]): sanctuaryLib.FiniteNumber = js.native
  def sum(p: sanctuaryLib.sanctuaryMod.Foldable[sanctuaryLib.FiniteNumber]): sanctuaryLib.FiniteNumber = js.native
  def tagBy[A](p: sanctuaryLib.Predicate[A]): js.Function1[/* q */ A, sanctuaryLib.sanctuaryMod.Either[A, A]] = js.native
  def tail(xs: java.lang.String): sanctuaryLib.sanctuaryMod.Maybe[java.lang.String] = js.native
  def tail[A](xs: js.Array[A]): sanctuaryLib.sanctuaryMod.Maybe[js.Array[A]] = js.native
  def take(n: sanctuaryLib.Integer): sanctuaryLib.sanctuaryMod.ListToMaybeList = js.native
  def takeLast(n: sanctuaryLib.Integer): sanctuaryLib.sanctuaryMod.ListToMaybeList = js.native
  def takeWhile[A](pred: sanctuaryLib.Predicate[A]): js.Function1[
    /* foldable */ sanctuaryLib.sanctuaryMod.Foldable[A], 
    sanctuaryLib.sanctuaryMod.Foldable[A]
  ] = js.native
  def test(pattern: stdLib.RegExp): sanctuaryLib.Predicate[java.lang.String] = js.native
  def toEither[A](p: A): js.Function1[/* q */ js.UndefOr[js.Any | scala.Null], sanctuaryLib.sanctuaryMod.Either[A, _]] = js.native
  def toLower(s: java.lang.String): java.lang.String = js.native
  def toMaybe[A](): sanctuaryLib.sanctuaryMod.Maybe[A] = js.native
  def toMaybe[A](p: A): sanctuaryLib.sanctuaryMod.Maybe[A] = js.native
  //  Showable
  def toString(x: js.Any): java.lang.String = js.native
  //  String
  def toUpper(s: java.lang.String): java.lang.String = js.native
  def traverse(typeRep: sanctuaryLib.sanctuaryMod.TypeRep): js.Function1[
    /* f */ sanctuaryLib.Fn[_, sanctuaryLib.sanctuaryMod.Applicative[_]], 
    js.Function1[
      /* traversable */ sanctuaryLib.sanctuaryMod.Traversable[_], 
      sanctuaryLib.sanctuaryMod.Applicative[sanctuaryLib.sanctuaryMod.Traversable[_]]
    ]
  ] = js.native
  def trim(s: java.lang.String): java.lang.String = js.native
  //  Classify
  def `type`(x: js.Any): sanctuaryLib.Anon_Name = js.native
  def unfoldr[A, B](f: sanctuaryLib.Fn[B, sanctuaryLib.sanctuaryMod.Maybe[sanctuaryLib.Pair[A, B]]]): js.Function1[/* x */ B, js.Array[A]] = js.native
  def unless[A](p: sanctuaryLib.Predicate[A]): js.Function1[/* q */ sanctuaryLib.Fn[A, A], sanctuaryLib.Fn[A, A]] = js.native
  def unlines(xs: js.Array[java.lang.String]): java.lang.String = js.native
  def unwords(xs: js.Array[java.lang.String]): java.lang.String = js.native
  def values[A](p: sanctuaryLib.sanctuaryMod.StrMap[A]): js.Array[A] = js.native
  def when[A](p: sanctuaryLib.Predicate[A]): js.Function1[/* q */ sanctuaryLib.Fn[A, A], sanctuaryLib.Fn[A, A]] = js.native
  def words(s: java.lang.String): js.Array[java.lang.String] = js.native
  def zero(p: sanctuaryLib.sanctuaryMod.TypeRep): sanctuaryLib.sanctuaryMod.Plus[_] = js.native
}

