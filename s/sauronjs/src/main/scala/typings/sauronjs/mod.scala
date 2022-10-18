package typings.sauronjs

import typings.sauronjs.srcCoreComponentMod.ComponentParameters
import typings.sauronjs.srcCoreSauronMod.SauronComponentMap
import typings.sauronjs.srcCoreSauronMod.SauronInstance
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sauronjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sauronjs", "Component")
  @js.native
  open class Component protected ()
    extends typings.sauronjs.srcCoreComponentMod.^ {
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
    
    inline def index_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_index")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sauronjs", "Service")
  @js.native
  open class Service protected ()
    extends typings.sauronjs.srcCoreServiceMod.^ {
    def this(pubs: js.Array[String], subs: js.Array[String]) = this()
  }
  
  object events {
    
    object dom {
      
      @JSImport("sauronjs", "events.dom")
      @js.native
      val ^ : js.Any = js.native
      
      inline def update(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")().asInstanceOf[Unit]
    }
  }
  
  inline def instance(componentMap: SauronComponentMap): SauronInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(componentMap.asInstanceOf[js.Any]).asInstanceOf[SauronInstance]
  inline def instance(componentMap: SauronComponentMap, id: String): SauronInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(componentMap.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SauronInstance]
  
  inline def next(channels: js.Array[String], event: String, data: Any, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(channels.asInstanceOf[js.Any], event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object util {
    
    @JSImport("sauronjs", "util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def insert(params: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def ready(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
