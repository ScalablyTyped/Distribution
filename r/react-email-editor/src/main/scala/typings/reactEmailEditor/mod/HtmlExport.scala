package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlExport extends StObject {
  
  val design: Design = js.native
  
  val html: String = js.native
}
object HtmlExport {
  
  @scala.inline
  def apply(design: Design, html: String): HtmlExport = {
    val __obj = js.Dynamic.literal(design = design.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlExport]
  }
  
  @scala.inline
  implicit class HtmlExportMutableBuilder[Self <: HtmlExport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesign(value: Design): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
