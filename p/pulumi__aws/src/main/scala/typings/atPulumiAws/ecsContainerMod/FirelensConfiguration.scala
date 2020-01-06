package typings.atPulumiAws.ecsContainerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirelensConfiguration extends js.Object {
  var options: js.UndefOr[StringDictionary[String]] = js.native
  var `type`: String = js.native
}

object FirelensConfiguration {
  @scala.inline
  def apply(`type`: String, options: StringDictionary[String] = null): FirelensConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirelensConfiguration]
  }
}

