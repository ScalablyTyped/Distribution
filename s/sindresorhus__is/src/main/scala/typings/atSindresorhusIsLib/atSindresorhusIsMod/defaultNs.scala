package typings
package atSindresorhusIsLib.atSindresorhusIsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@sindresorhus/is", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  var all: js.Function2[
    /* predicate */ atSindresorhusIsLib.atSindresorhusIsMod.Predicate, 
    /* repeated */ js.Any, 
    scala.Boolean
  ] = js.native
  var any: js.Function2[
    /* predicate */ atSindresorhusIsLib.atSindresorhusIsMod.Predicate, 
    /* repeated */ js.Any, 
    scala.Boolean
  ] = js.native
  var array: js.Function1[/* arg */ js.Any, /* is std.Array<any> */ scala.Boolean] = js.native
  var arrayBuffer: js.Function1[/* value */ js.Any, /* is std.ArrayBuffer */ scala.Boolean] = js.native
  var arrayLike: js.Function1[
    /* value */ js.Any, 
    /* is @sindresorhus/is.@sindresorhus/is.ArrayLike<unknown> */ scala.Boolean
  ] = js.native
  var asyncFunction: js.Function1[/* value */ js.Any, /* is std.Function */ scala.Boolean] = js.native
  var asyncIterable: js.Function1[/* value */ js.Any, /* is std.AsyncIterableIterator<unknown> */ scala.Boolean] = js.native
  var boolean: js.Function1[/* value */ js.Any, /* is boolean */ scala.Boolean] = js.native
  var boundFunction: js.Function1[/* value */ js.Any, /* is std.Function */ scala.Boolean] = js.native
  var buffer: js.Function1[/* value */ js.Any, /* is node.Buffer */ scala.Boolean] = js.native
  var class_ : js.Function1[
    /* value */ js.Any, 
    /* is @sindresorhus/is.@sindresorhus/is.Class<unknown> */ scala.Boolean
  ] = js.native
  var dataView: js.Function1[/* value */ js.Any, /* is std.DataView */ scala.Boolean] = js.native
  var date: js.Function1[/* value */ js.Any, /* is std.Date */ scala.Boolean] = js.native
  var directInstanceOf: js.Function2[
    /* instance */ js.Any, 
    /* klass */ atSindresorhusIsLib.atSindresorhusIsMod.Class[js.Any], 
    /* is any */ scala.Boolean
  ] = js.native
  var domElement: js.Function1[/* value */ js.Any, /* is std.Element */ scala.Boolean] = js.native
  var emptyArray: js.Function1[/* value */ js.Any, /* is std.Array<never> */ scala.Boolean] = js.native
  var emptyMap: js.Function1[/* value */ js.Any, /* is std.Map<never, never> */ scala.Boolean] = js.native
  var emptyObject: js.Function1[/* value */ js.Any, scala.Boolean] = js.native
  var emptySet: js.Function1[/* value */ js.Any, /* is std.Set<never> */ scala.Boolean] = js.native
  var emptyString: js.Function1[/* value */ js.Any, scala.Boolean] = js.native
  var emptyStringOrWhitespace: js.Function1[/* value */ js.Any, /* is string */ scala.Boolean] = js.native
  var error: js.Function1[/* value */ js.Any, /* is std.Error */ scala.Boolean] = js.native
  var evenInteger: js.Function1[/* value */ scala.Double, /* is number */ scala.Boolean] = js.native
  var falsy: js.Function1[/* value */ js.Any, scala.Boolean] = js.native
  var float32Array: js.Function1[/* value */ js.Any, /* is std.Float32Array */ scala.Boolean] = js.native
  var float64Array: js.Function1[/* value */ js.Any, /* is std.Float64Array */ scala.Boolean] = js.native
  var function_ : js.Function1[/* value */ js.Any, /* is std.Function */ scala.Boolean] = js.native
  var generator: js.Function1[/* value */ js.Any, /* is std.Generator */ scala.Boolean] = js.native
  var generatorFunction: js.Function1[/* value */ js.Any, /* is std.GeneratorFunction */ scala.Boolean] = js.native
  var inRange: js.Function2[
    /* value */ scala.Double, 
    /* range */ scala.Double | js.Array[scala.Double], 
    /* is number */ scala.Boolean
  ] = js.native
  var infinite: js.Function1[/* value */ js.Any, /* is number */ scala.Boolean] = js.native
  var int16Array: js.Function1[/* value */ js.Any, /* is std.Int16Array */ scala.Boolean] = js.native
  var int32Array: js.Function1[/* value */ js.Any, /* is std.Int32Array */ scala.Boolean] = js.native
  var int8Array: js.Function1[/* value */ js.Any, /* is std.Int8Array */ scala.Boolean] = js.native
  var integer: js.Function1[/* value */ js.Any, /* is number */ scala.Boolean] = js.native
  var iterable: js.Function1[/* value */ js.Any, /* is std.IterableIterator<unknown> */ scala.Boolean] = js.native
  var map: js.Function1[/* value */ js.Any, /* is std.Map<unknown, unknown> */ scala.Boolean] = js.native
  var nan: js.Function1[/* value */ js.Any, scala.Boolean] = js.native
  var nativePromise: js.Function1[/* value */ js.Any, /* is std.Promise<unknown> */ scala.Boolean] = js.native
  var nodeStream: js.Function1[
    /* value */ js.Any, 
    /* is @sindresorhus/is.@sindresorhus/is.NodeStream */ scala.Boolean
  ] = js.native
  var nonEmptyArray: js.Function1[/* value */ js.Any, /* is std.Array<unknown> */ scala.Boolean] = js.native
  var nonEmptyMap: js.Function1[/* value */ js.Any, /* is std.Map<unknown, unknown> */ scala.Boolean] = js.native
  var nonEmptyObject: js.Function1[/* value */ js.Any, scala.Boolean] = js.native
  var nonEmptySet: js.Function1[/* value */ js.Any, /* is std.Set<unknown> */ scala.Boolean] = js.native
  var nonEmptyString: js.Function1[/* value */ js.Any, /* is string */ scala.Boolean] = js.native
  var nullOrUndefined: js.Function1[/* value */ js.Any, scala.Boolean] = js.native
  var null_ : js.Function1[/* value */ js.Any, /* is null */ scala.Boolean] = js.native
  var number: js.Function1[/* value */ js.Any, /* is number */ scala.Boolean] = js.native
  var numericString: js.Function1[/* value */ js.Any, /* is string */ scala.Boolean] = js.native
  var `object`: js.Function1[/* value */ js.Any, /* is object */ scala.Boolean] = js.native
  var observable: js.Function1[
    /* value */ js.Any, 
    /* is @sindresorhus/is.@sindresorhus/is.ObservableLike */ scala.Boolean
  ] = js.native
  var oddInteger: js.Function1[/* value */ scala.Double, /* is number */ scala.Boolean] = js.native
  var plainObject: js.Function1[/* value */ js.Any, scala.Boolean] = js.native
  var primitive: js.Function1[
    /* value */ js.Any, 
    /* is @sindresorhus/is.@sindresorhus/is.Primitive */ scala.Boolean
  ] = js.native
  var promise: js.Function1[/* value */ js.Any, /* is std.Promise<unknown> */ scala.Boolean] = js.native
  var regExp: js.Function1[/* value */ js.Any, /* is std.RegExp */ scala.Boolean] = js.native
  var safeInteger: js.Function1[/* value */ js.Any, /* is number */ scala.Boolean] = js.native
  var set: js.Function1[/* value */ js.Any, /* is std.Set<unknown> */ scala.Boolean] = js.native
  var sharedArrayBuffer: js.Function1[/* value */ js.Any, /* is std.SharedArrayBuffer */ scala.Boolean] = js.native
  var string: js.Function1[/* value */ js.Any, /* is string */ scala.Boolean] = js.native
  var symbol: js.Function1[/* value */ js.Any, /* is symbol */ scala.Boolean] = js.native
  var truthy: js.Function1[/* value */ js.Any, scala.Boolean] = js.native
  var typedArray: js.Function1[
    /* value */ js.Any, 
    /* is @sindresorhus/is.@sindresorhus/is.TypedArray */ scala.Boolean
  ] = js.native
  var uint16Array: js.Function1[/* value */ js.Any, /* is std.Uint16Array */ scala.Boolean] = js.native
  var uint32Array: js.Function1[/* value */ js.Any, /* is std.Uint32Array */ scala.Boolean] = js.native
  var uint8Array: js.Function1[/* value */ js.Any, /* is std.Uint8Array */ scala.Boolean] = js.native
  var uint8ClampedArray: js.Function1[/* value */ js.Any, /* is std.Uint8ClampedArray */ scala.Boolean] = js.native
  var undefined: js.Function1[/* value */ js.Any, /* is undefined */ scala.Boolean] = js.native
  var urlInstance: js.Function1[/* value */ js.Any, /* is std.URL */ scala.Boolean] = js.native
  var urlString: js.Function1[/* value */ js.Any, /* is string */ scala.Boolean] = js.native
  var weakMap: js.Function1[/* value */ js.Any, /* is std.WeakMap<object, unknown> */ scala.Boolean] = js.native
  var weakSet: js.Function1[/* value */ js.Any, /* is std.WeakSet<object> */ scala.Boolean] = js.native
}

