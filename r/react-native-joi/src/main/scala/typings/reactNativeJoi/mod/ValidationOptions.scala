package typings.reactNativeJoi.mod

import typings.reactNativeJoi.anon.Arrays
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationOptions extends StObject {
  
  /**
    * when true, stops validation on the first error, otherwise returns all the errors found. Defaults to true.
    */
  var abortEarly: js.UndefOr[Boolean] = js.native
  
  /**
    * when true, allows object to contain unknown keys which are ignored. Defaults to false.
    */
  var allowUnknown: js.UndefOr[Boolean] = js.native
  
  /**
    * provides an external data set to be used in references
    */
  var context: js.UndefOr[Context] = js.native
  
  /**
    * when true, attempts to cast values to the required types (e.g. a string to a number). Defaults to true.
    */
  var convert: js.UndefOr[Boolean] = js.native
  
  /**
    * overrides individual error messages. Defaults to no override ({}).
    */
  var language: js.UndefOr[LanguageRootOptions] = js.native
  
  /**
    * when true, do not apply default values. Defaults to false.
    */
  var noDefaults: js.UndefOr[Boolean] = js.native
  
  /**
    * sets the default presence requirements. Supported modes: 'optional', 'required', and 'forbidden'. Defaults to 'optional'.
    */
  var presence: js.UndefOr[
    typings.reactNativeJoi.reactNativeJoiStrings.optional | typings.reactNativeJoi.reactNativeJoiStrings.required | typings.reactNativeJoi.reactNativeJoiStrings.forbidden
  ] = js.native
  
  /**
    * when true, ignores unknown keys with a function value. Defaults to false.
    */
  var skipFunctions: js.UndefOr[Boolean] = js.native
  
  /**
    * remove unknown elements from objects and arrays. Defaults to false
    * - when true, all unknown elements will be removed
    * - when an object:
    *      - objects - set to true to remove unknown keys from objects
    */
  var stripUnknown: js.UndefOr[Boolean | Arrays] = js.native
}
object ValidationOptions {
  
  @scala.inline
  def apply(): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptions]
  }
  
  @scala.inline
  implicit class ValidationOptionsMutableBuilder[Self <: ValidationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortEarly(value: Boolean): Self = StObject.set(x, "abortEarly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortEarlyUndefined: Self = StObject.set(x, "abortEarly", js.undefined)
    
    @scala.inline
    def setAllowUnknown(value: Boolean): Self = StObject.set(x, "allowUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnknownUndefined: Self = StObject.set(x, "allowUnknown", js.undefined)
    
    @scala.inline
    def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    @scala.inline
    def setLanguage(value: LanguageRootOptions): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setNoDefaults(value: Boolean): Self = StObject.set(x, "noDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDefaultsUndefined: Self = StObject.set(x, "noDefaults", js.undefined)
    
    @scala.inline
    def setPresence(
      value: typings.reactNativeJoi.reactNativeJoiStrings.optional | typings.reactNativeJoi.reactNativeJoiStrings.required | typings.reactNativeJoi.reactNativeJoiStrings.forbidden
    ): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresenceUndefined: Self = StObject.set(x, "presence", js.undefined)
    
    @scala.inline
    def setSkipFunctions(value: Boolean): Self = StObject.set(x, "skipFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipFunctionsUndefined: Self = StObject.set(x, "skipFunctions", js.undefined)
    
    @scala.inline
    def setStripUnknown(value: Boolean | Arrays): Self = StObject.set(x, "stripUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknownUndefined: Self = StObject.set(x, "stripUnknown", js.undefined)
  }
}
