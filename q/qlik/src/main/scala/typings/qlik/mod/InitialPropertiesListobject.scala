package typings.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialPropertiesListobject
  extends /* key */ StringDictionary[js.Any]
     with InitialProperties {
  
  var qListobjectDef: ListobjectDef = js.native
}
object InitialPropertiesListobject {
  
  @scala.inline
  def apply(qListobjectDef: ListobjectDef): InitialPropertiesListobject = {
    val __obj = js.Dynamic.literal(qListobjectDef = qListobjectDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialPropertiesListobject]
  }
  
  @scala.inline
  implicit class InitialPropertiesListobjectMutableBuilder[Self <: InitialPropertiesListobject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQListobjectDef(value: ListobjectDef): Self = StObject.set(x, "qListobjectDef", value.asInstanceOf[js.Any])
  }
}
