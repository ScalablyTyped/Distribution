package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadFileOptions extends StObject {
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var flag: js.UndefOr[String] = js.undefined
}
object ReadFileOptions {
  
  @scala.inline
  def apply(): ReadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadFileOptions]
  }
  
  @scala.inline
  implicit class ReadFileOptionsMutableBuilder[Self <: ReadFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
