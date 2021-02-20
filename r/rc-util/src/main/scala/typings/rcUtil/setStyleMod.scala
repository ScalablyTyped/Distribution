package typings.rcUtil

import typings.react.mod.CSSProperties
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setStyleMod {
  
  /**
    * Easy to set element style, return previous style
    * IE browser compatible(IE browser doesn't merge overflow style, need to set it separately)
    * https://github.com/ant-design/ant-design/issues/19393
    *
    */
  @JSImport("rc-util/lib/setStyle", JSImport.Default)
  @js.native
  def default(style: CSSProperties): CSSProperties = js.native
  @JSImport("rc-util/lib/setStyle", JSImport.Default)
  @js.native
  def default(style: CSSProperties, options: SetStyleOptions): CSSProperties = js.native
  
  @js.native
  trait SetStyleOptions extends StObject {
    
    var element: js.UndefOr[HTMLElement] = js.native
  }
  object SetStyleOptions {
    
    @scala.inline
    def apply(): SetStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetStyleOptions]
    }
    
    @scala.inline
    implicit class SetStyleOptionsMutableBuilder[Self <: SetStyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
}
