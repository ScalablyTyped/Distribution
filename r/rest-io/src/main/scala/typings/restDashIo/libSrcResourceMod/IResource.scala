package typings.restDashIo.libSrcResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResource extends js.Object {
  var model: js.Any
  var name: String
  var parentRef: js.UndefOr[String] = js.undefined
  var parentResource: js.UndefOr[Resource] = js.undefined
  var plural: js.UndefOr[String] = js.undefined
  var populate: js.UndefOr[String] = js.undefined
}

object IResource {
  @scala.inline
  def apply(
    model: js.Any,
    name: String,
    parentRef: String = null,
    parentResource: Resource = null,
    plural: String = null,
    populate: String = null
  ): IResource = {
    val __obj = js.Dynamic.literal(model = model, name = name)
    if (parentRef != null) __obj.updateDynamic("parentRef")(parentRef)
    if (parentResource != null) __obj.updateDynamic("parentResource")(parentResource)
    if (plural != null) __obj.updateDynamic("plural")(plural)
    if (populate != null) __obj.updateDynamic("populate")(populate)
    __obj.asInstanceOf[IResource]
  }
}

