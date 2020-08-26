package typings.serverless.yamlParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YamlParser extends js.Object {
  def parse(yamlFilePath: String): js.Promise[_] = js.native
}

object YamlParser {
  @scala.inline
  def apply(parse: String => js.Promise[_]): YamlParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[YamlParser]
  }
  @scala.inline
  implicit class YamlParserOps[Self <: YamlParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParse(value: String => js.Promise[_]): Self = this.set("parse", js.Any.fromFunction1(value))
  }
  
}

