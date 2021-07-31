package typings.reactVis.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Links extends StObject {
  
  var labels: js.UndefOr[CSSProperties] = js.undefined
  
  var links: js.UndefOr[CSSProperties] = js.undefined
  
  var rects: js.UndefOr[CSSProperties] = js.undefined
}
object Links {
  
  @scala.inline
  def apply(): Links = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Links]
  }
  
  @scala.inline
  implicit class LinksMutableBuilder[Self <: Links] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: CSSProperties): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLinks(value: CSSProperties): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setRects(value: CSSProperties): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectsUndefined: Self = StObject.set(x, "rects", js.undefined)
  }
}
