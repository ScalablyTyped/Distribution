package typings.screeps

import typings.screeps.screepsStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shard extends StObject {
  
  /**
    * The name of the shard.
    */
  var name: String = js.native
  
  /**
    * Whether this shard belongs to the PTR.
    */
  var ptr: Boolean = js.native
  
  /**
    * Currently always equals to normal.
    */
  var `type`: normal = js.native
}
object Shard {
  
  @scala.inline
  def apply(name: String, ptr: Boolean, `type`: normal): Shard = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ptr = ptr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shard]
  }
  
  @scala.inline
  implicit class ShardMutableBuilder[Self <: Shard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPtr(value: Boolean): Self = StObject.set(x, "ptr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: normal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
