package typings.reactBlockies

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-blockies", JSImport.Default)
  @js.native
  val default: FC[IdenticonProps] = js.native
  
  @JSImport("react-blockies", "Identicon")
  @js.native
  val Identicon: FC[IdenticonProps] = js.native
  
  @js.native
  trait IdenticonProps extends StObject {
    
    var bgColor: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var seed: String = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var spotColor: js.UndefOr[String] = js.native
  }
  object IdenticonProps {
    
    @scala.inline
    def apply(seed: String): IdenticonProps = {
      val __obj = js.Dynamic.literal(seed = seed.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdenticonProps]
    }
    
    @scala.inline
    implicit class IdenticonPropsMutableBuilder[Self <: IdenticonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSpotColor(value: String): Self = StObject.set(x, "spotColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpotColorUndefined: Self = StObject.set(x, "spotColor", js.undefined)
    }
  }
  
  type _To = FC[IdenticonProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[IdenticonProps] = default
}
