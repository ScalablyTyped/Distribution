package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The MimeType interface provides contains information about a MIME type associated with a particular plugin. NavigatorPlugins.mimeTypes returns an array of this object. */
trait MimeType extends js.Object {
  val description: java.lang.String
  val enabledPlugin: Plugin
  val suffixes: java.lang.String
  val `type`: java.lang.String
}

@JSGlobal("MimeType")
@js.native
class MimeTypeCls () extends MimeType {
  /* CompleteClass */
  override val description: java.lang.String = js.native
  /* CompleteClass */
  override val enabledPlugin: Plugin = js.native
  /* CompleteClass */
  override val suffixes: java.lang.String = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
}

@JSGlobal("MimeType")
@js.native
object MimeType
  extends org.scalablytyped.runtime.Instantiable0[MimeType]

