package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invocation extends StObject {
  
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
  
  inline def apply(executionSuccessful: Boolean): Invocation = {
    val __obj = js.Dynamic.literal(executionSuccessful = executionSuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Invocation] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCommandLine(value: String): Self = StObject.set(x, "commandLine", value.asInstanceOf[js.Any])
    
    inline def setCommandLineUndefined: Self = StObject.set(x, "commandLine", js.undefined)
    
    inline def setEndTimeUtc(value: String): Self = StObject.set(x, "endTimeUtc", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUtcUndefined: Self = StObject.set(x, "endTimeUtc", js.undefined)
    
    inline def setEnvironmentVariables(value: StringDictionary[String]): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    inline def setExecutableLocation(value: ArtifactLocation): Self = StObject.set(x, "executableLocation", value.asInstanceOf[js.Any])
    
    inline def setExecutableLocationUndefined: Self = StObject.set(x, "executableLocation", js.undefined)
    
    inline def setExecutionSuccessful(value: Boolean): Self = StObject.set(x, "executionSuccessful", value.asInstanceOf[js.Any])
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeDescription(value: String): Self = StObject.set(x, "exitCodeDescription", value.asInstanceOf[js.Any])
    
    inline def setExitCodeDescriptionUndefined: Self = StObject.set(x, "exitCodeDescription", js.undefined)
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    inline def setExitSignalName(value: String): Self = StObject.set(x, "exitSignalName", value.asInstanceOf[js.Any])
    
    inline def setExitSignalNameUndefined: Self = StObject.set(x, "exitSignalName", js.undefined)
    
    inline def setExitSignalNumber(value: Double): Self = StObject.set(x, "exitSignalNumber", value.asInstanceOf[js.Any])
    
    inline def setExitSignalNumberUndefined: Self = StObject.set(x, "exitSignalNumber", js.undefined)
    
    inline def setMachine(value: String): Self = StObject.set(x, "machine", value.asInstanceOf[js.Any])
    
    inline def setMachineUndefined: Self = StObject.set(x, "machine", js.undefined)
    
    inline def setNotificationConfigurationOverrides(value: js.Array[ConfigurationOverride]): Self = StObject.set(x, "notificationConfigurationOverrides", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigurationOverridesUndefined: Self = StObject.set(x, "notificationConfigurationOverrides", js.undefined)
    
    inline def setNotificationConfigurationOverridesVarargs(value: ConfigurationOverride*): Self = StObject.set(x, "notificationConfigurationOverrides", js.Array(value*))
    
    inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    inline def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
    
    inline def setProcessStartFailureMessage(value: String): Self = StObject.set(x, "processStartFailureMessage", value.asInstanceOf[js.Any])
    
    inline def setProcessStartFailureMessageUndefined: Self = StObject.set(x, "processStartFailureMessage", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setResponseFiles(value: js.Array[ArtifactLocation]): Self = StObject.set(x, "responseFiles", value.asInstanceOf[js.Any])
    
    inline def setResponseFilesUndefined: Self = StObject.set(x, "responseFiles", js.undefined)
    
    inline def setResponseFilesVarargs(value: ArtifactLocation*): Self = StObject.set(x, "responseFiles", js.Array(value*))
    
    inline def setRuleConfigurationOverrides(value: js.Array[ConfigurationOverride]): Self = StObject.set(x, "ruleConfigurationOverrides", value.asInstanceOf[js.Any])
    
    inline def setRuleConfigurationOverridesUndefined: Self = StObject.set(x, "ruleConfigurationOverrides", js.undefined)
    
    inline def setRuleConfigurationOverridesVarargs(value: ConfigurationOverride*): Self = StObject.set(x, "ruleConfigurationOverrides", js.Array(value*))
    
    inline def setStartTimeUtc(value: String): Self = StObject.set(x, "startTimeUtc", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUtcUndefined: Self = StObject.set(x, "startTimeUtc", js.undefined)
    
    inline def setStderr(value: ArtifactLocation): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    
    inline def setStdin(value: ArtifactLocation): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    inline def setStdout(value: ArtifactLocation): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setStdoutStderr(value: ArtifactLocation): Self = StObject.set(x, "stdoutStderr", value.asInstanceOf[js.Any])
    
    inline def setStdoutStderrUndefined: Self = StObject.set(x, "stdoutStderr", js.undefined)
    
    inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    
    inline def setToolConfigurationNotifications(value: js.Array[Notification]): Self = StObject.set(x, "toolConfigurationNotifications", value.asInstanceOf[js.Any])
    
    inline def setToolConfigurationNotificationsUndefined: Self = StObject.set(x, "toolConfigurationNotifications", js.undefined)
    
    inline def setToolConfigurationNotificationsVarargs(value: Notification*): Self = StObject.set(x, "toolConfigurationNotifications", js.Array(value*))
    
    inline def setToolExecutionNotifications(value: js.Array[Notification]): Self = StObject.set(x, "toolExecutionNotifications", value.asInstanceOf[js.Any])
    
    inline def setToolExecutionNotificationsUndefined: Self = StObject.set(x, "toolExecutionNotifications", js.undefined)
    
    inline def setToolExecutionNotificationsVarargs(value: Notification*): Self = StObject.set(x, "toolExecutionNotifications", js.Array(value*))
    
    inline def setWorkingDirectory(value: ArtifactLocation): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}
