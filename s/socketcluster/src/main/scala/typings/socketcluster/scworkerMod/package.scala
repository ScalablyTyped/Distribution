package typings.socketcluster

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scworkerMod {
  type middlewareFunction = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SCServer.SCServerOptions */ /* options */ js.Any, 
    /* next */ js.Function1[/* error */ js.UndefOr[String | Error], Unit], 
    Unit
  ]
}
