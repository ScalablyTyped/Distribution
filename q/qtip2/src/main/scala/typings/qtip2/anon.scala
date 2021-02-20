package typings.qtip2

import typings.qtip2.QTip2.Api
import typings.qtip2.QTip2.Title
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Text extends StObject {
    
    var text: Title = js.native
  }
  object Text {
    
    @scala.inline
    def apply(text: Title): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: Title): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFunction2(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "text", js.Any.fromFunction2(value))
    }
  }
}
