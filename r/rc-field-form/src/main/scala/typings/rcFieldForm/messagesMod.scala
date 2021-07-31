package typings.rcFieldForm

import typings.rcFieldForm.anon.Boolean
import typings.rcFieldForm.anon.Invalid
import typings.rcFieldForm.anon.Max
import typings.rcFieldForm.anon.MismatchString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMod {
  
  object defaultValidateMessages {
    
    @JSImport("rc-field-form/es/utils/messages", "defaultValidateMessages")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-field-form/es/utils/messages", "defaultValidateMessages.default")
    @js.native
    def default: String = js.native
    
    @JSImport("rc-field-form/es/utils/messages", "defaultValidateMessages.array")
    @js.native
    def array: Max = js.native
    @scala.inline
    def array_=(x: Max): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("array")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-field-form/es/utils/messages", "defaultValidateMessages.date")
    @js.native
    def date: Invalid = js.native
    @scala.inline
    def date_=(x: Invalid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def default_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-field-form/es/utils/messages", "defaultValidateMessages.enum")
    @js.native
    val `enum`: String = js.native
    
    @JSImport("rc-field-form/es/utils/messages", "defaultValidateMessages.number")
    @js.native
    def number: Max = js.native
    @scala.inline
    def number_=(x: Max): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-field-form/es/utils/messages", "defaultValidateMessages.pattern")
    @js.native
    def pattern: MismatchString = js.native
    @scala.inline
    def pattern_=(x: MismatchString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pattern")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-field-form/es/utils/messages", "defaultValidateMessages.required")
    @js.native
    def required: String = js.native
    @scala.inline
    def required_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-field-form/es/utils/messages", "defaultValidateMessages.string")
    @js.native
    def string: Max = js.native
    @scala.inline
    def string_=(x: Max): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-field-form/es/utils/messages", "defaultValidateMessages.types")
    @js.native
    def types: Boolean = js.native
    @scala.inline
    def types_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-field-form/es/utils/messages", "defaultValidateMessages.whitespace")
    @js.native
    def whitespace: String = js.native
    @scala.inline
    def whitespace_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("whitespace")(x.asInstanceOf[js.Any])
  }
}
