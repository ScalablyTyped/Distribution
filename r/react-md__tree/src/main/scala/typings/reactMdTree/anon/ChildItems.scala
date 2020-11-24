package typings.reactMdTree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildItems extends js.Object {
  
  var childItems: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @react-md/tree.@react-md/tree/types/useNestedTreeList.NestedTreeItem<T> */ js.Object
    ]
  ] = js.native
}
object ChildItems {
  
  @scala.inline
  def apply(): ChildItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildItems]
  }
  
  @scala.inline
  implicit class ChildItemsOps[Self <: ChildItems] (val x: Self) extends AnyVal {
    
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
    def setChildItemsVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @react-md/tree.@react-md/tree/types/useNestedTreeList.NestedTreeItem<T> */ js.Object)*
    ): Self = this.set("childItems", js.Array(value :_*))
    
    @scala.inline
    def setChildItems(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @react-md/tree.@react-md/tree/types/useNestedTreeList.NestedTreeItem<T> */ js.Object
        ]
    ): Self = this.set("childItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildItems: Self = this.set("childItems", js.undefined)
  }
}
