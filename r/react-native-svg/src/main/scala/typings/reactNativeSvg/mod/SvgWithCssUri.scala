package typings.reactNativeSvg.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.reactNativeSvg.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("react-native-svg", "SvgWithCssUri")
@js.native
class SvgWithCssUri protected ()
  extends Component[UriProps, UriState, js.Any] {
  def this(props: UriProps) = this()
  def this(props: UriProps, context: js.Any) = this()
}
object SvgWithCssUri {
  
  inline def apply: ComponentClass[UriProps, UriState] = ^.asInstanceOf[js.Dynamic].selectDynamic("SvgWithCssUri").asInstanceOf[ComponentClass[UriProps, UriState]]
}
