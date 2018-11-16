package typings
package atRebassGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gridMod {
  type BoxComponent = styledDashComponentsLib.styledDashComponentsMod.StyledComponent[
    reactLib.reactMod.ReactNs.ForwardRefExoticComponent[stdLib.Partial[BoxProps]], 
    js.Any, 
    js.Object, 
    scala.Nothing
  ]
  type FlexComponent = styledDashComponentsLib.styledDashComponentsMod.StyledComponent[
    reactLib.reactMod.ReactNs.ForwardRefExoticComponent[stdLib.Partial[FlexProps]], 
    js.Any, 
    js.Object, 
    scala.Nothing
  ]
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[
    T, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeIntersect(List(TsTypeObject(List(TsMemberTypeMapped(NoComments,Default,false,TsIdentSimple(P),TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())),Noop,TsTypeRef(TsQIdent(List(TsIdentSimple(P))),List())))), TsTypeObject(List(TsMemberTypeMapped(NoComments,Default,false,TsIdentSimple(P),TsTypeRef(TsQIdent(List(TsIdentSimple(K))),List()),Noop,TsTypeRef(TsQIdent(List(TsIdentSimple(never))),List())))), TsTypeObject(List(TsMemberIndex(NoComments,false,Default,IndexingDict(TsIdentSimple(x),TsTypeRef(TsQIdent(List(TsIdentSimple(string))),List())),false,TsTypeRef(TsQIdent(List(TsIdentSimple(never))),List())), TsMemberIndex(NoComments,false,Default,IndexingDict(TsIdentSimple(x),TsTypeRef(TsQIdent(List(TsIdentSimple(number))),List())),false,TsTypeRef(TsQIdent(List(TsIdentSimple(never))),List())))))),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
  ]
  type ResponsiveProp = scala.Double | java.lang.String | (js.Array[java.lang.String | scala.Double])
}
