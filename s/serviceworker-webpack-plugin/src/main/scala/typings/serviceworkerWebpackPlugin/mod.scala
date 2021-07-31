package typings.serviceworkerWebpackPlugin

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("serviceworker-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^[T] protected ()
    extends StObject
       with Plugin {
    def this(options: ServiceWorkerWebpackPluginOptions[T]) = this()
  }
  
  trait ServiceWorkerDefaultOption extends StObject {
    
    var assets: js.Array[String]
  }
  object ServiceWorkerDefaultOption {
    
    @scala.inline
    def apply(assets: js.Array[String]): ServiceWorkerDefaultOption = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceWorkerDefaultOption]
    }
    
    @scala.inline
    implicit class ServiceWorkerDefaultOptionMutableBuilder[Self <: ServiceWorkerDefaultOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssets(value: js.Array[String]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsVarargs(value: String*): Self = StObject.set(x, "assets", js.Array(value :_*))
    }
  }
  
  trait ServiceWorkerOption extends StObject {
    
    var assets: js.Array[String]
    
    var jsonStats: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stats.ToJsonOutput */ js.Any
      ] = js.undefined
  }
  object ServiceWorkerOption {
    
    @scala.inline
    def apply(assets: js.Array[String]): ServiceWorkerOption = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceWorkerOption]
    }
    
    @scala.inline
    implicit class ServiceWorkerOptionMutableBuilder[Self <: ServiceWorkerOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssets(value: js.Array[String]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsVarargs(value: String*): Self = StObject.set(x, "assets", js.Array(value :_*))
      
      @scala.inline
      def setJsonStats(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stats.ToJsonOutput */ js.Any
      ): Self = StObject.set(x, "jsonStats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonStatsUndefined: Self = StObject.set(x, "jsonStats", js.undefined)
    }
  }
  
  type ServiceWorkerWebpackPlugin[T] = Plugin
  
  trait ServiceWorkerWebpackPluginOptions[T] extends StObject {
    
    /**
      * Path to the actual service worker implementation.
      */
    var entry: String
    
    /**
      * Exclude matched assets from being added to the `serviceWorkerOption.assets` variable. (Blacklist)
      *
      * @default ['**\/.*', '**\/ *.map']
      */
    var excludes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Relative (from the webpack's config output.path) output path for emitted script.
      *
      * @default 'sw.js'
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * Include matched assets added to the `serviceWorkerOption.assets` variable. (Whitelist)
      *
      * @default ['**\/ *']
      */
    var includes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether to minimize output.
      *
      * @default process.env.NODE_ENV === 'production'
      */
    var minimize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the public URL address of the output files when referenced in a browser. We use this value to load the service worker over the network.
      *
      * @default '/'
      */
    var publicPath: js.UndefOr[String] = js.undefined
    
    /**
      * This callback function can be used to inject statically generated service worker.
      */
    var template: js.UndefOr[js.Function1[/* serviceWorkerOption */ T, js.Promise[Unit]]] = js.undefined
    
    /**
      * This callback function receives a raw `serviceWorkerOption` argument. The `jsonStats` key contains all the webpack build information.
      */
    var transformOptions: js.UndefOr[js.Function1[/* serviceWorkerOption */ ServiceWorkerOption, T]] = js.undefined
  }
  object ServiceWorkerWebpackPluginOptions {
    
    @scala.inline
    def apply[T](entry: String): ServiceWorkerWebpackPluginOptions[T] = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceWorkerWebpackPluginOptions[T]]
    }
    
    @scala.inline
    implicit class ServiceWorkerWebpackPluginOptionsMutableBuilder[Self <: ServiceWorkerWebpackPluginOptions[?], T] (val x: Self & ServiceWorkerWebpackPluginOptions[T]) extends AnyVal {
      
      @scala.inline
      def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      @scala.inline
      def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value :_*))
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setIncludes(value: js.Array[String]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
      
      @scala.inline
      def setIncludesVarargs(value: String*): Self = StObject.set(x, "includes", js.Array(value :_*))
      
      @scala.inline
      def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setTemplate(value: /* serviceWorkerOption */ T => js.Promise[Unit]): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTransformOptions(value: /* serviceWorkerOption */ ServiceWorkerOption => T): Self = StObject.set(x, "transformOptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformOptionsUndefined: Self = StObject.set(x, "transformOptions", js.undefined)
    }
  }
}
