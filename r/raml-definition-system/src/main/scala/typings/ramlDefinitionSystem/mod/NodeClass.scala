package typings.ramlDefinitionSystem.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.StructuredType * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.ITypeDefinition * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.ITypeDefinition * / any */ @JSImport("raml-definition-system", "NodeClass")
@js.native
open class NodeClass protected () extends StObject {
  def this(_name: String, universe: Universe, path: String) = this()
  def this(_name: String, universe: Universe, path: String, _description: String) = this()
  
  def allProperties(): Array = js.native
  def allProperties(
    v: StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.ITypeDefinition */ Any
    ]
  ): Array = js.native
  
  def getClassIdentifier(): Array = js.native
}
/* static members */
object NodeClass {
  
  @JSImport("raml-definition-system", "NodeClass")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-definition-system", "NodeClass.CLASS_IDENTIFIER")
  @js.native
  def CLASS_IDENTIFIER: Any = js.native
  inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-definition-system.raml-definition-system.NodeClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-definition-system.raml-definition-system.NodeClass */ Boolean]
}
