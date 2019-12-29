package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webkitURL")
@js.native
object webkitURL
  extends Instantiable1[/* url */ java.lang.String, URL]
     with Instantiable2[/* url */ java.lang.String, (/* base */ java.lang.String) | (/* base */ URL), URL] {
  def createObjectURL(`object`: js.Any): java.lang.String = js.native
  def revokeObjectURL(url: java.lang.String): Unit = js.native
}

