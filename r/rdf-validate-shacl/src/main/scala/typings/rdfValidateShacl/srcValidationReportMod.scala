package typings.rdfValidateShacl

import typings.clownface.mod.GraphPointer
import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.datasetMod.DatasetCoreFactory
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcValidationReportMod {
  
  @JSImport("rdf-validate-shacl/src/validation-report", JSImport.Namespace)
  @js.native
  open class ^[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */] protected ()
    extends StObject
       with ValidationReport[F] {
    def this(resultQuads: js.Array[Quad], options: Options[F]) = this()
    
    /* CompleteClass */
    var conforms: Boolean = js.native
    
    /* CompleteClass */
    var dataset: DatasetOf[F] = js.native
    
    /* CompleteClass */
    var pointer: GraphPointer[BlankNodeOf[F] | NamedNodeOf[F], DatasetOf[F]] = js.native
    
    /* CompleteClass */
    var results: js.Array[ValidationResult[F]] = js.native
    
    /* CompleteClass */
    var term: BlankNodeOf[F] | NamedNodeOf[F] = js.native
  }
  
  type BlankNodeOf[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */] = ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: F['blankNode'] */ js.Any
  ]
  
  type DatasetOf[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */] = ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: F['dataset'] */ js.Any
  ]
  
  @js.native
  trait Factory[OutQuad /* <: Quad */, InQuad /* <: Quad */, D /* <: DatasetCore[OutQuad, InQuad] */]
    extends StObject
       with DataFactory[OutQuad, InQuad]
       with DatasetCoreFactory[OutQuad, InQuad, D]
  
  type LiteralOf[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */] = ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: F['literal'] */ js.Any
  ]
  
  type NamedNodeOf[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */] = ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: F['namedNode'] */ js.Any
  ]
  
  trait Options[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */] extends StObject {
    
    var factory: F
  }
  object Options {
    
    inline def apply[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */](factory: F): Options[F] = {
      val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[F]]
    }
    
    extension [Self <: Options[?], F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */](x: Self & Options[F]) {
      
      inline def setFactory(value: F): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidationReport[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */] extends StObject {
    
    var conforms: Boolean
    
    var dataset: DatasetOf[F]
    
    var pointer: GraphPointer[BlankNodeOf[F] | NamedNodeOf[F], DatasetOf[F]]
    
    var results: js.Array[ValidationResult[F]]
    
    var term: BlankNodeOf[F] | NamedNodeOf[F]
  }
  object ValidationReport {
    
    inline def apply[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */](
      conforms: Boolean,
      dataset: DatasetOf[F],
      pointer: GraphPointer[BlankNodeOf[F] | NamedNodeOf[F], DatasetOf[F]],
      results: js.Array[ValidationResult[F]],
      term: BlankNodeOf[F] | NamedNodeOf[F]
    ): ValidationReport[F] = {
      val __obj = js.Dynamic.literal(conforms = conforms.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationReport[F]]
    }
    
    extension [Self <: ValidationReport[?], F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */](x: Self & ValidationReport[F]) {
      
      inline def setConforms(value: Boolean): Self = StObject.set(x, "conforms", value.asInstanceOf[js.Any])
      
      inline def setDataset(value: DatasetOf[F]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setPointer(value: GraphPointer[BlankNodeOf[F] | NamedNodeOf[F], DatasetOf[F]]): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[ValidationResult[F]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: ValidationResult[F]*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setTerm(value: BlankNodeOf[F] | NamedNodeOf[F]): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidationResult[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */] extends StObject {
    
    var dataset: DatasetOf[F]
    
    val detail: js.Array[ValidationResult[F]]
    
    val focusNode: BlankNodeOf[F] | NamedNodeOf[F] | Null
    
    val message: js.Array[BlankNodeOf[F] | NamedNodeOf[F] | LiteralOf[F]]
    
    val path: BlankNodeOf[F] | NamedNodeOf[F] | Null
    
    var pointer: GraphPointer[BlankNodeOf[F] | NamedNodeOf[F], DatasetOf[F]]
    
    val severity: NamedNodeOf[F] | Null
    
    val sourceConstraintComponent: BlankNodeOf[F] | NamedNodeOf[F] | Null
    
    val sourceShape: BlankNodeOf[F] | NamedNodeOf[F] | Null
    
    var term: BlankNodeOf[F] | NamedNodeOf[F]
  }
  object ValidationResult {
    
    inline def apply[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */](
      dataset: DatasetOf[F],
      detail: js.Array[ValidationResult[F]],
      message: js.Array[BlankNodeOf[F] | NamedNodeOf[F] | LiteralOf[F]],
      pointer: GraphPointer[BlankNodeOf[F] | NamedNodeOf[F], DatasetOf[F]],
      term: BlankNodeOf[F] | NamedNodeOf[F]
    ): ValidationResult[F] = {
      val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], focusNode = null, path = null, severity = null, sourceConstraintComponent = null, sourceShape = null)
      __obj.asInstanceOf[ValidationResult[F]]
    }
    
    extension [Self <: ValidationResult[?], F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */](x: Self & ValidationResult[F]) {
      
      inline def setDataset(value: DatasetOf[F]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setDetail(value: js.Array[ValidationResult[F]]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailVarargs(value: ValidationResult[F]*): Self = StObject.set(x, "detail", js.Array(value*))
      
      inline def setFocusNode(value: BlankNodeOf[F] | NamedNodeOf[F]): Self = StObject.set(x, "focusNode", value.asInstanceOf[js.Any])
      
      inline def setFocusNodeNull: Self = StObject.set(x, "focusNode", null)
      
      inline def setMessage(value: js.Array[BlankNodeOf[F] | NamedNodeOf[F] | LiteralOf[F]]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageVarargs(value: (BlankNodeOf[F] | NamedNodeOf[F] | LiteralOf[F])*): Self = StObject.set(x, "message", js.Array(value*))
      
      inline def setPath(value: BlankNodeOf[F] | NamedNodeOf[F]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPointer(value: GraphPointer[BlankNodeOf[F] | NamedNodeOf[F], DatasetOf[F]]): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setSeverity(value: NamedNodeOf[F]): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityNull: Self = StObject.set(x, "severity", null)
      
      inline def setSourceConstraintComponent(value: BlankNodeOf[F] | NamedNodeOf[F]): Self = StObject.set(x, "sourceConstraintComponent", value.asInstanceOf[js.Any])
      
      inline def setSourceConstraintComponentNull: Self = StObject.set(x, "sourceConstraintComponent", null)
      
      inline def setSourceShape(value: BlankNodeOf[F] | NamedNodeOf[F]): Self = StObject.set(x, "sourceShape", value.asInstanceOf[js.Any])
      
      inline def setSourceShapeNull: Self = StObject.set(x, "sourceShape", null)
      
      inline def setTerm(value: BlankNodeOf[F] | NamedNodeOf[F]): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
}
