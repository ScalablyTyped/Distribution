package typings.ramlTypesystem.mod

import typings.ramlTypesystem.typeExpressionUtilMod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeExpressions {
  
  @JSImport("raml-typesystem", "typeExpressions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(str: String): BaseNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[BaseNode]
  
  inline def serializeToString(node: BaseNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeToString")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def visit(node: BaseNode, action: js.Function1[/* n */ BaseNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(node.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
