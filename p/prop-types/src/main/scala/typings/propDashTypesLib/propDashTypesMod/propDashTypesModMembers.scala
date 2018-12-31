package typings
package propDashTypesLib.propDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prop-types", JSImport.Namespace)
@js.native
object propDashTypesModMembers extends js.Object {
  val any: Requireable[js.Any] = js.native
  val array: Requireable[js.Array[js.Any]] = js.native
  val bool: Requireable[scala.Boolean] = js.native
  val element: Requireable[ReactElementLike] = js.native
  val func: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
  val node: Requireable[ReactNodeLike] = js.native
  val nominalTypeHack: js.Symbol = js.native
  val number: Requireable[scala.Double] = js.native
  val `object`: Requireable[js.Object] = js.native
  val string: Requireable[java.lang.String] = js.native
  val symbol: Requireable[js.Symbol] = js.native
  def arrayOf[T](`type`: Validator[T]): Requireable[js.Array[T]] = js.native
  def checkPropTypes(typeSpecs: js.Any, values: js.Any, location: java.lang.String, componentName: java.lang.String): scala.Unit = js.native
  def checkPropTypes(
    typeSpecs: js.Any,
    values: js.Any,
    location: java.lang.String,
    componentName: java.lang.String,
    getStack: js.Function0[_]
  ): scala.Unit = js.native
  def exact[P /* <: ValidationMap[_] */](`type`: P): Requireable[stdLib.Required[InferProps[P]]] = js.native
  def instanceOf[T](expectedClass: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]): Requireable[T] = js.native
  def objectOf[T](`type`: Validator[T]): Requireable[propDashTypesLib.propDashTypesLibStrings.objectOf with js.Any] = js.native
  def oneOf[T](types: js.Array[T]): Requireable[T] = js.native
  def oneOfType[T /* <: Validator[_] */](types: js.Array[T]): Requireable[stdLib.NonNullable[InferType[T]]] = js.native
  def shape[P /* <: ValidationMap[_] */](`type`: P): Requireable[InferProps[P]] = js.native
}

