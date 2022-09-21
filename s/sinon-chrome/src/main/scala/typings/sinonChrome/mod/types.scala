package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object types {
  
  trait StubbedChromeSetting extends StObject {
    
    // Methods
    def clear(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any
    @JSName("clear")
    var clear_Original: SinonChromeStub
    
    // Methods
    def get(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any
    @JSName("get")
    var get_Original: SinonChromeStub
    
    var onChange: Event
    
    // Methods
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any
    @JSName("set")
    var set_Original: SinonChromeStub
  }
  object StubbedChromeSetting {
    
    inline def apply(clear: SinonChromeStub, get: SinonChromeStub, onChange: Event, set: SinonChromeStub): StubbedChromeSetting = {
      val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[StubbedChromeSetting]
    }
    
    extension [Self <: StubbedChromeSetting](x: Self) {
      
      inline def setClear(value: SinonChromeStub): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setGet(value: SinonChromeStub): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: Event): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setSet(value: SinonChromeStub): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
}
