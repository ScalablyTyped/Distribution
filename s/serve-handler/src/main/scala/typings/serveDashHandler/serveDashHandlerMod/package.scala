package typings.serveDashHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serveDashHandlerMod {
  import typings.node.httpMod.ServerResponse

  type SendErrorHandler = js.Function7[
    /* absolutePath */ js.UndefOr[String], 
    /* response */ js.UndefOr[ServerResponse], 
    /* acceptsJSON */ js.UndefOr[Boolean], 
    /* current */ js.UndefOr[String], 
    /* handlers */ js.UndefOr[Methods], 
    /* config */ js.UndefOr[Config], 
    /* spec */ js.UndefOr[js.Any], 
    js.Promise[Unit]
  ]
}
