package typings.solidReact.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProps extends js.Object {
  
  var children: js.UndefOr[js.Function2[/* listItem */ LDflexValue, /* index */ Double, Element]] = js.native
  
  var container: js.UndefOr[js.Function1[/* items */ Element, Element]] = js.native
  
  // dtslint does not appear to understand that `T` is used in the type guard.
  // See https://github.com/Microsoft/dtslint/issues/228
  // tslint:disable-next-line no-unnecessary-generics
  var filter: js.UndefOr[
    js.Function3[
      /* item */ LDflexValue, 
      /* index */ Double, 
      /* array */ js.Array[LDflexValue], 
      /* is @solid/react.@solid/react.LDflexValue */ Boolean
    ]
  ] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var src: String = js.native
}
object ListProps {
  
  @scala.inline
  def apply(src: String): ListProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
  
  @scala.inline
  implicit class ListPropsOps[Self <: ListProps] (val x: Self) extends AnyVal {
    
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: (/* listItem */ LDflexValue, /* index */ Double) => Element): Self = this.set("children", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setContainer(value: /* items */ Element => Element): Self = this.set("container", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setFilter(
      value: (/* item */ LDflexValue, /* index */ Double, /* array */ js.Array[LDflexValue]) => /* is @solid/react.@solid/react.LDflexValue */ Boolean
    ): Self = this.set("filter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
