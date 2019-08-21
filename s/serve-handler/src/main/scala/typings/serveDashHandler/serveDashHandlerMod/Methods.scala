package typings.serveDashHandler.serveDashHandlerMod

import typings.node.NodeJSNs.ErrnoException
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import typings.serveDashHandler.Anon_Buffer
import typings.serveDashHandler.Anon_BufferCallback
import typings.serveDashHandler.Fn_Options
import typings.serveDashHandler.Typeoflstat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  var createReadStream: js.UndefOr[Fn_Options] = js.undefined
  var lstat: js.UndefOr[
    (js.Function2[
      /* path */ PathLike, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit], 
      Unit
    ]) with Typeoflstat
  ] = js.undefined
  var readdir: js.UndefOr[Anon_BufferCallback] = js.undefined
  var realpath: js.UndefOr[Anon_Buffer] = js.undefined
  var sendError: js.UndefOr[SendErrorHandler] = js.undefined
}

object Methods {
  @scala.inline
  def apply(
    createReadStream: Fn_Options = null,
    lstat: (js.Function2[
      /* path */ PathLike, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit], 
      Unit
    ]) with Typeoflstat = null,
    readdir: Anon_BufferCallback = null,
    realpath: Anon_Buffer = null,
    sendError: SendErrorHandler = null
  ): Methods = {
    val __obj = js.Dynamic.literal()
    if (createReadStream != null) __obj.updateDynamic("createReadStream")(createReadStream)
    if (lstat != null) __obj.updateDynamic("lstat")(lstat)
    if (readdir != null) __obj.updateDynamic("readdir")(readdir)
    if (realpath != null) __obj.updateDynamic("realpath")(realpath)
    if (sendError != null) __obj.updateDynamic("sendError")(sendError)
    __obj.asInstanceOf[Methods]
  }
}

