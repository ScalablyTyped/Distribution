package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefRef extends js.Object {
  var ref: js.UndefOr[typings.react.mod.Ref[_ | GetNode]] = js.undefined
}

object RefRef {
  @scala.inline
  def apply(ref: js.UndefOr[Null | (typings.react.mod.Ref[_ | GetNode])] = js.undefined): RefRef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefRef]
  }
}

