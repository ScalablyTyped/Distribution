package typings.snykGoParser.parserMod

import typings.snykGoParser.typesMod.GoProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-go-parser/dist/parser", "parseGoPkgConfig")
@js.native
object parseGoPkgConfig extends js.Object {
  def apply(manifestFileContents: String, lockFileContents: String): GoProjectConfig = js.native
}

