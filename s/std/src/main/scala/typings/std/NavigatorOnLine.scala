package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorOnLine extends StObject {
  
  val onLine: scala.Boolean
}
object NavigatorOnLine {
  
  @scala.inline
  def apply(onLine: scala.Boolean): NavigatorOnLine = {
    val __obj = js.Dynamic.literal(onLine = onLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorOnLine]
  }
  
  @scala.inline
  implicit class NavigatorOnLineMutableBuilder[Self <: NavigatorOnLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnLine(value: scala.Boolean): Self = StObject.set(x, "onLine", value.asInstanceOf[js.Any])
  }
}
