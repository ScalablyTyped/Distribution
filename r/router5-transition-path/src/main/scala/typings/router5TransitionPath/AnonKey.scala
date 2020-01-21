package typings.router5TransitionPath

import org.scalablytyped.runtime.StringDictionary
import typings.router5TransitionPath.transitionPathMod.SegementParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var options: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var params: js.UndefOr[StringDictionary[SegementParams]] = js.undefined
}

object AnonKey {
  @scala.inline
  def apply(options: StringDictionary[Boolean] = null, params: StringDictionary[SegementParams] = null): AnonKey = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

