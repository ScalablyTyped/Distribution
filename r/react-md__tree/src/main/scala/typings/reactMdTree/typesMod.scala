package typings.reactMdTree

import org.scalablytyped.runtime.StringDictionary
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.ElementType
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.MutableRefObject
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactElement
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.reactMdList.getListItemHeightMod.ListItemHeight
import typings.reactMdList.listItemAddonMod.ListItemAddonPosition
import typings.reactMdList.listItemAddonMod.ListItemAddonType
import typings.reactMdList.listItemChildrenMod.ListItemChildrenProps
import typings.reactMdList.listMod.ListProps
import typings.reactMdTree.anon.VisibleIndex
import typings.reactMdTree.reactMdTreeStrings.`additions removals`
import typings.reactMdTree.reactMdTreeStrings.`additions text`
import typings.reactMdTree.reactMdTreeStrings.`inline`
import typings.reactMdTree.reactMdTreeStrings.`removals additions`
import typings.reactMdTree.reactMdTreeStrings.`removals text`
import typings.reactMdTree.reactMdTreeStrings.`text additions`
import typings.reactMdTree.reactMdTreeStrings.`text removals`
import typings.reactMdTree.reactMdTreeStrings.additions
import typings.reactMdTree.reactMdTreeStrings.all
import typings.reactMdTree.reactMdTreeStrings.ascending
import typings.reactMdTree.reactMdTreeStrings.assertive
import typings.reactMdTree.reactMdTreeStrings.both
import typings.reactMdTree.reactMdTreeStrings.copy
import typings.reactMdTree.reactMdTreeStrings.date
import typings.reactMdTree.reactMdTreeStrings.decimal
import typings.reactMdTree.reactMdTreeStrings.descending
import typings.reactMdTree.reactMdTreeStrings.dialog
import typings.reactMdTree.reactMdTreeStrings.email
import typings.reactMdTree.reactMdTreeStrings.execute
import typings.reactMdTree.reactMdTreeStrings.grammar
import typings.reactMdTree.reactMdTreeStrings.grid
import typings.reactMdTree.reactMdTreeStrings.horizontal
import typings.reactMdTree.reactMdTreeStrings.inherit
import typings.reactMdTree.reactMdTreeStrings.link
import typings.reactMdTree.reactMdTreeStrings.list
import typings.reactMdTree.reactMdTreeStrings.listbox
import typings.reactMdTree.reactMdTreeStrings.location
import typings.reactMdTree.reactMdTreeStrings.menu
import typings.reactMdTree.reactMdTreeStrings.mixed
import typings.reactMdTree.reactMdTreeStrings.move
import typings.reactMdTree.reactMdTreeStrings.no
import typings.reactMdTree.reactMdTreeStrings.none
import typings.reactMdTree.reactMdTreeStrings.numeric
import typings.reactMdTree.reactMdTreeStrings.off
import typings.reactMdTree.reactMdTreeStrings.on
import typings.reactMdTree.reactMdTreeStrings.other
import typings.reactMdTree.reactMdTreeStrings.page
import typings.reactMdTree.reactMdTreeStrings.polite
import typings.reactMdTree.reactMdTreeStrings.popup
import typings.reactMdTree.reactMdTreeStrings.removals
import typings.reactMdTree.reactMdTreeStrings.search
import typings.reactMdTree.reactMdTreeStrings.spelling
import typings.reactMdTree.reactMdTreeStrings.step
import typings.reactMdTree.reactMdTreeStrings.tel
import typings.reactMdTree.reactMdTreeStrings.text
import typings.reactMdTree.reactMdTreeStrings.time
import typings.reactMdTree.reactMdTreeStrings.tree
import typings.reactMdTree.reactMdTreeStrings.url
import typings.reactMdTree.reactMdTreeStrings.vertical
import typings.reactMdTree.reactMdTreeStrings.yes
import typings.std.Event
import typings.std.HTMLLIElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait BaseTreeItem
    extends TreeItemIds
       with ListItemChildrenProps {
    
    /**
      * Boolean if the provided item is a custom element and will not be rendered
      * in a `TreeItem` component. This is useful if you want to be able to render
      * `Divider` or `ListSubheader` components within a tree since they _should_
      * be able to be rendered without any of the tree functionality.
      */
    var isCustom: js.UndefOr[Boolean] = js.native
  }
  object BaseTreeItem {
    
    @scala.inline
    def apply(itemId: TreeItemId): BaseTreeItem = {
      val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseTreeItem]
    }
    
    @scala.inline
    implicit class BaseTreeItemMutableBuilder[Self <: BaseTreeItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsCustom(value: Boolean): Self = StObject.set(x, "isCustom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCustomUndefined: Self = StObject.set(x, "isCustom", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@react-md/tree.@react-md/tree/types/types.TreeItemProps, 'id' | 'depth' | 'itemIndex' | 'listSize' | 'selected' | 'expanded' | 'focused' | 'renderChildItems'> & {  children :react.react.ReactNode | undefined} */
  @js.native
  trait ConfigurableTreeItemProps extends StObject {
    
    var about: js.UndefOr[String] = js.native
    
    var accessKey: js.UndefOr[String] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Boolean] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-busy`: js.UndefOr[Boolean] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Boolean] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Boolean] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Boolean] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Boolean] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiline`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Boolean] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Boolean] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Boolean] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var contentComponent: js.UndefOr[ElementType[_]] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var expanderIcon: js.UndefOr[ReactNode] = js.native
    
    var expanderLeft: js.UndefOr[Boolean] = js.native
    
    var forceAddonWrap: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[ListItemHeight] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var inlist: js.UndefOr[js.Any] = js.native
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    var is: js.UndefOr[String] = js.native
    
    var isLink: js.UndefOr[Boolean] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var leftAddon: js.UndefOr[ReactNode] = js.native
    
    var leftAddonPosition: js.UndefOr[ListItemAddonPosition] = js.native
    
    var leftAddonType: js.UndefOr[ListItemAddonType] = js.native
    
    var liClassName: js.UndefOr[String] = js.native
    
    var liRef: js.UndefOr[Ref[HTMLLIElement]] = js.native
    
    var liStyle: js.UndefOr[CSSProperties] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLLIElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLLIElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLLIElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLLIElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLLIElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLLIElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLLIElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLLIElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLLIElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLLIElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.native
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLLIElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLLIElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.native
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLLIElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLLIElement]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var primaryText: js.UndefOr[ReactNode] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var radioGroup: js.UndefOr[String] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    var rightAddon: js.UndefOr[ReactNode] = js.native
    
    var rightAddonPosition: js.UndefOr[ListItemAddonPosition] = js.native
    
    var rightAddonType: js.UndefOr[ListItemAddonType] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var secondaryText: js.UndefOr[ReactNode] = js.native
    
    var secondaryTextClassName: js.UndefOr[String] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var textChildren: js.UndefOr[Boolean] = js.native
    
    var textClassName: js.UndefOr[String] = js.native
    
    var threeLines: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var vocab: js.UndefOr[String] = js.native
  }
  object ConfigurableTreeItemProps {
    
    @scala.inline
    def apply(): ConfigurableTreeItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurableTreeItemProps]
    }
    
    @scala.inline
    implicit class ConfigurableTreeItemPropsMutableBuilder[Self <: ConfigurableTreeItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
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
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContentComponent(value: ElementType[_]): Self = StObject.set(x, "contentComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentComponentUndefined: Self = StObject.set(x, "contentComponent", js.undefined)
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
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
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setExpanderIcon(value: ReactNode): Self = StObject.set(x, "expanderIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderIconUndefined: Self = StObject.set(x, "expanderIcon", js.undefined)
      
      @scala.inline
      def setExpanderLeft(value: Boolean): Self = StObject.set(x, "expanderLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderLeftUndefined: Self = StObject.set(x, "expanderLeft", js.undefined)
      
      @scala.inline
      def setForceAddonWrap(value: Boolean): Self = StObject.set(x, "forceAddonWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceAddonWrapUndefined: Self = StObject.set(x, "forceAddonWrap", js.undefined)
      
      @scala.inline
      def setHeight(value: ListItemHeight): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
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
      def setIsLink(value: Boolean): Self = StObject.set(x, "isLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLinkUndefined: Self = StObject.set(x, "isLink", js.undefined)
      
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
      def setLeftAddon(value: ReactNode): Self = StObject.set(x, "leftAddon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftAddonPosition(value: ListItemAddonPosition): Self = StObject.set(x, "leftAddonPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftAddonPositionUndefined: Self = StObject.set(x, "leftAddonPosition", js.undefined)
      
      @scala.inline
      def setLeftAddonType(value: ListItemAddonType): Self = StObject.set(x, "leftAddonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftAddonTypeUndefined: Self = StObject.set(x, "leftAddonType", js.undefined)
      
      @scala.inline
      def setLeftAddonUndefined: Self = StObject.set(x, "leftAddon", js.undefined)
      
      @scala.inline
      def setLiClassName(value: String): Self = StObject.set(x, "liClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiClassNameUndefined: Self = StObject.set(x, "liClassName", js.undefined)
      
      @scala.inline
      def setLiRef(value: Ref[HTMLLIElement]): Self = StObject.set(x, "liRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiRefFunction1(value: /* instance */ HTMLLIElement | Null => Unit): Self = StObject.set(x, "liRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLiRefNull: Self = StObject.set(x, "liRef", null)
      
      @scala.inline
      def setLiRefUndefined: Self = StObject.set(x, "liRef", js.undefined)
      
      @scala.inline
      def setLiStyle(value: CSSProperties): Self = StObject.set(x, "liStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiStyleUndefined: Self = StObject.set(x, "liStyle", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: AnimationEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: AnimationEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: AnimationEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: FormEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: FormEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: CompositionEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: CompositionEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: CompositionEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: ClipboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: ClipboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: FormEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: FormEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: KeyboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: KeyboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: ClipboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: FormEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: UIEvent[HTMLLIElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: FormEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: TouchEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: TouchEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: TouchEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: TouchEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: TransitionEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: WheelEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPrimaryText(value: ReactNode): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setRightAddon(value: ReactNode): Self = StObject.set(x, "rightAddon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightAddonPosition(value: ListItemAddonPosition): Self = StObject.set(x, "rightAddonPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightAddonPositionUndefined: Self = StObject.set(x, "rightAddonPosition", js.undefined)
      
      @scala.inline
      def setRightAddonType(value: ListItemAddonType): Self = StObject.set(x, "rightAddonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightAddonTypeUndefined: Self = StObject.set(x, "rightAddonType", js.undefined)
      
      @scala.inline
      def setRightAddonUndefined: Self = StObject.set(x, "rightAddon", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSecondaryText(value: ReactNode): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryTextClassName(value: String): Self = StObject.set(x, "secondaryTextClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryTextClassNameUndefined: Self = StObject.set(x, "secondaryTextClassName", js.undefined)
      
      @scala.inline
      def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
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
      def setTextChildren(value: Boolean): Self = StObject.set(x, "textChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextChildrenUndefined: Self = StObject.set(x, "textChildren", js.undefined)
      
      @scala.inline
      def setTextClassName(value: String): Self = StObject.set(x, "textClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextClassNameUndefined: Self = StObject.set(x, "textClassName", js.undefined)
      
      @scala.inline
      def setThreeLines(value: Boolean): Self = StObject.set(x, "threeLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreeLinesUndefined: Self = StObject.set(x, "threeLines", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
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
  
  type ExpandedIds = js.Array[TreeItemId]
  
  type GetItemProps[T /* <: TreeItemIds */] = js.Function1[/* item */ T with TreeItemStates, js.UndefOr[ConfigurableTreeItemProps]]
  
  /* Inlined parent std.Pick<@react-md/tree.@react-md/tree/types/types.TreeItemProps, @react-md/tree.@react-md/tree/types/types.TreeItemKeys> */
  @js.native
  trait ProvidedTreeItemProps extends StObject {
    
    var depth: Double = js.native
    
    var expanded: Boolean = js.native
    
    var focused: Boolean = js.native
    
    var id: String = js.native
    
    var itemIndex: Double = js.native
    
    /**
      * React `key`s aren't really "props", but it will be provided to each
      * `TreeItem` automatically.
      */
    var key: String = js.native
    
    /**
      * A ref that **must** be passed down to each `TreeItem` so that keyboard
      * accessibility works.  This will be omitted when the `isCustom` key is
      * enabled on the item.
      */
    var liRef: js.UndefOr[MutableRefObject[HTMLLIElement | Null]] = js.native
    
    var listSize: Double = js.native
    
    /**
      * A click handler that allows for the item to be selected or expanded. This
      * will be omitted when the `isCustom` key is enabled on the item.
      */
    var onClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var renderChildItems: js.UndefOr[js.Function0[ReactNode]] = js.native
    
    var selected: Boolean = js.native
  }
  object ProvidedTreeItemProps {
    
    @scala.inline
    def apply(
      depth: Double,
      expanded: Boolean,
      focused: Boolean,
      id: String,
      itemIndex: Double,
      key: String,
      listSize: Double,
      selected: Boolean
    ): ProvidedTreeItemProps = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], listSize = listSize.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvidedTreeItemProps]
    }
    
    @scala.inline
    implicit class ProvidedTreeItemPropsMutableBuilder[Self <: ProvidedTreeItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiRef(value: MutableRefObject[HTMLLIElement | Null]): Self = StObject.set(x, "liRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiRefUndefined: Self = StObject.set(x, "liRef", js.undefined)
      
      @scala.inline
      def setListSize(value: Double): Self = StObject.set(x, "listSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRenderChildItems(value: () => ReactNode): Self = StObject.set(x, "renderChildItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderChildItemsUndefined: Self = StObject.set(x, "renderChildItems", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'linkComponent' | 'id'> & std.Required<std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'rootId' | 'multiSelect' | 'labelKey' | 'valueKey' | 'getItemLabel' | 'getItemValue' | 'getItemProps' | 'expanderLeft' | 'expanderIcon'>> */
  @js.native
  trait ProvidedTreeProps extends StObject {
    
    var expanderIcon: ReactNode = js.native
    
    var expanderLeft: Boolean = js.native
    
    var getItemLabel: js.Function2[/* item */ UnknownTreeItem, /* labelKey */ String, ReactNode] = js.native
    
    var getItemProps: GetItemProps[UnknownTreeItem] = js.native
    
    var getItemValue: js.Function2[/* item */ UnknownTreeItem, /* valueKey */ String, String] = js.native
    
    var id: String = js.native
    
    var labelKey: String = js.native
    
    var linkComponent: js.UndefOr[ElementType[_]] = js.native
    
    var multiSelect: Boolean = js.native
    
    var rootId: TreeItemId = js.native
    
    var valueKey: String = js.native
  }
  object ProvidedTreeProps {
    
    @scala.inline
    def apply(
      expanderLeft: Boolean,
      getItemLabel: (/* item */ UnknownTreeItem, /* labelKey */ String) => ReactNode,
      getItemProps: /* item */ UnknownTreeItem with TreeItemStates => js.UndefOr[ConfigurableTreeItemProps],
      getItemValue: (/* item */ UnknownTreeItem, /* valueKey */ String) => String,
      id: String,
      labelKey: String,
      multiSelect: Boolean,
      rootId: TreeItemId,
      valueKey: String
    ): ProvidedTreeProps = {
      val __obj = js.Dynamic.literal(expanderLeft = expanderLeft.asInstanceOf[js.Any], getItemLabel = js.Any.fromFunction2(getItemLabel), getItemProps = js.Any.fromFunction1(getItemProps), getItemValue = js.Any.fromFunction2(getItemValue), id = id.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], multiSelect = multiSelect.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvidedTreeProps]
    }
    
    @scala.inline
    implicit class ProvidedTreePropsMutableBuilder[Self <: ProvidedTreeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpanderIcon(value: ReactNode): Self = StObject.set(x, "expanderIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderIconUndefined: Self = StObject.set(x, "expanderIcon", js.undefined)
      
      @scala.inline
      def setExpanderLeft(value: Boolean): Self = StObject.set(x, "expanderLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetItemLabel(value: (/* item */ UnknownTreeItem, /* labelKey */ String) => ReactNode): Self = StObject.set(x, "getItemLabel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetItemProps(value: /* item */ UnknownTreeItem with TreeItemStates => js.UndefOr[ConfigurableTreeItemProps]): Self = StObject.set(x, "getItemProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetItemValue(value: (/* item */ UnknownTreeItem, /* valueKey */ String) => String): Self = StObject.set(x, "getItemValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkComponent(value: ElementType[_]): Self = StObject.set(x, "linkComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkComponentUndefined: Self = StObject.set(x, "linkComponent", js.undefined)
      
      @scala.inline
      def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootId(value: TreeItemId): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectedIds = js.Array[TreeItemId]
  
  type TreeData[T /* <: BaseTreeItem */] = Record[TreeItemId, T]
  
  @js.native
  trait TreeItemExpansion extends StObject {
    
    /**
      * The list of expanded ids within the tree. These ids should reference
      * `itemId`s for tree items.
      */
    var expandedIds: ExpandedIds = js.native
    
    /**
      * A function to call that will update the `expandedIds` to collapse or expand
      * a clicked item.
      */
    def onItemExpansion(itemId: TreeItemId, expanded: Boolean): Unit = js.native
    
    /**
      * A function to call when the user presses the asterisk key (*) that will
      * expand all tree items at the same level as the currently focused item.
      */
    def onMultiItemExpansion(itemIds: ExpandedIds): Unit = js.native
  }
  object TreeItemExpansion {
    
    @scala.inline
    def apply(
      expandedIds: ExpandedIds,
      onItemExpansion: (TreeItemId, Boolean) => Unit,
      onMultiItemExpansion: ExpandedIds => Unit
    ): TreeItemExpansion = {
      val __obj = js.Dynamic.literal(expandedIds = expandedIds.asInstanceOf[js.Any], onItemExpansion = js.Any.fromFunction2(onItemExpansion), onMultiItemExpansion = js.Any.fromFunction1(onMultiItemExpansion))
      __obj.asInstanceOf[TreeItemExpansion]
    }
    
    @scala.inline
    implicit class TreeItemExpansionMutableBuilder[Self <: TreeItemExpansion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandedIds(value: ExpandedIds): Self = StObject.set(x, "expandedIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedIdsVarargs(value: TreeItemId*): Self = StObject.set(x, "expandedIds", js.Array(value :_*))
      
      @scala.inline
      def setOnItemExpansion(value: (TreeItemId, Boolean) => Unit): Self = StObject.set(x, "onItemExpansion", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMultiItemExpansion(value: ExpandedIds => Unit): Self = StObject.set(x, "onMultiItemExpansion", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TreeItemExpansionIcon extends StObject {
    
    /**
      * The icon to show within each item within the tree that helps show that
      * there are child items.
      *
      * NOTE: This will override the `rightAddon` prop if defined on each item by
      * default so they can't be used. If the `expanderLeft` prop is enabled, the
      * `leftAddon` will be overridden instead.
      */
    var expanderIcon: js.UndefOr[ReactNode] = js.native
    
    /**
      * Boolean if the expander icon should appear to the left instead of the
      * right.
      */
    var expanderLeft: js.UndefOr[Boolean] = js.native
  }
  object TreeItemExpansionIcon {
    
    @scala.inline
    def apply(): TreeItemExpansionIcon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeItemExpansionIcon]
    }
    
    @scala.inline
    implicit class TreeItemExpansionIconMutableBuilder[Self <: TreeItemExpansionIcon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpanderIcon(value: ReactNode): Self = StObject.set(x, "expanderIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderIconUndefined: Self = StObject.set(x, "expanderIcon", js.undefined)
      
      @scala.inline
      def setExpanderLeft(value: Boolean): Self = StObject.set(x, "expanderLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderLeftUndefined: Self = StObject.set(x, "expanderLeft", js.undefined)
    }
  }
  
  type TreeItemId = String
  
  @js.native
  trait TreeItemIds extends StObject {
    
    /**
      * The unique identifier for an item within the tree. This is used to be able
      * to link tree items together with parent items as well as selected/expanded
      * logic.
      */
    var itemId: TreeItemId = js.native
    
    /**
      * This id is used to be able to link tree items together with children and
      * parents. If the `parentId` is set to `null`, the tree item will appear at
      * the root of the tree. Otherwise, the tree item will appear as a child of
      * the referenced tree item by `itemId`
      */
    var parentId: Null | TreeItemId = js.native
  }
  object TreeItemIds {
    
    @scala.inline
    def apply(itemId: TreeItemId): TreeItemIds = {
      val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeItemIds]
    }
    
    @scala.inline
    implicit class TreeItemIdsMutableBuilder[Self <: TreeItemIds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemId(value: TreeItemId): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentId(value: TreeItemId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdNull: Self = StObject.set(x, "parentId", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdTree.reactMdTreeStrings.id
    - typings.reactMdTree.reactMdTreeStrings.depth
    - typings.reactMdTree.reactMdTreeStrings.itemIndex
    - typings.reactMdTree.reactMdTreeStrings.listSize
    - typings.reactMdTree.reactMdTreeStrings.selected
    - typings.reactMdTree.reactMdTreeStrings.expanded
    - typings.reactMdTree.reactMdTreeStrings.focused
    - typings.reactMdTree.reactMdTreeStrings.renderChildItems
  */
  trait TreeItemKeys extends StObject
  object TreeItemKeys {
    
    @scala.inline
    def depth: typings.reactMdTree.reactMdTreeStrings.depth = "depth".asInstanceOf[typings.reactMdTree.reactMdTreeStrings.depth]
    
    @scala.inline
    def expanded: typings.reactMdTree.reactMdTreeStrings.expanded = "expanded".asInstanceOf[typings.reactMdTree.reactMdTreeStrings.expanded]
    
    @scala.inline
    def focused: typings.reactMdTree.reactMdTreeStrings.focused = "focused".asInstanceOf[typings.reactMdTree.reactMdTreeStrings.focused]
    
    @scala.inline
    def id: typings.reactMdTree.reactMdTreeStrings.id = "id".asInstanceOf[typings.reactMdTree.reactMdTreeStrings.id]
    
    @scala.inline
    def itemIndex: typings.reactMdTree.reactMdTreeStrings.itemIndex = "itemIndex".asInstanceOf[typings.reactMdTree.reactMdTreeStrings.itemIndex]
    
    @scala.inline
    def listSize: typings.reactMdTree.reactMdTreeStrings.listSize = "listSize".asInstanceOf[typings.reactMdTree.reactMdTreeStrings.listSize]
    
    @scala.inline
    def renderChildItems: typings.reactMdTree.reactMdTreeStrings.renderChildItems = "renderChildItems".asInstanceOf[typings.reactMdTree.reactMdTreeStrings.renderChildItems]
    
    @scala.inline
    def selected: typings.reactMdTree.reactMdTreeStrings.selected = "selected".asInstanceOf[typings.reactMdTree.reactMdTreeStrings.selected]
  }
  
  /* Inlined parent react.react.HTMLAttributes<std.HTMLLIElement> */
  /* Inlined parent @react-md/tree.@react-md/tree/types/types.TreeItemStates */
  /* Inlined parent @react-md/tree.@react-md/tree/types/types.TreeItemExpansionIcon */
  /* Inlined parent @react-md/list.@react-md/list.ListItemChildrenProps */
  /* Inlined parent std.Pick<@react-md/list.@react-md/list.SimpleListItemProps, 'threeLines' | 'height'> */
  @js.native
  trait TreeItemProps extends StObject {
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.native
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.native
    
    /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
    var `aria-atomic`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
      * presented if they are made.
      */
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
    var `aria-busy`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
      * @see aria-pressed @see aria-selected.
      */
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    /**
      * Defines the total number of columns in a table, grid, or treegrid.
      * @see aria-colindex.
      */
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    /**
      * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
      * @see aria-colcount @see aria-colspan.
      */
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    /**
      * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
      * @see aria-colindex @see aria-rowspan.
      */
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    /**
      * Identifies the element (or elements) whose contents or presence are controlled by the current element.
      * @see aria-owns.
      */
    var `aria-controls`: js.UndefOr[String] = js.native
    
    /** Indicates the element that represents the current item within a container or set of related elements. */
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    /**
      * Identifies the element (or elements) that describes the object.
      * @see aria-labelledby
      */
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    /**
      * Identifies the element that provides a detailed, extended description for the object.
      * @see aria-describedby.
      */
    var `aria-details`: js.UndefOr[String] = js.native
    
    /**
      * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
      * @see aria-hidden @see aria-readonly.
      */
    var `aria-disabled`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates what functions can be performed when a dragged object is released on the drop target.
      * @deprecated in ARIA 1.1
      */
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    /**
      * Identifies the element that provides an error message for the object.
      * @see aria-invalid @see aria-describedby.
      */
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
    var `aria-expanded`: js.UndefOr[Boolean] = js.native
    
    /**
      * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
      * allows assistive technology to override the general default of reading in document source order.
      */
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    /**
      * Indicates an element's "grabbed" state in a drag-and-drop operation.
      * @deprecated in ARIA 1.1
      */
    var `aria-grabbed`: js.UndefOr[Boolean] = js.native
    
    /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    /**
      * Indicates whether the element is exposed to an accessibility API.
      * @see aria-disabled.
      */
    var `aria-hidden`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates the entered value does not conform to the format expected by the application.
      * @see aria-errormessage.
      */
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    /**
      * Defines a string value that labels the current element.
      * @see aria-labelledby.
      */
    var `aria-label`: js.UndefOr[String] = js.native
    
    /**
      * Identifies the element (or elements) that labels the current element.
      * @see aria-describedby.
      */
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    /** Defines the hierarchical level of an element within a structure. */
    var `aria-level`: js.UndefOr[Double] = js.native
    
    /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    /** Indicates whether an element is modal when displayed. */
    var `aria-modal`: js.UndefOr[Boolean] = js.native
    
    /** Indicates whether a text box accepts multiple lines of input or only a single line. */
    var `aria-multiline`: js.UndefOr[Boolean] = js.native
    
    /** Indicates that the user may select more than one item from the current selectable descendants. */
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
    
    /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    /**
      * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
      * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
      * @see aria-controls.
      */
    var `aria-owns`: js.UndefOr[String] = js.native
    
    /**
      * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
      * A hint could be a sample value or a brief description of the expected format.
      */
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    /**
      * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
      * @see aria-setsize.
      */
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    /**
      * Indicates the current "pressed" state of toggle buttons.
      * @see aria-checked @see aria-selected.
      */
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    /**
      * Indicates that the element is not editable, but is otherwise operable.
      * @see aria-disabled.
      */
    var `aria-readonly`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
      * @see aria-atomic.
      */
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    /** Indicates that user input is required on the element before a form may be submitted. */
    var `aria-required`: js.UndefOr[Boolean] = js.native
    
    /** Defines a human-readable, author-localized description for the role of an element. */
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    /**
      * Defines the total number of rows in a table, grid, or treegrid.
      * @see aria-rowindex.
      */
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    /**
      * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
      * @see aria-rowcount @see aria-rowspan.
      */
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    /**
      * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
      * @see aria-rowindex @see aria-colspan.
      */
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    /**
      * Indicates the current "selected" state of various widgets.
      * @see aria-checked @see aria-pressed.
      */
    var `aria-selected`: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
      * @see aria-posinset.
      */
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    /** Indicates if items in a table or grid are sorted in ascending or descending order. */
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    /** Defines the maximum allowed value for a range widget. */
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    /** Defines the minimum allowed value for a range widget. */
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    /**
      * Defines the current value for a range widget.
      * @see aria-valuetext.
      */
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    /** Defines the human readable text alternative of aria-valuenow for a range widget. */
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    /**
      * The main content to display. When the `textChildren` prop is enabled and
      * there is child content, it will be treated as primary text and update the
      * styles automatically.
      */
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    /**
      * The component to render the item's content in. This should normally stay as
      * the default `"span"` element, but if you'd like to make a navigation tree,
      * this can be set as a `Link` component from a routing library.
      *
      * Example:
      * ```
      * <TreeItem href="#" contentComponent="a" />
      *
      * <TreeItem to="/example-url" contentComponent={Link} exact />
      * ```
      */
    var contentComponent: js.UndefOr[ElementType[_]] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    // React-specific Attributes
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    /**
      * The current depth that the tree item is being rendered at. This will be a
      * number starting from `1` since it should be directly mapped to
      * `"aria-posinset"`.
      */
    var depth: Double = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    /**
      * Boolean if the tree item is disabled which will prevent it from being
      * interactable. It will still be "keyboard focusable" while disabled, but
      * clicking or selecting won't work.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    /**
      * Boolean if the tree item is expanded. When this is true, it should add
      * `aria-expanded="true"` to the tree item.
      */
    var expanded: Boolean = js.native
    
    /**
      * The icon to show within each item within the tree that helps show that
      * there are child items.
      *
      * NOTE: This will override the `rightAddon` prop if defined on each item by
      * default so they can't be used. If the `expanderLeft` prop is enabled, the
      * `leftAddon` will be overridden instead.
      */
    var expanderIcon: js.UndefOr[ReactNode] = js.native
    
    /**
      * Boolean if the expander icon should appear to the left instead of the
      * right.
      */
    var expanderLeft: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the tree item is the current keyboard focus.
      */
    var focused: Boolean = js.native
    
    /**
      * Boolean if the left and/or right addons should be "forcefully" wrapped in a
      * `<span>` with the spacing class names applied instead of attempting to
      * clone it into the provided icon element.
      */
    var forceAddonWrap: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[ListItemHeight] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    /**
      * A DOM id for the tree item. This is required for a11y since this id should
      * reflect the `aria-activedescendant` value on the base `Tree` component to
      * show current keyboard focus.
      */
    var id: String = js.native
    
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
    
    /**
      * Boolean if the `TreeItem` is a link component which changes up how the
      * accessibility attributes are applied to the DOM. The default behavior is to
      * check if the `contentComponent` is to consider it a link if it is not a
      * string (custom component) or the string: `"a"`. Since this might cause some
      * false-positives, you can set this flag instead which will always be used
      * instead.
      */
    var isLink: js.UndefOr[Boolean] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    /**
      * The current tree item's index within its list at the provided depth. This
      * will be a number starting from `1` since it should be directly mapped to
      * `"aria-posinset"`.
      */
    var itemIndex: Double = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    /**
      * An optional addon to display to the left of the `primaryText` or
      * `children` and should be used with the `leftAddonType` prop to adjust
      * spacing.
      */
    var leftAddon: js.UndefOr[ReactNode] = js.native
    
    /**
      * The vertical position the left icon, avatar, media, or large media
      * should be placed.
      */
    var leftAddonPosition: js.UndefOr[ListItemAddonPosition] = js.native
    
    /**
      * The type of the addon that appears to the left of the `primaryText` or
      * `children`.
      */
    var leftAddonType: js.UndefOr[ListItemAddonType] = js.native
    
    /**
      * An optional `className` to apply to the surrounding `<li>` element for the
      * tree item. The `className` prop is actually passed to the
      * `contentComponent` element instead since you normally don't want to apply
      * styles to the surrounding element.
      */
    var liClassName: js.UndefOr[String] = js.native
    
    /**
      * An optional ref to apply to the content of the tree item.
      */
    var liRef: js.UndefOr[Ref[HTMLLIElement]] = js.native
    
    /**
      * An optional `style` to apply to the surrounding `<li>` element for the tree
      * item. The `style` prop is actually passed to the `contentComponent` element
      * instead since you normally don't want to apply styles to the surrounding
      * element.
      */
    var liStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * The current total list size for the tree item at the provided depth. This
      * should be mapped directly into `"aria-setsize"`.
      */
    var listSize: Double = js.native
    
    // Media Events
    var onAbort: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLLIElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLLIElement]] = js.native
    
    // Animation Events
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLLIElement]] = js.native
    
    // MouseEvents
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLLIElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    // Form Events
    var onChange: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    // Composition Events
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLLIElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLLIElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLLIElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    // Clipboard Events
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLLIElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLLIElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    // Focus Events
    var onFocus: js.UndefOr[FocusEventHandler[HTMLLIElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.native
    
    // also a Media Event
    // Keyboard Events
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.native
    
    // Image Events
    var onLoad: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLLIElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    // Pointer Events
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.native
    
    // UI Events
    var onScroll: js.UndefOr[UIEventHandler[HTMLLIElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    // Selection Events
    var onSelect: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    // Touch Events
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.native
    
    // Transition Events
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLLIElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.native
    
    // Wheel Events
    var onWheel: js.UndefOr[WheelEventHandler[HTMLLIElement]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * An optional element that should be rendered as the `primaryText` within the
      * list item. It is most likely easier to use the `children` prop instead, but
      * this allows you to create more complex components with the `ListItem` since
      * you can provided `children` and have the styles for the `primaryText` still
      * applied. By default, this will only allow one line of text and add ellipsis
      * for any text overflow.
      */
    var primaryText: js.UndefOr[ReactNode] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.native
    
    /**
      * Boolean if the tree item is read only. Not sure why this was added though
      * since `<li>` elements don't support `readOnly`.
      */
    var readOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * This function will only be provided when the tree item has child tree
      * items. This function should only be called within the exported `TreeGroup`
      * component or in a component that has the `role="group"` for accessibility.
      */
    var renderChildItems: js.UndefOr[js.Function0[ReactNode]] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    /**
      * An optional addon to display to the right of the `primaryText` or
      * `children` and should be used with the `rightAddonType` prop to adjust
      * spacing.
      */
    var rightAddon: js.UndefOr[ReactNode] = js.native
    
    /**
      * The vertical position the right icon, avatar, media, or large media
      * should be placed.
      */
    var rightAddonPosition: js.UndefOr[ListItemAddonPosition] = js.native
    
    /**
      * The type of the addon that appears to the right of the `primaryText` or
      * `children`.
      */
    var rightAddonType: js.UndefOr[ListItemAddonType] = js.native
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[String] = js.native
    
    /**
      * An optional element that should be rendered as the `secondaryText` within
      * the list item. By default, this will only span one line and add ellipsis
      * for overflow.
      */
    var secondaryText: js.UndefOr[ReactNode] = js.native
    
    /**
      * An optional className to apply to the `<span>` that surrounds the
      * `secondaryText` within the list item.
      */
    var secondaryTextClassName: js.UndefOr[String] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    /**
      * Boolean if the tree item is currently selected.
      */
    var selected: Boolean = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    /**
      * Boolean if the children should be treated as the `primaryText` prop. This
      * will wrap them in an additional class so that they have ellipsis for text
      * overflow.
      *
      * If you want to have more "freedom" within the `ListItem`, you can disable
      * this prop so that the height will grow depending on content.
      *
      * NOTE: If the `secondaryText` prop is provided, this will always be
      * considered `true`.
      */
    var textChildren: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional className to apply to the `<span>` that surrounds the
      * `primaryText` and optionally `secondaryText` within the list item.
      */
    var textClassName: js.UndefOr[String] = js.native
    
    var threeLines: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var vocab: js.UndefOr[String] = js.native
  }
  object TreeItemProps {
    
    @scala.inline
    def apply(
      depth: Double,
      expanded: Boolean,
      focused: Boolean,
      id: String,
      itemIndex: Double,
      listSize: Double,
      selected: Boolean
    ): TreeItemProps = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], listSize = listSize.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeItemProps]
    }
    
    @scala.inline
    implicit class TreeItemPropsMutableBuilder[Self <: TreeItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
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
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContentComponent(value: ElementType[_]): Self = StObject.set(x, "contentComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentComponentUndefined: Self = StObject.set(x, "contentComponent", js.undefined)
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
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
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderIcon(value: ReactNode): Self = StObject.set(x, "expanderIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderIconUndefined: Self = StObject.set(x, "expanderIcon", js.undefined)
      
      @scala.inline
      def setExpanderLeft(value: Boolean): Self = StObject.set(x, "expanderLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderLeftUndefined: Self = StObject.set(x, "expanderLeft", js.undefined)
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceAddonWrap(value: Boolean): Self = StObject.set(x, "forceAddonWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceAddonWrapUndefined: Self = StObject.set(x, "forceAddonWrap", js.undefined)
      
      @scala.inline
      def setHeight(value: ListItemHeight): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
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
      def setIsLink(value: Boolean): Self = StObject.set(x, "isLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLinkUndefined: Self = StObject.set(x, "isLink", js.undefined)
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
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
      def setLeftAddon(value: ReactNode): Self = StObject.set(x, "leftAddon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftAddonPosition(value: ListItemAddonPosition): Self = StObject.set(x, "leftAddonPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftAddonPositionUndefined: Self = StObject.set(x, "leftAddonPosition", js.undefined)
      
      @scala.inline
      def setLeftAddonType(value: ListItemAddonType): Self = StObject.set(x, "leftAddonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftAddonTypeUndefined: Self = StObject.set(x, "leftAddonType", js.undefined)
      
      @scala.inline
      def setLeftAddonUndefined: Self = StObject.set(x, "leftAddon", js.undefined)
      
      @scala.inline
      def setLiClassName(value: String): Self = StObject.set(x, "liClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiClassNameUndefined: Self = StObject.set(x, "liClassName", js.undefined)
      
      @scala.inline
      def setLiRef(value: Ref[HTMLLIElement]): Self = StObject.set(x, "liRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiRefFunction1(value: /* instance */ HTMLLIElement | Null => Unit): Self = StObject.set(x, "liRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLiRefNull: Self = StObject.set(x, "liRef", null)
      
      @scala.inline
      def setLiRefUndefined: Self = StObject.set(x, "liRef", js.undefined)
      
      @scala.inline
      def setLiStyle(value: CSSProperties): Self = StObject.set(x, "liStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiStyleUndefined: Self = StObject.set(x, "liStyle", js.undefined)
      
      @scala.inline
      def setListSize(value: Double): Self = StObject.set(x, "listSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: AnimationEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: AnimationEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: AnimationEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: FormEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: FormEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: CompositionEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: CompositionEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: CompositionEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: ClipboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: ClipboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: FormEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: FormEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: KeyboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: KeyboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: ClipboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: PointerEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: FormEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: UIEvent[HTMLLIElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: FormEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: TouchEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: TouchEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: TouchEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: TouchEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: TransitionEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[HTMLLIElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: WheelEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPrimaryText(value: ReactNode): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRenderChildItems(value: () => ReactNode): Self = StObject.set(x, "renderChildItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderChildItemsUndefined: Self = StObject.set(x, "renderChildItems", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setRightAddon(value: ReactNode): Self = StObject.set(x, "rightAddon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightAddonPosition(value: ListItemAddonPosition): Self = StObject.set(x, "rightAddonPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightAddonPositionUndefined: Self = StObject.set(x, "rightAddonPosition", js.undefined)
      
      @scala.inline
      def setRightAddonType(value: ListItemAddonType): Self = StObject.set(x, "rightAddonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightAddonTypeUndefined: Self = StObject.set(x, "rightAddonType", js.undefined)
      
      @scala.inline
      def setRightAddonUndefined: Self = StObject.set(x, "rightAddon", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSecondaryText(value: ReactNode): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryTextClassName(value: String): Self = StObject.set(x, "secondaryTextClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryTextClassNameUndefined: Self = StObject.set(x, "secondaryTextClassName", js.undefined)
      
      @scala.inline
      def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
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
      def setTextChildren(value: Boolean): Self = StObject.set(x, "textChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextChildrenUndefined: Self = StObject.set(x, "textChildren", js.undefined)
      
      @scala.inline
      def setTextClassName(value: String): Self = StObject.set(x, "textClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextClassNameUndefined: Self = StObject.set(x, "textClassName", js.undefined)
      
      @scala.inline
      def setThreeLines(value: Boolean): Self = StObject.set(x, "threeLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreeLinesUndefined: Self = StObject.set(x, "threeLines", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
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
  
  type TreeItemRenderer[T /* <: BaseTreeItem */] = js.Function3[
    /* providedProps */ ProvidedTreeItemProps, 
    /* item */ T with VisibleIndex, 
    /* treeProps */ ProvidedTreeProps, 
    ReactElement | Null
  ]
  
  @js.native
  trait TreeItemSelection extends StObject {
    
    /**
      * Boolean if multiple items within the tree can be selected at once.
      */
    var multiSelect: js.UndefOr[Boolean] = js.native
    
    /**
      * A function to call that will update the `selectedIds` to include `itemId`
      * of the newly selected tree item. This will be triggered when:
      *
      * - the user clicks a tree item with mouse or touch
      * - user presses the space or enter key while keyboard focusing a tree item
      *
      * Note: If you are using the `useTreeItemSelection` hook, this will always
      * cause the `selectedIds` to be a list of just the selected `itemId` unless
      * the `multiSelect` (second argument) is enabled.
      */
    def onItemSelect(itemId: TreeItemId): Unit = js.native
    
    /**
      * A function to  call that will update the `selectedIds` for "batch"
      * selection updates. This will always be called with a unique list of
      * `itemId`s that contained the previous `itemId`s including the new
      * `itemId`s. This will only be called when the `multiSelect` prop has been
      * enabled and:
      *
      * - the user `Shift + Click`s items within the tree
      * - triggers "select-to" keyboard functionality with `Control+Shift+Home` or
      *   `Control+Shift+End`
      */
    def onMultiItemSelect(itemIds: SelectedIds): Unit = js.native
    
    /**
      * The list of selected ids within the tree. If you only want to allow a
      * single item to be selected at a time within a tree, keep this as either an
      * empty list (no selections) or a single `itemId`.
      */
    var selectedIds: SelectedIds = js.native
  }
  object TreeItemSelection {
    
    @scala.inline
    def apply(onItemSelect: TreeItemId => Unit, onMultiItemSelect: SelectedIds => Unit, selectedIds: SelectedIds): TreeItemSelection = {
      val __obj = js.Dynamic.literal(onItemSelect = js.Any.fromFunction1(onItemSelect), onMultiItemSelect = js.Any.fromFunction1(onMultiItemSelect), selectedIds = selectedIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeItemSelection]
    }
    
    @scala.inline
    implicit class TreeItemSelectionMutableBuilder[Self <: TreeItemSelection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      @scala.inline
      def setOnItemSelect(value: TreeItemId => Unit): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMultiItemSelect(value: SelectedIds => Unit): Self = StObject.set(x, "onMultiItemSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectedIds(value: SelectedIds): Self = StObject.set(x, "selectedIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIdsVarargs(value: TreeItemId*): Self = StObject.set(x, "selectedIds", js.Array(value :_*))
    }
  }
  
  type TreeItemSorter[T /* <: BaseTreeItem */] = js.Function1[/* items */ js.Array[T], js.Array[T]]
  
  @js.native
  trait TreeItemStates extends StObject {
    
    /**
      * Boolean if the tree item is expanded. When this is true, it should add
      * `aria-expanded="true"` to the tree item.
      */
    var expanded: Boolean = js.native
    
    /**
      * Boolean if the tree item is the current keyboard focus.
      */
    var focused: Boolean = js.native
    
    /**
      * Boolean if the tree item is currently selected.
      */
    var selected: Boolean = js.native
  }
  object TreeItemStates {
    
    @scala.inline
    def apply(expanded: Boolean, focused: Boolean, selected: Boolean): TreeItemStates = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeItemStates]
    }
    
    @scala.inline
    implicit class TreeItemStatesMutableBuilder[Self <: TreeItemStates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TreeItemWithContentComponentProps
    extends TreeItemProps
       with /**
    * Since I allow the `contentComponent` prop for handling rendering `<a>` tags
    * from other routing libraries, I unfortunately need an index key so that
    * those props can be passed down correctly.
    */
  /* key */ StringDictionary[js.Any]
  object TreeItemWithContentComponentProps {
    
    @scala.inline
    def apply(
      depth: Double,
      expanded: Boolean,
      focused: Boolean,
      id: String,
      itemIndex: Double,
      listSize: Double,
      selected: Boolean
    ): TreeItemWithContentComponentProps = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], listSize = listSize.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeItemWithContentComponentProps]
    }
  }
  
  @js.native
  trait TreeProps[T /* <: BaseTreeItem */]
    extends ListProps
       with TreeItemExpansionIcon
       with TreeItemExpansion
       with TreeItemSelection {
    
    /**
      * The data to render within the tree.
      */
    var data: TreeData[T] = js.native
    
    /**
      * A function to extract the renderable label from each tree item. The default
      * behavior will be to just return `item[labelKey]`.
      */
    var getItemLabel: js.UndefOr[js.Function2[/* item */ T, /* labelKey */ String, ReactNode]] = js.native
    
    /**
      * @see GetItemProps
      */
    var getItemProps: js.UndefOr[GetItemProps[T]] = js.native
    
    /**
      * A function to extract the text string from each tree item. The default
      * behavior will be to return the `item[valueKey]` and stringify it.
      */
    var getItemValue: js.UndefOr[js.Function2[/* item */ T, /* valueKey */ String, String]] = js.native
    
    /**
      * The id for the tree element. This is required for a lot of accessibility features.
      */
    @JSName("id")
    var id_TreeProps: String = js.native
    
    /**
      * A function that gets called to render each `TreeItem` within the tree. This
      * can be overridden if you need to add additional functionality around the
      * `TreeItem` (such as drag and drop). The default behavior is to extract the
      * `ListItem` props:
      *
      * - `leftAddon`
      * - `leftAddonType`
      * - `leftAddonPosition`
      * - `rightAddon`
      * - `rightAddonType`
      * - `rightAddonPosition`
      * - `children`
      * - `to` / `href`
      * - `isLink`
      *
      * and try to render as a `TreeItem` with those props. It will also override
      * the `expanderLeft` and `expanderIcon` on the `TreeItem` with whatever was
      * provided to the `Tree` component.
      */
    var itemRenderer: js.UndefOr[TreeItemRenderer[T]] = js.native
    
    /**
      * The key to use to extract a renderable label from each tree item. This will
      * be displayed in the DOM as the `children` in each tree item.
      */
    var labelKey: js.UndefOr[String] = js.native
    
    /**
      * The component to use for any treeitem that has a `to`, `href`, or `isLink`
      * attribute. This is a nice way to be able to update treeitems to be links
      * instead of storing the `contentComponent` in the tree's data.
      */
    var linkComponent: js.UndefOr[ElementType[_]] = js.native
    
    /**
      * An optional id to use to determine the root items within the tree. You'll
      * most likely want to keep this as the default of `null`, but it can also be
      * used if you have a different identifier for root items.
      */
    var rootId: js.UndefOr[Null | TreeItemId] = js.native
    
    /**
      * @see TreeItemSorter
      */
    var sort: js.UndefOr[TreeItemSorter[T]] = js.native
    
    /**
      * The key to use to extract a text string from each tree item. This is used
      * for keyboard accessibility and being able to "search" the tree for items
      * starting with the typed letters.
      */
    var valueKey: js.UndefOr[String] = js.native
  }
  object TreeProps {
    
    @scala.inline
    def apply[T /* <: BaseTreeItem */](
      data: TreeData[T],
      expandedIds: ExpandedIds,
      id: String,
      onItemExpansion: (TreeItemId, Boolean) => Unit,
      onItemSelect: TreeItemId => Unit,
      onMultiItemExpansion: ExpandedIds => Unit,
      onMultiItemSelect: SelectedIds => Unit,
      selectedIds: SelectedIds
    ): TreeProps[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], expandedIds = expandedIds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onItemExpansion = js.Any.fromFunction2(onItemExpansion), onItemSelect = js.Any.fromFunction1(onItemSelect), onMultiItemExpansion = js.Any.fromFunction1(onMultiItemExpansion), onMultiItemSelect = js.Any.fromFunction1(onMultiItemSelect), selectedIds = selectedIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeProps[T]]
    }
    
    @scala.inline
    implicit class TreePropsMutableBuilder[Self <: TreeProps[_], T /* <: BaseTreeItem */] (val x: Self with TreeProps[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: TreeData[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetItemLabel(value: (/* item */ T, /* labelKey */ String) => ReactNode): Self = StObject.set(x, "getItemLabel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetItemLabelUndefined: Self = StObject.set(x, "getItemLabel", js.undefined)
      
      @scala.inline
      def setGetItemProps(value: /* item */ T with TreeItemStates => js.UndefOr[ConfigurableTreeItemProps]): Self = StObject.set(x, "getItemProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetItemPropsUndefined: Self = StObject.set(x, "getItemProps", js.undefined)
      
      @scala.inline
      def setGetItemValue(value: (/* item */ T, /* valueKey */ String) => String): Self = StObject.set(x, "getItemValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetItemValueUndefined: Self = StObject.set(x, "getItemValue", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRenderer(
        value: (/* providedProps */ ProvidedTreeItemProps, /* item */ T with VisibleIndex, /* treeProps */ ProvidedTreeProps) => ReactElement | Null
      ): Self = StObject.set(x, "itemRenderer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setItemRendererUndefined: Self = StObject.set(x, "itemRenderer", js.undefined)
      
      @scala.inline
      def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
      
      @scala.inline
      def setLinkComponent(value: ElementType[_]): Self = StObject.set(x, "linkComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkComponentUndefined: Self = StObject.set(x, "linkComponent", js.undefined)
      
      @scala.inline
      def setRootId(value: TreeItemId): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootIdNull: Self = StObject.set(x, "rootId", null)
      
      @scala.inline
      def setRootIdUndefined: Self = StObject.set(x, "rootId", js.undefined)
      
      @scala.inline
      def setSort(value: /* items */ js.Array[T] => js.Array[T]): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
    }
  }
  
  @js.native
  trait UnknownTreeItem
    extends BaseTreeItem
       with /* key */ StringDictionary[js.Any]
  object UnknownTreeItem {
    
    @scala.inline
    def apply(itemId: TreeItemId): UnknownTreeItem = {
      val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnknownTreeItem]
    }
  }
}
