package typings.reactSpringCore

import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.reactSpringCore.anon.Items
import typings.reactSpringCore.distDeclarationsSrcHooksUseSpringMod.UseSpringProps
import typings.reactSpringCore.distDeclarationsSrcTypesCommonMod.Valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsTrailMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/components/Trail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Trail[Item, Props /* <: TrailComponentProps[Item, Any] */](param0: Props & (Valid[Props, TrailComponentProps[Item, Props]])): js.Array[js.UndefOr[String | Double | Boolean | ReactElement | ReactFragment | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Trail")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.UndefOr[String | Double | Boolean | ReactElement | ReactFragment | Null]]]
  
  type TrailComponentProps[Item, Props /* <: js.Object */] = Any & UseSpringProps[Props] & (Items[Item, Props])
}
