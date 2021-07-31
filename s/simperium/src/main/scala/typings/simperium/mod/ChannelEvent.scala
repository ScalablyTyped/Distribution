package typings.simperium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelEvent[T]
  extends StObject
     with SimperiumEvent {
  
  def acknowledge(entityId: EntityId, change: Change[T]): Unit = js.native
  
  def indexingStateChange(isIndexing: Boolean): Unit = js.native
  
  def ready(): Unit = js.native
  
  def send(message: String): Unit = js.native
  
  def update(entityId: EntityId, updatedEntity: T): Unit = js.native
  def update(entityId: EntityId, updatedEntity: T, originalEntity: T): Unit = js.native
  def update(entityId: EntityId, updatedEntity: T, originalEntity: T, patch: Unit, isIndexing: Boolean): Unit = js.native
  def update(entityId: EntityId, updatedEntity: T, originalEntity: T, patch: JSONDiff[T]): Unit = js.native
  def update(entityId: EntityId, updatedEntity: T, originalEntity: T, patch: JSONDiff[T], isIndexing: Boolean): Unit = js.native
  def update(entityId: EntityId, updatedEntity: T, originalEntity: Unit, patch: Unit, isIndexing: Boolean): Unit = js.native
  def update(entityId: EntityId, updatedEntity: T, originalEntity: Unit, patch: JSONDiff[T]): Unit = js.native
  def update(
    entityId: EntityId,
    updatedEntity: T,
    originalEntity: Unit,
    patch: JSONDiff[T],
    isIndexing: Boolean
  ): Unit = js.native
  
  def version(entityId: EntityId, version: Double, entity: T): Unit = js.native
}
