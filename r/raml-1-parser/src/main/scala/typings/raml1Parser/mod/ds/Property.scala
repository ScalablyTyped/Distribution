package typings.raml1Parser.mod.ds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.Property * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.IProperty * / any */ @JSImport("raml-1-parser", "ds.Property")
@js.native
open class Property ()
  extends typings.ramlDefinitionSystem.mod.Property
/* static members */
object Property {
  
  @JSImport("raml-1-parser", "ds.Property")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser", "ds.Property.CLASS_IDENTIFIER_Property_def")
  @js.native
  def CLASS_IDENTIFIER_Property_def: Any = js.native
  inline def CLASS_IDENTIFIER_Property_def_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_Property_def")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-definition-system.raml-definition-system.Property */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-definition-system.raml-definition-system.Property */ Boolean]
}
