package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollOptions extends StObject {
  
  var shouldPublishImmediately: Boolean = js.native
}
object ScrollOptions {
  
  @scala.inline
  def apply(shouldPublishImmediately: Boolean): ScrollOptions = {
    val __obj = js.Dynamic.literal(shouldPublishImmediately = shouldPublishImmediately.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOptions]
  }
  
  @scala.inline
  implicit class ScrollOptionsMutableBuilder[Self <: ScrollOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShouldPublishImmediately(value: Boolean): Self = StObject.set(x, "shouldPublishImmediately", value.asInstanceOf[js.Any])
  }
}
