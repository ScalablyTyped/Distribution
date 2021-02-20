package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Spacer element shown in widget._
  * @see https://docs.scriptable.app/widgetspacer
  */
@js.native
trait WidgetSpacer extends StObject {
  
  /**
    * _Amount of space this spacer consumes._
    * @see https://docs.scriptable.app/widgetspacer/#length
    */
  var length: Double = js.native
}
object WidgetSpacer {
  
  @scala.inline
  def apply(length: Double): WidgetSpacer = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetSpacer]
  }
  
  @scala.inline
  implicit class WidgetSpacerMutableBuilder[Self <: WidgetSpacer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
