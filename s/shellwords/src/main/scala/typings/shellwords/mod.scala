package typings.shellwords

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shellwords", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escape(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")().asInstanceOf[String]
  inline def escape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def split(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")().asInstanceOf[js.Array[String]]
  inline def split(line: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(line.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
