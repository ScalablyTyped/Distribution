package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("URL")
@js.native
class URL protected ()
  extends StObject
     with typings.std.URL {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, base: java.lang.String) = this()
  def this(url: java.lang.String, base: typings.std.URL) = this()
  
  /* CompleteClass */
  var hash: java.lang.String = js.native
  
  /* CompleteClass */
  var host: java.lang.String = js.native
  
  /* CompleteClass */
  var hostname: java.lang.String = js.native
  
  /* CompleteClass */
  var href: java.lang.String = js.native
  
  /* CompleteClass */
  override val origin: java.lang.String = js.native
  
  /* CompleteClass */
  var password: java.lang.String = js.native
  
  /* CompleteClass */
  var pathname: java.lang.String = js.native
  
  /* CompleteClass */
  var port: java.lang.String = js.native
  
  /* CompleteClass */
  var protocol: java.lang.String = js.native
  
  /* CompleteClass */
  var search: java.lang.String = js.native
  
  /* CompleteClass */
  override val searchParams: typings.std.URLSearchParams = js.native
  
  /* CompleteClass */
  override def toJSON(): java.lang.String = js.native
  
  /* CompleteClass */
  var username: java.lang.String = js.native
}
object URL {
  
  @JSGlobal("URL")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createObjectURL(`object`: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(`object`.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  inline def revokeObjectURL(url: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeObjectURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
