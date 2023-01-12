package typings.storybookApi.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headline extends StObject {
  
  var headline: String
  
  var subHeadline: js.UndefOr[String | ReactNode] = js.undefined
}
object Headline {
  
  inline def apply(headline: String): Headline = {
    val __obj = js.Dynamic.literal(headline = headline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Headline] (val x: Self) extends AnyVal {
    
    inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    inline def setSubHeadline(value: String | ReactNode): Self = StObject.set(x, "subHeadline", value.asInstanceOf[js.Any])
    
    inline def setSubHeadlineUndefined: Self = StObject.set(x, "subHeadline", js.undefined)
  }
}
