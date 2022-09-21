package typings.reactBootstrapTypeahead.mod

import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap-typeahead", "Typeahead")
@js.native
open class Typeahead[T /* <: TypeaheadModel */] protected ()
  extends Component[TypeaheadProps[T], js.Object, Any] {
  def this(props: TypeaheadProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TypeaheadProps[T], context: Any) = this()
  
  def blur(): Unit = js.native
  
  def clear(): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getInput(): HTMLInputElement = js.native
  
  def hideMenu(): Unit = js.native
  
  def toggleMenu(): Unit = js.native
}
