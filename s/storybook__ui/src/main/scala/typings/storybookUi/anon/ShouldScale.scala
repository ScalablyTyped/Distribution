package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShouldScale extends StObject {
  
  var shouldScale: Boolean = js.native
}
object ShouldScale {
  
  @scala.inline
  def apply(shouldScale: Boolean): ShouldScale = {
    val __obj = js.Dynamic.literal(shouldScale = shouldScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldScale]
  }
  
  @scala.inline
  implicit class ShouldScaleMutableBuilder[Self <: ShouldScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShouldScale(value: Boolean): Self = StObject.set(x, "shouldScale", value.asInstanceOf[js.Any])
  }
}
