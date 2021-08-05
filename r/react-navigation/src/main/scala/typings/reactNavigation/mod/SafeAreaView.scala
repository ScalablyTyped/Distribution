package typings.reactNavigation.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNavigation.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("react-navigation", "SafeAreaView")
@js.native
class SafeAreaView protected ()
  extends Component[SafeAreaViewProps, ComponentState, js.Any] {
  def this(props: SafeAreaViewProps) = this()
  def this(props: SafeAreaViewProps, context: js.Any) = this()
}
object SafeAreaView {
  
  inline def apply: ComponentClass[SafeAreaViewProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("SafeAreaView").asInstanceOf[ComponentClass[SafeAreaViewProps, ComponentState]]
}
