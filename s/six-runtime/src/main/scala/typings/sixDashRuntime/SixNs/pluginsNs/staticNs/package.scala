package typings.sixDashRuntime.SixNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object staticNs {
  import typings.sixDashRuntime.SixNs.middleware

  type staticFactory = js.Function1[/* conf */ staticConf, middleware]
}
