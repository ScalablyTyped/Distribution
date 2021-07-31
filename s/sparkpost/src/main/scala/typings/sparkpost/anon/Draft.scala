package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Draft extends StObject {
  
  var draft: js.UndefOr[Boolean] = js.undefined
}
object Draft {
  
  @scala.inline
  def apply(): Draft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Draft]
  }
  
  @scala.inline
  implicit class DraftMutableBuilder[Self <: Draft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
  }
}
