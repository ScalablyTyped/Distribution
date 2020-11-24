package typings.reduxPersist.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transform[HSS, ESS, S, RS] extends js.Object {
  
  var in: TransformInbound[HSS, ESS, S] = js.native
  
  var out: TransformOutbound[ESS, HSS, RS] = js.native
}
object Transform {
  
  @scala.inline
  def apply[HSS, ESS, S, RS](
    in: (HSS, /* keyof S */ /* key */ String, S) => ESS,
    out: (ESS, /* keyof RS */ /* key */ String, RS) => HSS
  ): Transform[HSS, ESS, S, RS] = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction3(in), out = js.Any.fromFunction3(out))
    __obj.asInstanceOf[Transform[HSS, ESS, S, RS]]
  }
  
  @scala.inline
  implicit class TransformOps[Self <: Transform[_, _, _, _], HSS, ESS, S, RS] (val x: Self with (Transform[HSS, ESS, S, RS])) extends AnyVal {
    
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
    def setIn(value: (HSS, /* keyof S */ /* key */ String, S) => ESS): Self = this.set("in", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOut(value: (ESS, /* keyof RS */ /* key */ String, RS) => HSS): Self = this.set("out", js.Any.fromFunction3(value))
  }
}
