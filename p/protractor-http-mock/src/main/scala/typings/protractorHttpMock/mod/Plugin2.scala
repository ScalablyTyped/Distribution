package typings.protractorHttpMock.mod

import typings.protractorHttpMock.mod.requests.PostData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Plugin for custom matching logic with 2 generic types.
  */
@js.native
trait Plugin2[T1, T2] extends js.Object {
  
  /**
    * Match function.
    * Return a truthy value to indicate successfull match.
    *
    * @param mockRequest The mock to compare request with.
    * @param requestConfig The request object to compare mock with.
    */
  def `match`[O /* <: PostData[T1, T2] */](mockRequest: O, requestConfig: O): Boolean = js.native
}
object Plugin2 {
  
  @scala.inline
  def apply[T1, T2](`match`: (js.Any, js.Any) => Boolean): Plugin2[T1, T2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Plugin2[T1, T2]]
  }
  
  @scala.inline
  implicit class Plugin2Ops[Self <: Plugin2[_, _], T1, T2] (val x: Self with (Plugin2[T1, T2])) extends AnyVal {
    
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
    def setMatch(value: (js.Any, js.Any) => Boolean): Self = this.set("match", js.Any.fromFunction2(value))
  }
}
