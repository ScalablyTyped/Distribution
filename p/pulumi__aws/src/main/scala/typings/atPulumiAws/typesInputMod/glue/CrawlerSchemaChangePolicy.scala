package typings.atPulumiAws.typesInputMod.glue

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerSchemaChangePolicy extends js.Object {
  /**
    * The deletion behavior when the crawler finds a deleted object. Valid values: `LOG`, `DELETE_FROM_DATABASE`, or `DEPRECATE_IN_DATABASE`. Defaults to `DEPRECATE_IN_DATABASE`.
    */
  var deleteBehavior: js.UndefOr[Input[String]] = js.undefined
  /**
    * The update behavior when the crawler finds a changed schema. Valid values: `LOG` or `UPDATE_IN_DATABASE`. Defaults to `UPDATE_IN_DATABASE`.
    */
  var updateBehavior: js.UndefOr[Input[String]] = js.undefined
}

object CrawlerSchemaChangePolicy {
  @scala.inline
  def apply(deleteBehavior: Input[String] = null, updateBehavior: Input[String] = null): CrawlerSchemaChangePolicy = {
    val __obj = js.Dynamic.literal()
    if (deleteBehavior != null) __obj.updateDynamic("deleteBehavior")(deleteBehavior.asInstanceOf[js.Any])
    if (updateBehavior != null) __obj.updateDynamic("updateBehavior")(updateBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerSchemaChangePolicy]
  }
}

