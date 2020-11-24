package typings.srp.mod

import typings.bignum.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Params_ extends js.Object {
  
  var N: ^ = js.native
  
  var N_length_bits: Double = js.native
  
  var g: ^ = js.native
  
  var hash: String = js.native
}
object Params_ {
  
  @scala.inline
  def apply(N: ^, N_length_bits: Double, g: ^, hash: String): Params_ = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], N_length_bits = N_length_bits.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params_]
  }
  
  @scala.inline
  implicit class Params_Ops[Self <: Params_] (val x: Self) extends AnyVal {
    
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
    def setN(value: ^): Self = this.set("N", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN_length_bits(value: Double): Self = this.set("N_length_bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: ^): Self = this.set("g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
  }
}
