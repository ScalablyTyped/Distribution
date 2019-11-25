package typings.sarif.sarifMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invocation extends js.Object {
  /**
    * The account that ran the analysis tool.
    */
  var account: js.UndefOr[String] = js.undefined
  /**
    * An array of strings, containing in order the command line arguments passed to the tool from the operating
    * system.
    */
  var arguments: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The command line used to invoke the tool.
    */
  var commandLine: js.UndefOr[String] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which the run ended. See "Date/time properties" in the
    * SARIF spec for the required format.
    */
  var endTimeUtc: js.UndefOr[String] = js.undefined
  /**
    * The environment variables associated with the analysis tool process, expressed as key/value pairs.
    */
  var environmentVariables: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * An absolute URI specifying the location of the analysis tool's executable.
    */
  var executableLocation: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * Specifies whether the tool's execution completed successfully.
    */
  var executionSuccessful: Boolean
  /**
    * The process exit code.
    */
  var exitCode: js.UndefOr[Double] = js.undefined
  /**
    * The reason for the process exit.
    */
  var exitCodeDescription: js.UndefOr[String] = js.undefined
  /**
    * The name of the signal that caused the process to exit.
    */
  var exitSignalName: js.UndefOr[String] = js.undefined
  /**
    * The numeric value of the signal that caused the process to exit.
    */
  var exitSignalNumber: js.UndefOr[Double] = js.undefined
  /**
    * The machine that hosted the analysis tool run.
    */
  var machine: js.UndefOr[String] = js.undefined
  /**
    * An array of configurationOverride objects that describe notifications related runtime overrides.
    */
  var notificationConfigurationOverrides: js.UndefOr[js.Array[ConfigurationOverride]] = js.undefined
  /**
    * The process id for the analysis tool run.
    */
  var processId: js.UndefOr[Double] = js.undefined
  /**
    * The reason given by the operating system that the process failed to start.
    */
  var processStartFailureMessage: js.UndefOr[String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the invocation.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The locations of any response files specified on the tool's command line.
    */
  var responseFiles: js.UndefOr[js.Array[ArtifactLocation]] = js.undefined
  /**
    * An array of configurationOverride objects that describe rules related runtime overrides.
    */
  var ruleConfigurationOverrides: js.UndefOr[js.Array[ConfigurationOverride]] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which the run started. See "Date/time properties" in the
    * SARIF spec for the required format.
    */
  var startTimeUtc: js.UndefOr[String] = js.undefined
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
    * A list of conditions detected by the tool that are relevant to the tool's configuration.
    */
  var toolConfigurationNotifications: js.UndefOr[js.Array[Notification]] = js.undefined
  /**
    * A list of runtime conditions detected by the tool during the analysis.
    */
  var toolExecutionNotifications: js.UndefOr[js.Array[Notification]] = js.undefined
  /**
    * The working directory for the analysis tool run.
    */
  var workingDirectory: js.UndefOr[ArtifactLocation] = js.undefined
}

object Invocation {
  @scala.inline
  def apply(
    executionSuccessful: Boolean,
    account: String = null,
    arguments: js.Array[String] = null,
    commandLine: String = null,
    endTimeUtc: String = null,
    environmentVariables: StringDictionary[String] = null,
    executableLocation: ArtifactLocation = null,
    exitCode: Int | Double = null,
    exitCodeDescription: String = null,
    exitSignalName: String = null,
    exitSignalNumber: Int | Double = null,
    machine: String = null,
    notificationConfigurationOverrides: js.Array[ConfigurationOverride] = null,
    processId: Int | Double = null,
    processStartFailureMessage: String = null,
    properties: PropertyBag = null,
    responseFiles: js.Array[ArtifactLocation] = null,
    ruleConfigurationOverrides: js.Array[ConfigurationOverride] = null,
    startTimeUtc: String = null,
    stderr: ArtifactLocation = null,
    stdin: ArtifactLocation = null,
    stdout: ArtifactLocation = null,
    stdoutStderr: ArtifactLocation = null,
    toolConfigurationNotifications: js.Array[Notification] = null,
    toolExecutionNotifications: js.Array[Notification] = null,
    workingDirectory: ArtifactLocation = null
  ): Invocation = {
    val __obj = js.Dynamic.literal(executionSuccessful = executionSuccessful.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine.asInstanceOf[js.Any])
    if (endTimeUtc != null) __obj.updateDynamic("endTimeUtc")(endTimeUtc.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (executableLocation != null) __obj.updateDynamic("executableLocation")(executableLocation.asInstanceOf[js.Any])
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    if (exitCodeDescription != null) __obj.updateDynamic("exitCodeDescription")(exitCodeDescription.asInstanceOf[js.Any])
    if (exitSignalName != null) __obj.updateDynamic("exitSignalName")(exitSignalName.asInstanceOf[js.Any])
    if (exitSignalNumber != null) __obj.updateDynamic("exitSignalNumber")(exitSignalNumber.asInstanceOf[js.Any])
    if (machine != null) __obj.updateDynamic("machine")(machine.asInstanceOf[js.Any])
    if (notificationConfigurationOverrides != null) __obj.updateDynamic("notificationConfigurationOverrides")(notificationConfigurationOverrides.asInstanceOf[js.Any])
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    if (processStartFailureMessage != null) __obj.updateDynamic("processStartFailureMessage")(processStartFailureMessage.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (responseFiles != null) __obj.updateDynamic("responseFiles")(responseFiles.asInstanceOf[js.Any])
    if (ruleConfigurationOverrides != null) __obj.updateDynamic("ruleConfigurationOverrides")(ruleConfigurationOverrides.asInstanceOf[js.Any])
    if (startTimeUtc != null) __obj.updateDynamic("startTimeUtc")(startTimeUtc.asInstanceOf[js.Any])
    if (stderr != null) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    if (stdin != null) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (stdout != null) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    if (stdoutStderr != null) __obj.updateDynamic("stdoutStderr")(stdoutStderr.asInstanceOf[js.Any])
    if (toolConfigurationNotifications != null) __obj.updateDynamic("toolConfigurationNotifications")(toolConfigurationNotifications.asInstanceOf[js.Any])
    if (toolExecutionNotifications != null) __obj.updateDynamic("toolExecutionNotifications")(toolExecutionNotifications.asInstanceOf[js.Any])
    if (workingDirectory != null) __obj.updateDynamic("workingDirectory")(workingDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invocation]
  }
}

