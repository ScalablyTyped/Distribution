package typings.std

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

object MimeType {
  @scala.inline
  def apply(
    description: java.lang.String,
    enabledPlugin: Plugin,
    suffixes: java.lang.String,
    `type`: java.lang.String
  ): MimeType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabledPlugin = enabledPlugin.asInstanceOf[js.Any], suffixes = suffixes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeType]
  }
}

