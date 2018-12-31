package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParserResult extends js.Object {
  /** Imports, if any */
  var imports: js.UndefOr[js.Array[java.lang.String]]
  /** Package name, if declared */
  var `package`: js.UndefOr[java.lang.String]
  /** Populated root instance */
  var root: Root
  /** Syntax, if specified (either `"proto2"` or `"proto3"`) */
  var syntax: js.UndefOr[java.lang.String]
  /** Weak imports, if any */
  var weakImports: js.UndefOr[js.Array[java.lang.String]]
}

