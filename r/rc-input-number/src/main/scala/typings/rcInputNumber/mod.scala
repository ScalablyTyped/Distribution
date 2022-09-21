package typings.rcInputNumber

import org.scalablytyped.runtime.Shortcut
import typings.rcInputNumber.anon.Children
import typings.rcInputNumber.anon.DisplayName
import typings.rcInputNumber.inputNumberMod.InputNumberProps
import typings.rcInputNumber.miniDecimalMod.ValueType
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-input-number", JSImport.Default)
  @js.native
  val default: (js.Function1[/* props */ Children & InputNumberProps[ValueType], ReactElement]) & DisplayName = js.native
  
  type _To = (js.Function1[/* props */ Children & InputNumberProps[ValueType], ReactElement]) & DisplayName
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (js.Function1[/* props */ Children & InputNumberProps[ValueType], ReactElement]) & DisplayName = default
}
