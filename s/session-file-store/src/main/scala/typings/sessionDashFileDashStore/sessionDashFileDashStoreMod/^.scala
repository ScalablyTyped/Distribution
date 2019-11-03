package typings.sessionDashFileDashStore.sessionDashFileDashStoreMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashSession.expressDashSessionMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("session-file-store", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: js.Function1[/* options */ js.UndefOr[SessionOptions], RequestHandler[ParamsDictionary]]): FileStore = js.native
}

