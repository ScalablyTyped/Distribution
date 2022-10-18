package typings.reactMdForm

import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdUtils.typesTypesMod.PropsWithRef
import typings.std.HTMLInputElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesToggleSwitchTrackMod {
  
  @JSImport("@react-md/form/types/toggle/SwitchTrack", "SwitchTrack")
  @js.native
  val SwitchTrack: ForwardRefExoticComponent[SwitchTrackProps & RefAttributes[HTMLInputElement]] = js.native
  
  trait SwitchTrackProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    /**
      * An optional class name to provide to the ball.
      */
    var ballClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional style object to provide to the ball.
      */
    var ballStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Any additional props and optional ref to provide to the track itself since
      * all the props are normally provided to the `<input>` element instead.
      */
    var containerProps: js.UndefOr[PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]] = js.undefined
  }
  object SwitchTrackProps {
    
    inline def apply(): SwitchTrackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchTrackProps]
    }
    
    extension [Self <: SwitchTrackProps](x: Self) {
      
      inline def setBallClassName(value: String): Self = StObject.set(x, "ballClassName", value.asInstanceOf[js.Any])
      
      inline def setBallClassNameUndefined: Self = StObject.set(x, "ballClassName", js.undefined)
      
      inline def setBallStyle(value: CSSProperties): Self = StObject.set(x, "ballStyle", value.asInstanceOf[js.Any])
      
      inline def setBallStyleUndefined: Self = StObject.set(x, "ballStyle", js.undefined)
      
      inline def setContainerProps(value: PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
      
      inline def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
    }
  }
}
