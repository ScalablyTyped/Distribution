package typings.rdfTransformTripleToQuad.mod

import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TripleToQuadTransformOptions extends js.Object {
  
  var factory: DataFactory[Quad, Quad] = js.native
}
object TripleToQuadTransformOptions {
  
  @scala.inline
  def apply(factory: DataFactory[Quad, Quad]): TripleToQuadTransformOptions = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripleToQuadTransformOptions]
  }
  
  @scala.inline
  implicit class TripleToQuadTransformOptionsOps[Self <: TripleToQuadTransformOptions] (val x: Self) extends AnyVal {
    
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
    def setFactory(value: DataFactory[Quad, Quad]): Self = this.set("factory", value.asInstanceOf[js.Any])
  }
}
