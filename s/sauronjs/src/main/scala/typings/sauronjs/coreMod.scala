package typings.sauronjs

import typings.sauronjs.coreCacheMod.Cache
import typings.sauronjs.coreComponentMod.ComponentParameters
import typings.sauronjs.coreComponentMod.^
import typings.sauronjs.coreSauronMod.SauronComponentMap
import typings.sauronjs.coreSauronMod.SauronInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sauronjs/core", JSImport.Namespace)
@js.native
object coreMod extends js.Object {
  @js.native
  class Component protected () extends ^ {
    def this(params: ComponentParameters) = this()
  }
  
  @js.native
  class Service protected ()
    extends typings.sauronjs.coreServiceMod.^ {
    def this(pubs: js.Array[String], subs: js.Array[String]) = this()
  }
  
  def attachSubject(`object`: typings.sauronjs.coreServiceMod.^): js.Any = js.native
  def next(channels: js.Array[String], event: String, data: js.Any, id: String): Unit = js.native
  /* static members */
  @js.native
  object Component extends js.Object {
    var _index: Double = js.native
  }
  
  @js.native
  object cache extends js.Object {
    def apply(): Unit = js.native
    def apply(id: String): Cache = js.native
  }
  
  @js.native
  object instance extends js.Object {
    def apply(componentMap: SauronComponentMap): SauronInstance = js.native
    def apply(componentMap: SauronComponentMap, id: String): SauronInstance = js.native
  }
  
}

