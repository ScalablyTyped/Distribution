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
    * A set of artifacts relevant to the invocation of the tool.
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
  var executableLocation: js.UndefOr[ArtifactLocation] = js.undefined
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
    * An array of reportingConfigurationOverride objects that describe runtime reporting behavior.
    */
  var reportingConfigurationOverrides: js.UndefOr[js.Array[ReportingConfigurationOverride]] = js.undefined
  /**
    * The locations of any response files specified on the tool's command line.
    */
  var responseFiles: js.UndefOr[js.Array[ArtifactLocation]] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which the run started. See "Date/time properties" in the
    * SARIF spec for the required format.
    */
  var startTimeUtc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A file containing the standard error stream from the process that was invoked.
    */
  var stderr: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * A file containing the standard input stream to the process that was invoked.
    */
  var stdin: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * A file containing the standard output stream from the process that was invoked.
    */
  var stdout: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * A file containing the interleaved standard output and standard error stream from the process that was invoked.
    */
  var stdoutStderr: js.UndefOr[ArtifactLocation] = js.undefined
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
  var workingDirectory: js.UndefOr[ArtifactLocation] = js.undefined
}

object Invocation {
  @scala.inline
  def apply(
    account: java.lang.String = null,
    arguments: js.Array[java.lang.String] = null,
    attachments: js.Array[Attachment] = null,
    commandLine: java.lang.String = null,
    configurationNotifications: js.Array[Notification] = null,
    endTimeUtc: java.lang.String = null,
    environmentVariables: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    executableLocation: ArtifactLocation = null,
    exitCode: scala.Int | scala.Double = null,
    exitCodeDescription: java.lang.String = null,
    exitSignalName: java.lang.String = null,
    exitSignalNumber: scala.Int | scala.Double = null,
    machine: java.lang.String = null,
    processId: scala.Int | scala.Double = null,
    processStartFailureMessage: java.lang.String = null,
    properties: PropertyBag = null,
    reportingConfigurationOverrides: js.Array[ReportingConfigurationOverride] = null,
    responseFiles: js.Array[ArtifactLocation] = null,
    startTimeUtc: java.lang.String = null,
    stderr: ArtifactLocation = null,
    stdin: ArtifactLocation = null,
    stdout: ArtifactLocation = null,
    stdoutStderr: ArtifactLocation = null,
    toolExecutionSuccessful: js.UndefOr[scala.Boolean] = js.undefined,
    toolNotifications: js.Array[Notification] = null,
    workingDirectory: ArtifactLocation = null
  ): Invocation = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine)
    if (configurationNotifications != null) __obj.updateDynamic("configurationNotifications")(configurationNotifications)
    if (endTimeUtc != null) __obj.updateDynamic("endTimeUtc")(endTimeUtc)
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables)
    if (executableLocation != null) __obj.updateDynamic("executableLocation")(executableLocation)
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    if (exitCodeDescription != null) __obj.updateDynamic("exitCodeDescription")(exitCodeDescription)
    if (exitSignalName != null) __obj.updateDynamic("exitSignalName")(exitSignalName)
    if (exitSignalNumber != null) __obj.updateDynamic("exitSignalNumber")(exitSignalNumber.asInstanceOf[js.Any])
    if (machine != null) __obj.updateDynamic("machine")(machine)
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    if (processStartFailureMessage != null) __obj.updateDynamic("processStartFailureMessage")(processStartFailureMessage)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (reportingConfigurationOverrides != null) __obj.updateDynamic("reportingConfigurationOverrides")(reportingConfigurationOverrides)
    if (responseFiles != null) __obj.updateDynamic("responseFiles")(responseFiles)
    if (startTimeUtc != null) __obj.updateDynamic("startTimeUtc")(startTimeUtc)
    if (stderr != null) __obj.updateDynamic("stderr")(stderr)
    if (stdin != null) __obj.updateDynamic("stdin")(stdin)
    if (stdout != null) __obj.updateDynamic("stdout")(stdout)
    if (stdoutStderr != null) __obj.updateDynamic("stdoutStderr")(stdoutStderr)
    if (!js.isUndefined(toolExecutionSuccessful)) __obj.updateDynamic("toolExecutionSuccessful")(toolExecutionSuccessful)
    if (toolNotifications != null) __obj.updateDynamic("toolNotifications")(toolNotifications)
    if (workingDirectory != null) __obj.updateDynamic("workingDirectory")(workingDirectory)
    __obj.asInstanceOf[Invocation]
  }
}

