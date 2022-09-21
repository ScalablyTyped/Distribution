package typings.reactNativeCommunityCliDoctor

import typings.ora.mod.Ora
import typings.reactNativeCommunityCliDoctor.anon.AndroidSDK
import typings.reactNativeCommunityCliDoctor.anon.AndroidStudio
import typings.reactNativeCommunityCliDoctor.anon.CPU
import typings.reactNativeCommunityCliDoctor.anon.Java
import typings.reactNativeCommunityCliDoctor.anon.NeedsToBeFixed
import typings.reactNativeCommunityCliDoctor.anon.Node
import typings.reactNativeCommunityCliDoctor.reactNativeCommunityCliDoctorStrings.`Not Found`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait AvailableInformation extends StObject {
    
    var path: String
    
    var version: String
  }
  object AvailableInformation {
    
    inline def apply(path: String, version: String): AvailableInformation = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableInformation]
    }
    
    extension [Self <: AvailableInformation](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnvironmentInfo extends StObject {
    
    var Binaries: Node
    
    var IDEs: AndroidStudio
    
    var Languages: Java
    
    var SDKs: AndroidSDK
    
    var System: CPU
  }
  object EnvironmentInfo {
    
    inline def apply(Binaries: Node, IDEs: AndroidStudio, Languages: Java, SDKs: AndroidSDK, System: CPU): EnvironmentInfo = {
      val __obj = js.Dynamic.literal(Binaries = Binaries.asInstanceOf[js.Any], IDEs = IDEs.asInstanceOf[js.Any], Languages = Languages.asInstanceOf[js.Any], SDKs = SDKs.asInstanceOf[js.Any], System = System.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentInfo]
    }
    
    extension [Self <: EnvironmentInfo](x: Self) {
      
      inline def setBinaries(value: Node): Self = StObject.set(x, "Binaries", value.asInstanceOf[js.Any])
      
      inline def setIDEs(value: AndroidStudio): Self = StObject.set(x, "IDEs", value.asInstanceOf[js.Any])
      
      inline def setLanguages(value: Java): Self = StObject.set(x, "Languages", value.asInstanceOf[js.Any])
      
      inline def setSDKs(value: AndroidSDK): Self = StObject.set(x, "SDKs", value.asInstanceOf[js.Any])
      
      inline def setSystem(value: CPU): Self = StObject.set(x, "System", value.asInstanceOf[js.Any])
    }
  }
  
  trait HealthCheckCategory extends StObject {
    
    var healthchecks: js.Array[HealthCheckInterface]
    
    var label: String
  }
  object HealthCheckCategory {
    
    inline def apply(healthchecks: js.Array[HealthCheckInterface], label: String): HealthCheckCategory = {
      val __obj = js.Dynamic.literal(healthchecks = healthchecks.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[HealthCheckCategory]
    }
    
    extension [Self <: HealthCheckCategory](x: Self) {
      
      inline def setHealthchecks(value: js.Array[HealthCheckInterface]): Self = StObject.set(x, "healthchecks", value.asInstanceOf[js.Any])
      
      inline def setHealthchecksVarargs(value: HealthCheckInterface*): Self = StObject.set(x, "healthchecks", js.Array(value*))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait HealthCheckCategoryResult extends StObject {
    
    var healthchecks: js.Array[HealthCheckResult]
    
    var label: String
  }
  object HealthCheckCategoryResult {
    
    inline def apply(healthchecks: js.Array[HealthCheckResult], label: String): HealthCheckCategoryResult = {
      val __obj = js.Dynamic.literal(healthchecks = healthchecks.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[HealthCheckCategoryResult]
    }
    
    extension [Self <: HealthCheckCategoryResult](x: Self) {
      
      inline def setHealthchecks(value: js.Array[HealthCheckResult]): Self = StObject.set(x, "healthchecks", value.asInstanceOf[js.Any])
      
      inline def setHealthchecksVarargs(value: HealthCheckResult*): Self = StObject.set(x, "healthchecks", js.Array(value*))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait HealthCheckInterface extends StObject {
    
    var darwinAutomaticFix: js.UndefOr[RunAutomaticFix] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    def getDiagnostics(environmentInfo: EnvironmentInfo): js.Promise[NeedsToBeFixed]
    
    var isRequired: js.UndefOr[Boolean] = js.undefined
    
    var label: String
    
    var linuxAutomaticFix: js.UndefOr[RunAutomaticFix] = js.undefined
    
    def runAutomaticFix(args: typings.reactNativeCommunityCliDoctor.anon.EnvironmentInfo): js.Promise[Unit] | Unit
    @JSName("runAutomaticFix")
    var runAutomaticFix_Original: RunAutomaticFix
    
    var visible: js.UndefOr[Boolean | Unit] = js.undefined
    
    var win32AutomaticFix: js.UndefOr[RunAutomaticFix] = js.undefined
  }
  object HealthCheckInterface {
    
    inline def apply(
      getDiagnostics: EnvironmentInfo => js.Promise[NeedsToBeFixed],
      label: String,
      runAutomaticFix: /* args */ typings.reactNativeCommunityCliDoctor.anon.EnvironmentInfo => js.Promise[Unit] | Unit
    ): HealthCheckInterface = {
      val __obj = js.Dynamic.literal(getDiagnostics = js.Any.fromFunction1(getDiagnostics), label = label.asInstanceOf[js.Any], runAutomaticFix = js.Any.fromFunction1(runAutomaticFix))
      __obj.asInstanceOf[HealthCheckInterface]
    }
    
    extension [Self <: HealthCheckInterface](x: Self) {
      
      inline def setDarwinAutomaticFix(
        value: /* args */ typings.reactNativeCommunityCliDoctor.anon.EnvironmentInfo => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "darwinAutomaticFix", js.Any.fromFunction1(value))
      
      inline def setDarwinAutomaticFixUndefined: Self = StObject.set(x, "darwinAutomaticFix", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setGetDiagnostics(value: EnvironmentInfo => js.Promise[NeedsToBeFixed]): Self = StObject.set(x, "getDiagnostics", js.Any.fromFunction1(value))
      
      inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
      
      inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLinuxAutomaticFix(
        value: /* args */ typings.reactNativeCommunityCliDoctor.anon.EnvironmentInfo => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "linuxAutomaticFix", js.Any.fromFunction1(value))
      
      inline def setLinuxAutomaticFixUndefined: Self = StObject.set(x, "linuxAutomaticFix", js.undefined)
      
      inline def setRunAutomaticFix(
        value: /* args */ typings.reactNativeCommunityCliDoctor.anon.EnvironmentInfo => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "runAutomaticFix", js.Any.fromFunction1(value))
      
      inline def setVisible(value: Boolean | Unit): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWin32AutomaticFix(
        value: /* args */ typings.reactNativeCommunityCliDoctor.anon.EnvironmentInfo => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "win32AutomaticFix", js.Any.fromFunction1(value))
      
      inline def setWin32AutomaticFixUndefined: Self = StObject.set(x, "win32AutomaticFix", js.undefined)
    }
  }
  
  trait HealthCheckResult extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var isRequired: Boolean
    
    var label: String
    
    var needsToBeFixed: Boolean
    
    def runAutomaticFix(args: typings.reactNativeCommunityCliDoctor.anon.EnvironmentInfo): js.Promise[Unit] | Unit
    @JSName("runAutomaticFix")
    var runAutomaticFix_Original: RunAutomaticFix
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[NotFound | String] = js.undefined
    
    var versionRange: js.UndefOr[String] = js.undefined
    
    var versions: js.UndefOr[js.Array[String] | String] = js.undefined
  }
  object HealthCheckResult {
    
    inline def apply(
      isRequired: Boolean,
      label: String,
      needsToBeFixed: Boolean,
      runAutomaticFix: /* args */ typings.reactNativeCommunityCliDoctor.anon.EnvironmentInfo => js.Promise[Unit] | Unit
    ): HealthCheckResult = {
      val __obj = js.Dynamic.literal(isRequired = isRequired.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], needsToBeFixed = needsToBeFixed.asInstanceOf[js.Any], runAutomaticFix = js.Any.fromFunction1(runAutomaticFix))
      __obj.asInstanceOf[HealthCheckResult]
    }
    
    extension [Self <: HealthCheckResult](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setNeedsToBeFixed(value: Boolean): Self = StObject.set(x, "needsToBeFixed", value.asInstanceOf[js.Any])
      
      inline def setRunAutomaticFix(
        value: /* args */ typings.reactNativeCommunityCliDoctor.anon.EnvironmentInfo => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "runAutomaticFix", js.Any.fromFunction1(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVersion(value: NotFound | String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionRange(value: String): Self = StObject.set(x, "versionRange", value.asInstanceOf[js.Any])
      
      inline def setVersionRangeUndefined: Self = StObject.set(x, "versionRange", js.undefined)
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVersions(value: js.Array[String] | String): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
      
      inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value*))
    }
  }
  
  trait Healthchecks extends StObject {
    
    var android: HealthCheckCategory
    
    var common: HealthCheckCategory
    
    var ios: js.UndefOr[HealthCheckCategory] = js.undefined
  }
  object Healthchecks {
    
    inline def apply(android: HealthCheckCategory, common: HealthCheckCategory): Healthchecks = {
      val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any])
      __obj.asInstanceOf[Healthchecks]
    }
    
    extension [Self <: Healthchecks](x: Self) {
      
      inline def setAndroid(value: HealthCheckCategory): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setCommon(value: HealthCheckCategory): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setIos(value: HealthCheckCategory): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    }
  }
  
  type Information = AvailableInformation | NotFound
  
  type Loader = Ora
  
  type NotFound = `Not Found`
  
  type RunAutomaticFix = js.Function1[
    /* args */ typings.reactNativeCommunityCliDoctor.anon.EnvironmentInfo, 
    js.Promise[Unit] | Unit
  ]
}
