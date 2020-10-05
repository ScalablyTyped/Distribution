package typings.storybookApi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.storybookApi.urlMod.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Other
  extends /* key */ StringDictionary[js.Any] {
  var customQueryParams: QueryParams = js.native
}

object Other {
  @scala.inline
  def apply(customQueryParams: QueryParams): Other = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Other]
  }
  @scala.inline
  implicit class OtherOps[Self <: Other] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other_ <: js.Any](other: Other_): Self with Other_ = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other_]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomQueryParams(value: QueryParams): Self = this.set("customQueryParams", value.asInstanceOf[js.Any])
  }
  
}

