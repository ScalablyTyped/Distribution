package typings.pulumiAws.rdsGetInstanceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceArgs extends js.Object {
  /**
    * The name of the RDS instance
    */
  val dbInstanceIdentifier: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetInstanceArgs {
  @scala.inline
  def apply(dbInstanceIdentifier: String, tags: StringDictionary[js.Any] = null): GetInstanceArgs = {
    val __obj = js.Dynamic.literal(dbInstanceIdentifier = dbInstanceIdentifier.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceArgs]
  }
}

