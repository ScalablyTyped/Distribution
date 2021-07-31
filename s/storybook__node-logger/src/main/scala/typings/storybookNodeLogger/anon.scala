package typings.storybookNodeLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Message extends StObject {
    
    var message: String
    
    var time: js.Tuple2[Double, Double]
  }
  object Message {
    
    @scala.inline
    def apply(message: String, time: js.Tuple2[Double, Double]): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
