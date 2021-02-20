package typings.rcTable

import typings.rcTable.anon.Fixed
import typings.rcTable.interfaceMod.StickyOffsets
import typings.rcTable.rcTableBooleans.`false`
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixUtilMod {
  
  @JSImport("rc-table/lib/utils/fixUtil", "getCellFixedInfo")
  @js.native
  def getCellFixedInfo_ltr(
    colStart: Double,
    colEnd: Double,
    columns: js.Array[Fixed],
    stickyOffsets: StickyOffsets,
    direction: ltr
  ): FixedInfo = js.native
  @JSImport("rc-table/lib/utils/fixUtil", "getCellFixedInfo")
  @js.native
  def getCellFixedInfo_rtl(
    colStart: Double,
    colEnd: Double,
    columns: js.Array[Fixed],
    stickyOffsets: StickyOffsets,
    direction: rtl
  ): FixedInfo = js.native
  
  @js.native
  trait FixedInfo extends StObject {
    
    var firstFixLeft: Boolean = js.native
    
    var firstFixRight: Boolean = js.native
    
    var fixLeft: Double | `false` = js.native
    
    var fixRight: Double | `false` = js.native
    
    var isSticky: Boolean = js.native
    
    var lastFixLeft: Boolean = js.native
    
    var lastFixRight: Boolean = js.native
  }
  object FixedInfo {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class FixedInfoMutableBuilder[Self <: FixedInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstFixLeft(value: Boolean): Self = StObject.set(x, "firstFixLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstFixRight(value: Boolean): Self = StObject.set(x, "firstFixRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixLeft(value: Double | `false`): Self = StObject.set(x, "fixLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixRight(value: Double | `false`): Self = StObject.set(x, "fixRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFixLeft(value: Boolean): Self = StObject.set(x, "lastFixLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFixRight(value: Boolean): Self = StObject.set(x, "lastFixRight", value.asInstanceOf[js.Any])
    }
  }
}
