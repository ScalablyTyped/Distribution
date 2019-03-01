package typings
package propDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object propDashTypesMod {
  type InferProps[V] = (InferPropsInner[stdLib.Pick[V, RequiredKeys[V]]]) with (stdLib.Partial[InferPropsInner[stdLib.Pick[V, OptionalKeys[V]]]])
  type InferPropsInner[V] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof V ]: -? prop-types.prop-types.InferType<V[K]>}
    */ propDashTypesLib.propDashTypesLibStrings.InferPropsInner with V
  type InferType[V] = js.Any
  type OptionalKeys[V] = stdLib.Exclude[java.lang.String, RequiredKeys[V]]
  type ReactComponentLike = java.lang.String | (js.Function2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], js.Any]) | (org.scalablytyped.runtime.Instantiable2[/* props */ js.Any, /* context */ js.UndefOr[/* context */ js.Any], js.Any])
  type ReactNodeLike = js.UndefOr[
    js.Object | ReactElementLike | ReactNodeArray | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
  type RequiredKeys[V] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof V ]: -? K}[keyof V] */ js.Any
  type ValidationMap[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? prop-types.prop-types.Validator<T[K]>}
    */ propDashTypesLib.propDashTypesLibStrings.ValidationMap with T
}
