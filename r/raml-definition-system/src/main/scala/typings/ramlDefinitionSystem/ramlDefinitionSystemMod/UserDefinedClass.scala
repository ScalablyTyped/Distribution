package typings.ramlDefinitionSystem.ramlDefinitionSystemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-definition-system", "UserDefinedClass")
@js.native
open class UserDefinedClass protected () extends NodeClass {
  def this(name: String, universe: Universe, hl: IHighLevelNode, path: String, description: String) = this()
  
  var _value: Boolean = js.native
  
  /**
    * Returns nearest genuine user-define type in the hierarchy.
    * Genuine user defined type is a type user intentionally defined and filled with
    * properties or facets, or having user-defined name as opposed to a synthetic user-defined type.
    */
  def genuineUserDefinedType(): Any = js.native
  
  def hasValueTypeInHierarchy(): Boolean = js.native
  
  /**
    * Returns whether this type contain genuine user defined type in its hierarchy.
    * Genuine user defined type is a type user intentionally defined and filled with
    * properties or facets, or having user-defined name as opposed to a synthetic user-defined type.
    */
  def isGenuineUserDefinedType(): Boolean = js.native
  
  def isUserDefined(): Boolean = js.native
  
  def key(): Any = js.native
  
  def typeId(): String = js.native
}
/* static members */
object UserDefinedClass {
  
  @JSImport("raml-definition-system", "UserDefinedClass")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-definition-system", "UserDefinedClass.CLASS_IDENTIFIER_UserDefinedClass")
  @js.native
  def CLASS_IDENTIFIER_UserDefinedClass: Any = js.native
  inline def CLASS_IDENTIFIER_UserDefinedClass_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_UserDefinedClass")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-definition-system.raml-definition-system.UserDefinedClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-definition-system.raml-definition-system.UserDefinedClass */ Boolean]
}
