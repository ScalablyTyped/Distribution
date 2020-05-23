package typings.rcPicker

import org.scalablytyped.runtime.StringDictionary
import typings.rcPicker.anon.CellPrefixCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib/hooks/useCellClassName", JSImport.Namespace)
@js.native
object useCellClassNameMod extends js.Object {
  def default[DateType](
    hasCellPrefixClsGenerateConfigRangedValueHoverRangedValueIsInViewIsSameCellOffsetCellTodayValue: CellPrefixCls[DateType]
  ): js.Function1[/* currentDate */ DateType, StringDictionary[Boolean]] = js.native
}

