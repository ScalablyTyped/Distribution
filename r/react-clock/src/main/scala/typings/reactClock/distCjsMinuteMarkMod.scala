package typings.reactClock

import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.reactClock.anon.TypeofMark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsMinuteMarkMod {
  
  @JSImport("react-clock/dist/cjs/MinuteMark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: MinuteMarkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type MinuteMarkProps = ComponentProps[TypeofMark]
}
