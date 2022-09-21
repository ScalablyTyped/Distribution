package typings.reactNativeCommunityCliDoctor

import typings.reactNativeCommunityCliDoctor.typesMod.Healthchecks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object healthchecksMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/healthchecks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object HEALTHCHECK_TYPES {
    
    @JSImport("@react-native-community/cli-doctor/build/tools/healthchecks", "HEALTHCHECK_TYPES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-doctor/build/tools/healthchecks", "HEALTHCHECK_TYPES.ERROR")
    @js.native
    def ERROR: String = js.native
    inline def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-doctor/build/tools/healthchecks", "HEALTHCHECK_TYPES.WARNING")
    @js.native
    def WARNING: String = js.native
    inline def WARNING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
  
  inline def getHealthchecks(hasContributor: Options): Healthchecks = ^.asInstanceOf[js.Dynamic].applyDynamic("getHealthchecks")(hasContributor.asInstanceOf[js.Any]).asInstanceOf[Healthchecks]
  
  trait Options extends StObject {
    
    var contributor: Boolean | Unit
    
    var fix: Boolean | Unit
  }
  object Options {
    
    inline def apply(contributor: Boolean | Unit, fix: Boolean | Unit): Options = {
      val __obj = js.Dynamic.literal(contributor = contributor.asInstanceOf[js.Any], fix = fix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setContributor(value: Boolean | Unit): Self = StObject.set(x, "contributor", value.asInstanceOf[js.Any])
      
      inline def setFix(value: Boolean | Unit): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
    }
  }
}
