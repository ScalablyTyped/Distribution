package typings.pulumiPulumi.createClosureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectInfo extends js.Object {
  var env: PropertyMap
  var proto: js.UndefOr[Entry] = js.undefined
}

object ObjectInfo {
  @scala.inline
  def apply(env: PropertyMap, proto: Entry = null): ObjectInfo = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
    if (proto != null) __obj.updateDynamic("proto")(proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectInfo]
  }
}

