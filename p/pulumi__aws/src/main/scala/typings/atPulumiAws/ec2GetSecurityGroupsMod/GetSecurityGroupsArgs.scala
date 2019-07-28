package typings.atPulumiAws.ec2GetSecurityGroupsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecurityGroupsArgs extends js.Object {
  /**
    * One or more name/value pairs to use as filters. There are
    * several valid keys, for a full reference, check out
    * [describe-security-groups in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match for
    * desired security groups.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetSecurityGroupsArgs {
  @scala.inline
  def apply(filters: js.Array[Anon_NameValues] = null, tags: StringDictionary[js.Any] = null): GetSecurityGroupsArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetSecurityGroupsArgs]
  }
}

