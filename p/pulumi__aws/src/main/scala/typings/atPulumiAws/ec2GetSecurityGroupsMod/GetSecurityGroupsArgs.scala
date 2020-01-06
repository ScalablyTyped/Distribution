package typings.atPulumiAws.ec2GetSecurityGroupsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2.GetSecurityGroupsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecurityGroupsArgs extends js.Object {
  /**
    * One or more name/value pairs to use as filters. There are
    * several valid keys, for a full reference, check out
    * [describe-security-groups in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetSecurityGroupsFilter]] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match for
    * desired security groups.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetSecurityGroupsArgs {
  @scala.inline
  def apply(filters: js.Array[GetSecurityGroupsFilter] = null, tags: StringDictionary[js.Any] = null): GetSecurityGroupsArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecurityGroupsArgs]
  }
}

