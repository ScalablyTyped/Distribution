package typings.rcPicker

import typings.rcPicker.useValueTextsMod.ValueTextConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useHoverValueMod {
  
  @JSImport("rc-picker/es/hooks/useHoverValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](valueText: String, hasFormatListGenerateConfigLocale: ValueTextConfig[DateType]): js.Tuple3[
    String, 
    js.Function1[/* date */ DateType, Unit], 
    js.Function1[/* immediately */ js.UndefOr[Boolean], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(valueText.asInstanceOf[js.Any], hasFormatListGenerateConfigLocale.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    String, 
    js.Function1[/* date */ DateType, Unit], 
    js.Function1[/* immediately */ js.UndefOr[Boolean], Unit]
  ]]
}
