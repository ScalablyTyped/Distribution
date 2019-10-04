package typings.atPulumiAws.elasticsearchGetDomainMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainArgs extends js.Object {
  /**
    * Name of the domain.
    */
  val domainName: String
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetDomainArgs {
  @scala.inline
  def apply(domainName: String, tags: StringDictionary[js.Any] = null): GetDomainArgs = {
    val __obj = js.Dynamic.literal(domainName = domainName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetDomainArgs]
  }
}

