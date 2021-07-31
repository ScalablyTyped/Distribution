package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaMod {
  
  @JSImport("react-bootstrap/lib/Media", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[MediaProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/Media", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Body")
  @js.native
  class Body ()
    extends typings.reactBootstrap.mediaBodyMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Body")
  @js.native
  def Body: Instantiable0[typings.reactBootstrap.mediaBodyMod.^] = js.native
  @scala.inline
  def Body_=(x: Instantiable0[typings.reactBootstrap.mediaBodyMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Heading")
  @js.native
  class Heading ()
    extends typings.reactBootstrap.mediaHeadingMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Heading")
  @js.native
  def Heading: Instantiable0[typings.reactBootstrap.mediaHeadingMod.^] = js.native
  @scala.inline
  def Heading_=(x: Instantiable0[typings.reactBootstrap.mediaHeadingMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Heading")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Left")
  @js.native
  class Left ()
    extends typings.reactBootstrap.mediaLeftMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Left")
  @js.native
  def Left: Instantiable0[typings.reactBootstrap.mediaLeftMod.^] = js.native
  @scala.inline
  def Left_=(x: Instantiable0[typings.reactBootstrap.mediaLeftMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Left")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "List")
  @js.native
  class List ()
    extends typings.reactBootstrap.mediaListMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "List")
  @js.native
  def List: Instantiable0[typings.reactBootstrap.mediaListMod.^] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "ListItem")
  @js.native
  class ListItem ()
    extends typings.reactBootstrap.mediaListItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "ListItem")
  @js.native
  def ListItem: Instantiable0[typings.reactBootstrap.mediaListItemMod.^] = js.native
  @scala.inline
  def ListItem_=(x: Instantiable0[typings.reactBootstrap.mediaListItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ListItem")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def List_=(x: Instantiable0[typings.reactBootstrap.mediaListMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("List")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Right")
  @js.native
  class Right ()
    extends typings.reactBootstrap.mediaRightMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Right")
  @js.native
  def Right: Instantiable0[typings.reactBootstrap.mediaRightMod.^] = js.native
  @scala.inline
  def Right_=(x: Instantiable0[typings.reactBootstrap.mediaRightMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Right")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Media
    extends Component[MediaProps, js.Object, js.Any]
  
  trait MediaProps
    extends StObject
       with HTMLProps[Media] {
    
    var componentClass: js.UndefOr[ReactType[js.Any]] = js.undefined
  }
  object MediaProps {
    
    @scala.inline
    def apply(): MediaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaProps]
    }
    
    @scala.inline
    implicit class MediaPropsMutableBuilder[Self <: MediaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentClass(value: ReactType[js.Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
