package typings.promiseDashFtp.promiseDashFtpMod

import org.scalablytyped.runtime.TopLevel
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

@JSImport("promise-ftp", "ERROR_CODES")
@js.native
object ERROR_CODES extends TopLevel[ERROR_CODES]

