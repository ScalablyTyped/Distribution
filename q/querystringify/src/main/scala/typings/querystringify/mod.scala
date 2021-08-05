package typings.querystringify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("querystringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(query: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(query.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def stringify(obj: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(obj: js.Object, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: js.Object, prefix: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
}
