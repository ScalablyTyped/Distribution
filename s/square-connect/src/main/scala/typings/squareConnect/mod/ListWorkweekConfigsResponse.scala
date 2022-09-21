package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListWorkweekConfigsResponse")
@js.native
open class ListWorkweekConfigsResponse () extends StObject {
  
  /**
    * Value supplied in the subsequent request to fetch the next page of Employee Wage results.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * A page of Employee Wage results.
    */
  var workweek_configs: js.UndefOr[js.Array[WorkweekConfig]] = js.native
}
