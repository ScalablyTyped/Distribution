package typings.atSindresorhusIs.atSindresorhusIsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@sindresorhus/is", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  var all: js.Function2[/* predicate */ Predicate, /* repeated */ js.Any, Boolean] = js.native
  var any: js.Function2[/* predicate */ Predicate, /* repeated */ js.Any, Boolean] = js.native
  var array: js.Function1[/* arg */ js.Any, /* is std.Array<any> */ Boolean] = js.native
  var arrayBuffer: js.Function1[/* value */ js.Any, /* is std.ArrayBuffer */ Boolean] = js.native
  var arrayLike: js.Function1[
    /* value */ js.Any, 
    /* is @sindresorhus/is.@sindresorhus/is.ArrayLike<unknown> */ Boolean
  ] = js.native
  var asyncFunction: js.Function1[/* value */ js.Any, /* is std.Function */ Boolean] = js.native
  var asyncIterable: js.Function1[/* value */ js.Any, /* is std.AsyncIterableIterator<unknown> */ Boolean] = js.native
  var bigInt64Array: js.Function1[/* value */ js.Any, /* is std.BigInt64Array */ Boolean] = js.native
  var bigUint64Array: js.Function1[/* value */ js.Any, /* is std.BigUint64Array */ Boolean] = js.native
  var bigint: js.Function1[/* value */ js.Any, /* is bigint */ Boolean] = js.native
  var boolean: js.Function1[/* value */ js.Any, /* is boolean */ Boolean] = js.native
  var boundFunction: js.Function1[/* value */ js.Any, /* is std.Function */ Boolean] = js.native
  var buffer: js.Function1[/* value */ js.Any, /* is node.Buffer */ Boolean] = js.native
  var class_ : js.Function1[
    /* value */ js.Any, 
    /* is @sindresorhus/is.@sindresorhus/is.Class<unknown> */ Boolean
  ] = js.native
  var dataView: js.Function1[/* value */ js.Any, /* is std.DataView */ Boolean] = js.native
  var date: js.Function1[/* value */ js.Any, /* is std.Date */ Boolean] = js.native
  var directInstanceOf: js.Function2[/* instance */ js.Any, /* class_ */ Class[js.Any], /* is any */ Boolean] = js.native
  var domElement: js.Function1[/* value */ js.Any, /* is std.Element */ Boolean] = js.native
  var emptyArray: js.Function1[/* value */ js.Any, /* is std.Array<never> */ Boolean] = js.native
  var emptyMap: js.Function1[/* value */ js.Any, /* is std.Map<never, never> */ Boolean] = js.native
  var emptyObject: js.Function1[/* value */ js.Any, Boolean] = js.native
  var emptySet: js.Function1[/* value */ js.Any, /* is std.Set<never> */ Boolean] = js.native
  var emptyString: js.Function1[/* value */ js.Any, Boolean] = js.native
  var emptyStringOrWhitespace: js.Function1[/* value */ js.Any, /* is string */ Boolean] = js.native
  var error: js.Function1[/* value */ js.Any, /* is std.Error */ Boolean] = js.native
  var evenInteger: js.Function1[/* value */ Double, /* is number */ Boolean] = js.native
  var falsy: js.Function1[/* value */ js.Any, Boolean] = js.native
  var float32Array: js.Function1[/* value */ js.Any, /* is std.Float32Array */ Boolean] = js.native
  var float64Array: js.Function1[/* value */ js.Any, /* is std.Float64Array */ Boolean] = js.native
  var function_ : js.Function1[/* value */ js.Any, /* is std.Function */ Boolean] = js.native
  var generator: js.Function1[/* value */ js.Any, /* is std.Generator<unknown, any, unknown> */ Boolean] = js.native
  var generatorFunction: js.Function1[/* value */ js.Any, /* is std.GeneratorFunction */ Boolean] = js.native
  var inRange: js.Function2[/* value */ Double, /* range */ Double | js.Array[Double], /* is number */ Boolean] = js.native
  var infinite: js.Function1[/* value */ js.Any, /* is number */ Boolean] = js.native
  var int16Array: js.Function1[/* value */ js.Any, /* is std.Int16Array */ Boolean] = js.native
  var int32Array: js.Function1[/* value */ js.Any, /* is std.Int32Array */ Boolean] = js.native
  var int8Array: js.Function1[/* value */ js.Any, /* is std.Int8Array */ Boolean] = js.native
  var integer: js.Function1[/* value */ js.Any, /* is number */ Boolean] = js.native
  var iterable: js.Function1[/* value */ js.Any, /* is std.IterableIterator<unknown> */ Boolean] = js.native
  var map: js.Function1[/* value */ js.Any, /* is std.Map<unknown, unknown> */ Boolean] = js.native
  var nan: js.Function1[/* value */ js.Any, Boolean] = js.native
  var nativePromise: js.Function1[/* value */ js.Any, /* is std.Promise<unknown> */ Boolean] = js.native
  var nodeStream: js.Function1[/* value */ js.Any, /* is @sindresorhus/is.@sindresorhus/is.NodeStream */ Boolean] = js.native
  var nonEmptyArray: js.Function1[/* value */ js.Any, /* is std.Array<unknown> */ Boolean] = js.native
  var nonEmptyMap: js.Function1[/* value */ js.Any, /* is std.Map<unknown, unknown> */ Boolean] = js.native
  var nonEmptyObject: js.Function1[/* value */ js.Any, Boolean] = js.native
  var nonEmptySet: js.Function1[/* value */ js.Any, /* is std.Set<unknown> */ Boolean] = js.native
  var nonEmptyString: js.Function1[/* value */ js.Any, /* is string */ Boolean] = js.native
  var nullOrUndefined: js.Function1[/* value */ js.Any, Boolean] = js.native
  var null_ : js.Function1[/* value */ js.Any, /* is null */ Boolean] = js.native
  var number: js.Function1[/* value */ js.Any, /* is number */ Boolean] = js.native
  var numericString: js.Function1[/* value */ js.Any, /* is string */ Boolean] = js.native
  var `object`: js.Function1[/* value */ js.Any, /* is object */ Boolean] = js.native
  var observable: js.Function1[
    /* value */ js.Any, 
    /* is @sindresorhus/is.@sindresorhus/is.ObservableLike */ Boolean
  ] = js.native
  var oddInteger: js.Function1[/* value */ Double, /* is number */ Boolean] = js.native
  var plainObject: js.Function1[/* value */ js.Any, Boolean] = js.native
  var primitive: js.Function1[/* value */ js.Any, /* is @sindresorhus/is.@sindresorhus/is.Primitive */ Boolean] = js.native
  var promise: js.Function1[/* value */ js.Any, /* is std.Promise<unknown> */ Boolean] = js.native
  var regExp: js.Function1[/* value */ js.Any, /* is std.RegExp */ Boolean] = js.native
  var safeInteger: js.Function1[/* value */ js.Any, /* is number */ Boolean] = js.native
  var set: js.Function1[/* value */ js.Any, /* is std.Set<unknown> */ Boolean] = js.native
  var sharedArrayBuffer: js.Function1[/* value */ js.Any, /* is std.SharedArrayBuffer */ Boolean] = js.native
  var string: js.Function1[/* value */ js.Any, /* is string */ Boolean] = js.native
  var symbol: js.Function1[/* value */ js.Any, /* is symbol */ Boolean] = js.native
  var truthy: js.Function1[/* value */ js.Any, Boolean] = js.native
  var typedArray: js.Function1[/* value */ js.Any, /* is @sindresorhus/is.@sindresorhus/is.TypedArray */ Boolean] = js.native
  var uint16Array: js.Function1[/* value */ js.Any, /* is std.Uint16Array */ Boolean] = js.native
  var uint32Array: js.Function1[/* value */ js.Any, /* is std.Uint32Array */ Boolean] = js.native
  var uint8Array: js.Function1[/* value */ js.Any, /* is std.Uint8Array */ Boolean] = js.native
  var uint8ClampedArray: js.Function1[/* value */ js.Any, /* is std.Uint8ClampedArray */ Boolean] = js.native
  var undefined: js.Function1[/* value */ js.Any, /* is undefined */ Boolean] = js.native
  var urlInstance: js.Function1[/* value */ js.Any, /* is std.URL */ Boolean] = js.native
  var urlString: js.Function1[/* value */ js.Any, /* is string */ Boolean] = js.native
  var weakMap: js.Function1[/* value */ js.Any, /* is std.WeakMap<object, unknown> */ Boolean] = js.native
  var weakSet: js.Function1[/* value */ js.Any, /* is std.WeakSet<object> */ Boolean] = js.native
}

