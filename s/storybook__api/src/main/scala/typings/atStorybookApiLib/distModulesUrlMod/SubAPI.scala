package typings
package atStorybookApiLib.distModulesUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  def getQueryParam(key: java.lang.String): js.UndefOr[java.lang.String]
  def getUrlState(): atStorybookApiLib.Anon_Path
  def setQueryParams(input: QueryParams): scala.Unit
}

object SubAPI {
  @scala.inline
  def apply(
    getQueryParam: java.lang.String => js.UndefOr[java.lang.String],
    getUrlState: () => atStorybookApiLib.Anon_Path,
    setQueryParams: QueryParams => scala.Unit
  ): SubAPI = {
    val __obj = js.Dynamic.literal(getQueryParam = js.Any.fromFunction1(getQueryParam), getUrlState = js.Any.fromFunction0(getUrlState), setQueryParams = js.Any.fromFunction1(setQueryParams))
  
    __obj.asInstanceOf[SubAPI]
  }
}

