package typings.atPulumiAws.guarddutyGetDetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorArgs extends js.Object {
  /**
    * The ID of the detector.
    */
  val id: js.UndefOr[String] = js.native
}

object GetDetectorArgs {
  @scala.inline
  def apply(id: String = null): GetDetectorArgs = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorArgs]
  }
}

