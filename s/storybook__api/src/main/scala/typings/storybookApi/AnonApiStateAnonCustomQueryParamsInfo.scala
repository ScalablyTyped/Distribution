package typings.storybookApi

import typings.storybookApi.urlMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiStateAnonCustomQueryParamsInfo extends js.Object {
  var api: SubAPI
  var state: AnonCustomQueryParamsInfo
}

object AnonApiStateAnonCustomQueryParamsInfo {
  @scala.inline
  def apply(api: SubAPI, state: AnonCustomQueryParamsInfo): AnonApiStateAnonCustomQueryParamsInfo = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApiStateAnonCustomQueryParamsInfo]
  }
}

