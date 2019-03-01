package typings
package atPulumiAwsLib.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfiguration extends js.Object {
  var logDriver: LogDriver
  var options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object LogConfiguration {
  @scala.inline
  def apply(logDriver: LogDriver, options: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null): LogConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logDriver")(logDriver)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[LogConfiguration]
  }
}

