package typings.ramlDefinitionSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-definition-system", "ReferenceType")
@js.native
open class ReferenceType protected () extends ValueType {
  def this(name: String, path: String, referenceTo: String, _universe: Universe) = this()
  
  def getClassIdentifier(): Array = js.native
  
  def getReferencedType(): NodeClass = js.native
  
  def hasStructure(): Boolean = js.native
  
  /* private */ var referenceTo: Any = js.native
}
/* static members */
object ReferenceType {
  
  @JSImport("raml-definition-system", "ReferenceType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-definition-system", "ReferenceType.CLASS_IDENTIFIER")
  @js.native
  def CLASS_IDENTIFIER: Any = js.native
  inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-definition-system.raml-definition-system.ReferenceType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-definition-system.raml-definition-system.ReferenceType */ Boolean]
}
