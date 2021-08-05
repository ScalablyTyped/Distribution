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
  
  inline def useVerticalDividerHeight(maxHeight: Double): VerticalDividerHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("useVerticalDividerHeight")(maxHeight.asInstanceOf[js.Any]).asInstanceOf[VerticalDividerHeight]
  inline def useVerticalDividerHeight(maxHeight: Double, forwardedRef: Ref[HTMLDivElement | Null]): VerticalDividerHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("useVerticalDividerHeight")(maxHeight.asInstanceOf[js.Any], forwardedRef.asInstanceOf[js.Any])).asInstanceOf[VerticalDividerHeight]
}
