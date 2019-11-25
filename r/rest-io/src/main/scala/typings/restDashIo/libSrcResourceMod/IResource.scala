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
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (parentRef != null) __obj.updateDynamic("parentRef")(parentRef.asInstanceOf[js.Any])
    if (parentResource != null) __obj.updateDynamic("parentResource")(parentResource.asInstanceOf[js.Any])
    if (plural != null) __obj.updateDynamic("plural")(plural.asInstanceOf[js.Any])
    if (populate != null) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResource]
  }
}

