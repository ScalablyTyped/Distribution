package typings.reactBigScheduler

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.reactBigScheduler.mod.CellUnits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CellUnit extends StObject {
    
    var cellUnit: CellUnits
    
    var endDate: String
    
    var startDate: String
  }
  object CellUnit {
    
    inline def apply(cellUnit: CellUnits, endDate: String, startDate: String): CellUnit = {
      val __obj = js.Dynamic.literal(cellUnit = cellUnit.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellUnit]
    }
    
    extension [Self <: CellUnit](x: Self) {
      
      inline def setCellUnit(value: CellUnits): Self = StObject.set(x, "cellUnit", value.asInstanceOf[js.Any])
      
      inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): Moment = js.native
    def apply(inp: Unit, format: Unit, language: String): Moment = js.native
    def apply(inp: Unit, format: Unit, language: String, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: Unit, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: Unit, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, language: String): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
    def apply(inp: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput): Moment = js.native
    def apply(inp: MomentInput, format: Unit, language: String): Moment = js.native
    def apply(inp: MomentInput, format: Unit, language: String, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: Unit, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, strict: Boolean): Moment = js.native
  }
}
