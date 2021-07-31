package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("react-bootstrap/lib/Pagination", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PaginationProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/Pagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Pagination", "Ellipsis")
  @js.native
  class Ellipsis ()
    extends typings.reactBootstrap.paginationEllipsisMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Pagination", "Ellipsis")
  @js.native
  def Ellipsis: Instantiable0[typings.reactBootstrap.paginationEllipsisMod.^] = js.native
  @scala.inline
  def Ellipsis_=(x: Instantiable0[typings.reactBootstrap.paginationEllipsisMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ellipsis")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Pagination", "First")
  @js.native
  class First ()
    extends typings.reactBootstrap.paginationFirstMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Pagination", "First")
  @js.native
  def First: Instantiable0[typings.reactBootstrap.paginationFirstMod.^] = js.native
  @scala.inline
  def First_=(x: Instantiable0[typings.reactBootstrap.paginationFirstMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("First")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Pagination", "Item")
  @js.native
  class Item ()
    extends typings.reactBootstrap.paginationItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Pagination", "Item")
  @js.native
  def Item: Instantiable0[typings.reactBootstrap.paginationItemMod.^] = js.native
  @scala.inline
  def Item_=(x: Instantiable0[typings.reactBootstrap.paginationItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Pagination", "Last")
  @js.native
  class Last ()
    extends typings.reactBootstrap.paginationLastMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Pagination", "Last")
  @js.native
  def Last: Instantiable0[typings.reactBootstrap.paginationLastMod.^] = js.native
  @scala.inline
  def Last_=(x: Instantiable0[typings.reactBootstrap.paginationLastMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Last")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Pagination", "Next")
  @js.native
  class Next ()
    extends typings.reactBootstrap.paginationNextMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Pagination", "Next")
  @js.native
  def Next: Instantiable0[typings.reactBootstrap.paginationNextMod.^] = js.native
  @scala.inline
  def Next_=(x: Instantiable0[typings.reactBootstrap.paginationNextMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Next")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Pagination", "Prev")
  @js.native
  class Prev ()
    extends typings.reactBootstrap.paginationPrevMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Pagination", "Prev")
  @js.native
  def Prev: Instantiable0[typings.reactBootstrap.paginationPrevMod.^] = js.native
  @scala.inline
  def Prev_=(x: Instantiable0[typings.reactBootstrap.paginationPrevMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Prev")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Pagination
    extends Component[PaginationProps, js.Object, js.Any]
  
  trait PaginationProps
    extends StObject
       with HTMLProps[Pagination] {
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
  }
  object PaginationProps {
    
    @scala.inline
    def apply(): PaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit class PaginationPropsMutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
    }
  }
}
