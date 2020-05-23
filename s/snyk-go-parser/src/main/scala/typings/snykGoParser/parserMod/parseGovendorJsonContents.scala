package typings.snykGoParser.parserMod

import typings.snykGoParser.typesMod.GoProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-go-parser/dist/parser", "parseGovendorJsonContents")
@js.native
object parseGovendorJsonContents extends js.Object {
  def apply(jsonStr: String): GoProjectConfig = js.native
}

