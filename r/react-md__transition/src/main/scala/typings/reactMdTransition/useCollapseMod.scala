package typings.reactMdTransition

import typings.reactMdTransition.typesMod.CollapseOptions
import typings.reactMdTransition.typesMod.CollapseTransitionProvidedProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/transition/types/useCollapse", JSImport.Namespace)
@js.native
object useCollapseMod extends js.Object {
  def default[E /* <: HTMLElement */](collapsed: Boolean): ReturnValue[E] = js.native
  def default[E /* <: HTMLElement */](
    collapsed: Boolean,
    hasClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary: CollapseOptions[E]
  ): ReturnValue[E] = js.native
  type Rendered = Boolean
  type ReturnValue[E /* <: HTMLElement */] = js.Tuple2[Rendered, CollapseTransitionProvidedProps[E]]
}

