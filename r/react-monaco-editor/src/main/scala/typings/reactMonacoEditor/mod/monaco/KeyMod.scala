package typings.reactMonacoEditor.mod.monaco

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-monaco-editor", "monaco.KeyMod")
@js.native
open class KeyMod ()
  extends typings.monacoEditor.mod.KeyMod
/* static members */
object KeyMod {
  
  @JSImport("react-monaco-editor", "monaco.KeyMod")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-monaco-editor", "monaco.KeyMod.Alt")
  @js.native
  val Alt: Double = js.native
  
  @JSImport("react-monaco-editor", "monaco.KeyMod.CtrlCmd")
  @js.native
  val CtrlCmd: Double = js.native
  
  @JSImport("react-monaco-editor", "monaco.KeyMod.Shift")
  @js.native
  val Shift: Double = js.native
  
  @JSImport("react-monaco-editor", "monaco.KeyMod.WinCtrl")
  @js.native
  val WinCtrl: Double = js.native
  
  inline def chord(firstPart: Double, secondPart: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("chord")(firstPart.asInstanceOf[js.Any], secondPart.asInstanceOf[js.Any])).asInstanceOf[Double]
}
