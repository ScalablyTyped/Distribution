package typings.rcPicker

import org.scalablytyped.runtime.StringDictionary
import typings.rcPicker.anon.CellPrefixCls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCellClassNameMod {
  
  @JSImport("rc-picker/es/hooks/useCellClassName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](
    hasCellPrefixClsGenerateConfigRangedValueHoverRangedValueIsInViewIsSameCellOffsetCellTodayValue: CellPrefixCls[DateType]
  ): js.Function1[/* currentDate */ DateType, StringDictionary[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasCellPrefixClsGenerateConfigRangedValueHoverRangedValueIsInViewIsSameCellOffsetCellTodayValue.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* currentDate */ DateType, StringDictionary[Boolean]]]
}
