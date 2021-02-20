package typings.sauronjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.sauronjs.anon.TypeofComponent
import typings.sauronjs.componentMod.ComponentParameters
import typings.sauronjs.componentMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sauronMod {
  
  @JSImport("sauronjs/src/core/sauron", JSImport.Namespace)
  @js.native
  def apply(componentMap: SauronComponentMap): SauronInstance = js.native
  @JSImport("sauronjs/src/core/sauron", JSImport.Namespace)
  @js.native
  def apply(componentMap: SauronComponentMap, id: String): SauronInstance = js.native
  
  @js.native
  trait Info extends StObject {
    
    var total: Double = js.native
  }
  object Info {
    
    @scala.inline
    def apply(total: Double): Info = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  type SauronComponentMap = StringDictionary[TypeofComponent with (Instantiable1[/* params */ ComponentParameters, ^])]
  
  @js.native
  trait SauronInstance extends StObject {
    
    def info(): Info = js.native
    
    def initCache(id: String): Unit = js.native
    
    def plugin(plugin: js.Function2[/* instance */ this.type, /* options */ js.Any, Unit], options: js.Any): SauronInstance = js.native
    
    def rebootstrap(): Unit = js.native
    def rebootstrap(map: SauronComponentMap): Unit = js.native
    
    def service(Service: Instantiable1[/* options */ js.Any, typings.sauronjs.serviceMod.^]): SauronInstance = js.native
    def service(Service: Instantiable1[/* options */ js.Any, typings.sauronjs.serviceMod.^], options: js.Any): SauronInstance = js.native
  }
}
