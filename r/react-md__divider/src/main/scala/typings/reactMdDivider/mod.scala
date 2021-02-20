package typings.reactMdDivider

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.reactMdDivider.dividerMod.DividerElement
import typings.reactMdDivider.dividerMod.DividerProps
import typings.reactMdDivider.verticalDividerMod.VerticalDividerHeight
import typings.reactMdDivider.verticalDividerMod.VerticalDividerProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/divider", "Divider")
  @js.native
  val Divider: ForwardRefExoticComponent[DividerProps with RefAttributes[DividerElement]] = js.native
  
  @JSImport("@react-md/divider", "VerticalDivider")
  @js.native
  val VerticalDivider: ForwardRefExoticComponent[VerticalDividerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/divider", "useVerticalDividerHeight")
  @js.native
  def useVerticalDividerHeight(maxHeight: Double): VerticalDividerHeight = js.native
  @JSImport("@react-md/divider", "useVerticalDividerHeight")
  @js.native
  def useVerticalDividerHeight(maxHeight: Double, forwardedRef: Ref[HTMLDivElement | Null]): VerticalDividerHeight = js.native
}
