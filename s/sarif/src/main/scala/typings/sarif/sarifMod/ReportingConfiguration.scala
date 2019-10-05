package typings.sarif.sarifMod

import typings.sarif.sarifMod.ReportingConfiguration.level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingConfiguration extends js.Object {
  /**
    * Specifies whether the report may be produced during the scan.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the failure level for the report.
    */
  var level: js.UndefOr[level] = js.undefined
  /**
    * Contains configuration information specific to a report.
    */
  var parameters: js.UndefOr[PropertyBag] = js.undefined
  /**
    * Key/value pairs that provide additional information about the reporting configuration.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * Specifies the relative priority of the report. Used for analysis output only.
    */
  var rank: js.UndefOr[Double] = js.undefined
}

@JSImport("sarif", "ReportingConfiguration")
@js.native
object ReportingConfiguration extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.none
    - typings.sarif.sarifStrings.note
    - typings.sarif.sarifStrings.warning
    - typings.sarif.sarifStrings.error
  */
  trait level extends js.Object
  
}

