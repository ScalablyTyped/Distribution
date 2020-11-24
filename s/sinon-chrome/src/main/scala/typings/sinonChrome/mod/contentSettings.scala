package typings.sinonChrome.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sinon-chrome", "contentSettings")
@js.native
object contentSettings extends js.Object {
  
  var cookies: StubbedContentSetting = js.native
  
  var images: StubbedContentSetting = js.native
  
  var javascript: StubbedContentSetting = js.native
  
  var notifications: StubbedContentSetting = js.native
  
  var plugins: StubbedContentSetting = js.native
  
  var popups: StubbedContentSetting = js.native
  
  @js.native
  trait StubbedContentSetting extends js.Object {
    
    // Methods
    def clear(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    @JSName("clear")
    var clear_Original: SinonChromeStub = js.native
    
    // Methods
    def get(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    
    // Methods
    def getResourceIdentifiers(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    @JSName("getResourceIdentifiers")
    var getResourceIdentifiers_Original: SinonChromeStub = js.native
    
    @JSName("get")
    var get_Original: SinonChromeStub = js.native
    
    // Methods
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    @JSName("set")
    var set_Original: SinonChromeStub = js.native
  }
}
