package typings.sketchapp

import typings.sketchapp.anon.PageListCollapsed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSUserDocument extends StObject {
  
  var document: PageListCollapsed = js.native
}
object SketchMSUserDocument {
  
  @scala.inline
  def apply(document: PageListCollapsed): SketchMSUserDocument = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSUserDocument]
  }
  
  @scala.inline
  implicit class SketchMSUserDocumentMutableBuilder[Self <: SketchMSUserDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: PageListCollapsed): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}
