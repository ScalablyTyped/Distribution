package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.SelectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerMod {
  
  @JSImport("react-bootstrap/lib/Pager", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PagerProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/Pager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Pager", "Item")
  @js.native
  class Item ()
    extends typings.reactBootstrap.pagerItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Pager", "Item")
  @js.native
  def Item: Instantiable0[typings.reactBootstrap.pagerItemMod.^] = js.native
  @scala.inline
  def Item_=(x: Instantiable0[typings.reactBootstrap.pagerItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Pager
    extends Component[PagerProps, js.Object, js.Any]
  
  @js.native
  trait PagerProps extends HTMLProps[Pager] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    @JSName("onSelect")
    var onSelect_PagerProps: js.UndefOr[SelectCallback] = js.native
  }
  object PagerProps {
    
    @scala.inline
    def apply(): PagerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerProps]
    }
    
    @scala.inline
    implicit class PagerPropsMutableBuilder[Self <: PagerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    }
  }
}
