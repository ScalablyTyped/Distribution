package typings.sauronjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.sauronjs.anon.TypeofComponent
import typings.sauronjs.componentMod.ComponentParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sauronMod {
  
  inline def apply(componentMap: SauronComponentMap): SauronInstance = ^.asInstanceOf[js.Dynamic].apply(componentMap.asInstanceOf[js.Any]).asInstanceOf[SauronInstance]
  inline def apply(componentMap: SauronComponentMap, id: String): SauronInstance = (^.asInstanceOf[js.Dynamic].apply(componentMap.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SauronInstance]
  
  @JSImport("sauronjs/src/core/sauron", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Info extends StObject {
    
    var total: Double
  }
  object Info {
    
    inline def apply(total: Double): Info = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    extension [Self <: Info](x: Self) {
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  type SauronComponentMap = StringDictionary[
    TypeofComponent & (Instantiable1[/* params */ ComponentParameters, typings.sauronjs.componentMod.^])
  ]
  
  @js.native
  trait SauronInstance extends StObject {
    
    def info(): Info = js.native
    
    def initCache(id: String): Unit = js.native
    
    def plugin(plugin: js.Function2[/* instance */ this.type, /* options */ Any, Unit], options: Any): SauronInstance = js.native
    
    def rebootstrap(): Unit = js.native
    def rebootstrap(map: SauronComponentMap): Unit = js.native
    
    def service(Service: Instantiable1[/* options */ Any, typings.sauronjs.serviceMod.^]): SauronInstance = js.native
    def service(Service: Instantiable1[/* options */ Any, typings.sauronjs.serviceMod.^], options: Any): SauronInstance = js.native
  }
}
