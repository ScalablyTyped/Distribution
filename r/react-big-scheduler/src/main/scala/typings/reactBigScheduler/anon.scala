package typings.reactBigScheduler

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.reactBigScheduler.mod.CellUnits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CellUnit extends StObject {
    
    var cellUnit: CellUnits = js.native
    
    var endDate: String = js.native
    
    var startDate: String = js.native
  }
  object CellUnit {
    
    @scala.inline
    def apply(cellUnit: CellUnits, endDate: String, startDate: String): CellUnit = {
      val __obj = js.Dynamic.literal(cellUnit = cellUnit.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellUnit]
    }
    
    @scala.inline
    implicit class CellUnitMutableBuilder[Self <: CellUnit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellUnit(value: CellUnits): Self = StObject.set(x, "cellUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): Moment = js.native
    def apply(
      inp: js.UndefOr[MomentInput],
      format: js.UndefOr[MomentFormatSpecification],
      language: js.UndefOr[scala.Nothing],
      strict: Boolean
    ): Moment = js.native
    def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
    def apply(
      inp: js.UndefOr[MomentInput],
      format: js.UndefOr[MomentFormatSpecification],
      language: String,
      strict: Boolean
    ): Moment = js.native
    def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
    def apply(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
    def apply(inp: js.UndefOr[MomentInput], strict: Boolean): Moment = js.native
    def apply(inp: MomentInput): Moment = js.native
  }
}
