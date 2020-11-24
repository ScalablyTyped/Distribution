package typings.reactNativeFirebase.mod.RNFirebase.functions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An HttpsCallableResult wraps a single result from a function call.
  */
@js.native
trait HttpsCallableResult[R] extends js.Object {
  
  val data: R = js.native
}
object HttpsCallableResult {
  
  @scala.inline
  def apply[R](data: R): HttpsCallableResult[R] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpsCallableResult[R]]
  }
  
  @scala.inline
  implicit class HttpsCallableResultOps[Self <: HttpsCallableResult[_], R] (val x: Self with HttpsCallableResult[R]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: R): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
