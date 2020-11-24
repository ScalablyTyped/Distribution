package typings.sharepoint.SP.SiteHealth

import typings.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteHealthSummary extends ClientObject {
  
  def get_failedErrorCount(): Double = js.native
  
  def get_failedWarningCount(): Double = js.native
  
  def get_passedCount(): Double = js.native
  
  def get_results(): js.Array[SiteHealthResult] = js.native
}
