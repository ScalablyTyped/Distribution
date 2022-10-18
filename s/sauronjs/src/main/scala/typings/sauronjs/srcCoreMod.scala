package typings.sauronjs

import typings.sauronjs.srcCoreCacheMod.Cache
import typings.sauronjs.srcCoreComponentMod.ComponentParameters
import typings.sauronjs.srcCoreSauronMod.SauronComponentMap
import typings.sauronjs.srcCoreSauronMod.SauronInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreMod {
  
  @JSImport("sauronjs/src/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sauronjs/src/core", "Component")
  @js.native
  open class Component protected ()
    extends typings.sauronjs.srcCoreComponentMod.^ {
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
    
    inline def index_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_index")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sauronjs/src/core", "Service")
  @js.native
  open class Service protected ()
    extends typings.sauronjs.srcCoreServiceMod.^ {
    def this(pubs: js.Array[String], subs: js.Array[String]) = this()
  }
  
  inline def attachSubject(`object`: typings.sauronjs.srcCoreServiceMod.^): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("attachSubject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def cache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")().asInstanceOf[Unit]
  inline def cache(id: String): Cache = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(id.asInstanceOf[js.Any]).asInstanceOf[Cache]
  
  inline def instance(componentMap: SauronComponentMap): SauronInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(componentMap.asInstanceOf[js.Any]).asInstanceOf[SauronInstance]
  inline def instance(componentMap: SauronComponentMap, id: String): SauronInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(componentMap.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SauronInstance]
  
  inline def next(channels: js.Array[String], event: String, data: Any, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(channels.asInstanceOf[js.Any], event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
