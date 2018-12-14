package typings
package propDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object propDashTypesMod {
  type InferProps[V] = (InferPropsInner[stdLib.Pick[V, RequiredKeys[V]]]) with (stdLib.Partial[InferPropsInner[stdLib.Pick[V, OptionalKeys[V]]]])
  type InferPropsInner[V] = propDashTypesLib.propDashTypesLibStrings.InferPropsInner with V
  type InferType[V] = js.Any
  type IsOptional[T] = propDashTypesLib.propDashTypesLibNumbers.`false` | propDashTypesLib.propDashTypesLibNumbers.`true`
  type OptionalKeys[V] = stdLib.Exclude[java.lang.String, RequiredKeys[V]]
  type ReactComponentLike = java.lang.String | (js.Function2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], js.Any]) | (org.scalablytyped.runtime.Instantiable2[/* props */ js.Any, /* context */ js.UndefOr[/* context */ js.Any], js.Any])
  type ReactNodeLike = js.UndefOr[
    js.Object | ReactElementLike | ReactNodeArray | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
  type RequiredKeys[V] = /* import warning: Failed type conversion: TsTypeLookup(TsTypeObject(List(TsMemberTypeMapped(NoComments,Default,false,TsIdentSimple(K),TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(V))),List())),Deoptionalize,TsTypeRef(TsQIdent(List(TsIdentSimple(K))),List())))),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(V))),List())))) */js.Any
  type ValidationMap[T] = propDashTypesLib.propDashTypesLibStrings.ValidationMap with T
}
