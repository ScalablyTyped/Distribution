package typings.sharepoint.global

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.AjaxNavigate
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AjaxNavigate")
@js.native
class AjaxNavigate_ ()
  extends StObject
     with AjaxNavigate {
  
  /* CompleteClass */
  override def add_navigate(handler: js.Function2[/* obj */ js.Any, /* eventArgs */ js.Any, Unit]): Unit = js.native
  
  /* CompleteClass */
  override def convertMDSURLtoRegularURL(mdsPath: String): String = js.native
  
  /* CompleteClass */
  override def getParam(paramName: String): String = js.native
  
  /* CompleteClass */
  override def getSavedFormAction(): String = js.native
  
  /* CompleteClass */
  override def get_hash(): String = js.native
  
  /* CompleteClass */
  override def get_href(): String = js.native
  
  /* CompleteClass */
  override def get_search(): String = js.native
  
  /* CompleteClass */
  override def remove_navigate(handler: js.Function2[/* obj */ js.Any, /* eventArgs */ js.Any, Unit]): Unit = js.native
  
  /* CompleteClass */
  override def submit(formToSubmit: HTMLFormElement): Unit = js.native
  
  /* CompleteClass */
  override def update(
    url: String,
    updateParts: StringDictionary[String | Double],
    fullNavigate: Boolean,
    anchorName: String
  ): Unit = js.native
}
