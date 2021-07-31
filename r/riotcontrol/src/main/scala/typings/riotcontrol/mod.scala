package typings.riotcontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("riotcontrol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addStore(store: Store): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addStore")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def off(events: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(events.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def off(events: String, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(events.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on(events: String, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(events.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def one(name: String, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("riotcontrol", "_stores")
  @js.native
  def stores: js.Array[Store] = js.native
  
  @scala.inline
  def stores_=(x: js.Array[Store]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_stores")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def trigger(name: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Store extends StObject {
    
    def off(events: String): Store = js.native
    def off(events: String, fn: js.Function): Store = js.native
    
    def on(events: String, fn: js.Function): Store = js.native
    
    def one(name: String, fn: js.Function): Store = js.native
    
    def trigger(name: String, args: js.Any*): Store = js.native
  }
}
