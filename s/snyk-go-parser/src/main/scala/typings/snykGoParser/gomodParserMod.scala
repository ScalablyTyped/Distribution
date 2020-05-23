package typings.snykGoParser

import typings.snykGoParser.typesMod.GoMod
import typings.snykGoParser.typesMod.ModuleVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-go-parser/dist/gomod-parser", JSImport.Namespace)
@js.native
object gomodParserMod extends js.Object {
  def parseGoMod(goModStr: String): GoMod = js.native
  def parseVersion(versionString: String): ModuleVersion = js.native
  def toSnykVersion(v: ModuleVersion): String = js.native
}

