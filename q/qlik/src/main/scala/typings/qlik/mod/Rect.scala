package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rect extends StObject {
  
  var qHeight: Double
  
  var qLeft: Double
  
  var qTop: Double
  
  var qWdith: Double
}
object Rect {
  
  @scala.inline
  def apply(qHeight: Double, qLeft: Double, qTop: Double, qWdith: Double): Rect = {
    val __obj = js.Dynamic.literal(qHeight = qHeight.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any], qWdith = qWdith.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
  
  @scala.inline
  implicit class RectMutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQHeight(value: Double): Self = StObject.set(x, "qHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLeft(value: Double): Self = StObject.set(x, "qLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTop(value: Double): Self = StObject.set(x, "qTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQWdith(value: Double): Self = StObject.set(x, "qWdith", value.asInstanceOf[js.Any])
  }
}
