package typings.atStorybookApi

import typings.atStorybookApi.distModulesShortcutsMod.SubAPI
import typings.atStorybookApi.distModulesShortcutsMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiHasApi extends js.Object {
  var api: SubAPI
  var state: SubState
  def init(hasApi: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any): Unit
}

object Anon_ApiHasApi {
  @scala.inline
  def apply(
    api: SubAPI,
    init: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any => Unit,
    state: SubState
  ): Anon_ApiHasApi = {
    val __obj = js.Dynamic.literal(api = api, init = js.Any.fromFunction1(init), state = state)
  
    __obj.asInstanceOf[Anon_ApiHasApi]
  }
}

