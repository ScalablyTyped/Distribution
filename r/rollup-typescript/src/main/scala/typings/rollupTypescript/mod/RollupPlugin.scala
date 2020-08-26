package typings.rollupTypescript.mod

import typings.rollupTypescript.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupPlugin extends js.Object {
  def load(id: String): String = js.native
  def resolveId(importee: String, importer: String): js.Any = js.native
  def transform(code: String, id: String): Code = js.native
}

object RollupPlugin {
  @scala.inline
  def apply(load: String => String, resolveId: (String, String) => js.Any, transform: (String, String) => Code): RollupPlugin = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), resolveId = js.Any.fromFunction2(resolveId), transform = js.Any.fromFunction2(transform))
    __obj.asInstanceOf[RollupPlugin]
  }
  @scala.inline
  implicit class RollupPluginOps[Self <: RollupPlugin] (val x: Self) extends AnyVal {
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
    def setLoad(value: String => String): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def setResolveId(value: (String, String) => js.Any): Self = this.set("resolveId", js.Any.fromFunction2(value))
    @scala.inline
    def setTransform(value: (String, String) => Code): Self = this.set("transform", js.Any.fromFunction2(value))
  }
  
}

