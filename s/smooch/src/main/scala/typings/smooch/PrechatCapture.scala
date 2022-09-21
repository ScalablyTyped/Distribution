package typings.smooch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrechatCapture extends StObject {
  
  /**
    * Sets the URL of the avatar to use for the automatic reply to the prechat capture messages.
    */
  var avatarUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Automatically links the user's email to the app's Mailgun integration if it exists. If the property fields is defined, the first field of type email will be used.
    * @default true
    */
  var enableEmailLinking: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables the prechat capture experience.
    * @default false
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Overrides the default Prechat Capture fields to define a custom form.
    */
  var fields: js.UndefOr[js.Array[PrechatCaptureField]] = js.undefined
}
object PrechatCapture {
  
  inline def apply(): PrechatCapture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrechatCapture]
  }
  
  extension [Self <: PrechatCapture](x: Self) {
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
    
    inline def setEnableEmailLinking(value: Boolean): Self = StObject.set(x, "enableEmailLinking", value.asInstanceOf[js.Any])
    
    inline def setEnableEmailLinkingUndefined: Self = StObject.set(x, "enableEmailLinking", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFields(value: js.Array[PrechatCaptureField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: PrechatCaptureField*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
