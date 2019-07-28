package typings.propDashTypes.propDashTypesMod

import org.scalablytyped.runtime.Instantiable1
import typings.std.NonNullable
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prop-types", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val any: Requireable[js.Any] = js.native
  val array: Requireable[js.Array[js.Any]] = js.native
  val bool: Requireable[Boolean] = js.native
  val element: Requireable[ReactElementLike] = js.native
  val elementType: Requireable[ReactComponentLike] = js.native
  val func: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
  val node: Requireable[ReactNodeLike] = js.native
  val nominalTypeHack: js.Symbol = js.native
  val number: Requireable[Double] = js.native
  val `object`: Requireable[js.Object] = js.native
  val string: Requireable[String] = js.native
  val symbol: Requireable[js.Symbol] = js.native
  def arrayOf[T](`type`: Validator[T]): Requireable[js.Array[T]] = js.native
  def checkPropTypes(typeSpecs: js.Any, values: js.Any, location: String, componentName: String): Unit = js.native
  def checkPropTypes(
    typeSpecs: js.Any,
    values: js.Any,
    location: String,
    componentName: String,
    getStack: js.Function0[_]
  ): Unit = js.native
  def exact[P /* <: ValidationMap[_] */](`type`: P): Requireable[Required[InferProps[P]]] = js.native
  def instanceOf[T](expectedClass: Instantiable1[/* args (repeated) */ js.Any, T]): Requireable[T] = js.native
  def objectOf[T](`type`: Validator[T]): Requireable[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof any ]: T}
    */ typings.propDashTypes.propDashTypesStrings.objectOf with js.Any
  ] = js.native
  def oneOf[T](types: js.Array[T]): Requireable[T] = js.native
  def oneOfType[T /* <: Validator[_] */](types: js.Array[T]): Requireable[NonNullable[InferType[T]]] = js.native
  def resetWarningCache(): Unit = js.native
  def shape[P /* <: ValidationMap[_] */](`type`: P): Requireable[InferProps[P]] = js.native
}

