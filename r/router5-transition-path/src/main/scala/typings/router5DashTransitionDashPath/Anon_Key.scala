package typings.router5DashTransitionDashPath

import org.scalablytyped.runtime.StringDictionary
import typings.router5DashTransitionDashPath.typesTransitionPathMod.SegementParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var options: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var params: js.UndefOr[StringDictionary[SegementParams]] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(options: StringDictionary[Boolean] = null, params: StringDictionary[SegementParams] = null): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Key]
  }
}

