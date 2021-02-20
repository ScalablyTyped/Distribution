package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("webkitURL")
@js.native
class webkitURL protected ()
  extends typings.std.URL {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, base: java.lang.String) = this()
  def this(url: java.lang.String, base: typings.std.URL) = this()
}
/* was `typeof URL` */
object webkitURL {
  
  @JSGlobal("webkitURL.createObjectURL")
  @js.native
  def createObjectURL(`object`: js.Any): java.lang.String = js.native
  
  @JSGlobal("webkitURL.revokeObjectURL")
  @js.native
  def revokeObjectURL(url: java.lang.String): Unit = js.native
}
