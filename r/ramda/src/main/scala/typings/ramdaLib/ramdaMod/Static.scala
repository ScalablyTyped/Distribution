package typings
package ramdaLib.ramdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  /**
    * Placeholder. When used with functions like curry, or op, the second argument is applied to the second
    * position, and it returns a function waiting for its first argument.
    */
  var __ : Placeholder = js.native
  /**
    * Returns a new list containing only those items that match a given predicate function. The predicate function is passed one argument: (value).
    */
  @JSName("filter")
  var filter_Original: Filter = js.native
  /**
    * Similar to `filter`, except that it keeps only values for which the given predicate
    * function returns falsy.
    */
  @JSName("reject")
  var reject_Original: Filter = js.native
  /*
    * A function that always returns false. Any passed in parameters are ignored.
    */
  def F(): scala.Boolean = js.native
  /**
    * A function that always returns true. Any passed in parameters are ignored.
    */
  def T(): scala.Boolean = js.native
  def add(a: java.lang.String): js.Function1[/* b */ java.lang.String, java.lang.String] = js.native
  def add(a: java.lang.String, b: java.lang.String): java.lang.String = js.native
  def add(a: scala.Double): js.Function1[/* b */ scala.Double, scala.Double] = js.native
   /* This is used in examples throughout the docs, but I it only seems to be directly explained here: https://ramdajs.com/0.9/docs/#op */ /**
    * Adds two numbers (or strings). Equivalent to a + b but curried.
    */
  def add(a: scala.Double, b: scala.Double): scala.Double = js.native
  /* Special case for forEach */
  def addIndex[T](
    fn: js.Function2[/* f */ js.Function1[/* item */ T, scala.Unit], /* list */ js.Array[T], js.Array[T]]
  ): ramdaLib.CurryNs.Curry[
    js.Function2[
      /* a */ js.Function3[/* item */ T, /* idx */ scala.Double, /* list */ js.UndefOr[js.Array[T]], scala.Unit], 
      /* b */ js.Array[T], 
      js.Array[T]
    ]
  ] = js.native
  /* Special case for reduce */
  def addIndex[T, U](
    fn: js.Function3[
      /* f */ js.Function2[/* acc */ U, /* item */ T, U], 
      /* aci */ U, 
      /* list */ js.Array[T], 
      U
    ]
  ): ramdaLib.CurryNs.Curry[
    js.Function3[
      /* a */ js.Function4[/* acc */ U, /* item */ T, /* idx */ scala.Double, /* list */ js.UndefOr[js.Array[T]], U], 
      /* b */ U, 
      /* c */ js.Array[T], 
      U
    ]
  ] = js.native
  /**
    * Creates a new list iteration function from an existing one by adding two new parameters to its callback
    * function: the current index, and the entire list.
    */
  @JSName("addIndex")
  def addIndex_TU[T, U](fn: js.Function2[/* f */ js.Function1[/* item */ T, U], /* list */ js.Array[T], js.Array[U]]): ramdaLib.CurryNs.Curry[
    js.Function2[
      /* a */ js.Function3[/* item */ T, /* idx */ scala.Double, /* list */ js.UndefOr[js.Array[T]], U], 
      /* b */ js.Array[T], 
      js.Array[U]
    ]
  ] = js.native
  def adjust[T](index: scala.Double, fn: js.Function1[/* a */ T, T]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Applies a function to the value at the given index of an array, returning a new copy of the array with the
    * element at the given index replaced with the result of the function application.
    */
  def adjust[T](index: scala.Double, fn: js.Function1[/* a */ T, T], list: js.Array[T]): js.Array[T] = js.native
  def all[T](fn: js.Function1[/* a */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], scala.Boolean] = js.native
  /**
    * Returns true if all elements of the list match the predicate, false if there are any that don't.
    */
  def all[T](fn: js.Function1[/* a */ T, scala.Boolean], list: js.Array[T]): scala.Boolean = js.native
  /**
    * Given a list of predicates, returns a new predicate that will be true exactly when all of them are.
    */
  def allPass(preds: js.Array[Pred]): Pred = js.native
  /**
    * Returns a function that always returns the given value.
    */
  def always[T](`val`: T): js.Function0[T] = js.native
  def and(): js.Function1[/* val2 */ js.Any, scala.Boolean] = js.native
  def and(fn1: java.lang.String): js.Function1[/* val2 */ js.Any, scala.Boolean] = js.native
  def and(fn1: java.lang.String, val2: js.Any): scala.Boolean = js.native
  def and(fn1: scala.Boolean): js.Function1[/* val2 */ js.Any, scala.Boolean] = js.native
  def and(fn1: scala.Boolean, val2: js.Any): scala.Boolean = js.native
  def and(fn1: scala.Double): js.Function1[/* val2 */ js.Any, scala.Boolean] = js.native
  /**
    * A function that returns the first argument if it's falsy otherwise the second argument. Note that this is
    * NOT short-circuited, meaning that if expressions are passed they are both evaluated.
    */
  def and(fn1: scala.Double, val2: js.Any): scala.Boolean = js.native
  def and(fn1: scala.Null, val2: js.Any): scala.Boolean = js.native
  def and[T /* <: ramdaLib.Anon_A */](fn1: T): js.Function1[/* val2 */ js.Any, scala.Boolean] = js.native
  def and[T /* <: ramdaLib.Anon_A */](fn1: T, val2: js.Any): scala.Boolean = js.native
  def any[T](fn: js.Function1[/* a */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], scala.Boolean] = js.native
  /**
    * Returns true if at least one of elements of the list match the predicate, false otherwise.
    */
  def any[T](fn: js.Function1[/* a */ T, scala.Boolean], list: js.Array[T]): scala.Boolean = js.native
  /**
    * Given a list of predicates returns a new predicate that will be true exactly when any one of them is.
    */
  def anyPass[T](preds: js.Array[SafePred[T]]): SafePred[T] = js.native
  def ap[T, U](fns: js.Array[js.Function1[/* a */ T, U]]): js.Function1[/* vs */ js.Array[T], js.Array[U]] = js.native
  /**
    * ap applies a list of functions to a list of values.
    */
  def ap[T, U](fns: js.Array[js.Function1[/* a */ T, U]], vs: js.Array[T]): js.Array[U] = js.native
  def aperture(n: scala.Double): js.Function1[/* list */ js.Array[_], js.Array[js.Array[_]]] = js.native
  def aperture[T](n: ramdaLib.ramdaLibNumbers.`10`, list: js.Array[T]): js.Array[js.Tuple10[T, T, T, T, T, T, T, T, T, T]] = js.native
  /**
    * Returns a new list, composed of n-tuples of consecutive elements If n is greater than the length of the list,
    * an empty list is returned.
    */
  def aperture[T](n: ramdaLib.ramdaLibNumbers.`1`, list: js.Array[T]): js.Array[js.Array[T]] = js.native
  def aperture[T](n: ramdaLib.ramdaLibNumbers.`2`, list: js.Array[T]): js.Array[js.Tuple2[T, T]] = js.native
  def aperture[T](n: ramdaLib.ramdaLibNumbers.`3`, list: js.Array[T]): js.Array[js.Tuple3[T, T, T]] = js.native
  def aperture[T](n: ramdaLib.ramdaLibNumbers.`4`, list: js.Array[T]): js.Array[js.Tuple4[T, T, T, T]] = js.native
  def aperture[T](n: ramdaLib.ramdaLibNumbers.`5`, list: js.Array[T]): js.Array[js.Tuple5[T, T, T, T, T]] = js.native
  def aperture[T](n: ramdaLib.ramdaLibNumbers.`6`, list: js.Array[T]): js.Array[js.Tuple6[T, T, T, T, T, T]] = js.native
  def aperture[T](n: ramdaLib.ramdaLibNumbers.`7`, list: js.Array[T]): js.Array[js.Tuple7[T, T, T, T, T, T, T]] = js.native
  def aperture[T](n: ramdaLib.ramdaLibNumbers.`8`, list: js.Array[T]): js.Array[js.Tuple8[T, T, T, T, T, T, T, T]] = js.native
  def aperture[T](n: ramdaLib.ramdaLibNumbers.`9`, list: js.Array[T]): js.Array[js.Tuple9[T, T, T, T, T, T, T, T, T]] = js.native
  def aperture[T](n: scala.Double, list: js.Array[T]): js.Array[js.Array[T]] = js.native
  def append[T](el: T): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  /**
    * Returns a new list containing the contents of the given list, followed by the given element.
    */
  def append[T](el: T, list: js.Array[T]): js.Array[T] = js.native
  @JSName("apply")
  def apply[T, TResult](fn: js.Function2[/* arg0 */ T, /* repeated */ T, TResult]): js.Function1[/* args */ js.Array[_], TResult] = js.native
  /**
    * Applies function fn to the argument list args. This is useful for creating a fixed-arity function from
    * a variadic function. fn should be a bound function if context is significant.
    */
  @JSName("apply")
  def apply[T, U, TResult](fn: js.Function2[/* arg0 */ T, /* repeated */ T, TResult], args: js.Array[U]): TResult = js.native
  /**
    * Given a spec object recursively mapping properties to functions, creates a function producing an object
    * of the same structure, by mapping each property to the result of calling its associated function with
    * the supplied arguments.
    */
  def applySpec[T](obj: js.Any): js.Function1[/* repeated */ js.Any, T] = js.native
  def applyTo[T](el: T): js.Function1[/* fn */ js.Function1[/* t */ T, _], _] = js.native
  /**
    * Takes a value and applies a function to it.
    * This function is also known as the thrush combinator.
    */
  def applyTo[T, U](el: T, fn: js.Function1[/* t */ T, U]): U = js.native
  def ascend[T](fn: js.Function1[/* obj */ T, _]): js.Function2[/* a */ T, /* b */ T, scala.Double] = js.native
  /**
    * Makes an ascending comparator function out of a function that returns a value that can be compared with < and >.
    */
  def ascend[T](fn: js.Function1[/* obj */ T, _], a: T, b: T): scala.Double = js.native
  def assoc[K /* <: java.lang.String */](prop: K): js.Function2[/* val */ js.Any, /* obj */ js.Any, (stdLib.Record[K, _]) with js.Any] = js.native
  /**
    * Makes a shallow clone of an object, setting or overriding the specified property with the given value.
    */
  def assoc[T, U](__ : Placeholder, `val`: T, obj: U): js.Function1[/* prop */ java.lang.String, (stdLib.Record[java.lang.String, T]) with U] = js.native
  def assoc[U, K /* <: java.lang.String */](prop: K, __ : Placeholder, obj: U): js.Function1[/* val */ js.Any, (stdLib.Record[K, _]) with U] = js.native
  def assoc[T, K /* <: java.lang.String */](prop: K, `val`: T): js.Function1[/* obj */ js.Any, (stdLib.Record[K, T]) with js.Any] = js.native
  def assoc[T, U, K /* <: java.lang.String */](prop: K, `val`: T, obj: U): (stdLib.Record[K, T]) with U = js.native
  /**
    * Makes a shallow clone of an object, setting or overriding the nodes required to create the given path, and
    * placing the specific value at the tail end of that path.
    */
  def assocPath[T, U](__ : Placeholder, `val`: T, obj: U): js.Function1[/* path */ Path, U] = js.native
  def assocPath[T, U](path: Path): ramdaLib.CurryNs.Curry[js.Function2[/* a */ T, /* b */ U, U]] = js.native
  def assocPath[T, U](path: Path, __ : Placeholder, obj: U): js.Function1[/* val */ T, U] = js.native
  def assocPath[T, U](path: Path, `val`: T): js.Function1[/* obj */ U, U] = js.native
  def assocPath[T, U](path: Path, `val`: T, obj: U): U = js.native
  /**
    * Wraps a function of any arity (including nullary) in a function that accepts exactly 2
    * parameters. Any extraneous parameters will not be passed to the supplied function.
    */
  def binary(fn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  /**
    * Creates a function that is bound to a context. Note: R.bind does not provide the additional argument-binding
    * capabilities of Function.prototype.bind.
    */
  def bind[T](fn: js.Function1[/* repeated */ js.Any, _], thisObj: T): js.Function1[/* repeated */ js.Any, _] = js.native
  def both(pred1: Pred): js.Function1[/* pred2 */ Pred, Pred] = js.native
  /**
    * A function wrapping calls to the two functions in an && operation, returning the result of the first function
    * if it is false-y and the result of the second function otherwise. Note that this is short-circuited, meaning
    * that the second function will not be invoked if the first returns a false-y value.
    */
  def both(pred1: Pred, pred2: Pred): Pred = js.native
  /**
    * Returns the result of calling its first argument with the remaining arguments. This is occasionally useful
    * as a converging function for R.converge: the left branch can produce a function while the right branch
    * produces a value to be passed to that function as an argument.
    */
  def call(fn: js.Function1[/* repeated */ js.Any, js.Function1[/* repeated */ _, _]], args: js.Any*): js.Any = js.native
  def chain[T, U](fn: js.Function1[/* n */ T, js.Array[U]]): js.Function1[/* list */ js.Array[T], js.Array[U]] = js.native
  /**
    * `chain` maps a function over a list and concatenates the results.
    * This implementation is compatible with the Fantasy-land Chain spec
    */
  def chain[T, U](fn: js.Function1[/* n */ T, js.Array[U]], list: js.Array[T]): js.Array[U] = js.native
  def clamp[T](min: T): js.Function1[/* max */ T, js.Function1[/* value */ T, T]] = js.native
  def clamp[T](min: T, max: T): js.Function1[/* value */ T, T] = js.native
  /**
    * Restricts a number to be within a range.
    * Also works for other ordered types such as Strings and Date
    */
  def clamp[T](min: T, max: T, value: T): T = js.native
  @JSName("clamp")
  def clamp_TFunction2[T](min: T): js.Function2[/* max */ T, /* value */ T, T] = js.native
  /**
    * Creates a deep copy of the value which may contain (nested) Arrays and Objects, Numbers, Strings, Booleans and Dates.
    */
  def clone[T](value: T): T = js.native
  def clone[T](value: js.Array[T]): js.Array[T] = js.native
  /**
    * Makes a comparator function out of a function that reports whether the first element is less than the second.
    */
  // comparator(pred: (a: any, b: any) => boolean): (x: number, y: number) => number;
  def comparator[T](pred: js.Function2[/* a */ T, /* b */ T, scala.Boolean]): js.Function2[/* x */ T, /* y */ T, scala.Double] = js.native
  /**
    * Takes a function f and returns a function g such that:
    * - applying g to zero or more arguments will give true if applying the same arguments to f gives
    *   a logical false value; and
    * - applying g to zero or more arguments will give false if applying the same arguments to f gives
    *   a logical true value.
    */
  def complement(pred: js.Function1[/* repeated */ js.Any, scala.Boolean]): js.Function1[/* repeated */ js.Any, scala.Boolean] = js.native
  /**
    * Performs right-to-left function composition. The rightmost function may have any arity; the remaining
    * functions must be unary.
    */
  // generic rest parameters in TS 3.0 allows writing a single variant for any number of Vx
  // compose<V extends any[], T1>(fn0: (...args: V) => T1): (...args: V) => T1;
  // compose<V extends any[], T1, T2>(fn1: (x: T1) => T2, fn0: (...args: V) => T1): (...args: V) => T2;
  // but requiring TS>=3.0 sounds like a breaking change, so just leaving a comment for the future
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
  /**
    * Returns the right-to-left Kleisli composition of the provided functions, each of which must return a value of a type supported by chain.
    * The typings only support arrays for now.
    * All functions must be unary.
    * R.composeK(h, g, f) is equivalent to R.compose(R.chain(h), R.chain(g), f).
    *
    * @deprecated since 0.26 in favor of composeWith(chain)
    */
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
  /**
    * Performs right-to-left composition of one or more Promise-returning functions.
    * All functions must be unary.
    *
    * @deprecated since 0.26 in favor of composeWith(then)
    */
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
  /**
    * Performs right-to-left function composition using transforming function.
    * With the current typings, all functions must be unary.
    */
  def composeWith[V0, T](composer: js.Function1[/* a */ js.Any, _], fns: ComposeWithFns[V0, T]): js.Function1[/* x0 */ V0, T] = js.native
  def concat(list1: java.lang.String): js.Function1[/* list2 */ java.lang.String, java.lang.String] = js.native
  def concat(list1: java.lang.String, list2: java.lang.String): java.lang.String = js.native
  def concat[T](list1: js.Array[T]): js.Function1[/* list2 */ js.Array[T], js.Array[T]] = js.native
  def concat[T](list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  /**
    * Returns a new list consisting of the elements of the first list followed by the elements
    * of the second.
    */
  def concat[T](placeholder: Placeholder): js.Function2[/* list2 */ js.Array[T], /* list1 */ js.Array[T], js.Array[T]] = js.native
  def concat[T](placeholder: Placeholder, list2: js.Array[T]): js.Function1[/* list1 */ js.Array[T], js.Array[T]] = js.native
  /**
    * Returns a function, fn, which encapsulates if/else-if/else logic. R.cond takes a list of [predicate, transform] pairs.
    * All of the arguments to fn are applied to each of the predicates in turn until one returns a "truthy" value, at which
    * point fn returns the result of applying its arguments to the corresponding transformer. If none of the predicates
    * matches, fn returns undefined.
    */
  def cond(fns: js.Array[js.Tuple2[Pred, js.Function1[/* repeated */ _, _]]]): js.Function1[/* repeated */ js.Any, _] = js.native
  @JSName("cond")
  def cond_AB[A, B](fns: js.Array[js.Tuple2[SafePred[A], js.Function1[/* repeated */ A, B]]]): js.Function1[/* repeated */ A, B] = js.native
  /**
    * Wraps a constructor function inside a curried function that can be called with the same arguments and returns the same type.
    */
  def construct(fn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  /**
    * Wraps a constructor function inside a curried function that can be called with the same arguments and returns the same type.
    * The arity of the function returned is specified to allow using variadic constructor functions.
    */
  def constructN(n: scala.Double, fn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def contains(__ : Placeholder): js.Function2[/* list */ java.lang.String, /* a */ java.lang.String, scala.Boolean] = js.native
  /**
    * Returns `true` if the specified item is somewhere in the list, `false` otherwise.
    * Equivalent to `indexOf(a)(list) > -1`. Uses strict (`===`) equality checking.
    *
    * @deprecated since 0.26 in favor of includes
    */
  def contains(__ : Placeholder, list: java.lang.String): js.Function1[/* a */ java.lang.String, scala.Boolean] = js.native
  def contains(a: java.lang.String): js.Function1[/* list */ java.lang.String, scala.Boolean] = js.native
  def contains(a: java.lang.String, list: java.lang.String): scala.Boolean = js.native
  def contains[T](__ : Placeholder, list: js.Array[T]): js.Function1[/* a */ T, scala.Boolean] = js.native
  def contains[T](a: T): js.Function1[/* list */ js.Array[T], scala.Boolean] = js.native
  def contains[T](a: T, list: js.Array[T]): scala.Boolean = js.native
  @JSName("contains")
  def contains_T[T](__ : Placeholder): js.Function2[/* list */ js.Array[T], /* a */ T, scala.Boolean] = js.native
  /**
    * Accepts a converging function and a list of branching functions and returns a new
    * function. When invoked, this new function is applied to some arguments, each branching
    * function is applied to those same arguments. The results of each branching function
    * are passed as arguments to the converging function to produce the return value.
    */
  def converge(after: js.Function1[/* repeated */ js.Any, _], fns: js.Array[js.Function1[/* repeated */ _, _]]): js.Function1[/* repeated */ js.Any, _] = js.native
  def countBy[T](fn: js.Function1[/* a */ T, java.lang.String | scala.Double]): js.Function1[/* list */ js.Array[T], org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.native
  /**
    * Counts the elements of a list according to how many match each value
    * of a key generated by the supplied function. Returns an object
    * mapping the keys produced by `fn` to the number of occurrences in
    * the list. Note that all keys are coerced to strings because of how
    * JavaScript objects work.
    */
  def countBy[T](fn: js.Function1[/* a */ T, java.lang.String | scala.Double], list: js.Array[T]): org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  /**
    * Returns a curried equivalent of the provided function. The curried function has two unusual capabilities.
    * First, its arguments needn't be provided one at a time.
    */
  def curry[F /* <: js.Function1[/* args */ js.Any, _] */](f: F): ramdaLib.CurryNs.Curry[F] = js.native
  /**
    * Returns a curried equivalent of the provided function, with the specified arity. The curried function has
    * two unusual capabilities. First, its arguments needn't be provided one at a time.
    */
  def curryN(length: scala.Double, fn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  /**
    * Decrements its argument.
    */
  def dec(n: scala.Double): scala.Double = js.native
  def defaultTo[T](a: T): js.Function1[/* b */ js.UndefOr[js.Any | scala.Null], T | _] = js.native
  /**
    * Returns the second argument if it is not null or undefined. If it is null or undefined, the
    * first (default) argument is returned.
    */
  def defaultTo[T, U](a: T, b: U): T | U = js.native
  @JSName("defaultTo")
  def `defaultTo_TU<union>`[T, U](a: T): T | U = js.native
  def descend[T](fn: js.Function1[/* obj */ T, _]): js.Function2[/* a */ T, /* b */ T, scala.Double] = js.native
  /**
    * Makes a descending comparator function out of a function that returns a value that can be compared with < and >.
    */
  def descend[T](fn: js.Function1[/* obj */ T, _], a: T, b: T): scala.Double = js.native
  def difference[T](list1: js.Array[T]): js.Function1[/* list2 */ js.Array[T], js.Array[T]] = js.native
  /**
    * Finds the set (i.e. no duplicates) of all elements in the first list not contained in the second list.
    */
  def difference[T](list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  def differenceWith[T1, T2](pred: js.Function2[/* a */ T1, /* b */ T2, scala.Boolean]): js.Function2[/* list1 */ js.Array[T1], /* list2 */ js.Array[T2], js.Array[T1]] = js.native
  def differenceWith[T1, T2](pred: js.Function2[/* a */ T1, /* b */ T2, scala.Boolean], list1: js.Array[T1]): js.Function1[/* list2 */ js.Array[T2], js.Array[T1]] = js.native
  /**
    * Finds the set (i.e. no duplicates) of all elements in the first list not contained in the second list.
    * Duplication is determined according to the value returned by applying the supplied predicate to two list
    * elements.
    */
  def differenceWith[T1, T2](
    pred: js.Function2[/* a */ T1, /* b */ T2, scala.Boolean],
    list1: js.Array[T1],
    list2: js.Array[T2]
  ): js.Array[T1] = js.native
  def dissoc(prop: java.lang.String): js.Function1[/* obj */ js.Any, _] = js.native
  /*
    * Returns a new object that does not contain a prop property.
    */
  // It seems impossible to infer the return type, so this may to be specified explicitely
  def dissoc[T](prop: java.lang.String, obj: js.Any): T = js.native
  def dissocPath[T](path: Path): js.Function1[/* obj */ js.Any, T] = js.native
  /**
    * Makes a shallow clone of an object, omitting the property at the given path.
    */
  def dissocPath[T](path: Path, obj: js.Any): T = js.native
  def divide(__ : Placeholder): js.Function2[/* b */ scala.Double, /* a */ scala.Double, scala.Double] = js.native
  /**
    * Divides two numbers. Equivalent to a / b.
    */
  def divide(__ : Placeholder, b: scala.Double): js.Function1[/* a */ scala.Double, scala.Double] = js.native
  def divide(a: scala.Double): js.Function1[/* b */ scala.Double, scala.Double] = js.native
  def divide(a: scala.Double, b: scala.Double): scala.Double = js.native
  def drop(n: scala.Double, xs: java.lang.String): java.lang.String = js.native
  def drop[T](n: scala.Double): ramdaLib.Fn_Xs[T] = js.native
  /**
    * Returns a new list containing all but the first n elements of the given list.
    */
  def drop[T](n: scala.Double, xs: js.Array[T]): js.Array[T] = js.native
  def dropLast(n: scala.Double, xs: java.lang.String): java.lang.String = js.native
  def dropLast[T](n: scala.Double): ramdaLib.Fn_XsArray[T] = js.native
  /**
    * Returns a list containing all but the last n elements of the given list.
    */
  def dropLast[T](n: scala.Double, xs: js.Array[T]): js.Array[T] = js.native
  def dropLastWhile[T](fn: js.Function1[/* a */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Returns a new list containing all but last then elements of a given list, passing each value from the
    * right to the supplied predicate function, skipping elements while the predicate function returns true.
    */
  def dropLastWhile[T](fn: js.Function1[/* a */ T, scala.Boolean], list: js.Array[T]): js.Array[T] = js.native
  /**
    * Returns a new list without any consecutively repeating elements. R.equals is used to determine equality.
    */
  def dropRepeats[T](list: js.Array[T]): js.Array[T] = js.native
  def dropRepeatsWith[T](predicate: js.Function2[/* left */ T, /* right */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Returns a new list without any consecutively repeating elements.
    * Equality is determined by applying the supplied predicate to each pair of consecutive elements.
    * The first element in a series of equal elements will be preserved.
    */
  def dropRepeatsWith[T](predicate: js.Function2[/* left */ T, /* right */ T, scala.Boolean], list: js.Array[T]): js.Array[T] = js.native
  def dropWhile[T](fn: js.Function1[/* a */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Returns a new list containing the last n elements of a given list, passing each value to the supplied
    * predicate function, skipping elements while the predicate function returns true.
    */
  def dropWhile[T](fn: js.Function1[/* a */ T, scala.Boolean], list: js.Array[T]): js.Array[T] = js.native
  def either(pred1: Pred): js.Function1[/* pred2 */ Pred, Pred] = js.native
  /**
    * A function wrapping calls to the two functions in an || operation, returning the result of the first
    * function if it is truth-y and the result of the second function otherwise. Note that this is
    * short-circuited, meaning that the second function will not be invoked if the first returns a truth-y value.
    */
  def either(pred1: Pred, pred2: Pred): Pred = js.native
  /**
    * Returns the empty value of its argument's type. Ramda defines the empty value of Array ([]), Object ({}),
    * String (''), and Arguments. Other types are supported if they define <Type>.empty and/or <Type>.prototype.empty.
    * Dispatches to the empty method of the first argument, if present.
    */
  def empty[T](x: T): T = js.native
  def endsWith(a: java.lang.String): js.Function1[/* list */ java.lang.String, scala.Boolean] = js.native
  /**
    * Checks if a list ends with the provided values
    */
  def endsWith(a: java.lang.String, list: java.lang.String): scala.Boolean = js.native
  def endsWith[T](a: T): js.Function1[/* list */ js.Array[T], scala.Boolean] = js.native
  def endsWith[T](a: T, list: js.Array[T]): scala.Boolean = js.native
  def endsWith[T](a: js.Array[T]): js.Function1[/* list */ js.Array[T], scala.Boolean] = js.native
  def endsWith[T](a: js.Array[T], list: js.Array[T]): scala.Boolean = js.native
  def eqBy[T, U](fn: js.Function1[/* a */ T, U]): ramdaLib.CurryNs.Curry[js.Function2[/* a */ T, /* b */ T, scala.Boolean]] = js.native
  def eqBy[T, U](fn: js.Function1[/* a */ T, U], a: T): js.Function1[/* b */ T, scala.Boolean] = js.native
  /**
    * Takes a function and two values in its domain and returns true if the values map to the same value in the
    * codomain; false otherwise.
    */
  def eqBy[T, U](fn: js.Function1[/* a */ T, U], a: T, b: T): scala.Boolean = js.native
  def eqProps[P /* <: java.lang.String */](prop: P): js.Function2[/* obj1 */ stdLib.Record[P, _], /* obj2 */ stdLib.Record[P, _], scala.Boolean] = js.native
  def eqProps[T](prop: java.lang.String, obj1: T): js.Function1[/* obj2 */ js.Any, scala.Boolean] = js.native
  /**
    * Reports whether two functions have the same value for the specified property.
    */
  def eqProps[T, U](prop: java.lang.String, obj1: T, obj2: U): scala.Boolean = js.native
  /**
    * Returns true if its arguments are equivalent, false otherwise. Dispatches to an equals method if present.
    * Handles cyclical data structures.
    */
  def equals[T](a: T, b: T): scala.Boolean = js.native
  def evolve[E /* <: Evolver */](transformations: E): js.Function1[/* obj */ Evolvable[E], Evolve[Evolvable[E], E]] = js.native
  /**
    * Creates a new object by evolving a shallow copy of object, according to the transformation functions.
    */
  def evolve[E /* <: Evolver */, V /* <: Evolvable[E] */](transformations: E, obj: V): Evolve[V, E] = js.native
  /**
    * Returns a new list containing only those items that match a given predicate function. The predicate function is passed one argument: (value).
    */
  def filter[T](fn: js.Function1[/* value */ T, scala.Boolean]): FilterOnceApplied[T] = js.native
  /**
    * Returns a new list containing only those items that match a given predicate function. The predicate function is passed one argument: (value).
    */
  def filter[T](fn: js.Function1[/* value */ T, scala.Boolean], list: js.Array[T]): js.Array[T] = js.native
  /**
    * Returns a new list containing only those items that match a given predicate function. The predicate function is passed one argument: (value).
    */
  def filter[T](fn: js.Function1[/* value */ T, scala.Boolean], obj: Dictionary[T]): Dictionary[T] = js.native
  /**
    * Returns a new list containing only those items that match a given predicate function. The predicate function is passed one argument: (value).
    */
  @JSName("filter")
  def filter_TKindarrayFunction1[T, Kind /* <: ramdaLib.ramdaLibStrings.array */](fn: js.Function1[/* value */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Returns a new list containing only those items that match a given predicate function. The predicate function is passed one argument: (value).
    */
  @JSName("filter")
  def filter_TKindobjectFunction1[T, Kind /* <: ramdaLib.ramdaLibStrings.`object` */](fn: js.Function1[/* value */ T, scala.Boolean]): js.Function1[/* list */ Dictionary[T], Dictionary[T]] = js.native
  def find[T](fn: js.Function1[/* a */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], js.UndefOr[T]] = js.native
  /**
    * Returns the first element of the list which matches the predicate, or `undefined` if no
    * element matches.
    */
  def find[T](fn: js.Function1[/* a */ T, scala.Boolean], list: js.Array[T]): js.UndefOr[T] = js.native
  def findIndex[T](fn: js.Function1[/* a */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], scala.Double] = js.native
  /**
    * Returns the index of the first element of the list which matches the predicate, or `-1`
    * if no element matches.
    */
  def findIndex[T](fn: js.Function1[/* a */ T, scala.Boolean], list: js.Array[T]): scala.Double = js.native
  def findLast[T](fn: js.Function1[/* a */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], js.UndefOr[T]] = js.native
  /**
    * Returns the last element of the list which matches the predicate, or `undefined` if no
    * element matches.
    */
  def findLast[T](fn: js.Function1[/* a */ T, scala.Boolean], list: js.Array[T]): js.UndefOr[T] = js.native
  def findLastIndex[T](fn: js.Function1[/* a */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], scala.Double] = js.native
  /**
    * Returns the index of the last element of the list which matches the predicate, or
    * `-1` if no element matches.
    */
  def findLastIndex[T](fn: js.Function1[/* a */ T, scala.Boolean], list: js.Array[T]): scala.Double = js.native
  /**
    * Returns a new list by pulling every item out of it (and all its sub-arrays) and putting
    * them in a new array, depth-first.
    */
  def flatten[T](x: js.Array[js.Array[T] | T]): js.Array[T] = js.native
  /**
    * Returns a new function much like the supplied one, except that the first two arguments'
    * order is reversed.
    */
  def flip[T, U, TResult](fn: js.Function2[/* arg0 */ T, /* arg1 */ U, TResult]): js.Function2[/* arg1 */ U, /* arg0 */ js.UndefOr[T], TResult] = js.native
  def flip[T, U, TResult](fn: js.Function3[/* arg0 */ T, /* arg1 */ U, /* repeated */ js.Any, TResult]): js.Function3[/* arg1 */ U, /* arg0 */ js.UndefOr[T], /* repeated */ js.Any, TResult] = js.native
  def forEach[T](fn: js.Function1[/* x */ T, scala.Unit]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Iterate over an input list, calling a provided function fn for each element in the list.
    */
  def forEach[T](fn: js.Function1[/* x */ T, scala.Unit], list: js.Array[T]): js.Array[T] = js.native
  def forEachObjIndexed[T](
    fn: js.Function3[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      /* key */ java.lang.String, 
      /* obj */ T, 
      scala.Unit
    ]
  ): js.Function1[/* obj */ T, T] = js.native
  /**
    * Iterate over an input object, calling a provided function fn for each key and value in the object.
    */
  def forEachObjIndexed[T](
    fn: js.Function3[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      /* key */ java.lang.String, 
      /* obj */ T, 
      scala.Unit
    ],
    obj: T
  ): T = js.native
  /**
    * Creates a new object out of a list key-value pairs.
    */
  def fromPairs[V](pairs: js.Array[KeyValuePair[java.lang.String, V]]): org.scalablytyped.runtime.StringDictionary[V] = js.native
  @JSName("fromPairs")
  def fromPairs_VNumberDictionary[V](pairs: js.Array[KeyValuePair[scala.Double, V]]): org.scalablytyped.runtime.NumberDictionary[V] = js.native
  def groupBy[T](fn: js.Function1[/* a */ T, java.lang.String]): js.Function1[/* list */ js.Array[T], org.scalablytyped.runtime.StringDictionary[js.Array[T]]] = js.native
  /**
    * Splits a list into sublists stored in an object, based on the result of
    * calling a String-returning function
    * on each element, and grouping the results according to values returned.
    */
  def groupBy[T](fn: js.Function1[/* a */ T, java.lang.String], list: js.Array[T]): org.scalablytyped.runtime.StringDictionary[js.Array[T]] = js.native
  /**
    * Takes a list and returns a list of lists where each sublist's elements are all "equal" according to the provided equality function
    */
  def groupWith[T](fn: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], js.Array[js.Array[T]]] = js.native
  def groupWith[T](fn: js.Function2[/* x */ T, /* y */ T, scala.Boolean], list: java.lang.String): js.Array[java.lang.String] = js.native
  def groupWith[T](fn: js.Function2[/* x */ T, /* y */ T, scala.Boolean], list: js.Array[T]): js.Array[js.Array[T]] = js.native
  def gt(__ : Placeholder): js.Function2[/* b */ scala.Double, /* a */ scala.Double, scala.Boolean] = js.native
  /**
    * Returns true if the first parameter is greater than the second.
    */
  def gt(__ : Placeholder, b: scala.Double): js.Function1[/* a */ scala.Double, scala.Boolean] = js.native
  def gt(a: scala.Double): js.Function1[/* b */ scala.Double, scala.Boolean] = js.native
  def gt(a: scala.Double, b: scala.Double): scala.Boolean = js.native
  def gte(__ : Placeholder): js.Function2[/* b */ scala.Double, /* a */ scala.Double, scala.Boolean] = js.native
  /**
    * Returns true if the first parameter is greater than or equal to the second.
    */
  def gte(__ : Placeholder, b: scala.Double): js.Function1[/* a */ scala.Double, scala.Boolean] = js.native
  def gte(a: scala.Double): js.Function1[/* b */ scala.Double, scala.Boolean] = js.native
  def gte(a: scala.Double, b: scala.Double): scala.Boolean = js.native
  def has(s: java.lang.String): js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  def has[T](__ : Placeholder): js.Function2[/* obj */ T, /* s */ java.lang.String, scala.Boolean] = js.native
  /**
    * Returns whether or not an object has an own property with the specified name.
    */
  def has[T](__ : Placeholder, obj: T): js.Function1[/* s */ java.lang.String, scala.Boolean] = js.native
  def has[T](s: java.lang.String, obj: T): scala.Boolean = js.native
  def hasIn(s: java.lang.String): js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  /**
    * Returns whether or not an object or its prototype chain has a property with the specified name
    */
  def hasIn[T](s: java.lang.String, obj: T): scala.Boolean = js.native
  def hasPath(list: js.Array[java.lang.String]): js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  /**
    * Returns whether or not a path exists in an object. Only the object's own properties are checked.
    */
  def hasPath[T](list: js.Array[java.lang.String], obj: T): scala.Boolean = js.native
  def head(list: java.lang.String): java.lang.String = js.native
  /**
    * Returns the first element in a list.
    * In some libraries this function is named `first`.
    */
  def head[T](list: js.Array[T]): js.UndefOr[T] = js.native
  def identical[T](a: T): js.Function1[/* b */ T, scala.Boolean] = js.native
  /**
    * Returns true if its arguments are identical, false otherwise. Values are identical if they reference the
    * same memory. NaN is identical to NaN; 0 and -0 are not identical.
    */
  def identical[T](a: T, b: T): scala.Boolean = js.native
  /**
    * A function that does nothing but return the parameter supplied to it. Good as a default
    * or placeholder function.
    */
  def identity[T](a: T): T = js.native
  /**
    * Creates a function that will process either the onTrue or the onFalse function depending upon the result
    * of the condition predicate.
    */
  def ifElse(fn: Pred, onTrue: Arity1Fn, onFalse: Arity1Fn): Arity1Fn = js.native
  def ifElse(fn: Pred, onTrue: Arity2Fn, onFalse: Arity2Fn): Arity2Fn = js.native
  /**
    * Increments its argument.
    */
  def inc(n: scala.Double): scala.Double = js.native
  def includes(s: java.lang.String): js.Function1[/* list */ js.Array[java.lang.String] | java.lang.String, scala.Boolean] = js.native
  def includes(s: java.lang.String, list: java.lang.String): scala.Boolean = js.native
  /**
    * Given a target, this function checks a list for the target and returns a boolean.
    * Given a string, this function checks for the string in another string or list and returns
    * a boolean.
    */
  def includes(s: java.lang.String, list: js.Array[java.lang.String]): scala.Boolean = js.native
  def includes[T](target: T): js.Function1[/* list */ js.Array[T], scala.Boolean] = js.native
  def includes[T](target: T, list: js.Array[T]): scala.Boolean = js.native
  def indexBy[T](fn: js.Function1[/* a */ T, java.lang.String]): js.Function1[/* list */ js.Array[T], org.scalablytyped.runtime.StringDictionary[T]] = js.native
  /**
    * Given a function that generates a key, turns a list of objects into an object indexing the objects
    * by the given key.
    */
  def indexBy[T](fn: js.Function1[/* a */ T, java.lang.String], list: js.Array[T]): org.scalablytyped.runtime.StringDictionary[T] = js.native
  def indexOf[T](target: T): js.Function1[/* list */ js.Array[T], scala.Double] = js.native
  /**
    * Returns the position of the first occurrence of an item in an array
    * (by strict equality),
    * or -1 if the item is not included in the array.
    */
  def indexOf[T](target: T, list: js.Array[T]): scala.Double = js.native
  def init(list: java.lang.String): java.lang.String = js.native
  /**
    * Returns all but the last element of a list or string.
    */
  def init[T](list: js.Array[T]): js.Array[T] = js.native
  def innerJoin[T1, T2](pred: js.Function2[/* a */ T1, /* b */ T2, scala.Boolean]): js.Function2[/* list1 */ js.Array[T1], /* list2 */ js.Array[T2], js.Array[T1]] = js.native
  def innerJoin[T1, T2](pred: js.Function2[/* a */ T1, /* b */ T2, scala.Boolean], list1: js.Array[T1]): js.Function1[/* list2 */ js.Array[T2], js.Array[T1]] = js.native
  /**
    * Takes a predicate `pred`, a list `xs`, and a list `ys`, and returns a list
    * `xs'` comprising each of the elements of `xs` which is equal to one or more
    * elements of `ys` according to `pred`.
    *
    * `pred` must be a binary function expecting an element from each list.
    *
    * `xs`, `ys`, and `xs'` are treated as sets, semantically, so ordering should
    * not be significant, but since `xs'` is ordered the implementation guarantees
    * that its values are in the same order as they appear in `xs`. Duplicates are
    * not removed, so `xs'` may contain duplicates if `xs` contains duplicates.
    */
  def innerJoin[T1, T2](
    pred: js.Function2[/* a */ T1, /* b */ T2, scala.Boolean],
    list1: js.Array[T1],
    list2: js.Array[T2]
  ): js.Array[T1] = js.native
  def insert(index: scala.Double): js.Function2[/* elt */ js.Any, /* list */ js.Array[_], js.Array[_]] = js.native
  def insert[T](index: scala.Double, elt: T): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Inserts the supplied element into the list, at index index. Note that
    * this is not destructive: it returns a copy of the list with the changes.
    */
  def insert[T](index: scala.Double, elt: T, list: js.Array[T]): js.Array[T] = js.native
  def insertAll(index: scala.Double): js.Function2[/* elts */ js.Array[_], /* list */ js.Array[_], js.Array[_]] = js.native
  def insertAll[T](index: scala.Double, elts: js.Array[T]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Inserts the sub-list into the list, at index `index`.  _Note  that this
    * is not destructive_: it returns a copy of the list with the changes.
    */
  def insertAll[T](index: scala.Double, elts: js.Array[T], list: js.Array[T]): js.Array[T] = js.native
  def intersection[T](list1: js.Array[T]): js.Function1[/* list2 */ js.Array[T], js.Array[T]] = js.native
  /**
    * Combines two lists into a set (i.e. no duplicates) composed of those elements common to both lists.
    */
  def intersection[T](list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  /**
    * Combines two lists into a set (i.e. no duplicates) composed of those
    * elements common to both lists.  Duplication is determined according
    * to the value returned by applying the supplied predicate to two list
    * elements.
    */
  def intersectionWith[T](pred: js.Function2[/* a */ T, /* b */ T, scala.Boolean], list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  def intersperse[T](separator: T): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Creates a new list with the separator interposed between elements.
    */
  def intersperse[T](separator: T, list: js.Array[T]): js.Array[T] = js.native
  def into(acc: js.Any): js.Function2[/* xf */ js.Function1[/* repeated */ js.Any, _], /* list */ js.Array[_], js.Array[_]] = js.native
  def into(acc: js.Any, xf: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  /**
    * Transforms the items of the list with the transducer and appends the transformed items to the accumulator
    * using an appropriate iterator function based on the accumulator type.
    */
  def into[T](acc: js.Any, xf: js.Function1[/* repeated */ js.Any, _], list: js.Array[T]): js.Array[T] = js.native
  /**
    * Same as R.invertObj, however this accounts for objects with duplicate values by putting the values into an array.
    */
  def invert[T](obj: T): org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  def invertObj(obj: org.scalablytyped.runtime.NumberDictionary[java.lang.String]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
    * Returns a new object with the keys of the given object as values, and the values of the given object as keys.
    */
  def invertObj(obj: org.scalablytyped.runtime.StringDictionary[java.lang.String]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
    * Turns a named method with a specified arity into a function that can be called directly
    * supplied with arguments and a target object.
    *
    * The returned function is curried and accepts `arity + 1` parameters where the final
    * parameter is the target object.
    */
  def invoker(arity: scala.Double, method: java.lang.String): js.Function1[/* repeated */ js.Any, _] = js.native
  def is(ctor: js.Any): js.Function1[/* val */ js.Any, scala.Boolean] = js.native
  /**
    * See if an object (`val`) is an instance of the supplied constructor.
    * This function will check up the inheritance chain, if any.
    */
  def is(ctor: js.Any, `val`: js.Any): scala.Boolean = js.native
  /**
    * Tests whether or not an object is similar to an array.
    */
  def isArrayLike(`val`: js.Any): scala.Boolean = js.native
  /**
    * Reports whether the list has zero elements.
    */
  def isEmpty(value: js.Any): scala.Boolean = js.native
  /**
    * Returns true if the input value is NaN.
    */
  def isNaN(x: js.Any): scala.Boolean = js.native
  /**
    * Checks if the input value is null or undefined.
    */
  def isNil(value: js.Any): scala.Boolean = js.native
  def join(x: java.lang.String): js.Function1[/* xs */ js.Array[_], java.lang.String] = js.native
  /**
    * Returns a string made by inserting the `separator` between each
    * element and concatenating all the elements into a single string.
    */
  def join(x: java.lang.String, xs: js.Array[_]): java.lang.String = js.native
  /**
    * Applies a list of functions to a list of values.
    */
  def juxt[T, U](fns: js.Array[js.Function1[/* repeated */ T, U]]): js.Function1[/* repeated */ T, js.Array[U]] = js.native
  def keys[T](x: T): js.Array[java.lang.String] = js.native
  /**
    * Returns a list containing the names of all the
    * properties of the supplied object, including prototype properties.
    */
  def keysIn[T](obj: T): js.Array[java.lang.String] = js.native
  /**
    * Returns a list containing the names of all the enumerable own
    * properties of the supplied object.
    */
  @JSName("keys")
  def keys_TObject[T /* <: js.Object */](x: T): js.Array[java.lang.String] = js.native
  def last(list: java.lang.String): java.lang.String = js.native
  /**
    * Returns the last element from a list.
    */
  def last[T](list: js.Array[T]): js.UndefOr[T] = js.native
  /**
    * Returns the position of the last occurrence of an item (by strict equality) in
    * an array, or -1 if the item is not included in the array.
    */
  def lastIndexOf[T](target: T, list: js.Array[T]): scala.Double = js.native
  /**
    * Returns the number of elements in the array by returning list.length.
    */
  def length[T](list: js.Array[T]): scala.Double = js.native
  /**
    * Returns a lens for the given getter and setter functions. The getter
    * "gets" the value of the focus; the setter "sets" the value of the focus.
    * The setter should not mutate the data structure.
    */
  def lens[T, U, V](getter: js.Function1[/* s */ T, U], setter: js.Function2[/* a */ U, /* s */ T, V]): Lens = js.native
  /**
    * Creates a lens that will focus on index n of the source array.
    */
  def lensIndex(n: scala.Double): Lens = js.native
  /**
    * Returns a lens whose focus is the specified path.
    * See also view, set, over.
    */
  def lensPath(path: Path): Lens = js.native
  /**
    * lensProp creates a lens that will focus on property k of the source object.
    */
  def lensProp(str: java.lang.String): ramdaLib.Anon_Obj = js.native
  /**
    * "lifts" a function of arity > 1 so that it may "map over" a list, Function or other object that satisfies
    * the FantasyLand Apply spec.
    */
  def lift(fn: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Any = js.native
  /**
    * "lifts" a function to be the specified arity, so that it may "map over" that many lists, Functions or other
    * objects that satisfy the FantasyLand Apply spec.
    */
  def liftN(n: scala.Double, fn: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Any = js.native
  def lt(__ : Placeholder): js.Function2[/* b */ scala.Double, /* a */ scala.Double, scala.Boolean] = js.native
  /**
    * Returns true if the first parameter is less than the second.
    */
  def lt(__ : Placeholder, b: scala.Double): js.Function1[/* a */ scala.Double, scala.Boolean] = js.native
  def lt(a: scala.Double): js.Function1[/* b */ scala.Double, scala.Boolean] = js.native
  def lt(a: scala.Double, b: scala.Double): scala.Boolean = js.native
  def lte(__ : Placeholder): js.Function2[/* b */ scala.Double, /* a */ scala.Double, scala.Boolean] = js.native
  /**
    * Returns true if the first parameter is less than or equal to the second.
    */
  def lte(__ : Placeholder, b: scala.Double): js.Function1[/* a */ scala.Double, scala.Boolean] = js.native
  def lte(a: scala.Double): js.Function1[/* b */ scala.Double, scala.Boolean] = js.native
  def lte(a: scala.Double, b: scala.Double): scala.Boolean = js.native
   // used in functors
  def map[T, U](
    fn: js.Function1[
      (/* import warning: ImportType.apply Failed type conversion: T[keyof T & keyof U] */ /* x */ js.Any) | (/* x */ T), 
      (/* import warning: ImportType.apply Failed type conversion: U[keyof T & keyof U] */ js.Any) | U
    ]
  ): js.Function1[/* list */ js.Array[T], js.Array[U]] = js.native
  def map[T, U](
    fn: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T & keyof U] */ /* x */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: U[keyof T & keyof U] */ js.Any
    ],
    list: T
  ): U = js.native
  /**
    * Returns a new list, constructed by applying the supplied function to every element of the supplied list.
    */
  def map[T, U](fn: js.Function1[/* x */ T, U], list: js.Array[T]): js.Array[U] = js.native
  def map[T, U](fn: js.Function1[/* x */ T, U], obj: Functor[T]): Functor[U] = js.native
  def mapAccum[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]]): js.Function2[/* acc */ U, /* list */ js.Array[T], js.Tuple2[U, js.Array[TResult]]] = js.native
  def mapAccum[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]], acc: U): js.Function1[/* list */ js.Array[T], js.Tuple2[U, js.Array[TResult]]] = js.native
   // used in functors
  /**
    * The mapAccum function behaves like a combination of map and reduce.
    */
  def mapAccum[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]], acc: U, list: js.Array[T]): js.Tuple2[U, js.Array[TResult]] = js.native
  def mapAccumRight[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]]): js.Function2[/* acc */ U, /* list */ js.Array[T], js.Tuple2[U, js.Array[TResult]]] = js.native
  def mapAccumRight[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]], acc: U): js.Function1[/* list */ js.Array[T], js.Tuple2[U, js.Array[TResult]]] = js.native
  /**
    * The mapAccumRight function behaves like a combination of map and reduce.
    */
  def mapAccumRight[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]], acc: U, list: js.Array[T]): js.Tuple2[U, js.Array[TResult]] = js.native
  def mapObjIndexed[T, TResult](fn: js.Function3[/* value */ T, /* key */ java.lang.String, /* obj */ js.UndefOr[js.Any], TResult]): js.Function1[/* obj */ js.Any, org.scalablytyped.runtime.StringDictionary[TResult]] = js.native
  def mapObjIndexed[T, TResult](
    fn: js.Function3[/* value */ T, /* key */ java.lang.String, /* obj */ js.UndefOr[js.Any], TResult],
    obj: js.Any
  ): org.scalablytyped.runtime.StringDictionary[TResult] = js.native
  /**
    * Like mapObj, but but passes additional arguments to the predicate function.
    */
  def mapObjIndexed[T, TResult](
    fn: js.Function3[
      /* value */ T, 
      /* key */ java.lang.String, 
      /* obj */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[T]], 
      TResult
    ],
    obj: org.scalablytyped.runtime.StringDictionary[T]
  ): org.scalablytyped.runtime.StringDictionary[TResult] = js.native
  def `match`(regexp: stdLib.RegExp): js.Function1[/* str */ java.lang.String, js.Array[_]] = js.native
  /**
    * Tests a regular expression agains a String
    */
  def `match`(regexp: stdLib.RegExp, str: java.lang.String): js.Array[_] = js.native
  def mathMod(__ : Placeholder): js.Function2[/* b */ scala.Double, /* a */ scala.Double, scala.Double] = js.native
  /**
    * mathMod behaves like the modulo operator should mathematically, unlike the `%`
    * operator (and by extension, R.modulo). So while "-17 % 5" is -2,
    * mathMod(-17, 5) is 3. mathMod requires Integer arguments, and returns NaN
    * when the modulus is zero or negative.
    */
  def mathMod(__ : Placeholder, b: scala.Double): js.Function1[/* a */ scala.Double, scala.Double] = js.native
  def mathMod(a: scala.Double): js.Function1[/* b */ scala.Double, scala.Double] = js.native
  def mathMod(a: scala.Double, b: scala.Double): scala.Double = js.native
  def max(a: java.lang.String): js.Function1[/* b */ java.lang.String, java.lang.String] = js.native
  def max(a: java.lang.String, b: java.lang.String): java.lang.String = js.native
  def max(a: scala.Boolean): js.Function1[/* b */ scala.Boolean, scala.Boolean] = js.native
  def max(a: scala.Boolean, b: scala.Boolean): scala.Boolean = js.native
  def max(a: scala.Double): js.Function1[/* b */ scala.Double, scala.Double] = js.native
  /**
    * Returns the larger of its two arguments.
    */
  def max(a: scala.Double, b: scala.Double): scala.Double = js.native
  def max(a: stdLib.Date): js.Function1[/* b */ stdLib.Date, stdLib.Date] = js.native
  def max(a: stdLib.Date, b: stdLib.Date): stdLib.Date = js.native
  def maxBy[T](keyFn: js.Function1[/* a */ T, Ord]): ramdaLib.CurryNs.Curry[js.Function2[/* a */ T, /* b */ T, T]] = js.native
  def maxBy[T](keyFn: js.Function1[/* a */ T, Ord], a: T): js.Function1[/* b */ T, T] = js.native
  /**
    * Takes a function and two values, and returns whichever value produces
    * the larger result when passed to the provided function.
    */
  def maxBy[T](keyFn: js.Function1[/* a */ T, Ord], a: T, b: T): T = js.native
  /**
    * Returns the mean of the given list of numbers.
    */
  def mean(list: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Returns the median of the given list of numbers.
    */
  def median(list: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Creates a new function that, when invoked, caches the result of calling fn for a given argument set and returns the result.
    * Subsequent calls to the memoized fn with the same argument set will not result in an additional call to fn; instead, the cached result for that set of arguments will be returned.
    */
  def memoizeWith[T /* <: js.Function1[/* repeated */ js.Any, _] */](keyFn: js.Function1[/* v */ stdLib.Parameters[T], java.lang.String], fn: T): T = js.native
  def merge(__ : Placeholder): js.Function2[/* b */ js.Any, /* a */ js.Any, Merge[_, _]] = js.native
  /**
    * Create a new object with the own properties of a
    * merged with the own properties of object b.
    * This function will *not* mutate passed-in objects.
    *
    * @deprecated since 0.26 in favor of mergeRight
    */
  def merge[T2](__ : Placeholder, b: T2): js.Function1[/* a */ js.Any, Merge[T2, _]] = js.native
  def merge[T1](a: T1): js.Function1[/* b */ js.Any, Merge[_, T1]] = js.native
  def merge[T1, T2](a: T1, b: T2): Merge[T2, T1] = js.native
  def mergeAll(list: js.Array[_]): js.Any = js.native
  /**
    * Merges a list of objects together into one object.
    */
  @JSName("mergeAll")
  def mergeAll_TT[T](list: js.Array[T]): T = js.native
  def mergeDeepLeft[T1](a: T1): js.Function1[/* b */ js.Any, MergeDeep[T1, _]] = js.native
  /**
    * Creates a new object with the own properties of the first object merged with the own properties of the second object.
    * If a key exists in both objects:
    * and both values are objects, the two values will be recursively merged
    * otherwise the value from the first object will be used.
    */
  def mergeDeepLeft[T1, T2](a: T1, b: T2): MergeDeep[T1, T2] = js.native
  def mergeDeepRight[A](a: A): js.Function1[/* b */ js.Any, MergeDeep[_, A]] = js.native
  /**
    * Creates a new object with the own properties of the first object merged with the own properties of the second object.
    * If a key exists in both objects:
    * and both values are objects, the two values will be recursively merged
    * otherwise the value from the second object will be used.
    */
  def mergeDeepRight[A, B](a: A, b: B): MergeDeep[B, A] = js.native
  def mergeDeepWith[T1, T2](fn: js.Function2[/* x */ js.Any, /* z */ js.Any, _]): js.Function2[/* a */ T1, /* b */ T2, _] = js.native
  def mergeDeepWith[T1, T2](fn: js.Function2[/* x */ js.Any, /* z */ js.Any, _], a: T1): js.Function1[/* b */ T2, _] = js.native
  /**
    * Creates a new object with the own properties of the two provided objects. If a key exists in both objects:
    * and both associated values are also objects then the values will be recursively merged.
    * otherwise the provided function is applied to associated values using the resulting value as the new value
    * associated with the key. If a key only exists in one object, the value will be associated with the key of the resulting object.
    */
  def mergeDeepWith[T1, T2](fn: js.Function2[/* x */ js.Any, /* z */ js.Any, _], a: T1, b: T2): js.Any = js.native
  def mergeDeepWithKey[T1, T2](fn: js.Function3[/* k */ java.lang.String, /* x */ js.Any, /* z */ js.Any, _]): js.Function2[/* a */ T1, /* b */ T2, _] = js.native
  def mergeDeepWithKey[T1, T2](fn: js.Function3[/* k */ java.lang.String, /* x */ js.Any, /* z */ js.Any, _], a: T1): js.Function1[/* b */ T2, _] = js.native
  /**
    * Creates a new object with the own properties of the two provided objects. If a key exists in both objects:
    * and both associated values are also objects then the values will be recursively merged.
    * otherwise the provided function is applied to the key and associated values using the resulting value as
    * the new value associated with the key. If a key only exists in one object, the value will be associated with
    * the key of the resulting object.
    */
  def mergeDeepWithKey[T1, T2](fn: js.Function3[/* k */ java.lang.String, /* x */ js.Any, /* z */ js.Any, _], a: T1, b: T2): js.Any = js.native
  def mergeLeft[T1](a: T1): js.Function1[/* b */ js.Any, Merge[T1, _]] = js.native
  /**
    * Create a new object with the own properties of the first object merged with the own properties of the second object.
    * If a key exists in both objects, the value from the first object will be used.
    */
  def mergeLeft[T1, T2](a: T1, b: T2): Merge[T1, T2] = js.native
  def mergeRight[T1](a: T1): js.Function1[/* b */ js.Any, Merge[_, T1]] = js.native
  /**
    * Create a new object with the own properties of the first object merged with the own properties of the second object.
    * If a key exists in both objects, the value from the second object will be used.
    */
  def mergeRight[T1, T2](a: T1, b: T2): Merge[T2, T1] = js.native
  def mergeWith(fn: js.Function2[/* x */ js.Any, /* z */ js.Any, _]): js.Function2[/* a */ js.Any, /* b */ js.Any, _] = js.native
  def mergeWith[U](fn: js.Function2[/* x */ js.Any, /* z */ js.Any, _], a: U): js.Function1[/* b */ js.Any, _] = js.native
  /**
    * Creates a new object with the own properties of the two provided objects. If a key exists in both objects,
    * the provided function is applied to the values associated with the key in each object, with the result being used as
    * the value associated with the key in the returned object. The key will be excluded from the returned object if the
    * resulting value is undefined.
    */
  def mergeWith[U, V](fn: js.Function2[/* x */ js.Any, /* z */ js.Any, _], a: U, b: V): js.Any = js.native
  def mergeWithKey(fn: js.Function3[/* str */ java.lang.String, /* x */ js.Any, /* z */ js.Any, _]): js.Function2[/* a */ js.Any, /* b */ js.Any, _] = js.native
  def mergeWithKey[U](fn: js.Function3[/* str */ java.lang.String, /* x */ js.Any, /* z */ js.Any, _], a: U): js.Function1[/* b */ js.Any, _] = js.native
  /**
    * Creates a new object with the own properties of the two provided objects. If a key exists in both objects,
    * the provided function is applied to the key and the values associated with the key in each object, with the
    * result being used as the value associated with the key in the returned object. The key will be excluded from
    * the returned object if the resulting value is undefined.
    */
  def mergeWithKey[U, V](fn: js.Function3[/* str */ java.lang.String, /* x */ js.Any, /* z */ js.Any, _], a: U, b: V): js.Any = js.native
  def min(a: java.lang.String): js.Function1[/* b */ java.lang.String, java.lang.String] = js.native
  def min(a: java.lang.String, b: java.lang.String): java.lang.String = js.native
  def min(a: scala.Boolean): js.Function1[/* b */ scala.Boolean, scala.Boolean] = js.native
  def min(a: scala.Boolean, b: scala.Boolean): scala.Boolean = js.native
  def min(a: scala.Double): js.Function1[/* b */ scala.Double, scala.Double] = js.native
  /**
    * Returns the smaller of its two arguments.
    */
  def min(a: scala.Double, b: scala.Double): scala.Double = js.native
  def min(a: stdLib.Date): js.Function1[/* b */ stdLib.Date, stdLib.Date] = js.native
  def min(a: stdLib.Date, b: stdLib.Date): stdLib.Date = js.native
  def minBy[T](keyFn: js.Function1[/* a */ T, Ord]): ramdaLib.CurryNs.Curry[js.Function2[/* a */ T, /* b */ T, T]] = js.native
  def minBy[T](keyFn: js.Function1[/* a */ T, Ord], a: T): js.Function1[/* b */ T, T] = js.native
  /**
    * Takes a function and two values, and returns whichever value produces
    * the smaller result when passed to the provided function.
    */
  def minBy[T](keyFn: js.Function1[/* a */ T, Ord], a: T, b: T): T = js.native
  def modulo(__ : Placeholder): js.Function2[/* b */ scala.Double, /* a */ scala.Double, scala.Double] = js.native
  /**
    * Divides the second parameter by the first and returns the remainder.
    * The flipped version (`moduloBy`) may be more useful curried.
    * Note that this functions preserves the JavaScript-style behavior for
    * modulo. For mathematical modulo see `mathMod`
    */
  def modulo(__ : Placeholder, b: scala.Double): js.Function1[/* a */ scala.Double, scala.Double] = js.native
  def modulo(a: scala.Double): js.Function1[/* b */ scala.Double, scala.Double] = js.native
  def modulo(a: scala.Double, b: scala.Double): scala.Double = js.native
  def move(from: scala.Double): ramdaLib.Fn_List = js.native
  def move(from: scala.Double, to: scala.Double): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  /**
    * Moves an item, at index `from`, to index `to`, in a `list` of elements.
    * A new list will be created containing the new elements order.
    */
  def move[T](from: scala.Double, to: scala.Double, list: js.Array[T]): js.Array[T] = js.native
  def multiply(a: scala.Double): js.Function1[/* b */ scala.Double, scala.Double] = js.native
  /**
    * Multiplies two numbers. Equivalent to a * b but curried.
    */
  def multiply(a: scala.Double, b: scala.Double): scala.Double = js.native
  def nAry(n: scala.Double): js.Function1[/* fn */ js.Function1[/* repeated */ js.Any, _], js.Function1[/* repeated */ _, _]] = js.native
  /**
    * Wraps a function of any arity (including nullary) in a function that accepts exactly n parameters.
    * Any extraneous parameters will not be passed to the supplied function.
    */
  def nAry(n: scala.Double, fn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  /**
    * Negates its argument.
    */
  def negate(n: scala.Double): scala.Double = js.native
  def none[T](fn: js.Function1[/* a */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], scala.Boolean] = js.native
  /**
    * Returns true if no elements of the list match the predicate, false otherwise.
    */
  def none[T](fn: js.Function1[/* a */ T, scala.Boolean], list: js.Array[T]): scala.Boolean = js.native
  /**
    * A function wrapping a call to the given function in a `!` operation.  It will return `true` when the
    * underlying function would return a false-y value, and `false` when it would return a truth-y one.
    */
  def not(value: js.Any): scala.Boolean = js.native
  def nth(n: scala.Double): js.Function1[/* list */ js.Array[_], js.UndefOr[_]] = js.native
  /**
    * Returns the nth element in a list.
    */
  def nth[T](n: scala.Double, list: js.Array[T]): js.UndefOr[T] = js.native
  /**
    * Returns a function which returns its nth argument.
    */
  def nthArg(n: scala.Double): js.Function1[/* repeated */ js.Any, _] = js.native
  def objOf[K /* <: java.lang.String */](key: K): js.Function1[/* value */ js.Any, stdLib.Record[K, _]] = js.native
  /**
    * Creates an object containing a single key:value pair.
    */
  def objOf[T, K /* <: java.lang.String */](key: K, value: T): stdLib.Record[K, T] = js.native
  /**
    * Returns a singleton array containing the value provided.
    */
  def of[T](x: T): js.Array[T] = js.native
  def omit[K /* <: java.lang.String */](names: js.Array[K]): js.Function1[/* obj */ js.Any, Omit[_, K]] = js.native
  /**
    * Returns a partial copy of an object omitting the keys specified.
    */
  def omit[T, K /* <: java.lang.String */](names: js.Array[K], obj: T): Omit[T, K] = js.native
  /**
    * Accepts a function fn and returns a function that guards invocation of fn such that fn can only ever be
    * called once, no matter how many times the returned function is invoked. The first value calculated is
    * returned in subsequent invocations.
    */
  def once(fn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  @JSName("once")
  def once_T[T](fn: js.Function1[/* repeated */ js.Any, T]): js.Function1[/* repeated */ js.Any, T] = js.native
  def or[T /* <: ramdaLib.Anon_AOr */](fn1: T): js.Function1[/* val2 */ js.Any, T | _] = js.native
  /**
    * A function that returns the first truthy of two arguments otherwise the last argument. Note that this is
    * NOT short-circuited, meaning that if expressions are passed they are both evaluated.
    * Dispatches to the or method of the first argument if applicable.
    */
  def or[T, U](a: T, b: U): T | U = js.native
  @JSName("or")
  def or_T[T](a: T): js.Function1[/* b */ js.Any, T | _] = js.native
  @JSName("or")
  def or_TAnon_AOrU[T /* <: ramdaLib.Anon_AOr */, U](fn1: T, val2: U): T | U = js.native
  def otherwise[A, B](onError: js.Function1[/* error */ js.Any, B | js.Promise[B]]): js.Function1[/* promise */ js.Promise[A], js.Promise[B]] = js.native
  /**
    * Returns the result of applying the onFailure function to the value inside a failed promise.
    * This is useful for handling rejected promises inside function compositions.
    */
  def otherwise[A, B](onError: js.Function1[/* error */ js.Any, B | js.Promise[B]], promise: js.Promise[A]): js.Promise[B] = js.native
  def over(lens: Lens): js.Function2[/* fn */ Arity1Fn, /* value */ js.Any, _] = js.native
  def over(lens: Lens, fn: Arity1Fn): js.Function1[/* value */ js.Any, _] = js.native
  /**
    * Returns the result of "setting" the portion of the given data structure
    * focused by the given lens to the given value.
    */
  def over[T](lens: Lens, fn: Arity1Fn, value: T): T = js.native
  def over[T](lens: Lens, fn: Arity1Fn, value: js.Array[T]): js.Array[T] = js.native
  /**
    * Takes two arguments, fst and snd, and returns [fst, snd].
    */
  def pair[F, S](fst: F, snd: S): js.Tuple2[F, S] = js.native
  def partial[T](fn: js.Function1[/* repeated */ js.Any, T], args: js.Array[_]): js.Function1[/* repeated */ js.Any, T] = js.native
  /**
    * Takes a function `f` and a list of arguments, and returns a function `g`.
    * When applied, `g` returns the result of applying `f` to the arguments
    * provided initially followed by the arguments provided to `g`.
    */
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
  /**
    * Takes a function `f` and a list of arguments, and returns a function `g`.
    * When applied, `g` returns the result of applying `f` to the arguments
    * provided to `g` followed by the arguments provided initially.
    */
  def partialRight[V0, V1, T](fn: js.Function2[/* x0 */ V0, /* x1 */ V1, T], args: js.Array[V1]): js.Function1[/* x1 */ V0, T] = js.native
  def partialRight[V0, V1, V2, T](fn: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T], args: js.Array[V2]): js.Function2[/* x1 */ V0, /* x2 */ V1, T] = js.native
  def partialRight[V0, V1, V2, T](fn: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T], args: js.Tuple2[V1, V2]): js.Function1[/* x2 */ V0, T] = js.native
  def partialRight[V0, V1, V2, V3, T](fn: js.Function4[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, /* x3 */ V3, T], args: js.Array[V3]): js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T] = js.native
  def partialRight[V0, V1, V2, V3, T](fn: js.Function4[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, /* x3 */ V3, T], args: js.Tuple2[V2, V3]): js.Function2[/* x0 */ V0, /* x1 */ V1, T] = js.native
  def partialRight[V0, V1, V2, V3, T](
    fn: js.Function4[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, /* x3 */ V3, T],
    args: js.Tuple3[V1, V2, V3]
  ): js.Function1[/* x0 */ V0, T] = js.native
  def partition(fn: js.Function1[/* a */ java.lang.String, scala.Boolean]): js.Function1[
    /* list */ js.Array[java.lang.String], 
    js.Tuple2[js.Array[java.lang.String], js.Array[java.lang.String]]
  ] = js.native
  /**
    * Takes a predicate and a list and returns the pair of lists of elements
    * which do and do not satisfy the predicate, respectively.
    */
  def partition(fn: js.Function1[/* a */ java.lang.String, scala.Boolean], list: js.Array[java.lang.String]): js.Tuple2[js.Array[java.lang.String], js.Array[java.lang.String]] = js.native
  @JSName("partition")
  def partition_T[T](fn: js.Function1[/* a */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], js.Tuple2[js.Array[T], js.Array[T]]] = js.native
  @JSName("partition")
  def partition_T[T](fn: js.Function1[/* a */ T, scala.Boolean], list: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def path[T](path: Path): js.Function1[/* obj */ js.Any, js.UndefOr[T]] = js.native
  /**
    * Retrieve the value at a given path.
    */
  def path[T](path: Path, obj: js.Any): js.UndefOr[T] = js.native
  def pathEq(path: Path): ramdaLib.CurryNs.Curry[js.Function2[/* a */ _, /* b */ _, scala.Boolean]] = js.native
  def pathEq(path: Path, `val`: js.Any): js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  /**
    * Determines whether a nested path on an object has a specific value,
    * in `R.equals` terms. Most likely used to filter a list.
    */
  def pathEq(path: Path, `val`: js.Any, obj: js.Any): scala.Boolean = js.native
  def pathOr[T](defaultValue: T): ramdaLib.CurryNs.Curry[js.Function2[/* a */ Path, /* b */ _, _]] = js.native
  def pathOr[T](defaultValue: T, path: Path): js.Function1[/* obj */ js.Any, _] = js.native
  /**
    * If the given, non-null object has a value at the given path, returns the value at that path.
    * Otherwise returns the provided default value.
    */
  def pathOr[T](defaultValue: T, path: Path, obj: js.Any): js.Any = js.native
  def pathSatisfies[T, U](pred: js.Function1[/* val */ T, scala.Boolean]): ramdaLib.CurryNs.Curry[js.Function2[/* a */ Path, /* b */ U, scala.Boolean]] = js.native
  def pathSatisfies[T, U](pred: js.Function1[/* val */ T, scala.Boolean], path: Path): js.Function1[/* obj */ U, scala.Boolean] = js.native
  /**
    * Returns true if the specified object property at given path satisfies the given predicate; false otherwise.
    */
  def pathSatisfies[T, U](pred: js.Function1[/* val */ T, scala.Boolean], path: Path, obj: U): scala.Boolean = js.native
  def pick[K /* <: java.lang.String */](names: js.Array[K]): js.Function1[
    /* obj */ js.Any, 
    stdLib.Pick[_, stdLib.Exclude[java.lang.String, stdLib.Exclude[java.lang.String, K]]]
  ] = js.native
  /**
    * Returns a partial copy of an object containing only the keys specified.  If the key does not exist, the
    * property is ignored.
    */
  def pick[T, K /* <: java.lang.String */](names: js.Array[K], obj: T): stdLib.Pick[T, stdLib.Exclude[java.lang.String, stdLib.Exclude[java.lang.String, K]]] = js.native
  def pickAll(names: js.Array[java.lang.String]): js.Function1[/* obj */ js.Any, _] = js.native
  /**
    * Similar to `pick` except that this one includes a `key: undefined` pair for properties that don't exist.
    */
  def pickAll[T, U](names: js.Array[java.lang.String], obj: T): U = js.native
  def pickBy(pred: ObjPred): js.Function1[/* obj */ js.Any, _] = js.native
  /**
    * Returns a partial copy of an object containing only the keys that satisfy the supplied predicate.
    */
  def pickBy[T, U](pred: ObjPred, obj: T): U = js.native
  /**
    * Creates a new function that runs each of the functions supplied as parameters in turn,
    * passing the return value of each function invocation to the next function invocation,
    * beginning with whatever arguments were passed to the initial invocation.
    */
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
  /**
    * Returns the left-to-right Kleisli composition of the provided functions, each of which must return a value of a type supported by chain.
    * The typings currently support arrays only as return values.
    * All functions need to be unary.
    * R.pipeK(f, g, h) is equivalent to R.pipe(f, R.chain(g), R.chain(h)).
    *
    * @deprecated since 0.26 in favor of pipeWith(chain)
    */
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
  /**
    * Performs left-to-right composition of one or more Promise-returning functions.
    * All functions need to be unary.
    *
    * @deprecated since 0.26 in favor of pipeWith(then)
    */
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
  /*
    * Performs left-to-right function composition using transforming function.
    * With the current typings, all functions must be unary.
    */
  def pipeWith[V0, T](composer: js.Function1[/* a */ js.Any, _], fns: PipeWithFns[V0, T]): js.Function1[/* x0 */ V0, T] = js.native
  def pluck(p: scala.Double): js.Function1[/* list */ js.Array[org.scalablytyped.runtime.NumberDictionary[_]], js.Array[_]] = js.native
  def pluck[P /* <: java.lang.String */](p: P): js.Function1[/* list */ js.Array[stdLib.Record[P, _]], js.Array[_]] = js.native
  def pluck[T](p: scala.Double, list: js.Array[org.scalablytyped.runtime.NumberDictionary[T]]): js.Array[T] = js.native
  /**
    * Returns a new list by plucking the same named property off all objects in the list supplied.
    */
  def pluck[K /* <: java.lang.String */, T](p: K, list: js.Array[T]): js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def prepend[T](el: T): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Returns a new list with the given element at the front, followed by the contents of the
    * list.
    */
  def prepend[T](el: T, list: js.Array[T]): js.Array[T] = js.native
  /**
    * Multiplies together all the elements of a list.
    */
  def product(list: js.Array[scala.Double]): scala.Double = js.native
  def project[T, U](props: js.Array[java.lang.String]): js.Function1[/* objs */ js.Array[T], js.Array[U]] = js.native
  /**
    * Reasonable analog to SQL `select` statement.
    */
  def project[T, U](props: js.Array[java.lang.String], objs: js.Array[T]): js.Array[U] = js.native
  /**
    * Returns a function that when supplied an object returns the indicated property of that object, if it exists.
    */
  def prop[T](__ : Placeholder, obj: T): js.Function1[
    /* p */ java.lang.String, 
    /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def prop[P /* <: java.lang.String */](p: P): js.Function1[/* obj */ stdLib.Record[P, _], _] = js.native
  def prop[P /* <: java.lang.String */, T](p: P, obj: T): /* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any = js.native
  def propEq(name: java.lang.String): ramdaLib.Fn_Obj = js.native
  def propEq(name: scala.Double): ramdaLib.Fn_Obj = js.native
  def propEq[T](name: java.lang.String, `val`: T): js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  /**
    * Determines whether the given property of an object has a specific
    * value according to strict equality (`===`).  Most likely used to
    * filter a list.
    */
  def propEq[T](name: java.lang.String, `val`: T, obj: js.Any): scala.Boolean = js.native
  def propEq[T](name: scala.Double, `val`: T): js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  def propEq[T](name: scala.Double, `val`: T, obj: js.Any): scala.Boolean = js.native
  def propIs(`type`: js.Any): ramdaLib.Fn_Name = js.native
  def propIs(`type`: js.Any, name: java.lang.String): js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  /**
    * Returns true if the specified object property is of the given type; false otherwise.
    */
  def propIs(`type`: js.Any, name: java.lang.String, obj: js.Any): scala.Boolean = js.native
  def propOr[U](__ : Placeholder, p: java.lang.String, obj: U): js.Function1[/* val */ js.Any, _] = js.native
  def propOr[T](`val`: T): js.Function2[/* p */ java.lang.String, /* obj */ js.Any, _] = js.native
  def propOr[T](`val`: T, p: java.lang.String): js.Function1[/* obj */ js.Any, _] = js.native
  /**
    * If the given, non-null object has an own property with the specified name, returns the value of that property.
    * Otherwise returns the provided default value.
    */
  def propOr[T, U](`val`: T, __ : Placeholder, obj: U): js.Function1[/* p */ java.lang.String, _] = js.native
  def propOr[T, U, V](`val`: T, p: java.lang.String, obj: U): V = js.native
  def propSatisfies[T, U](pred: js.Function1[/* val */ T, scala.Boolean]): ramdaLib.CurryNs.Curry[js.Function2[/* a */ java.lang.String, /* b */ U, scala.Boolean]] = js.native
  def propSatisfies[T, U](pred: js.Function1[/* val */ T, scala.Boolean], name: java.lang.String): js.Function1[/* obj */ U, scala.Boolean] = js.native
  /**
    * Returns true if the specified object property satisfies the given predicate; false otherwise.
    */
  def propSatisfies[T, U](pred: js.Function1[/* val */ T, scala.Boolean], name: java.lang.String, obj: U): scala.Boolean = js.native
  @JSName("prop")
  def prop_PStringT[P /* <: java.lang.String */, T](p: P): js.Function1[/* obj */ stdLib.Record[P, T], T] = js.native
  def props[P /* <: java.lang.String */](ps: js.Array[P]): js.Function1[/* obj */ stdLib.Record[P, _], js.Array[_]] = js.native
  /**
    * Returns the value at the specified property.
    * The only difference from `prop` is the parameter order.
    * Note: TS1.9 # replace any by dictionary
    */
  def props[P /* <: java.lang.String */, T](ps: js.Array[P], obj: stdLib.Record[P, T]): js.Array[T] = js.native
  @JSName("props")
  def props_PStringT[P /* <: java.lang.String */, T](ps: js.Array[P]): js.Function1[/* obj */ stdLib.Record[P, T], js.Array[T]] = js.native
  def range(from: scala.Double): js.Function1[/* to */ scala.Double, js.Array[scala.Double]] = js.native
  /**
    * Returns a list of numbers from `from` (inclusive) to `to`
    * (exclusive). In mathematical terms, `range(a, b)` is equivalent to
    * the half-open interval `[a, b)`.
    */
  def range(from: scala.Double, to: scala.Double): js.Array[scala.Double] = js.native
  def reduce[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult | Reduced[TResult]]): js.Function2[/* acc */ TResult, /* list */ js.Array[T], TResult] = js.native
  def reduce[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult | Reduced[TResult]], acc: TResult): js.Function1[/* list */ js.Array[T], TResult] = js.native
  /**
    * Returns a single item by iterating through the list, successively calling the iterator
    * function and passing it an accumulator value and the current value from the array, and
    * then passing the result to the next call.
    */
  def reduce[T, TResult](
    fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult | Reduced[TResult]],
    acc: TResult,
    list: js.Array[T]
  ): TResult = js.native
  def reduceBy[T, TResult](valueFn: js.Function2[/* acc */ TResult, /* elem */ T, TResult]): ramdaLib.CurryNs.Curry[
    js.Function3[
      /* a */ TResult, 
      /* b */ js.Function1[/* elem */ T, java.lang.String], 
      /* c */ js.Array[T], 
      org.scalablytyped.runtime.StringDictionary[TResult]
    ]
  ] = js.native
  def reduceBy[T, TResult](valueFn: js.Function2[/* acc */ TResult, /* elem */ T, TResult], acc: TResult): ramdaLib.CurryNs.Curry[
    js.Function2[
      /* a */ js.Function1[/* elem */ T, java.lang.String], 
      /* b */ js.Array[T], 
      org.scalablytyped.runtime.StringDictionary[TResult]
    ]
  ] = js.native
  def reduceBy[T, TResult](
    valueFn: js.Function2[/* acc */ TResult, /* elem */ T, TResult],
    acc: TResult,
    keyFn: js.Function1[/* elem */ T, java.lang.String]
  ): js.Function1[/* list */ js.Array[T], org.scalablytyped.runtime.StringDictionary[TResult]] = js.native
  /**
    * Groups the elements of the list according to the result of calling the String-returning function keyFn on each
    * element and reduces the elements of each group to a single value via the reducer function valueFn.
    */
  def reduceBy[T, TResult](
    valueFn: js.Function2[/* acc */ TResult, /* elem */ T, TResult],
    acc: TResult,
    keyFn: js.Function1[/* elem */ T, java.lang.String],
    list: js.Array[T]
  ): org.scalablytyped.runtime.StringDictionary[TResult] = js.native
  def reduceRight[T, TResult](fn: js.Function2[/* elem */ T, /* acc */ TResult, TResult]): js.Function2[/* acc */ TResult, /* list */ js.Array[T], TResult] = js.native
  def reduceRight[T, TResult](fn: js.Function2[/* elem */ T, /* acc */ TResult, TResult], acc: TResult): js.Function1[/* list */ js.Array[T], TResult] = js.native
  /**
    * Returns a single item by iterating through the list, successively calling the iterator
    * function and passing it an accumulator value and the current value from the array, and
    * then passing the result to the next call.
    */
  def reduceRight[T, TResult](fn: js.Function2[/* elem */ T, /* acc */ TResult, TResult], acc: TResult, list: js.Array[T]): TResult = js.native
  def reduceWhile[T, TResult](predicate: js.Function2[/* acc */ TResult, /* elem */ T, scala.Boolean]): ramdaLib.CurryNs.Curry[
    js.Function3[
      /* a */ js.Function2[/* acc */ TResult, /* elem */ T, TResult], 
      /* b */ TResult, 
      /* c */ js.Array[T], 
      TResult
    ]
  ] = js.native
  def reduceWhile[T, TResult](
    predicate: js.Function2[/* acc */ TResult, /* elem */ T, scala.Boolean],
    fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult]
  ): ramdaLib.CurryNs.Curry[js.Function2[/* a */ TResult, /* b */ js.Array[T], TResult]] = js.native
  def reduceWhile[T, TResult](
    predicate: js.Function2[/* acc */ TResult, /* elem */ T, scala.Boolean],
    fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult],
    acc: TResult
  ): js.Function1[/* list */ js.Array[T], TResult] = js.native
  /**
    * Like reduce, reduceWhile returns a single item by iterating through the list, successively
    * calling the iterator function. reduceWhile also takes a predicate that is evaluated before
    * each step. If the predicate returns false, it "short-circuits" the iteration and returns
    * the current value of the accumulator.
    */
  def reduceWhile[T, TResult](
    predicate: js.Function2[/* acc */ TResult, /* elem */ T, scala.Boolean],
    fn: js.Function2[/* acc */ TResult, /* elem */ T, TResult],
    acc: TResult,
    list: js.Array[T]
  ): TResult = js.native
  /**
    * Returns a value wrapped to indicate that it is the final value of the reduce and
    * transduce functions. The returned value should be considered a black box: the internal
    * structure is not guaranteed to be stable.
    */
  def reduced[T](elem: T): Reduced[T] = js.native
  /**
    * Similar to `filter`, except that it keeps only values for which the given predicate
    * function returns falsy.
    */
  def reject[T](fn: js.Function1[/* value */ T, scala.Boolean]): FilterOnceApplied[T] = js.native
  /**
    * Similar to `filter`, except that it keeps only values for which the given predicate
    * function returns falsy.
    */
  def reject[T](fn: js.Function1[/* value */ T, scala.Boolean], list: js.Array[T]): js.Array[T] = js.native
  /**
    * Similar to `filter`, except that it keeps only values for which the given predicate
    * function returns falsy.
    */
  def reject[T](fn: js.Function1[/* value */ T, scala.Boolean], obj: Dictionary[T]): Dictionary[T] = js.native
  /**
    * Similar to `filter`, except that it keeps only values for which the given predicate
    * function returns falsy.
    */
  @JSName("reject")
  def reject_TKindarrayFunction1[T, Kind /* <: ramdaLib.ramdaLibStrings.array */](fn: js.Function1[/* value */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Similar to `filter`, except that it keeps only values for which the given predicate
    * function returns falsy.
    */
  @JSName("reject")
  def reject_TKindobjectFunction1[T, Kind /* <: ramdaLib.ramdaLibStrings.`object` */](fn: js.Function1[/* value */ T, scala.Boolean]): js.Function1[/* list */ Dictionary[T], Dictionary[T]] = js.native
  def remove[T](start: scala.Double): js.Function2[/* count */ scala.Double, /* list */ js.Array[T], js.Array[T]] = js.native
  def remove[T](start: scala.Double, count: scala.Double): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Removes the sub-list of `list` starting at index `start` and containing `count` elements.
    */
  def remove[T](start: scala.Double, count: scala.Double, list: js.Array[T]): js.Array[T] = js.native
  def repeat[T](a: T): js.Function1[/* n */ scala.Double, js.Array[T]] = js.native
  /**
    * Returns a fixed list of size n containing a specified identical value.
    */
  def repeat[T](a: T, n: scala.Double): js.Array[T] = js.native
  def replace(pattern: java.lang.String): js.Function1[
    /* replacement */ java.lang.String | (js.Function2[/* match */ java.lang.String, /* repeated */ js.Any, java.lang.String]), 
    js.Function1[/* str */ java.lang.String, java.lang.String]
  ] = js.native
  def replace(pattern: java.lang.String, replacement: java.lang.String): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  def replace(pattern: java.lang.String, replacement: java.lang.String, str: java.lang.String): java.lang.String = js.native
  def replace(
    pattern: java.lang.String,
    replacement: js.Function2[/* match */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  def replace(
    pattern: java.lang.String,
    replacement: js.Function2[/* match */ java.lang.String, /* repeated */ js.Any, java.lang.String],
    str: java.lang.String
  ): java.lang.String = js.native
  def replace(pattern: stdLib.RegExp): js.Function1[
    /* replacement */ java.lang.String | (js.Function2[/* match */ java.lang.String, /* repeated */ js.Any, java.lang.String]), 
    js.Function1[/* str */ java.lang.String, java.lang.String]
  ] = js.native
  def replace(pattern: stdLib.RegExp, replacement: java.lang.String): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  /**
    * Replace a substring or regex match in a string with a replacement.
    */
  def replace(pattern: stdLib.RegExp, replacement: java.lang.String, str: java.lang.String): java.lang.String = js.native
  def replace(
    pattern: stdLib.RegExp,
    replacement: js.Function2[/* match */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  def replace(
    pattern: stdLib.RegExp,
    replacement: js.Function2[/* match */ java.lang.String, /* repeated */ js.Any, java.lang.String],
    str: java.lang.String
  ): java.lang.String = js.native
  /**
    * Returns a new string with the characters in reverse order.
    */
  def reverse(str: java.lang.String): java.lang.String = js.native
  /**
    * Returns a new list with the same elements as the original list, just in the reverse order.
    */
  def reverse[T](list: js.Array[T]): js.Array[T] = js.native
  def scan[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, _]): js.Function2[/* acc */ TResult, /* list */ js.Array[T], js.Array[TResult]] = js.native
  def scan[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, _], acc: TResult): js.Function1[/* list */ js.Array[T], js.Array[TResult]] = js.native
  /**
    * Scan is similar to reduce, but returns a list of successively reduced values from the left.
    */
  def scan[T, TResult](fn: js.Function2[/* acc */ TResult, /* elem */ T, _], acc: TResult, list: js.Array[T]): js.Array[TResult] = js.native
  def set(lens: Lens): js.Function2[/* a */ js.Any, /* obj */ js.Any, _] = js.native
  def set[U](lens: Lens, a: U): js.Function1[/* obj */ js.Any, _] = js.native
  /**
    * Returns the result of "setting" the portion of the given data structure focused by the given lens to the
    * given value.
    */
  def set[T, U](lens: Lens, a: U, obj: T): T = js.native
  def slice(a: scala.Double): ramdaLib.Fn_B = js.native
  def slice(a: scala.Double, b: scala.Double): ramdaLib.Fn_ListArray = js.native
  /**
    * Returns the elements from `xs` starting at `a` and ending at `b - 1`.
    */
  def slice(a: scala.Double, b: scala.Double, list: java.lang.String): java.lang.String = js.native
  def slice[T](a: scala.Double, b: scala.Double, list: js.Array[T]): js.Array[T] = js.native
  def sort[T](fn: js.Function2[/* a */ T, /* b */ T, scala.Double]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Returns a copy of the list, sorted according to the comparator function, which should accept two values at a
    * time and return a negative number if the first value is smaller, a positive number if it's larger, and zero
    * if they are equal.
    */
  def sort[T](fn: js.Function2[/* a */ T, /* b */ T, scala.Double], list: js.Array[T]): js.Array[T] = js.native
  def sortBy(fn: js.Function1[/* a */ js.Any, Ord]): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  /**
    * Sorts the list according to a key generated by the supplied function.
    */
  def sortBy[T](fn: js.Function1[/* a */ T, Ord], list: js.Array[T]): js.Array[T] = js.native
  def sortWith[T](fns: js.Array[js.Function2[/* a */ T, /* b */ T, scala.Double]]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Sorts a list according to a list of comparators.
    */
  def sortWith[T](fns: js.Array[js.Function2[/* a */ T, /* b */ T, scala.Double]], list: js.Array[T]): js.Array[T] = js.native
  /**
    * Splits a string into an array of strings based on the given
    * separator.
    */
  def split(sep: java.lang.String): js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  def split(sep: java.lang.String, str: java.lang.String): js.Array[java.lang.String] = js.native
  def split(sep: stdLib.RegExp): js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  def split(sep: stdLib.RegExp, str: java.lang.String): js.Array[java.lang.String] = js.native
  def splitAt(index: scala.Double): ramdaLib.Fn_ListArrayReadonlyArray = js.native
  def splitAt(index: scala.Double, list: java.lang.String): js.Tuple2[java.lang.String, java.lang.String] = js.native
  /**
    * Splits a given list or string at a given index.
    */
  def splitAt[T](index: scala.Double, list: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def splitEvery(a: scala.Double): ramdaLib.Fn_ListArrayReadonlyArrayString = js.native
  def splitEvery(a: scala.Double, list: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Splits a collection into slices of the specified length.
    */
  def splitEvery[T](a: scala.Double, list: js.Array[T]): js.Array[js.Array[T]] = js.native
  def splitWhen[T](pred: js.Function1[/* val */ T, scala.Boolean]): js.Function1[/* list */ js.Array[_], js.Array[js.Array[_]]] = js.native
  /**
    * Takes a list and a predicate and returns a pair of lists with the following properties:
    * - the result of concatenating the two output lists is equivalent to the input list;
    * - none of the elements of the first output list satisfies the predicate; and
    * - if the second output list is non-empty, its first element satisfies the predicate.
    */
  def splitWhen[T, U](pred: js.Function1[/* val */ T, scala.Boolean], list: js.Array[U]): js.Array[js.Array[U]] = js.native
  def startsWith(a: java.lang.String): js.Function1[/* list */ java.lang.String, scala.Boolean] = js.native
  /**
    * Checks if a list starts with the provided values
    */
  def startsWith(a: java.lang.String, list: java.lang.String): scala.Boolean = js.native
  def startsWith[T](a: T): js.Function1[/* list */ js.Array[T], scala.Boolean] = js.native
  def startsWith[T](a: T, list: js.Array[T]): scala.Boolean = js.native
  def startsWith[T](a: js.Array[T]): js.Function1[/* list */ js.Array[T], scala.Boolean] = js.native
  def startsWith[T](a: js.Array[T], list: js.Array[T]): scala.Boolean = js.native
  def subtract(__ : Placeholder): js.Function2[/* b */ scala.Double, /* a */ scala.Double, scala.Double] = js.native
  /**
    * Subtracts two numbers. Equivalent to `a - b` but curried.
    */
  def subtract(__ : Placeholder, b: scala.Double): js.Function1[/* a */ scala.Double, scala.Double] = js.native
  def subtract(a: scala.Double): js.Function1[/* b */ scala.Double, scala.Double] = js.native
  def subtract(a: scala.Double, b: scala.Double): scala.Double = js.native
  /**
    * Adds together all the elements of a list.
    */
  def sum(list: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Finds the set (i.e. no duplicates) of all elements contained in the first or second list, but not both.
    */
  def symmetricDifference[T](list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  def symmetricDifference[T](list: js.Array[T]): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  def symmetricDifferenceWith[T](pred: js.Function2[/* a */ T, /* b */ T, scala.Boolean]): ramdaLib.CurryNs.Curry[js.Function2[/* a */ js.Array[T], /* b */ js.Array[T], js.Array[T]]] = js.native
  /**
    * Finds the set (i.e. no duplicates) of all elements contained in the first or second list, but not both.
    * Duplication is determined according to the value returned by applying the supplied predicate to two list elements.
    */
  def symmetricDifferenceWith[T](pred: js.Function2[/* a */ T, /* b */ T, scala.Boolean], list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  def tail(list: java.lang.String): java.lang.String = js.native
  /**
    * Returns all but the first element of a list or string.
    */
  def tail[T](list: js.Array[T]): js.Array[T] = js.native
  def take(n: scala.Double, xs: java.lang.String): java.lang.String = js.native
  def take[T](n: scala.Double): ramdaLib.Fn_Xs[T] = js.native
  /**
    * Returns a new list containing the first `n` elements of the given list.  If
    * `n > * list.length`, returns a list of `list.length` elements.
    */
  def take[T](n: scala.Double, xs: js.Array[T]): js.Array[T] = js.native
  def takeLast(n: scala.Double): ramdaLib.Fn_XsArrayReadonlyArray = js.native
  def takeLast(n: scala.Double, xs: java.lang.String): java.lang.String = js.native
  /**
    * Returns a new list containing the last n elements of the given list. If n > list.length,
    * returns a list of list.length elements.
    */
  def takeLast[T](n: scala.Double, xs: js.Array[T]): js.Array[T] = js.native
  def takeLastWhile[T](pred: js.Function1[/* a */ T, scala.Boolean]): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  /**
    * Returns a new list containing the last n elements of a given list, passing each value
    * to the supplied predicate function, and terminating when the predicate function returns
    * false. Excludes the element that caused the predicate function to fail. The predicate
    * function is passed one argument: (value).
    */
  def takeLastWhile[T](pred: js.Function1[/* a */ T, scala.Boolean], list: js.Array[T]): js.Array[T] = js.native
  def takeWhile[T](fn: js.Function1[/* x */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Returns a new list containing the first `n` elements of a given list, passing each value
    * to the supplied predicate function, and terminating when the predicate function returns
    * `false`.
    */
  def takeWhile[T](fn: js.Function1[/* x */ T, scala.Boolean], list: js.Array[T]): js.Array[T] = js.native
  def tap[T](fn: js.Function1[/* a */ T, _]): js.Function1[/* value */ T, T] = js.native
  /**
    * The function to call with x. The return value of fn will be thrown away.
    */
  def tap[T](fn: js.Function1[/* a */ T, _], value: T): T = js.native
  def test(regexp: stdLib.RegExp): js.Function1[/* str */ java.lang.String, scala.Boolean] = js.native
  /**
    * Determines whether a given string matches a given regular expression.
    */
  def test(regexp: stdLib.RegExp, str: java.lang.String): scala.Boolean = js.native
  def `then`[A, B](onSuccess: js.Function1[/* a */ A, B | js.Promise[B]]): js.Function1[/* promise */ js.Promise[A], js.Promise[B]] = js.native
  /**
    * Returns the result of applying the onSuccess function to the value inside a successfully resolved promise. This is useful for working with promises inside function compositions.
    */
  def `then`[A, B](onSuccess: js.Function1[/* a */ A, B | js.Promise[B]], promise: js.Promise[A]): js.Promise[B] = js.native
  /**
    * Creates a thunk out of a function.
    * A thunk delays a calculation until its result is needed, providing lazy evaluation of arguments.
    */
  def thunkify[F /* <: js.Function1[/* repeated */ js.Any, _] */](fn: F): ramdaLib.CurryNs.Curry[
    js.Function1[/* args */ stdLib.Parameters[F], js.Function0[stdLib.ReturnType[F]]]
  ] = js.native
  def times[T](fn: js.Function1[/* i */ scala.Double, T]): js.Function1[/* n */ scala.Double, js.Array[T]] = js.native
  /**
    * Calls an input function `n` times, returning an array containing the results of those
    * function calls.
    */
  def times[T](fn: js.Function1[/* i */ scala.Double, T], n: scala.Double): js.Array[T] = js.native
  /**
    * The lower case version of a string.
    */
  def toLower(str: java.lang.String): java.lang.String = js.native
  def toPairs[S](obj: org.scalablytyped.runtime.NumberDictionary[S]): js.Array[js.Tuple2[java.lang.String, S]] = js.native
  /**
    * Converts an object into an array of key, value arrays.
    * Only the object's own properties are used.
    * Note that the order of the output array is not guaranteed to be
    * consistent across different JS platforms.
    */
  def toPairs[S](obj: org.scalablytyped.runtime.StringDictionary[S]): js.Array[js.Tuple2[java.lang.String, S]] = js.native
  def toPairsIn[S](obj: org.scalablytyped.runtime.NumberDictionary[S]): js.Array[js.Tuple2[java.lang.String, S]] = js.native
  /**
    * Converts an object into an array of key, value arrays.
    * The object's own properties and prototype properties are used.
    * Note that the order of the output array is not guaranteed to be
    * consistent across different JS platforms.
    */
  def toPairsIn[S](obj: org.scalablytyped.runtime.StringDictionary[S]): js.Array[js.Tuple2[java.lang.String, S]] = js.native
  /**
    * Returns the string representation of the given value. eval'ing the output should
    * result in a value equivalent to the input value. Many of the built-in toString
    * methods do not satisfy this requirement.
    *
    * If the given value is an [object Object] with a toString method other than
    * Object.prototype.toString, this method is invoked with no arguments to produce the
    * return value. This means user-defined constructor functions can provide a suitable
    * toString method.
    */
  def toString[T](`val`: T): java.lang.String = js.native
  /**
    * The upper case version of a string.
    */
  def toUpper(str: java.lang.String): java.lang.String = js.native
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
  /**
    * Initializes a transducer using supplied iterator function. Returns a single item by iterating through the
    * list, successively calling the transformed iterator function and passing it an accumulator value and the
    * current value from the array, and then passing the result to the next call.
    */
  def transduce[T, U](
    xf: js.Function1[/* arg */ js.Array[T], js.Array[T]],
    fn: js.Function2[/* acc */ js.Array[U], /* val */ U, js.Array[U]],
    acc: js.Array[T],
    list: js.Array[T]
  ): U = js.native
  /**
    * Transposes the rows and columns of a 2D list. When passed a list of n lists of length x, returns a list of x lists of length n.
    */
  def transpose[T](list: js.Array[js.Array[T]]): js.Array[js.Array[T]] = js.native
  def traverse[A, B](of: js.Function1[/* a */ B, js.Array[B]]): js.Function2[
    /* fn */ js.Function1[/* t */ A, js.Array[B]], 
    /* list */ js.Array[A], 
    js.Array[js.Array[B]]
  ] = js.native
  def traverse[A, B](of: js.Function1[/* a */ B, js.Array[B]], fn: js.Function1[/* t */ A, js.Array[B]]): js.Function1[/* list */ js.Array[A], js.Array[js.Array[B]]] = js.native
  /**
    * Maps an Applicative-returning function over a Traversable, then uses
    * sequence to transform the resulting Traversable of Applicative into
    * an Applicative of Traversable.
    */
  def traverse[A, B](
    of: js.Function1[/* a */ B, js.Array[B]],
    fn: js.Function1[/* t */ A, js.Array[B]],
    list: js.Array[A]
  ): js.Array[js.Array[B]] = js.native
  /**
    * Removes (strips) whitespace from both ends of the string.
    */
  def trim(str: java.lang.String): java.lang.String = js.native
  /**
    * tryCatch takes two functions, a tryer and a catcher. The returned function evaluates the tryer; if it does
    * not throw, it simply returns the result. If the tryer does throw, the returned function evaluates the catcher
    * function and returns its result. Note that for effective composition with this function, both the tryer and
    * catcher functions must return the same type of results.
    */
  def tryCatch[T](tryer: js.Function1[/* repeated */ js.Any, T], catcher: js.Function1[/* repeated */ js.Any, T]): js.Function1[/* repeated */ js.Any, T] = js.native
  /**
    * Gives a single-word string description of the (native) type of a value, returning such answers as 'Object',
    * 'Number', 'Array', or 'Null'. Does not attempt to distinguish user Object types any further, reporting them
    * all as 'Object'.
    */
  def `type`(`val`: js.Any): ramdaLib.ramdaLibStrings.Object | ramdaLib.ramdaLibStrings.Number | ramdaLib.ramdaLibStrings.Boolean | ramdaLib.ramdaLibStrings.String | ramdaLib.ramdaLibStrings.Null | ramdaLib.ramdaLibStrings.Array | ramdaLib.ramdaLibStrings.RegExp | ramdaLib.ramdaLibStrings.Function | ramdaLib.ramdaLibStrings.Undefined = js.native
  /**
    * Takes a function fn, which takes a single array argument, and returns a function which:
    * - takes any number of positional arguments;
    * - passes these arguments to fn as an array; and
    * - returns the result.
    * In other words, R.unapply derives a variadic function from a function which takes an array.
    * R.unapply is the inverse of R.apply.
    */
  def unapply[T](fn: js.Function1[/* args */ js.Array[_], T]): js.Function1[/* repeated */ js.Any, T] = js.native
  /**
    * Wraps a function of any arity (including nullary) in a function that accepts exactly 1 parameter.
    * Any extraneous parameters will not be passed to the supplied function.
    */
  def unary[T](fn: js.Function2[/* a */ T, /* repeated */ js.Any, _]): js.Function1[/* a */ T, _] = js.native
  /**
    * Returns a function of arity n from a (manually) curried function.
    */
  def uncurryN[T](len: scala.Double, fn: js.Function1[/* a */ js.Any, _]): js.Function1[/* repeated */ js.Any, T] = js.native
  def unfold[T, TResult](fn: js.Function1[/* seed */ T, (js.Tuple2[TResult, T]) | ramdaLib.ramdaLibNumbers.`false`]): js.Function1[/* seed */ T, js.Array[TResult]] = js.native
  /**
    * Builds a list from a seed value. Accepts an iterator function, which returns either false
    * to stop iteration or an array of length 2 containing the value to add to the resulting
    * list and the seed to be used in the next call to the iterator function.
    */
  def unfold[T, TResult](
    fn: js.Function1[/* seed */ T, (js.Tuple2[TResult, T]) | ramdaLib.ramdaLibNumbers.`false`],
    seed: T
  ): js.Array[TResult] = js.native
  def union[T](as: js.Array[T]): js.Function1[/* bs */ js.Array[T], js.Array[T]] = js.native
  /**
    * Combines two lists into a set (i.e. no duplicates) composed of the
    * elements of each list.
    */
  def union[T](as: js.Array[T], bs: js.Array[T]): js.Array[T] = js.native
  def unionWith[T](pred: js.Function2[/* a */ T, /* b */ T, scala.Boolean]): ramdaLib.CurryNs.Curry[js.Function2[/* a */ js.Array[T], /* b */ js.Array[T], js.Array[T]]] = js.native
  /**
    * Combines two lists into a set (i.e. no duplicates) composed of the elements of each list.  Duplication is
    * determined according to the value returned by applying the supplied predicate to two list elements.
    */
  def unionWith[T](pred: js.Function2[/* a */ T, /* b */ T, scala.Boolean], list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  /**
    * Returns a new list containing only one copy of each element in the original list.
    */
  def uniq[T](list: js.Array[T]): js.Array[T] = js.native
  def uniqBy[T, U](fn: js.Function1[/* a */ T, U]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Returns a new list containing only one copy of each element in the original list,
    * based upon the value returned by applying the supplied function to each list element.
    * Prefers the first item if the supplied function produces the same value on two items.
    * R.equals is used for comparison.
    */
  def uniqBy[T, U](fn: js.Function1[/* a */ T, U], list: js.Array[T]): js.Array[T] = js.native
  def uniqWith[T, U](pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Returns a new list containing only one copy of each element in the original list, based upon the value
    * returned by applying the supplied predicate to two list elements.
    */
  def uniqWith[T, U](pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean], list: js.Array[T]): js.Array[T] = js.native
  def unless[T, U](pred: js.Function1[/* a */ T, scala.Boolean], whenFalseFn: js.Function1[/* a */ T, U]): js.Function1[/* obj */ T, U] = js.native
  /**
    * Tests the final argument by passing it to the given predicate function. If the predicate is not satisfied,
    * the function will return the result of calling the whenFalseFn function with the same argument. If the
    * predicate is satisfied, the argument is returned as is.
    */
  def unless[T, U](pred: js.Function1[/* a */ T, scala.Boolean], whenFalseFn: js.Function1[/* a */ T, U], obj: T): U = js.native
  /**
    * Returns a new list by pulling every item at the first level of nesting out, and putting
    * them in a new array.
    */
  def unnest[T](x: js.Array[js.Array[T] | T]): js.Array[T] = js.native
  def until[T, U](pred: js.Function1[/* val */ T, scala.Boolean], fn: js.Function1[/* val */ T, U]): js.Function1[/* init */ U, U] = js.native
  /**
    * Takes a predicate, a transformation function, and an initial value, and returns a value of the same type as
    * the initial value. It does so by applying the transformation until the predicate is satisfied, at which point
    * it returns the satisfactory value.
    */
  def until[T, U](pred: js.Function1[/* val */ T, scala.Boolean], fn: js.Function1[/* val */ T, U], init: U): U = js.native
  def update[T](index: scala.Double, value: T): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  /**
    * Returns a new copy of the array with the element at the provided index replaced with the given value.
    */
  def update[T](index: scala.Double, value: T, list: js.Array[T]): js.Array[T] = js.native
  /**
    * Accepts a function fn and a list of transformer functions and returns a new curried function.
    * When the new function is invoked, it calls the function fn with parameters consisting of the
    * result of calling each supplied handler on successive arguments to the new function.
    *
    * If more arguments are passed to the returned function than transformer functions, those arguments
    * are passed directly to fn as additional parameters. If you expect additional arguments that don't
    * need to be transformed, although you can ignore them, it's best to pass an identity function so
    * that the new function reports the correct arity.
    */
  def useWith(
    fn: js.Function1[/* repeated */ js.Any, _],
    transformers: js.Array[js.Function1[/* repeated */ _, _]]
  ): js.Function1[/* repeated */ js.Any, _] = js.native
  /**
    * Returns a list of all the enumerable own properties of the supplied object.
    * Note that the order of the output array is not guaranteed across
    * different JS platforms.
    */
  def values[T /* <: js.Object */, K /* <: java.lang.String */](obj: T): js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  /**
    * Returns a list of all the properties, including prototype properties, of the supplied
    * object. Note that the order of the output array is not guaranteed to be consistent across different JS platforms.
    */
  def valuesIn[T](obj: js.Any): js.Array[T] = js.native
  /**
    * Returns a "view" of the given data structure, determined by the given lens. The lens's focus determines which
    * portion of the data structure is visible.
    */
  def view[T, U](lens: Lens): js.Function1[/* obj */ T, U] = js.native
  def view[T, U](lens: Lens, obj: T): U = js.native
  def when[T, U](pred: js.Function1[/* a */ T, scala.Boolean], whenTrueFn: js.Function1[/* a */ T, U]): js.Function1[/* obj */ T, U] = js.native
  /**
    * Tests the final argument by passing it to the given predicate function. If the predicate is satisfied, the function
    * will return the result of calling the whenTrueFn function with the same argument. If the predicate is not satisfied,
    * the argument is returned as is.
    */
  def when[T, U](pred: js.Function1[/* a */ T, scala.Boolean], whenTrueFn: js.Function1[/* a */ T, U], obj: T): U = js.native
  def where[T](spec: T): js.Function1[/* testObj */ js.Any, scala.Boolean] = js.native
  /**
    * Takes a spec object and a test object and returns true if the test satisfies the spec.
    * Any property on the spec that is not a function is interpreted as an equality
    * relation.
    *
    * If the spec has a property mapped to a function, then `where` evaluates the function, passing in
    * the test object's value for the property in question, as well as the whole test object.
    *
    * `where` is well suited to declarativley expressing constraints for other functions, e.g.,
    * `filter`, `find`, `pickWith`, etc.
    */
  def where[T, U](spec: T, testObj: U): scala.Boolean = js.native
  def whereEq[T](spec: T): js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  /**
    * Takes a spec object and a test object; returns true if the test satisfies the spec,
    * false otherwise. An object satisfies the spec if, for each of the spec's own properties,
    * accessing that property of the object gives the same value (in R.eq terms) as accessing
    * that property of the spec.
    */
  def whereEq[T, U](spec: T, obj: U): scala.Boolean = js.native
  @JSName("where")
  def where_ObjFunc2[ObjFunc2](spec: ObjFunc2): js.Function1[/* testObj */ js.Any, scala.Boolean] = js.native
  @JSName("where")
  def where_ObjFunc2U[ObjFunc2, U](spec: ObjFunc2, testObj: U): scala.Boolean = js.native
  def without[T](list1: js.Array[T]): js.Function1[/* list2 */ js.Array[T], js.Array[T]] = js.native
  /**
    * Returns a new list without values in the first argument. R.equals is used to determine equality.
    * Acts as a transducer if a transformer is given in list position.
    */
  def without[T](list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  /**
    * Wrap a function inside another to allow you to make adjustments to the parameters, or do other processing
    * either before the internal function is called or with its results.
    */
  def wrap(fn: js.Function1[/* repeated */ js.Any, _], wrapper: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def xprod[K](as: js.Array[K]): js.Function1[/* bs */ js.Array[_], js.Array[KeyValuePair[K, _]]] = js.native
  /**
    * Creates a new list out of the two supplied by creating each possible pair from the lists.
    */
  def xprod[K, V](as: js.Array[K], bs: js.Array[V]): js.Array[KeyValuePair[K, V]] = js.native
  def zip[K](list1: js.Array[K]): js.Function1[/* list2 */ js.Array[_], js.Array[KeyValuePair[K, _]]] = js.native
  /**
    * Creates a new list out of the two supplied by pairing up equally-positioned items from
    * both lists. Note: `zip` is equivalent to `zipWith(function(a, b) { return [a, b] })`.
    */
  def zip[K, V](list1: js.Array[K], list2: js.Array[V]): js.Array[KeyValuePair[K, V]] = js.native
  def zipObj(keys: js.Array[scala.Double | java.lang.String]): js.Function1[/* values */ js.Array[_], org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /**
    * Creates a new object out of a list of keys and a list of values.
    */
  // TODO: Dictionary<T> as a return value is to specific, any seems to loose
  def zipObj[T](keys: js.Array[java.lang.String], values: js.Array[T]): org.scalablytyped.runtime.StringDictionary[T] = js.native
  @JSName("zipObj")
  def zipObj_TNumberDictionary[T](keys: js.Array[scala.Double], values: js.Array[T]): org.scalablytyped.runtime.NumberDictionary[T] = js.native
  def zipWith[T, U, TResult](fn: js.Function2[/* x */ T, /* y */ U, TResult]): js.Function2[/* list1 */ js.Array[T], /* list2 */ js.Array[U], js.Array[TResult]] = js.native
  def zipWith[T, U, TResult](fn: js.Function2[/* x */ T, /* y */ U, TResult], list1: js.Array[T]): js.Function1[/* list2 */ js.Array[U], js.Array[TResult]] = js.native
  /**
    * Creates a new list out of the two supplied by applying the function to each
    * equally-positioned pair in the lists.
    */
  def zipWith[T, U, TResult](fn: js.Function2[/* x */ T, /* y */ U, TResult], list1: js.Array[T], list2: js.Array[U]): js.Array[TResult] = js.native
}

