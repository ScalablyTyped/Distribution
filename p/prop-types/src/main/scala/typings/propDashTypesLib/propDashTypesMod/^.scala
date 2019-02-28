package typings
package propDashTypesLib.propDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prop-types", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val any: propDashTypesLib.propDashTypesMod.Requireable[js.Any] = js.native
  val array: propDashTypesLib.propDashTypesMod.Requireable[js.Array[js.Any]] = js.native
  val bool: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean] = js.native
  val element: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactElementLike] = js.native
  val elementType: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactComponentLike] = js.native
  val func: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
  val node: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike] = js.native
  val nominalTypeHack: js.Symbol = js.native
  val number: propDashTypesLib.propDashTypesMod.Requireable[scala.Double] = js.native
  val `object`: propDashTypesLib.propDashTypesMod.Requireable[js.Object] = js.native
  val string: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String] = js.native
  val symbol: propDashTypesLib.propDashTypesMod.Requireable[js.Symbol] = js.native
  def arrayOf[T](`type`: propDashTypesLib.propDashTypesMod.Validator[T]): propDashTypesLib.propDashTypesMod.Requireable[js.Array[T]] = js.native
  def checkPropTypes(typeSpecs: js.Any, values: js.Any, location: java.lang.String, componentName: java.lang.String): scala.Unit = js.native
  def checkPropTypes(
    typeSpecs: js.Any,
    values: js.Any,
    location: java.lang.String,
    componentName: java.lang.String,
    getStack: js.Function0[_]
  ): scala.Unit = js.native
  def exact[P /* <: propDashTypesLib.propDashTypesMod.ValidationMap[_] */](`type`: P): propDashTypesLib.propDashTypesMod.Requireable[stdLib.Required[propDashTypesLib.propDashTypesMod.InferProps[P]]] = js.native
  def instanceOf[T](expectedClass: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def objectOf[T](`type`: propDashTypesLib.propDashTypesMod.Validator[T]): propDashTypesLib.propDashTypesMod.Requireable[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof any ]: T}
    */ propDashTypesLib.propDashTypesLibStrings.objectOf with js.Any
  ] = js.native
  def oneOf[T](types: js.Array[T]): propDashTypesLib.propDashTypesMod.Requireable[T] = js.native
  def oneOfType[T /* <: propDashTypesLib.propDashTypesMod.Validator[_] */](types: js.Array[T]): propDashTypesLib.propDashTypesMod.Requireable[stdLib.NonNullable[propDashTypesLib.propDashTypesMod.InferType[T]]] = js.native
  def resetWarningCache(): scala.Unit = js.native
  def shape[P /* <: propDashTypesLib.propDashTypesMod.ValidationMap[_] */](`type`: P): propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.InferProps[P]] = js.native
}

