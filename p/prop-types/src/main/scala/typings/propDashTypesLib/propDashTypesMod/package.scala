package typings
package propDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object propDashTypesMod {
  type InferProps[V] = ((InferPropsInner[stdLib.Pick[V, RequiredKeys[V]]]) | js.Object) with ((stdLib.Partial[InferPropsInner[stdLib.Pick[V, OptionalKeys[V]]]]) | js.Object)
  type InferPropsInner[V] = propDashTypesLib.propDashTypesLibStrings.InferPropsInner with V
  type InferType[V] = js.Any
  type IsOptional[T] = propDashTypesLib.propDashTypesLibNumbers.`false` | propDashTypesLib.propDashTypesLibNumbers.`true`
  type OptionalKeys[V] = stdLib.Exclude[java.lang.String, RequiredKeys[V]]
  type ReactNodeLike = js.UndefOr[
    js.Object | ReactElementLike | ReactNodeArray | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
  type RequiredKeys[V] = /* import warning: Failed type conversion: TsTypeLookup(TsTypeObject(List(TsMemberTypeMapped(NoComments,Default,false,TsIdentSimple(K),TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(V))),List())),Noop,TsTypeRef(TsQIdent(List(TsIdentSimple(K))),List())))),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(V))),List())))) */js.Any
  type ValidationMap[T] = propDashTypesLib.propDashTypesLibStrings.ValidationMap with T
}
