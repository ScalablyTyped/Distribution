package typings.atPulumiAws.ecsContainerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfiguration extends js.Object {
  var logDriver: LogDriver
  var options: js.UndefOr[StringDictionary[String]] = js.undefined
}

object LogConfiguration {
  @scala.inline
  def apply(logDriver: LogDriver, options: StringDictionary[String] = null): LogConfiguration = {
    val __obj = js.Dynamic.literal(logDriver = logDriver)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[LogConfiguration]
  }
}

