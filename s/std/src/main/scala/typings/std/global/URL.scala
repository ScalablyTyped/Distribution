package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("URL")
@js.native
open class URL protected ()
  extends StObject
     with typings.std.URL {
  /* standard dom */
  def this(url: java.lang.String) = this()
  def this(url: typings.std.URL) = this()
  def this(url: java.lang.String, base: java.lang.String) = this()
  def this(url: java.lang.String, base: typings.std.URL) = this()
  def this(url: typings.std.URL, base: java.lang.String) = this()
  def this(url: typings.std.URL, base: typings.std.URL) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/hash) */
  /* standard dom */
  /* CompleteClass */
  var hash: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/host) */
  /* standard dom */
  /* CompleteClass */
  var host: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/hostname) */
  /* standard dom */
  /* CompleteClass */
  var hostname: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/href) */
  /* standard dom */
  /* CompleteClass */
  var href: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/origin) */
  /* standard dom */
  /* CompleteClass */
  override val origin: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/password) */
  /* standard dom */
  /* CompleteClass */
  var password: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/pathname) */
  /* standard dom */
  /* CompleteClass */
  var pathname: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/port) */
  /* standard dom */
  /* CompleteClass */
  var port: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/protocol) */
  /* standard dom */
  /* CompleteClass */
  var protocol: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/search) */
  /* standard dom */
  /* CompleteClass */
  var search: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/searchParams) */
  /* standard dom */
  /* CompleteClass */
  override val searchParams: typings.std.URLSearchParams = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/toJSON) */
  /* standard dom */
  /* CompleteClass */
  override def toJSON(): java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/username) */
  /* standard dom */
  /* CompleteClass */
  var username: java.lang.String = js.native
}
object URL {
  
  @JSGlobal("URL")
  @js.native
  val ^ : js.Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/createObjectURL) */
  /* standard dom */
  inline def createObjectURL(obj: typings.std.Blob): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def createObjectURL(obj: typings.std.MediaSource): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/revokeObjectURL) */
  /* standard dom */
  inline def revokeObjectURL(url: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeObjectURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
