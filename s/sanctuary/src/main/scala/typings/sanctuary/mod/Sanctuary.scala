package typings.sanctuary.mod

import typings.sanctuary.AnonCheckTypes
import typings.sanctuary.AnonName
import typings.sanctuary.FnContravariant
import typings.sanctuary.FnF
import typings.sanctuary.FnFoldable
import typings.sanctuary.FnM
import typings.sanctuary.FnQ
import typings.sanctuary.FnQA
import typings.sanctuary.FnR
import typings.sanctuary.FnX
import typings.sanctuary.FnXY
import typings.sanctuary.FnXs
import typings.std.Date
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sanctuary", "Sanctuary")
@js.native
object Sanctuary extends js.Object {
  @js.native
  trait Environment extends Static {
    var env: js.Array[_] = js.native
    def create(opts: AnonCheckTypes): Static = js.native
  }
  
  @js.native
  trait Static extends js.Object {
    var Either: TypeRep = js.native
    var Maybe: TypeRep = js.native
    var Nothing: Maybe[_] = js.native
    //  Combinator
    def I[A](x: A): A = js.native
    def Just[A](x: A): Maybe[A] = js.native
    def K[A](x: A): js.Function1[/* y */ js.Any, A] = js.native
    def Left[A](x: A): Either[A, _] = js.native
    def Right[A](x: A): Either[_, A] = js.native
    def T[A](x: A): js.Function1[/* f */ Fn[A, _], _] = js.native
    def add(p: FiniteNumber): js.Function1[/* q */ FiniteNumber, FiniteNumber] = js.native
    def allPass[A](p: js.Array[Predicate[A]]): Predicate[A] = js.native
    def alt[A](x: Alt[A]): js.Function1[/* y */ Alt[A], Alt[A]] = js.native
    //  Logic
    def and(p: Boolean): js.Function1[/* q */ Boolean, Boolean] = js.native
    def anyPass[A](p: js.Array[Predicate[A]]): Predicate[A] = js.native
    def ap[A, B](p: Apply[Fn[A, B]]): js.Function1[/* q */ Apply[A], Apply[B]] = js.native
    def apFirst[A](x: Apply[A]): js.Function1[/* y */ Apply[_], Apply[A]] = js.native
    def apSecond(x: Apply[_]): js.Function1[/* y */ Apply[_], Apply[_]] = js.native
    //  Array
    //  TODO: Fantasyland overloads, non-curried versions
    def append[A](x: A): FnXs[A] = js.native
    def at(p: Integer): FnQA = js.native
    def bimap[A, B](p: Fn[A, B]): js.Function1[/* q */ Fn[_, _], js.Function1[/* r */ Bifunctor[A, _], Bifunctor[B, _]]] = js.native
    def chain[A, B](f: Fn[A, Chain[B]]): js.Function1[/* chain_ */ Chain[A], Chain[B]] = js.native
    def chainRec(typeRep: TypeRep): FnF = js.native
    @JSName("chain")
    def chain_ABX[A, B, X](f: Fn2[A, X, B]): js.Function1[/* chain_ */ Fn[X, A], Fn[X, B]] = js.native
    def complement[A](p: Predicate[A]): Predicate[A] = js.native
    //  Composition
    def compose[B, C](f: Fn[B, C]): js.Function1[/* g */ Fn[_, B], Fn[_, C]] = js.native
    def compose[B, C](x: Semigroupoid[B, C]): js.Function1[/* y */ Semigroupoid[_, B], Semigroupoid[_, C]] = js.native
    def concat(x: String): js.Function1[/* y */ String, String] = js.native
    def concat[A](x: js.Array[A]): js.Function1[/* y */ js.Array[A], js.Array[A]] = js.native
    def concat[A](x: Semigroup[A]): js.Function1[/* y */ Semigroup[A], Semigroup[A]] = js.native
    def concat[A](x: StrMap[A]): js.Function1[/* y */ StrMap[A], StrMap[A]] = js.native
    def contramap[A, B](f: Fn[B, A]): FnContravariant[A, B] = js.native
    //  Function
    def curry2[A, B, C](f: Fn2_[A, B, C]): Fn2[A, B, C] = js.native
    def curry3[A, B, C, D](f: Fn3_[A, B, C, D]): Fn3[A, B, C, D] = js.native
    def curry4[A, B, C, D, E](f: Fn4_[A, B, C, D, E]): Fn4[A, B, C, D, E] = js.native
    def curry5[A, B, C, D, E, F](f: Fn5_[A, B, C, D, E, F]): Fn5[A, B, C, D, E, F] = js.native
    def div(p: NonZeroFiniteNumber): js.Function1[/* q */ FiniteNumber, FiniteNumber] = js.native
    def drop(n: Integer): ListToMaybeList = js.native
    def dropLast(n: Integer): ListToMaybeList = js.native
    def dropWhile[A](pred: Predicate[A]): js.Function1[/* foldable */ Foldable[A], Foldable[A]] = js.native
    def either[A, C](p: Fn[A, C]): js.Function1[/* q */ Fn[_, C], js.Function1[/* r */ Either[A, _], C]] = js.native
    def eitherToMaybe[B](p: Either[_, B]): Maybe[B] = js.native
    def elem[A](p: A): js.Function1[/* q */ Foldable[A] | StrMap[A] | js.Array[A], Boolean] = js.native
    def empty(p: TypeRep): Monoid[_] = js.native
    def encase[A, B](p: Fn[A, B]): Fn[A, Maybe[B]] = js.native
    def encase2[A, B, C](p: Fn2[A, B, C]): Fn2[A, B, Maybe[C]] = js.native
    def encase3[A, B, C, D](p: Fn3[A, B, C, D]): Fn3[A, B, C, Maybe[D]] = js.native
    def encaseEither[L](p: Fn[Error, L]): js.Function1[/* q */ Fn[_, _], Fn[_, Either[L, _]]] = js.native
    def encaseEither2[L](p: Fn[Error, L]): js.Function1[/* q */ Fn2[_, _, _], Fn2[_, _, Either[L, _]]] = js.native
    def encaseEither3[L](p: Fn[Error, L]): js.Function1[/* q */ Fn3[_, _, _, _], Fn3[_, _, _, Either[L, _]]] = js.native
    //  Fantasy Land
    def equals[A](x: Setoid[A]): js.Function1[/* y */ Setoid[A], Boolean] = js.native
    //  Integer
    def even(n: Integer): Boolean = js.native
    def extend[A, B](f: Fn[Extend[A], B]): js.Function1[/* extend_ */ Extend[A], Extend[B]] = js.native
    def extract[A](comonad: Comonad[A]): A = js.native
    def filter[A](pred: Predicate[A]): FnM[A] = js.native
    def filterM[A](pred: Predicate[A]): FnM[A] = js.native
    def find[A](p: Predicate[A]): js.Function1[/* q */ js.Array[A] | StrMap[A] | Foldable[A], Maybe[A]] = js.native
    def flip[A, B, C](f: Fn2[A, B, C]): Fn2[B, A, C] = js.native
    def fromEither[B](p: B): js.Function1[/* q */ Either[_, B], B] = js.native
    def fromMaybe[A](p: A): js.Function1[/* q */ Maybe[A], A] = js.native
    def fromMaybe_[A](p: Thunk[A]): js.Function1[/* q */ Maybe[A], A] = js.native
    def get(p: Predicate[_]): js.Function1[/* q */ String, js.Function1[/* r */ _, Maybe[_]]] = js.native
    def gets(p: Predicate[_]): js.Function1[/* q */ js.Array[String], js.Function1[/* r */ _, Maybe[_]]] = js.native
    def groupBy[A](f: Fn2[A, A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[js.Array[A]]] = js.native
    def gt[A](x: Ord[A]): js.Function1[/* y */ Ord[A], Boolean] = js.native
    def gte[A](x: Ord[A]): js.Function1[/* y */ Ord[A], Boolean] = js.native
    def head(xs: String): Maybe[String] = js.native
    def head[A](xs: js.Array[A]): Maybe[A] = js.native
    def id[A](p: TypeRep): (Fn[A, A]) | Category[_] = js.native
    def ifElse[A, B](p: Predicate[A]): js.Function1[/* q */ Fn[A, B], js.Function1[/* r */ Fn[A, B], Fn[A, B]]] = js.native
    def init(xs: String): Maybe[String] = js.native
    def init[A](xs: js.Array[A]): Maybe[js.Array[A]] = js.native
    def is(typeRep: TypeRep): js.Function1[/* x */ js.Any, Boolean] = js.native
    def isJust(p: Maybe[_]): Boolean = js.native
    //  TODO: Either
    def isLeft(p: Either[_, _]): Boolean = js.native
    //  TODO: Maybe
    def isNothing(p: Maybe[_]): Boolean = js.native
    def isRight(p: Either[_, _]): Boolean = js.native
    def join[A](chain_ : js.Array[js.Array[A]]): js.Array[A] = js.native
    def join[A](chain_ : Chain[Chain[A]]): Chain[A] = js.native
    def join[A](chain_ : Maybe[Maybe[A]]): Maybe[A] = js.native
    def join[A, B](chain_ : Fn2[B, B, A]): Fn[B, A] = js.native
    def joinWith(p: String): js.Function1[/* q */ js.Array[String], String] = js.native
    def justs[A](p: js.Array[Maybe[A]]): js.Array[A] = js.native
    //  StrMap
    def keys(p: StrMap[_]): js.Array[String] = js.native
    def last(xs: String): Maybe[String] = js.native
    def last[A](xs: js.Array[A]): Maybe[A] = js.native
    def lefts[A](p: js.Array[Either[A, _]]): js.Array[A] = js.native
    def lift2[A, B, C](f: Fn2[A, B, C]): FnX[A, B, C] = js.native
    def lift3[A, B, C, D](f: Fn3[A, B, C, D]): FnXY[A, B, C, D] = js.native
    def lines(s: String): js.Array[String] = js.native
    def lt[A](x: Ord[A]): js.Function1[/* y */ Ord[A], Boolean] = js.native
    def lte[A](x: Ord[A]): js.Function1[/* y */ Ord[A], Boolean] = js.native
    def map[A, B](p: Fn[A, B]): FnQ[A, B] = js.native
    def mapMaybe[A](p: Fn[A, Maybe[_]]): js.Function1[/* q */ js.Array[A], js.Array[A]] = js.native
    def `match`(pattern: RegExp): js.Function1[/* q */ String, js.Array[Maybe[MatchObj]]] = js.native
    def matchAll(pattern: RegExp): js.Function1[/* q */ String, js.Array[MatchObj]] = js.native
    def max[A](x: Ord[A]): js.Function1[/* y */ Ord[A], A] = js.native
    def maybe[B](p: B): js.Function1[/* q */ Fn[_, B], js.Function1[/* r */ Maybe[_], B]] = js.native
    def maybeToEither[A](p: A): js.Function1[/* q */ Maybe[_], Either[A, _]] = js.native
    def maybeToNullable[A](p: Maybe[A]): Nullable[A] = js.native
    def maybe_[B](p: Thunk[B]): js.Function1[/* q */ Fn[_, B], js.Function1[/* r */ Maybe[_], B]] = js.native
    def mean(p: js.Array[FiniteNumber]): Maybe[FiniteNumber] = js.native
    def mean(p: Foldable[FiniteNumber]): Maybe[FiniteNumber] = js.native
    def min[A](x: Ord[A]): js.Function1[/* y */ Ord[A], A] = js.native
    def mult(x: FiniteNumber): js.Function1[/* q */ FiniteNumber, FiniteNumber] = js.native
    //  Number
    def negate(n: ValidNumber): ValidNumber = js.native
    def not(p: Boolean): Boolean = js.native
    def odd(n: Integer): Boolean = js.native
    def of[A](typeRep: TypeRep): js.Function1[/* x */ A, Fn[_, A]] = js.native
    def on[A, B, C](p: Fn2[B, B, C]): js.Function1[/* q */ Fn[A, B], js.Function1[/* r */ A, Fn[A, C]]] = js.native
    def or(p: Boolean): js.Function1[/* q */ Boolean, Boolean] = js.native
    def pairs[A](p: StrMap[A]): js.Array[Pair[String, A]] = js.native
    //  Parse
    def parseDate(s: String): Maybe[Date] = js.native
    def parseFloat(s: String): Maybe[Double] = js.native
    def parseInt(p: Integer): js.Function1[/* q */ String, Maybe[Integer]] = js.native
    def parseJson(p: Predicate[_]): js.Function1[/* q */ String, Maybe[_]] = js.native
    def pipe(fs: js.Array[Fn[_, _]]): js.Function1[/* x */ js.Any, _] = js.native
    def pipe[A, B, C](fs: js.Tuple2[Fn[A, B], Fn[B, C]]): js.Function1[/* x */ A, C] = js.native
    def pipe[A, B, C, D](fs: js.Tuple3[Fn[A, B], Fn[B, C], Fn[C, D]]): js.Function1[/* x */ A, D] = js.native
    def pipe[A, B, C, D, E](fs: js.Tuple4[Fn[A, B], Fn[B, C], Fn[C, D], Fn[D, E]]): js.Function1[/* x */ A, E] = js.native
    def pipe[A, B, C, D, E, F](fs: js.Tuple5[Fn[A, B], Fn[B, C], Fn[C, D], Fn[D, E], Fn[E, F]]): js.Function1[/* x */ A, F] = js.native
    @JSName("pipe")
    def pipe_AB[A, B](fs: js.Array[Fn[A, B]]): js.Function1[/* x */ A, B] = js.native
    def pluck(key: String): js.Function1[/* xs */ Functor[_], Functor[_]] = js.native
    def pow(p: FiniteNumber): js.Function1[/* q */ FiniteNumber, FiniteNumber] = js.native
    def prepend[A](x: A): FnXs[A] = js.native
    def product(p: js.Array[FiniteNumber]): FiniteNumber = js.native
    def product(p: Foldable[FiniteNumber]): FiniteNumber = js.native
    def promap[A, B](p: Fn[A, B]): js.Function1[/* q */ Fn[_, _], FnR[B, _, A, _]] = js.native
    //  Object
    def prop(p: String): js.Function1[/* q */ js.Any, _] = js.native
    def props(p: js.Array[String]): js.Function1[/* q */ js.Any, _] = js.native
    def range(from: Integer): js.Function1[/* to */ Integer, js.Array[Integer]] = js.native
    def reduce[A, B](p: Fn2[B, A, B]): js.Function1[
        /* q */ B, 
        js.Function1[/* r */ js.Array[A] | StrMap[A] | Maybe[A] | (Either[_, A]) | Foldable[A], B]
      ] = js.native
    //  RegExp
    def regex(p: String): js.Function1[/* q */ String, RegExp] = js.native
    def regexEscape(s: String): String = js.native
    def reverse[A](foldable: js.Array[A]): js.Array[A] = js.native
    def reverse[A](foldable: Foldable[A]): Foldable[A] = js.native
    def rights[B](p: js.Array[Either[_, B]]): js.Array[B] = js.native
    def sequence(typeRep: TypeRep): js.Function1[/* traversable */ Traversable[Applicative[_]], Applicative[Traversable[_]]] = js.native
    //  List
    def slice(p: Integer): js.Function1[/* q */ Integer, ListToMaybeList] = js.native
    def sort[A](foldable: js.Array[A]): js.Array[A] = js.native
    def sort[A](foldable: Foldable[A]): Foldable[A] = js.native
    def sortBy[A](f: Fn[A, Ord[_]]): FnFoldable[A] = js.native
    def splitOn(separator: String): js.Function1[/* q */ String, js.Array[String]] = js.native
    def splitOnRegex(pattern: RegExp): js.Function1[/* q */ String, js.Array[String]] = js.native
    def stripPrefix(prefix: String): js.Function1[/* q */ String, Maybe[String]] = js.native
    def stripSuffix(suffix: String): js.Function1[/* q */ String, Maybe[String]] = js.native
    def sub(p: FiniteNumber): js.Function1[/* q */ FiniteNumber, FiniteNumber] = js.native
    def sum(p: js.Array[FiniteNumber]): FiniteNumber = js.native
    def sum(p: Foldable[FiniteNumber]): FiniteNumber = js.native
    def tagBy[A](p: Predicate[A]): js.Function1[/* q */ A, Either[A, A]] = js.native
    def tail(xs: String): Maybe[String] = js.native
    def tail[A](xs: js.Array[A]): Maybe[js.Array[A]] = js.native
    def take(n: Integer): ListToMaybeList = js.native
    def takeLast(n: Integer): ListToMaybeList = js.native
    def takeWhile[A](pred: Predicate[A]): js.Function1[/* foldable */ Foldable[A], Foldable[A]] = js.native
    def test(pattern: RegExp): Predicate[String] = js.native
    def toEither[A](p: A): js.Function1[/* q */ js.UndefOr[js.Any | Null], Either[A, _]] = js.native
    def toLower(s: String): String = js.native
    def toMaybe[A](): Maybe[A] = js.native
    def toMaybe[A](p: A): Maybe[A] = js.native
    //  Showable
    def toString(x: js.Any): String = js.native
    //  String
    def toUpper(s: String): String = js.native
    def traverse(typeRep: TypeRep): js.Function1[
        /* f */ Fn[_, Applicative[_]], 
        js.Function1[/* traversable */ Traversable[_], Applicative[Traversable[_]]]
      ] = js.native
    def trim(s: String): String = js.native
    //  Classify
    def `type`(x: js.Any): AnonName = js.native
    def unfoldr[A, B](f: Fn[B, Maybe[Pair[A, B]]]): js.Function1[/* x */ B, js.Array[A]] = js.native
    def unless[A](p: Predicate[A]): js.Function1[/* q */ Fn[A, A], Fn[A, A]] = js.native
    def unlines(xs: js.Array[String]): String = js.native
    def unwords(xs: js.Array[String]): String = js.native
    def values[A](p: StrMap[A]): js.Array[A] = js.native
    def when[A](p: Predicate[A]): js.Function1[/* q */ Fn[A, A], Fn[A, A]] = js.native
    def words(s: String): js.Array[String] = js.native
    def zero(p: TypeRep): Plus[_] = js.native
  }
  
}

