package typings.snyk

import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsMod {
  
  @JSImport("snyk/dist/lib/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AuthFailedError(): typings.snyk.distLibErrorsCustomErrorMod.CustomError = ^.asInstanceOf[js.Dynamic].applyDynamic("AuthFailedError")().asInstanceOf[typings.snyk.distLibErrorsCustomErrorMod.CustomError]
  inline def AuthFailedError(errorMessage: String): typings.snyk.distLibErrorsCustomErrorMod.CustomError = ^.asInstanceOf[js.Dynamic].applyDynamic("AuthFailedError")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[typings.snyk.distLibErrorsCustomErrorMod.CustomError]
  inline def AuthFailedError(errorMessage: String, errorCode: Double): typings.snyk.distLibErrorsCustomErrorMod.CustomError = (^.asInstanceOf[js.Dynamic].applyDynamic("AuthFailedError")(errorMessage.asInstanceOf[js.Any], errorCode.asInstanceOf[js.Any])).asInstanceOf[typings.snyk.distLibErrorsCustomErrorMod.CustomError]
  inline def AuthFailedError(errorMessage: Unit, errorCode: Double): typings.snyk.distLibErrorsCustomErrorMod.CustomError = (^.asInstanceOf[js.Dynamic].applyDynamic("AuthFailedError")(errorMessage.asInstanceOf[js.Any], errorCode.asInstanceOf[js.Any])).asInstanceOf[typings.snyk.distLibErrorsCustomErrorMod.CustomError]
  
  @JSImport("snyk/dist/lib/errors", "ConnectionTimeoutError")
  @js.native
  open class ConnectionTimeoutError ()
    extends typings.snyk.distLibErrorsConnectionTimeoutErrorMod.ConnectionTimeoutError
  /* static members */
  object ConnectionTimeoutError {
    
    @JSImport("snyk/dist/lib/errors", "ConnectionTimeoutError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "ConnectionTimeoutError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/errors", "CustomError")
  @js.native
  open class CustomError protected ()
    extends typings.snyk.distLibErrorsCustomErrorMod.CustomError {
    def this(message: String) = this()
  }
  
  @JSImport("snyk/dist/lib/errors", "DockerImageNotFoundError")
  @js.native
  open class DockerImageNotFoundError protected ()
    extends typings.snyk.distLibErrorsDockerImageNotFoundErrorMod.DockerImageNotFoundError {
    def this(image: String) = this()
  }
  /* static members */
  object DockerImageNotFoundError {
    
    @JSImport("snyk/dist/lib/errors", "DockerImageNotFoundError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "DockerImageNotFoundError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/errors", "ExcludeFlagBadInputError")
  @js.native
  open class ExcludeFlagBadInputError ()
    extends typings.snyk.distLibErrorsExcludeFlagBadInputMod.ExcludeFlagBadInputError
  /* static members */
  object ExcludeFlagBadInputError {
    
    @JSImport("snyk/dist/lib/errors", "ExcludeFlagBadInputError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "ExcludeFlagBadInputError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "ExcludeFlagBadInputError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/errors", "FailedToGetVulnerabilitiesError")
  @js.native
  open class FailedToGetVulnerabilitiesError protected ()
    extends typings.snyk.distLibErrorsFailedToGetVulnerabilitiesErrorMod.FailedToGetVulnerabilitiesError {
    def this(userMessage: Any, statusCode: Any) = this()
  }
  /* static members */
  object FailedToGetVulnerabilitiesError {
    
    @JSImport("snyk/dist/lib/errors", "FailedToGetVulnerabilitiesError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "FailedToGetVulnerabilitiesError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "FailedToGetVulnerabilitiesError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "FailedToGetVulnerabilitiesError.ERROR_STRING_CODE")
    @js.native
    def ERROR_STRING_CODE: Any = js.native
    inline def ERROR_STRING_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_STRING_CODE")(x.asInstanceOf[js.Any])
  }
  
  inline def FailedToGetVulnsFromUnavailableResource(root: String, statusCode: Double): typings.snyk.distLibErrorsCustomErrorMod.CustomError = (^.asInstanceOf[js.Dynamic].applyDynamic("FailedToGetVulnsFromUnavailableResource")(root.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[typings.snyk.distLibErrorsCustomErrorMod.CustomError]
  
  @JSImport("snyk/dist/lib/errors", "FailedToLoadPolicyError")
  @js.native
  open class FailedToLoadPolicyError ()
    extends typings.snyk.distLibErrorsFailedToLoadPolicyErrorMod.FailedToLoadPolicyError
  /* static members */
  object FailedToLoadPolicyError {
    
    @JSImport("snyk/dist/lib/errors", "FailedToLoadPolicyError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "FailedToLoadPolicyError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "FailedToLoadPolicyError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "FailedToLoadPolicyError.ERROR_STRING_CODE")
    @js.native
    def ERROR_STRING_CODE: Any = js.native
    inline def ERROR_STRING_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_STRING_CODE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/errors", "FailedToRunTestError")
  @js.native
  open class FailedToRunTestError protected ()
    extends typings.snyk.distLibErrorsFailedToRunTestErrorMod.FailedToRunTestError {
    def this(userMessage: Any) = this()
    def this(userMessage: Any, errorCode: Any) = this()
  }
  /* static members */
  object FailedToRunTestError {
    
    @JSImport("snyk/dist/lib/errors", "FailedToRunTestError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "FailedToRunTestError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/errors", "FeatureNotSupportedByPackageManagerError")
  @js.native
  open class FeatureNotSupportedByPackageManagerError protected ()
    extends typings.snyk.distLibErrorsFeatureNotSupportedByPackageManagerErrorMod.FeatureNotSupportedByPackageManagerError {
    def this(feature: String, packageManager: SupportedPackageManagers) = this()
    def this(feature: String, packageManager: SupportedPackageManagers, additionalUserHelp: String) = this()
  }
  
  @JSImport("snyk/dist/lib/errors", "FeatureNotSupportedForOrgError")
  @js.native
  open class FeatureNotSupportedForOrgError protected ()
    extends typings.snyk.distLibErrorsUnsupportedFeatureForOrgErrorMod.FeatureNotSupportedForOrgError {
    def this(org_ : String) = this()
    def this(org_ : String, feature: String) = this()
    def this(org_ : String, feature: String, additionalUserHelp: String) = this()
    def this(org_ : String, feature: Unit, additionalUserHelp: String) = this()
  }
  
  @JSImport("snyk/dist/lib/errors", "FileFlagBadInputError")
  @js.native
  open class FileFlagBadInputError ()
    extends typings.snyk.distLibErrorsFileFlagBadInputMod.FileFlagBadInputError
  /* static members */
  object FileFlagBadInputError {
    
    @JSImport("snyk/dist/lib/errors", "FileFlagBadInputError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "FileFlagBadInputError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "FileFlagBadInputError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/errors", "FormattedCustomError")
  @js.native
  open class FormattedCustomError protected ()
    extends typings.snyk.distLibErrorsFormattedCustomErrorMod.FormattedCustomError {
    def this(message: String, formattedUserMessage: String) = this()
    def this(message: String, formattedUserMessage: String, userMessage: String) = this()
  }
  
  @JSImport("snyk/dist/lib/errors", "InternalServerError")
  @js.native
  open class InternalServerError protected ()
    extends typings.snyk.distLibErrorsInternalServerErrorMod.InternalServerError {
    def this(userMessage: Any) = this()
  }
  /* static members */
  object InternalServerError {
    
    @JSImport("snyk/dist/lib/errors", "InternalServerError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "InternalServerError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "InternalServerError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "InternalServerError.ERROR_STRING_CODE")
    @js.native
    def ERROR_STRING_CODE: Any = js.native
    inline def ERROR_STRING_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_STRING_CODE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/errors", "MissingApiTokenError")
  @js.native
  open class MissingApiTokenError ()
    extends typings.snyk.distLibErrorsMissingApiTokenMod.MissingApiTokenError
  /* static members */
  object MissingApiTokenError {
    
    @JSImport("snyk/dist/lib/errors", "MissingApiTokenError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "MissingApiTokenError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "MissingApiTokenError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "MissingApiTokenError.ERROR_STRING_CODE")
    @js.native
    def ERROR_STRING_CODE: Any = js.native
    inline def ERROR_STRING_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_STRING_CODE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/errors", "MissingArgError")
  @js.native
  open class MissingArgError ()
    extends typings.snyk.distLibErrorsMissingArgErrorMod.MissingArgError
  
  @JSImport("snyk/dist/lib/errors", "MissingOptionError")
  @js.native
  open class MissingOptionError protected ()
    extends typings.snyk.distLibErrorsMissingOptionErrorMod.MissingOptionError {
    def this(option: String, required: js.Array[String]) = this()
  }
  
  inline def MissingTargetFileError(path: String): typings.snyk.distLibErrorsCustomErrorMod.CustomError = ^.asInstanceOf[js.Dynamic].applyDynamic("MissingTargetFileError")(path.asInstanceOf[js.Any]).asInstanceOf[typings.snyk.distLibErrorsCustomErrorMod.CustomError]
  
  @JSImport("snyk/dist/lib/errors", "MonitorError")
  @js.native
  open class MonitorError protected ()
    extends typings.snyk.distLibErrorsMonitorErrorMod.MonitorError {
    def this(errorCode: Any, message: Any) = this()
  }
  /* static members */
  object MonitorError {
    
    @JSImport("snyk/dist/lib/errors", "MonitorError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "MonitorError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
  
  inline def NoSupportedManifestsFoundError(atLocations: js.Array[String]): typings.snyk.distLibErrorsCustomErrorMod.CustomError = ^.asInstanceOf[js.Dynamic].applyDynamic("NoSupportedManifestsFoundError")(atLocations.asInstanceOf[js.Any]).asInstanceOf[typings.snyk.distLibErrorsCustomErrorMod.CustomError]
  
  @JSImport("snyk/dist/lib/errors", "NoSupportedSastFiles")
  @js.native
  open class NoSupportedSastFiles ()
    extends typings.snyk.distLibErrorsNoSupportedSastFilesFoundMod.NoSupportedSastFiles
  /* static members */
  object NoSupportedSastFiles {
    
    @JSImport("snyk/dist/lib/errors", "NoSupportedSastFiles")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "NoSupportedSastFiles.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/errors", "NotFoundError")
  @js.native
  open class NotFoundError protected ()
    extends typings.snyk.distLibErrorsNotFoundErrorMod.NotFoundError {
    def this(userMessage: Any) = this()
  }
  /* static members */
  object NotFoundError {
    
    @JSImport("snyk/dist/lib/errors", "NotFoundError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "NotFoundError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "NotFoundError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/errors", "PolicyNotFoundError")
  @js.native
  open class PolicyNotFoundError ()
    extends typings.snyk.distLibErrorsPolicyNotFoundErrorMod.PolicyNotFoundError
  /* static members */
  object PolicyNotFoundError {
    
    @JSImport("snyk/dist/lib/errors", "PolicyNotFoundError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "PolicyNotFoundError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "PolicyNotFoundError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "PolicyNotFoundError.ERROR_STRING_CODE")
    @js.native
    def ERROR_STRING_CODE: Any = js.native
    inline def ERROR_STRING_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_STRING_CODE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/errors", "TooManyVulnPaths")
  @js.native
  open class TooManyVulnPaths ()
    extends typings.snyk.distLibErrorsTooManyVulnPathsMod.TooManyVulnPaths
  /* static members */
  object TooManyVulnPaths {
    
    @JSImport("snyk/dist/lib/errors", "TooManyVulnPaths")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "TooManyVulnPaths.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "TooManyVulnPaths.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors", "TooManyVulnPaths.ERROR_STRING_CODE")
    @js.native
    def ERROR_STRING_CODE: Any = js.native
    inline def ERROR_STRING_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_STRING_CODE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/errors", "UnsupportedOptionCombinationError")
  @js.native
  open class UnsupportedOptionCombinationError protected ()
    extends typings.snyk.distLibErrorsUnsupportedOptionCombinationErrorMod.UnsupportedOptionCombinationError {
    def this(options: js.Array[String]) = this()
  }
  /* static members */
  object UnsupportedOptionCombinationError {
    
    @JSImport("snyk/dist/lib/errors", "UnsupportedOptionCombinationError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "UnsupportedOptionCombinationError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/errors", "UnsupportedPackageManagerError")
  @js.native
  open class UnsupportedPackageManagerError protected ()
    extends typings.snyk.distLibErrorsUnsupportedPackageManagerErrorMod.UnsupportedPackageManagerError {
    def this(packageManager: Any) = this()
  }
  /* static members */
  object UnsupportedPackageManagerError {
    
    @JSImport("snyk/dist/lib/errors", "UnsupportedPackageManagerError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors", "UnsupportedPackageManagerError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/errors", "ValidationError")
  @js.native
  open class ValidationError protected ()
    extends typings.snyk.distLibErrorsValidationErrorMod.ValidationError {
    def this(message: String) = this()
  }
  
  inline def errorMessageWithRetry(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("errorMessageWithRetry")(message.asInstanceOf[js.Any]).asInstanceOf[String]
}
