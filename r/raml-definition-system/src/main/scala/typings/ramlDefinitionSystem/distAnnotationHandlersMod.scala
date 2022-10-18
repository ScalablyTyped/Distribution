package typings.ramlDefinitionSystem

import typings.ramlDefinitionSystem.mod.NodeClass
import typings.ramlDefinitionSystem.mod.Property
import typings.tsStructureModel.mod.Annotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAnnotationHandlersMod {
  
  @JSImport("raml-definition-system/dist/annotationHandlers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleTypeAnnotation(a: Annotation, rangeType: NodeClass): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleTypeAnnotation")(a.asInstanceOf[js.Any], rangeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def recordAnnotation(p: Property, a: Annotation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("recordAnnotation")(p.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AnnotationHandler = js.Function2[/* a */ Annotation, /* f */ Property, Any]
}
