package typings.rdfDashTransformDashTripleDashToDashQuad.rdfDashTransformDashTripleDashToDashQuadMod

import typings.rdfDashJs.rdfDashJsMod.DataFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripleToQuadTransformOptions extends js.Object {
  var factory: DataFactory
}

object TripleToQuadTransformOptions {
  @scala.inline
  def apply(factory: DataFactory): TripleToQuadTransformOptions = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TripleToQuadTransformOptions]
  }
}

