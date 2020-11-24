package typings.sauronjs

import typings.sauronjs.cacheMod.Cache
import typings.sauronjs.componentMod.ComponentParameters
import typings.sauronjs.sauronMod.SauronComponentMap
import typings.sauronjs.sauronMod.SauronInstance
import typings.sauronjs.serviceMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sauronjs/src/core", JSImport.Namespace)
@js.native
object coreMod extends js.Object {
  
  def attachSubject(`object`: ^): js.Any = js.native
  
  def next(channels: js.Array[String], event: String, data: js.Any, id: String): Unit = js.native
  
  @js.native
  class Component protected ()
    extends typings.sauronjs.componentMod.^ {
    def this(params: ComponentParameters) = this()
  }
  /* static members */
  @js.native
  object Component extends js.Object {
    
    var _index: Double = js.native
  }
  
  @js.native
  class Service protected () extends ^ {
    def this(pubs: js.Array[String], subs: js.Array[String]) = this()
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
