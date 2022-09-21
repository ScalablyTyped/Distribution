package typings.rcTreeSelect

import typings.rcTreeSelect.treeSelectMod.LabeledValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCacheMod {
  
  @JSImport("rc-tree-select/es/hooks/useCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This function will try to call requestIdleCallback if available to save performance.
    * No need `getLabel` here since already fetch on `rawLabeledValue`.
    */
  inline def default(values: js.Array[LabeledValueType]): js.Array[js.Array[LabeledValueType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(values.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[LabeledValueType]]]
}
