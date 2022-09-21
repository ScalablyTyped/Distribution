package typings.ractive.mod

import typings.ractive.ractiveNumbers.`-1`
import typings.ractive.ractiveNumbers.`0`
import typings.ractive.ractiveNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetOpts extends StObject {
  
  /** Whether or not to merge the given value into the existing data or replace the existing data. Defaults to replacing the existing data (false). */
  var deep: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not to keep the template structures removed by this set around for future reinstatement. This can be used to avoid throwing away and recreating components when hiding them. Defaults to false. */
  var keep: js.UndefOr[Boolean] = js.undefined
  
  /** When applied to an array keypath, whether or not to move the existing elements and their associated template around or simply replace them. Defaults to replacement (false). */
  var shuffle: js.UndefOr[Shuffler] = js.undefined
}
object SetOpts {
  
  inline def apply(): SetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOpts]
  }
  
  extension [Self <: SetOpts](x: Self) {
    
    inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    
    inline def setKeep(value: Boolean): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
    
    inline def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
    
    inline def setShuffle(value: Shuffler): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
    
    inline def setShuffleFunction2(value: (/* left */ Any, /* right */ Any) => `1` | `0` | `-1`): Self = StObject.set(x, "shuffle", js.Any.fromFunction2(value))
    
    inline def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
  }
}
