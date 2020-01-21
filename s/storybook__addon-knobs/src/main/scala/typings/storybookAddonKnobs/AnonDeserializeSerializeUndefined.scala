package typings.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeserializeSerializeUndefined extends js.Object {
  def deserialize(): js.UndefOr[scala.Nothing]
  def serialize(): js.UndefOr[scala.Nothing]
}

object AnonDeserializeSerializeUndefined {
  @scala.inline
  def apply(deserialize: () => js.UndefOr[scala.Nothing], serialize: () => js.UndefOr[scala.Nothing]): AnonDeserializeSerializeUndefined = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction0(deserialize), serialize = js.Any.fromFunction0(serialize))
  
    __obj.asInstanceOf[AnonDeserializeSerializeUndefined]
  }
}

