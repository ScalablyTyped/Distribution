package typings.sidewayPinpoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object location {
    
    @JSImport("@sideway/pinpoint", "location")
    @js.native
    def apply(): Location = js.native
    @JSImport("@sideway/pinpoint", "location")
    @js.native
    def apply(depth: Double): Location = js.native
    
    @js.native
    trait Location extends StObject {
      
      /**
        The fully qualified filename.
        */
      val filename: String = js.native
      
      /**
        The file line number.
        */
      val line: Double = js.native
    }
    object Location {
      
      @scala.inline
      def apply(filename: String, line: Double): Location = {
        val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
        __obj.asInstanceOf[Location]
      }
      
      @scala.inline
      implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      }
    }
  }
}
