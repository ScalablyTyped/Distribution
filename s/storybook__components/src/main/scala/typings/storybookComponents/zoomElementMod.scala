package typings.storybookComponents

import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomElementMod {
  
  @JSImport("@storybook/components/dist/Zoom/ZoomElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ZoomElement(hasScaleChildren: ZoomProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ZoomElement")(hasScaleChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ZoomProps extends StObject {
    
    var children: ReactElement | js.Array[ReactElement]
    
    var scale: Double
  }
  object ZoomProps {
    
    @scala.inline
    def apply(children: ReactElement | js.Array[ReactElement], scale: Double): ZoomProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomProps]
    }
    
    @scala.inline
    implicit class ZoomPropsMutableBuilder[Self <: ZoomProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
}
