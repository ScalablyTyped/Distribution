package typings.reactMonacoEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-monaco-editor/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  @scala.inline
  def processSize(size: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("processSize")(size.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  @scala.inline
  def processSize(size: Double): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("processSize")(size.asInstanceOf[js.Any]).asInstanceOf[String | Double]
}
