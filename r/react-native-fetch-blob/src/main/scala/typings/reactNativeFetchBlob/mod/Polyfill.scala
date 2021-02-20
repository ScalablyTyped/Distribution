package typings.reactNativeFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyfill extends StObject {
  
  var Blob: PolyfillBlob = js.native
  
  var Event: PolyfillEvent = js.native
  
  var Fetch: PolyfillFetch = js.native
  
  var File: PolyfillFile = js.native
  
  var FileReader: PolyfillFileReader = js.native
  
  var ProgressEvent: PolyfillProgressEvent = js.native
  
  var XMLHttpRequest: PolyfillXMLHttpRequest = js.native
}
object Polyfill {
  
  @scala.inline
  def apply(
    Blob: PolyfillBlob,
    Event: PolyfillEvent,
    Fetch: PolyfillFetch,
    File: PolyfillFile,
    FileReader: PolyfillFileReader,
    ProgressEvent: PolyfillProgressEvent,
    XMLHttpRequest: PolyfillXMLHttpRequest
  ): Polyfill = {
    val __obj = js.Dynamic.literal(Blob = Blob.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], Fetch = Fetch.asInstanceOf[js.Any], File = File.asInstanceOf[js.Any], FileReader = FileReader.asInstanceOf[js.Any], ProgressEvent = ProgressEvent.asInstanceOf[js.Any], XMLHttpRequest = XMLHttpRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polyfill]
  }
  
  @scala.inline
  implicit class PolyfillMutableBuilder[Self <: Polyfill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlob(value: PolyfillBlob): Self = StObject.set(x, "Blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: PolyfillEvent): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetch(value: PolyfillFetch): Self = StObject.set(x, "Fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: PolyfillFile): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileReader(value: PolyfillFileReader): Self = StObject.set(x, "FileReader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressEvent(value: PolyfillProgressEvent): Self = StObject.set(x, "ProgressEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMLHttpRequest(value: PolyfillXMLHttpRequest): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
  }
}
