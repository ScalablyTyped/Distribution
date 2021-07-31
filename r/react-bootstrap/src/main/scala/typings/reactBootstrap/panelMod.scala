package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.SelectCallback
import typings.reactBootstrap.mod.TransitionCallbacks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod {
  
  @JSImport("react-bootstrap/lib/Panel", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PanelProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/Panel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Panel", "Body")
  @js.native
  class Body ()
    extends typings.reactBootstrap.panelBodyMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Panel", "Body")
  @js.native
  def Body: Instantiable0[typings.reactBootstrap.panelBodyMod.^] = js.native
  @scala.inline
  def Body_=(x: Instantiable0[typings.reactBootstrap.panelBodyMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Panel", "Collapse")
  @js.native
  class Collapse ()
    extends typings.reactBootstrap.panelCollapseMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Panel", "Collapse")
  @js.native
  def Collapse: Instantiable0[typings.reactBootstrap.panelCollapseMod.^] = js.native
  @scala.inline
  def Collapse_=(x: Instantiable0[typings.reactBootstrap.panelCollapseMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collapse")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Panel", "Footer")
  @js.native
  class Footer ()
    extends typings.reactBootstrap.panelFooterMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Panel", "Footer")
  @js.native
  def Footer: Instantiable0[typings.reactBootstrap.panelFooterMod.^] = js.native
  @scala.inline
  def Footer_=(x: Instantiable0[typings.reactBootstrap.panelFooterMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Panel", "Heading")
  @js.native
  class Heading ()
    extends typings.reactBootstrap.panelHeadingMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Panel", "Heading")
  @js.native
  def Heading: Instantiable0[typings.reactBootstrap.panelHeadingMod.^] = js.native
  @scala.inline
  def Heading_=(x: Instantiable0[typings.reactBootstrap.panelHeadingMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Heading")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Panel", "Title")
  @js.native
  class Title ()
    extends typings.reactBootstrap.panelTitleMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Panel", "Title")
  @js.native
  def Title: Instantiable0[typings.reactBootstrap.panelTitleMod.^] = js.native
  @scala.inline
  def Title_=(x: Instantiable0[typings.reactBootstrap.panelTitleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Panel", "Toggle")
  @js.native
  class Toggle ()
    extends typings.reactBootstrap.panelToggleMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Panel", "Toggle")
  @js.native
  def Toggle: Instantiable0[typings.reactBootstrap.panelToggleMod.^] = js.native
  @scala.inline
  def Toggle_=(x: Instantiable0[typings.reactBootstrap.panelToggleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Toggle")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Panel
    extends Component[PanelProps, js.Object, js.Any]
  
  trait PanelProps
    extends StObject
       with TransitionCallbacks
       with HTMLProps[Panel] {
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var defaultExpanded: js.UndefOr[Boolean] = js.undefined
    
    var eventKey: js.UndefOr[js.Any] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    @JSName("onSelect")
    var onSelect_PanelProps: js.UndefOr[SelectCallback] = js.undefined
    
    var onToggle: js.UndefOr[SelectCallback] = js.undefined
  }
  object PanelProps {
    
    @scala.inline
    def apply(): PanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelProps]
    }
    
    @scala.inline
    implicit class PanelPropsMutableBuilder[Self <: PanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      @scala.inline
      def setDefaultExpanded(value: Boolean): Self = StObject.set(x, "defaultExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExpandedUndefined: Self = StObject.set(x, "defaultExpanded", js.undefined)
      
      @scala.inline
      def setEventKey(value: js.Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnToggle(value: SelectCallback): Self = StObject.set(x, "onToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    }
  }
}
