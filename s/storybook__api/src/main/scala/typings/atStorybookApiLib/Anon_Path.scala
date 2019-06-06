package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  var path: java.lang.String
  var queryParams: atStorybookApiLib.distModulesUrlMod.QueryParams
  var storyId: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
  var viewMode: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Path {
  @scala.inline
  def apply(
    path: java.lang.String,
    queryParams: atStorybookApiLib.distModulesUrlMod.QueryParams,
    url: java.lang.String,
    storyId: java.lang.String = null,
    viewMode: java.lang.String = null
  ): Anon_Path = {
    val __obj = js.Dynamic.literal(path = path, queryParams = queryParams, url = url)
    if (storyId != null) __obj.updateDynamic("storyId")(storyId)
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode)
    __obj.asInstanceOf[Anon_Path]
  }
}

