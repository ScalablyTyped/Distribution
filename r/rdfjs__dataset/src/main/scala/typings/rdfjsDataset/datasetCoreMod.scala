package typings.rdfjsDataset

import typings.rdfJs.mod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasetCoreMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("@rdfjs/dataset/DatasetCore", JSImport.Namespace)
  @js.native
  class ^[InQuad] protected () extends DatasetCore[InQuad] {
    def this(quads: js.Array[InQuad]) = this()
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  trait DatasetCore[InQuad]
    extends typings.rdfJs.mod.DatasetCore[Quad, InQuad]
}
