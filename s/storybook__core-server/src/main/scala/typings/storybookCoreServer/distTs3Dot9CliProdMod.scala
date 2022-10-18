package typings.storybookCoreServer

import typings.storybookCoreServer.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9CliProdMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/cli/prod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProdCli(packageJson: Name): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CommanderStatic */ Any) & ProdCliOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getProdCli")(packageJson.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CommanderStatic */ Any) & ProdCliOptions]
  
  /* Inlined std.Pick<@storybook/core-common.@storybook/core-common.CLIOptions, 'configDir' | 'debugWebpack' | 'dll' | 'docs' | 'docsDll' | 'forceBuildPreview' | 'loglevel' | 'modern' | 'outputDir' | 'previewUrl' | 'quiet' | 'staticDir' | 'uiDll'> */
  trait ProdCliOptions extends StObject {
    
    var configDir: js.UndefOr[String] = js.undefined
    
    var debugWebpack: js.UndefOr[Boolean] = js.undefined
    
    var dll: js.UndefOr[Boolean] = js.undefined
    
    var docs: js.UndefOr[Boolean] = js.undefined
    
    var docsDll: js.UndefOr[Boolean] = js.undefined
    
    var forceBuildPreview: js.UndefOr[Boolean] = js.undefined
    
    var loglevel: js.UndefOr[String] = js.undefined
    
    var modern: js.UndefOr[Boolean] = js.undefined
    
    var outputDir: js.UndefOr[String] = js.undefined
    
    var previewUrl: js.UndefOr[String] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var staticDir: js.UndefOr[js.Array[String]] = js.undefined
    
    var uiDll: js.UndefOr[Boolean] = js.undefined
  }
  object ProdCliOptions {
    
    inline def apply(): ProdCliOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProdCliOptions]
    }
    
    extension [Self <: ProdCliOptions](x: Self) {
      
      inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
      
      inline def setConfigDirUndefined: Self = StObject.set(x, "configDir", js.undefined)
      
      inline def setDebugWebpack(value: Boolean): Self = StObject.set(x, "debugWebpack", value.asInstanceOf[js.Any])
      
      inline def setDebugWebpackUndefined: Self = StObject.set(x, "debugWebpack", js.undefined)
      
      inline def setDll(value: Boolean): Self = StObject.set(x, "dll", value.asInstanceOf[js.Any])
      
      inline def setDllUndefined: Self = StObject.set(x, "dll", js.undefined)
      
      inline def setDocs(value: Boolean): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
      
      inline def setDocsDll(value: Boolean): Self = StObject.set(x, "docsDll", value.asInstanceOf[js.Any])
      
      inline def setDocsDllUndefined: Self = StObject.set(x, "docsDll", js.undefined)
      
      inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
      
      inline def setForceBuildPreview(value: Boolean): Self = StObject.set(x, "forceBuildPreview", value.asInstanceOf[js.Any])
      
      inline def setForceBuildPreviewUndefined: Self = StObject.set(x, "forceBuildPreview", js.undefined)
      
      inline def setLoglevel(value: String): Self = StObject.set(x, "loglevel", value.asInstanceOf[js.Any])
      
      inline def setLoglevelUndefined: Self = StObject.set(x, "loglevel", js.undefined)
      
      inline def setModern(value: Boolean): Self = StObject.set(x, "modern", value.asInstanceOf[js.Any])
      
      inline def setModernUndefined: Self = StObject.set(x, "modern", js.undefined)
      
      inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
      
      inline def setPreviewUrl(value: String): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
      
      inline def setPreviewUrlUndefined: Self = StObject.set(x, "previewUrl", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setStaticDir(value: js.Array[String]): Self = StObject.set(x, "staticDir", value.asInstanceOf[js.Any])
      
      inline def setStaticDirUndefined: Self = StObject.set(x, "staticDir", js.undefined)
      
      inline def setStaticDirVarargs(value: String*): Self = StObject.set(x, "staticDir", js.Array(value*))
      
      inline def setUiDll(value: Boolean): Self = StObject.set(x, "uiDll", value.asInstanceOf[js.Any])
      
      inline def setUiDllUndefined: Self = StObject.set(x, "uiDll", js.undefined)
    }
  }
}
