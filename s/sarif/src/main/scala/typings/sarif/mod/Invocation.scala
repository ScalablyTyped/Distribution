package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invocation extends js.Object {
  
  /**
    * The account that ran the analysis tool.
    */
  var account: js.UndefOr[String] = js.native
  
  /**
    * An array of strings, containing in order the command line arguments passed to the tool from the operating
    * system.
    */
  var arguments: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The command line used to invoke the tool.
    */
  var commandLine: js.UndefOr[String] = js.native
  
  /**
    * The Coordinated Universal Time (UTC) date and time at which the run ended. See "Date/time properties" in the
    * SARIF spec for the required format.
    */
  var endTimeUtc: js.UndefOr[String] = js.native
  
  /**
    * The environment variables associated with the analysis tool process, expressed as key/value pairs.
    */
  var environmentVariables: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * An absolute URI specifying the location of the analysis tool's executable.
    */
  var executableLocation: js.UndefOr[ArtifactLocation] = js.native
  
  /**
    * Specifies whether the tool's execution completed successfully.
    */
  var executionSuccessful: Boolean = js.native
  
  /**
    * The process exit code.
    */
  var exitCode: js.UndefOr[Double] = js.native
  
  /**
    * The reason for the process exit.
    */
  var exitCodeDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the signal that caused the process to exit.
    */
  var exitSignalName: js.UndefOr[String] = js.native
  
  /**
    * The numeric value of the signal that caused the process to exit.
    */
  var exitSignalNumber: js.UndefOr[Double] = js.native
  
  /**
    * The machine that hosted the analysis tool run.
    */
  var machine: js.UndefOr[String] = js.native
  
  /**
    * An array of configurationOverride objects that describe notifications related runtime overrides.
    */
  var notificationConfigurationOverrides: js.UndefOr[js.Array[ConfigurationOverride]] = js.native
  
  /**
    * The process id for the analysis tool run.
    */
  var processId: js.UndefOr[Double] = js.native
  
  /**
    * The reason given by the operating system that the process failed to start.
    */
  var processStartFailureMessage: js.UndefOr[String] = js.native
  
  /**
    * Key/value pairs that provide additional information about the invocation.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * The locations of any response files specified on the tool's command line.
    */
  var responseFiles: js.UndefOr[js.Array[ArtifactLocation]] = js.native
  
  /**
    * An array of configurationOverride objects that describe rules related runtime overrides.
    */
  var ruleConfigurationOverrides: js.UndefOr[js.Array[ConfigurationOverride]] = js.native
  
  /**
    * The Coordinated Universal Time (UTC) date and time at which the run started. See "Date/time properties" in the
    * SARIF spec for the required format.
    */
  var startTimeUtc: js.UndefOr[String] = js.native
  
  /**
    * A file containing the standard error stream from the process that was invoked.
    */
  var stderr: js.UndefOr[ArtifactLocation] = js.native
  
  /**
    * A file containing the standard input stream to the process that was invoked.
    */
  var stdin: js.UndefOr[ArtifactLocation] = js.native
  
  /**
    * A file containing the standard output stream from the process that was invoked.
    */
  var stdout: js.UndefOr[ArtifactLocation] = js.native
  
  /**
    * A file containing the interleaved standard output and standard error stream from the process that was invoked.
    */
  var stdoutStderr: js.UndefOr[ArtifactLocation] = js.native
  
  /**
    * A list of conditions detected by the tool that are relevant to the tool's configuration.
    */
  var toolConfigurationNotifications: js.UndefOr[js.Array[Notification]] = js.native
  
  /**
    * A list of runtime conditions detected by the tool during the analysis.
    */
  var toolExecutionNotifications: js.UndefOr[js.Array[Notification]] = js.native
  
  /**
    * The working directory for the analysis tool run.
    */
  var workingDirectory: js.UndefOr[ArtifactLocation] = js.native
}
object Invocation {
  
  @scala.inline
  def apply(executionSuccessful: Boolean): Invocation = {
    val __obj = js.Dynamic.literal(executionSuccessful = executionSuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invocation]
  }
  
  @scala.inline
  implicit class InvocationOps[Self <: Invocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExecutionSuccessful(value: Boolean): Self = this.set("executionSuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setArgumentsVarargs(value: String*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[String]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setCommandLine(value: String): Self = this.set("commandLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandLine: Self = this.set("commandLine", js.undefined)
    
    @scala.inline
    def setEndTimeUtc(value: String): Self = this.set("endTimeUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimeUtc: Self = this.set("endTimeUtc", js.undefined)
    
    @scala.inline
    def setEnvironmentVariables(value: StringDictionary[String]): Self = this.set("environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentVariables: Self = this.set("environmentVariables", js.undefined)
    
    @scala.inline
    def setExecutableLocation(value: ArtifactLocation): Self = this.set("executableLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutableLocation: Self = this.set("executableLocation", js.undefined)
    
    @scala.inline
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitCode: Self = this.set("exitCode", js.undefined)
    
    @scala.inline
    def setExitCodeDescription(value: String): Self = this.set("exitCodeDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitCodeDescription: Self = this.set("exitCodeDescription", js.undefined)
    
    @scala.inline
    def setExitSignalName(value: String): Self = this.set("exitSignalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitSignalName: Self = this.set("exitSignalName", js.undefined)
    
    @scala.inline
    def setExitSignalNumber(value: Double): Self = this.set("exitSignalNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitSignalNumber: Self = this.set("exitSignalNumber", js.undefined)
    
    @scala.inline
    def setMachine(value: String): Self = this.set("machine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachine: Self = this.set("machine", js.undefined)
    
    @scala.inline
    def setNotificationConfigurationOverridesVarargs(value: ConfigurationOverride*): Self = this.set("notificationConfigurationOverrides", js.Array(value :_*))
    
    @scala.inline
    def setNotificationConfigurationOverrides(value: js.Array[ConfigurationOverride]): Self = this.set("notificationConfigurationOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationConfigurationOverrides: Self = this.set("notificationConfigurationOverrides", js.undefined)
    
    @scala.inline
    def setProcessId(value: Double): Self = this.set("processId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessId: Self = this.set("processId", js.undefined)
    
    @scala.inline
    def setProcessStartFailureMessage(value: String): Self = this.set("processStartFailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessStartFailureMessage: Self = this.set("processStartFailureMessage", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setResponseFilesVarargs(value: ArtifactLocation*): Self = this.set("responseFiles", js.Array(value :_*))
    
    @scala.inline
    def setResponseFiles(value: js.Array[ArtifactLocation]): Self = this.set("responseFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseFiles: Self = this.set("responseFiles", js.undefined)
    
    @scala.inline
    def setRuleConfigurationOverridesVarargs(value: ConfigurationOverride*): Self = this.set("ruleConfigurationOverrides", js.Array(value :_*))
    
    @scala.inline
    def setRuleConfigurationOverrides(value: js.Array[ConfigurationOverride]): Self = this.set("ruleConfigurationOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleConfigurationOverrides: Self = this.set("ruleConfigurationOverrides", js.undefined)
    
    @scala.inline
    def setStartTimeUtc(value: String): Self = this.set("startTimeUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeUtc: Self = this.set("startTimeUtc", js.undefined)
    
    @scala.inline
    def setStderr(value: ArtifactLocation): Self = this.set("stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
    
    @scala.inline
    def setStdin(value: ArtifactLocation): Self = this.set("stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
    
    @scala.inline
    def setStdout(value: ArtifactLocation): Self = this.set("stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
    
    @scala.inline
    def setStdoutStderr(value: ArtifactLocation): Self = this.set("stdoutStderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdoutStderr: Self = this.set("stdoutStderr", js.undefined)
    
    @scala.inline
    def setToolConfigurationNotificationsVarargs(value: Notification*): Self = this.set("toolConfigurationNotifications", js.Array(value :_*))
    
    @scala.inline
    def setToolConfigurationNotifications(value: js.Array[Notification]): Self = this.set("toolConfigurationNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolConfigurationNotifications: Self = this.set("toolConfigurationNotifications", js.undefined)
    
    @scala.inline
    def setToolExecutionNotificationsVarargs(value: Notification*): Self = this.set("toolExecutionNotifications", js.Array(value :_*))
    
    @scala.inline
    def setToolExecutionNotifications(value: js.Array[Notification]): Self = this.set("toolExecutionNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolExecutionNotifications: Self = this.set("toolExecutionNotifications", js.undefined)
    
    @scala.inline
    def setWorkingDirectory(value: ArtifactLocation): Self = this.set("workingDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkingDirectory: Self = this.set("workingDirectory", js.undefined)
  }
}
