package typings.safeIdentifier

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("safe-identifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def identifier(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("identifier")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def identifier(key: String, unique: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("identifier")(key.asInstanceOf[js.Any], unique.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def property(obj: String, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def property(obj: Null, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def property(obj: Unit, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
}
