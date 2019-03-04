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

object IParserResult {
  @scala.inline
  def apply(
    root: Root,
    imports: js.Array[java.lang.String] = null,
    `package`: java.lang.String = null,
    syntax: java.lang.String = null,
    weakImports: js.Array[java.lang.String] = null
  ): IParserResult = {
    val __obj = js.Dynamic.literal(root = root)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    if (weakImports != null) __obj.updateDynamic("weakImports")(weakImports)
    __obj.asInstanceOf[IParserResult]
  }
}

