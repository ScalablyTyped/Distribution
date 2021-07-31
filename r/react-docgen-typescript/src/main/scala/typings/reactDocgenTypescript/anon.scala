package typings.reactDocgenTypescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Description extends StObject {
    
    var description: js.UndefOr[String | Null] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Description {
    
    @scala.inline
    def apply(): Description = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FileName extends StObject {
    
    var fileName: String
    
    var name: String
  }
  object FileName {
    
    @scala.inline
    def apply(fileName: String, name: String): FileName = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileName]
    }
    
    @scala.inline
    implicit class FileNameMutableBuilder[Self <: FileName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
