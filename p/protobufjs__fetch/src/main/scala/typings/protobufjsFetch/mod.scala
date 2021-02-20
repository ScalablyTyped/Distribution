package typings.protobufjsFetch

import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("@protobufjs/fetch", JSImport.Namespace)
  @js.native
  def apply(filename: String, options: FetchOptions, callback: FetchCallback): Unit = js.native
  /**
    * Fetches the contents of a file.
    * @name util.fetch
    * @function
    * @param {string} path File path or url
    * @param {FetchOptions} [options] Fetch options
    * @returns {Promise<string|Uint8Array>} Promise
    * @variation 3
    */
  @JSImport("@protobufjs/fetch", JSImport.Namespace)
  @js.native
  def apply(path: String): js.Promise[String | Uint8Array] = js.native
  /**
    * Fetches the contents of a file.
    * @name util.fetch
    * @function
    * @param {string} path File path or url
    * @param {FetchCallback} callback Callback function
    * @returns {undefined}
    * @variation 2
    */
  @JSImport("@protobufjs/fetch", JSImport.Namespace)
  @js.native
  def apply(path: String, callback: FetchCallback): Unit = js.native
  @JSImport("@protobufjs/fetch", JSImport.Namespace)
  @js.native
  def apply(path: String, options: FetchOptions): js.Promise[String | Uint8Array] = js.native
  
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
  @js.native
  trait FetchOptions extends StObject {
    
    var binary: js.UndefOr[Boolean] = js.native
    
    var xhr: js.UndefOr[Boolean] = js.native
  }
  object FetchOptions {
    
    @scala.inline
    def apply(): FetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchOptions]
    }
    
    @scala.inline
    implicit class FetchOptionsMutableBuilder[Self <: FetchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      @scala.inline
      def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
}
