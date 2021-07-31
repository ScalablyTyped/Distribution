package typings.qrcodeSvg

import typings.qrcodeSvg.qrcodeSvgStrings.g
import typings.qrcodeSvg.qrcodeSvgStrings.none
import typings.qrcodeSvg.qrcodeSvgStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Container extends StObject {
    
    var container: svg | g | none
  }
  object Container {
    
    @scala.inline
    def apply(container: svg | g | none): Container = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[Container]
    }
    
    @scala.inline
    implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: svg | g | none): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: String
    
    var mode: Double
    
    var parsedData: js.Array[Double]
  }
  object Data {
    
    @scala.inline
    def apply(data: String, mode: Double, parsedData: js.Array[Double]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parsedData = parsedData.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedData(value: js.Array[Double]): Self = StObject.set(x, "parsedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedDataVarargs(value: Double*): Self = StObject.set(x, "parsedData", js.Array(value :_*))
    }
  }
}
