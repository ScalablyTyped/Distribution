package typings.rdfDashExt

import typings.rdfDashExt.libQuadMod.QuadExt
import typings.rdfDashExt.libUnderscorePropTypeMod.PropType
import typings.rdfDashExt.rdfDashExtStrings.has
import typings.rdfDashJs.rdfDashJsMod.Dataset
import typings.rdfDashJs.rdfDashJsMod.Quad
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/Dataset", JSImport.Namespace)
@js.native
object libDatasetMod extends js.Object {
  @js.native
  trait DatasetExt extends Dataset[Quad] {
    val includes: PropType[Dataset[Quad], has] = js.native
    val length: Double = js.native
    def merge(other: js.Array[Quad]): this.type = js.native
    def merge(other: Dataset[Quad]): this.type = js.native
    def removeMatches(subject: js.Any, predicate: js.Any, `object`: js.Any, graph: js.Any): this.type = js.native
    def toJSON(): js.Array[ReturnType[PropType[QuadExt, typings.rdfDashExt.rdfDashExtStrings.toJSON]]] = js.native
  }
  
}

