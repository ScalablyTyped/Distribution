package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `14` extends StObject {
  
  var filter: js.Any | String = js.native
}
object `14` {
  
  @scala.inline
  def apply(filter: js.Any | String): `14` = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit class `14MutableBuilder`[Self <: `14`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: js.Any | String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
