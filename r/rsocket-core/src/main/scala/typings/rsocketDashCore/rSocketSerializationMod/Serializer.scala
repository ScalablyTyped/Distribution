package typings.rsocketDashCore.rSocketSerializationMod

import typings.rsocketDashTypes.reactiveSocketTypesMod.Encodable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serializer[T] extends js.Object {
  def deserialize(): js.UndefOr[T] = js.native
  def deserialize(data: Encodable): js.UndefOr[T] = js.native
  def serialize(): js.UndefOr[Encodable] = js.native
  def serialize(data: T): js.UndefOr[Encodable] = js.native
}

