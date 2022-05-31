package typings.sinonChrome.global.SinonChrome

import typings.sinonChrome.mod.events.Event
import typings.sinonChrome.mod.storage.StubbedStorageArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storage {
  
  @JSGlobal("SinonChrome.storage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SinonChrome.storage.local")
  @js.native
  def local: StubbedStorageArea = js.native
  inline def local_=(x: StubbedStorageArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("local")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.storage.managed")
  @js.native
  def managed: StubbedStorageArea = js.native
  inline def managed_=(x: StubbedStorageArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("managed")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.storage.onChanged")
  @js.native
  def onChanged: Event = js.native
  inline def onChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SinonChrome.storage.sync")
  @js.native
  def sync: StubbedStorageArea = js.native
  inline def sync_=(x: StubbedStorageArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sync")(x.asInstanceOf[js.Any])
}
