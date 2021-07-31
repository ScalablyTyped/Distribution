package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.severityMod.Severity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbMod {
  
  trait Breadcrumb extends StObject {
    
    var category: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var event_id: js.UndefOr[String] = js.undefined
    
    var level: js.UndefOr[Severity] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Breadcrumb {
    
    @scala.inline
    def apply(): Breadcrumb = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Breadcrumb]
    }
    
    @scala.inline
    implicit class BreadcrumbMutableBuilder[Self <: Breadcrumb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent_idUndefined: Self = StObject.set(x, "event_id", js.undefined)
      
      @scala.inline
      def setLevel(value: Severity): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type BreadcrumbHint = StringDictionary[js.Any]
}
