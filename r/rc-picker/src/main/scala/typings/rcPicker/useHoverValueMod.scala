package typings.rcPicker

import typings.rcPicker.useValueTextsMod.ValueTextConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-picker/es/hooks/useHoverValue", JSImport.Namespace)
@js.native
object useHoverValueMod extends js.Object {
  
  def default[DateType](valueText: String, hasFormatListGenerateConfigLocale: ValueTextConfig[DateType]): js.Tuple3[
    String, 
    js.Function1[/* date */ DateType, Unit], 
    js.Function1[/* immediately */ js.UndefOr[Boolean], Unit]
  ] = js.native
}
