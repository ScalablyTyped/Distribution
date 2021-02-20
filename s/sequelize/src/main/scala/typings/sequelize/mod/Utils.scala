package typings.sequelize.mod

import org.scalablytyped.runtime.Instantiable1
import typings.bluebird.mod.Resolvable
import typings.lodash.mod.Collection
import typings.lodash.mod.Function
import typings.lodash.mod.List
import typings.lodash.mod.Object
import typings.lodash.mod.Primitive
import typings.lodash.mod.String
import typings.sequelize.anon.FnCall
import typings.sequelize.anon.TypeofPromise
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils extends StObject {
  
  var Promise: TypeofPromise with (Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    typings.bluebird.mod.^[js.Object]
  ]) = js.native
  
  @JSName("_")
  def _underscore(): String = js.native
  @JSName("_")
  def _underscore(value: java.lang.String): String = js.native
  @JSName("_")
  def _underscore[T /* <: js.Object */](value: T): Object[T] = js.native
  @JSName("_")
  def _underscore[T](value: List[T]): Collection[T] = js.native
  @JSName("_")
  var _underscore_Original: SequelizeLoDash = js.native
  @JSName("_")
  def _underscore_T_Collection[T](): Collection[T] = js.native
  @JSName("_")
  def _underscore_T_Function1AnyWildcard_Function[T /* <: js.Function1[/* args */ js.Any, _] */](value: T): Function[T] = js.native
  @JSName("_")
  def _underscore_T_Object_Object[T /* <: js.Object */](): Object[T] = js.native
  @JSName("_")
  def _underscore_T_Primitive[T](value: T): Primitive[T] = js.native
  @JSName("_")
  def `_underscore_T_UnionNull<undefined>_Primitive`[T /* <: js.UndefOr[Null] */](value: T): Primitive[T] = js.native
  /**
    * Creates a lodash object which wraps value to enable implicit method chain sequences.
    * Methods that operate on and return arrays, collections, and functions can be chained together.
    * Methods that retrieve a single value or may return a primitive value will automatically end the
    * chain sequence and return the unwrapped value. Otherwise, the value must be unwrapped with value().
    *
    * Explicit chain sequences, which must be unwrapped with value(), may be enabled using _.chain.
    *
    * The execution of chained methods is lazy, that is, it's deferred until value() is
    * implicitly or explicitly called.
    *
    * Lazy evaluation allows several methods to support shortcut fusion. Shortcut fusion
    * is an optimization to merge iteratee calls; this avoids the creation of intermediate
    * arrays and can greatly reduce the number of iteratee executions. Sections of a chain
    * sequence qualify for shortcut fusion if the section is applied to an array and iteratees
    * accept only one argument. The heuristic for whether a section qualifies for shortcut
    * fusion is subject to change.
    *
    * Chaining is supported in custom builds as long as the value() method is directly or
    * indirectly included in the build.
    *
    * In addition to lodash methods, wrappers have Array and String methods.
    * The wrapper Array methods are:
    * concat, join, pop, push, shift, sort, splice, and unshift.
    * The wrapper String methods are:
    * replace and split.
    *
    * The wrapper methods that support shortcut fusion are:
    * at, compact, drop, dropRight, dropWhile, filter, find, findLast, head, initial, last,
    * map, reject, reverse, slice, tail, take, takeRight, takeRightWhile, takeWhile, and toArray
    *
    * The chainable wrapper methods are:
    * after, ary, assign, assignIn, assignInWith, assignWith, at, before, bind, bindAll, bindKey,
    * castArray, chain, chunk, commit, compact, concat, conforms, constant, countBy, create,
    * curry, debounce, defaults, defaultsDeep, defer, delay, difference, differenceBy, differenceWith,
    * drop, dropRight, dropRightWhile, dropWhile, extend, extendWith, fill, filter, flatMap,
    * flatMapDeep, flatMapDepth, flatten, flattenDeep, flattenDepth, flip, flow, flowRight,
    * fromPairs, functions, functionsIn, groupBy, initial, intersection, intersectionBy, intersectionWith,
    * invert, invertBy, invokeMap, iteratee, keyBy, keys, keysIn, map, mapKeys, mapValues,
    * matches, matchesProperty, memoize, merge, mergeWith, method, methodOf, mixin, negate,
    * nthArg, omit, omitBy, once, orderBy, over, overArgs, overEvery, overSome, partial, partialRight,
    * partition, pick, pickBy, plant, property, propertyOf, pull, pullAll, pullAllBy, pullAllWith, pullAt,
    * push, range, rangeRight, rearg, reject, remove, rest, reverse, sampleSize, set, setWith,
    * shuffle, slice, sort, sortBy, sortedUniq, sortedUniqBy, splice, spread, tail, take,
    * takeRight, takeRightWhile, takeWhile, tap, throttle, thru, toArray, toPairs, toPairsIn,
    * toPath, toPlainObject, transform, unary, union, unionBy, unionWith, uniq, uniqBy, uniqWith,
    * unset, unshift, unzip, unzipWith, update, updateWith, values, valuesIn, without, wrap,
    * xor, xorBy, xorWith, zip, zipObject, zipObjectDeep, and zipWith.
    *
    * The wrapper methods that are not chainable by default are:
    * add, attempt, camelCase, capitalize, ceil, clamp, clone, cloneDeep, cloneDeepWith, cloneWith,
    * conformsTo, deburr, defaultTo, divide, each, eachRight, endsWith, eq, escape, escapeRegExp,
    * every, find, findIndex, findKey, findLast, findLastIndex, findLastKey, first, floor, forEach,
    * forEachRight, forIn, forInRight, forOwn, forOwnRight, get, gt, gte, has, hasIn, head,
    * identity, includes, indexOf, inRange, invoke, isArguments, isArray, isArrayBuffer,
    * isArrayLike, isArrayLikeObject, isBoolean, isBuffer, isDate, isElement, isEmpty, isEqual, isEqualWith,
    * isError, isFinite, isFunction, isInteger, isLength, isMap, isMatch, isMatchWith, isNaN,
    * isNative, isNil, isNull, isNumber, isObject, isObjectLike, isPlainObject, isRegExp,
    * isSafeInteger, isSet, isString, isUndefined, isTypedArray, isWeakMap, isWeakSet, join,
    * kebabCase, last, lastIndexOf, lowerCase, lowerFirst, lt, lte, max, maxBy, mean, meanBy,
    * min, minBy, multiply, noConflict, noop, now, nth, pad, padEnd, padStart, parseInt, pop,
    * random, reduce, reduceRight, repeat, result, round, runInContext, sample, shift, size,
    * snakeCase, some, sortedIndex, sortedIndexBy, sortedLastIndex, sortedLastIndexBy, startCase,
    * startsWith, stubArray, stubFalse, stubObject, stubString, stubTrue, subtract, sum, sumBy,
    * template, times, toFinite, toInteger, toJSON, toLength, toLower, toNumber, toSafeInteger,
    * toString, toUpper, trim, trimEnd, trimStart, truncate, unescape, uniqueId, upperCase,
    * upperFirst, value, and words.
    **/
  @JSName("_")
  def _underscore_TrapAny_TrapAny_Intersection[TrapAny /* <: typings.lodash.anon.TrapAny */](value: TrapAny): Collection[_] with Function[_] with Object[_] with Primitive[_] with String = js.native
  
  def addTicks(s: java.lang.String): java.lang.String = js.native
  def addTicks(s: java.lang.String, tickChar: java.lang.String): java.lang.String = js.native
  
  var and: andStatic = js.native
  
  def argsArePrimaryKeys(args: js.Array[_], primaryKeys: js.Object): Boolean = js.native
  
  def camelize(str: java.lang.String): java.lang.String = js.native
  
  def canTreatArrayAsAnd(arr: js.Array[_]): Boolean = js.native
  
  var cast: castStatic = js.native
  
  def cloneDeep[T /* <: js.Object */](obj: T): T = js.native
  def cloneDeep[T /* <: js.Object */](obj: T, fn: js.Function1[/* value */ T, _]): T = js.native
  
  var col: colStatic = js.native
  
  def combineTableNames(tableName1: java.lang.String, tableName2: java.lang.String): java.lang.String = js.native
  
  /**
    * Determine if the default value provided exists and can be described
    * in a db schema using the DEFAULT directive.
    */
  def defaultValueSchemable(value: js.Any): Boolean = js.native
  
  var fn: fnStatic = js.native
  
  def format(arr: js.Array[_]): java.lang.String = js.native
  def format(arr: js.Array[_], dialect: java.lang.String): java.lang.String = js.native
  
  def formatNamedParameters(sql: java.lang.String, parameters: js.Any): java.lang.String = js.native
  def formatNamedParameters(sql: java.lang.String, parameters: js.Any, dialect: java.lang.String): java.lang.String = js.native
  
  def formatReferences(obj: js.Object): js.Object = js.native
  
  def inherit(subClass: js.Object, superClass: js.Object): js.Object = js.native
  
  var json: jsonStatic = js.native
  
  var literal: literalStatic = js.native
  
  def lowercaseFirst(str: java.lang.String): java.lang.String = js.native
  
  def mapOptionFieldNames[T /* <: js.Object */](options: T, Model: Model[_, _, _]): T = js.native
  
  def mapValueFieldNames(dataValues: js.Object, fields: js.Array[java.lang.String], Model: Model[_, _, _]): js.Object = js.native
  
  /**
    * Same concept as _.merge, but don't overwrite properties that have already been assigned
    */
  def mergeDefaults(`object`: js.Any, otherArgs: js.Any*): js.Any = js.native
  /**
    * Same concept as _.merge, but don't overwrite properties that have already been assigned
    */
  def mergeDefaults[TObject, TSource](`object`: TObject, source: TSource): TObject with TSource = js.native
  /**
    * Same concept as _.merge, but don't overwrite properties that have already been assigned
    */
  def mergeDefaults[TObject, TSource1, TSource2](`object`: TObject, source1: TSource1, source2: TSource2): TObject with TSource1 with TSource2 = js.native
  /**
    * Same concept as _.merge, but don't overwrite properties that have already been assigned
    */
  def mergeDefaults[TObject, TSource1, TSource2, TSource3](`object`: TObject, source1: TSource1, source2: TSource2, source3: TSource3): TObject with TSource1 with TSource2 with TSource3 = js.native
  /**
    * Same concept as _.merge, but don't overwrite properties that have already been assigned
    */
  def mergeDefaults[TObject, TSource1, TSource2, TSource3, TSource4](`object`: TObject, source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): TObject with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  /**
    * Same concept as _.merge, but don't overwrite properties that have already been assigned
    */
  @JSName("mergeDefaults")
  var mergeDefaults_Original: FnCall = js.native
  
  def now(dialect: java.lang.String): Date = js.native
  
  var or: orStatic = js.native
  
  def pluralize(s: java.lang.String): java.lang.String = js.native
  
  def removeCommentsFromFunctionString(s: java.lang.String): java.lang.String = js.native
  
  def removeNullValuesFromHash(hash: js.Object): js.Any = js.native
  def removeNullValuesFromHash(hash: js.Object, omitNull: js.UndefOr[scala.Nothing], options: js.Object): js.Any = js.native
  def removeNullValuesFromHash(hash: js.Object, omitNull: Boolean): js.Any = js.native
  def removeNullValuesFromHash(hash: js.Object, omitNull: Boolean, options: js.Object): js.Any = js.native
  
  def removeTicks(s: java.lang.String): java.lang.String = js.native
  def removeTicks(s: java.lang.String, tickChar: java.lang.String): java.lang.String = js.native
  
  def singularize(s: java.lang.String): java.lang.String = js.native
  
  def sliceArgs(args: js.Array[_]): js.Array[_] = js.native
  def sliceArgs(args: js.Array[_], begin: Double): js.Array[_] = js.native
  
  def spliceStr(str: java.lang.String, index: Double, count: Double, add: java.lang.String): java.lang.String = js.native
  
  def stack(): java.lang.String = js.native
  
  def tick(f: js.Function): Unit = js.native
  
  def toDefaultValue(value: js.Function0[DataTypeAbstract]): js.Any = js.native
  def toDefaultValue(value: DataTypeAbstract): js.Any = js.native
  
  def uppercaseFirst(str: java.lang.String): java.lang.String = js.native
  
  def validateParameter(value: js.Object, expectation: js.Object): Boolean = js.native
  def validateParameter(value: js.Object, expectation: js.Object, options: js.Object): Boolean = js.native
  
  var where: whereStatic = js.native
}
