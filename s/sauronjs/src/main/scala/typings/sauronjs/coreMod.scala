package typings.sauronjs

import typings.sauronjs.cacheMod.Cache
import typings.sauronjs.componentMod.ComponentParameters
import typings.sauronjs.componentMod.^
import typings.sauronjs.sauronMod.SauronComponentMap
import typings.sauronjs.sauronMod.SauronInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("sauronjs/src/core", "Component")
  @js.native
  class Component protected () extends ^ {
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
  
  @JSImport("sauronjs/src/core", "attachSubject")
  @js.native
  def attachSubject(`object`: typings.sauronjs.serviceMod.^): js.Any = js.native
  
  object cache {
    
    @JSImport("sauronjs/src/core", "cache")
    @js.native
    def apply(): Unit = js.native
    @JSImport("sauronjs/src/core", "cache")
    @js.native
    def apply(id: String): Cache = js.native
  }
  
  object instance {
    
    @JSImport("sauronjs/src/core", "instance")
    @js.native
    def apply(componentMap: SauronComponentMap): SauronInstance = js.native
    @JSImport("sauronjs/src/core", "instance")
    @js.native
    def apply(componentMap: SauronComponentMap, id: String): SauronInstance = js.native
  }
  
  @JSImport("sauronjs/src/core", "next")
  @js.native
  def next(channels: js.Array[String], event: String, data: js.Any, id: String): Unit = js.native
}
