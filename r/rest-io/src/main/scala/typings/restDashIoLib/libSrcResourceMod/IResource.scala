package typings
package restDashIoLib.libSrcResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResource extends js.Object {
  var model: js.Any
  var name: java.lang.String
  var parentRef: js.UndefOr[java.lang.String] = js.undefined
  var parentResource: js.UndefOr[Resource] = js.undefined
  var plural: js.UndefOr[java.lang.String] = js.undefined
  var populate: js.UndefOr[java.lang.String] = js.undefined
}

object IResource {
  @scala.inline
  def apply(
    model: js.Any,
    name: java.lang.String,
    parentRef: java.lang.String = null,
    parentResource: Resource = null,
    plural: java.lang.String = null,
    populate: java.lang.String = null
  ): IResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("name")(name)
    if (parentRef != null) __obj.updateDynamic("parentRef")(parentRef)
    if (parentResource != null) __obj.updateDynamic("parentResource")(parentResource)
    if (plural != null) __obj.updateDynamic("plural")(plural)
    if (populate != null) __obj.updateDynamic("populate")(populate)
    __obj.asInstanceOf[IResource]
  }
}

