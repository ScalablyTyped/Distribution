package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareData extends StObject {
  
  var text: js.UndefOr[java.lang.String] = js.undefined
  
  var title: js.UndefOr[java.lang.String] = js.undefined
  
  var url: js.UndefOr[java.lang.String] = js.undefined
}
object ShareData {
  
  @scala.inline
  def apply(): ShareData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareData]
  }
  
  @scala.inline
  implicit class ShareDataMutableBuilder[Self <: ShareData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
