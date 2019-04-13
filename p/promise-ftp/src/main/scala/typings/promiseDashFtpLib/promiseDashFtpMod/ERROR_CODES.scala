package typings
package promiseDashFtpLib.promiseDashFtpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ERROR_CODES extends js.Object {
  var `421`: promiseDashFtpLib.promiseDashFtpLibStrings.`Service not available, closing control connection`
  var `425`: promiseDashFtpLib.promiseDashFtpLibStrings.`Can_quotet open data connection`
  var `426`: promiseDashFtpLib.promiseDashFtpLibStrings.`Connection closed, transfer aborted`
  var `450`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested file action not taken / File unavailable (eDOTgDOT, file busy)`
  var `451`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action aborted: local error in processing`
  var `452`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action not taken / Insufficient storage space in system`
  var `500`: promiseDashFtpLib.promiseDashFtpLibStrings.`Syntax error / Command unrecognized`
  var `501`: promiseDashFtpLib.promiseDashFtpLibStrings.`Syntax error in parameters or arguments`
  var `502`: promiseDashFtpLib.promiseDashFtpLibStrings.`Command not implemented`
  var `503`: promiseDashFtpLib.promiseDashFtpLibStrings.`Bad sequence of commands`
  var `504`: promiseDashFtpLib.promiseDashFtpLibStrings.`Command not implemented for that parameter`
  var `530`: promiseDashFtpLib.promiseDashFtpLibStrings.`Not logged in`
  var `532`: promiseDashFtpLib.promiseDashFtpLibStrings.`Need account for storing files`
  var `550`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action not taken / File unavailable (eDOTgDOT, file not found, no access)`
  var `551`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action aborted: page type unknown`
  var `552`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested file action aborted / Exceeded storage allocation (for current directory or dataset)`
  var `553`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action not taken / File name not allowed`
}

object ERROR_CODES {
  @scala.inline
  def apply(
    `421`: promiseDashFtpLib.promiseDashFtpLibStrings.`Service not available, closing control connection`,
    `425`: promiseDashFtpLib.promiseDashFtpLibStrings.`Can_quotet open data connection`,
    `426`: promiseDashFtpLib.promiseDashFtpLibStrings.`Connection closed, transfer aborted`,
    `450`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested file action not taken / File unavailable (eDOTgDOT, file busy)`,
    `451`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action aborted: local error in processing`,
    `452`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action not taken / Insufficient storage space in system`,
    `500`: promiseDashFtpLib.promiseDashFtpLibStrings.`Syntax error / Command unrecognized`,
    `501`: promiseDashFtpLib.promiseDashFtpLibStrings.`Syntax error in parameters or arguments`,
    `502`: promiseDashFtpLib.promiseDashFtpLibStrings.`Command not implemented`,
    `503`: promiseDashFtpLib.promiseDashFtpLibStrings.`Bad sequence of commands`,
    `504`: promiseDashFtpLib.promiseDashFtpLibStrings.`Command not implemented for that parameter`,
    `530`: promiseDashFtpLib.promiseDashFtpLibStrings.`Not logged in`,
    `532`: promiseDashFtpLib.promiseDashFtpLibStrings.`Need account for storing files`,
    `550`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action not taken / File unavailable (eDOTgDOT, file not found, no access)`,
    `551`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action aborted: page type unknown`,
    `552`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested file action aborted / Exceeded storage allocation (for current directory or dataset)`,
    `553`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action not taken / File name not allowed`
  ): ERROR_CODES = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("421")(`421`)
    __obj.updateDynamic("425")(`425`)
    __obj.updateDynamic("426")(`426`)
    __obj.updateDynamic("450")(`450`)
    __obj.updateDynamic("451")(`451`)
    __obj.updateDynamic("452")(`452`)
    __obj.updateDynamic("500")(`500`)
    __obj.updateDynamic("501")(`501`)
    __obj.updateDynamic("502")(`502`)
    __obj.updateDynamic("503")(`503`)
    __obj.updateDynamic("504")(`504`)
    __obj.updateDynamic("530")(`530`)
    __obj.updateDynamic("532")(`532`)
    __obj.updateDynamic("550")(`550`)
    __obj.updateDynamic("551")(`551`)
    __obj.updateDynamic("552")(`552`)
    __obj.updateDynamic("553")(`553`)
    __obj.asInstanceOf[ERROR_CODES]
  }
}

