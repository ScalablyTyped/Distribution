package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Link definitions
  */
trait InternalLinkAttributes extends StObject {
  
  var hash: js.UndefOr[String] = js.undefined
  
  var obj: Obj
  
  var query: js.UndefOr[String] = js.undefined
  
  var rel: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object InternalLinkAttributes {
  
  @scala.inline
  def apply(obj: Obj): InternalLinkAttributes = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalLinkAttributes]
  }
  
  @scala.inline
  implicit class InternalLinkAttributesMutableBuilder[Self <: InternalLinkAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setObj(value: Obj): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
