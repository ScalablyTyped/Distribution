package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides contains information about a MIME type associated with a particular plugin. NavigatorPlugins.mimeTypes returns an array of this object. */
@js.native
trait MimeType extends StObject {
  
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
  implicit class MimeTypeMutableBuilder[Self <: MimeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: java.lang.String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledPlugin(value: Plugin): Self = StObject.set(x, "enabledPlugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixes(value: java.lang.String): Self = StObject.set(x, "suffixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
