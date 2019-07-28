package typings.promiseDashFtp.promiseDashFtpMod

import typings.promiseDashFtp.promiseDashFtpStrings.`Bad sequence of commands`
import typings.promiseDashFtp.promiseDashFtpStrings.`Can_quotet open data connection`
import typings.promiseDashFtp.promiseDashFtpStrings.`Command not implemented for that parameter`
import typings.promiseDashFtp.promiseDashFtpStrings.`Command not implemented`
import typings.promiseDashFtp.promiseDashFtpStrings.`Connection closed, transfer aborted`
import typings.promiseDashFtp.promiseDashFtpStrings.`Need account for storing files`
import typings.promiseDashFtp.promiseDashFtpStrings.`Not logged in`
import typings.promiseDashFtp.promiseDashFtpStrings.`Requested action aborted: local error in processing`
import typings.promiseDashFtp.promiseDashFtpStrings.`Requested action aborted: page type unknown`
import typings.promiseDashFtp.promiseDashFtpStrings.`Requested action not taken / File name not allowed`
import typings.promiseDashFtp.promiseDashFtpStrings.`Requested action not taken / File unavailable (eDOTgDOT, file not found, no access)`
import typings.promiseDashFtp.promiseDashFtpStrings.`Requested action not taken / Insufficient storage space in system`
import typings.promiseDashFtp.promiseDashFtpStrings.`Requested file action aborted / Exceeded storage allocation (for current directory or dataset)`
import typings.promiseDashFtp.promiseDashFtpStrings.`Requested file action not taken / File unavailable (eDOTgDOT, file busy)`
import typings.promiseDashFtp.promiseDashFtpStrings.`Service not available, closing control connection`
import typings.promiseDashFtp.promiseDashFtpStrings.`Syntax error / Command unrecognized`
import typings.promiseDashFtp.promiseDashFtpStrings.`Syntax error in parameters or arguments`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ERROR_CODES extends js.Object {
  var `421`: `Service not available, closing control connection`
  var `425`: `Can_quotet open data connection`
  var `426`: `Connection closed, transfer aborted`
  var `450`: `Requested file action not taken / File unavailable (eDOTgDOT, file busy)`
  var `451`: `Requested action aborted: local error in processing`
  var `452`: `Requested action not taken / Insufficient storage space in system`
  var `500`: `Syntax error / Command unrecognized`
  var `501`: `Syntax error in parameters or arguments`
  var `502`: `Command not implemented`
  var `503`: `Bad sequence of commands`
  var `504`: `Command not implemented for that parameter`
  var `530`: `Not logged in`
  var `532`: `Need account for storing files`
  var `550`: `Requested action not taken / File unavailable (eDOTgDOT, file not found, no access)`
  var `551`: `Requested action aborted: page type unknown`
  var `552`: `Requested file action aborted / Exceeded storage allocation (for current directory or dataset)`
  var `553`: `Requested action not taken / File name not allowed`
}

object ERROR_CODES {
  @scala.inline
  def apply(
    `421`: `Service not available, closing control connection`,
    `425`: `Can_quotet open data connection`,
    `426`: `Connection closed, transfer aborted`,
    `450`: `Requested file action not taken / File unavailable (eDOTgDOT, file busy)`,
    `451`: `Requested action aborted: local error in processing`,
    `452`: `Requested action not taken / Insufficient storage space in system`,
    `500`: `Syntax error / Command unrecognized`,
    `501`: `Syntax error in parameters or arguments`,
    `502`: `Command not implemented`,
    `503`: `Bad sequence of commands`,
    `504`: `Command not implemented for that parameter`,
    `530`: `Not logged in`,
    `532`: `Need account for storing files`,
    `550`: `Requested action not taken / File unavailable (eDOTgDOT, file not found, no access)`,
    `551`: `Requested action aborted: page type unknown`,
    `552`: `Requested file action aborted / Exceeded storage allocation (for current directory or dataset)`,
    `553`: `Requested action not taken / File name not allowed`
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

