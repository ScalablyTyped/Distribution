package typings.resizeObserverBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeObserverSize extends StObject {
  
  val blockSize: Double
  
  val inlineSize: Double
}
object ResizeObserverSize {
  
  @scala.inline
  def apply(blockSize: Double, inlineSize: Double): ResizeObserverSize = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], inlineSize = inlineSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverSize]
  }
  
  @scala.inline
  implicit class ResizeObserverSizeMutableBuilder[Self <: ResizeObserverSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineSize(value: Double): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
  }
}
