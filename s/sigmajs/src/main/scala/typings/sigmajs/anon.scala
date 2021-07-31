package typings.sigmajs

import org.scalablytyped.runtime.StringDictionary
import typings.sigmajs.SigmaJs.Edge
import typings.sigmajs.SigmaJs.SVGEdgeLabels
import typings.sigmajs.SigmaJs.SVGObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DictrenderType
    extends StObject
       with /* renderType */ StringDictionary[SVGObject[Edge] | SVGEdgeLabels] {
    
    var labels: SVGEdgeLabels
  }
  object DictrenderType {
    
    @scala.inline
    def apply(labels: SVGEdgeLabels): DictrenderType = {
      val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictrenderType]
    }
    
    @scala.inline
    implicit class DictrenderTypeMutableBuilder[Self <: DictrenderType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabels(value: SVGEdgeLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
