package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Files extends StObject {
  
  var files: js.Array[js.Any]
  
  var lang: MaxError
  
  var maxCount: Double
  
  var maxWidth: Double
  
  var onChange: js.Any
  
  var onError: js.Any
  
  var title: String
}
object Files {
  
  @scala.inline
  def apply(
    files: js.Array[js.Any],
    lang: MaxError,
    maxCount: Double,
    maxWidth: Double,
    onChange: js.Any,
    onError: js.Any,
    title: String
  ): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  
  @scala.inline
  implicit class FilesMutableBuilder[Self <: Files] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Array[js.Any]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: js.Any*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setLang(value: MaxError): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: js.Any): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnError(value: js.Any): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
