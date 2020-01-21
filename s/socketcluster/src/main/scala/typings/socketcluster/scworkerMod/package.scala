package typings.socketcluster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scworkerMod {
  type middlewareFunction = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServer.SCServerOptions */ /* options */ js.Any, 
    /* next */ js.Function1[/* error */ js.UndefOr[java.lang.String | typings.std.Error], scala.Unit], 
    scala.Unit
  ]
}
