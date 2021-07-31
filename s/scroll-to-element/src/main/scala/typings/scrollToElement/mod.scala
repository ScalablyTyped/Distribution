package typings.scrollToElement

import typings.scrollToElement.scrollToElementStrings.bottom
import typings.scrollToElement.scrollToElementStrings.middle
import typings.scrollToElement.scrollToElementStrings.top
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(selector: String): Unit = ^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(selector: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(selector: Element): Unit = ^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(selector: Element, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(selector: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(selector: HTMLElement, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("scroll-to-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var align: js.UndefOr[top | middle | bottom] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var ease: js.UndefOr[String] = js.undefined
    
    var offset: Double
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
