package typings.serveStatic

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new middleware function to serve files from within a given root directory.
    * The file to serve will be determined by combining req.url with the provided root directory.
    * When a file is not found, instead of sending a 404 response, this module will instead call next() to move on to the next middleware, allowing for stacking and fall-backs.
    */
  inline def apply[R /* <: ServerResponse[IncomingMessage] */](root: String): RequestHandler[R] = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[R]]
  inline def apply[R /* <: ServerResponse[IncomingMessage] */](root: String, options: ServeStaticOptions[R]): RequestHandler[R] = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[R]]
  
  @JSImport("serve-static", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("serve-static", "mime")
  @js.native
  def mime: typings.mime.mimeMod.^ = js.native
  inline def mime_=(x: typings.mime.mimeMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mime")(x.asInstanceOf[js.Any])
  
  type RequestHandler[R /* <: ServerResponse[IncomingMessage] */] = js.Function3[/* request */ IncomingMessage, /* response */ R, /* next */ js.Function0[Unit], Any]
  
  @js.native
  trait RequestHandlerConstructor[R /* <: ServerResponse[IncomingMessage] */] extends StObject {
    
    def apply(root: String): RequestHandler[R] = js.native
    def apply(root: String, options: ServeStaticOptions[R]): RequestHandler[R] = js.native
    
    var mime: typings.mime.mimeMod.^ = js.native
  }
  
  trait ServeStaticOptions[R /* <: ServerResponse[IncomingMessage] */] extends StObject {
    
    /**
      * Enable or disable setting Cache-Control response header, defaults to true.
      * Disabling this will ignore the immutable and maxAge options.
      */
    var cacheControl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set how "dotfiles" are treated when encountered. A dotfile is a file or directory that begins with a dot (".").
      * Note this check is done on the path itself without checking if the path actually exists on the disk.
      * If root is specified, only the dotfiles above the root are checked (i.e. the root itself can be within a dotfile when when set to "deny").
      * The default value is 'ignore'.
      * 'allow' No special treatment for dotfiles
      * 'deny' Send a 403 for any request for a dotfile
      * 'ignore' Pretend like the dotfile does not exist and call next()
      */
    var dotfiles: js.UndefOr[String] = js.undefined
    
    /**
      * Enable or disable etag generation, defaults to true.
      */
    var etag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set file extension fallbacks. When set, if a file is not found, the given extensions will be added to the file name and search for.
      * The first that exists will be served. Example: ['html', 'htm'].
      * The default value is false.
      */
    var extensions: js.UndefOr[js.Array[String] | false] = js.undefined
    
    /**
      * Let client errors fall-through as unhandled requests, otherwise forward a client error.
      * The default value is true.
      */
    var fallthrough: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable or disable the immutable directive in the Cache-Control response header.
      * If enabled, the maxAge option should also be specified to enable caching. The immutable directive will prevent supported clients from making conditional requests during the life of the maxAge option to check if the file has changed.
      */
    var immutable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default this module will send "index.html" files in response to a request on a directory.
      * To disable this set false or to supply a new index pass a string or an array in preferred order.
      */
    var index: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
    
    /**
      * Enable or disable Last-Modified header, defaults to true. Uses the file system's last modified value.
      */
    var lastModified: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provide a max-age in milliseconds for http caching, defaults to 0. This can also be a string accepted by the ms module.
      */
    var maxAge: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Redirect to trailing "/" when the pathname is a dir. Defaults to true.
      */
    var redirect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to set custom headers on response. Alterations to the headers need to occur synchronously.
      * The function is called as fn(res, path, stat), where the arguments are:
      * res the response object
      * path the file path that is being sent
      * stat the stat object of the file that is being sent
      */
    var setHeaders: js.UndefOr[js.Function3[/* res */ R, /* path */ String, /* stat */ Any, Any]] = js.undefined
  }
  object ServeStaticOptions {
    
    inline def apply[R /* <: ServerResponse[IncomingMessage] */](): ServeStaticOptions[R] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServeStaticOptions[R]]
    }
    
    extension [Self <: ServeStaticOptions[?], R /* <: ServerResponse[IncomingMessage] */](x: Self & ServeStaticOptions[R]) {
      
      inline def setCacheControl(value: Boolean): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      inline def setDotfiles(value: String): Self = StObject.set(x, "dotfiles", value.asInstanceOf[js.Any])
      
      inline def setDotfilesUndefined: Self = StObject.set(x, "dotfiles", js.undefined)
      
      inline def setEtag(value: Boolean): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      inline def setExtensions(value: js.Array[String] | false): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFallthrough(value: Boolean): Self = StObject.set(x, "fallthrough", value.asInstanceOf[js.Any])
      
      inline def setFallthroughUndefined: Self = StObject.set(x, "fallthrough", js.undefined)
      
      inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
      
      inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
      
      inline def setIndex(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value*))
      
      inline def setLastModified(value: Boolean): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      inline def setMaxAge(value: Double | String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setSetHeaders(value: (/* res */ R, /* path */ String, /* stat */ Any) => Any): Self = StObject.set(x, "setHeaders", js.Any.fromFunction3(value))
      
      inline def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
    }
  }
}
