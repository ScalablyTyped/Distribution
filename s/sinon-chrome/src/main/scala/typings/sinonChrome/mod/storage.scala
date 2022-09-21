package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storage {
  
  @JSImport("sinon-chrome", "storage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "storage.local")
  @js.native
  def local: StubbedStorageArea = js.native
  inline def local_=(x: StubbedStorageArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("local")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "storage.managed")
  @js.native
  def managed: StubbedStorageArea = js.native
  inline def managed_=(x: StubbedStorageArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("managed")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "storage.onChanged")
  @js.native
  def onChanged: Event = js.native
  inline def onChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "storage.sync")
  @js.native
  def sync: StubbedStorageArea = js.native
  inline def sync_=(x: StubbedStorageArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sync")(x.asInstanceOf[js.Any])
  
  trait StubbedStorageArea extends StObject {
    
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
    
    // Methods
    def getBytesInUse(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any
    @JSName("getBytesInUse")
    var getBytesInUse_Original: SinonChromeStub
    
    @JSName("get")
    var get_Original: SinonChromeStub
    
    // Methods
    def remove(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any
    @JSName("remove")
    var remove_Original: SinonChromeStub
    
    // Methods
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any
    @JSName("set")
    var set_Original: SinonChromeStub
  }
  object StubbedStorageArea {
    
    inline def apply(
      clear: SinonChromeStub,
      get: SinonChromeStub,
      getBytesInUse: SinonChromeStub,
      remove: SinonChromeStub,
      set: SinonChromeStub
    ): StubbedStorageArea = {
      val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getBytesInUse = getBytesInUse.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[StubbedStorageArea]
    }
    
    extension [Self <: StubbedStorageArea](x: Self) {
      
      inline def setClear(value: SinonChromeStub): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setGet(value: SinonChromeStub): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetBytesInUse(value: SinonChromeStub): Self = StObject.set(x, "getBytesInUse", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: SinonChromeStub): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setSet(value: SinonChromeStub): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
}
