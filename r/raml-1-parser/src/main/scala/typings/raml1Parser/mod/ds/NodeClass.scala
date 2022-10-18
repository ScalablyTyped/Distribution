package typings.raml1Parser.mod.ds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.StructuredType * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.ITypeDefinition * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.ITypeDefinition * / any */ @JSImport("raml-1-parser", "ds.NodeClass")
@js.native
open class NodeClass protected ()
  extends typings.ramlDefinitionSystem.mod.NodeClass {
  def this(_name: String, universe: typings.ramlDefinitionSystem.mod.Universe, path: String) = this()
  def this(
    _name: String,
    universe: typings.ramlDefinitionSystem.mod.Universe,
    path: String,
    _description: String
  ) = this()
}
/* static members */
object NodeClass {
  
  @JSImport("raml-1-parser", "ds.NodeClass")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser", "ds.NodeClass.CLASS_IDENTIFIER")
  @js.native
  def CLASS_IDENTIFIER: Any = js.native
  inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-definition-system.raml-definition-system.NodeClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-definition-system.raml-definition-system.NodeClass */ Boolean]
}
