package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "JobAssignment")
@js.native
class JobAssignment () extends StObject {
  
  /**
    * The total pay amount for a 12 month period on the job. Set if the job `PayType` is `SALARY`.
    */
  var annual_rate: js.UndefOr[Money] = js.native
  
  /**
    * The hourly pay rate of the job.
    */
  var hourly_rate: js.UndefOr[Money] = js.native
  
  /**
    * The title of the job.
    */
  var job_title: String = js.native
  
  /**
    * The current pay type for the job assignment used to calculate the pay amount in a pay period.
    * See [JobAssignmentPayType](#type-jobassignmentpaytype) for possible values.
    */
  var pay_type: String = js.native
  
  /**
    * The planned hours per week for the job. Set if the job `PayType` is `SALARY`.
    */
  var weekly_hours: js.UndefOr[Double] = js.native
}
