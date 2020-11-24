package typings.simplecrawler

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("simplecrawler/cookies", JSImport.Namespace)
@js.native
object cookiesMod extends js.Object {
  
  @js.native
  class Cookie protected () extends js.Object {
    def this(name: String, value: String, expires: String) = this()
    def this(name: String, value: String, expires: Double) = this()
    def this(name: String, value: String, expires: String, path: String) = this()
    def this(name: String, value: String, expires: Double, path: String) = this()
    def this(name: String, value: String, expires: String, path: js.UndefOr[scala.Nothing], domain: String) = this()
    def this(name: String, value: String, expires: String, path: String, domain: String) = this()
    def this(name: String, value: String, expires: Double, path: js.UndefOr[scala.Nothing], domain: String) = this()
    def this(name: String, value: String, expires: Double, path: String, domain: String) = this()
    def this(
      name: String,
      value: String,
      expires: String,
      path: js.UndefOr[scala.Nothing],
      domain: js.UndefOr[scala.Nothing],
      httponly: Boolean
    ) = this()
    def this(
      name: String,
      value: String,
      expires: String,
      path: js.UndefOr[scala.Nothing],
      domain: String,
      httponly: Boolean
    ) = this()
    def this(
      name: String,
      value: String,
      expires: String,
      path: String,
      domain: js.UndefOr[scala.Nothing],
      httponly: Boolean
    ) = this()
    def this(name: String, value: String, expires: String, path: String, domain: String, httponly: Boolean) = this()
    def this(
      name: String,
      value: String,
      expires: Double,
      path: js.UndefOr[scala.Nothing],
      domain: js.UndefOr[scala.Nothing],
      httponly: Boolean
    ) = this()
    def this(
      name: String,
      value: String,
      expires: Double,
      path: js.UndefOr[scala.Nothing],
      domain: String,
      httponly: Boolean
    ) = this()
    def this(
      name: String,
      value: String,
      expires: Double,
      path: String,
      domain: js.UndefOr[scala.Nothing],
      httponly: Boolean
    ) = this()
    def this(name: String, value: String, expires: Double, path: String, domain: String, httponly: Boolean) = this()
    
    var domain: js.UndefOr[String] = js.native
    
    var expires: String | Double = js.native
    
    var httponly: js.UndefOr[Boolean] = js.native
    
    def isExpired(): Boolean = js.native
    
    def matchDomain(domain: String): Boolean = js.native
    
    def matchPath(path: String): Boolean = js.native
    
    var name: String = js.native
    
    var path: js.UndefOr[String] = js.native
    
    def toOutboundString(): String = js.native
    
    def toString(includeHeader: Boolean): String = js.native
    
    var value: String = js.native
  }
  /* static members */
  @js.native
  object Cookie extends js.Object {
    
    def fromString(content: String): Cookie = js.native
  }
  
  @js.native
  trait CookieJar extends EventEmitter {
    
    def add(name: String, value: String, expiry: String): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: js.UndefOr[scala.Nothing],
      domain: js.UndefOr[scala.Nothing],
      httponly: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: js.UndefOr[scala.Nothing],
      domain: js.UndefOr[scala.Nothing],
      httponly: Boolean
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: js.UndefOr[scala.Nothing],
      domain: js.UndefOr[scala.Nothing],
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: String, path: js.UndefOr[scala.Nothing], domain: String): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: js.UndefOr[scala.Nothing],
      domain: String,
      httponly: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: js.UndefOr[scala.Nothing],
      domain: String,
      httponly: Boolean
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: js.UndefOr[scala.Nothing],
      domain: String,
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: String, path: String): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: String,
      domain: js.UndefOr[scala.Nothing],
      httponly: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: String,
      domain: js.UndefOr[scala.Nothing],
      httponly: Boolean
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: String,
      domain: js.UndefOr[scala.Nothing],
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: String, path: String, domain: String): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: String,
      domain: String,
      httponly: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: String, path: String, domain: String, httponly: Boolean): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: String,
      domain: String,
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: Double): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: js.UndefOr[scala.Nothing],
      domain: js.UndefOr[scala.Nothing],
      httponly: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: js.UndefOr[scala.Nothing],
      domain: js.UndefOr[scala.Nothing],
      httponly: Boolean
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: js.UndefOr[scala.Nothing],
      domain: js.UndefOr[scala.Nothing],
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: Double, path: js.UndefOr[scala.Nothing], domain: String): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: js.UndefOr[scala.Nothing],
      domain: String,
      httponly: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: js.UndefOr[scala.Nothing],
      domain: String,
      httponly: Boolean
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: js.UndefOr[scala.Nothing],
      domain: String,
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: Double, path: String): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: String,
      domain: js.UndefOr[scala.Nothing],
      httponly: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: String,
      domain: js.UndefOr[scala.Nothing],
      httponly: Boolean
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: String,
      domain: js.UndefOr[scala.Nothing],
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: Double, path: String, domain: String): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: String,
      domain: String,
      httponly: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: Double, path: String, domain: String, httponly: Boolean): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: String,
      domain: String,
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    
    def addFromHeaders(headers: String): this.type = js.native
    def addFromHeaders(headers: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): this.type = js.native
    def addFromHeaders(headers: js.Array[String]): this.type = js.native
    def addFromHeaders(headers: js.Array[String], callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): this.type = js.native
    
    var cookies: js.Array[Cookie] = js.native
    
    def get(): js.Array[Cookie] = js.native
    def get(
      name: js.UndefOr[scala.Nothing],
      domain: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[Cookie] = js.native
    def get(name: js.UndefOr[scala.Nothing], domain: String): js.Array[Cookie] = js.native
    def get(
      name: js.UndefOr[scala.Nothing],
      domain: String,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[Cookie] = js.native
    def get(name: String): js.Array[Cookie] = js.native
    def get(
      name: String,
      domain: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[Cookie] = js.native
    def get(name: String, domain: String): js.Array[Cookie] = js.native
    def get(
      name: String,
      domain: String,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[Cookie] = js.native
    
    def getAsHeader(): js.Array[String] = js.native
    def getAsHeader(
      name: js.UndefOr[scala.Nothing],
      domain: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[String] = js.native
    def getAsHeader(name: js.UndefOr[scala.Nothing], domain: String): js.Array[String] = js.native
    def getAsHeader(
      name: js.UndefOr[scala.Nothing],
      domain: String,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[String] = js.native
    def getAsHeader(name: String): js.Array[String] = js.native
    def getAsHeader(
      name: String,
      domain: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[String] = js.native
    def getAsHeader(name: String, domain: String): js.Array[String] = js.native
    def getAsHeader(
      name: String,
      domain: String,
      callback: js.Function2[/* error */ js.UndefOr[Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[String] = js.native
    
    def remove(): js.Array[Cookie] = js.native
    def remove(
      name: js.UndefOr[scala.Nothing],
      domain: js.UndefOr[scala.Nothing],
      callback: js.Function2[
          /* error */ js.UndefOr[Error], 
          /* cookiesRemoved */ js.UndefOr[js.Array[Cookie]], 
          Unit
        ]
    ): js.Array[Cookie] = js.native
    def remove(name: js.UndefOr[scala.Nothing], domain: String): js.Array[Cookie] = js.native
    def remove(
      name: js.UndefOr[scala.Nothing],
      domain: String,
      callback: js.Function2[
          /* error */ js.UndefOr[Error], 
          /* cookiesRemoved */ js.UndefOr[js.Array[Cookie]], 
          Unit
        ]
    ): js.Array[Cookie] = js.native
    def remove(name: String): js.Array[Cookie] = js.native
    def remove(
      name: String,
      domain: js.UndefOr[scala.Nothing],
      callback: js.Function2[
          /* error */ js.UndefOr[Error], 
          /* cookiesRemoved */ js.UndefOr[js.Array[Cookie]], 
          Unit
        ]
    ): js.Array[Cookie] = js.native
    def remove(name: String, domain: String): js.Array[Cookie] = js.native
    def remove(
      name: String,
      domain: String,
      callback: js.Function2[
          /* error */ js.UndefOr[Error], 
          /* cookiesRemoved */ js.UndefOr[js.Array[Cookie]], 
          Unit
        ]
    ): js.Array[Cookie] = js.native
  }
  
  @js.native
  class default () extends CookieJar
}
