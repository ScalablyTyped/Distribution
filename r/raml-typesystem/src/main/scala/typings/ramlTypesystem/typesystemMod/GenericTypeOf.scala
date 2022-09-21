package typings.ramlTypesystem.typesystemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-typesystem/dist/src/typesystem", "GenericTypeOf")
@js.native
abstract class GenericTypeOf () extends Constraint {
  def this(_inheritable: Boolean) = this()
}
/* static members */
object GenericTypeOf {
  
  @JSImport("raml-typesystem/dist/src/typesystem", "GenericTypeOf")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/typesystem", "GenericTypeOf.CLASS_IDENTIFIER_GenericTypeOf")
  @js.native
  def CLASS_IDENTIFIER_GenericTypeOf: Any = js.native
  inline def CLASS_IDENTIFIER_GenericTypeOf_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_GenericTypeOf")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/typesystem.GenericTypeOf */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/typesystem.GenericTypeOf */ Boolean]
}
