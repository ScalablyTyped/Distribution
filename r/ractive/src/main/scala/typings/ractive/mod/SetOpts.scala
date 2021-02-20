package typings.ractive.mod

import typings.ractive.ractiveNumbers.`-1`
import typings.ractive.ractiveNumbers.`0`
import typings.ractive.ractiveNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOpts extends StObject {
  
  /** Whether or not to merge the given value into the existing data or replace the existing data. Defaults to replacing the existing data (false). */
  var deep: js.UndefOr[Boolean] = js.native
  
  /** Whether or not to keep the template sturctures removed by this set around for future reinstatement. This can be used to avoid throwing away and recreating components when hiding them. Defaults to false. */
  var keep: js.UndefOr[Boolean] = js.native
  
  /** When applied to an array keypath, whether or not to move the existing elements and their associated template around or simply replace them. Defaults to replacement (false). */
  var shuffle: js.UndefOr[Shuffler] = js.native
}
object SetOpts {
  
  @scala.inline
  def apply(): SetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOpts]
  }
  
  @scala.inline
  implicit class SetOptsMutableBuilder[Self <: SetOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    
    @scala.inline
    def setKeep(value: Boolean): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
    
    @scala.inline
    def setShuffle(value: Shuffler): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShuffleFunction2(value: (/* left */ js.Any, /* right */ js.Any) => `1` | `0` | `-1`): Self = StObject.set(x, "shuffle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
  }
}
