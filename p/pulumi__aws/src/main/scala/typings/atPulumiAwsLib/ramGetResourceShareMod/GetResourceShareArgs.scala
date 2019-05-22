package typings
package atPulumiAwsLib.ramGetResourceShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceShareArgs extends js.Object {
  /**
    * A filter used to scope the list e.g. by tags. See [related docs] (https://docs.aws.amazon.com/ram/latest/APIReference/API_TagFilter.html).
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * The name of the tag key to filter on.
    */
  val name: java.lang.String
  /**
    * The owner of the resource share. Valid values are SELF or OTHER-ACCOUNTS
    */
  val resourceOwner: java.lang.String
}

object GetResourceShareArgs {
  @scala.inline
  def apply(
    name: java.lang.String,
    resourceOwner: java.lang.String,
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null
  ): GetResourceShareArgs = {
    val __obj = js.Dynamic.literal(name = name, resourceOwner = resourceOwner)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetResourceShareArgs]
  }
}

