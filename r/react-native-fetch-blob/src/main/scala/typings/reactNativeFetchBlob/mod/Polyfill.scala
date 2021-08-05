package typings.reactNativeFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polyfill extends StObject {
  
  var Blob: PolyfillBlob
  
  var Event: PolyfillEvent
  
  var Fetch: PolyfillFetch
  
  var File: PolyfillFile
  
  var FileReader: PolyfillFileReader
  
  var ProgressEvent: PolyfillProgressEvent
  
  var XMLHttpRequest: PolyfillXMLHttpRequest
}
object Polyfill {
  
  inline def apply(
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
  
  extension [Self <: Polyfill](x: Self) {
    
    inline def setBlob(value: PolyfillBlob): Self = StObject.set(x, "Blob", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: PolyfillEvent): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setFetch(value: PolyfillFetch): Self = StObject.set(x, "Fetch", value.asInstanceOf[js.Any])
    
    inline def setFile(value: PolyfillFile): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    
    inline def setFileReader(value: PolyfillFileReader): Self = StObject.set(x, "FileReader", value.asInstanceOf[js.Any])
    
    inline def setProgressEvent(value: PolyfillProgressEvent): Self = StObject.set(x, "ProgressEvent", value.asInstanceOf[js.Any])
    
    inline def setXMLHttpRequest(value: PolyfillXMLHttpRequest): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
  }
}
