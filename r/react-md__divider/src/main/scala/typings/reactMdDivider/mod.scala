package typings.reactMdDivider

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdDivider.dividerMod.DividerElement
import typings.reactMdDivider.dividerMod.DividerProps
import typings.reactMdDivider.useVerticalDividerHeightMod.VerticalDividerHeight
import typings.reactMdDivider.useVerticalDividerHeightMod.VerticalDividerHookOptions
import typings.reactMdDivider.verticalDividerMod.VerticalDividerProps
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/divider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/divider", "Divider")
  @js.native
  val Divider: ForwardRefExoticComponent[DividerProps & RefAttributes[DividerElement]] = js.native
  
  @JSImport("@react-md/divider", "VerticalDivider")
  @js.native
  val VerticalDivider: ForwardRefExoticComponent[VerticalDividerProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def useVerticalDividerHeight[E /* <: HTMLElement */](hasRefStyleMaxHeight: VerticalDividerHookOptions[E]): VerticalDividerHeight[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useVerticalDividerHeight")(hasRefStyleMaxHeight.asInstanceOf[js.Any]).asInstanceOf[VerticalDividerHeight[E]]
}
