package typings.rdfExt

import typings.rdfExt.libPropTypeMod.PropType
import typings.rdfExt.libQuadMod.QuadExt
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.streamMod.Stream
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetMod {
  
  @JSImport("rdf-ext/lib/Dataset", JSImport.Default)
  @js.native
  open class default () extends DatasetExt {
    def this(quads: js.Array[Quad]) = this()
  }
  
  @JSImport("rdf-ext/lib/Dataset", "DatasetExt")
  @js.native
  open class DatasetExt ()
    extends typings.rdfjsDataset.datasetCoreMod.default[QuadExt] {
    def this(quads: js.Array[Quad]) = this()
    
    def addAll(quads: js.Iterable[Quad]): this.type = js.native
    
    def deleteMatches(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<DatasetCore['match']> is not an array type */ args: Parameters[
          js.Function4[
            /* subject */ js.UndefOr[Term | Null], 
            /* predicate */ js.UndefOr[Term | Null], 
            /* object */ js.UndefOr[Term | Null], 
            /* graph */ js.UndefOr[Term | Null], 
            DatasetCore[Quad, Quad]
          ]
        ]
    ): this.type = js.native
    
    def difference(other: DatasetCore[Quad, Quad]): DatasetExt = js.native
    
    def equals(other: DatasetCore[Quad, Quad]): Boolean = js.native
    
    def every(cb: js.Function1[/* quad */ QuadExt, Boolean]): Boolean = js.native
    
    def filter(cb: js.Function1[/* quad */ QuadExt, Boolean]): DatasetExt = js.native
    
    def forEach(cb: js.Function1[/* quad */ QuadExt, Unit]): Unit = js.native
    
    def `import`(stream: Stream[Quad]): js.Promise[this.type] = js.native
    
    def intersection(other: DatasetCore[Quad, Quad]): DatasetExt = js.native
    
    def map(callback: js.Function1[/* quad */ QuadExt, Quad]): DatasetExt = js.native
    
    def merge(other: js.Iterable[Quad]): DatasetExt = js.native
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ QuadExt, 
          /* currentValue */ QuadExt, 
          /* currentIndex */ Double, 
          /* self */ this.type, 
          QuadExt
        ]
    ): QuadExt = js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ QuadExt, 
          /* currentValue */ QuadExt, 
          /* currentIndex */ Double, 
          /* self */ this.type, 
          QuadExt
        ],
      initialValue: QuadExt
    ): QuadExt = js.native
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ QuadExt, 
          /* currentIndex */ Double, 
          /* self */ this.type, 
          U
        ],
      initialValue: U
    ): U = js.native
    
    def some(cb: js.Function1[/* quad */ QuadExt, Boolean]): Boolean = js.native
    
    def toCanonical(): String = js.native
    
    def toJSON(): js.Array[ReturnType[PropType[QuadExt, typings.rdfExt.rdfExtStrings.toJSON]]] = js.native
    
    def toStream(): Stream[QuadExt] = js.native
  }
}
