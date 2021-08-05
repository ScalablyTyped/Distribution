package typings.rcUtil

import typings.react.mod.CSSProperties
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setStyleMod {
  
  @JSImport("rc-util/lib/setStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Easy to set element style, return previous style
    * IE browser compatible(IE browser doesn't merge overflow style, need to set it separately)
    * https://github.com/ant-design/ant-design/issues/19393
    *
    */
  inline def default(style: CSSProperties): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  inline def default(style: CSSProperties, options: SetStyleOptions): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  
  trait SetStyleOptions extends StObject {
    
    var element: js.UndefOr[HTMLElement] = js.undefined
  }
  object SetStyleOptions {
    
    inline def apply(): SetStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetStyleOptions]
    }
    
    extension [Self <: SetStyleOptions](x: Self) {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
}
