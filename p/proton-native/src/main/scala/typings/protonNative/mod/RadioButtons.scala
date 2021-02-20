package typings.protonNative.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proton-native", "RadioButtons")
@js.native
class RadioButtons protected ()
  extends Component[RadioButtonsProps, js.Object, js.Any] {
  def this(props: RadioButtonsProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: RadioButtonsProps, context: js.Any) = this()
}
/* static members */
object RadioButtons {
  
  @JSImport("proton-native", "RadioButtons")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("proton-native", "RadioButtons.Item")
  @js.native
  def Item: Instantiable0[RadioButtonsItem] = js.native
  @scala.inline
  def Item_=(x: Instantiable0[RadioButtonsItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
