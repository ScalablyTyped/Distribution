package typings.reactAutocomplete

import typings.reactAutocomplete.reactAutocompleteStrings.backward
import typings.reactAutocomplete.reactAutocompleteStrings.forward
import typings.reactAutocomplete.reactAutocompleteStrings.none
import typings.std.FocusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): Unit = js.native
    def apply(options: FocusOptions): Unit = js.native
  }
  
  @js.native
  trait FnCallStartEndDirection extends StObject {
    
    def apply(start: Double, end: Double): Unit = js.native
    def apply(start: Double, end: Double, direction: backward): Unit = js.native
    def apply(start: Double, end: Double, direction: forward): Unit = js.native
    def apply(start: Double, end: Double, direction: none): Unit = js.native
  }
}
