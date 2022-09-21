package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaMod {
  
  @JSImport("react-bootstrap/lib/Media", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[MediaProps, js.Object, Any]
  @JSImport("react-bootstrap/lib/Media", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Body")
  @js.native
  open class Body ()
    extends typings.reactBootstrap.mediaBodyMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Body")
  @js.native
  def Body: Instantiable0[typings.reactBootstrap.mediaBodyMod.^] = js.native
  inline def Body_=(x: Instantiable0[typings.reactBootstrap.mediaBodyMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Heading")
  @js.native
  open class Heading ()
    extends typings.reactBootstrap.mediaHeadingMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Heading")
  @js.native
  def Heading: Instantiable0[typings.reactBootstrap.mediaHeadingMod.^] = js.native
  inline def Heading_=(x: Instantiable0[typings.reactBootstrap.mediaHeadingMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Heading")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Left")
  @js.native
  open class Left ()
    extends typings.reactBootstrap.mediaLeftMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Left")
  @js.native
  def Left: Instantiable0[typings.reactBootstrap.mediaLeftMod.^] = js.native
  inline def Left_=(x: Instantiable0[typings.reactBootstrap.mediaLeftMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Left")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "List")
  @js.native
  open class List ()
    extends typings.reactBootstrap.mediaListMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "List")
  @js.native
  def List: Instantiable0[typings.reactBootstrap.mediaListMod.^] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "ListItem")
  @js.native
  open class ListItem ()
    extends typings.reactBootstrap.mediaListItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "ListItem")
  @js.native
  def ListItem: Instantiable0[typings.reactBootstrap.mediaListItemMod.^] = js.native
  inline def ListItem_=(x: Instantiable0[typings.reactBootstrap.mediaListItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ListItem")(x.asInstanceOf[js.Any])
  
  inline def List_=(x: Instantiable0[typings.reactBootstrap.mediaListMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("List")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Right")
  @js.native
  open class Right ()
    extends typings.reactBootstrap.mediaRightMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Right")
  @js.native
  def Right: Instantiable0[typings.reactBootstrap.mediaRightMod.^] = js.native
  inline def Right_=(x: Instantiable0[typings.reactBootstrap.mediaRightMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Right")(x.asInstanceOf[js.Any])
  
  type Media = Component[MediaProps, js.Object, Any]
  
  trait MediaProps
    extends StObject
       with HTMLProps[Media] {
    
    var componentClass: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object MediaProps {
    
    inline def apply(): MediaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaProps]
    }
    
    extension [Self <: MediaProps](x: Self) {
      
      inline def setComponentClass(value: ElementType[Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
