package typings.reactMdTransition

import typings.reactMdTransition.typesMod.CollapseOptions
import typings.reactMdTransition.typesMod.CollapseTransitionProvidedProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCollapseMod {
  
  @JSImport("@react-md/transition/types/useCollapse", "useCollapse")
  @js.native
  def useCollapse[E /* <: HTMLElement */](collapsed: Boolean): ReturnValue[E] = js.native
  @JSImport("@react-md/transition/types/useCollapse", "useCollapse")
  @js.native
  def useCollapse[E /* <: HTMLElement */](
    collapsed: Boolean,
    hasClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary: CollapseOptions[E]
  ): ReturnValue[E] = js.native
  
  type Rendered = Boolean
  
  type ReturnValue[E /* <: HTMLElement */] = js.Tuple2[Rendered, CollapseTransitionProvidedProps[E]]
}
