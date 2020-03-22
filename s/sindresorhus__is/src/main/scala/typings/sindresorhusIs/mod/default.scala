package typings.sindresorhusIs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@sindresorhus/is", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(value: js.Any): TypeName = js.native
  def all(predicate: js.Any, values: js.Any*): Boolean = js.native
  def any(predicate: js.Any, values: js.Any*): Boolean = js.native
  def array(arg: js.Any): /* is std.Array<any> */ Boolean = js.native
  def arrayBuffer(value: js.Any): /* is std.ArrayBuffer */ Boolean = js.native
  def arrayLike(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.ArrayLike */ Boolean = js.native
  def asyncFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  def asyncIterable(value: js.Any): /* is std.AsyncIterableIterator<unknown> */ Boolean = js.native
  def boolean(value: js.Any): /* is boolean */ Boolean = js.native
  def boundFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  def buffer(input: js.Any): /* is node.Buffer */ Boolean = js.native
  @JSName("class_")
  def `class`(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.Class<unknown> */ Boolean = js.native
  def dataView(value: js.Any): /* is std.DataView */ Boolean = js.native
  def date(value: js.Any): /* is std.Date */ Boolean = js.native
  def directInstanceOf[T](instance: js.Any, klass: Class[T]): /* is T */ Boolean = js.native
  def domElement(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.DomElement */ Boolean = js.native
  def emptyArray(value: js.Any): Boolean = js.native
  def emptyMap(value: js.Any): Boolean = js.native
  def emptyObject(value: js.Any): Boolean = js.native
  def emptySet(value: js.Any): Boolean = js.native
  def emptyString(value: js.Any): Boolean = js.native
  def emptyStringOrWhitespace(value: js.Any): Boolean = js.native
  def error(value: js.Any): /* is std.Error */ Boolean = js.native
  def even(value: Double): Boolean = js.native
  def falsy(value: js.Any): Boolean = js.native
  def float32Array(value: js.Any): /* is std.Float32Array */ Boolean = js.native
  def float64Array(value: js.Any): /* is std.Float64Array */ Boolean = js.native
  @JSName("function_")
  def function(value: js.Any): /* is std.Function */ Boolean = js.native
  def generator(value: js.Any): /* is std.Generator<unknown, any, unknown> */ Boolean = js.native
  def generatorFunction(value: js.Any): /* is std.GeneratorFunction */ Boolean = js.native
  def inRange(value: Double, range: js.Array[Double]): Boolean = js.native
  def inRange(value: Double, range: Double): Boolean = js.native
  def infinite(value: js.Any): Boolean = js.native
  def int16Array(value: js.Any): /* is std.Int16Array */ Boolean = js.native
  def int32Array(value: js.Any): /* is std.Int32Array */ Boolean = js.native
  def int8Array(value: js.Any): /* is std.Int8Array */ Boolean = js.native
  def integer(value: js.Any): /* is number */ Boolean = js.native
  def iterable(value: js.Any): /* is std.IterableIterator<unknown> */ Boolean = js.native
  def map(value: js.Any): /* is std.Map<unknown, unknown> */ Boolean = js.native
  def nan(value: js.Any): Boolean = js.native
  def nativePromise(value: js.Any): /* is std.Promise<unknown> */ Boolean = js.native
  def nodeStream(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.NodeStream */ Boolean = js.native
  def nonEmptyArray(value: js.Any): Boolean = js.native
  def nonEmptyMap(value: js.Any): Boolean = js.native
  def nonEmptyObject(value: js.Any): Boolean = js.native
  def nonEmptySet(value: js.Any): Boolean = js.native
  def nonEmptyString(value: js.Any): Boolean = js.native
  @JSName("null_")
  def `null`(value: js.Any): /* is null */ Boolean = js.native
  def nullOrUndefined(value: js.Any): Boolean = js.native
  def number(value: js.Any): /* is number */ Boolean = js.native
  def numericString(value: js.Any): Boolean = js.native
  def `object`(value: js.Any): /* is object */ Boolean = js.native
  def observable(value: js.Any): Boolean = js.native
  def odd(value: Double): Boolean = js.native
  def plainObject(value: js.Any): Boolean = js.native
  def primitive(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.Primitive */ Boolean = js.native
  def promise(value: js.Any): /* is std.Promise<unknown> */ Boolean = js.native
  def regExp(value: js.Any): /* is std.RegExp */ Boolean = js.native
  def safeInteger(value: js.Any): /* is number */ Boolean = js.native
  def set(value: js.Any): /* is std.Set<unknown> */ Boolean = js.native
  def sharedArrayBuffer(value: js.Any): /* is std.SharedArrayBuffer */ Boolean = js.native
  def string(value: js.Any): /* is string */ Boolean = js.native
  def symbol(value: js.Any): /* is std.Symbol */ Boolean = js.native
  def truthy(value: js.Any): Boolean = js.native
  def typedArray(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.TypedArray */ Boolean = js.native
  def uint16Array(value: js.Any): /* is std.Uint16Array */ Boolean = js.native
  def uint32Array(value: js.Any): /* is std.Uint32Array */ Boolean = js.native
  def uint8Array(value: js.Any): /* is std.Uint8Array */ Boolean = js.native
  def uint8ClampedArray(value: js.Any): /* is std.Uint8ClampedArray */ Boolean = js.native
  def undefined(value: js.Any): /* is undefined */ Boolean = js.native
  def urlInstance(value: js.Any): /* is std.URL */ Boolean = js.native
  def urlString(value: js.Any): Boolean = js.native
  def weakMap(value: js.Any): /* is std.WeakMap<object, unknown> */ Boolean = js.native
  def weakSet(value: js.Any): /* is std.WeakSet<object> */ Boolean = js.native
}

