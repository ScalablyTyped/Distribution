package typings.reactFoundation

import typings.react.mod.AriaAttributes
import typings.react.mod.Booleanish
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.DOMAttributes
import typings.react.mod.HTMLAttributes
import typings.react.mod.StatelessComponent
import typings.react.reactStrings.decimal
import typings.react.reactStrings.email
import typings.react.reactStrings.inherit
import typings.react.reactStrings.no
import typings.react.reactStrings.none
import typings.react.reactStrings.numeric
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.react.reactStrings.search
import typings.react.reactStrings.tel
import typings.react.reactStrings.text
import typings.react.reactStrings.url
import typings.react.reactStrings.yes
import typings.reactFoundation.anon.AlignX
import typings.reactFoundation.anon.Breakpoint
import typings.reactFoundation.enumsMod.Breakpoints
import typings.reactFoundation.enumsMod.FloatTypes
import typings.reactFoundation.reactFoundationStrings.large
import typings.reactFoundation.reactFoundationStrings.medium
import typings.reactFoundation.topBarMod.TopBarProps
import typings.reactFoundation.utilsMod.FlexboxPropTypes
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveMod {
  
  @JSImport("react-foundation/components/responsive", "MenuIcon")
  @js.native
  val MenuIcon: StatelessComponent[MenuIconProps] = js.native
  
  @JSImport("react-foundation/components/responsive", "ResponsiveNavigation")
  @js.native
  class ResponsiveNavigation ()
    extends Component[ResponsiveNavigationProps, ResponsiveNavigationState, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MResponsiveNavigation(): Unit = js.native
    
    @JSName("componentWillMount")
    def componentWillMount_MResponsiveNavigation(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MResponsiveNavigation(): Unit = js.native
    
    /**
      * Called when the menu icon is clicked.
      */
    def toggle(): Unit = js.native
    
    /**
      * Updates the state of this component.
      * While this might seem like a sub-optimal solution, it is actually the only solution.
      * Using 'hide' and 'show' -classes won't work because they set display with `!important`.
      */
    def update(): Unit = js.native
  }
  /* static members */
  object ResponsiveNavigation {
    
    @JSImport("react-foundation/components/responsive", "ResponsiveNavigation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation/components/responsive", "ResponsiveNavigation.defaultProps")
    @js.native
    def defaultProps: Breakpoint = js.native
    @scala.inline
    def defaultProps_=(x: Breakpoint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation/components/responsive", "ResponsiveNavigation.propTypes")
    @js.native
    def propTypes: AlignX = js.native
    @scala.inline
    def propTypes_=(x: AlignX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation/components/responsive", "TitleBar")
  @js.native
  val TitleBar: StatelessComponent[TitleBarProps] = js.native
  
  @JSImport("react-foundation/components/responsive", "TitleBarTitle")
  @js.native
  val TitleBarTitle: StatelessComponent[TitleBarTitleProps] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactFoundation.utilsMod.ClassNameProps because var conflicts: className. Inlined noDefaultClassName
  - typings.reactFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float */ @js.native
  trait MenuIconProps extends ButtonHTMLAttributes[HTMLButtonElement] {
    
    var float: js.UndefOr[FloatTypes] = js.native
    
    var hideFor: js.UndefOr[medium | large] = js.native
    
    var hideOnlyFor: js.UndefOr[Breakpoints] = js.native
    
    var isClearfix: js.UndefOr[Boolean] = js.native
    
    var isHidden: js.UndefOr[Boolean] = js.native
    
    var isInvisible: js.UndefOr[Boolean] = js.native
    
    var noDefaultClassName: js.UndefOr[String] = js.native
    
    var showFor: js.UndefOr[Breakpoints] = js.native
    
    var showForLandscape: js.UndefOr[Boolean] = js.native
    
    var showForPortrait: js.UndefOr[Boolean] = js.native
    
    var showForSr: js.UndefOr[Boolean] = js.native
    
    var showOnFocus: js.UndefOr[Boolean] = js.native
    
    var showOnlyFor: js.UndefOr[Breakpoints] = js.native
  }
  object MenuIconProps {
    
    @scala.inline
    def apply(): MenuIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuIconProps]
    }
    
    @scala.inline
    implicit class MenuIconPropsMutableBuilder[Self <: MenuIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFloat(value: FloatTypes): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setHideFor(value: medium | large): Self = StObject.set(x, "hideFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideForUndefined: Self = StObject.set(x, "hideFor", js.undefined)
      
      @scala.inline
      def setHideOnlyFor(value: Breakpoints): Self = StObject.set(x, "hideOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnlyForUndefined: Self = StObject.set(x, "hideOnlyFor", js.undefined)
      
      @scala.inline
      def setIsClearfix(value: Boolean): Self = StObject.set(x, "isClearfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClearfixUndefined: Self = StObject.set(x, "isClearfix", js.undefined)
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      @scala.inline
      def setIsInvisible(value: Boolean): Self = StObject.set(x, "isInvisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInvisibleUndefined: Self = StObject.set(x, "isInvisible", js.undefined)
      
      @scala.inline
      def setNoDefaultClassName(value: String): Self = StObject.set(x, "noDefaultClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDefaultClassNameUndefined: Self = StObject.set(x, "noDefaultClassName", js.undefined)
      
      @scala.inline
      def setShowFor(value: Breakpoints): Self = StObject.set(x, "showFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscape(value: Boolean): Self = StObject.set(x, "showForLandscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscapeUndefined: Self = StObject.set(x, "showForLandscape", js.undefined)
      
      @scala.inline
      def setShowForPortrait(value: Boolean): Self = StObject.set(x, "showForPortrait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForPortraitUndefined: Self = StObject.set(x, "showForPortrait", js.undefined)
      
      @scala.inline
      def setShowForSr(value: Boolean): Self = StObject.set(x, "showForSr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForSrUndefined: Self = StObject.set(x, "showForSr", js.undefined)
      
      @scala.inline
      def setShowForUndefined: Self = StObject.set(x, "showFor", js.undefined)
      
      @scala.inline
      def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
      
      @scala.inline
      def setShowOnlyFor(value: Breakpoints): Self = StObject.set(x, "showOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnlyForUndefined: Self = StObject.set(x, "showOnlyFor", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.HTMLAttributes because var conflicts: className. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, itemScope, style, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, tabIndex, slot, autoCapitalize, placeholder, radioGroup, id, lang, color, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, defaultChecked, unselectable, role, datatype, itemProp, title, autoCorrect, results */ @js.native
  trait ResponsiveNavigationProps
    extends FlexboxPropTypes
       with AriaAttributes
       with DOMAttributes[HTMLDivElement] {
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.native
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.native
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    var breakpoint: js.UndefOr[Double] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    // React-specific Attributes
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inlist: js.UndefOr[js.Any] = js.native
    
    // Living Standard
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents
      * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    /**
      * Specify that a standard HTML element should behave like a defined custom built-in element
      * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
      */
    var is: js.UndefOr[String] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var menuIcon: js.UndefOr[MenuIconProps] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[String] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var titleBar: js.UndefOr[TitleBarProps] = js.native
    
    var titleBarTitle: js.UndefOr[TitleBarTitleProps] = js.native
    
    var topBar: js.UndefOr[TopBarProps] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var vocab: js.UndefOr[String] = js.native
  }
  object ResponsiveNavigationProps {
    
    @scala.inline
    def apply(): ResponsiveNavigationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveNavigationProps]
    }
    
    @scala.inline
    implicit class ResponsiveNavigationPropsMutableBuilder[Self <: ResponsiveNavigationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setBreakpoint(value: Double): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setMenuIcon(value: MenuIconProps): Self = StObject.set(x, "menuIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconUndefined: Self = StObject.set(x, "menuIcon", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBar(value: TitleBarProps): Self = StObject.set(x, "titleBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBarTitle(value: TitleBarTitleProps): Self = StObject.set(x, "titleBarTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBarTitleUndefined: Self = StObject.set(x, "titleBarTitle", js.undefined)
      
      @scala.inline
      def setTitleBarUndefined: Self = StObject.set(x, "titleBar", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTopBar(value: TopBarProps): Self = StObject.set(x, "topBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopBarUndefined: Self = StObject.set(x, "topBar", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  @js.native
  trait ResponsiveNavigationState extends StObject {
    
    var isTitleBarVisible: Boolean = js.native
    
    var isTopBarVisible: Boolean = js.native
  }
  object ResponsiveNavigationState {
    
    @scala.inline
    def apply(isTitleBarVisible: Boolean, isTopBarVisible: Boolean): ResponsiveNavigationState = {
      val __obj = js.Dynamic.literal(isTitleBarVisible = isTitleBarVisible.asInstanceOf[js.Any], isTopBarVisible = isTopBarVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsiveNavigationState]
    }
    
    @scala.inline
    implicit class ResponsiveNavigationStateMutableBuilder[Self <: ResponsiveNavigationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsTitleBarVisible(value: Boolean): Self = StObject.set(x, "isTitleBarVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTopBarVisible(value: Boolean): Self = StObject.set(x, "isTopBarVisible", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactFoundation.utilsMod.ClassNameProps because var conflicts: className. Inlined noDefaultClassName
  - typings.reactFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float */ @js.native
  trait TitleBarProps extends HTMLAttributes[HTMLDivElement] {
    
    var float: js.UndefOr[FloatTypes] = js.native
    
    var hideFor: js.UndefOr[medium | large] = js.native
    
    var hideOnlyFor: js.UndefOr[Breakpoints] = js.native
    
    var isClearfix: js.UndefOr[Boolean] = js.native
    
    var isHidden: js.UndefOr[Boolean] = js.native
    
    var isInvisible: js.UndefOr[Boolean] = js.native
    
    var noDefaultClassName: js.UndefOr[String] = js.native
    
    var showFor: js.UndefOr[Breakpoints] = js.native
    
    var showForLandscape: js.UndefOr[Boolean] = js.native
    
    var showForPortrait: js.UndefOr[Boolean] = js.native
    
    var showForSr: js.UndefOr[Boolean] = js.native
    
    var showOnFocus: js.UndefOr[Boolean] = js.native
    
    var showOnlyFor: js.UndefOr[Breakpoints] = js.native
  }
  object TitleBarProps {
    
    @scala.inline
    def apply(): TitleBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleBarProps]
    }
    
    @scala.inline
    implicit class TitleBarPropsMutableBuilder[Self <: TitleBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFloat(value: FloatTypes): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setHideFor(value: medium | large): Self = StObject.set(x, "hideFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideForUndefined: Self = StObject.set(x, "hideFor", js.undefined)
      
      @scala.inline
      def setHideOnlyFor(value: Breakpoints): Self = StObject.set(x, "hideOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnlyForUndefined: Self = StObject.set(x, "hideOnlyFor", js.undefined)
      
      @scala.inline
      def setIsClearfix(value: Boolean): Self = StObject.set(x, "isClearfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClearfixUndefined: Self = StObject.set(x, "isClearfix", js.undefined)
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      @scala.inline
      def setIsInvisible(value: Boolean): Self = StObject.set(x, "isInvisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInvisibleUndefined: Self = StObject.set(x, "isInvisible", js.undefined)
      
      @scala.inline
      def setNoDefaultClassName(value: String): Self = StObject.set(x, "noDefaultClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDefaultClassNameUndefined: Self = StObject.set(x, "noDefaultClassName", js.undefined)
      
      @scala.inline
      def setShowFor(value: Breakpoints): Self = StObject.set(x, "showFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscape(value: Boolean): Self = StObject.set(x, "showForLandscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscapeUndefined: Self = StObject.set(x, "showForLandscape", js.undefined)
      
      @scala.inline
      def setShowForPortrait(value: Boolean): Self = StObject.set(x, "showForPortrait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForPortraitUndefined: Self = StObject.set(x, "showForPortrait", js.undefined)
      
      @scala.inline
      def setShowForSr(value: Boolean): Self = StObject.set(x, "showForSr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForSrUndefined: Self = StObject.set(x, "showForSr", js.undefined)
      
      @scala.inline
      def setShowForUndefined: Self = StObject.set(x, "showFor", js.undefined)
      
      @scala.inline
      def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
      
      @scala.inline
      def setShowOnlyFor(value: Breakpoints): Self = StObject.set(x, "showOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnlyForUndefined: Self = StObject.set(x, "showOnlyFor", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactFoundation.utilsMod.ClassNameProps because var conflicts: className. Inlined noDefaultClassName
  - typings.reactFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float */ @js.native
  trait TitleBarTitleProps extends HTMLAttributes[HTMLDivElement] {
    
    var float: js.UndefOr[FloatTypes] = js.native
    
    var hideFor: js.UndefOr[medium | large] = js.native
    
    var hideOnlyFor: js.UndefOr[Breakpoints] = js.native
    
    var isClearfix: js.UndefOr[Boolean] = js.native
    
    var isHidden: js.UndefOr[Boolean] = js.native
    
    var isInvisible: js.UndefOr[Boolean] = js.native
    
    var noDefaultClassName: js.UndefOr[String] = js.native
    
    var showFor: js.UndefOr[Breakpoints] = js.native
    
    var showForLandscape: js.UndefOr[Boolean] = js.native
    
    var showForPortrait: js.UndefOr[Boolean] = js.native
    
    var showForSr: js.UndefOr[Boolean] = js.native
    
    var showOnFocus: js.UndefOr[Boolean] = js.native
    
    var showOnlyFor: js.UndefOr[Breakpoints] = js.native
  }
  object TitleBarTitleProps {
    
    @scala.inline
    def apply(): TitleBarTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleBarTitleProps]
    }
    
    @scala.inline
    implicit class TitleBarTitlePropsMutableBuilder[Self <: TitleBarTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFloat(value: FloatTypes): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setHideFor(value: medium | large): Self = StObject.set(x, "hideFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideForUndefined: Self = StObject.set(x, "hideFor", js.undefined)
      
      @scala.inline
      def setHideOnlyFor(value: Breakpoints): Self = StObject.set(x, "hideOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnlyForUndefined: Self = StObject.set(x, "hideOnlyFor", js.undefined)
      
      @scala.inline
      def setIsClearfix(value: Boolean): Self = StObject.set(x, "isClearfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClearfixUndefined: Self = StObject.set(x, "isClearfix", js.undefined)
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      @scala.inline
      def setIsInvisible(value: Boolean): Self = StObject.set(x, "isInvisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInvisibleUndefined: Self = StObject.set(x, "isInvisible", js.undefined)
      
      @scala.inline
      def setNoDefaultClassName(value: String): Self = StObject.set(x, "noDefaultClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDefaultClassNameUndefined: Self = StObject.set(x, "noDefaultClassName", js.undefined)
      
      @scala.inline
      def setShowFor(value: Breakpoints): Self = StObject.set(x, "showFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscape(value: Boolean): Self = StObject.set(x, "showForLandscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscapeUndefined: Self = StObject.set(x, "showForLandscape", js.undefined)
      
      @scala.inline
      def setShowForPortrait(value: Boolean): Self = StObject.set(x, "showForPortrait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForPortraitUndefined: Self = StObject.set(x, "showForPortrait", js.undefined)
      
      @scala.inline
      def setShowForSr(value: Boolean): Self = StObject.set(x, "showForSr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForSrUndefined: Self = StObject.set(x, "showForSr", js.undefined)
      
      @scala.inline
      def setShowForUndefined: Self = StObject.set(x, "showFor", js.undefined)
      
      @scala.inline
      def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
      
      @scala.inline
      def setShowOnlyFor(value: Breakpoints): Self = StObject.set(x, "showOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnlyForUndefined: Self = StObject.set(x, "showOnlyFor", js.undefined)
    }
  }
}
