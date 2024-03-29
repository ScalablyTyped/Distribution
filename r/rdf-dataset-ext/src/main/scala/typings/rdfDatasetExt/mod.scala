package typings.rdfDatasetExt

import typings.rdfDatasetExt.anon.FnCall
import typings.rdfDatasetExt.anon.FnCallDataset
import typings.rdfDatasetExt.anon.FnCallDatasetArg
import typings.rdfDatasetExt.anon.FnCallDatasetStream
import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.streamMod.Stream
import typings.readableStream.mod.Readable
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-dataset-ext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rdf-dataset-ext", "addAll")
  @js.native
  def addAll: FnCall = js.native
  inline def addAll[Q /* <: BaseQuad */, D /* <: DatasetCore[Q, Q] */](dataset: D, iterable: js.Iterable[Q]): D = (^.asInstanceOf[js.Dynamic].applyDynamic("addAll")(dataset.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def addAll_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addAll")(x.asInstanceOf[js.Any])
  
  @JSImport("rdf-dataset-ext", "deleteMatch")
  @js.native
  def deleteMatch: FnCallDatasetArg = js.native
  inline def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](
    dataset: D,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arg because its type Parameters<DatasetCore['match']> is not an array type */ arg: Parameters[
      js.Function4[
        /* subject */ js.UndefOr[Term | Null], 
        /* predicate */ js.UndefOr[Term | Null], 
        /* object */ js.UndefOr[Term | Null], 
        /* graph */ js.UndefOr[Term | Null], 
        DatasetCore[Quad, Quad]
      ]
    ]
  ): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def deleteMatch_=(x: FnCallDatasetArg): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deleteMatch")(x.asInstanceOf[js.Any])
  
  @JSImport("rdf-dataset-ext", "equals")
  @js.native
  def equals_ : js.Function2[
    /* a */ DatasetCore[BaseQuad, BaseQuad], 
    /* b */ DatasetCore[BaseQuad, BaseQuad], 
    Boolean
  ] = js.native
  
  inline def equals_(a: DatasetCore[BaseQuad, BaseQuad], b: DatasetCore[BaseQuad, BaseQuad]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals__=(
    x: js.Function2[
      /* a */ DatasetCore[BaseQuad, BaseQuad], 
      /* b */ DatasetCore[BaseQuad, BaseQuad], 
      Boolean
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("equals")(x.asInstanceOf[js.Any])
  
  @JSImport("rdf-dataset-ext", "fromStream")
  @js.native
  def fromStream: FnCallDatasetStream = js.native
  inline def fromStream[D /* <: DatasetCore[BaseQuad, BaseQuad] */](
    dataset: D,
    stream: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter */ Any
  ): js.Promise[D] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(dataset.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[D]]
  inline def fromStream_=(x: FnCallDatasetStream): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromStream")(x.asInstanceOf[js.Any])
  
  @JSImport("rdf-dataset-ext", "toCanonical")
  @js.native
  def toCanonical: js.Function1[/* dataset */ DatasetCore[BaseQuad, BaseQuad], String] = js.native
  inline def toCanonical(dataset: DatasetCore[BaseQuad, BaseQuad]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCanonical")(dataset.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toCanonical_=(x: js.Function1[/* dataset */ DatasetCore[BaseQuad, BaseQuad], String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toCanonical")(x.asInstanceOf[js.Any])
  
  @JSImport("rdf-dataset-ext", "toStream")
  @js.native
  def toStream: FnCallDataset = js.native
  inline def toStream[Q /* <: BaseQuad */](dataset: DatasetCore[Q, Q]): Stream[Q] & Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("toStream")(dataset.asInstanceOf[js.Any]).asInstanceOf[Stream[Q] & Readable]
  inline def toStream_=(x: FnCallDataset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toStream")(x.asInstanceOf[js.Any])
}
