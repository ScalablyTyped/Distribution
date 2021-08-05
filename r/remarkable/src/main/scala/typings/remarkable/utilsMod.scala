package typings.remarkable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("remarkable/lib/common/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: js.Any, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def escapeHtml(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtml")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromCodePoint(c: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(c.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def has(`object`: js.Any, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isString(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")().asInstanceOf[Boolean]
  inline def isString(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidEntityCode(c: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidEntityCode")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def replaceEntities(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceEntities")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unescapeMd(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeMd")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
