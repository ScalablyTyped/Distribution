package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IDataRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QFormatSpec extends StObject {
  
  var qFormatSpec: String = js.native
  
  var qPreview: js.Array[IDataRecord] = js.native
}
object QFormatSpec {
  
  @scala.inline
  def apply(qFormatSpec: String, qPreview: js.Array[IDataRecord]): QFormatSpec = {
    val __obj = js.Dynamic.literal(qFormatSpec = qFormatSpec.asInstanceOf[js.Any], qPreview = qPreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[QFormatSpec]
  }
  
  @scala.inline
  implicit class QFormatSpecMutableBuilder[Self <: QFormatSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQFormatSpec(value: String): Self = StObject.set(x, "qFormatSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPreview(value: js.Array[IDataRecord]): Self = StObject.set(x, "qPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPreviewVarargs(value: IDataRecord*): Self = StObject.set(x, "qPreview", js.Array(value :_*))
  }
}
