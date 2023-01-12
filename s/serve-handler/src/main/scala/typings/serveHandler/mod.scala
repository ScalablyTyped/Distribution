package typings.serveHandler

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.serveHandler.anon.FnCall
import typings.serveHandler.anon.Key
import typings.serveHandler.anon.Typeoflstat
import typings.serveHandler.anon.Typeofreaddir
import typings.serveHandler.anon.Typeofrealpath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This package represents the core of `serve`. It can be plugged into any HTTP
    * server and is responsible for routing requests and handling responses.
    *
    * In order to customize the default behaviour, you can also pass custom routing
    * rules, provide your own methods for interacting with the file system and much
    * more.
    */
  inline def apply(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Unit]]
  inline def apply(
    request: Unit,
    response: Unit,
    /**
    * If you want to customize the package's default behaviour, you can use
    * this argument to pass any of the configuration options provided.
    *
    * @see https://github.com/zeit/serve-handler#options
    */
  config: Unit,
    /**
    * If you want to replace the methods the package is using for interacting
    * with the file system and sending responses, you can pass them as the
    * fourth argument to the function call. These are the methods used by the
    * package (they can all return a `Promise` or be asynchronous).
    *
    * **NOTE:** It's important that – for native methods like
    * `createReadStream` – all arguments are passed on to the native call.
    */
  methods: Methods
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any], config.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    request: Unit,
    response: Unit,
    /**
    * If you want to customize the package's default behaviour, you can use
    * this argument to pass any of the configuration options provided.
    *
    * @see https://github.com/zeit/serve-handler#options
    */
  config: Config
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    request: Unit,
    response: Unit,
    /**
    * If you want to customize the package's default behaviour, you can use
    * this argument to pass any of the configuration options provided.
    *
    * @see https://github.com/zeit/serve-handler#options
    */
  config: Config,
    /**
    * If you want to replace the methods the package is using for interacting
    * with the file system and sending responses, you can pass them as the
    * fourth argument to the function call. These are the methods used by the
    * package (they can all return a `Promise` or be asynchronous).
    *
    * **NOTE:** It's important that – for native methods like
    * `createReadStream` – all arguments are passed on to the native call.
    */
  methods: Methods
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any], config.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(request: Unit, response: ServerResponse[IncomingMessage]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    request: Unit,
    response: ServerResponse[IncomingMessage],
    /**
    * If you want to customize the package's default behaviour, you can use
    * this argument to pass any of the configuration options provided.
    *
    * @see https://github.com/zeit/serve-handler#options
    */
  config: Unit,
    /**
    * If you want to replace the methods the package is using for interacting
    * with the file system and sending responses, you can pass them as the
    * fourth argument to the function call. These are the methods used by the
    * package (they can all return a `Promise` or be asynchronous).
    *
    * **NOTE:** It's important that – for native methods like
    * `createReadStream` – all arguments are passed on to the native call.
    */
  methods: Methods
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any], config.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    request: Unit,
    response: ServerResponse[IncomingMessage],
    /**
    * If you want to customize the package's default behaviour, you can use
    * this argument to pass any of the configuration options provided.
    *
    * @see https://github.com/zeit/serve-handler#options
    */
  config: Config
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    request: Unit,
    response: ServerResponse[IncomingMessage],
    /**
    * If you want to customize the package's default behaviour, you can use
    * this argument to pass any of the configuration options provided.
    *
    * @see https://github.com/zeit/serve-handler#options
    */
  config: Config,
    /**
    * If you want to replace the methods the package is using for interacting
    * with the file system and sending responses, you can pass them as the
    * fourth argument to the function call. These are the methods used by the
    * package (they can all return a `Promise` or be asynchronous).
    *
    * **NOTE:** It's important that – for native methods like
    * `createReadStream` – all arguments are passed on to the native call.
    */
  methods: Methods
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any], config.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(request: IncomingMessage): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    request: IncomingMessage,
    response: Unit,
    /**
    * If you want to customize the package's default behaviour, you can use
    * this argument to pass any of the configuration options provided.
    *
    * @see https://github.com/zeit/serve-handler#options
    */
  config: Unit,
    /**
    * If you want to replace the methods the package is using for interacting
    * with the file system and sending responses, you can pass them as the
    * fourth argument to the function call. These are the methods used by the
    * package (they can all return a `Promise` or be asynchronous).
    *
    * **NOTE:** It's important that – for native methods like
    * `createReadStream` – all arguments are passed on to the native call.
    */
  methods: Methods
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any], config.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    request: IncomingMessage,
    response: Unit,
    /**
    * If you want to customize the package's default behaviour, you can use
    * this argument to pass any of the configuration options provided.
    *
    * @see https://github.com/zeit/serve-handler#options
    */
  config: Config
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    request: IncomingMessage,
    response: Unit,
    /**
    * If you want to customize the package's default behaviour, you can use
    * this argument to pass any of the configuration options provided.
    *
    * @see https://github.com/zeit/serve-handler#options
    */
  config: Config,
    /**
    * If you want to replace the methods the package is using for interacting
    * with the file system and sending responses, you can pass them as the
    * fourth argument to the function call. These are the methods used by the
    * package (they can all return a `Promise` or be asynchronous).
    *
    * **NOTE:** It's important that – for native methods like
    * `createReadStream` – all arguments are passed on to the native call.
    */
  methods: Methods
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any], config.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(request: IncomingMessage, response: ServerResponse[IncomingMessage]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    request: IncomingMessage,
    response: ServerResponse[IncomingMessage],
    /**
    * If you want to customize the package's default behaviour, you can use
    * this argument to pass any of the configuration options provided.
    *
    * @see https://github.com/zeit/serve-handler#options
    */
  config: Unit,
    /**
    * If you want to replace the methods the package is using for interacting
    * with the file system and sending responses, you can pass them as the
    * fourth argument to the function call. These are the methods used by the
    * package (they can all return a `Promise` or be asynchronous).
    *
    * **NOTE:** It's important that – for native methods like
    * `createReadStream` – all arguments are passed on to the native call.
    */
  methods: Methods
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any], config.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    request: IncomingMessage,
    response: ServerResponse[IncomingMessage],
    /**
    * If you want to customize the package's default behaviour, you can use
    * this argument to pass any of the configuration options provided.
    *
    * @see https://github.com/zeit/serve-handler#options
    */
  config: Config
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    request: IncomingMessage,
    response: ServerResponse[IncomingMessage],
    /**
    * If you want to customize the package's default behaviour, you can use
    * this argument to pass any of the configuration options provided.
    *
    * @see https://github.com/zeit/serve-handler#options
    */
  config: Config,
    /**
    * If you want to replace the methods the package is using for interacting
    * with the file system and sending responses, you can pass them as the
    * fourth argument to the function call. These are the methods used by the
    * package (they can all return a `Promise` or be asynchronous).
    *
    * **NOTE:** It's important that – for native methods like
    * `createReadStream` – all arguments are passed on to the native call.
    */
  methods: Methods
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any], config.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("serve-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Config extends StObject {
    
    /**
      * #### Have the `.html` extension stripped from paths.
      *
      * By default, all `.html` files can be accessed without their extension.
      * If one of these extensions is used at the end of a filename, it will
      * automatically perform a redirect with status code `301` to the same path,
      * but with the extension dropped. You can disable the feature by setting
      * this to `false`.
      *
      * However, you can also restrict it to certain paths by passing an array of
      * strings (**NOTE:** the paths can only contain globs that are matched
      * using `minimatch`).
      */
    var cleanUrls: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    /**
      * ### Disable directory listing or restrict it to certain paths.
      *
      * For paths are not files, but directories, the package will automatically
      * render a good-looking list of all the files and directories contained
      * inside that directory. If you'd like to disable this for all paths, set
      * this option to `false`. Furthermore, you can also restrict it to certain
      * directory paths if you want, by passing an array of strings.
      *
      * **NOTE:** The paths can only contain globs that are matched using `minimatch`.
      */
    var directoryListing: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    /**
      * #### Calculate a strong `ETag` response header, instead of `Last-Modified`.
      *
      * HTTP response headers will contain a strong `ETag` response header,
      * instead of a `Last-Modified` header. Opt-in because calculating the hash
      * value may be computationally expensive for large files.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/ETag
      * @see https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Last-Modified
      */
    var etag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * #### Set custom headers for specific paths.
      *
      * Allows you to set custom headers (and overwrite the default ones) for
      * certain paths. If you define the `ETag` header for a path, the handler
      * will automatically reply with status code `304` for that path if a
      * request comes in with a matching `If-None-Match` header. If you set a
      * header `value` to `null` it removes any previous defined header with the
      * same key.
      *
      * **NOTE:** The paths can only contain globs that are matched using `minimatch`.
      */
    var headers: js.UndefOr[js.Array[Header]] = js.undefined
    
    /**
      * #### Set a sub directory to be served.
      *
      * By default, the current working directory will be served. If you only
      * want to serve a specific path, you can use this options to pass an
      * absolute path or a custom directory to be served relative to the current
      * working directory.
      *
      * **NOTE:** The path cannot contain globs or regular expressions.
      */
    var public: js.UndefOr[String] = js.undefined
    
    /**
      * #### Forward paths to different paths or external URLs.
      *
      * In order to redirect visits to a certain path to a different one (or even
      * an external URL), you can use this option. By default, all of them are
      * performed with the status code `301`, but this behavior can be adjusted
      * by setting the `type` property directly on the object.
      *
      * **NOTE:** The paths can contain globs (matched using `minimatch`) or
      * regular expressions (match using `path-to-regexp`).
      */
    var redirects: js.UndefOr[js.Array[Redirect]] = js.undefined
    
    /**
      * #### If a directory only contains one file, render it.
      *
      * Sometimes you might want to have a directory path actually render a file,
      * if the directory only contains one. This is only useful for any files
      * that are not `.html` files (for those, `cleanUrls` is faster). This is
      * disabled by default and can be enabled by setting this option to `true`.
      * After that, if you access your directory `/test` (for example), you will
      * see an image being rendered if the directory contains a single image
      * file.
      */
    var renderSingle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * #### Rewrite paths to different paths.
      *
      * If you want your visitors to receive a response under a certain path, but
      * actually serve a completely different one behind the curtains, this
      * option is what you need.
      *
      * **NOTE:** The paths can contain globs (matched using `minimatch`) or
      * regular expressions (match using `path-to-regexp`).
      */
    var rewrites: js.UndefOr[js.Array[Rewrite]] = js.undefined
    
    /**
      * #### Resolve symlinks instead of rendering a 404 error.
      *
      * For security purposes, symlinks are disabled by default. If serve-handler
      * encounters a symlink, it will treat it as if it doesn't exist in the
      * first place. In turn, a 404 error is rendered for that path. However,
      * this behavior can easily be adjusted by setting this option to `true`.
      * Once this property is set, all symlinks will automatically be resolved to
      * their targets.
      */
    var symlinks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * #### Remove or add trailing slashes to all paths.
      *
      * By default, the package will try to make assumptions for when to add
      * trailing slashes to your URLs or not. If you want to remove them, set
      * this property to `false` and `true` if you want to force them on all
      * URLs.
      */
    var trailingSlash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * #### Exclude paths from the directory listing.
      *
      * In certain cases, you might not want a file or directory to appear in the
      * directory listing. In these situations, there are two ways of solving
      * this problem. Either you disable the directory listing entirely, or you
      * exclude certain paths from those listings by adding them all to this
      * config property.
      *
      * **NOTE:** The paths can only contain globs that are matched using `minimatch`.
      */
    var unlisted: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setCleanUrls(value: Boolean | js.Array[String]): Self = StObject.set(x, "cleanUrls", value.asInstanceOf[js.Any])
      
      inline def setCleanUrlsUndefined: Self = StObject.set(x, "cleanUrls", js.undefined)
      
      inline def setCleanUrlsVarargs(value: String*): Self = StObject.set(x, "cleanUrls", js.Array(value*))
      
      inline def setDirectoryListing(value: Boolean | js.Array[String]): Self = StObject.set(x, "directoryListing", value.asInstanceOf[js.Any])
      
      inline def setDirectoryListingUndefined: Self = StObject.set(x, "directoryListing", js.undefined)
      
      inline def setDirectoryListingVarargs(value: String*): Self = StObject.set(x, "directoryListing", js.Array(value*))
      
      inline def setEtag(value: Boolean): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      inline def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: Header*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      inline def setRedirects(value: js.Array[Redirect]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      inline def setRedirectsVarargs(value: Redirect*): Self = StObject.set(x, "redirects", js.Array(value*))
      
      inline def setRenderSingle(value: Boolean): Self = StObject.set(x, "renderSingle", value.asInstanceOf[js.Any])
      
      inline def setRenderSingleUndefined: Self = StObject.set(x, "renderSingle", js.undefined)
      
      inline def setRewrites(value: js.Array[Rewrite]): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
      
      inline def setRewritesUndefined: Self = StObject.set(x, "rewrites", js.undefined)
      
      inline def setRewritesVarargs(value: Rewrite*): Self = StObject.set(x, "rewrites", js.Array(value*))
      
      inline def setSymlinks(value: Boolean): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
      
      inline def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
      
      inline def setTrailingSlash(value: Boolean): Self = StObject.set(x, "trailingSlash", value.asInstanceOf[js.Any])
      
      inline def setTrailingSlashUndefined: Self = StObject.set(x, "trailingSlash", js.undefined)
      
      inline def setUnlisted(value: js.Array[String]): Self = StObject.set(x, "unlisted", value.asInstanceOf[js.Any])
      
      inline def setUnlistedUndefined: Self = StObject.set(x, "unlisted", js.undefined)
      
      inline def setUnlistedVarargs(value: String*): Self = StObject.set(x, "unlisted", js.Array(value*))
    }
  }
  
  trait Header extends StObject {
    
    var headers: js.Array[Key]
    
    var source: String
  }
  object Header {
    
    inline def apply(headers: js.Array[Key], source: String): Header = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: js.Array[Key]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: Key*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    var createReadStream: js.UndefOr[FnCall] = js.undefined
    
    var lstat: js.UndefOr[Typeoflstat] = js.undefined
    
    var readdir: js.UndefOr[Typeofreaddir] = js.undefined
    
    var realpath: js.UndefOr[Typeofrealpath] = js.undefined
    
    var sendError: js.UndefOr[SendErrorHandler] = js.undefined
  }
  object Methods {
    
    inline def apply(): Methods = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Methods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Methods] (val x: Self) extends AnyVal {
      
      inline def setCreateReadStream(value: FnCall): Self = StObject.set(x, "createReadStream", value.asInstanceOf[js.Any])
      
      inline def setCreateReadStreamUndefined: Self = StObject.set(x, "createReadStream", js.undefined)
      
      inline def setLstat(value: Typeoflstat): Self = StObject.set(x, "lstat", value.asInstanceOf[js.Any])
      
      inline def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      inline def setReaddir(value: Typeofreaddir): Self = StObject.set(x, "readdir", value.asInstanceOf[js.Any])
      
      inline def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      inline def setRealpath(value: Typeofrealpath): Self = StObject.set(x, "realpath", value.asInstanceOf[js.Any])
      
      inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
      
      inline def setSendError(
        value: (/* absolutePath */ js.UndefOr[String], /* response */ js.UndefOr[ServerResponse[IncomingMessage]], /* acceptsJSON */ js.UndefOr[Boolean], /* current */ js.UndefOr[String], /* handlers */ js.UndefOr[Methods], /* config */ js.UndefOr[Config], /* spec */ js.UndefOr[Any]) => js.Promise[Unit]
      ): Self = StObject.set(x, "sendError", js.Any.fromFunction7(value))
      
      inline def setSendErrorUndefined: Self = StObject.set(x, "sendError", js.undefined)
    }
  }
  
  trait Redirect
    extends StObject
       with Rewrite {
    
    var `type`: Double
  }
  object Redirect {
    
    inline def apply(destination: String, source: String, `type`: Double): Redirect = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Redirect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Redirect] (val x: Self) extends AnyVal {
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rewrite extends StObject {
    
    var destination: String
    
    var source: String
  }
  object Rewrite {
    
    inline def apply(destination: String, source: String): Rewrite = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rewrite]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rewrite] (val x: Self) extends AnyVal {
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type SendErrorHandler = js.Function7[
    /* absolutePath */ js.UndefOr[String], 
    /* response */ js.UndefOr[ServerResponse[IncomingMessage]], 
    /* acceptsJSON */ js.UndefOr[Boolean], 
    /* current */ js.UndefOr[String], 
    /* handlers */ js.UndefOr[Methods], 
    /* config */ js.UndefOr[Config], 
    /* spec */ js.UndefOr[Any], 
    js.Promise[Unit]
  ]
}
