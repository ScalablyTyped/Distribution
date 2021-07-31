package typings.rcTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowTitle extends StObject {
  
  var showTitle: js.UndefOr[Boolean] = js.undefined
}
object ShowTitle {
  
  @scala.inline
  def apply(): ShowTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowTitle]
  }
  
  @scala.inline
  implicit class ShowTitleMutableBuilder[Self <: ShowTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
  }
}
