package typings.sessionFileStore.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSession.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("session-file-store", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    options: js.Function1[
      /* options */ js.UndefOr[SessionOptions], 
      RequestHandler[ParamsDictionary, _, _, Query]
    ]
  ): FileStore = js.native
}

