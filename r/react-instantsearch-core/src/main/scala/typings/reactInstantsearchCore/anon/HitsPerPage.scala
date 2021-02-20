package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HitsPerPage extends StObject {
  
  var hitsPerPage: Double = js.native
}
object HitsPerPage {
  
  @scala.inline
  def apply(hitsPerPage: Double): HitsPerPage = {
    val __obj = js.Dynamic.literal(hitsPerPage = hitsPerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitsPerPage]
  }
  
  @scala.inline
  implicit class HitsPerPageMutableBuilder[Self <: HitsPerPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
  }
}
