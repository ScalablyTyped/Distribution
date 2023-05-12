package typings.rdfExt

import org.scalablytyped.runtime.Shortcut
import typings.rdfExt.clownfaceFactoryMod.ClownfaceFactoryCtor
import typings.rdfExt.dataFactoryMod.DataFactoryExt
import typings.rdfExt.dataFactoryMod.DataFactoryExtCtor
import typings.rdfExt.datasetFactoryMod.DatasetFactoryCtor
import typings.rdfExt.rdfExtStrings.termSet
import typings.rdfjsEnvironment.environmentMod.EnvironmentCtor
import typings.rdfjsEnvironment.formatsFactoryMod.FormatsFactoryCtor
import typings.rdfjsFetchLite.factoryMod.Fetch
import typings.rdfjsFetchLite.factoryMod.FetchFactoryCtor
import typings.rdfjsFetchLite.factoryMod.RdfFetchResponse
import typings.rdfjsFetchLite.mod.FormatsInit
import typings.rdfjsNamespace.factoryMod.NamespaceFactoryCtor
import typings.rdfjsNamespace.mod.NamespaceBuilder
import typings.rdfjsPrefixMap.factoryMod.PrefixMapFactoryCtor
import typings.rdfjsScore.anon.Typeofscore
import typings.rdfjsScore.factoryMod.FactoryCtor
import typings.rdfjsTraverser.factoryMod.TraverserFactoryCtor
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rdf-ext", JSImport.Default)
  @js.native
  val default: typings.rdfjsEnvironment.environmentMod.Environment[
    typings.rdfExt.clownfaceFactoryMod.ClownfaceFactory | DataFactoryExt | typings.rdfExt.datasetFactoryMod.DatasetFactory | typings.rdfjsFetchLite.factoryMod.FetchFactory | typings.rdfjsEnvironment.formatsFactoryMod.FormatsFactory | typings.rdfjsNamespace.factoryMod.NamespaceFactory | typings.rdfjsTermMap.factoryMod.TermMapFactory | typings.rdfjsTermSet.factoryMod.TermSetFactory | typings.rdfjsPrefixMap.factoryMod.PrefixMapFactory | typings.rdfjsTraverser.factoryMod.TraverserFactory | typings.rdfjsScore.factoryMod.ScoreFactory
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext", "ClownfaceFactory")
  @js.native
  open class ClownfaceFactory ()
    extends StObject
       with typings.rdfExt.clownfaceFactoryMod.ClownfaceFactory
  @JSImport("rdf-ext", "ClownfaceFactory")
  @js.native
  val ClownfaceFactory: ClownfaceFactoryCtor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext", "DataFactory")
  @js.native
  open class DataFactory ()
    extends StObject
       with DataFactoryExt
  @JSImport("rdf-ext", "DataFactory")
  @js.native
  val DataFactory: DataFactoryExtCtor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext", "DatasetFactory")
  @js.native
  open class DatasetFactory ()
    extends StObject
       with typings.rdfExt.datasetFactoryMod.DatasetFactory
  @JSImport("rdf-ext", "DatasetFactory")
  @js.native
  val DatasetFactory: DatasetFactoryCtor = js.native
  
  @JSImport("rdf-ext", "Environment")
  @js.native
  val Environment: EnvironmentCtor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext", "FetchFactory")
  @js.native
  open class FetchFactory ()
    extends StObject
       with typings.rdfjsFetchLite.factoryMod.FetchFactory {
    
    /* CompleteClass */
    override def clone(original: typings.rdfjsFetchLite.factoryMod.FetchFactory): typings.rdfjsFetchLite.factoryMod.FetchFactory = js.native
    
    /* CompleteClass */
    override def fetch(url: String): js.Promise[RdfFetchResponse[DatasetCore[Quad, Quad], Quad, Quad]] = js.native
    /* CompleteClass */
    override def fetch(url: String, options: FormatsInit): js.Promise[RdfFetchResponse[DatasetCore[Quad, Quad], Quad, Quad]] = js.native
    /* CompleteClass */
    @JSName("fetch")
    var fetch_Original: Fetch = js.native
  }
  @JSImport("rdf-ext", "FetchFactory")
  @js.native
  val FetchFactory: FetchFactoryCtor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext", "FormatsFactory")
  @js.native
  open class FormatsFactory ()
    extends StObject
       with typings.rdfjsEnvironment.formatsFactoryMod.FormatsFactory {
    
    /* CompleteClass */
    override def clone(original: typings.rdfjsEnvironment.formatsFactoryMod.FormatsFactory): Unit = js.native
    
    /* CompleteClass */
    var formats: typings.rdfjsEnvironment.libFormatsMod.default = js.native
    
    /* CompleteClass */
    override def init(): Unit = js.native
  }
  @JSImport("rdf-ext", "FormatsFactory")
  @js.native
  val FormatsFactory: FormatsFactoryCtor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext", "NamespaceFactory")
  @js.native
  open class NamespaceFactory ()
    extends StObject
       with typings.rdfjsNamespace.factoryMod.NamespaceFactory {
    
    // eslint-disable-next-line no-unnecessary-generics
    /* CompleteClass */
    override def namespace[TermNames /* <: String */](baseIRI: String): NamespaceBuilder[TermNames] = js.native
  }
  @JSImport("rdf-ext", "NamespaceFactory")
  @js.native
  val NamespaceFactory: NamespaceFactoryCtor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext", "PrefixMapFactory")
  @js.native
  open class PrefixMapFactory ()
    extends StObject
       with typings.rdfjsPrefixMap.factoryMod.PrefixMapFactory
  @JSImport("rdf-ext", "PrefixMapFactory")
  @js.native
  val PrefixMapFactory: PrefixMapFactoryCtor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext", "ScoreFactory")
  @js.native
  open class ScoreFactory ()
    extends StObject
       with typings.rdfjsScore.factoryMod.ScoreFactory {
    
    /* CompleteClass */
    var score: Typeofscore = js.native
  }
  @JSImport("rdf-ext", "ScoreFactory")
  @js.native
  val ScoreFactory: FactoryCtor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext", "TermMapFactory")
  @js.native
  open class TermMapFactory ()
    extends StObject
       with typings.rdfjsTermMap.factoryMod.TermMapFactory
  @JSImport("rdf-ext", "TermMapFactory")
  @js.native
  val TermMapFactory: typings.rdfjsTermMap.factoryMod.FactoryCtor = js.native
  
  @JSImport("rdf-ext", "TermSetFactory")
  @js.native
  open class TermSetFactory ()
    extends typings.rdfjsTermSet.factoryMod.default
  /* static members */
  object TermSetFactory {
    
    @JSImport("rdf-ext", "TermSetFactory")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdf-ext", "TermSetFactory.exports")
    @js.native
    def exports: js.Array[termSet] = js.native
    inline def exports_=(x: js.Array[termSet]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exports")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext", "TraverserFactory")
  @js.native
  open class TraverserFactory ()
    extends StObject
       with typings.rdfjsTraverser.factoryMod.TraverserFactory
  @JSImport("rdf-ext", "TraverserFactory")
  @js.native
  val TraverserFactory: TraverserFactoryCtor = js.native
  
  type _To = typings.rdfjsEnvironment.environmentMod.Environment[
    typings.rdfExt.clownfaceFactoryMod.ClownfaceFactory | DataFactoryExt | typings.rdfExt.datasetFactoryMod.DatasetFactory | typings.rdfjsFetchLite.factoryMod.FetchFactory | typings.rdfjsEnvironment.formatsFactoryMod.FormatsFactory | typings.rdfjsNamespace.factoryMod.NamespaceFactory | typings.rdfjsTermMap.factoryMod.TermMapFactory | typings.rdfjsTermSet.factoryMod.TermSetFactory | typings.rdfjsPrefixMap.factoryMod.PrefixMapFactory | typings.rdfjsTraverser.factoryMod.TraverserFactory | typings.rdfjsScore.factoryMod.ScoreFactory
  ]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typings.rdfjsEnvironment.environmentMod.Environment[
    typings.rdfExt.clownfaceFactoryMod.ClownfaceFactory | DataFactoryExt | typings.rdfExt.datasetFactoryMod.DatasetFactory | typings.rdfjsFetchLite.factoryMod.FetchFactory | typings.rdfjsEnvironment.formatsFactoryMod.FormatsFactory | typings.rdfjsNamespace.factoryMod.NamespaceFactory | typings.rdfjsTermMap.factoryMod.TermMapFactory | typings.rdfjsTermSet.factoryMod.TermSetFactory | typings.rdfjsPrefixMap.factoryMod.PrefixMapFactory | typings.rdfjsTraverser.factoryMod.TraverserFactory | typings.rdfjsScore.factoryMod.ScoreFactory
  ] = default
}
