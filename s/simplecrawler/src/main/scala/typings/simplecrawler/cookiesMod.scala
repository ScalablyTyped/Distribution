package typings.simplecrawler

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cookiesMod {
  
  @JSImport("simplecrawler/cookies", JSImport.Default)
  @js.native
  open class default () extends CookieJar
  
  @JSImport("simplecrawler/cookies", "Cookie")
  @js.native
  open class Cookie protected () extends StObject {
    def this(name: String, value: String, expires: String) = this()
    def this(name: String, value: String, expires: Double) = this()
    def this(name: String, value: String, expires: String, path: String) = this()
    def this(name: String, value: String, expires: Double, path: String) = this()
    def this(name: String, value: String, expires: String, path: String, domain: String) = this()
    def this(name: String, value: String, expires: String, path: Unit, domain: String) = this()
    def this(name: String, value: String, expires: Double, path: String, domain: String) = this()
    def this(name: String, value: String, expires: Double, path: Unit, domain: String) = this()
    def this(name: String, value: String, expires: String, path: String, domain: String, httponly: Boolean) = this()
    def this(name: String, value: String, expires: String, path: String, domain: Unit, httponly: Boolean) = this()
    def this(name: String, value: String, expires: String, path: Unit, domain: String, httponly: Boolean) = this()
    def this(name: String, value: String, expires: String, path: Unit, domain: Unit, httponly: Boolean) = this()
    def this(name: String, value: String, expires: Double, path: String, domain: String, httponly: Boolean) = this()
    def this(name: String, value: String, expires: Double, path: String, domain: Unit, httponly: Boolean) = this()
    def this(name: String, value: String, expires: Double, path: Unit, domain: String, httponly: Boolean) = this()
    def this(name: String, value: String, expires: Double, path: Unit, domain: Unit, httponly: Boolean) = this()
    
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
  object Cookie {
    
    @JSImport("simplecrawler/cookies", "Cookie")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromString(content: String): Cookie = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(content.asInstanceOf[js.Any]).asInstanceOf[Cookie]
  }
  
  @js.native
  trait CookieJar extends EventEmitter {
    
    def add(name: String, value: String, expiry: String): this.type = js.native
    def add(name: String, value: String, expiry: String, path: String): this.type = js.native
    def add(name: String, value: String, expiry: String, path: String, domain: String): this.type = js.native
    def add(name: String, value: String, expiry: String, path: String, domain: String, httponly: Boolean): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: String,
      domain: String,
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: String,
      domain: String,
      httponly: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: String, path: String, domain: Unit, httponly: Boolean): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: String,
      domain: Unit,
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: String,
      domain: Unit,
      httponly: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: String, path: Unit, domain: String): this.type = js.native
    def add(name: String, value: String, expiry: String, path: Unit, domain: String, httponly: Boolean): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: Unit,
      domain: String,
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: Unit,
      domain: String,
      httponly: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: String, path: Unit, domain: Unit, httponly: Boolean): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: Unit,
      domain: Unit,
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: String,
      path: Unit,
      domain: Unit,
      httponly: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: Double): this.type = js.native
    def add(name: String, value: String, expiry: Double, path: String): this.type = js.native
    def add(name: String, value: String, expiry: Double, path: String, domain: String): this.type = js.native
    def add(name: String, value: String, expiry: Double, path: String, domain: String, httponly: Boolean): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: String,
      domain: String,
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: String,
      domain: String,
      httponly: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: Double, path: String, domain: Unit, httponly: Boolean): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: String,
      domain: Unit,
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: String,
      domain: Unit,
      httponly: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: Double, path: Unit, domain: String): this.type = js.native
    def add(name: String, value: String, expiry: Double, path: Unit, domain: String, httponly: Boolean): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: Unit,
      domain: String,
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: Unit,
      domain: String,
      httponly: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(name: String, value: String, expiry: Double, path: Unit, domain: Unit, httponly: Boolean): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: Unit,
      domain: Unit,
      httponly: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    def add(
      name: String,
      value: String,
      expiry: Double,
      path: Unit,
      domain: Unit,
      httponly: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookie */ js.UndefOr[Cookie], Unit]
    ): this.type = js.native
    
    def addFromHeaders(headers: String): this.type = js.native
    def addFromHeaders(headers: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): this.type = js.native
    def addFromHeaders(headers: js.Array[String]): this.type = js.native
    def addFromHeaders(headers: js.Array[String], callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): this.type = js.native
    
    var cookies: js.Array[Cookie] = js.native
    
    def get(): js.Array[Cookie] = js.native
    def get(name: String): js.Array[Cookie] = js.native
    def get(name: String, domain: String): js.Array[Cookie] = js.native
    def get(
      name: String,
      domain: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[Cookie] = js.native
    def get(
      name: String,
      domain: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[Cookie] = js.native
    def get(name: Unit, domain: String): js.Array[Cookie] = js.native
    def get(
      name: Unit,
      domain: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[Cookie] = js.native
    def get(
      name: Unit,
      domain: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[Cookie] = js.native
    
    def getAsHeader(): js.Array[String] = js.native
    def getAsHeader(name: String): js.Array[String] = js.native
    def getAsHeader(name: String, domain: String): js.Array[String] = js.native
    def getAsHeader(
      name: String,
      domain: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[String] = js.native
    def getAsHeader(
      name: String,
      domain: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[String] = js.native
    def getAsHeader(name: Unit, domain: String): js.Array[String] = js.native
    def getAsHeader(
      name: Unit,
      domain: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[String] = js.native
    def getAsHeader(
      name: Unit,
      domain: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
    ): js.Array[String] = js.native
    
    def remove(): js.Array[Cookie] = js.native
    def remove(name: String): js.Array[Cookie] = js.native
    def remove(name: String, domain: String): js.Array[Cookie] = js.native
    def remove(
      name: String,
      domain: String,
      callback: js.Function2[
          /* error */ js.UndefOr[js.Error], 
          /* cookiesRemoved */ js.UndefOr[js.Array[Cookie]], 
          Unit
        ]
    ): js.Array[Cookie] = js.native
    def remove(
      name: String,
      domain: Unit,
      callback: js.Function2[
          /* error */ js.UndefOr[js.Error], 
          /* cookiesRemoved */ js.UndefOr[js.Array[Cookie]], 
          Unit
        ]
    ): js.Array[Cookie] = js.native
    def remove(name: Unit, domain: String): js.Array[Cookie] = js.native
    def remove(
      name: Unit,
      domain: String,
      callback: js.Function2[
          /* error */ js.UndefOr[js.Error], 
          /* cookiesRemoved */ js.UndefOr[js.Array[Cookie]], 
          Unit
        ]
    ): js.Array[Cookie] = js.native
    def remove(
      name: Unit,
      domain: Unit,
      callback: js.Function2[
          /* error */ js.UndefOr[js.Error], 
          /* cookiesRemoved */ js.UndefOr[js.Array[Cookie]], 
          Unit
        ]
    ): js.Array[Cookie] = js.native
  }
}
