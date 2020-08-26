package typings.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserBlock extends js.Object {
  def parse(str: String, options: Options, env: Env, tokens: js.Array[Token]): Unit = js.native
  def tokenize(state: StateBlock, startLine: Double, endLine: Double): Unit = js.native
}

object ParserBlock {
  @scala.inline
  def apply(
    parse: (String, Options, Env, js.Array[Token]) => Unit,
    tokenize: (StateBlock, Double, Double) => Unit
  ): ParserBlock = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4(parse), tokenize = js.Any.fromFunction3(tokenize))
    __obj.asInstanceOf[ParserBlock]
  }
  @scala.inline
  implicit class ParserBlockOps[Self <: ParserBlock] (val x: Self) extends AnyVal {
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
    def setParse(value: (String, Options, Env, js.Array[Token]) => Unit): Self = this.set("parse", js.Any.fromFunction4(value))
    @scala.inline
    def setTokenize(value: (StateBlock, Double, Double) => Unit): Self = this.set("tokenize", js.Any.fromFunction3(value))
  }
  
}

