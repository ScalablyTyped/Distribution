package typings.rdfExt

import typings.rdfDatasetIndexed.datasetMod.DatasetIndexed
import typings.rdfExt.propTypeMod.PropType
import typings.rdfExt.quadMod.QuadExt
import typings.rdfJs.mod.Quad
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasetMod {
  
  @js.native
  trait DatasetExt extends DatasetIndexed[QuadExt, Quad] {
    
    def equals(other: this.type): Boolean = js.native
    
    def toCanonical(): String = js.native
    
    def toJSON(): js.Array[ReturnType[PropType[QuadExt, typings.rdfExt.rdfExtStrings.toJSON]]] = js.native
  }
}
