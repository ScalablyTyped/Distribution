package typings.reactMdDivider

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.reactMdDivider.dividerMod.DividerElement
import typings.reactMdDivider.dividerMod.DividerProps
import typings.reactMdDivider.verticalDividerMod.VerticalDividerHeight
import typings.reactMdDivider.verticalDividerMod.VerticalDividerProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/divider", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Divider: ForwardRefExoticComponent[DividerProps with RefAttributes[DividerElement]] = js.native
  
  val VerticalDivider: ForwardRefExoticComponent[VerticalDividerProps with RefAttributes[HTMLDivElement]] = js.native
  
  def useVerticalDividerHeight(maxHeight: Double): VerticalDividerHeight = js.native
  def useVerticalDividerHeight(maxHeight: Double, forwardedRef: Ref[HTMLDivElement | Null]): VerticalDividerHeight = js.native
}
