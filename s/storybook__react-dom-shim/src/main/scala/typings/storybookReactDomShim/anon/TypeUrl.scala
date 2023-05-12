package typings.storybookReactDomShim.anon

import typings.storybookReactDomShim.distPresetMod.LiteralUnion
import typings.storybookReactDomShim.storybookReactDomShimStrings.corporation
import typings.storybookReactDomShim.storybookReactDomShimStrings.foundation
import typings.storybookReactDomShim.storybookReactDomShimStrings.github
import typings.storybookReactDomShim.storybookReactDomShimStrings.individual
import typings.storybookReactDomShim.storybookReactDomShimStrings.opencollective
import typings.storybookReactDomShim.storybookReactDomShimStrings.patreon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeUrl extends StObject {
  
  /**
  			The type of funding.
  			*/
  var `type`: js.UndefOr[
    LiteralUnion[github | opencollective | patreon | individual | foundation | corporation, String]
  ] = js.undefined
  
  /**
  			The URL to the funding page.
  			*/
  var url: String
}
object TypeUrl {
  
  inline def apply(url: String): TypeUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeUrl] (val x: Self) extends AnyVal {
    
    inline def setType(
      value: LiteralUnion[github | opencollective | patreon | individual | foundation | corporation, String]
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
