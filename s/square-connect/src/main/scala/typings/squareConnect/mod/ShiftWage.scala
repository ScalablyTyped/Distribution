package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ShiftWage")
@js.native
class ShiftWage () extends StObject {
  
  /**
    * Can be a custom-set hourly wage or the calculated effective hourly wage based on annual wage and hours worked per week.
    */
  var hourly_rate: js.UndefOr[Money] = js.native
  
  /**
    * The name of the job performed during this shift. Square labor-reporting UIs may group shifts together by title.
    */
  var title: js.UndefOr[String] = js.native
}
