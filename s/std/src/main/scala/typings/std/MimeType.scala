package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides contains information about a MIME type associated with a particular plugin. NavigatorPlugins.mimeTypes returns an array of this object. */
@js.native
trait MimeType extends js.Object {
  /**
    * Returns the MIME type's description.
    */
  val description: java.lang.String = js.native
  /**
    * Returns the Plugin object that implements this MIME type.
    */
  val enabledPlugin: Plugin = js.native
  /**
    * Returns the MIME type's typical file extensions, in a comma-separated list.
    */
  val suffixes: java.lang.String = js.native
  /**
    * Returns the MIME type.
    */
  val `type`: java.lang.String = js.native
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
  @scala.inline
  implicit class MimeTypeOps[Self <: MimeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: java.lang.String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabledPlugin(value: Plugin): Self = this.set("enabledPlugin", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffixes(value: java.lang.String): Self = this.set("suffixes", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

