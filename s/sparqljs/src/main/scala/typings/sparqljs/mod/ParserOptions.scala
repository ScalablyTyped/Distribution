package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserOptions extends js.Object {
  var baseIRI: js.UndefOr[String] = js.native
  var factory: js.UndefOr[DataFactory[Quad, Quad]] = js.native
  var prefixes: js.UndefOr[StringDictionary[String]] = js.native
}

object ParserOptions {
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
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
    def setBaseIRI(value: String): Self = this.set("baseIRI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseIRI: Self = this.set("baseIRI", js.undefined)
    @scala.inline
    def setFactory(value: DataFactory[Quad, Quad]): Self = this.set("factory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactory: Self = this.set("factory", js.undefined)
    @scala.inline
    def setPrefixes(value: StringDictionary[String]): Self = this.set("prefixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixes: Self = this.set("prefixes", js.undefined)
  }
  
}

