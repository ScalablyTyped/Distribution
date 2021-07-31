package typings.reactVis.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Box extends StObject {
  
  var box: js.UndefOr[CSSProperties] = js.undefined
  
  var line: js.UndefOr[CSSProperties] = js.undefined
  
  var title: js.UndefOr[CSSProperties] = js.undefined
}
object Box {
  
  @scala.inline
  def apply(): Box = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Box]
  }
  
  @scala.inline
  implicit class BoxMutableBuilder[Self <: Box] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBox(value: CSSProperties): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
    
    @scala.inline
    def setLine(value: CSSProperties): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setTitle(value: CSSProperties): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
