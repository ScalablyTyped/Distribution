package typings.simperium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.simperium.anon.Id[T]
  - typings.simperium.anon.Object[T]
  - typings.simperium.anon.Type
*/
trait LocalQueuedChange[T] extends StObject
object LocalQueuedChange {
  
  inline def Id[T](id: EntityId, `object`: T): typings.simperium.anon.Id[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("modify")
    __obj.asInstanceOf[typings.simperium.anon.Id[T]]
  }
  
  inline def Object[T](`object`: T, originalChange: Change[T]): typings.simperium.anon.Object[T] = {
    val __obj = js.Dynamic.literal(originalChange = originalChange.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("full")
    __obj.asInstanceOf[typings.simperium.anon.Object[T]]
  }
  
  inline def Type(id: EntityId): typings.simperium.anon.Type = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("remove")
    __obj.asInstanceOf[typings.simperium.anon.Type]
  }
}
