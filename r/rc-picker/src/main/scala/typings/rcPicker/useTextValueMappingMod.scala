package typings.rcPicker

import typings.rcPicker.anon.OnTextChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTextValueMappingMod {
  
  @JSImport("rc-picker/es/hooks/useTextValueMapping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasValueTextsOnTextChange: OnTextChange): js.Tuple3[String, js.Function1[/* text */ String, Unit], js.Function0[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasValueTextsOnTextChange.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, js.Function1[/* text */ String, Unit], js.Function0[Unit]]]
}
