package typings.atPulumiAws.rdsGetEventCategoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEventCategoriesArgs extends js.Object {
  /**
    * The type of source that will be generating the events. Valid options are db-instance, db-security-group, db-parameter-group, db-snapshot, db-cluster or db-cluster-snapshot.
    */
  val sourceType: js.UndefOr[String] = js.native
}

object GetEventCategoriesArgs {
  @scala.inline
  def apply(sourceType: String = null): GetEventCategoriesArgs = {
    val __obj = js.Dynamic.literal()
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventCategoriesArgs]
  }
}

