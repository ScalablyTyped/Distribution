package typings.reactCircularProgressbar

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactCircularProgressbar.typesMod.CircularProgressbarWrapperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressbarWithChildrenMod {
  
  @JSImport("react-circular-progressbar/dist/CircularProgressbarWithChildren", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: CircularProgressbarWithChildrenProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CircularProgressbarWithChildrenProps
    extends StObject
       with CircularProgressbarWrapperProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object CircularProgressbarWithChildrenProps {
    
    @scala.inline
    def apply(value: Double): CircularProgressbarWithChildrenProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircularProgressbarWithChildrenProps]
    }
    
    @scala.inline
    implicit class CircularProgressbarWithChildrenPropsMutableBuilder[Self <: CircularProgressbarWithChildrenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
