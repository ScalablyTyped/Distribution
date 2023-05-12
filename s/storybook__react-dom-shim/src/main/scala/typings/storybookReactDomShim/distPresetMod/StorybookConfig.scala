package typings.storybookReactDomShim.distPresetMod

import typings.babelCore.mod.TransformOptions
import typings.std.Record
import typings.storybookReactDomShim.anon.ArgTypeTargetsV7
import typings.storybookReactDomShim.anon.PartialTypescriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for Storybook configuration in `main.ts` files.
  */
trait StorybookConfig extends StObject {
  
  /**
    * Sets the addons you want to use with Storybook.
    *
    * @example `['@storybook/addon-essentials']` or `[{ name: '@storybook/addon-essentials', options: { backgrounds: false } }]`
    */
  var addons: js.UndefOr[js.Array[Preset]] = js.undefined
  
  /**
    * Modify or return babel config.
    */
  var babel: js.UndefOr[
    js.Function2[
      /* config */ TransformOptions, 
      /* options */ Options, 
      TransformOptions | js.Promise[TransformOptions]
    ]
  ] = js.undefined
  
  /**
    * Modify or return babel config.
    */
  var babelDefault: js.UndefOr[
    js.Function2[
      /* config */ TransformOptions, 
      /* options */ Options, 
      TransformOptions | js.Promise[TransformOptions]
    ]
  ] = js.undefined
  
  /**
    * Add additional scripts to run in the preview a la `.storybook/preview.js`
    *
    * @deprecated use `previewAnnotations` or `/preview.js` file instead
    */
  var config: js.UndefOr[PresetValue[js.Array[Entry]]] = js.undefined
  
  var core: js.UndefOr[CoreConfig] = js.undefined
  
  /**
    * Docs related features in index generation
    */
  var docs: js.UndefOr[DocsOptions] = js.undefined
  
  /**
    * Modify or return env config.
    */
  var env: js.UndefOr[PresetValue[Record[String, String]]] = js.undefined
  
  var features: js.UndefOr[ArgTypeTargetsV7] = js.undefined
  
  /**
    * Framework, e.g. '@storybook/react-vite', required in v7
    */
  var framework: js.UndefOr[Preset] = js.undefined
  
  var logLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Add additional scripts to run in the preview a la `.storybook/preview.js`
    */
  var previewAnnotations: js.UndefOr[PresetValue[js.Array[Entry]]] = js.undefined
  
  var previewBody: js.UndefOr[PresetValue[String]] = js.undefined
  
  /**
    * Programmatically modify the preview head/body HTML.
    * The previewHead and previewBody functions accept a string,
    * which is the existing head/body, and return a modified string.
    */
  var previewHead: js.UndefOr[PresetValue[String]] = js.undefined
  
  /**
    * Programatically override the preview's main page template.
    * This should return a reference to a file containing an `.ejs` template
    * that will be interpolated with environment variables.
    *
    * @example '.storybook/index.ejs'
    */
  var previewMainTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * References external Storybooks
    */
  var refs: js.UndefOr[PresetValue[CoreCommonStorybookRefs]] = js.undefined
  
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
    * Process CSF files for the story index.
    */
  var storyIndexers: js.UndefOr[PresetValue[js.Array[StoryIndexer]]] = js.undefined
  
  /**
    * Controls how Storybook handles TypeScript files.
    */
  var typescript: js.UndefOr[PartialTypescriptOptions] = js.undefined
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
    
    inline def setBabel(
      value: (/* config */ TransformOptions, /* options */ Options) => TransformOptions | js.Promise[TransformOptions]
    ): Self = StObject.set(x, "babel", js.Any.fromFunction2(value))
    
    inline def setBabelDefault(
      value: (/* config */ TransformOptions, /* options */ Options) => TransformOptions | js.Promise[TransformOptions]
    ): Self = StObject.set(x, "babelDefault", js.Any.fromFunction2(value))
    
    inline def setBabelDefaultUndefined: Self = StObject.set(x, "babelDefault", js.undefined)
    
    inline def setBabelUndefined: Self = StObject.set(x, "babel", js.undefined)
    
    inline def setConfig(value: PresetValue[js.Array[Entry]]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigFunction2(value: (js.Array[Entry], /* options */ Options) => js.Array[Entry] | js.Promise[js.Array[Entry]]): Self = StObject.set(x, "config", js.Any.fromFunction2(value))
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setConfigVarargs(value: Entry*): Self = StObject.set(x, "config", js.Array(value*))
    
    inline def setCore(value: CoreConfig): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
    
    inline def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
    
    inline def setDocs(value: DocsOptions): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setEnv(value: PresetValue[Record[String, String]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvFunction2(
      value: (Record[String, String], /* options */ Options) => (Record[String, String]) | (js.Promise[Record[String, String]])
    ): Self = StObject.set(x, "env", js.Any.fromFunction2(value))
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setFeatures(value: ArgTypeTargetsV7): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFramework(value: Preset): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setPreviewAnnotations(value: PresetValue[js.Array[Entry]]): Self = StObject.set(x, "previewAnnotations", value.asInstanceOf[js.Any])
    
    inline def setPreviewAnnotationsFunction2(value: (js.Array[Entry], /* options */ Options) => js.Array[Entry] | js.Promise[js.Array[Entry]]): Self = StObject.set(x, "previewAnnotations", js.Any.fromFunction2(value))
    
    inline def setPreviewAnnotationsUndefined: Self = StObject.set(x, "previewAnnotations", js.undefined)
    
    inline def setPreviewAnnotationsVarargs(value: Entry*): Self = StObject.set(x, "previewAnnotations", js.Array(value*))
    
    inline def setPreviewBody(value: PresetValue[String]): Self = StObject.set(x, "previewBody", value.asInstanceOf[js.Any])
    
    inline def setPreviewBodyFunction2(value: (String, /* options */ Options) => String | js.Promise[String]): Self = StObject.set(x, "previewBody", js.Any.fromFunction2(value))
    
    inline def setPreviewBodyUndefined: Self = StObject.set(x, "previewBody", js.undefined)
    
    inline def setPreviewHead(value: PresetValue[String]): Self = StObject.set(x, "previewHead", value.asInstanceOf[js.Any])
    
    inline def setPreviewHeadFunction2(value: (String, /* options */ Options) => String | js.Promise[String]): Self = StObject.set(x, "previewHead", js.Any.fromFunction2(value))
    
    inline def setPreviewHeadUndefined: Self = StObject.set(x, "previewHead", js.undefined)
    
    inline def setPreviewMainTemplate(value: String): Self = StObject.set(x, "previewMainTemplate", value.asInstanceOf[js.Any])
    
    inline def setPreviewMainTemplateUndefined: Self = StObject.set(x, "previewMainTemplate", js.undefined)
    
    inline def setRefs(value: PresetValue[CoreCommonStorybookRefs]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setRefsFunction2(
      value: (CoreCommonStorybookRefs, /* options */ Options) => CoreCommonStorybookRefs | js.Promise[CoreCommonStorybookRefs]
    ): Self = StObject.set(x, "refs", js.Any.fromFunction2(value))
    
    inline def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
    
    inline def setStaticDirs(value: js.Array[DirectoryMapping | String]): Self = StObject.set(x, "staticDirs", value.asInstanceOf[js.Any])
    
    inline def setStaticDirsUndefined: Self = StObject.set(x, "staticDirs", js.undefined)
    
    inline def setStaticDirsVarargs(value: (DirectoryMapping | String)*): Self = StObject.set(x, "staticDirs", js.Array(value*))
    
    inline def setStories(value: js.Array[StoriesEntry]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    
    inline def setStoriesVarargs(value: StoriesEntry*): Self = StObject.set(x, "stories", js.Array(value*))
    
    inline def setStoryIndexers(value: PresetValue[js.Array[StoryIndexer]]): Self = StObject.set(x, "storyIndexers", value.asInstanceOf[js.Any])
    
    inline def setStoryIndexersFunction2(
      value: (js.Array[StoryIndexer], /* options */ Options) => js.Array[StoryIndexer] | js.Promise[js.Array[StoryIndexer]]
    ): Self = StObject.set(x, "storyIndexers", js.Any.fromFunction2(value))
    
    inline def setStoryIndexersUndefined: Self = StObject.set(x, "storyIndexers", js.undefined)
    
    inline def setStoryIndexersVarargs(value: StoryIndexer*): Self = StObject.set(x, "storyIndexers", js.Array(value*))
    
    inline def setTypescript(value: PartialTypescriptOptions): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
    
    inline def setTypescriptUndefined: Self = StObject.set(x, "typescript", js.undefined)
  }
}
