package typings.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeInterval[T] extends StObject {
  
  var interval: Double = js.native
  
  var value: T = js.native
}
object TimeInterval {
  
  @scala.inline
  def apply[T](interval: Double, value: T): TimeInterval[T] = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInterval[T]]
  }
  
  @scala.inline
  implicit class TimeIntervalMutableBuilder[Self <: TimeInterval[_], T] (val x: Self with TimeInterval[T]) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
