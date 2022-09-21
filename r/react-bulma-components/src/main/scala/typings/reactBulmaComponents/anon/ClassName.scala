package typings.reactBulmaComponents.anon

import typings.react.mod.CSSProperties
import typings.react.mod.RefObject
import typings.reactBulmaComponents.componentsMod.DisplayModifier
import typings.reactBulmaComponents.componentsMod.RenderAsComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName[TComponent /* <: RenderAsComponent */] extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var display: js.UndefOr[DisplayModifier] = js.undefined
  
  var domRef: js.UndefOr[RefObject[TComponent]] = js.undefined
  
  var invisible: js.UndefOr[Boolean] = js.undefined
  
  var renderAs: js.UndefOr[TComponent] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object ClassName {
  
  inline def apply[TComponent /* <: RenderAsComponent */](): ClassName[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassName[TComponent]]
  }
  
  extension [Self <: ClassName[?], TComponent /* <: RenderAsComponent */](x: Self & ClassName[TComponent]) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDisplay(value: DisplayModifier): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setDomRef(value: RefObject[TComponent]): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
    
    inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
    
    inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    inline def setRenderAs(value: TComponent): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    
    inline def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
