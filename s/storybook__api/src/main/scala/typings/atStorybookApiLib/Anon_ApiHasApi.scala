package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiHasApi extends js.Object {
  var api: atStorybookApiLib.distModulesShortcutsMod.SubAPI
  var state: atStorybookApiLib.distModulesShortcutsMod.SubState
  def init(hasApi: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any): scala.Unit
}

object Anon_ApiHasApi {
  @scala.inline
  def apply(
    api: atStorybookApiLib.distModulesShortcutsMod.SubAPI,
    init: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any => scala.Unit,
    state: atStorybookApiLib.distModulesShortcutsMod.SubState
  ): Anon_ApiHasApi = {
    val __obj = js.Dynamic.literal(api = api, init = js.Any.fromFunction1(init), state = state)
  
    __obj.asInstanceOf[Anon_ApiHasApi]
  }
}

