package typings.reactNativeJoi.mod

import typings.reactNativeJoi.anon.Arrays
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationOptions extends js.Object {
  
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
  implicit class ValidationOptionsOps[Self <: ValidationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbortEarly(value: Boolean): Self = this.set("abortEarly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortEarly: Self = this.set("abortEarly", js.undefined)
    
    @scala.inline
    def setAllowUnknown(value: Boolean): Self = this.set("allowUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnknown: Self = this.set("allowUnknown", js.undefined)
    
    @scala.inline
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setConvert(value: Boolean): Self = this.set("convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    
    @scala.inline
    def setLanguage(value: LanguageRootOptions): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setNoDefaults(value: Boolean): Self = this.set("noDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDefaults: Self = this.set("noDefaults", js.undefined)
    
    @scala.inline
    def setPresence(
      value: typings.reactNativeJoi.reactNativeJoiStrings.optional | typings.reactNativeJoi.reactNativeJoiStrings.required | typings.reactNativeJoi.reactNativeJoiStrings.forbidden
    ): Self = this.set("presence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresence: Self = this.set("presence", js.undefined)
    
    @scala.inline
    def setSkipFunctions(value: Boolean): Self = this.set("skipFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipFunctions: Self = this.set("skipFunctions", js.undefined)
    
    @scala.inline
    def setStripUnknown(value: Boolean | Arrays): Self = this.set("stripUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripUnknown: Self = this.set("stripUnknown", js.undefined)
  }
}
