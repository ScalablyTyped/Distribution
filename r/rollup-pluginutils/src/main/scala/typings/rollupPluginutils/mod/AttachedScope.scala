package typings.rollupPluginutils.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachedScope extends js.Object {
  
  def addDeclaration(node: Node, isBlockDeclaration: Boolean, isVar: Boolean): Unit = js.native
  
  def contains(name: String): Boolean = js.native
  
  var declarations: StringDictionary[Boolean] = js.native
  
  var isBlockScope: Boolean = js.native
  
  var parent: js.UndefOr[AttachedScope] = js.native
}
object AttachedScope {
  
  @scala.inline
  def apply(
    addDeclaration: (Node, Boolean, Boolean) => Unit,
    contains: String => Boolean,
    declarations: StringDictionary[Boolean],
    isBlockScope: Boolean
  ): AttachedScope = {
    val __obj = js.Dynamic.literal(addDeclaration = js.Any.fromFunction3(addDeclaration), contains = js.Any.fromFunction1(contains), declarations = declarations.asInstanceOf[js.Any], isBlockScope = isBlockScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachedScope]
  }
  
  @scala.inline
  implicit class AttachedScopeOps[Self <: AttachedScope] (val x: Self) extends AnyVal {
    
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
    def setAddDeclaration(value: (Node, Boolean, Boolean) => Unit): Self = this.set("addDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def setContains(value: String => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeclarations(value: StringDictionary[Boolean]): Self = this.set("declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBlockScope(value: Boolean): Self = this.set("isBlockScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: AttachedScope): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
