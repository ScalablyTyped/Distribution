package typings.reactNativeCommunityViewpager

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Commands extends StObject {
    
    var Commands: StringDictionary[Double]
  }
  object Commands {
    
    inline def apply(Commands: StringDictionary[Double]): Commands = {
      val __obj = js.Dynamic.literal(Commands = Commands.asInstanceOf[js.Any])
      __obj.asInstanceOf[Commands]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Commands] (val x: Self) extends AnyVal {
      
      inline def setCommands(value: StringDictionary[Double]): Self = StObject.set(x, "Commands", value.asInstanceOf[js.Any])
    }
  }
}
