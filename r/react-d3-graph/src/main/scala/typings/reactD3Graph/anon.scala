package typings.reactD3Graph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AlphaTarget extends StObject {
    
    /**
      * @see https://github.com/d3/d3-force#simulation_alphaTarget
      * @default 0.05
      */
    var alphaTarget: js.UndefOr[Double] = js.undefined
    
    /**
      * Completely disables d3 force link and simulation to re-trigger so that one can obtain precise render of node positions
      *
      * @see https://github.com/danielcaldas/react-d3-graph/pull/278
      * @default false
      */
    var disableLinkForce: js.UndefOr[Boolean] = js.undefined
    
    /**
      * this will define how close nodes are to each other.
      * - If value is positive, nodes will attract each other.
      * - If value is negative, nodes will repel each other. Most of the times this is what we want, so nodes don"t overlap.
      *
      * @see https://github.com/d3/d3-force#forces
      * @default -100
      */
    var gravity: js.UndefOr[Double] = js.undefined
    
    /**
      * the length of each link from the center of the nodes it joins.
      *
      * @default 100
      */
    var linkLength: js.UndefOr[Double] = js.undefined
    
    /**
      * @see https://github.com/d3/d3-force#link_strength
      * @default 1
      */
    var linkStrength: js.UndefOr[Double] = js.undefined
  }
  object AlphaTarget {
    
    inline def apply(): AlphaTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlphaTarget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlphaTarget] (val x: Self) extends AnyVal {
      
      inline def setAlphaTarget(value: Double): Self = StObject.set(x, "alphaTarget", value.asInstanceOf[js.Any])
      
      inline def setAlphaTargetUndefined: Self = StObject.set(x, "alphaTarget", js.undefined)
      
      inline def setDisableLinkForce(value: Boolean): Self = StObject.set(x, "disableLinkForce", value.asInstanceOf[js.Any])
      
      inline def setDisableLinkForceUndefined: Self = StObject.set(x, "disableLinkForce", js.undefined)
      
      inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setLinkLength(value: Double): Self = StObject.set(x, "linkLength", value.asInstanceOf[js.Any])
      
      inline def setLinkLengthUndefined: Self = StObject.set(x, "linkLength", js.undefined)
      
      inline def setLinkStrength(value: Double): Self = StObject.set(x, "linkStrength", value.asInstanceOf[js.Any])
      
      inline def setLinkStrengthUndefined: Self = StObject.set(x, "linkStrength", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
