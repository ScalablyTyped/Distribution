package typings.slateReact

import typings.slate.rangeMod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeListMod {
  
  @JSImport("slate-react/dist/utils/range-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDecoratorRangeListEqual(list: js.Array[Range], another: js.Array[Range]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDecoratorRangeListEqual")(list.asInstanceOf[js.Any], another.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shallowCompare(obj1: js.Object, obj2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompare")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
