package typings.ramlTypesystem.distSrcTypesystemMod

import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.RangeObject
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-typesystem/dist/src/typesystem", "ValidationError")
@js.native
open class ValidationError protected ()
  extends StObject
     with Error {
  def this(messageEntry: Any) = this()
  def this(messageEntry: Any, parameters: Any) = this()
  
  var additionalErrors: js.Array[ValidationError] = js.native
  
  var filePath: String = js.native
  
  def getClassIdentifier(): js.Array[String] = js.native
  
  var internalPath: String = js.native
  
  var internalRange: RangeObject = js.native
  
  var isWarning: Boolean = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  var messageEntry: Any = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var parameters: Any = js.native
}
/* static members */
object ValidationError {
  
  @JSImport("raml-typesystem/dist/src/typesystem", "ValidationError")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/typesystem", "ValidationError.CLASS_IDENTIFIER_ValidationError")
  @js.native
  def CLASS_IDENTIFIER_ValidationError: Any = js.native
  inline def CLASS_IDENTIFIER_ValidationError_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_ValidationError")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/typesystem.ValidationError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/typesystem.ValidationError */ Boolean]
}
