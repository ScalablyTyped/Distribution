package typings.reactSpringCore

import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.global.JSX.Element
import typings.reactSpringCore.anon.To
import typings.reactSpringCore.anon.ToState
import typings.reactSpringCore.distDeclarationsSrcComponentsSpringMod.SpringComponentProps
import typings.reactSpringCore.distDeclarationsSrcComponentsTrailMod.TrailComponentProps
import typings.reactSpringCore.distDeclarationsSrcTypesCommonMod.Valid
import typings.reactSpringCore.distDeclarationsSrcTypesTransitionMod.TransitionComponentProps
import typings.reactSpringCore.reactSpringCoreStrings.from
import typings.reactSpringCore.reactSpringCoreStrings.to
import typings.reactSpringTypes.utilMod.NoInfer
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Spring[State /* <: js.Object */](props: To[State] & (Omit[SpringComponentProps[NoInfer[State]], from | to])): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Spring")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def Spring_to[State /* <: js.Object */](props: ToState[State] & (Omit[SpringComponentProps[NoInfer[State]], to])): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Spring")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def Trail[Item, Props /* <: TrailComponentProps[Item, Any] */](hasItemsChildrenProps: Props & (Valid[Props, TrailComponentProps[Item, Props]])): js.Array[js.UndefOr[String | Double | Boolean | ReactElement | ReactFragment | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Trail")(hasItemsChildrenProps.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.UndefOr[String | Double | Boolean | ReactElement | ReactFragment | Null]]]
  
  inline def Transition[Item /* <: Any */, Props /* <: TransitionComponentProps[Item, Any] */](
    props: (Props & (Valid[Props, TransitionComponentProps[Item, Props]])) | (TransitionComponentProps[Item, Any])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Transition")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
