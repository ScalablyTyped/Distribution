package typings.snykGoParser

import typings.snykGoParser.typesMod.DepTree
import typings.snykGoParser.typesMod.GoMod
import typings.snykGoParser.typesMod.GoProjectConfig
import typings.snykGoParser.typesMod.ModuleVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-go-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def buildGoPkgDepTree(manifestFileContents: String, lockFileContents: String): js.Promise[DepTree] = js.native
  def buildGoPkgDepTree(manifestFileContents: String, lockFileContents: String, options: js.Any): js.Promise[DepTree] = js.native
  def buildGoVendorDepTree(manifestFileContents: String): js.Promise[DepTree] = js.native
  def buildGoVendorDepTree(manifestFileContents: String, options: js.Any): js.Promise[DepTree] = js.native
  def parseGoMod(goModStr: String): GoMod = js.native
  def parseGoPkgConfig(manifestFileContents: String, lockFileContents: String): GoProjectConfig = js.native
  def parseGoVendorConfig(manifestFileContents: String): GoProjectConfig = js.native
  def parseVersion(versionString: String): ModuleVersion = js.native
  def toSnykVersion(v: ModuleVersion): String = js.native
}

