package typings.spotifyWebApiNode.mod

import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.context
import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.off
import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeatOptions
  extends StObject
     with DeviceOptions {
  
  var state: js.UndefOr[track | context | off] = js.undefined
}
object RepeatOptions {
  
  inline def apply(): RepeatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeatOptions]
  }
  
  extension [Self <: RepeatOptions](x: Self) {
    
    inline def setState(value: track | context | off): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
