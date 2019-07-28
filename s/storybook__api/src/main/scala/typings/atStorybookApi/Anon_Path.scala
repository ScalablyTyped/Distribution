package typings.atStorybookApi

import typings.atStorybookApi.distModulesUrlMod.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  var path: String
  var queryParams: QueryParams
  var storyId: js.UndefOr[String] = js.undefined
  var url: String
  var viewMode: js.UndefOr[String] = js.undefined
}

object Anon_Path {
  @scala.inline
  def apply(
    path: String,
    queryParams: QueryParams,
    url: String,
    storyId: String = null,
    viewMode: String = null
  ): Anon_Path = {
    val __obj = js.Dynamic.literal(path = path, queryParams = queryParams, url = url)
    if (storyId != null) __obj.updateDynamic("storyId")(storyId)
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode)
    __obj.asInstanceOf[Anon_Path]
  }
}

