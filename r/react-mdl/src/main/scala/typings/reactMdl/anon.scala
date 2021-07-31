package typings.reactMdl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Html extends StObject {
    
    var __html: String
  }
  object Html {
    
    @scala.inline
    def apply(__html: String): Html = {
      val __obj = js.Dynamic.literal(__html = __html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit class HtmlMutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__html(value: String): Self = StObject.set(x, "__html", value.asInstanceOf[js.Any])
    }
  }
  
  trait Recursive extends StObject {
    
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object Recursive {
    
    @scala.inline
    def apply(): Recursive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Recursive]
    }
    
    @scala.inline
    implicit class RecursiveMutableBuilder[Self <: Recursive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
}
