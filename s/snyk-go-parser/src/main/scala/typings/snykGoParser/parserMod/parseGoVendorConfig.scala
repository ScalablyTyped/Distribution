package typings.snykGoParser.parserMod

import typings.snykGoParser.typesMod.GoProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-go-parser/dist/parser", "parseGoVendorConfig")
@js.native
object parseGoVendorConfig extends js.Object {
  def apply(manifestFileContents: String): GoProjectConfig = js.native
}

