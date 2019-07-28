package typings.atStorybookApi.distModulesUrlMod

import typings.atStorybookApi.Anon_Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  def getQueryParam(key: String): js.UndefOr[String]
  def getUrlState(): Anon_Path
  def setQueryParams(input: QueryParams): Unit
}

object SubAPI {
  @scala.inline
  def apply(
    getQueryParam: String => js.UndefOr[String],
    getUrlState: () => Anon_Path,
    setQueryParams: QueryParams => Unit
  ): SubAPI = {
    val __obj = js.Dynamic.literal(getQueryParam = js.Any.fromFunction1(getQueryParam), getUrlState = js.Any.fromFunction0(getUrlState), setQueryParams = js.Any.fromFunction1(setQueryParams))
  
    __obj.asInstanceOf[SubAPI]
  }
}

