package typings.reactMdSheet

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdSheet.sheetMod.SheetProps
import typings.reactMdTransition.typesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/sheet", "DEFAULT_SHEET_CLASSNAMES")
  @js.native
  val DEFAULT_SHEET_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/sheet", "DEFAULT_SHEET_TIMEOUT")
  @js.native
  val DEFAULT_SHEET_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/sheet", "Sheet")
  @js.native
  val Sheet: ForwardRefExoticComponent[SheetProps & RefAttributes[HTMLDivElement]] = js.native
}
