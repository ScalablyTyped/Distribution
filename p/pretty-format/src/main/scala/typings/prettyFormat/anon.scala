package typings.prettyFormat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Close extends StObject {
    
    var close: String
    
    var open: String
  }
  object Close {
    
    inline def apply(close: String, open: String): Close = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<std.Partial<{ readonly comment :string,  readonly content :string,  readonly prop :string,  readonly tag :string,  readonly value :string}>> */
  trait RequiredPartialreadonlyco extends StObject {
    
    var comment: String
    
    var content: String
    
    var prop: String
    
    var tag: String
    
    var value: String
  }
  object RequiredPartialreadonlyco {
    
    inline def apply(comment: String, content: String, prop: String, tag: String, value: String): RequiredPartialreadonlyco = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredPartialreadonlyco]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredPartialreadonlyco] (val x: Self) extends AnyVal {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
