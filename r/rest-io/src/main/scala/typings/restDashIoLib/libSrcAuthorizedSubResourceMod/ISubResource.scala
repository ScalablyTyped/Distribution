package typings
package restDashIoLib.libSrcAuthorizedSubResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubResource extends js.Object {
  var name: java.lang.String
  var parentResource: restDashIoLib.libSrcResourceMod.Resource
  var plural: js.UndefOr[java.lang.String] = js.undefined
  var populate: js.UndefOr[java.lang.String] = js.undefined
}

object ISubResource {
  @scala.inline
  def apply(
    name: java.lang.String,
    parentResource: restDashIoLib.libSrcResourceMod.Resource,
    plural: java.lang.String = null,
    populate: java.lang.String = null
  ): ISubResource = {
    val __obj = js.Dynamic.literal(name = name, parentResource = parentResource)
    if (plural != null) __obj.updateDynamic("plural")(plural)
    if (populate != null) __obj.updateDynamic("populate")(populate)
    __obj.asInstanceOf[ISubResource]
  }
}

