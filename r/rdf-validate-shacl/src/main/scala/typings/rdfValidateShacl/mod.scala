package typings.rdfValidateShacl

import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.datasetMod.DatasetCoreFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-validate-shacl", JSImport.Namespace)
  @js.native
  open class ^[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */] protected ()
    extends StObject
       with SHACLValidator[F] {
    def this(shapes: DatasetCore[Quad, Quad]) = this()
    def this(shapes: DatasetCore[Quad, Quad], options: Options[F]) = this()
    
    /* CompleteClass */
    var depth: Double = js.native
    
    /* CompleteClass */
    var factory: F = js.native
    
    /* CompleteClass */
    override def nodeConformsToShape(focusNode: Term, shapeNode: Term): Boolean = js.native
    
    /* CompleteClass */
    override def validate(data: DatasetCore[Quad, Quad]): typings.rdfValidateShacl.srcValidationReportMod.^[F] = js.native
  }
  
  @js.native
  trait Factory[OutQuad /* <: Quad */, InQuad /* <: Quad */, D /* <: DatasetCore[OutQuad, InQuad] */]
    extends StObject
       with DataFactory[OutQuad, InQuad]
       with DatasetCoreFactory[OutQuad, InQuad, D]
  
  trait Options[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */] extends StObject {
    
    var factory: js.UndefOr[F] = js.undefined
    
    var maxErrors: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */](): Options[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[F]]
    }
    
    extension [Self <: Options[?], F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */](x: Self & Options[F]) {
      
      inline def setFactory(value: F): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
      
      inline def setMaxErrors(value: Double): Self = StObject.set(x, "maxErrors", value.asInstanceOf[js.Any])
      
      inline def setMaxErrorsUndefined: Self = StObject.set(x, "maxErrors", js.undefined)
    }
  }
  
  trait SHACLValidator[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */] extends StObject {
    
    var depth: Double
    
    var factory: F
    
    def nodeConformsToShape(focusNode: Term, shapeNode: Term): Boolean
    
    def validate(data: DatasetCore[Quad, Quad]): typings.rdfValidateShacl.srcValidationReportMod.^[F]
  }
  object SHACLValidator {
    
    inline def apply[F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */](
      depth: Double,
      factory: F,
      nodeConformsToShape: (Term, Term) => Boolean,
      validate: DatasetCore[Quad, Quad] => typings.rdfValidateShacl.srcValidationReportMod.^[F]
    ): SHACLValidator[F] = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], nodeConformsToShape = js.Any.fromFunction2(nodeConformsToShape), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[SHACLValidator[F]]
    }
    
    extension [Self <: SHACLValidator[?], F /* <: Factory[Quad, Quad, DatasetCore[Quad, Quad]] */](x: Self & SHACLValidator[F]) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setFactory(value: F): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setNodeConformsToShape(value: (Term, Term) => Boolean): Self = StObject.set(x, "nodeConformsToShape", js.Any.fromFunction2(value))
      
      inline def setValidate(value: DatasetCore[Quad, Quad] => typings.rdfValidateShacl.srcValidationReportMod.^[F]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
}
