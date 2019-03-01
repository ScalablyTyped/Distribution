package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderStateConfig extends js.Object {
  var done: scala.Boolean
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var props: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var retry: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var stale: scala.Boolean
}

object RenderStateConfig {
  @scala.inline
  def apply(
    done: scala.Boolean,
    stale: scala.Boolean,
    error: stdLib.Error = null,
    props: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    retry: js.Function0[scala.Unit] = null
  ): RenderStateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("stale")(stale)
    if (error != null) __obj.updateDynamic("error")(error)
    if (props != null) __obj.updateDynamic("props")(props)
    if (retry != null) __obj.updateDynamic("retry")(retry)
    __obj.asInstanceOf[RenderStateConfig]
  }
}

