package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tool extends js.Object {
  /**
    * The binary version of the tool's primary executable file expressed as four non-negative integers separated
    * by a period (for operating systems that express file versions in this way).
    */
  var dottedQuadFileVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The absolute URI from which the tool can be downloaded.
    */
  var downloadUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the tool along with its version and any other useful identifying information, such as its locale.
    */
  var fullName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tool language (expressed as an ISO 649 two-letter lowercase culture code) and region (expressed as an ISO
    * 3166 two-letter uppercase subculture code associated with a country or region).
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the tool.
    */
  var name: java.lang.String
  /**
    * Key/value pairs that provide additional information about the tool.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A version that uniquely identifies the SARIF logging component that generated this file, if it is versioned
    * separately from the tool.
    */
  var sarifLoggerVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tool version in the format specified by Semantic Versioning 2.0.
    */
  var semanticVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tool version, in whatever format the tool natively provides.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

