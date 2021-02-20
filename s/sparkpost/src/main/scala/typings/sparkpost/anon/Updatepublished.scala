package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Updatepublished extends StObject {
  
  var update_published: js.UndefOr[Boolean] = js.native
}
object Updatepublished {
  
  @scala.inline
  def apply(): Updatepublished = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Updatepublished]
  }
  
  @scala.inline
  implicit class UpdatepublishedMutableBuilder[Self <: Updatepublished] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdate_published(value: Boolean): Self = StObject.set(x, "update_published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_publishedUndefined: Self = StObject.set(x, "update_published", js.undefined)
  }
}
