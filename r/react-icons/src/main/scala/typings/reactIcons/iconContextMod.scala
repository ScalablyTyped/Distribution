package typings.reactIcons

import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconContextMod {
  
  @JSImport("react-icons/lib/esm/iconContext", "DefaultContext")
  @js.native
  val DefaultContext: IconContext = js.native
  
  trait IconContext extends StObject {
    
    var attr: js.UndefOr[SVGAttributes[SVGElement]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object IconContext {
    
    @JSImport("react-icons/lib/esm/iconContext", "IconContext")
    @js.native
    val ^ : Context[IconContext] = js.native
    
    extension [Self <: IconContext](x: Self) {
      
      inline def setAttr(value: SVGAttributes[SVGElement]): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
