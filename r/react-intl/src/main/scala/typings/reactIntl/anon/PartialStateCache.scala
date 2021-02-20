package typings.reactIntl.anon

import typings.formatjsIntl.srcTypesMod.IntlCache
import typings.reactIntl.providerMod.OptionalIntlConfig
import typings.reactIntl.typesMod.IntlShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-intl.react-intl/lib/src/components/provider.State> */
@js.native
trait PartialStateCache extends StObject {
  
  var cache: js.UndefOr[IntlCache] = js.native
  
  var intl: js.UndefOr[IntlShape] = js.native
  
  var prevConfig: js.UndefOr[OptionalIntlConfig] = js.native
}
object PartialStateCache {
  
  @scala.inline
  def apply(): PartialStateCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateCache]
  }
  
  @scala.inline
  implicit class PartialStateCacheMutableBuilder[Self <: PartialStateCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: IntlCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setIntl(value: IntlShape): Self = StObject.set(x, "intl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntlUndefined: Self = StObject.set(x, "intl", js.undefined)
    
    @scala.inline
    def setPrevConfig(value: OptionalIntlConfig): Self = StObject.set(x, "prevConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevConfigUndefined: Self = StObject.set(x, "prevConfig", js.undefined)
  }
}
