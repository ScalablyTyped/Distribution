package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.captionCaptionMod.CaptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object captionMod {
  
  @JSImport("react-day-picker/dist/components/Caption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Caption(props: CaptionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Caption")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
