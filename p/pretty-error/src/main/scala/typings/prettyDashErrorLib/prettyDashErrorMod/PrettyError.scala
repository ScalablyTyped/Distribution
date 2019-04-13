package typings
package prettyDashErrorLib.prettyDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrettyError extends js.Object {
  def alias(stringOrRx: java.lang.String, alias: java.lang.String): PrettyError = js.native
  def appendStyle(toAppend: js.Object): PrettyError = js.native
  def config(configObject: ConfigObject): PrettyError = js.native
  def filter(callbacks: Callback): PrettyError = js.native
  def filterParsedError(callbacks: Callback): PrettyError = js.native
  def getObject(e: js.Object): js.Object = js.native
  def removeAlias(stringOrRx: java.lang.String): PrettyError = js.native
  def removeAllAliases(): PrettyError = js.native
  def removeAllFilters(): PrettyError = js.native
  def removeAllParsedErrorFilters(): PrettyError = js.native
  def removeFilter(callbacks: Callback): PrettyError = js.native
  def removeParsedErrorFilter(callbacks: Callback): PrettyError = js.native
  def render(e: ParsedError): java.lang.String = js.native
  def render(e: ParsedError, logIt: scala.Boolean): java.lang.String = js.native
  def render(e: ParsedError, logIt: scala.Boolean, useColors: scala.Boolean): java.lang.String = js.native
  def setMaxItems(maxItems: scala.Double): PrettyError = js.native
  def skip(callbacks: Callback): PrettyError = js.native
  def skipNodeFiles(): js.Any = js.native
  def skipPackage(packages: java.lang.String*): PrettyError = js.native
  def skipPath(paths: java.lang.String*): PrettyError = js.native
  def start(): PrettyError = js.native
  def stop(): js.Any = js.native
  def unskip(callbacks: Callback): PrettyError = js.native
  def unskipAll(): PrettyError = js.native
  def unskipAllPackages(): PrettyError = js.native
  def unskipAllPaths(): PrettyError = js.native
  def unskipNodeFiles(): js.Any = js.native
  def unskipPackage(packages: java.lang.String*): PrettyError = js.native
  def unskipPath(paths: java.lang.String*): PrettyError = js.native
  def withColors(): PrettyError = js.native
  def withoutColors(): PrettyError = js.native
}

