package typings.scrollToElement

import typings.scrollToElement.scrollToElementStrings.bottom
import typings.scrollToElement.scrollToElementStrings.middle
import typings.scrollToElement.scrollToElementStrings.top
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scroll-to-element", JSImport.Namespace)
  @js.native
  def apply(selector: String): Unit = js.native
  @JSImport("scroll-to-element", JSImport.Namespace)
  @js.native
  def apply(selector: String, options: Options): Unit = js.native
  @JSImport("scroll-to-element", JSImport.Namespace)
  @js.native
  def apply(selector: Element): Unit = js.native
  @JSImport("scroll-to-element", JSImport.Namespace)
  @js.native
  def apply(selector: Element, options: Options): Unit = js.native
  @JSImport("scroll-to-element", JSImport.Namespace)
  @js.native
  def apply(selector: HTMLElement): Unit = js.native
  @JSImport("scroll-to-element", JSImport.Namespace)
  @js.native
  def apply(selector: HTMLElement, options: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var align: js.UndefOr[top | middle | bottom] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var ease: js.UndefOr[String] = js.native
    
    var offset: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(offset: Double): Options = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: top | middle | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEase(value: String): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
