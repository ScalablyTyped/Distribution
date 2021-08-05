package typings.reactMdTransition

import typings.reactMdTransition.typesMod.CollapseOptions
import typings.reactMdTransition.typesMod.CollapseTransitionProvidedProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCollapseMod {
  
  @JSImport("@react-md/transition/types/useCollapse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCollapse[E /* <: HTMLElement */](collapsed: Boolean): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCollapse")(collapsed.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[E]]
  inline def useCollapse[E /* <: HTMLElement */](
    collapsed: Boolean,
    hasClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary: CollapseOptions[E]
  ): ReturnValue[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCollapse")(collapsed.asInstanceOf[js.Any], hasClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[E]]
  
  type Rendered = Boolean
  
  type ReturnValue[E /* <: HTMLElement */] = js.Tuple2[Rendered, CollapseTransitionProvidedProps[E]]
}
