package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalFiles extends js.Object {
  /**
    * The location of a file containing a run.conversion object to be merged with the root log file.
    */
  var conversion: js.UndefOr[FileLocation] = js.undefined
  /**
    * The location of a file containing a run.files object to be merged with the root log file.
    */
  var files: js.UndefOr[FileLocation] = js.undefined
  /**
    * The location of a file containing a run.graphs object to be merged with the root log file.
    */
  var graphs: js.UndefOr[FileLocation] = js.undefined
  /**
    * An array of locations of files containing arrays of run.invocation objects to be merged with the root log
    * file.
    */
  var invocations: js.UndefOr[js.Array[FileLocation]] = js.undefined
  /**
    * The location of a file containing a run.logicalLocations object to be merged with the root log file.
    */
  var logicalLocations: js.UndefOr[FileLocation] = js.undefined
  /**
    * Key/value pairs that provide additional information about the external files
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The location of a file containing a run.resources object to be merged with the root log file.
    */
  var resources: js.UndefOr[FileLocation] = js.undefined
  /**
    * An array of locations of files containins arrays of run.result objects to be merged with the root log file.
    */
  var results: js.UndefOr[js.Array[FileLocation]] = js.undefined
}

