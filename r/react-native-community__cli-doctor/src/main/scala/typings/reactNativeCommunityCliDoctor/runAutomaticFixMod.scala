package typings.reactNativeCommunityCliDoctor

import typings.reactNativeCommunityCliDoctor.anon.Errors
import typings.reactNativeCommunityCliDoctor.typesMod.EnvironmentInfo
import typings.reactNativeCommunityCliDoctor.typesMod.HealthCheckCategoryResult
import typings.reactNativeCommunityCliDoctor.typesMod.Loader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runAutomaticFixMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/runAutomaticFix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasHealthchecksAutomaticFixLevelStatsEnvironmentInfo: RunAutomaticFixArgs): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasHealthchecksAutomaticFixLevelStatsEnvironmentInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @js.native
  sealed trait AUTOMATIC_FIX_LEVELS extends StObject
  @JSImport("@react-native-community/cli-doctor/build/tools/runAutomaticFix", "AUTOMATIC_FIX_LEVELS")
  @js.native
  object AUTOMATIC_FIX_LEVELS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AUTOMATIC_FIX_LEVELS & String] = js.native
    
    @js.native
    sealed trait ALL_ISSUES
      extends StObject
         with AUTOMATIC_FIX_LEVELS
    /* "ALL_ISSUES" */ val ALL_ISSUES: typings.reactNativeCommunityCliDoctor.runAutomaticFixMod.AUTOMATIC_FIX_LEVELS.ALL_ISSUES & String = js.native
    
    @js.native
    sealed trait ERRORS
      extends StObject
         with AUTOMATIC_FIX_LEVELS
    /* "ERRORS" */ val ERRORS: typings.reactNativeCommunityCliDoctor.runAutomaticFixMod.AUTOMATIC_FIX_LEVELS.ERRORS & String = js.native
    
    @js.native
    sealed trait WARNINGS
      extends StObject
         with AUTOMATIC_FIX_LEVELS
    /* "WARNINGS" */ val WARNINGS: typings.reactNativeCommunityCliDoctor.runAutomaticFixMod.AUTOMATIC_FIX_LEVELS.WARNINGS & String = js.native
  }
  
  trait RunAutomaticFixArgs extends StObject {
    
    var automaticFixLevel: AUTOMATIC_FIX_LEVELS
    
    var environmentInfo: EnvironmentInfo
    
    var healthchecks: js.Array[HealthCheckCategoryResult]
    
    var loader: Loader
    
    var stats: Errors
  }
  object RunAutomaticFixArgs {
    
    inline def apply(
      automaticFixLevel: AUTOMATIC_FIX_LEVELS,
      environmentInfo: EnvironmentInfo,
      healthchecks: js.Array[HealthCheckCategoryResult],
      loader: Loader,
      stats: Errors
    ): RunAutomaticFixArgs = {
      val __obj = js.Dynamic.literal(automaticFixLevel = automaticFixLevel.asInstanceOf[js.Any], environmentInfo = environmentInfo.asInstanceOf[js.Any], healthchecks = healthchecks.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunAutomaticFixArgs]
    }
    
    extension [Self <: RunAutomaticFixArgs](x: Self) {
      
      inline def setAutomaticFixLevel(value: AUTOMATIC_FIX_LEVELS): Self = StObject.set(x, "automaticFixLevel", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentInfo(value: EnvironmentInfo): Self = StObject.set(x, "environmentInfo", value.asInstanceOf[js.Any])
      
      inline def setHealthchecks(value: js.Array[HealthCheckCategoryResult]): Self = StObject.set(x, "healthchecks", value.asInstanceOf[js.Any])
      
      inline def setHealthchecksVarargs(value: HealthCheckCategoryResult*): Self = StObject.set(x, "healthchecks", js.Array(value*))
      
      inline def setLoader(value: Loader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Errors): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
}
