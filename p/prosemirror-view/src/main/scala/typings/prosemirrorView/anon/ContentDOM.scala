package typings.prosemirrorView.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentDOM extends StObject {
  
  var contentDOM: js.UndefOr[HTMLElement] = js.undefined
  
  var dom: HTMLElement
}
object ContentDOM {
  
  inline def apply(dom: HTMLElement): ContentDOM = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDOM]
  }
  
  extension [Self <: ContentDOM](x: Self) {
    
    inline def setContentDOM(value: HTMLElement): Self = StObject.set(x, "contentDOM", value.asInstanceOf[js.Any])
    
    inline def setContentDOMUndefined: Self = StObject.set(x, "contentDOM", js.undefined)
    
    inline def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
  }
}
