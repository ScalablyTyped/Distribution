package typings.primereact.anon

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Files extends StObject {
  
  var files: js.Any = js.native
  
  var xhr: XMLHttpRequest = js.native
}
object Files {
  
  @scala.inline
  def apply(files: js.Any, xhr: XMLHttpRequest): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  
  @scala.inline
  implicit class FilesMutableBuilder[Self <: Files] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
  }
}
