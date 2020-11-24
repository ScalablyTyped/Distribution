package typings.primus.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser extends js.Object {
  
  def decoder(data: js.Any, fn: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit = js.native
  
  def encoder(data: js.Any, fn: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit = js.native
}
object Parser {
  
  @scala.inline
  def apply(
    decoder: (js.Any, js.Function2[/* error */ Error, /* response */ js.Any, Unit]) => Unit,
    encoder: (js.Any, js.Function2[/* error */ Error, /* response */ js.Any, Unit]) => Unit
  ): Parser = {
    val __obj = js.Dynamic.literal(decoder = js.Any.fromFunction2(decoder), encoder = js.Any.fromFunction2(encoder))
    __obj.asInstanceOf[Parser]
  }
  
  @scala.inline
  implicit class ParserOps[Self <: Parser] (val x: Self) extends AnyVal {
    
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
    def setDecoder(value: (js.Any, js.Function2[/* error */ Error, /* response */ js.Any, Unit]) => Unit): Self = this.set("decoder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEncoder(value: (js.Any, js.Function2[/* error */ Error, /* response */ js.Any, Unit]) => Unit): Self = this.set("encoder", js.Any.fromFunction2(value))
  }
}
