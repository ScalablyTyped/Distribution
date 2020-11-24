package typings.reactFromDom.mod

import typings.react.mod.ReactNode
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends js.Object {
  
  def condition(node: Node, key: String, level: Double): Boolean = js.native
  
  var post: js.UndefOr[js.Function3[/* node */ Node, /* key */ String, /* level */ Double, ReactNode]] = js.native
  
  var pre: js.UndefOr[js.Function3[/* node */ Node, /* key */ String, /* level */ Double, Node]] = js.native
}
object Action {
  
  @scala.inline
  def apply(condition: (Node, String, Double) => Boolean): Action = {
    val __obj = js.Dynamic.literal(condition = js.Any.fromFunction3(condition))
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: (Node, String, Double) => Boolean): Self = this.set("condition", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPost(value: (/* node */ Node, /* key */ String, /* level */ Double) => ReactNode): Self = this.set("post", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setPre(value: (/* node */ Node, /* key */ String, /* level */ Double) => Node): Self = this.set("pre", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
  }
}
