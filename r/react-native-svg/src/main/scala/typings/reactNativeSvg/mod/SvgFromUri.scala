package typings.reactNativeSvg.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.reactNativeSvg.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("react-native-svg", "SvgFromUri")
@js.native
class SvgFromUri protected ()
  extends Component[UriProps, UriState, js.Any] {
  def this(props: UriProps) = this()
  def this(props: UriProps, context: js.Any) = this()
}
object SvgFromUri {
  
  @scala.inline
  def apply: ComponentClass[UriProps, UriState] = ^.asInstanceOf[js.Dynamic].selectDynamic("SvgFromUri").asInstanceOf[ComponentClass[UriProps, UriState]]
}
