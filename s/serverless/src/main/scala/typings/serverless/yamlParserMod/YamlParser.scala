package typings.serverless.yamlParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YamlParser extends js.Object {
  def parse(yamlFilePath: String): js.Promise[_]
}

object YamlParser {
  @scala.inline
  def apply(parse: String => js.Promise[_]): YamlParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[YamlParser]
  }
}

