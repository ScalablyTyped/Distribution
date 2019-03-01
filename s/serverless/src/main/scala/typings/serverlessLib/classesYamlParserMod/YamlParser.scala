package typings
package serverlessLib.classesYamlParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YamlParser extends js.Object {
  def parse(yamlFilePath: java.lang.String): js.Promise[_]
}

object YamlParser {
  @scala.inline
  def apply(parse: js.Function1[java.lang.String, js.Promise[_]]): YamlParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[YamlParser]
  }
}

