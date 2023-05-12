package typings.sentryReplay.anon

import typings.sentryReplay.typesTypesMod.RecordingOptions
import typings.sentryReplay.typesTypesMod.ReplayPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: ReplayPluginOptions
  
  var recordingOptions: RecordingOptions
}
object Options {
  
  inline def apply(options: ReplayPluginOptions, recordingOptions: RecordingOptions): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], recordingOptions = recordingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: ReplayPluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRecordingOptions(value: RecordingOptions): Self = StObject.set(x, "recordingOptions", value.asInstanceOf[js.Any])
  }
}
