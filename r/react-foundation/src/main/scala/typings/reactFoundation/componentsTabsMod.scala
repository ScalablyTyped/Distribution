package typings.reactFoundation

import typings.react.mod.AriaAttributes
import typings.react.mod.AriaRole
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.DOMAttributes
import typings.react.mod.FunctionComponent
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
import typings.reactFoundation.utilsMod.FlexboxPropTypes
import typings.std.HTMLDivElement
import typings.std.HTMLLIElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTabsMod {
  
  @JSImport("react-foundation/components/tabs", "TabItem")
  @js.native
  val TabItem: FunctionComponent[TabItemProps] = js.native
  
  @JSImport("react-foundation/components/tabs", "TabPanel")
  @js.native
  val TabPanel: FunctionComponent[TabPanelProps] = js.native
  
  @JSImport("react-foundation/components/tabs", "Tabs")
  @js.native
  val Tabs: FunctionComponent[TabsProps] = js.native
  
  @JSImport("react-foundation/components/tabs", "TabsContent")
  @js.native
  val TabsContent: FunctionComponent[TabsContentProps] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.HTMLAttributes because var conflicts: className. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, content, nonce, itemScope, style, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, tabIndex, slot, autoCapitalize, rev, placeholder, rel, radioGroup, id, lang, color, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, defaultChecked, autoFocus, unselectable, role, datatype, itemProp, title, autoCorrect, results */ trait TabItemProps
    extends StObject
       with FlexboxPropTypes
       with AriaAttributes
       with DOMAttributes[HTMLLIElement] {
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.undefined
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.undefined
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    // React-specific Attributes
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    // Living Standard
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents
      * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    /**
      * Specify that a standard HTML element should behave like a defined custom built-in element
      * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
      */
    var is: js.UndefOr[String] = js.undefined
    
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var rev: js.UndefOr[String] = js.undefined
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
  }
  object TabItemProps {
    
    inline def apply(): TabItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabItemProps] (val x: Self) extends AnyVal {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
      
      inline def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.HTMLAttributes because var conflicts: className. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, content, nonce, itemScope, style, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, tabIndex, slot, autoCapitalize, rev, placeholder, rel, radioGroup, id, lang, color, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, defaultChecked, autoFocus, unselectable, role, datatype, itemProp, title, autoCorrect, results */ trait TabPanelProps
    extends StObject
       with FlexboxPropTypes
       with AriaAttributes
       with DOMAttributes[HTMLDivElement] {
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.undefined
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.undefined
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    // React-specific Attributes
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    // Living Standard
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents
      * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    /**
      * Specify that a standard HTML element should behave like a defined custom built-in element
      * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
      */
    var is: js.UndefOr[String] = js.undefined
    
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var rev: js.UndefOr[String] = js.undefined
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
  }
  object TabPanelProps {
    
    inline def apply(): TabPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPanelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabPanelProps] (val x: Self) extends AnyVal {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
      
      inline def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.HTMLAttributes because var conflicts: className. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, content, nonce, itemScope, style, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, tabIndex, slot, autoCapitalize, rev, placeholder, rel, radioGroup, id, lang, color, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, defaultChecked, autoFocus, unselectable, role, datatype, itemProp, title, autoCorrect, results */ trait TabsContentProps
    extends StObject
       with FlexboxPropTypes
       with AriaAttributes
       with DOMAttributes[HTMLDivElement] {
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.undefined
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.undefined
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    // React-specific Attributes
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    // Living Standard
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents
      * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    /**
      * Specify that a standard HTML element should behave like a defined custom built-in element
      * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
      */
    var is: js.UndefOr[String] = js.undefined
    
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    var isVertical: js.UndefOr[Boolean] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var rev: js.UndefOr[String] = js.undefined
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
  }
  object TabsContentProps {
    
    inline def apply(): TabsContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsContentProps] (val x: Self) extends AnyVal {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setIsVertical(value: Boolean): Self = StObject.set(x, "isVertical", value.asInstanceOf[js.Any])
      
      inline def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
      
      inline def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.HTMLAttributes because var conflicts: className. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, content, nonce, itemScope, style, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, tabIndex, slot, autoCapitalize, rev, placeholder, rel, radioGroup, id, lang, color, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, defaultChecked, autoFocus, unselectable, role, datatype, itemProp, title, autoCorrect, results */ trait TabsProps
    extends StObject
       with FlexboxPropTypes
       with AriaAttributes
       with DOMAttributes[HTMLUListElement] {
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.undefined
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.undefined
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    // React-specific Attributes
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    // Living Standard
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents
      * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    /**
      * Specify that a standard HTML element should behave like a defined custom built-in element
      * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
      */
    var is: js.UndefOr[String] = js.undefined
    
    var isVertical: js.UndefOr[Boolean] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var rev: js.UndefOr[String] = js.undefined
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
  }
  object TabsProps {
    
    inline def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setIsVertical(value: Boolean): Self = StObject.set(x, "isVertical", value.asInstanceOf[js.Any])
      
      inline def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
      
      inline def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
}
