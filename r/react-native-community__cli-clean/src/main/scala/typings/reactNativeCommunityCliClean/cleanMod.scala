package typings.reactNativeCommunityCliClean

import typings.reactNativeCommunityCliClean.anon.Default
import typings.reactNativeCommunityCliClean.anon.Description
import typings.reactNativeCommunityCliClean.anon.Name
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cleanMod {
  
  @JSImport("@react-native-community/cli-clean/build/clean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@react-native-community/cli-clean/build/clean", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-clean/build/clean", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-clean/build/clean", "default.func")
    @js.native
    def func: js.Function3[
        /* _argv */ js.Array[String], 
        /* _config */ Config, 
        /* cleanOptions */ Args, 
        js.Promise[Unit]
      ] = js.native
    inline def func(_argv: js.Array[String], _config: Config, cleanOptions: Args): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(_argv.asInstanceOf[js.Any], _config.asInstanceOf[js.Any], cleanOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def func_=(
      x: js.Function3[
          /* _argv */ js.Array[String], 
          /* _config */ Config, 
          /* cleanOptions */ Args, 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-clean/build/clean", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-clean/build/clean", "default.options")
    @js.native
    def options: js.Array[Default | Description | Name] = js.native
    inline def options_=(x: js.Array[Default | Description | Name]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  inline def clean(_argv: js.Array[String], _config: Config, cleanOptions: Args): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("clean")(_argv.asInstanceOf[js.Any], _config.asInstanceOf[js.Any], cleanOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait Args extends StObject {
    
    var include: js.UndefOr[String] = js.undefined
    
    var projectRoot: String
    
    var verifyCache: js.UndefOr[Boolean] = js.undefined
  }
  object Args {
    
    inline def apply(projectRoot: String): Args = {
      val __obj = js.Dynamic.literal(projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setVerifyCache(value: Boolean): Self = StObject.set(x, "verifyCache", value.asInstanceOf[js.Any])
      
      inline def setVerifyCacheUndefined: Self = StObject.set(x, "verifyCache", js.undefined)
    }
  }
}
