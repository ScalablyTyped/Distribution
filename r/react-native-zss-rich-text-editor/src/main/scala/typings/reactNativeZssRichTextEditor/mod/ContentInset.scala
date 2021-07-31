package typings.reactNativeZssRichTextEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentInset extends StObject {
  
  var left: Double
  
  var top: Double
}
object ContentInset {
  
  @scala.inline
  def apply(left: Double, top: Double): ContentInset = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentInset]
  }
  
  @scala.inline
  implicit class ContentInsetMutableBuilder[Self <: ContentInset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
