package typings.prettyDashError.prettyDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrettyError extends js.Object {
  def alias(stringOrRx: String, alias: String): PrettyError = js.native
  def appendStyle(toAppend: js.Object): PrettyError = js.native
  def config(configObject: ConfigObject): PrettyError = js.native
  def filter(callbacks: Callback): PrettyError = js.native
  def filterParsedError(callbacks: Callback): PrettyError = js.native
  def getObject(e: js.Object): js.Object = js.native
  def removeAlias(stringOrRx: String): PrettyError = js.native
  def removeAllAliases(): PrettyError = js.native
  def removeAllFilters(): PrettyError = js.native
  def removeAllParsedErrorFilters(): PrettyError = js.native
  def removeFilter(callbacks: Callback): PrettyError = js.native
  def removeParsedErrorFilter(callbacks: Callback): PrettyError = js.native
  def render(e: ParsedError): String = js.native
  def render(e: ParsedError, logIt: Boolean): String = js.native
  def render(e: ParsedError, logIt: Boolean, useColors: Boolean): String = js.native
  def setMaxItems(maxItems: Double): PrettyError = js.native
  def skip(callbacks: Callback): PrettyError = js.native
  def skipNodeFiles(): js.Any = js.native
  def skipPackage(packages: String*): PrettyError = js.native
  def skipPath(paths: String*): PrettyError = js.native
  def start(): PrettyError = js.native
  def stop(): js.Any = js.native
  def unskip(callbacks: Callback): PrettyError = js.native
  def unskipAll(): PrettyError = js.native
  def unskipAllPackages(): PrettyError = js.native
  def unskipAllPaths(): PrettyError = js.native
  def unskipNodeFiles(): js.Any = js.native
  def unskipPackage(packages: String*): PrettyError = js.native
  def unskipPath(paths: String*): PrettyError = js.native
  def withColors(): PrettyError = js.native
  def withoutColors(): PrettyError = js.native
}

