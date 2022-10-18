package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.typesLabelLabelMod.LabelProps
import typings.reactMdForm.typesLabelLabelMod.LabelStates
import typings.std.HTMLLabelElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLabelMod {
  
  @JSImport("@react-md/form/types/label", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/form/types/label", "Label")
  @js.native
  val Label: ForwardRefExoticComponent[LabelProps & RefAttributes[HTMLLabelElement]] = js.native
  
  inline def labelStyles(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("labelStyles")().asInstanceOf[String]
  inline def labelStyles(hasErrorActiveDisabled: LabelStates): String = ^.asInstanceOf[js.Dynamic].applyDynamic("labelStyles")(hasErrorActiveDisabled.asInstanceOf[js.Any]).asInstanceOf[String]
}
