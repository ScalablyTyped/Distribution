package typings.send

import typings.node.NodeJS.WritableStream
import typings.node.fsMod.Stats
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.send.sendStrings.allow
import typings.send.sendStrings.deny
import typings.send.sendStrings.ignore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new SendStream for the given path to send to a res.
    * The req is the Node.js HTTP request and the path is a urlencoded path to send (urlencoded, not the actual file-system path).
    */
  inline def apply(req: Readable, path: String): SendStream = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[SendStream]
  inline def apply(req: Readable, path: String, options: SendOptions): SendStream = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendStream]
  
  @JSImport("send", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("send", "mime")
  @js.native
  val mime: typings.mime.mimeMod.^ = js.native
  
  trait SendOptions extends StObject {
    
    /**
      * Enable or disable accepting ranged requests, defaults to true.
      * Disabling this will not send Accept-Ranges and ignore the contents of the Range request header.
      */
    var acceptRanges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable or disable setting Cache-Control response header, defaults to true.
      * Disabling this will ignore the maxAge option.
      */
    var cacheControl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set how "dotfiles" are treated when encountered.
      * A dotfile is a file or directory that begins with a dot (".").
      * Note this check is done on the path itself without checking if the path actually exists on the disk.
      * If root is specified, only the dotfiles above the root are checked (i.e. the root itself can be within a dotfile when when set to "deny").
      * 'allow' No special treatment for dotfiles.
      * 'deny' Send a 403 for any request for a dotfile.
      * 'ignore' Pretend like the dotfile does not exist and 404.
      * The default value is similar to 'ignore', with the exception that this default will not ignore the files within a directory that begins with a dot, for backward-compatibility.
      */
    var dotfiles: js.UndefOr[allow | deny | ignore] = js.undefined
    
    /**
      * Byte offset at which the stream ends, defaults to the length of the file minus 1.
      * The end is inclusive in the stream, meaning end: 3 will include the 4th byte in the stream.
      */
    var end: js.UndefOr[Double] = js.undefined
    
    /**
      * Enable or disable etag generation, defaults to true.
      */
    var etag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If a given file doesn't exist, try appending one of the given extensions, in the given order.
      * By default, this is disabled (set to false).
      * An example value that will serve extension-less HTML files: ['html', 'htm'].
      * This is skipped if the requested file already has an extension.
      */
    var extensions: js.UndefOr[js.Array[String] | String | Boolean] = js.undefined
    
    /**
      * Enable or disable the immutable directive in the Cache-Control response header, defaults to false.
      * If set to true, the maxAge option should also be specified to enable caching.
      * The immutable directive will prevent supported clients from making conditional requests during the life of the maxAge option to check if the file has changed.
      * @default false
      */
    var immutable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default send supports "index.html" files, to disable this set false or to supply a new index pass a string or an array in preferred order.
      */
    var index: js.UndefOr[js.Array[String] | String | Boolean] = js.undefined
    
    /**
      * Enable or disable Last-Modified header, defaults to true.
      * Uses the file system's last modified value.
      */
    var lastModified: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provide a max-age in milliseconds for http caching, defaults to 0.
      * This can also be a string accepted by the ms module.
      */
    var maxAge: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Serve files relative to path.
      */
    var root: js.UndefOr[String] = js.undefined
    
    /**
      * Byte offset at which the stream starts, defaults to 0.
      * The start is inclusive, meaning start: 2 will include the 3rd byte in the stream.
      */
    var start: js.UndefOr[Double] = js.undefined
  }
  object SendOptions {
    
    inline def apply(): SendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendOptions] (val x: Self) extends AnyVal {
      
      inline def setAcceptRanges(value: Boolean): Self = StObject.set(x, "acceptRanges", value.asInstanceOf[js.Any])
      
      inline def setAcceptRangesUndefined: Self = StObject.set(x, "acceptRanges", js.undefined)
      
      inline def setCacheControl(value: Boolean): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      inline def setDotfiles(value: allow | deny | ignore): Self = StObject.set(x, "dotfiles", value.asInstanceOf[js.Any])
      
      inline def setDotfilesUndefined: Self = StObject.set(x, "dotfiles", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEtag(value: Boolean): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      inline def setExtensions(value: js.Array[String] | String | Boolean): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
      
      inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
      
      inline def setIndex(value: js.Array[String] | String | Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value*))
      
      inline def setLastModified(value: Boolean): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      inline def setMaxAge(value: String | Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait SendStream extends Stream {
    
    /**
      * Emit error with `status`.
      */
    def error(status: Double): Unit = js.native
    def error(status: Double, error: js.Error): Unit = js.native
    
    /**
      * @deprecated pass etag as option
      * Enable or disable etag generation.
      */
    def etag(`val`: Boolean): SendStream = js.native
    
    /**
      * @deprecated pass root as option
      * Set root `path`.
      */
    def from(paths: String): SendStream = js.native
    
    /**
      * Check if the pathname ends with "/".
      */
    def hasTrailingSlash(): Boolean = js.native
    
    /**
      * Raise error that headers already sent.
      */
    def headersAlreadySent(): Unit = js.native
    
    /**
      * @deprecated use dotfiles option
      * Enable or disable "hidden" (dot) files.
      */
    def hidden(`val`: Boolean): SendStream = js.native
    
    def index(paths: String): SendStream = js.native
    /**
      * @deprecated pass index as option
      * Set index `paths`, set to a falsy value to disable index support.
      */
    def index(paths: js.Array[String]): SendStream = js.native
    
    /**
      * Check if the request is cacheable, aka responded with 2xx or 304 (see RFC 2616 section 14.2{5,6}).
      */
    def isCachable(): Boolean = js.native
    
    /**
      * Check if this is a conditional GET request.
      */
    def isConditionalGET(): Boolean = js.native
    
    /**
      * Check if the cache is fresh.
      */
    def isFresh(): Boolean = js.native
    
    /**
      * Check if the range is fresh.
      */
    def isRangeFresh(): Boolean = js.native
    
    /**
      * @deprecated pass maxAge as option
      * Set max-age to `maxAge`.
      */
    def maxage(maxAge: String): SendStream = js.native
    def maxage(maxAge: Double): SendStream = js.native
    
    /**
      * Respond with 304 not modified.
      */
    def notModified(): Unit = js.native
    
    /**
      * Handle stat() error.
      */
    def onStatError(error: js.Error): Unit = js.native
    
    /**
      * Pipe to `res`.
      */
    def pipe[T /* <: WritableStream */](res: T): T = js.native
    
    /**
      * Redirect to path.
      */
    def redirect(path: String): Unit = js.native
    
    /**
      * Strip content-* header fields.
      */
    def removeContentHeaderFields(): Unit = js.native
    
    /**
      * @deprecated pass root as option
      * Set root `path`.
      */
    def root(paths: String): SendStream = js.native
    
    /**
      * Transfer `path`.
      */
    def send(path: String): Unit = js.native
    def send(path: String, stat: Stats): Unit = js.native
    
    /**
      * Transfer file for `path`.
      */
    def sendFile(path: String): Unit = js.native
    
    /**
      * Transfer index for `path`.
      */
    def sendIndex(path: String): Unit = js.native
    
    /**
      * Set response header fields, most fields may be pre-defined.
      */
    def setHeader(path: String, stat: Stats): Unit = js.native
    
    /**
      * Transfer index for `path`.
      */
    def stream(path: String): Unit = js.native
    def stream(path: String, options: js.Object): Unit = js.native
    
    /**
      * Set content-type based on `path` if it hasn't been explicitly set.
      */
    def `type`(path: String): Unit = js.native
  }
}
