package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configure extends StObject {
  
  var configure: HitsPerPage = js.native
}
object Configure {
  
  @scala.inline
  def apply(configure: HitsPerPage): Configure = {
    val __obj = js.Dynamic.literal(configure = configure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configure]
  }
  
  @scala.inline
  implicit class ConfigureMutableBuilder[Self <: Configure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigure(value: HitsPerPage): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
  }
}
