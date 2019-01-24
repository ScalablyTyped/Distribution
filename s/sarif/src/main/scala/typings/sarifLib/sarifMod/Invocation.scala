package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invocation extends js.Object {
  /**
    * The account that ran the analysis tool.
    */
  var account: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of strings, containing in order the command line arguments passed to the tool from the operating
    * system.
    */
  var arguments: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A set of files relevant to the invocation of the tool.
    */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
    * The command line used to invoke the tool.
    */
  var commandLine: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of conditions detected by the tool that are relevant to the tool's configuration.
    */
  var configurationNotifications: js.UndefOr[js.Array[Notification]] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which the run ended. See "Date/time properties" in the
    * SARIF spec for the required format.
    */
  var endTimeUtc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The environment variables associated with the analysis tool process, expressed as key/value pairs.
    */
  var environmentVariables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * An absolute URI specifying the location of the analysis tool's executable.
    */
  var executableLocation: js.UndefOr[FileLocation] = js.undefined
  /**
    * The process exit code.
    */
  var exitCode: js.UndefOr[scala.Double] = js.undefined
  /**
    * The reason for the process exit.
    */
  var exitCodeDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the signal that caused the process to exit.
    */
  var exitSignalName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The numeric value of the signal that caused the process to exit.
    */
  var exitSignalNumber: js.UndefOr[scala.Double] = js.undefined
  /**
    * The machine that hosted the analysis tool run.
    */
  var machine: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The process id for the analysis tool run.
    */
  var processId: js.UndefOr[scala.Double] = js.undefined
  /**
    * The reason given by the operating system that the process failed to start.
    */
  var processStartFailureMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the invocation.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The locations of any response files specified on the tool's command line.
    */
  var responseFiles: js.UndefOr[js.Array[FileLocation]] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which the run started. See "Date/time properties" in
    * the SARIF spec for the required format.
    */
  var startTimeUtc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A file containing the standard error stream from the process that was invoked.
    */
  var stderr: js.UndefOr[FileLocation] = js.undefined
  /**
    * A file containing the standard input stream to the process that was invoked.
    */
  var stdin: js.UndefOr[FileLocation] = js.undefined
  /**
    * A file containing the standard output stream from the process that was invoked.
    */
  var stdout: js.UndefOr[FileLocation] = js.undefined
  /**
    * A file containing the interleaved standard output and standard error stream from the process that was
    * invoked.
    */
  var stdoutStderr: js.UndefOr[FileLocation] = js.undefined
  /**
    * A value indicating whether the tool's execution completed successfully.
    */
  var toolExecutionSuccessful: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A list of runtime conditions detected by the tool during the analysis.
    */
  var toolNotifications: js.UndefOr[js.Array[Notification]] = js.undefined
  /**
    * The working directory for the analysis tool run.
    */
  var workingDirectory: js.UndefOr[FileLocation] = js.undefined
}

