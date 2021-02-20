package typings.shimmer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Logger extends StObject {
    
    var logger: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  }
  object Logger {
    
    @scala.inline
    def apply(): Logger = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogger(value: /* msg */ String => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
