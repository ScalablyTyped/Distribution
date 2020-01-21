package typings.sindresorhusIs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@sindresorhus/is", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(value: js.Any): TypeName = js.native
  def all(predicate: js.Any*): js.Any = js.native
  def any(predicate: js.Any*): js.Any = js.native
  def array(arg: js.Any): /* is std.Array<any> */ Boolean = js.native
  def arrayBuffer(value: js.Any): Boolean = js.native
  def arrayLike(value: js.Any): Boolean = js.native
  def asyncFunction(value: js.Any): Boolean = js.native
  def boolean(value: js.Any): Boolean = js.native
  def boundFunction(value: js.Any): Boolean = js.native
  def buffer(obj: js.Any): /* is node.Buffer */ Boolean = js.native
  @JSName("class_")
  def `class`(value: js.Any): js.Any = js.native
  def dataView(value: js.Any): Boolean = js.native
  def date(value: js.Any): Boolean = js.native
  def directInstanceOf(instance: js.Any, klass: js.Any): Boolean = js.native
  def domElement(value: js.Any): Boolean = js.native
  def empty(value: js.Any): Boolean = js.native
  def emptyOrWhitespace(value: js.Any): Boolean = js.native
  def error(value: js.Any): Boolean = js.native
  def even(rem: Double): Boolean = js.native
  def falsy(value: js.Any): Boolean = js.native
  def float32Array(value: js.Any): Boolean = js.native
  def float64Array(value: js.Any): Boolean = js.native
  @JSName("function_")
  def function(value: js.Any): Boolean = js.native
  def generator(value: js.Any): Boolean = js.native
  def generatorFunction(value: js.Any): Boolean = js.native
  def inRange(value: Double, range: js.Array[Double]): Boolean = js.native
  def inRange(value: Double, range: Double): Boolean = js.native
  def infinite(value: js.Any): Boolean = js.native
  def int16Array(value: js.Any): Boolean = js.native
  def int32Array(value: js.Any): Boolean = js.native
  def int8Array(value: js.Any): Boolean = js.native
  def integer(value: js.Any): Boolean = js.native
  def iterable(value: js.Any): Boolean = js.native
  def map(value: js.Any): Boolean = js.native
  def nan(value: js.Any): Boolean = js.native
  def nativePromise(value: js.Any): Boolean = js.native
  def nodeStream(value: js.Any): Boolean = js.native
  @JSName("null_")
  def `null`(value: js.Any): Boolean = js.native
  def nullOrUndefined(value: js.Any): Boolean = js.native
  def number(value: js.Any): Boolean = js.native
  def `object`(value: js.Any): Boolean = js.native
  def odd(rem: Double): Boolean = js.native
  def plainObject(value: js.Any): Boolean = js.native
  def primitive(value: js.Any): Boolean = js.native
  def promise(value: js.Any): Boolean = js.native
  def regExp(value: js.Any): Boolean = js.native
  def safeInteger(value: js.Any): Boolean = js.native
  def set(value: js.Any): Boolean = js.native
  def sharedArrayBuffer(value: js.Any): Boolean = js.native
  def string(value: js.Any): Boolean = js.native
  def symbol(value: js.Any): Boolean = js.native
  def truthy(value: js.Any): Boolean = js.native
  def typedArray(value: js.Any): Boolean = js.native
  def uint16Array(value: js.Any): Boolean = js.native
  def uint32Array(value: js.Any): Boolean = js.native
  def uint8Array(value: js.Any): Boolean = js.native
  def uint8ClampedArray(value: js.Any): Boolean = js.native
  def undefined(value: js.Any): Boolean = js.native
  def weakMap(value: js.Any): Boolean = js.native
  def weakSet(value: js.Any): Boolean = js.native
}

