package typings.reactBootstrap.mediaBodyMod

import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaBodyProps extends ClassAttributes[MediaBody] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object MediaBodyProps {
  @scala.inline
  def apply(
    componentClass: ReactType[_] = null,
    key: Key = null,
    ref: js.UndefOr[Null | LegacyRef[MediaBody]] = js.undefined
  ): MediaBodyProps = {
    val __obj = js.Dynamic.literal()
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBodyProps]
  }
}

