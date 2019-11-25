package typings.restDashIo.libSrcSubResourceMod

import typings.restDashIo.libSrcResourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubResource extends js.Object {
  var name: String
  var parentResource: Resource
  var plural: js.UndefOr[String] = js.undefined
  var populate: js.UndefOr[String] = js.undefined
}

object ISubResource {
  @scala.inline
  def apply(name: String, parentResource: Resource, plural: String = null, populate: String = null): ISubResource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentResource = parentResource.asInstanceOf[js.Any])
    if (plural != null) __obj.updateDynamic("plural")(plural.asInstanceOf[js.Any])
    if (populate != null) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubResource]
  }
}

