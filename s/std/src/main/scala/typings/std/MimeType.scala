package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides contains information about a MIME type associated with a particular plugin. NavigatorPlugins.mimeTypes returns an array of this object.
  * @deprecated
  */
trait MimeType extends StObject {
  
  /**
    * Returns the MIME type's description.
    * @deprecated
    */
  /* standard dom */
  val description: java.lang.String
  
  /**
    * Returns the Plugin object that implements this MIME type.
    * @deprecated
    */
  /* standard dom */
  val enabledPlugin: Plugin
  
  /**
    * Returns the MIME type's typical file extensions, in a comma-separated list.
    * @deprecated
    */
  /* standard dom */
  val suffixes: java.lang.String
  
  /**
    * Returns the MIME type.
    * @deprecated
    */
  /* standard dom */
  val `type`: java.lang.String
}
object MimeType {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: MimeType] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: java.lang.String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEnabledPlugin(value: Plugin): Self = StObject.set(x, "enabledPlugin", value.asInstanceOf[js.Any])
    
    inline def setSuffixes(value: java.lang.String): Self = StObject.set(x, "suffixes", value.asInstanceOf[js.Any])
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
