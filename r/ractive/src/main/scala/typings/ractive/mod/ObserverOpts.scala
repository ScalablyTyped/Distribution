package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObserverOpts
  extends StObject
     with ObserverBaseOpts {
  
  /**
  	 * Whether or not to follow any links when observing.
  	 */
  var links: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The function called to get an old value for the observer. This can be used to do things like freeze the initial value as the old value for all future callbacks.
  	 */
  var old: js.UndefOr[ObserverCallback[Ractive[/* ractive.ractive.Ractive<any> */ Any]]] = js.undefined
  
  /**
  	 * Whether or not to use strict equality when checking to see if a value has changed. Defaults to false.
  	 */
  var strict: js.UndefOr[Boolean] = js.undefined
}
object ObserverOpts {
  
  inline def apply(): ObserverOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserverOpts]
  }
  
  extension [Self <: ObserverOpts](x: Self) {
    
    inline def setLinks(value: Boolean): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setOld(value: ObserverCallback[Ractive[/* ractive.ractive.Ractive<any> */ Any]]): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
    
    inline def setOldUndefined: Self = StObject.set(x, "old", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
