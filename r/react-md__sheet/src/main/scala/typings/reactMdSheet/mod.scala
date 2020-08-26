package typings.reactMdSheet

import typings.react.mod.ForwardRefExoticComponent
import typings.reactMdSheet.anon.SheetPropsPickSheetPropsh
import typings.reactMdSheet.anon.SheetPropsPickSheetPropshAbout
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/sheet", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val DEFAULT_SHEET_CLASSNAMES: CSSTransitionClassNames = js.native
  val DEFAULT_SHEET_TIMEOUT: TransitionTimeout = js.native
  /**
    * The Sheet component is an extension of the `Dialog` except that it is fixed
    * to the edges of the viewport instead of centered or full page. This component
    * is great for rendering a navigation tree or menus on mobile devices.
    */
  val Sheet: ForwardRefExoticComponent[SheetPropsPickSheetPropsh | SheetPropsPickSheetPropshAbout] = js.native
}

