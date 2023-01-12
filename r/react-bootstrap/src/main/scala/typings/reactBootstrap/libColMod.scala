package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColMod {
  
  @JSImport("react-bootstrap/lib/Col", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ColProps, js.Object, Any]
  
  type Col = Component[ColProps, js.Object, Any]
  
  trait ColProps
    extends StObject
       with HTMLProps[Col] {
    
    var componentClass: js.UndefOr[ElementType[Any]] = js.undefined
    
    var lg: js.UndefOr[Double] = js.undefined
    
    var lgHidden: js.UndefOr[Boolean] = js.undefined
    
    var lgOffset: js.UndefOr[Double] = js.undefined
    
    var lgPull: js.UndefOr[Double] = js.undefined
    
    var lgPush: js.UndefOr[Double] = js.undefined
    
    var md: js.UndefOr[Double] = js.undefined
    
    var mdHidden: js.UndefOr[Boolean] = js.undefined
    
    var mdOffset: js.UndefOr[Double] = js.undefined
    
    var mdPull: js.UndefOr[Double] = js.undefined
    
    var mdPush: js.UndefOr[Double] = js.undefined
    
    var sm: js.UndefOr[Double] = js.undefined
    
    var smHidden: js.UndefOr[Boolean] = js.undefined
    
    var smOffset: js.UndefOr[Double] = js.undefined
    
    var smPull: js.UndefOr[Double] = js.undefined
    
    var smPush: js.UndefOr[Double] = js.undefined
    
    var xs: js.UndefOr[Double] = js.undefined
    
    var xsHidden: js.UndefOr[Boolean] = js.undefined
    
    var xsOffset: js.UndefOr[Double] = js.undefined
    
    var xsPull: js.UndefOr[Double] = js.undefined
    
    var xsPush: js.UndefOr[Double] = js.undefined
  }
  object ColProps {
    
    inline def apply(): ColProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColProps] (val x: Self) extends AnyVal {
      
      inline def setComponentClass(value: ElementType[Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      inline def setLg(value: Double): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgHidden(value: Boolean): Self = StObject.set(x, "lgHidden", value.asInstanceOf[js.Any])
      
      inline def setLgHiddenUndefined: Self = StObject.set(x, "lgHidden", js.undefined)
      
      inline def setLgOffset(value: Double): Self = StObject.set(x, "lgOffset", value.asInstanceOf[js.Any])
      
      inline def setLgOffsetUndefined: Self = StObject.set(x, "lgOffset", js.undefined)
      
      inline def setLgPull(value: Double): Self = StObject.set(x, "lgPull", value.asInstanceOf[js.Any])
      
      inline def setLgPullUndefined: Self = StObject.set(x, "lgPull", js.undefined)
      
      inline def setLgPush(value: Double): Self = StObject.set(x, "lgPush", value.asInstanceOf[js.Any])
      
      inline def setLgPushUndefined: Self = StObject.set(x, "lgPush", js.undefined)
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: Double): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdHidden(value: Boolean): Self = StObject.set(x, "mdHidden", value.asInstanceOf[js.Any])
      
      inline def setMdHiddenUndefined: Self = StObject.set(x, "mdHidden", js.undefined)
      
      inline def setMdOffset(value: Double): Self = StObject.set(x, "mdOffset", value.asInstanceOf[js.Any])
      
      inline def setMdOffsetUndefined: Self = StObject.set(x, "mdOffset", js.undefined)
      
      inline def setMdPull(value: Double): Self = StObject.set(x, "mdPull", value.asInstanceOf[js.Any])
      
      inline def setMdPullUndefined: Self = StObject.set(x, "mdPull", js.undefined)
      
      inline def setMdPush(value: Double): Self = StObject.set(x, "mdPush", value.asInstanceOf[js.Any])
      
      inline def setMdPushUndefined: Self = StObject.set(x, "mdPush", js.undefined)
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: Double): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmHidden(value: Boolean): Self = StObject.set(x, "smHidden", value.asInstanceOf[js.Any])
      
      inline def setSmHiddenUndefined: Self = StObject.set(x, "smHidden", js.undefined)
      
      inline def setSmOffset(value: Double): Self = StObject.set(x, "smOffset", value.asInstanceOf[js.Any])
      
      inline def setSmOffsetUndefined: Self = StObject.set(x, "smOffset", js.undefined)
      
      inline def setSmPull(value: Double): Self = StObject.set(x, "smPull", value.asInstanceOf[js.Any])
      
      inline def setSmPullUndefined: Self = StObject.set(x, "smPull", js.undefined)
      
      inline def setSmPush(value: Double): Self = StObject.set(x, "smPush", value.asInstanceOf[js.Any])
      
      inline def setSmPushUndefined: Self = StObject.set(x, "smPush", js.undefined)
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXs(value: Double): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsHidden(value: Boolean): Self = StObject.set(x, "xsHidden", value.asInstanceOf[js.Any])
      
      inline def setXsHiddenUndefined: Self = StObject.set(x, "xsHidden", js.undefined)
      
      inline def setXsOffset(value: Double): Self = StObject.set(x, "xsOffset", value.asInstanceOf[js.Any])
      
      inline def setXsOffsetUndefined: Self = StObject.set(x, "xsOffset", js.undefined)
      
      inline def setXsPull(value: Double): Self = StObject.set(x, "xsPull", value.asInstanceOf[js.Any])
      
      inline def setXsPullUndefined: Self = StObject.set(x, "xsPull", js.undefined)
      
      inline def setXsPush(value: Double): Self = StObject.set(x, "xsPush", value.asInstanceOf[js.Any])
      
      inline def setXsPushUndefined: Self = StObject.set(x, "xsPush", js.undefined)
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
    }
  }
}
