package typings.resourceLoader.resourceLoaderMod

import typings.resourceLoader.AnonCrossOrigin
import typings.resourceLoader.mod.default
import typings.resourceLoader.resourceLoaderMod.Resource.IMetadata
import typings.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE
import typings.resourceLoader.resourceLoaderMod.Resource.OnCompleteSignal
import typings.resourceLoader.resourceLoaderMod.Resource.OnProgressSignal
import typings.resourceLoader.resourceLoaderMod.Resource.OnStartSignal
import typings.resourceLoader.resourceLoaderMod.Resource.TYPE
import typings.std.Error
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @param {string} name - The name of the resource to load.
  * @param {string|string[]} url - The url for this resource, for audio/video loads you can pass
  *      an array of sources.
  * @param {object} [options] - The options for the load.
  * @param {string|boolean} [options.crossOrigin] - Is this request cross-origin? Default is to
  *      determine automatically.
  * @param {number} [options.timeout=0] - A timeout in milliseconds for the load. If the load takes
  *      longer than this time it is cancelled and the load is considered a failure. If this value is
  *      set to `0` then there is no explicit timeout.
  * @param {Resource.LOAD_TYPE} [options.loadType=Resource.LOAD_TYPE.XHR] - How should this resource
  *      be loaded?
  * @param {Resource.XHR_RESPONSE_TYPE} [options.xhrType=Resource.XHR_RESPONSE_TYPE.DEFAULT] - How
  *      should the data being loaded be interpreted when using XHR?
  * @param {Resource.IMetadata} [options.metadata] - Extra configuration for middleware and the Resource object.
  */
@JSImport("resource-loader", "Resource")
@js.native
class Resource_ protected () extends js.Object {
  def this(name: String, url: String) = this()
  def this(name: String, url: js.Array[String]) = this()
  def this(name: String, url: String, options: AnonCrossOrigin) = this()
  def this(name: String, url: js.Array[String], options: AnonCrossOrigin) = this()
  /**
    * The child resources this resource owns.
    *
    * @readonly
    * @member {Resource[]}
    */
  val children: js.Array[Resource] = js.native
  /**
    * Is this request cross-origin? If unset, determined automatically.
    *
    * @member {string}
    */
  var crossOrigin: String = js.native
  /**
    * The data that was loaded by the resource.
    *
    * @member {any}
    */
  var data: js.Any = js.native
  /**
    * The error that occurred while loading (if any).
    *
    * @readonly
    * @member {Error}
    */
  val error: Error = js.native
  /**
    * The extension used to load this resource.
    *
    * @readonly
    * @member {string}
    */
  val extension: String = js.native
  /**
    * Describes if this resource has finished loading. Is true when the resource has completely
    * loaded.
    *
    * @readonly
    * @member {boolean}
    */
  val isComplete: Boolean = js.native
  /**
    * Stores whether or not this url is a data url.
    *
    * @readonly
    * @member {boolean}
    */
  val isDataUrl: Boolean = js.native
  /**
    * Describes if this resource is currently loading. Is true when the resource starts loading,
    * and is false again when complete.
    *
    * @readonly
    * @member {boolean}
    */
  val isLoading: Boolean = js.native
  /**
    * The method of loading to use for this resource.
    *
    * @member {Resource.LOAD_TYPE}
    */
  var loadType: LOAD_TYPE = js.native
  /**
    * Extra info for middleware, and controlling specifics about how the resource loads.
    *
    * Note that if you pass in a `loadElement`, the Resource class takes ownership of it.
    * Meaning it will modify it as it sees fit.
    *
    * @member {Resource.IMetadata}
    */
  var metadata: IMetadata = js.native
  /**
    * The name of this resource.
    *
    * @readonly
    * @member {string}
    */
  val name: String = js.native
  /**
    * Dispatched after this resource has had all the *after* middleware run on it.
    *
    * The callback looks like {@link Resource.OnCompleteSignal}.
    *
    * @member {Signal<Resource.OnCompleteSignal>}
    */
  var onAfterMiddleware: default[OnCompleteSignal] = js.native
  /**
    * Dispatched once this resource has loaded, if there was an error it will
    * be in the `error` property.
    *
    * The callback looks like {@link Resource.OnCompleteSignal}.
    *
    * @member {Signal<Resource.OnCompleteSignal>}
    */
  var onComplete: default[OnCompleteSignal] = js.native
  /**
    * Dispatched each time progress of this resource load updates.
    * Not all resources types and loader systems can support this event
    * so sometimes it may not be available. If the resource
    * is being loaded on a modern browser, using XHR, and the remote server
    * properly sets Content-Length headers, then this will be available.
    *
    * The callback looks like {@link Resource.OnProgressSignal}.
    *
    * @member {Signal<Resource.OnProgressSignal>}
    */
  var onProgress: default[OnProgressSignal] = js.native
  /**
    * Dispatched when the resource beings to load.
    *
    * The callback looks like {@link Resource.OnStartSignal}.
    *
    * @member {Signal<Resource.OnStartSignal>}
    */
  var onStart: default[OnStartSignal] = js.native
  /**
    * The progress chunk owned by this resource.
    *
    * @readonly
    * @member {number}
    */
  val progressChunk: Double = js.native
  /**
    * A timeout in milliseconds for the load. If the load takes longer than this time
    * it is cancelled and the load is considered a failure. If this value is set to `0`
    * then there is no explicit timeout.
    *
    * @member {number}
    */
  var timeout: Double = js.native
  /**
    * The resource type.
    *
    * @readonly
    * @member {Resource.TYPE}
    */
  val `type`: TYPE = js.native
  /**
    * The url used to load this resource.
    *
    * @readonly
    * @member {string}
    */
  val url: String = js.native
  /**
    * The XHR object that was used to load this resource. This is only set
    * when `loadType` is `Resource.LOAD_TYPE.XHR`.
    *
    * @readonly
    * @member {XMLHttpRequest}
    */
  val xhr: XMLHttpRequest = js.native
  /**
    * The type used to load the resource via XHR. If unset, determined automatically.
    *
    * @member {string}
    */
  var xhrType: String = js.native
  /**
    * Aborts the loading of this resource, with an optional message.
    *
    * @param {string} message - The message to use for the error
    */
  def abort(message: String): Unit = js.native
  /**
    * Marks the resource as complete.
    *
    */
  def complete(): Unit = js.native
  /**
    * Kicks off loading of this resource. This method is asynchronous.
    *
    * @param {Resource.OnCompleteSignal} [cb] - Optional callback to call once the resource is loaded.
    */
  def load(): Unit = js.native
  def load(cb: OnCompleteSignal): Unit = js.native
}

