package typings
package atPulumiAwsLib.rdsGetEventCategoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEventCategoriesArgs extends js.Object {
  /**
    * The type of source that will be generating the events. Valid options are db-instance, db-security-group, db-parameter-group, db-snapshot, db-cluster or db-cluster-snapshot.
    */
  val sourceType: js.UndefOr[java.lang.String] = js.undefined
}

object GetEventCategoriesArgs {
  @scala.inline
  def apply(sourceType: java.lang.String = null): GetEventCategoriesArgs = {
    val __obj = js.Dynamic.literal()
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType)
    __obj.asInstanceOf[GetEventCategoriesArgs]
  }
}

