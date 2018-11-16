package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Url
  extends ScalablyTyped.runtime.Instantiable1[/* url */ java.lang.String, URL]
     with ScalablyTyped.runtime.Instantiable2[/* url */ java.lang.String, (/* base */ java.lang.String) | (/* base */ URL), URL] {
  def createObjectURL(`object`: js.Any): java.lang.String = js.native
  def revokeObjectURL(url: java.lang.String): scala.Unit = js.native
}

