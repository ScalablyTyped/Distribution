package typings.simperium.mod

import typings.simperium.simperiumStrings.full
import typings.simperium.simperiumStrings.modify
import typings.simperium.simperiumStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.simperium.anon.Id[T]
  - typings.simperium.anon.Object[T]
  - typings.simperium.anon.Type
*/
trait LocalQueuedChange[T] extends js.Object
object LocalQueuedChange {
  
  @scala.inline
  def Id[T](id: EntityId, `object`: T, `type`: modify): LocalQueuedChange[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalQueuedChange[T]]
  }
  
  @scala.inline
  def Object[T](`object`: T, originalChange: Change[T], `type`: full): LocalQueuedChange[T] = {
    val __obj = js.Dynamic.literal(originalChange = originalChange.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalQueuedChange[T]]
  }
  
  @scala.inline
  def Type[T](id: EntityId, `type`: remove): LocalQueuedChange[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalQueuedChange[T]]
  }
}
