package typings.rdfExt

import typings.rdfDatasetIndexed.datasetMod.DatasetIndexed
import typings.rdfExt.libPropTypeMod.PropType
import typings.rdfjsTypes.dataModelMod.Quad
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetMod {
  
  // tslint:disable-next-line:no-unnecessary-class
  @JSImport("rdf-ext/lib/Dataset", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DatasetExt {
    def this(quads: js.Array[Quad]) = this()
  }
  
  // tslint:disable-next-line:no-unnecessary-class
  @js.native
  trait DatasetExt
    extends StObject
       with DatasetIndexed[typings.rdfExt.libQuadMod.^, Quad] {
    
    def equals(other: this.type): Boolean = js.native
    
    def toCanonical(): String = js.native
    
    def toJSON(): js.Array[
        ReturnType[PropType[typings.rdfExt.libQuadMod.^, typings.rdfExt.rdfExtStrings.toJSON]]
      ] = js.native
  }
}
