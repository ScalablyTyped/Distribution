package typings.reactMonacoEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("react-monaco-editor/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def processSize(size: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("processSize")(size.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  inline def processSize(size: Double): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("processSize")(size.asInstanceOf[js.Any]).asInstanceOf[String | Double]
}
