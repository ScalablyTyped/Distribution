package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ios extends StObject {
  
  var ios: js.UndefOr[SourceDir] = js.native
}
object Ios {
  
  @scala.inline
  def apply(): Ios = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ios]
  }
  
  @scala.inline
  implicit class IosMutableBuilder[Self <: Ios] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIos(value: SourceDir): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
