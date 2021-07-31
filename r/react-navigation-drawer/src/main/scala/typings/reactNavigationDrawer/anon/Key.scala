package typings.reactNavigationDrawer.anon

import typings.reactNavigationDrawer.reactNavigationDrawerStrings.CHILD_ACTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var `type`: CHILD_ACTION
}
object Key {
  
  @scala.inline
  def apply(): Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CHILD_ACTION")
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setType(value: CHILD_ACTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
