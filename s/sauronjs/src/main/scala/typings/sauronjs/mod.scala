package typings.sauronjs

import typings.sauronjs.componentMod.ComponentParameters
import typings.sauronjs.componentMod.^
import typings.sauronjs.sauronMod.SauronComponentMap
import typings.sauronjs.sauronMod.SauronInstance
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sauronjs", "Component")
  @js.native
  class Component protected () extends ^ {
    def this(params: ComponentParameters) = this()
  }
  object Component {
    
    @JSImport("sauronjs", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("sauronjs", "Component._index")
    @js.native
    def index: Double = js.native
    
    @scala.inline
    def index_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_index")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sauronjs", "Service")
  @js.native
  class Service protected ()
    extends typings.sauronjs.serviceMod.^ {
    def this(pubs: js.Array[String], subs: js.Array[String]) = this()
  }
  
  object events {
    
    object dom {
      
      @JSImport("sauronjs", "events.dom.update")
      @js.native
      def update(): Unit = js.native
    }
  }
  
  object instance {
    
    @JSImport("sauronjs", "instance")
    @js.native
    def apply(componentMap: SauronComponentMap): SauronInstance = js.native
    @JSImport("sauronjs", "instance")
    @js.native
    def apply(componentMap: SauronComponentMap, id: String): SauronInstance = js.native
  }
  
  @JSImport("sauronjs", "next")
  @js.native
  def next(channels: js.Array[String], event: String, data: js.Any, id: String): Unit = js.native
  
  object util {
    
    @JSImport("sauronjs", "util.insert")
    @js.native
    def insert(params: HTMLElement): Unit = js.native
    
    @JSImport("sauronjs", "util.ready")
    @js.native
    def ready(fn: js.Function0[Unit]): Unit = js.native
  }
}
