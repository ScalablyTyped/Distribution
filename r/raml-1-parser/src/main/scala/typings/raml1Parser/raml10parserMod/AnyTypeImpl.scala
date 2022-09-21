package typings.raml1Parser.raml10parserMod

import typings.raml1Parser.highLevelASTMod.IAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "AnyTypeImpl")
@js.native
open class AnyTypeImpl protected () extends ValueTypeImpl {
  def this(attr: IAttribute) = this()
}
/* static members */
object AnyTypeImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "AnyTypeImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
