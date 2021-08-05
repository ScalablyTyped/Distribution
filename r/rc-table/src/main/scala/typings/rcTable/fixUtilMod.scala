package typings.rcTable

import typings.rcTable.anon.Fixed
import typings.rcTable.interfaceMod.StickyOffsets
import typings.rcTable.rcTableBooleans.`false`
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixUtilMod {
  
  @JSImport("rc-table/lib/utils/fixUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCellFixedInfo_ltr(
    colStart: Double,
    colEnd: Double,
    columns: js.Array[Fixed],
    stickyOffsets: StickyOffsets,
    direction: ltr
  ): FixedInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellFixedInfo")(colStart.asInstanceOf[js.Any], colEnd.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], stickyOffsets.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[FixedInfo]
  
  inline def getCellFixedInfo_rtl(
    colStart: Double,
    colEnd: Double,
    columns: js.Array[Fixed],
    stickyOffsets: StickyOffsets,
    direction: rtl
  ): FixedInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellFixedInfo")(colStart.asInstanceOf[js.Any], colEnd.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], stickyOffsets.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[FixedInfo]
  
  trait FixedInfo extends StObject {
    
    var firstFixLeft: Boolean
    
    var firstFixRight: Boolean
    
    var fixLeft: Double | `false`
    
    var fixRight: Double | `false`
    
    var isSticky: Boolean
    
    var lastFixLeft: Boolean
    
    var lastFixRight: Boolean
  }
  object FixedInfo {
    
    inline def apply(
      firstFixLeft: Boolean,
      firstFixRight: Boolean,
      fixLeft: Double | `false`,
      fixRight: Double | `false`,
      isSticky: Boolean,
      lastFixLeft: Boolean,
      lastFixRight: Boolean
    ): FixedInfo = {
      val __obj = js.Dynamic.literal(firstFixLeft = firstFixLeft.asInstanceOf[js.Any], firstFixRight = firstFixRight.asInstanceOf[js.Any], fixLeft = fixLeft.asInstanceOf[js.Any], fixRight = fixRight.asInstanceOf[js.Any], isSticky = isSticky.asInstanceOf[js.Any], lastFixLeft = lastFixLeft.asInstanceOf[js.Any], lastFixRight = lastFixRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedInfo]
    }
    
    extension [Self <: FixedInfo](x: Self) {
      
      inline def setFirstFixLeft(value: Boolean): Self = StObject.set(x, "firstFixLeft", value.asInstanceOf[js.Any])
      
      inline def setFirstFixRight(value: Boolean): Self = StObject.set(x, "firstFixRight", value.asInstanceOf[js.Any])
      
      inline def setFixLeft(value: Double | `false`): Self = StObject.set(x, "fixLeft", value.asInstanceOf[js.Any])
      
      inline def setFixRight(value: Double | `false`): Self = StObject.set(x, "fixRight", value.asInstanceOf[js.Any])
      
      inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      inline def setLastFixLeft(value: Boolean): Self = StObject.set(x, "lastFixLeft", value.asInstanceOf[js.Any])
      
      inline def setLastFixRight(value: Boolean): Self = StObject.set(x, "lastFixRight", value.asInstanceOf[js.Any])
    }
  }
}
