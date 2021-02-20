package typings.stellarSdk.horizonApiMod.Horizon

import typings.stellarSdk.anon.Next
import typings.stellarSdk.anon.Records
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseCollection[T /* <: BaseResponse[scala.Nothing] */] extends StObject {
  
  var _embedded: Records[T] = js.native
  
  var _links: Next = js.native
}
object ResponseCollection {
  
  @scala.inline
  def apply[T /* <: BaseResponse[scala.Nothing] */](_embedded: Records[T], _links: Next): ResponseCollection[T] = {
    val __obj = js.Dynamic.literal(_embedded = _embedded.asInstanceOf[js.Any], _links = _links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCollection[T]]
  }
  
  @scala.inline
  implicit class ResponseCollectionMutableBuilder[Self <: ResponseCollection[_], T /* <: BaseResponse[scala.Nothing] */] (val x: Self with ResponseCollection[T]) extends AnyVal {
    
    @scala.inline
    def set_embedded(value: Records[T]): Self = StObject.set(x, "_embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: Next): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
