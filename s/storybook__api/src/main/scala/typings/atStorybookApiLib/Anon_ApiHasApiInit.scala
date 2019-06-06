package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiHasApiInit extends js.Object {
  var api: atStorybookApiLib.distModulesVersionsMod.SubAPI
  var state: Anon_DismissedVersionNotification
  def init(hasApi: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any): js.Promise[scala.Unit]
}

object Anon_ApiHasApiInit {
  @scala.inline
  def apply(
    api: atStorybookApiLib.distModulesVersionsMod.SubAPI,
    init: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any => js.Promise[scala.Unit],
    state: Anon_DismissedVersionNotification
  ): Anon_ApiHasApiInit = {
    val __obj = js.Dynamic.literal(api = api, init = js.Any.fromFunction1(init), state = state)
  
    __obj.asInstanceOf[Anon_ApiHasApiInit]
  }
}

