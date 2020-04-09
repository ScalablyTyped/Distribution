package typings.rdfTransformTripleToQuad.mod

import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripleToQuadTransformOptions extends js.Object {
  var factory: DataFactory[Quad, Quad]
}

object TripleToQuadTransformOptions {
  @scala.inline
  def apply(factory: DataFactory[Quad, Quad]): TripleToQuadTransformOptions = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TripleToQuadTransformOptions]
  }
}

