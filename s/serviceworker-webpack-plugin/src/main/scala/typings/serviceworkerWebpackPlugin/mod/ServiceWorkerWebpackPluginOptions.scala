package typings.serviceworkerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceWorkerWebpackPluginOptions[T] extends js.Object {
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
  def apply[T](
    entry: String,
    excludes: js.Array[String] = null,
    filename: String = null,
    includes: js.Array[String] = null,
    minimize: js.UndefOr[Boolean] = js.undefined,
    publicPath: String = null,
    template: /* serviceWorkerOption */ T => js.Promise[Unit] = null,
    transformOptions: /* serviceWorkerOption */ ServiceWorkerOption => T = null
  ): ServiceWorkerWebpackPluginOptions[T] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    if (excludes != null) __obj.updateDynamic("excludes")(excludes.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (includes != null) __obj.updateDynamic("includes")(includes.asInstanceOf[js.Any])
    if (!js.isUndefined(minimize)) __obj.updateDynamic("minimize")(minimize.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1(template))
    if (transformOptions != null) __obj.updateDynamic("transformOptions")(js.Any.fromFunction1(transformOptions))
    __obj.asInstanceOf[ServiceWorkerWebpackPluginOptions[T]]
  }
}

