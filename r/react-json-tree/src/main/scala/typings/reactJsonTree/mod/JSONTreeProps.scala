package typings.reactJsonTree.mod

import typings.react.mod.Props
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONTreeProps extends Props[JSONTreeComponent] {
  
  var collectionLimit: js.UndefOr[Double] = js.native
  
  var data: js.Array[_] | js.Object = js.native
  
  var getItemString: js.UndefOr[
    js.Function4[
      /* type */ String, 
      /* data */ js.Array[_] | js.Object, 
      /* itemType */ String, 
      /* itemString */ String, 
      Element
    ]
  ] = js.native
  
  var hideRoot: js.UndefOr[Boolean] = js.native
  
  var invertTheme: js.UndefOr[Boolean] = js.native
  
  var isCustomNode: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var keyPath: js.UndefOr[js.Array[String | Double]] = js.native
  
  var labelRenderer: js.UndefOr[
    js.Function4[
      /* keyPath */ js.Array[String], 
      /* nodeType */ js.UndefOr[String], 
      /* expanded */ js.UndefOr[Boolean], 
      /* expandable */ js.UndefOr[Boolean], 
      Element
    ]
  ] = js.native
  
  var postprocessValue: js.UndefOr[js.Function1[/* raw */ String, Element]] = js.native
  
  var shouldExpandNode: js.UndefOr[
    js.Function3[
      /* keyPath */ js.Array[String | Double], 
      /* data */ js.Array[_] | js.Object, 
      /* level */ Double, 
      Boolean
    ]
  ] = js.native
  
  var sortObjectKeys: js.UndefOr[js.Function | Boolean] = js.native
  
  var theme: js.UndefOr[js.Object | String] = js.native
  
  var valueRenderer: js.UndefOr[
    js.Function3[
      /* displayValue */ String | Double, 
      /* rawValue */ js.UndefOr[String | Double | Boolean | Null], 
      /* repeated */ String | Double, 
      Element
    ]
  ] = js.native
}
object JSONTreeProps {
  
  @scala.inline
  def apply(data: js.Array[_] | js.Object): JSONTreeProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONTreeProps]
  }
  
  @scala.inline
  implicit class JSONTreePropsOps[Self <: JSONTreeProps] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_] | js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionLimit(value: Double): Self = this.set("collectionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionLimit: Self = this.set("collectionLimit", js.undefined)
    
    @scala.inline
    def setGetItemString(
      value: (/* type */ String, /* data */ js.Array[_] | js.Object, /* itemType */ String, /* itemString */ String) => Element
    ): Self = this.set("getItemString", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteGetItemString: Self = this.set("getItemString", js.undefined)
    
    @scala.inline
    def setHideRoot(value: Boolean): Self = this.set("hideRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideRoot: Self = this.set("hideRoot", js.undefined)
    
    @scala.inline
    def setInvertTheme(value: Boolean): Self = this.set("invertTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertTheme: Self = this.set("invertTheme", js.undefined)
    
    @scala.inline
    def setIsCustomNode(value: () => Boolean): Self = this.set("isCustomNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsCustomNode: Self = this.set("isCustomNode", js.undefined)
    
    @scala.inline
    def setKeyPathVarargs(value: (String | Double)*): Self = this.set("keyPath", js.Array(value :_*))
    
    @scala.inline
    def setKeyPath(value: js.Array[String | Double]): Self = this.set("keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPath: Self = this.set("keyPath", js.undefined)
    
    @scala.inline
    def setLabelRenderer(
      value: (/* keyPath */ js.Array[String], /* nodeType */ js.UndefOr[String], /* expanded */ js.UndefOr[Boolean], /* expandable */ js.UndefOr[Boolean]) => Element
    ): Self = this.set("labelRenderer", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteLabelRenderer: Self = this.set("labelRenderer", js.undefined)
    
    @scala.inline
    def setPostprocessValue(value: /* raw */ String => Element): Self = this.set("postprocessValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePostprocessValue: Self = this.set("postprocessValue", js.undefined)
    
    @scala.inline
    def setShouldExpandNode(
      value: (/* keyPath */ js.Array[String | Double], /* data */ js.Array[_] | js.Object, /* level */ Double) => Boolean
    ): Self = this.set("shouldExpandNode", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteShouldExpandNode: Self = this.set("shouldExpandNode", js.undefined)
    
    @scala.inline
    def setSortObjectKeys(value: js.Function | Boolean): Self = this.set("sortObjectKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortObjectKeys: Self = this.set("sortObjectKeys", js.undefined)
    
    @scala.inline
    def setTheme(value: js.Object | String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setValueRenderer(
      value: (/* displayValue */ String | Double, /* rawValue */ js.UndefOr[String | Double | Boolean | Null], /* repeated */ String | Double) => Element
    ): Self = this.set("valueRenderer", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteValueRenderer: Self = this.set("valueRenderer", js.undefined)
  }
}
