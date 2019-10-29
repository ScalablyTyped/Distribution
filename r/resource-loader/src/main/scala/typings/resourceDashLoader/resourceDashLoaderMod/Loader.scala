package typings.resourceDashLoader.resourceDashLoaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.resourceDashLoader.miniDashSignalsMod.default
import typings.resourceDashLoader.resourceDashLoaderMod.Loader.OnCompleteSignal
import typings.resourceDashLoader.resourceDashLoaderMod.Loader.OnErrorSignal
import typings.resourceDashLoader.resourceDashLoaderMod.Loader.OnLoadSignal
import typings.resourceDashLoader.resourceDashLoaderMod.Loader.OnProgressSignal
import typings.resourceDashLoader.resourceDashLoaderMod.Loader.OnStartSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @param {string} [baseUrl=''] - The base url for all resources loaded by this loader.
  * @param {number} [concurrency=10] - The number of resources to load concurrently.
  */
@JSImport("resource-loader", "Loader")
@js.native
class Loader () extends js.Object {
  def this(baseUrl: String) = this()
  def this(baseUrl: String, concurrency: Double) = this()
  /**
    * The base url for all resources loaded by this loader.
    *
    * @member {string}
    */
  var baseUrl: String = js.native
  /**
    * The number of resources to load concurrently.
    *
    * @member {number}
    * @default 10
    */
  var concurrency: Double = js.native
  /**
    * A querystring to append to every URL added to the loader.
    *
    * This should be a valid query string *without* the question-mark (`?`). The loader will
    * also *not* escape values for you. Make sure to escape your parameters with
    * [`encodeURIComponent`](https://mdn.io/encodeURIComponent) before assigning this property.
    *
    * @example
    * const loader = new Loader();
    *
    * loader.defaultQueryString = 'user=me&password=secret';
    *
    * // This will request 'image.png?user=me&password=secret'
    * loader.add('image.png').load();
    *
    * loader.reset();
    *
    * // This will request 'image.png?v=1&user=me&password=secret'
    * loader.add('iamge.png?v=1').load();
    *
    * @member {string}
    * @default ''
    */
  var defaultQueryString: String = js.native
  /**
    * Loading state of the loader, true if it is currently loading resources.
    *
    * @member {boolean}
    * @default false
    */
  var loading: Boolean = js.native
  /**
    * Dispatched when the queued resources all load.
    *
    * The callback looks like {@link Loader.OnCompleteSignal}.
    *
    * @member {Signal<Loader.OnCompleteSignal>}
    */
  var onComplete: default[OnCompleteSignal] = js.native
  /**
    * Dispatched once per errored resource.
    *
    * The callback looks like {@link Loader.OnErrorSignal}.
    *
    * @member {Signal<Loader.OnErrorSignal>}
    */
  var onError: default[OnErrorSignal] = js.native
  /**
    * Dispatched once per loaded resource.
    *
    * The callback looks like {@link Loader.OnLoadSignal}.
    *
    * @member {Signal<Loader.OnLoadSignal>}
    */
  var onLoad: default[OnLoadSignal] = js.native
  /**
    * Dispatched once per loaded or errored resource.
    *
    * The callback looks like {@link Loader.OnProgressSignal}.
    *
    * @member {Signal<Loader.OnProgressSignal>}
    */
  var onProgress: default[OnProgressSignal] = js.native
  /**
    * Dispatched when the loader begins to process the queue.
    *
    * The callback looks like {@link Loader.OnStartSignal}.
    *
    * @member {Signal<Loader.OnStartSignal>}
    */
  var onStart: default[OnStartSignal] = js.native
  /**
    * The progress percent of the loader going through the queue.
    *
    * @member {number}
    * @default 0
    */
  var progress: Double = js.native
  /**
    * All the resources for this loader keyed by name.
    *
    * @member {object<string, Resource>}
    */
  var resources: StringDictionary[Resource] = js.native
  /**
    * Adds a resource (or multiple resources) to the loader queue.
    *
    * This function can take a wide variety of different parameters. The only thing that is always
    * required the url to load. All the following will work:
    *
    * ```js
    * loader
    *     // normal param syntax
    *     .add('key', 'http://...', function () {})
    *     .add('http://...', function () {})
    *     .add('http://...')
    *
    *     // object syntax
    *     .add({
    *         name: 'key2',
    *         url: 'http://...'
    *     }, function () {})
    *     .add({
    *         url: 'http://...'
    *     }, function () {})
    *     .add({
    *         name: 'key3',
    *         url: 'http://...'
    *         onComplete: function () {}
    *     })
    *     .add({
    *         url: 'https://...',
    *         onComplete: function () {},
    *         crossOrigin: true
    *     })
    *
    *     // you can also pass an array of objects or urls or both
    *     .add([
    *         { name: 'key4', url: 'http://...', onComplete: function () {} },
    *         { url: 'http://...', onComplete: function () {} },
    *         'http://...'
    *     ])
    *
    *     // and you can use both params and options
    *     .add('key', 'http://...', { crossOrigin: true }, function () {})
    *     .add('http://...', { crossOrigin: true }, function () {});
    * ```
    *
    * @function
    * @variation 1
    * @param {string} name - The name of the resource to load.
    * @param {string} url - The url for this resource, relative to the baseUrl of this loader.
    * @param {Resource.OnCompleteSignal} [callback] - Function to call when this specific resource completes loading.
    * @return {this} Returns itself.
    */
  def add(name: String, url: String): this.type = js.native
  def add(
    name: String,
    url: String,
    callback: typings.resourceDashLoader.resourceDashLoaderMod.Resource.OnCompleteSignal
  ): this.type = js.native
  def add(name: String, url: String, options: IAddOptions): this.type = js.native
  def add(
    name: String,
    url: String,
    options: IAddOptions,
    callback: typings.resourceDashLoader.resourceDashLoaderMod.Resource.OnCompleteSignal
  ): this.type = js.native
  /** @function
    * @variation 5
    * @param {IAddOptions} options - The options for the load. This object must contain a `url` property.
    * @param {Resource.OnCompleteSignal} [callback] - Function to call when this specific resource completes loading.
    * @return {this} Returns itself.
    */
  def add(options: IAddOptions): this.type = js.native
  def add(
    options: IAddOptions,
    callback: typings.resourceDashLoader.resourceDashLoaderMod.Resource.OnCompleteSignal
  ): this.type = js.native
  /** @function
    * @variation 6
    * @param {Array<IAddOptions|string>} resources - An array of resources to load, where each is
    *      either an object with the options or a string url. If you pass an object, it must contain a `url` property.
    * @param {Resource.OnCompleteSignal} [callback] - Function to call when this specific resource completes loading.
    * @return {this} Returns itself.
    */
  def add(resources: js.Array[IAddOptions | String]): this.type = js.native
  def add(
    resources: js.Array[IAddOptions | String],
    callback: typings.resourceDashLoader.resourceDashLoaderMod.Resource.OnCompleteSignal
  ): this.type = js.native
  /** @function
    * @variation 3
    * @param {string} url - The url for this resource, relative to the baseUrl of this loader.
    * @param {Resource.OnCompleteSignal} [callback] - Function to call when this specific resource completes loading.
    * @return {this} Returns itself.
    */
  def add(url: String): this.type = js.native
  def add(url: String, callback: typings.resourceDashLoader.resourceDashLoaderMod.Resource.OnCompleteSignal): this.type = js.native
  def add(url: String, options: IAddOptions): this.type = js.native
  def add(
    url: String,
    options: IAddOptions,
    callback: typings.resourceDashLoader.resourceDashLoaderMod.Resource.OnCompleteSignal
  ): this.type = js.native
  /**
    * Starts loading the queued resources.
    *
    * @param {function} [cb] - Optional callback that will be bound to the `complete` event.
    * @return {this} Returns itself.
    */
  def load(): this.type = js.native
  def load(cb: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  /**
    * Sets up a middleware function that will run *before* the
    * resource is loaded.
    *
    * @param {function} fn - The middleware function to register.
    * @return {this} Returns itself.
    */
  def pre(fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  /**
    * Resets the queue of the loader to prepare for a new load.
    *
    * @return {this} Returns itself.
    */
  def reset(): this.type = js.native
  /**
    * Sets up a middleware function that will run *after* the
    * resource is loaded.
    *
    * @param {function} fn - The middleware function to register.
    * @return {this} Returns itself.
    */
  def use(fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
}

/* static members */
@JSImport("resource-loader", "Loader")
@js.native
object Loader extends js.Object {
  /**
    * Sets up a middleware function that will run *before* the
    * resource is loaded.
    *
    * @static
    * @param {function} fn - The middleware function to register.
    * @return {Loader} Returns itself.
    */
  def pre(fn: js.Function1[/* repeated */ js.Any, _]): Loader = js.native
  /**
    * Sets up a middleware function that will run *after* the
    * resource is loaded.
    *
    * @static
    * @param {function} fn - The middleware function to register.
    * @return {Loader} Returns itself.
    */
  def use(fn: js.Function1[/* repeated */ js.Any, _]): Loader = js.native
  /**
    * When the loader completes loading resources it dispatches this callback.
    *
    * @memberof Loader
    * @callback OnCompleteSignal
    * @param {Loader} loader - The loader that has finished loading resources.
    */
  type OnCompleteSignal = js.Function1[/* loader */ Loader, Unit]
  /**
    * When an error occurrs the loader and resource are disaptched.
    *
    * @memberof Loader
    * @callback OnErrorSignal
    * @param {Loader} loader - The loader the error happened in.
    * @param {Resource} resource - The resource that caused the error.
    */
  type OnErrorSignal = js.Function2[/* loader */ Loader, /* resource */ Resource, Unit]
  /**
    * When a load completes the loader and resource are disaptched.
    *
    * @memberof Loader
    * @callback OnLoadSignal
    * @param {Loader} loader - The loader that laoded the resource.
    * @param {Resource} resource - The resource that has completed loading.
    */
  type OnLoadSignal = js.Function2[/* loader */ Loader, /* resource */ Resource, Unit]
  /**
    * When the progress changes the loader and resource are disaptched.
    *
    * @memberof Loader
    * @callback OnProgressSignal
    * @param {Loader} loader - The loader the progress is advancing on.
    * @param {Resource} resource - The resource that has completed or failed to cause the progress to advance.
    */
  type OnProgressSignal = js.Function2[/* loader */ Loader, /* resource */ Resource, Unit]
  /**
    * When the loader starts loading resources it dispatches this callback.
    *
    * @memberof Loader
    * @callback OnStartSignal
    * @param {Loader} loader - The loader that has started loading resources.
    */
  type OnStartSignal = js.Function1[/* loader */ Loader, Unit]
}

