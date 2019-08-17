package typings.propDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object propDashTypesMod {
  import org.scalablytyped.runtime.Instantiable2
  import typings.std.Exclude
  import typings.std.Partial
  import typings.std.Pick

  type InferProps[V] = (InferPropsInner[Pick[V, RequiredKeys[V]]]) with (Partial[InferPropsInner[Pick[V, OptionalKeys[V]]]])
  type InferPropsInner[V] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof V ]: -? prop-types.prop-types.InferType<V[K]>}
    */ typings.propDashTypes.propDashTypesStrings.InferPropsInner with V
  type InferType[V] = js.Any
  type OptionalKeys[V] = Exclude[String, RequiredKeys[V]]
  type ReactComponentLike = String | (js.Function2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], js.Any]) | (Instantiable2[/* props */ js.Any, js.UndefOr[/* context */ js.Any], js.Any])
  /* Rewritten from type alias, can be one of: 
    - js.Object
    - typings.propDashTypes.propDashTypesMod.ReactElementLike
    - typings.propDashTypes.propDashTypesMod.ReactNodeArray
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - `js.undefined`
    - scala.Nothing
  */
  type ReactNodeLike = js.UndefOr[_ReactNodeLike | js.Object | String | Double | Boolean | Null]
  type RequiredKeys[V] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof V ]: -? std.Exclude<V[K], undefined> extends prop-types.prop-types.Validator<infer T>? prop-types.prop-types.IsOptional<any> extends true? never : K : never}[keyof V] */ js.Any
  type ValidationMap[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? prop-types.prop-types.Validator<T[K]>}
    */ typings.propDashTypes.propDashTypesStrings.ValidationMap with T
}
