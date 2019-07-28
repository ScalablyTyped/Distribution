package typings.skatejs

import typings.skatejs.typesMod.PropOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Any extends js.Object {
  @JSName("any")
  var any_Original: PropOptions[_] with PropertyDecorator = js.native
  @JSName("array")
  var array_Original: PropOptions[js.Array[_]] with PropertyDecorator = js.native
  @JSName("boolean")
  var boolean_Original: PropOptions[Boolean] with PropertyDecorator = js.native
  @JSName("number")
  var number_Original: PropOptions[Double] with PropertyDecorator = js.native
  @JSName("object")
  var object_Original: PropOptions[js.Object] with PropertyDecorator = js.native
  @JSName("string")
  var string_Original: PropOptions[String] with PropertyDecorator = js.native
  def any(target: js.Object, propertyKey: String): Unit = js.native
  def any(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  def array(target: js.Object, propertyKey: String): Unit = js.native
  def array(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  def boolean(target: js.Object, propertyKey: String): Unit = js.native
  def boolean(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  def number(target: js.Object, propertyKey: String): Unit = js.native
  def number(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  def `object`(target: js.Object, propertyKey: String): Unit = js.native
  def `object`(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  def string(target: js.Object, propertyKey: String): Unit = js.native
  def string(target: js.Object, propertyKey: js.Symbol): Unit = js.native
}

