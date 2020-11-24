package typings.serviceworkerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerWebpackPluginOptions[T] extends js.Object {
  
  /**
    * Path to the actual service worker implementation.
    */
  var entry: String = js.native
  
  /**
    * Exclude matched assets from being added to the `serviceWorkerOption.assets` variable. (Blacklist)
    *
    * @default ['**\/.*', '**\/ *.map']
    */
  var excludes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Relative (from the webpack's config output.path) output path for emitted script.
    *
    * @default 'sw.js'
    */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * Include matched assets added to the `serviceWorkerOption.assets` variable. (Whitelist)
    *
    * @default ['**\/ *']
    */
  var includes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether to minimize output.
    *
    * @default process.env.NODE_ENV === 'production'
    */
  var minimize: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the public URL address of the output files when referenced in a browser. We use this value to load the service worker over the network.
    *
    * @default '/'
    */
  var publicPath: js.UndefOr[String] = js.native
  
  /**
    * This callback function can be used to inject statically generated service worker.
    */
  var template: js.UndefOr[js.Function1[/* serviceWorkerOption */ T, js.Promise[Unit]]] = js.native
  
  /**
    * This callback function receives a raw `serviceWorkerOption` argument. The `jsonStats` key contains all the webpack build information.
    */
  var transformOptions: js.UndefOr[js.Function1[/* serviceWorkerOption */ ServiceWorkerOption, T]] = js.native
}
object ServiceWorkerWebpackPluginOptions {
  
  @scala.inline
  def apply[T](entry: String): ServiceWorkerWebpackPluginOptions[T] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerWebpackPluginOptions[T]]
  }
  
  @scala.inline
  implicit class ServiceWorkerWebpackPluginOptionsOps[Self <: ServiceWorkerWebpackPluginOptions[_], T] (val x: Self with ServiceWorkerWebpackPluginOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntry(value: String): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludesVarargs(value: String*): Self = this.set("excludes", js.Array(value :_*))
    
    @scala.inline
    def setExcludes(value: js.Array[String]): Self = this.set("excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludes: Self = this.set("excludes", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setIncludesVarargs(value: String*): Self = this.set("includes", js.Array(value :_*))
    
    @scala.inline
    def setIncludes(value: js.Array[String]): Self = this.set("includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludes: Self = this.set("includes", js.undefined)
    
    @scala.inline
    def setMinimize(value: Boolean): Self = this.set("minimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimize: Self = this.set("minimize", js.undefined)
    
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    
    @scala.inline
    def setTemplate(value: /* serviceWorkerOption */ T => js.Promise[Unit]): Self = this.set("template", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTransformOptions(value: /* serviceWorkerOption */ ServiceWorkerOption => T): Self = this.set("transformOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransformOptions: Self = this.set("transformOptions", js.undefined)
  }
}
