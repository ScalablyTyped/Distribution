package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessLog extends js.Object {
  var accessLog: js.UndefOr[Anon_File] = js.undefined
}

object Anon_AccessLog {
  @scala.inline
  def apply(accessLog: Anon_File = null): Anon_AccessLog = {
    val __obj = js.Dynamic.literal()
    if (accessLog != null) __obj.updateDynamic("accessLog")(accessLog)
    __obj.asInstanceOf[Anon_AccessLog]
  }
}

