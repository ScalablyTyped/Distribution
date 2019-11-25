package typings.atStorybookAddonDashKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeserializeSerialize extends js.Object {
  var deserialize: js.Function0[js.UndefOr[scala.Nothing]]
  var serialize: js.Function0[js.UndefOr[scala.Nothing]]
}

object Anon_DeserializeSerialize {
  @scala.inline
  def apply(deserialize: () => js.UndefOr[scala.Nothing], serialize: () => js.UndefOr[scala.Nothing]): Anon_DeserializeSerialize = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction0(deserialize), serialize = js.Any.fromFunction0(serialize))
  
    __obj.asInstanceOf[Anon_DeserializeSerialize]
  }
}

