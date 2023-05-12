package typings.reddit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Simple Reddit API client - Powered by the official Reddit API
    *
    * @see https://github.com/feross/reddit
    * @see https://github.com/reddit-archive/reddit/wiki/API
    * @see https://www.reddit.com/dev/api
    */
  @JSImport("reddit", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Reddit {
    /**
      * Create a new Reddit API client.
      *
      * @param opts Credentials required for Reddit's API. Accepts the following properties:
      *
      * Required:
      * - `username` Username of the reddit user.
      * - `password` Password of the reddit user.
      * - `appId` Client ID of the application.
      * - `appSecret` Client Secret of the application.
      *
      * Optional:
      * - `userAgent` Used as the `User-Agent` header in http requests.
      *
      * @see https://github.com/reddit-archive/reddit/wiki/OAuth2 for more infromation on OAuth2.
      *
      * @example
      * import Reddit from 'reddit';
      *
      * const credentials: Reddit.Credentials = {
      *  username: "username",
      *  password: "password",
      *  appId: "appId",
      *  appSecret: "appSecret"
      * };
      *
      * const reddit = new Reddit(credentials);
      */
    def this(opts: Credentials) = this()
  }
  
  /**
    * Credentials to be passed to `Reddit`
    *
    * Required:
    * - `username` Username of the reddit user.
    * - `password` Password of the reddit user.
    * - `appId` Client ID of the application.
    * - `appSecret` Client Secret of the application.
    *
    * Optional:
    * - `userAgent` Used as the `User-Agent` header in http requests.
    *
    * @see https://www.reddit.com/prefs/apps for the client ID and secret.
    *
    * @example
    * import Reddit from 'reddit';
    *
    * const credentials: Reddit.Credentials = {
    *  username: "username",
    *  password: "password",
    *  appId: "appId",
    *  appSecret: "appSecret"
    * };
    */
  trait Credentials extends StObject {
    
    var appId: String
    
    var appSecret: String
    
    var password: String
    
    var userAgent: js.UndefOr[String] = js.undefined
    
    var username: String
  }
  object Credentials {
    
    inline def apply(appId: String, appSecret: String, password: String, username: String): Credentials = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appSecret = appSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppSecret(value: String): Self = StObject.set(x, "appSecret", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Simple Reddit API client - Powered by the official Reddit API
    *
    * @see https://github.com/feross/reddit
    * @see https://github.com/reddit-archive/reddit/wiki/API
    * @see https://www.reddit.com/dev/api
    */
  @js.native
  trait Reddit extends StObject {
    
    /**
      * Invoke the Reddit API using the DELETE HTTP method.
      *
      * @param url URL path of the API to invoke. For example, `/api/submit` or `/api/vote`.
      * @param data Optional. Data to provide to the selected API. Defaults to `{}`.
      *
      * @note
      * - `<T>` is the API response type. Defaults to `unknown`.
      * - `<D>` is the`data` type. Defaults to `Record<string, never>`.
      *
      * @see https://www.reddit.com/dev/api/ for a complete list of Reddit APIs and their parameters.
      *
      * @example
      * import Reddit from 'reddit';
      *
      * const reddit = new Reddit({...credentials});
      * const params: ParamType = {...data};
      *
      * await reddit.delete<void,ParamType>("/api/mod/notes", params);
      */
    def delete[T, D](url: String): js.Promise[T] = js.native
    def delete[T, D](url: String, data: D): js.Promise[T] = js.native
    
    /**
      * Invoke the Reddit API using the GET HTTP method.
      *
      * @param url URL path of the API to invoke. For example, `/api/submit` or `/api/vote`.
      * @param data Optional. Data to provide to the selected API. Defaults to `{}`.
      *
      * @note
      * - `<T>` is the API response type. Defaults to `unknown`.
      * - `<D>` is the`data` type. Defaults to `Record<string, never>`.
      *
      * @see https://www.reddit.com/dev/api/ for a complete list of Reddit APIs and their parameters
      *
      * @example
      * import Reddit from 'reddit';
      *
      * const reddit = new Reddit({...credentials});
      *
      * interface AboutResponse {
      *  type: string;
      * }
      *
      * const type = (await reddit.get<AboutResponse>("/r/typescript/about.json")).type;
      */
    def get[T, D](url: String): js.Promise[T] = js.native
    def get[T, D](url: String, data: D): js.Promise[T] = js.native
    
    /**
      * Invoke the Reddit API using the PATCH HTTP method.
      *
      * @param url URL path of the API to invoke. For example, `/api/submit` or `/api/vote`.
      * @param data Optional. Data to provide to the selected API. Defaults to `{}`.
      *
      * @note
      * - `<T>` is the API response type. Defaults to `unknown`.
      * - `<D>` is the`data` type. Defaults to `Record<string, never>`.
      *
      * @see https://www.reddit.com/dev/api/ for a complete list of Reddit APIs and their parameters
      *
      * @example
      * import Reddit from 'reddit';
      *
      * const reddit = new Reddit({...credentials});
      * const params: ParamType = {...data};
      *
      * await reddit.patch<void,ParamType>("/api/v1/me/prefs", params);
      */
    def patch[T, D](url: String): js.Promise[T] = js.native
    def patch[T, D](url: String, data: D): js.Promise[T] = js.native
    
    /**
      * Invoke the Reddit API using the POST HTTP method.
      *
      * @param url URL path of the API to invoke. For example, `/api/submit` or `/api/vote`.
      * @param data Optional. Data to provide to the selected API. Defaults to `{}`.
      *
      * @note
      * - `<T>` is the API response type. Defaults to `unknown`.
      * - `<D>` is the`data` type. Defaults to `Record<string, never>`.
      *
      * @see https://www.reddit.com/dev/api/ for a complete list of Reddit APIs and their parameters
      *
      * @example
      * import Reddit from 'reddit';
      *
      * const reddit = new Reddit({...credentials});
      * const params: ParamType = {...data};
      *
      * await reddit.post<void,ParamType>("/api/save", params);
      */
    def post[T, D](url: String): js.Promise[T] = js.native
    def post[T, D](url: String, data: D): js.Promise[T] = js.native
    
    /**
      * Invoke the Reddit API using the PUT HTTP method.
      *
      * @param url URL path of the API to invoke. For example, `/api/submit` or `/api/vote`.
      * @param data Optional. Data to provide to the selected API. Defaults to `{}`.
      *
      * @note
      * - `<T>` is the API response type. Defaults to `unknown`.
      * - `<D>` is the`data` type. Defaults to `Record<string, never>`.
      *
      * @see https://www.reddit.com/dev/api/ for a complete list of Reddit APIs and their parameters.
      *
      * @example
      * import Reddit from 'reddit';
      *
      * const reddit = new Reddit({...credentials});
      * const params: ParamType = {...data};
      *
      * await reddit.put<void,ParamType>("/api/v1/me/friends/username", params);
      */
    def put[T, D](url: String): js.Promise[T] = js.native
    def put[T, D](url: String, data: D): js.Promise[T] = js.native
  }
}
