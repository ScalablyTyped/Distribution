package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultIndex extends StObject {
  
  var defaultIndex: Double = js.native
  
  var `type`: String = js.native
}
object DefaultIndex {
  
  @scala.inline
  def apply(defaultIndex: Double, `type`: String): DefaultIndex = {
    val __obj = js.Dynamic.literal(defaultIndex = defaultIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultIndex]
  }
  
  @scala.inline
  implicit class DefaultIndexMutableBuilder[Self <: DefaultIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultIndex(value: Double): Self = StObject.set(x, "defaultIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
