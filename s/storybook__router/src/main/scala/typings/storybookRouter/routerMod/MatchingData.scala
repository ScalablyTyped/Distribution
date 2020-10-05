package typings.storybookRouter.routerMod

import typings.storybookRouter.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchingData extends js.Object {
  var `match`: Null | Path = js.native
}

object MatchingData {
  @scala.inline
  def apply(): MatchingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchingData]
  }
  @scala.inline
  implicit class MatchingDataOps[Self <: MatchingData] (val x: Self) extends AnyVal {
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
    def setMatch(value: Path): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchNull: Self = this.set("match", null)
  }
  
}

