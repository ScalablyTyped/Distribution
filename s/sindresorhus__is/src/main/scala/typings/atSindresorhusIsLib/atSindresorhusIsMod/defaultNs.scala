package typings
package atSindresorhusIsLib.atSindresorhusIsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@sindresorhus/is", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  def all(predicate: js.Any, values: js.Any*): scala.Boolean = js.native
  def any(predicate: js.Any, values: js.Any*): scala.Boolean = js.native
  def array(arg: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
  def arrayBuffer(value: js.Any): /* is std.ArrayBuffer */ scala.Boolean = js.native
  def arrayLike(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.ArrayLike */ scala.Boolean = js.native
  def asyncFunction(value: js.Any): /* is std.Function */ scala.Boolean = js.native
  def asyncIterable(value: js.Any): /* is std.AsyncIterableIterator<unknown> */ scala.Boolean = js.native
  def boolean(value: js.Any): /* is boolean */ scala.Boolean = js.native
  def boundFunction(value: js.Any): /* is std.Function */ scala.Boolean = js.native
  def buffer(input: js.Any): /* is node.Buffer */ scala.Boolean = js.native
  def class_(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.Class<unknown> */ scala.Boolean = js.native
  def dataView(value: js.Any): /* is std.DataView */ scala.Boolean = js.native
  def date(value: js.Any): /* is std.Date */ scala.Boolean = js.native
  def directInstanceOf[T](instance: js.Any, klass: atSindresorhusIsLib.atSindresorhusIsMod.Class[T]): /* is T */ scala.Boolean = js.native
  def domElement(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.DomElement */ scala.Boolean = js.native
  def emptyArray(value: js.Any): scala.Boolean = js.native
  def emptyMap(value: js.Any): scala.Boolean = js.native
  def emptyObject(value: js.Any): scala.Boolean = js.native
  def emptySet(value: js.Any): scala.Boolean = js.native
  def emptyString(value: js.Any): scala.Boolean = js.native
  def emptyStringOrWhitespace(value: js.Any): scala.Boolean = js.native
  def error(value: js.Any): /* is std.Error */ scala.Boolean = js.native
  def even(value: scala.Double): scala.Boolean = js.native
  def falsy(value: js.Any): scala.Boolean = js.native
  def float32Array(value: js.Any): /* is std.Float32Array */ scala.Boolean = js.native
  def float64Array(value: js.Any): /* is std.Float64Array */ scala.Boolean = js.native
  def function_(value: js.Any): /* is std.Function */ scala.Boolean = js.native
  def generator(value: js.Any): /* is std.Generator */ scala.Boolean = js.native
  def generatorFunction(value: js.Any): /* is std.GeneratorFunction */ scala.Boolean = js.native
  def inRange(value: scala.Double, range: js.Array[scala.Double]): scala.Boolean = js.native
  def inRange(value: scala.Double, range: scala.Double): scala.Boolean = js.native
  def infinite(value: js.Any): scala.Boolean = js.native
  def int16Array(value: js.Any): /* is std.Int16Array */ scala.Boolean = js.native
  def int32Array(value: js.Any): /* is std.Int32Array */ scala.Boolean = js.native
  def int8Array(value: js.Any): /* is std.Int8Array */ scala.Boolean = js.native
  def integer(value: js.Any): /* is number */ scala.Boolean = js.native
  def iterable(value: js.Any): /* is std.IterableIterator<unknown> */ scala.Boolean = js.native
  def map(value: js.Any): /* is std.Map<unknown, unknown> */ scala.Boolean = js.native
  def nan(value: js.Any): scala.Boolean = js.native
  def nativePromise(value: js.Any): /* is std.Promise<unknown> */ scala.Boolean = js.native
  def nodeStream(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.NodeStream */ scala.Boolean = js.native
  def nonEmptyArray(value: js.Any): scala.Boolean = js.native
  def nonEmptyMap(value: js.Any): scala.Boolean = js.native
  def nonEmptyObject(value: js.Any): scala.Boolean = js.native
  def nonEmptySet(value: js.Any): scala.Boolean = js.native
  def nonEmptyString(value: js.Any): scala.Boolean = js.native
  def nullOrUndefined(value: js.Any): scala.Boolean = js.native
  def null_(value: js.Any): /* is null */ scala.Boolean = js.native
  def number(value: js.Any): /* is number */ scala.Boolean = js.native
  def numericString(value: js.Any): scala.Boolean = js.native
  def `object`(value: js.Any): /* is object */ scala.Boolean = js.native
  def observable(value: js.Any): scala.Boolean = js.native
  def odd(value: scala.Double): scala.Boolean = js.native
  def plainObject(value: js.Any): scala.Boolean = js.native
  def primitive(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.Primitive */ scala.Boolean = js.native
  def promise(value: js.Any): /* is std.Promise<unknown> */ scala.Boolean = js.native
  def regExp(value: js.Any): /* is std.RegExp */ scala.Boolean = js.native
  def safeInteger(value: js.Any): /* is number */ scala.Boolean = js.native
  def set(value: js.Any): /* is std.Set<unknown> */ scala.Boolean = js.native
  def sharedArrayBuffer(value: js.Any): /* is std.SharedArrayBuffer */ scala.Boolean = js.native
  def string(value: js.Any): /* is string */ scala.Boolean = js.native
  def symbol(value: js.Any): /* is std.Symbol */ scala.Boolean = js.native
  def truthy(value: js.Any): scala.Boolean = js.native
  def typedArray(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.TypedArray */ scala.Boolean = js.native
  def uint16Array(value: js.Any): /* is std.Uint16Array */ scala.Boolean = js.native
  def uint32Array(value: js.Any): /* is std.Uint32Array */ scala.Boolean = js.native
  def uint8Array(value: js.Any): /* is std.Uint8Array */ scala.Boolean = js.native
  def uint8ClampedArray(value: js.Any): /* is std.Uint8ClampedArray */ scala.Boolean = js.native
  def undefined(value: js.Any): /* is undefined */ scala.Boolean = js.native
  def urlInstance(value: js.Any): /* is std.URL */ scala.Boolean = js.native
  def urlString(value: js.Any): scala.Boolean = js.native
  def weakMap(value: js.Any): /* is std.WeakMap<object, unknown> */ scala.Boolean = js.native
  def weakSet(value: js.Any): /* is std.WeakSet<object> */ scala.Boolean = js.native
}

