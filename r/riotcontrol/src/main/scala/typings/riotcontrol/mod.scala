package typings.riotcontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("riotcontrol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("riotcontrol", "addStore")
  @js.native
  def addStore(store: Store): Unit = js.native
  
  @JSImport("riotcontrol", "off")
  @js.native
  def off(events: String): Unit = js.native
  @JSImport("riotcontrol", "off")
  @js.native
  def off(events: String, fn: js.Function): Unit = js.native
  
  @JSImport("riotcontrol", "on")
  @js.native
  def on(events: String, fn: js.Function): Unit = js.native
  
  @JSImport("riotcontrol", "one")
  @js.native
  def one(name: String, fn: js.Function): Unit = js.native
  
  @JSImport("riotcontrol", "_stores")
  @js.native
  def stores: js.Array[Store] = js.native
  
  @scala.inline
  def stores_=(x: js.Array[Store]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_stores")(x.asInstanceOf[js.Any])
  
  @JSImport("riotcontrol", "trigger")
  @js.native
  def trigger(name: String, args: js.Any*): Unit = js.native
  
  @js.native
  trait Store extends StObject {
    
    def off(events: String): Store = js.native
    def off(events: String, fn: js.Function): Store = js.native
    
    def on(events: String, fn: js.Function): Store = js.native
    
    def one(name: String, fn: js.Function): Store = js.native
    
    def trigger(name: String, args: js.Any*): Store = js.native
  }
}
