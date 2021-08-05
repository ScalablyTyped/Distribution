package typings.reactCircularProgressbar

import typings.react.mod.global.JSX.Element
import typings.reactCircularProgressbar.anon.BackgroundColor
import typings.reactCircularProgressbar.circularProgressbarMod.default
import typings.reactCircularProgressbar.circularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps
import typings.reactCircularProgressbar.typesMod.CircularProgressbarDefaultProps
import typings.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-circular-progressbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-circular-progressbar", "CircularProgressbar")
  @js.native
  class CircularProgressbar () extends default
  object CircularProgressbar {
    
    @JSImport("react-circular-progressbar", "CircularProgressbar")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-circular-progressbar", "CircularProgressbar.defaultProps")
    @js.native
    def defaultProps: CircularProgressbarDefaultProps = js.native
    inline def defaultProps_=(x: CircularProgressbarDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def CircularProgressbarWithChildren(props: CircularProgressbarWithChildrenProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CircularProgressbarWithChildren")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def buildStyles(
    hasRotationStrokeLinecapTextColorTextSizePathColorPathTransitionPathTransitionDurationTrailColorBackgroundColor: BackgroundColor
  ): CircularProgressbarStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("buildStyles")(hasRotationStrokeLinecapTextColorTextSizePathColorPathTransitionPathTransitionDurationTrailColorBackgroundColor.asInstanceOf[js.Any]).asInstanceOf[CircularProgressbarStyles]
}
