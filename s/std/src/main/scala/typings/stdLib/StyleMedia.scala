package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleMedia extends js.Object {
  val `type`: java.lang.String
  def matchMedium(mediaquery: java.lang.String): scala.Boolean
}

@JSGlobal("StyleMedia")
@js.native
class StyleMediaCls () extends StyleMedia {
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override def matchMedium(mediaquery: java.lang.String): scala.Boolean = js.native
}

@JSGlobal("StyleMedia")
@js.native
object StyleMedia
  extends org.scalablytyped.runtime.Instantiable0[StyleMedia]

