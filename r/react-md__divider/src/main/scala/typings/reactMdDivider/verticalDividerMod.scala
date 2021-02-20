package typings.reactMdDivider

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalDividerMod {
  
  @JSImport("@react-md/divider/types/VerticalDivider", "VerticalDivider")
  @js.native
  val VerticalDivider: ForwardRefExoticComponent[VerticalDividerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/divider/types/VerticalDivider", "useVerticalDividerHeight")
  @js.native
  def useVerticalDividerHeight(maxHeight: Double): VerticalDividerHeight = js.native
  @JSImport("@react-md/divider/types/VerticalDivider", "useVerticalDividerHeight")
  @js.native
  def useVerticalDividerHeight(maxHeight: Double, forwardedRef: Ref[HTMLDivElement | Null]): VerticalDividerHeight = js.native
  
  @js.native
  trait VerticalDividerHeight extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    def ref(): Unit = js.native
    def ref(instance: HTMLDivElement): Unit = js.native
  }
  
  @js.native
  trait VerticalDividerProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * The max height for the vertical divider. This number **must** be greater
      * than 0 to work correctly.
      *
      * When the value is between 0 and 1, it will be used as a multiplier with the
      * parent element's height. When the value is greater than 1, it will be used
      * in `Math.min(parentElementHeight, maxHeight)`.
      */
    var maxHeight: js.UndefOr[Double] = js.native
  }
  object VerticalDividerProps {
    
    @scala.inline
    def apply(): VerticalDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalDividerProps]
    }
    
    @scala.inline
    implicit class VerticalDividerPropsMutableBuilder[Self <: VerticalDividerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    }
  }
}
