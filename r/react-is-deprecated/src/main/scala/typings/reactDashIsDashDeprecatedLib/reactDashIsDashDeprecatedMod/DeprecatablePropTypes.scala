package typings
package reactDashIsDashDeprecatedLib.reactDashIsDashDeprecatedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Unfortunately this copy-paste must happen -- I can't just take PropTypes and programmatically
// define a version that intersects in the Deprecatable interface into the keys.
@js.native
trait DeprecatablePropTypes extends js.Object {
  @JSName("any")
  var any_Original: reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  @JSName("array")
  var array_Original: reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  @JSName("bool")
  var bool_Original: reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  @JSName("element")
  var element_Original: reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  @JSName("func")
  var func_Original: reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  @JSName("node")
  var node_Original: reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  @JSName("number")
  var number_Original: reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  @JSName("object")
  var object_Original: reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  @JSName("string")
  var string_Original: reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  def any(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def array(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def arrayOf(`type`: reactLib.reactMod.Validator[_]): reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  def bool(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def element(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def func(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def instanceOf(expectedClass: js.Object): reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  def node(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def number(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def `object`(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def objectOf(`type`: reactLib.reactMod.Validator[_]): reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  def oneOf(types: js.Array[_]): reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  def oneOfType(types: js.Array[reactLib.reactMod.Validator[_]]): reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  def shape(`type`: reactLib.reactMod.ValidationMap[_]): reactLib.reactMod.Requireable[_] with Deprecatable[_] = js.native
  def string(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

