package typings.simperium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelEvent[T] extends SimperiumEvent {
  def acknowledge(entityId: EntityId, change: Change[T]): Unit = js.native
  def indexingStateChange(isIndexing: Boolean): Unit = js.native
  def ready(): Unit = js.native
  def send(message: String): Unit = js.native
  def update(entityId: EntityId, updatedEntity: T): Unit = js.native
  def update(entityId: EntityId, updatedEntity: T, originalEntity: T): Unit = js.native
  def update(
    entityId: EntityId,
    updatedEntity: T,
    originalEntity: T,
    patch: js.UndefOr[scala.Nothing],
    isIndexing: Boolean
  ): Unit = js.native
  def update(entityId: EntityId, updatedEntity: T, originalEntity: T, patch: JSONDiff[T]): Unit = js.native
  def update(entityId: EntityId, updatedEntity: T, originalEntity: T, patch: JSONDiff[T], isIndexing: Boolean): Unit = js.native
  def update(
    entityId: EntityId,
    updatedEntity: T,
    originalEntity: js.UndefOr[scala.Nothing],
    patch: js.UndefOr[scala.Nothing],
    isIndexing: Boolean
  ): Unit = js.native
  def update(
    entityId: EntityId,
    updatedEntity: T,
    originalEntity: js.UndefOr[scala.Nothing],
    patch: JSONDiff[T]
  ): Unit = js.native
  def update(
    entityId: EntityId,
    updatedEntity: T,
    originalEntity: js.UndefOr[scala.Nothing],
    patch: JSONDiff[T],
    isIndexing: Boolean
  ): Unit = js.native
  def version(entityId: EntityId, version: Double, entity: T): Unit = js.native
}

