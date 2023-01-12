package typings.screeps

import typings.screeps.screepsStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shard extends StObject {
  
  /**
    * The name of the shard.
    */
  var name: String
  
  /**
    * Whether this shard belongs to the PTR.
    */
  var ptr: Boolean
  
  /**
    * Currently always equals to normal.
    */
  var `type`: normal
}
object Shard {
  
  inline def apply(name: String, ptr: Boolean): Shard = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ptr = ptr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("normal")
    __obj.asInstanceOf[Shard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shard] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPtr(value: Boolean): Self = StObject.set(x, "ptr", value.asInstanceOf[js.Any])
    
    inline def setType(value: normal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
