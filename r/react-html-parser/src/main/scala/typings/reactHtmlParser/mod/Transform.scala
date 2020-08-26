package typings.reactHtmlParser.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform extends js.Object {
  def apply(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomElement */ js.Any,
    index: Double
  ): ReactElement | Unit | Null = js.native
  def apply(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomElement */ js.Any,
    index: Double,
    transform: Transform
  ): ReactElement | Unit | Null = js.native
}

