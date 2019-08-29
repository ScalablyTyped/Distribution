package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides contains information about a MIME type associated with a particular plugin. NavigatorPlugins.mimeTypes returns an array of this object. */
trait MimeType extends js.Object {
  /**
    * Returns the MIME type's description.
    */
  val description: java.lang.String
  /**
    * Returns the Plugin object that implements this MIME type.
    */
  val enabledPlugin: Plugin
  /**
    * Returns the MIME type's typical file extensions, in a comma-separated list.
    */
  val suffixes: java.lang.String
  /**
    * Returns the MIME type.
    */
  val `type`: java.lang.String
}

@JSGlobal("MimeType")
@js.native
class MimeTypeCls () extends MimeType {
  /**
    * Returns the MIME type's description.
    */
  /* CompleteClass */
  override val description: java.lang.String = js.native
  /**
    * Returns the Plugin object that implements this MIME type.
    */
  /* CompleteClass */
  override val enabledPlugin: Plugin = js.native
  /**
    * Returns the MIME type's typical file extensions, in a comma-separated list.
    */
  /* CompleteClass */
  override val suffixes: java.lang.String = js.native
  /**
    * Returns the MIME type.
    */
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
}

@JSGlobal("MimeType")
@js.native
object MimeType extends Instantiable0[MimeType]

