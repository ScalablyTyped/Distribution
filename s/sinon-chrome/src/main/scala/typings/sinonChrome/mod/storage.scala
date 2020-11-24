package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sinon-chrome", "storage")
@js.native
object storage extends js.Object {
  
  var local: StubbedStorageArea = js.native
  
  var managed: StubbedStorageArea = js.native
  
  var onChanged: Event = js.native
  
  var sync: StubbedStorageArea = js.native
  
  @js.native
  trait StubbedStorageArea extends js.Object {
    
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
    def getBytesInUse(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    @JSName("getBytesInUse")
    var getBytesInUse_Original: SinonChromeStub = js.native
    
    @JSName("get")
    var get_Original: SinonChromeStub = js.native
    
    // Methods
    def remove(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    @JSName("remove")
    var remove_Original: SinonChromeStub = js.native
    
    // Methods
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    @JSName("set")
    var set_Original: SinonChromeStub = js.native
  }
}
