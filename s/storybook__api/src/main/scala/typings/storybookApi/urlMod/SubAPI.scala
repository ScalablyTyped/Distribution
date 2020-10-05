package typings.storybookApi.urlMod

import typings.reachRouter.mod.NavigateOptions
import typings.storybookApi.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubAPI extends js.Object {
  def getQueryParam(key: String): js.UndefOr[String] = js.native
  def getUrlState(): Path = js.native
  def navigateUrl(url: String, options: NavigateOptions[js.Object]): Unit = js.native
  def setQueryParams(input: QueryParams): Unit = js.native
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
  @scala.inline
  implicit class SubAPIOps[Self <: SubAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetQueryParam(value: String => js.UndefOr[String]): Self = this.set("getQueryParam", js.Any.fromFunction1(value))
    @scala.inline
    def setGetUrlState(value: () => Path): Self = this.set("getUrlState", js.Any.fromFunction0(value))
    @scala.inline
    def setNavigateUrl(value: (String, NavigateOptions[js.Object]) => Unit): Self = this.set("navigateUrl", js.Any.fromFunction2(value))
    @scala.inline
    def setSetQueryParams(value: QueryParams => Unit): Self = this.set("setQueryParams", js.Any.fromFunction1(value))
  }
  
}

