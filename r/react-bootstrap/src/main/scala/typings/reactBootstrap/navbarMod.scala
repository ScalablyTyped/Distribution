package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactType
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarMod {
  
  @JSImport("react-bootstrap/lib/Navbar", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[NavbarProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/Navbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Brand")
  @js.native
  class Brand ()
    extends typings.reactBootstrap.navbarBrandMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Brand")
  @js.native
  def Brand: Instantiable0[typings.reactBootstrap.navbarBrandMod.^] = js.native
  @scala.inline
  def Brand_=(x: Instantiable0[typings.reactBootstrap.navbarBrandMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Brand")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Collapse")
  @js.native
  class Collapse ()
    extends typings.reactBootstrap.navbarCollapseMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Collapse")
  @js.native
  def Collapse: Instantiable0[typings.reactBootstrap.navbarCollapseMod.^] = js.native
  @scala.inline
  def Collapse_=(x: Instantiable0[typings.reactBootstrap.navbarCollapseMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collapse")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Form")
  @js.native
  class Form ()
    extends Component[NavbarFormProps, js.Object, js.Any]
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Form")
  @js.native
  def Form: Instantiable0[NavbarForm] = js.native
  @scala.inline
  def Form_=(x: Instantiable0[NavbarForm]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Form")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Header")
  @js.native
  class Header ()
    extends typings.reactBootstrap.navbarHeaderMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Header")
  @js.native
  def Header: Instantiable0[typings.reactBootstrap.navbarHeaderMod.^] = js.native
  @scala.inline
  def Header_=(x: Instantiable0[typings.reactBootstrap.navbarHeaderMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Link")
  @js.native
  class Link ()
    extends Component[NavbarLinkProps, js.Object, js.Any]
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Link")
  @js.native
  def Link: Instantiable0[NavbarLink] = js.native
  @scala.inline
  def Link_=(x: Instantiable0[NavbarLink]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Text")
  @js.native
  class Text ()
    extends Component[NavbarTextProps, js.Object, js.Any]
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Text")
  @js.native
  def Text: Instantiable0[NavbarText] = js.native
  @scala.inline
  def Text_=(x: Instantiable0[NavbarText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Toggle")
  @js.native
  class Toggle ()
    extends typings.reactBootstrap.navbarToggleMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Toggle")
  @js.native
  def Toggle: Instantiable0[typings.reactBootstrap.navbarToggleMod.^] = js.native
  @scala.inline
  def Toggle_=(x: Instantiable0[typings.reactBootstrap.navbarToggleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Toggle")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Navbar
    extends Component[NavbarProps, js.Object, js.Any]
  
  @js.native
  trait NavbarForm
    extends Component[NavbarFormProps, js.Object, js.Any]
  
  trait NavbarFormProps
    extends StObject
       with HTMLProps[NavbarForm] {
    
    var componentClass: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    var pullLeft: js.UndefOr[Boolean] = js.undefined
    
    var pullRight: js.UndefOr[Boolean] = js.undefined
  }
  object NavbarFormProps {
    
    @scala.inline
    def apply(): NavbarFormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarFormProps]
    }
    
    @scala.inline
    implicit class NavbarFormPropsMutableBuilder[Self <: NavbarFormProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentClass(value: ReactType[js.Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      @scala.inline
      def setPullLeft(value: Boolean): Self = StObject.set(x, "pullLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullLeftUndefined: Self = StObject.set(x, "pullLeft", js.undefined)
      
      @scala.inline
      def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
    }
  }
  
  @js.native
  trait NavbarLink
    extends Component[NavbarLinkProps, js.Object, js.Any]
  
  /**
    * the classes below aren't present in lib/
    */
  trait NavbarLinkProps
    extends StObject
       with HTMLProps[NavbarLink] {
    
    @JSName("href")
    var href_NavbarLinkProps: String
    
    @JSName("onClick")
    var onClick_NavbarLinkProps: js.UndefOr[MouseEventHandler[js.Any]] = js.undefined
  }
  object NavbarLinkProps {
    
    @scala.inline
    def apply(href: String): NavbarLinkProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavbarLinkProps]
    }
    
    @scala.inline
    implicit class NavbarLinkPropsMutableBuilder[Self <: NavbarLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: MouseEvent[js.Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  trait NavbarProps
    extends StObject
       with HTMLProps[Navbar] {
    
    var brand: js.UndefOr[js.Any] = js.undefined
    
    // TODO: Add more specific type
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var collapseOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var componentClass: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    var defaultNavExpanded: js.UndefOr[Boolean] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var fixedBottom: js.UndefOr[Boolean] = js.undefined
    
    var fixedTop: js.UndefOr[Boolean] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    var onToggle: js.UndefOr[js.Function] = js.undefined
    
    var staticTop: js.UndefOr[Boolean] = js.undefined
    
    var toggleButton: js.UndefOr[js.Any] = js.undefined
    
    // TODO: Add more specific type
    var toggleNavKey: js.UndefOr[String | Double] = js.undefined
  }
  object NavbarProps {
    
    @scala.inline
    def apply(): NavbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarProps]
    }
    
    @scala.inline
    implicit class NavbarPropsMutableBuilder[Self <: NavbarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrand(value: js.Any): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      @scala.inline
      def setCollapseOnSelect(value: Boolean): Self = StObject.set(x, "collapseOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseOnSelectUndefined: Self = StObject.set(x, "collapseOnSelect", js.undefined)
      
      @scala.inline
      def setComponentClass(value: ReactType[js.Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      @scala.inline
      def setDefaultNavExpanded(value: Boolean): Self = StObject.set(x, "defaultNavExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNavExpandedUndefined: Self = StObject.set(x, "defaultNavExpanded", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setFixedBottom(value: Boolean): Self = StObject.set(x, "fixedBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedBottomUndefined: Self = StObject.set(x, "fixedBottom", js.undefined)
      
      @scala.inline
      def setFixedTop(value: Boolean): Self = StObject.set(x, "fixedTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedTopUndefined: Self = StObject.set(x, "fixedTop", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setOnToggle(value: js.Function): Self = StObject.set(x, "onToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setStaticTop(value: Boolean): Self = StObject.set(x, "staticTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticTopUndefined: Self = StObject.set(x, "staticTop", js.undefined)
      
      @scala.inline
      def setToggleButton(value: js.Any): Self = StObject.set(x, "toggleButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleButtonUndefined: Self = StObject.set(x, "toggleButton", js.undefined)
      
      @scala.inline
      def setToggleNavKey(value: String | Double): Self = StObject.set(x, "toggleNavKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleNavKeyUndefined: Self = StObject.set(x, "toggleNavKey", js.undefined)
    }
  }
  
  @js.native
  trait NavbarText
    extends Component[NavbarTextProps, js.Object, js.Any]
  
  trait NavbarTextProps
    extends StObject
       with HTMLProps[NavbarText] {
    
    var pullRight: js.UndefOr[Boolean] = js.undefined
  }
  object NavbarTextProps {
    
    @scala.inline
    def apply(): NavbarTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarTextProps]
    }
    
    @scala.inline
    implicit class NavbarTextPropsMutableBuilder[Self <: NavbarTextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
    }
  }
}
