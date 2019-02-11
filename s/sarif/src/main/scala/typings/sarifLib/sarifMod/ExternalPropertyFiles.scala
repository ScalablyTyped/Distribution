package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalPropertyFiles extends js.Object {
  /**
    * An external property file containing a run.conversion object to be merged with the root log file.
    */
  var conversion: js.UndefOr[ExternalPropertyFile] = js.undefined
  /**
    * An array of external property files containing run.files arrays to be merged with the root log file.
    */
  var files: js.UndefOr[js.Array[ExternalPropertyFile]] = js.undefined
  /**
    * An external property file containing a run.graphs object to be merged with the root log file.
    */
  var graphs: js.UndefOr[ExternalPropertyFile] = js.undefined
  /**
    * An array of external property files containing run.invocations arrays to be merged with the root log file.
    */
  var invocations: js.UndefOr[js.Array[ExternalPropertyFile]] = js.undefined
  /**
    * An array of external property files containing run.logicalLocations arrays to be merged with the root log file.
    */
  var logicalLocations: js.UndefOr[js.Array[ExternalPropertyFile]] = js.undefined
  /**
    * An external property file containing a run.properties object to be merged with the root log file.
    */
  var properties: js.UndefOr[ExternalPropertyFile] = js.undefined
  /**
    * An external property file containing a run.resources object to be merged with the root log file.
    */
  var resources: js.UndefOr[ExternalPropertyFile] = js.undefined
  /**
    * An array of external property files containing run.results arrays to be merged with the root log file.
    */
  var results: js.UndefOr[js.Array[ExternalPropertyFile]] = js.undefined
}

