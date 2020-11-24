package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("URL")
@js.native
class URL protected ()
  extends typings.std.URL {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, base: java.lang.String) = this()
  def this(url: java.lang.String, base: typings.std.URL) = this()
}
@JSGlobal("URL")
@js.native
object URL
  extends Instantiable1[/* url */ java.lang.String, typings.std.URL]
     with Instantiable2[
      /* url */ java.lang.String, 
      (/* base */ java.lang.String) | (/* base */ typings.std.URL), 
      typings.std.URL
    ] {
  
  def createObjectURL(`object`: js.Any): java.lang.String = js.native
  
  def revokeObjectURL(url: java.lang.String): Unit = js.native
}
