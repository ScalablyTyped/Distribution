package typings.atStorybookAddonDashKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeserializeSerializeUndefined extends js.Object {
  def deserialize(): js.UndefOr[scala.Nothing]
  def serialize(): js.UndefOr[scala.Nothing]
}

object Anon_DeserializeSerializeUndefined {
  @scala.inline
  def apply(deserialize: () => js.UndefOr[scala.Nothing], serialize: () => js.UndefOr[scala.Nothing]): Anon_DeserializeSerializeUndefined = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction0(deserialize), serialize = js.Any.fromFunction0(serialize))
  
    __obj.asInstanceOf[Anon_DeserializeSerializeUndefined]
  }
}

