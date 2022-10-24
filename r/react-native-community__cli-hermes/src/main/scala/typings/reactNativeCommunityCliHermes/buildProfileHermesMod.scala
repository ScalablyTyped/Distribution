package typings.reactNativeCommunityCliHermes

import typings.reactNativeCommunityCliHermes.anon.Cmd
import typings.reactNativeCommunityCliHermes.anon.Default
import typings.reactNativeCommunityCliHermes.anon.Description
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildProfileHermesMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-hermes/build/profileHermes", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-hermes/build/profileHermes", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-hermes/build/profileHermes", "default.examples")
    @js.native
    def examples: js.Array[Cmd] = js.native
    inline def examples_=(x: js.Array[Cmd]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("examples")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-hermes/build/profileHermes", "default.func")
    @js.native
    def func: js.Function3[
        /* param0 */ js.Array[String], 
        /* ctx */ Config, 
        /* options */ Options, 
        js.Promise[Unit]
      ] = js.native
    inline def func(param0: js.Array[String], ctx: Config, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(param0.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def func_=(
      x: js.Function3[
          /* param0 */ js.Array[String], 
          /* ctx */ Config, 
          /* options */ Options, 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-hermes/build/profileHermes", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-hermes/build/profileHermes", "default.options")
    @js.native
    def options: js.Array[Default | Description] = js.native
    inline def options_=(x: js.Array[Default | Description]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  trait Options extends StObject {
    
    var appId: js.UndefOr[String] = js.undefined
    
    var appIdSuffix: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var generateSourcemap: js.UndefOr[Boolean] = js.undefined
    
    var port: String
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var sourcemapPath: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(port: String): Options = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdSuffix(value: String): Self = StObject.set(x, "appIdSuffix", value.asInstanceOf[js.Any])
      
      inline def setAppIdSuffixUndefined: Self = StObject.set(x, "appIdSuffix", js.undefined)
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setGenerateSourcemap(value: Boolean): Self = StObject.set(x, "generateSourcemap", value.asInstanceOf[js.Any])
      
      inline def setGenerateSourcemapUndefined: Self = StObject.set(x, "generateSourcemap", js.undefined)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setSourcemapPath(value: String): Self = StObject.set(x, "sourcemapPath", value.asInstanceOf[js.Any])
      
      inline def setSourcemapPathUndefined: Self = StObject.set(x, "sourcemapPath", js.undefined)
    }
  }
}
