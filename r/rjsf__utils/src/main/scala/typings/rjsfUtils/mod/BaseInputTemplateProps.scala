package typings.rjsfUtils.mod

import typings.react.mod.ChangeEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to the BaseInputTemplate */
@js.native
trait BaseInputTemplateProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */]
  extends StObject
     with WidgetProps[T, S, F] {
  
  /** A `BaseInputTemplate` implements a default `onChange` handler that it passes to the HTML input component to handle
    * the `ChangeEvent`. Sometimes a widget may need to handle the `ChangeEvent` using custom logic. If that is the case,
    * that widget should provide its own handler via this prop.
    */
  var onChangeOverride: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]] = js.native
}
