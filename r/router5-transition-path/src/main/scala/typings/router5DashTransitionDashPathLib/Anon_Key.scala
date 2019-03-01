package typings
package router5DashTransitionDashPathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  var params: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[router5DashTransitionDashPathLib.typesTransitionPathMod.SegementParams]
  ] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    options: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    params: org.scalablytyped.runtime.StringDictionary[router5DashTransitionDashPathLib.typesTransitionPathMod.SegementParams] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Key]
  }
}

