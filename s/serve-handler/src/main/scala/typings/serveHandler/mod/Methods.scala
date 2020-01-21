package typings.serveHandler.mod

import typings.node.httpMod.ServerResponse
import typings.serveHandler.FnOptions
import typings.serveHandler.Typeoflstat
import typings.serveHandler.Typeofreaddir
import typings.serveHandler.Typeofrealpath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  var createReadStream: js.UndefOr[FnOptions] = js.undefined
  var lstat: js.UndefOr[Typeoflstat] = js.undefined
  var readdir: js.UndefOr[Typeofreaddir] = js.undefined
  var realpath: js.UndefOr[Typeofrealpath] = js.undefined
  var sendError: js.UndefOr[SendErrorHandler] = js.undefined
}

object Methods {
  @scala.inline
  def apply(
    createReadStream: FnOptions = null,
    lstat: Typeoflstat = null,
    readdir: Typeofreaddir = null,
    realpath: Typeofrealpath = null,
    sendError: (/* absolutePath */ js.UndefOr[String], /* response */ js.UndefOr[ServerResponse], /* acceptsJSON */ js.UndefOr[Boolean], /* current */ js.UndefOr[String], /* handlers */ js.UndefOr[Methods], /* config */ js.UndefOr[Config], /* spec */ js.UndefOr[js.Any]) => js.Promise[Unit] = null
  ): Methods = {
    val __obj = js.Dynamic.literal()
    if (createReadStream != null) __obj.updateDynamic("createReadStream")(createReadStream.asInstanceOf[js.Any])
    if (lstat != null) __obj.updateDynamic("lstat")(lstat.asInstanceOf[js.Any])
    if (readdir != null) __obj.updateDynamic("readdir")(readdir.asInstanceOf[js.Any])
    if (realpath != null) __obj.updateDynamic("realpath")(realpath.asInstanceOf[js.Any])
    if (sendError != null) __obj.updateDynamic("sendError")(js.Any.fromFunction7(sendError))
    __obj.asInstanceOf[Methods]
  }
}

