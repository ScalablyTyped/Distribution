package typings.reactNativeSvg.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.reactNativeSvg.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("react-native-svg", "SvgWithCss")
@js.native
class SvgWithCss protected ()
  extends Component[XmlProps, XmlState, js.Any] {
  def this(props: XmlProps) = this()
  def this(props: XmlProps, context: js.Any) = this()
}
object SvgWithCss {
  
  inline def apply: ComponentClass[XmlProps, XmlState] = ^.asInstanceOf[js.Dynamic].selectDynamic("SvgWithCss").asInstanceOf[ComponentClass[XmlProps, XmlState]]
}
