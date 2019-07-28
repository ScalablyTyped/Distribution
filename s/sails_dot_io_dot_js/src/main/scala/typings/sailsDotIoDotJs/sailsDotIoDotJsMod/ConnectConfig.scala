package typings.sailsDotIoDotJs.sailsDotIoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectConfig extends js.Object {
  var initialConnectionHeaders: js.UndefOr[InitialConnectionHeaders] = js.undefined
}

object ConnectConfig {
  @scala.inline
  def apply(initialConnectionHeaders: InitialConnectionHeaders = null): ConnectConfig = {
    val __obj = js.Dynamic.literal()
    if (initialConnectionHeaders != null) __obj.updateDynamic("initialConnectionHeaders")(initialConnectionHeaders)
    __obj.asInstanceOf[ConnectConfig]
  }
}

