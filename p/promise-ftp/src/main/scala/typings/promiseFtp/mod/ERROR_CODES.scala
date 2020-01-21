package typings.promiseFtp.mod

import org.scalablytyped.runtime.TopLevel
import typings.promiseFtp.promiseFtpStrings.`Bad sequence of commands`
import typings.promiseFtp.promiseFtpStrings.`CanApostrophet open data connection`
import typings.promiseFtp.promiseFtpStrings.`Command not implemented for that parameter`
import typings.promiseFtp.promiseFtpStrings.`Command not implemented`
import typings.promiseFtp.promiseFtpStrings.`Connection closedComma transfer aborted`
import typings.promiseFtp.promiseFtpStrings.`Need account for storing files`
import typings.promiseFtp.promiseFtpStrings.`Not logged in`
import typings.promiseFtp.promiseFtpStrings.`Requested action abortedColon local error in processing`
import typings.promiseFtp.promiseFtpStrings.`Requested action abortedColon page type unknown`
import typings.promiseFtp.promiseFtpStrings.`Requested action not taken Slash File name not allowed`
import typings.promiseFtp.promiseFtpStrings.`Requested action not taken Slash File unavailable LeftparenthesiseDotgDotComma file not foundComma no accessRightparenthesis`
import typings.promiseFtp.promiseFtpStrings.`Requested action not taken Slash Insufficient storage space in system`
import typings.promiseFtp.promiseFtpStrings.`Requested file action aborted Slash Exceeded storage allocation Leftparenthesisfor current directory or datasetRightparenthesis`
import typings.promiseFtp.promiseFtpStrings.`Requested file action not taken Slash File unavailable LeftparenthesiseDotgDotComma file busyRightparenthesis`
import typings.promiseFtp.promiseFtpStrings.`Service not availableComma closing control connection`
import typings.promiseFtp.promiseFtpStrings.`Syntax error Slash Command unrecognized`
import typings.promiseFtp.promiseFtpStrings.`Syntax error in parameters or arguments`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ERROR_CODES extends js.Object {
  var `421`: `Service not availableComma closing control connection`
  var `425`: `CanApostrophet open data connection`
  var `426`: `Connection closedComma transfer aborted`
  var `450`: `Requested file action not taken Slash File unavailable LeftparenthesiseDotgDotComma file busyRightparenthesis`
  var `451`: `Requested action abortedColon local error in processing`
  var `452`: `Requested action not taken Slash Insufficient storage space in system`
  var `500`: `Syntax error Slash Command unrecognized`
  var `501`: `Syntax error in parameters or arguments`
  var `502`: `Command not implemented`
  var `503`: `Bad sequence of commands`
  var `504`: `Command not implemented for that parameter`
  var `530`: `Not logged in`
  var `532`: `Need account for storing files`
  var `550`: `Requested action not taken Slash File unavailable LeftparenthesiseDotgDotComma file not foundComma no accessRightparenthesis`
  var `551`: `Requested action abortedColon page type unknown`
  var `552`: `Requested file action aborted Slash Exceeded storage allocation Leftparenthesisfor current directory or datasetRightparenthesis`
  var `553`: `Requested action not taken Slash File name not allowed`
}

@JSImport("promise-ftp", "ERROR_CODES")
@js.native
object ERROR_CODES extends TopLevel[ERROR_CODES]

