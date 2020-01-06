package typings.atPulumiAws.ecsContainerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogConfiguration extends js.Object {
  var logDriver: LogDriver = js.native
  var options: js.UndefOr[StringDictionary[String]] = js.native
}

object LogConfiguration {
  @scala.inline
  def apply(logDriver: LogDriver, options: StringDictionary[String] = null): LogConfiguration = {
    val __obj = js.Dynamic.literal(logDriver = logDriver.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfiguration]
  }
}

