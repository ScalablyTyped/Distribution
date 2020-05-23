package typings.storybookApi.urlMod

import typings.reachRouter.mod.NavigateOptions
import typings.storybookApi.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  def getQueryParam(key: String): js.UndefOr[String]
  def getUrlState(): Path
  def navigateUrl(url: String, options: NavigateOptions[js.Object]): Unit
  def setQueryParams(input: QueryParams): Unit
}

object SubAPI {
  @scala.inline
  def apply(
    getQueryParam: String => js.UndefOr[String],
    getUrlState: () => Path,
    navigateUrl: (String, NavigateOptions[js.Object]) => Unit,
    setQueryParams: QueryParams => Unit
  ): SubAPI = {
    val __obj = js.Dynamic.literal(getQueryParam = js.Any.fromFunction1(getQueryParam), getUrlState = js.Any.fromFunction0(getUrlState), navigateUrl = js.Any.fromFunction2(navigateUrl), setQueryParams = js.Any.fromFunction1(setQueryParams))
    __obj.asInstanceOf[SubAPI]
  }
}

