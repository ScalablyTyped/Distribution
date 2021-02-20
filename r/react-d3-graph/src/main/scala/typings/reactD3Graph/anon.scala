package typings.reactD3Graph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AlphaTarget extends StObject {
    
    var alphaTarget: Double = js.native
    
    var disableLinkForce: Boolean = js.native
    
    var gravity: Double = js.native
    
    var linkLength: Double = js.native
    
    var linkStrength: Double = js.native
  }
  object AlphaTarget {
    
    @scala.inline
    def apply(
      alphaTarget: Double,
      disableLinkForce: Boolean,
      gravity: Double,
      linkLength: Double,
      linkStrength: Double
    ): AlphaTarget = {
      val __obj = js.Dynamic.literal(alphaTarget = alphaTarget.asInstanceOf[js.Any], disableLinkForce = disableLinkForce.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], linkLength = linkLength.asInstanceOf[js.Any], linkStrength = linkStrength.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlphaTarget]
    }
    
    @scala.inline
    implicit class AlphaTargetMutableBuilder[Self <: AlphaTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlphaTarget(value: Double): Self = StObject.set(x, "alphaTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableLinkForce(value: Boolean): Self = StObject.set(x, "disableLinkForce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkLength(value: Double): Self = StObject.set(x, "linkLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkStrength(value: Double): Self = StObject.set(x, "linkStrength", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
