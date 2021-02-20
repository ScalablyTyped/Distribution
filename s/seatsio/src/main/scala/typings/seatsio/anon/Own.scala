package typings.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Own extends StObject {
  
  var own: String = js.native
  
  var parent: js.UndefOr[String] = js.native
  
  var section: js.UndefOr[String] = js.native
}
object Own {
  
  @scala.inline
  def apply(own: String): Own = {
    val __obj = js.Dynamic.literal(own = own.asInstanceOf[js.Any])
    __obj.asInstanceOf[Own]
  }
  
  @scala.inline
  implicit class OwnMutableBuilder[Self <: Own] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwn(value: String): Self = StObject.set(x, "own", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
  }
}
