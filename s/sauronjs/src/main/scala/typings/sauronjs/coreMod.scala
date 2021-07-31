package typings.sauronjs

import typings.sauronjs.cacheMod.Cache
import typings.sauronjs.componentMod.ComponentParameters
import typings.sauronjs.sauronMod.SauronComponentMap
import typings.sauronjs.sauronMod.SauronInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("sauronjs/src/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sauronjs/src/core", "Component")
  @js.native
  class Component protected ()
    extends typings.sauronjs.componentMod.^ {
    def this(params: ComponentParameters) = this()
  }
  object Component {
    
    @JSImport("sauronjs/src/core", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("sauronjs/src/core", "Component._index")
    @js.native
    def index: Double = js.native
    
    @scala.inline
    def index_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_index")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sauronjs/src/core", "Service")
  @js.native
  class Service protected ()
    extends typings.sauronjs.serviceMod.^ {
    def this(pubs: js.Array[String], subs: js.Array[String]) = this()
  }
  
  @scala.inline
  def attachSubject(`object`: typings.sauronjs.serviceMod.^): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("attachSubject")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  object cache {
    
    @scala.inline
    def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    @scala.inline
    def apply(id: String): Cache = ^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any]).asInstanceOf[Cache]
    
    @JSImport("sauronjs/src/core", "cache")
    @js.native
    val ^ : js.Any = js.native
  }
  
  object instance {
    
    @scala.inline
    def apply(componentMap: SauronComponentMap): SauronInstance = ^.asInstanceOf[js.Dynamic].apply(componentMap.asInstanceOf[js.Any]).asInstanceOf[SauronInstance]
    @scala.inline
    def apply(componentMap: SauronComponentMap, id: String): SauronInstance = (^.asInstanceOf[js.Dynamic].apply(componentMap.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SauronInstance]
    
    @JSImport("sauronjs/src/core", "instance")
    @js.native
    val ^ : js.Any = js.native
  }
  
  @scala.inline
  def next(channels: js.Array[String], event: String, data: js.Any, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(channels.asInstanceOf[js.Any], event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
