package typings.rcPicker

import org.scalablytyped.runtime.StringDictionary
import typings.rcPicker.anon.CellPrefixCls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseCellClassNameMod {
  
  @JSImport("rc-picker/es/hooks/useCellClassName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](param0: CellPrefixCls[DateType]): js.Function1[/* currentDate */ DateType, StringDictionary[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* currentDate */ DateType, StringDictionary[Boolean]]]
}
