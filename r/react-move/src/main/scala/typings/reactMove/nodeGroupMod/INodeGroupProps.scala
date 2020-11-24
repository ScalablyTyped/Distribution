package typings.reactMove.nodeGroupMod

import typings.react.mod.ReactElement
import typings.reactMove.mod.GetInterpolator
import typings.reactMove.mod.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INodeGroupProps extends js.Object {
  
  def children(nodes: js.Array[_]): ReactElement = js.native
  
  var data: js.Array[_] = js.native
  
  var enter: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.native
  
  var interpolation: js.UndefOr[GetInterpolator] = js.native
  
  def keyAccessor(data: js.Any, index: Double): String | Double = js.native
  
  var leave: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.native
  
  def start(data: js.Any, index: Double): HashMap = js.native
  
  var update: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.native
}
object INodeGroupProps {
  
  @scala.inline
  def apply(
    children: js.Array[_] => ReactElement,
    data: js.Array[_],
    keyAccessor: (js.Any, Double) => String | Double,
    start: (js.Any, Double) => HashMap
  ): INodeGroupProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), data = data.asInstanceOf[js.Any], keyAccessor = js.Any.fromFunction2(keyAccessor), start = js.Any.fromFunction2(start))
    __obj.asInstanceOf[INodeGroupProps]
  }
  
  @scala.inline
  implicit class INodeGroupPropsOps[Self <: INodeGroupProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: js.Array[_] => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAccessor(value: (js.Any, Double) => String | Double): Self = this.set("keyAccessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStart(value: (js.Any, Double) => HashMap): Self = this.set("start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnter(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): Self = this.set("enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setInterpolation(
      value: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => js.Function1[/* t */ Double, js.Any]
    ): Self = this.set("interpolation", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    
    @scala.inline
    def setLeave(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): Self = this.set("leave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
    
    @scala.inline
    def setUpdate(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): Self = this.set("update", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
