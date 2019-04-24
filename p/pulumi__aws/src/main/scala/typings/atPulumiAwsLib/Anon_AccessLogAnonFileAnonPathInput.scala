package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessLogAnonFileAnonPathInput extends js.Object {
  var accessLog: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_FileAnonPathInput]] = js.undefined
}

object Anon_AccessLogAnonFileAnonPathInput {
  @scala.inline
  def apply(accessLog: atPulumiPulumiLib.outputMod.Input[Anon_FileAnonPathInput] = null): Anon_AccessLogAnonFileAnonPathInput = {
    val __obj = js.Dynamic.literal()
    if (accessLog != null) __obj.updateDynamic("accessLog")(accessLog.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccessLogAnonFileAnonPathInput]
  }
}

