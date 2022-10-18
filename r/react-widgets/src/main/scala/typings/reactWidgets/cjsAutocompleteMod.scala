package typings.reactWidgets

import typings.react.mod.global.JSX.Element
import typings.reactWidgets.cjsComboboxMod.ComboboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsAutocompleteMod {
  
  @JSImport("react-widgets/cjs/Autocomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDataItem](props: ComboboxProps[TDataItem]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
