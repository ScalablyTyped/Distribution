package typings.storybookCoreCommon.distTs3Dot9TypesMod

import typings.storybookCoreCommon.anon.ArgTypeTargetsV7
import typings.storybookCoreCommon.anon.PartialTypescriptOptions
import typings.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorybookConfig extends StObject {
  
  /**
    * Sets the addons you want to use with Storybook.
    *
    * @example `['@storybook/addon-essentials']` or `[{ name: '@storybook/addon-essentials', options: { backgrounds: false } }]`
    */
  var addons: js.UndefOr[js.Array[Preset]] = js.undefined
  
  /**
    * Add additional scripts to run in the preview a la `.storybook/preview.js`
    *
    * @deprecated use `previewAnnotations` or `/preview.js` file instead
    */
  var config: js.UndefOr[
    js.Function2[/* entries */ js.Array[Entry], /* options */ Options, js.Array[Entry]]
  ] = js.undefined
  
  var core: js.UndefOr[CoreConfig] = js.undefined
  
  var features: js.UndefOr[ArgTypeTargetsV7] = js.undefined
  
  /**
    * Framework, e.g. '@storybook/react', required in v7
    */
  var framework: js.UndefOr[Preset] = js.undefined
  
  var logLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Add additional scripts to run in the preview a la `.storybook/preview.js`
    */
  var previewAnnotations: js.UndefOr[
    js.Function2[/* entries */ js.Array[Entry], /* options */ Options, js.Array[Entry]]
  ] = js.undefined
  
  /**
    * References external Storybooks
    */
  var refs: js.UndefOr[
    StorybookRefs | (js.Function2[/* config */ Configuration, /* options */ Options, StorybookRefs])
  ] = js.undefined
  
  /**
    * Sets a list of directories of static files to be loaded by Storybook server
    *
    * @example `['./public']` or `[{from: './public', 'to': '/assets'}]`
    */
  var staticDirs: js.UndefOr[js.Array[DirectoryMapping | String]] = js.undefined
  
  /**
    * Tells Storybook where to find stories.
    *
    * @example `['./src/ *.stories.@(j|t)sx?']`
    */
  var stories: js.Array[StoriesEntry]
  
  /**
    * Controls how Storybook handles TypeScript files.
    */
  var typescript: js.UndefOr[PartialTypescriptOptions] = js.undefined
  
  /**
    * Modify or return a custom Webpack config.
    */
  var webpackFinal: js.UndefOr[
    js.Function2[
      /* config */ Configuration, 
      /* options */ Options, 
      Configuration | js.Promise[Configuration]
    ]
  ] = js.undefined
}
object StorybookConfig {
  
  inline def apply(stories: js.Array[StoriesEntry]): StorybookConfig = {
    val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorybookConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorybookConfig] (val x: Self) extends AnyVal {
    
    inline def setAddons(value: js.Array[Preset]): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
    
    inline def setAddonsUndefined: Self = StObject.set(x, "addons", js.undefined)
    
    inline def setAddonsVarargs(value: Preset*): Self = StObject.set(x, "addons", js.Array(value*))
    
    inline def setConfig(value: (/* entries */ js.Array[Entry], /* options */ Options) => js.Array[Entry]): Self = StObject.set(x, "config", js.Any.fromFunction2(value))
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCore(value: CoreConfig): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
    
    inline def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
    
    inline def setFeatures(value: ArgTypeTargetsV7): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFramework(value: Preset): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setPreviewAnnotations(value: (/* entries */ js.Array[Entry], /* options */ Options) => js.Array[Entry]): Self = StObject.set(x, "previewAnnotations", js.Any.fromFunction2(value))
    
    inline def setPreviewAnnotationsUndefined: Self = StObject.set(x, "previewAnnotations", js.undefined)
    
    inline def setRefs(
      value: StorybookRefs | (js.Function2[/* config */ Configuration, /* options */ Options, StorybookRefs])
    ): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setRefsFunction2(value: (/* config */ Configuration, /* options */ Options) => StorybookRefs): Self = StObject.set(x, "refs", js.Any.fromFunction2(value))
    
    inline def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
    
    inline def setStaticDirs(value: js.Array[DirectoryMapping | String]): Self = StObject.set(x, "staticDirs", value.asInstanceOf[js.Any])
    
    inline def setStaticDirsUndefined: Self = StObject.set(x, "staticDirs", js.undefined)
    
    inline def setStaticDirsVarargs(value: (DirectoryMapping | String)*): Self = StObject.set(x, "staticDirs", js.Array(value*))
    
    inline def setStories(value: js.Array[StoriesEntry]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    
    inline def setStoriesVarargs(value: StoriesEntry*): Self = StObject.set(x, "stories", js.Array(value*))
    
    inline def setTypescript(value: PartialTypescriptOptions): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
    
    inline def setTypescriptUndefined: Self = StObject.set(x, "typescript", js.undefined)
    
    inline def setWebpackFinal(
      value: (/* config */ Configuration, /* options */ Options) => Configuration | js.Promise[Configuration]
    ): Self = StObject.set(x, "webpackFinal", js.Any.fromFunction2(value))
    
    inline def setWebpackFinalUndefined: Self = StObject.set(x, "webpackFinal", js.undefined)
  }
}
