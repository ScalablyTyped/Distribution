package typings
package reactDashDynamicDashNumberLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDynamicDashNumberMod {
  type BaseInputProps = stdLib.Partial[
    Omit[
      reactLib.reactMod.ReactNs.DetailedHTMLProps[
        reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement], 
        reactLib.HTMLInputElement
      ], 
      reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.ref | reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.value | reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.onChange | reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.placeholder
    ]
  ]
  type DynamicNumber = reactLib.reactMod.Component[DynamicNumberProps, js.Object, js.Any]
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[
    T, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeIntersect(List(TsTypeObject(List(TsMemberTypeMapped(NoComments,Default,false,TsIdentSimple(P),TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())),Noop,TsTypeRef(TsQIdent(List(TsIdentSimple(P))),List())))), TsTypeObject(List(TsMemberTypeMapped(NoComments,Default,false,TsIdentSimple(P),TsTypeRef(TsQIdent(List(TsIdentSimple(K))),List()),Noop,TsTypeRef(TsQIdent(List(TsIdentSimple(never))),List())))), TsTypeObject(List(TsMemberIndex(NoComments,false,Default,IndexingDict(TsIdentSimple(x),TsTypeRef(TsQIdent(List(TsIdentSimple(string))),List())),false,TsTypeRef(TsQIdent(List(TsIdentSimple(never))),List())), TsMemberIndex(NoComments,false,Default,IndexingDict(TsIdentSimple(x),TsTypeRef(TsQIdent(List(TsIdentSimple(number))),List())),false,TsTypeRef(TsQIdent(List(TsIdentSimple(never))),List())))))),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
  ]
}
