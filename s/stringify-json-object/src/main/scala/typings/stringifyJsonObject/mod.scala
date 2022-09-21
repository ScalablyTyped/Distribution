package typings.stringifyJsonObject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stringify-json-object/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(
    json: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(json.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(
    json: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any,
    pretty: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(json.asInstanceOf[js.Any], pretty.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(json: Unit, pretty: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(json.asInstanceOf[js.Any], pretty.asInstanceOf[js.Any])).asInstanceOf[String]
}
