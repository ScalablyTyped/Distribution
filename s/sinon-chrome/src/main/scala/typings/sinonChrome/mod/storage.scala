package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storage {
  
  @JSImport("sinon-chrome", "storage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "storage.local")
  @js.native
  def local: StubbedStorageArea = js.native
  @scala.inline
  def local_=(x: StubbedStorageArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("local")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "storage.managed")
  @js.native
  def managed: StubbedStorageArea = js.native
  @scala.inline
  def managed_=(x: StubbedStorageArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("managed")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "storage.onChanged")
  @js.native
  def onChanged: Event = js.native
  @scala.inline
  def onChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "storage.sync")
  @js.native
  def sync: StubbedStorageArea = js.native
  @scala.inline
  def sync_=(x: StubbedStorageArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sync")(x.asInstanceOf[js.Any])
  
  @js.native
  trait StubbedStorageArea extends StObject {
    
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
