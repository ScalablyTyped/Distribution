package typings.pulumiAws.getDomainMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainArgs extends js.Object {
  /**
    * Name of the domain.
    */
  val domainName: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetDomainArgs {
  @scala.inline
  def apply(domainName: String, tags: StringDictionary[js.Any] = null): GetDomainArgs = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainArgs]
  }
}

