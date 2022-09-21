package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("webkitURL")
@js.native
open class webkitURL protected ()
  extends StObject
     with typings.std.URL {
  /* standard dom */
  def this(url: java.lang.String) = this()
  def this(url: typings.std.URL) = this()
  def this(url: java.lang.String, base: java.lang.String) = this()
  def this(url: java.lang.String, base: typings.std.URL) = this()
  def this(url: typings.std.URL, base: java.lang.String) = this()
  def this(url: typings.std.URL, base: typings.std.URL) = this()
  
  /* standard dom */
  /* CompleteClass */
  var hash: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var host: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var hostname: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var href: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val origin: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var password: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var pathname: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var port: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var protocol: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var search: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val searchParams: typings.std.URLSearchParams = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def toJSON(): java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var username: java.lang.String = js.native
}
/* was `typeof URL` */
object webkitURL {
  
  @JSGlobal("webkitURL")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  inline def createObjectURL(obj: typings.std.Blob): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def createObjectURL(obj: typings.std.MediaSource): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /* standard dom */
  inline def revokeObjectURL(url: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeObjectURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
