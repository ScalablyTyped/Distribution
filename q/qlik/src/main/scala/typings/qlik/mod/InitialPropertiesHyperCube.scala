package typings.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialPropertiesHyperCube
  extends /* key */ StringDictionary[js.Any]
     with InitialProperties {
  
  var qHyperCubeDef: HyperCubeDef = js.native
}
object InitialPropertiesHyperCube {
  
  @scala.inline
  def apply(qHyperCubeDef: HyperCubeDef): InitialPropertiesHyperCube = {
    val __obj = js.Dynamic.literal(qHyperCubeDef = qHyperCubeDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialPropertiesHyperCube]
  }
  
  @scala.inline
  implicit class InitialPropertiesHyperCubeMutableBuilder[Self <: InitialPropertiesHyperCube] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQHyperCubeDef(value: HyperCubeDef): Self = StObject.set(x, "qHyperCubeDef", value.asInstanceOf[js.Any])
  }
}
