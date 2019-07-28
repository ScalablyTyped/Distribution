package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Base
  extends Instantiable2[/* url */ java.lang.String, (/* base */ java.lang.String) | (/* base */ URL), URL]
     with Instantiable1[/* url */ java.lang.String, URL] {
  def createObjectURL(`object`: js.Any): java.lang.String = js.native
  def revokeObjectURL(url: java.lang.String): Unit = js.native
}

