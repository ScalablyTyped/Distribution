package typings.pulumiAws.outputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSourceAuth extends js.Object {
  /**
    * The resource value that applies to the specified authorization type.
    */
  var resource: js.UndefOr[String] = js.native
  /**
    * The authorization type to use. The only valid value is `OAUTH`
    */
  var `type`: String = js.native
}

object ProjectSourceAuth {
  @scala.inline
  def apply(`type`: String, resource: String = null): ProjectSourceAuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSourceAuth]
  }
}

