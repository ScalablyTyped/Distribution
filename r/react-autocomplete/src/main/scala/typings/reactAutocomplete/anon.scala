package typings.reactAutocomplete

import typings.reactAutocomplete.reactAutocompleteStrings.backward
import typings.reactAutocomplete.reactAutocompleteStrings.forward
import typings.reactAutocomplete.reactAutocompleteStrings.none
import typings.std.FocusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(): Unit = js.native
    def apply(options: FocusOptions): Unit = js.native
  }
  
  @js.native
  trait FnCallStartEndDirection extends js.Object {
    
    def apply(start: Double, end: Double): Unit = js.native
    def apply(start: Double, end: Double, direction: backward): Unit = js.native
    def apply(start: Double, end: Double, direction: forward): Unit = js.native
    def apply(start: Double, end: Double, direction: none): Unit = js.native
  }
}
