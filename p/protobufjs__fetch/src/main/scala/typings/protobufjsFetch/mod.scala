package typings.protobufjsFetch

import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Fetches the contents of a file.
    * @memberof util
    * @param {string} filename File path or url
    * @param {FetchOptions} options Fetch options
    * @param {FetchCallback} callback Callback function
    * @returns {undefined}
    */
  inline def apply(filename: String, options: FetchOptions, callback: FetchCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Fetches the contents of a file.
    * @name util.fetch
    * @function
    * @param {string} path File path or url
    * @param {FetchOptions} [options] Fetch options
    * @returns {Promise<string|Uint8Array>} Promise
    * @variation 3
    */
  inline def apply(path: String): js.Promise[String | Uint8Array] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Uint8Array]]
  /**
    * Fetches the contents of a file.
    * @name util.fetch
    * @function
    * @param {string} path File path or url
    * @param {FetchCallback} callback Callback function
    * @returns {undefined}
    * @variation 2
    */
  inline def apply(path: String, callback: FetchCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(path: String, options: FetchOptions): js.Promise[String | Uint8Array] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Uint8Array]]
  
  @JSImport("@protobufjs/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Node-style callback as used by {@link util.fetch}.
    * @typedef FetchCallback
    * @type {function}
    * @param {?Error} error Error, if any, otherwise `null`
    * @param {string} [contents] File contents, if there hasn't been an error
    * @returns {undefined}
    */
  type FetchCallback = js.Function2[/* error */ Error, /* contents */ js.UndefOr[String], Unit]
  
  /**
    * Options as used by {@link util.fetch}.
    * @typedef FetchOptions
    * @type {Object}
    * @property {boolean} [binary=false] Whether expecting a binary response
    * @property {boolean} [xhr=false] If `true`, forces the use of XMLHttpRequest
    */
  trait FetchOptions extends StObject {
    
    var binary: js.UndefOr[Boolean] = js.undefined
    
    var xhr: js.UndefOr[Boolean] = js.undefined
  }
  object FetchOptions {
    
    inline def apply(): FetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchOptions]
    }
    
    extension [Self <: FetchOptions](x: Self) {
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
}
