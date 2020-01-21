package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @internal You shouldn't need to use this type since you never see these attributes
  * inside your component or have to validate them.
  */
trait Attributes extends js.Object {
  var key: js.UndefOr[Key] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(key: Key = null): Attributes = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

