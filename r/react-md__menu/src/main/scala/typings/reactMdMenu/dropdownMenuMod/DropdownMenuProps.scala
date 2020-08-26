package typings.reactMdMenu.dropdownMenuMod

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
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.reactMdButton.buttonThemeClassNamesMod.ButtonTheme
import typings.reactMdButton.buttonThemeClassNamesMod.ButtonThemeType
import typings.reactMdButton.buttonThemeClassNamesMod.ButtonType
import typings.reactMdButton.fabMod.FABPosition
import typings.reactMdButton.fabMod.FABProps
import typings.reactMdMenu.defaultMenuItemRendererMod.MenuItemRenderer
import typings.reactMdMenu.defaultMenuItemRendererMod.ValidMenuItem
import typings.reactMdMenu.defaultMenuRendererMod.InjectedMenuProps
import typings.reactMdMenu.defaultMenuRendererMod.MenuRenderer
import typings.reactMdMenu.menuMod.MenuPositionOptions
import typings.reactMdMenu.reactMdMenuStrings.`additions text`
import typings.reactMdMenu.reactMdMenuStrings.`inline`
import typings.reactMdMenu.reactMdMenuStrings.additions
import typings.reactMdMenu.reactMdMenuStrings.all
import typings.reactMdMenu.reactMdMenuStrings.ascending
import typings.reactMdMenu.reactMdMenuStrings.assertive
import typings.reactMdMenu.reactMdMenuStrings.both
import typings.reactMdMenu.reactMdMenuStrings.button
import typings.reactMdMenu.reactMdMenuStrings.copy
import typings.reactMdMenu.reactMdMenuStrings.date
import typings.reactMdMenu.reactMdMenuStrings.decimal
import typings.reactMdMenu.reactMdMenuStrings.descending
import typings.reactMdMenu.reactMdMenuStrings.email
import typings.reactMdMenu.reactMdMenuStrings.execute
import typings.reactMdMenu.reactMdMenuStrings.grammar
import typings.reactMdMenu.reactMdMenuStrings.horizontal
import typings.reactMdMenu.reactMdMenuStrings.inherit
import typings.reactMdMenu.reactMdMenuStrings.link
import typings.reactMdMenu.reactMdMenuStrings.list
import typings.reactMdMenu.reactMdMenuStrings.location
import typings.reactMdMenu.reactMdMenuStrings.mixed
import typings.reactMdMenu.reactMdMenuStrings.move
import typings.reactMdMenu.reactMdMenuStrings.no
import typings.reactMdMenu.reactMdMenuStrings.none
import typings.reactMdMenu.reactMdMenuStrings.numeric
import typings.reactMdMenu.reactMdMenuStrings.off
import typings.reactMdMenu.reactMdMenuStrings.on
import typings.reactMdMenu.reactMdMenuStrings.other
import typings.reactMdMenu.reactMdMenuStrings.page
import typings.reactMdMenu.reactMdMenuStrings.polite
import typings.reactMdMenu.reactMdMenuStrings.popup
import typings.reactMdMenu.reactMdMenuStrings.removals
import typings.reactMdMenu.reactMdMenuStrings.reset
import typings.reactMdMenu.reactMdMenuStrings.search
import typings.reactMdMenu.reactMdMenuStrings.spelling
import typings.reactMdMenu.reactMdMenuStrings.step
import typings.reactMdMenu.reactMdMenuStrings.submit
import typings.reactMdMenu.reactMdMenuStrings.tel
import typings.reactMdMenu.reactMdMenuStrings.text
import typings.reactMdMenu.reactMdMenuStrings.time
import typings.reactMdMenu.reactMdMenuStrings.url
import typings.reactMdMenu.reactMdMenuStrings.vertical
import typings.reactMdMenu.reactMdMenuStrings.yes
import typings.reactMdPortal.getContainerMod.PortalInto
import typings.reactMdStates.typesMod.MergableRippleHandlers
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactMdUtils.typesMod.PositionAnchor
import typings.reactMdUtils.typesTypesMod.PropsWithRef
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.Event
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<@react-md/menu.@react-md/menu/types/MenuButton.MenuButtonProps, 'id' | 'visible' | 'aria-haspopup'> */
/* Inlined parent @react-md/menu.@react-md/menu/types/DropdownMenu.BaseDropdownMenuProps */
@js.native
trait DropdownMenuProps extends js.Object {
  var about: js.UndefOr[String] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var anchor: js.UndefOr[PositionAnchor] = js.native
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
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
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
  var asAppBarAction: js.UndefOr[Boolean] = js.native
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var buttonType: js.UndefOr[ButtonType] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var closeOnResize: js.UndefOr[Boolean] = js.native
  var closeOnScroll: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  var datatype: js.UndefOr[String] = js.native
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  /**
    * Boolean if the menu should be visible immediately once this component
    * mounts.
    */
  var defaultVisible: js.UndefOr[Boolean] = js.native
  var dir: js.UndefOr[String] = js.native
  var disableDropdownIcon: js.UndefOr[Boolean] = js.native
  var disableEnterClick: js.UndefOr[Boolean] = js.native
  var disablePressedFallback: js.UndefOr[Boolean] = js.native
  var disableProgrammaticRipple: js.UndefOr[Boolean] = js.native
  var disableRipple: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var dropdownIcon: js.UndefOr[ReactNode] = js.native
  var enablePressedAndRipple: js.UndefOr[Boolean] = js.native
  var first: js.UndefOr[Boolean] = js.native
  var floating: js.UndefOr[FABPosition] = js.native
  var floatingProps: js.UndefOr[PropsWithRef[FABProps, HTMLSpanElement]] = js.native
  var form: js.UndefOr[String] = js.native
  var formAction: js.UndefOr[String] = js.native
  var formEncType: js.UndefOr[String] = js.native
  var formMethod: js.UndefOr[String] = js.native
  var formNoValidate: js.UndefOr[Boolean] = js.native
  var formTarget: js.UndefOr[String] = js.native
  var handlers: js.UndefOr[MergableRippleHandlers[HTMLButtonElement]] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * The id to use for the menu button and used to create the id for the menu.
    * The menu's id will just be `${id}-menu`.
    */
  var id: String = js.native
  var inheritColor: js.UndefOr[Boolean] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  /**
    * A function to call for each `item` in the `items` list to render a
    * ReactElement.
    */
  var itemRenderer: js.UndefOr[MenuItemRenderer] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  /**
    * A list of menu items to render. Each item will be passed to the
    * `menuItemRenderer` function.
    */
  var items: js.Array[ValidMenuItem] = js.native
  var lang: js.UndefOr[String] = js.native
  var last: js.UndefOr[Boolean] = js.native
  /**
    * The label to use for the menu. Either this or the `menuLabelledBy` props
    * are required for a11y.
    */
  var menuLabel: js.UndefOr[String] = js.native
  /**
    * The id for an element to label the menu. Either this or the `menuLabel`
    * props are required for a11y. This will be defaulted to the `id` of the menu
    * button for convenience since it _should_ normally label the menu but should
    * be changed if it does not.
    */
  var menuLabelledBy: js.UndefOr[String] = js.native
  /**
    * A custom menu renderer to use. This defaults to just rendering the `Menu`
    * component with the base required props and a generated id from the button
    * id.
    */
  var menuRenderer: js.UndefOr[MenuRenderer] = js.native
  var name: js.UndefOr[String] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onChange: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  var onScroll: js.UndefOr[UIEventHandler[HTMLButtonElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLButtonElement]] = js.native
  /**
    * An optional function to call when the visibility of the menu changes.
    */
  var onVisibilityChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[HTMLButtonElement]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Boolean if the portal should be used.
    */
  var portal: js.UndefOr[Boolean] = js.native
  /**
    * @see {@link Portal#into}
    */
  var portalInto: js.UndefOr[PortalInto] = js.native
  /**
    * @see {@link Portal#intoId}
    */
  var portalIntoId: js.UndefOr[String] = js.native
  var positionOptions: js.UndefOr[MenuPositionOptions] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var rippleClassName: js.UndefOr[String] = js.native
  var rippleClassNames: js.UndefOr[CSSTransitionClassNames] = js.native
  var rippleContainerClassName: js.UndefOr[String] = js.native
  var rippleTimeout: js.UndefOr[TransitionTimeout] = js.native
  var role: js.UndefOr[String] = js.native
  var security: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[ButtonTheme] = js.native
  var themeType: js.UndefOr[ButtonThemeType] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var `type`: js.UndefOr[button | reset | submit] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
  var vocab: js.UndefOr[String] = js.native
}

object DropdownMenuProps {
  @scala.inline
  def apply(id: String, items: js.Array[ValidMenuItem]): DropdownMenuProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownMenuProps]
  }
  @scala.inline
  implicit class DropdownMenuPropsOps[Self <: DropdownMenuProps] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: ValidMenuItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ValidMenuItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbout(value: String): Self = this.set("about", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setAnchor(value: PositionAnchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    @scala.inline
    def `setAria-colcount`(value: Double): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    @scala.inline
    def `setAria-colindex`(value: Double): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    @scala.inline
    def `setAria-colspan`(value: Double): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    @scala.inline
    def `setAria-controls`(value: String): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    @scala.inline
    def `setAria-details`(value: String): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    @scala.inline
    def `setAria-flowto`(value: String): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    @scala.inline
    def `setAria-level`(value: Double): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    @scala.inline
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    @scala.inline
    def `setAria-placeholder`(value: String): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    @scala.inline
    def `setAria-posinset`(value: Double): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    @scala.inline
    def `setAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    @scala.inline
    def `setAria-required`(value: Boolean): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    @scala.inline
    def `setAria-roledescription`(value: String): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    @scala.inline
    def `setAria-setsize`(value: Double): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    @scala.inline
    def `setAria-valuetext`(value: String): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    @scala.inline
    def setAsAppBarAction(value: Boolean): Self = this.set("asAppBarAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsAppBarAction: Self = this.set("asAppBarAction", js.undefined)
    @scala.inline
    def setAutoCapitalize(value: String): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    @scala.inline
    def setAutoCorrect(value: String): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setAutoSave(value: String): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    @scala.inline
    def setButtonType(value: ButtonType): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonType: Self = this.set("buttonType", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCloseOnResize(value: Boolean): Self = this.set("closeOnResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnResize: Self = this.set("closeOnResize", js.undefined)
    @scala.inline
    def setCloseOnScroll(value: Boolean): Self = this.set("closeOnScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnScroll: Self = this.set("closeOnScroll", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setDefaultChecked(value: Boolean): Self = this.set("defaultChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultChecked: Self = this.set("defaultChecked", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: String | Double | js.Array[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDefaultVisible(value: Boolean): Self = this.set("defaultVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVisible: Self = this.set("defaultVisible", js.undefined)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDisableDropdownIcon(value: Boolean): Self = this.set("disableDropdownIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDropdownIcon: Self = this.set("disableDropdownIcon", js.undefined)
    @scala.inline
    def setDisableEnterClick(value: Boolean): Self = this.set("disableEnterClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableEnterClick: Self = this.set("disableEnterClick", js.undefined)
    @scala.inline
    def setDisablePressedFallback(value: Boolean): Self = this.set("disablePressedFallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisablePressedFallback: Self = this.set("disablePressedFallback", js.undefined)
    @scala.inline
    def setDisableProgrammaticRipple(value: Boolean): Self = this.set("disableProgrammaticRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableProgrammaticRipple: Self = this.set("disableProgrammaticRipple", js.undefined)
    @scala.inline
    def setDisableRipple(value: Boolean): Self = this.set("disableRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableRipple: Self = this.set("disableRipple", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDraggable(value: Booleanish): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setDropdownIcon(value: ReactNode): Self = this.set("dropdownIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownIcon: Self = this.set("dropdownIcon", js.undefined)
    @scala.inline
    def setEnablePressedAndRipple(value: Boolean): Self = this.set("enablePressedAndRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePressedAndRipple: Self = this.set("enablePressedAndRipple", js.undefined)
    @scala.inline
    def setFirst(value: Boolean): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    @scala.inline
    def setFloating(value: FABPosition): Self = this.set("floating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
    @scala.inline
    def setFloatingNull: Self = this.set("floating", null)
    @scala.inline
    def setFloatingProps(value: PropsWithRef[FABProps, HTMLSpanElement]): Self = this.set("floatingProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingProps: Self = this.set("floatingProps", js.undefined)
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setFormAction(value: String): Self = this.set("formAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormAction: Self = this.set("formAction", js.undefined)
    @scala.inline
    def setFormEncType(value: String): Self = this.set("formEncType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormEncType: Self = this.set("formEncType", js.undefined)
    @scala.inline
    def setFormMethod(value: String): Self = this.set("formMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormMethod: Self = this.set("formMethod", js.undefined)
    @scala.inline
    def setFormNoValidate(value: Boolean): Self = this.set("formNoValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormNoValidate: Self = this.set("formNoValidate", js.undefined)
    @scala.inline
    def setFormTarget(value: String): Self = this.set("formTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormTarget: Self = this.set("formTarget", js.undefined)
    @scala.inline
    def setHandlers(value: MergableRippleHandlers[HTMLButtonElement]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setInheritColor(value: Boolean): Self = this.set("inheritColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInheritColor: Self = this.set("inheritColor", js.undefined)
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    @scala.inline
    def setItemID(value: String): Self = this.set("itemID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemID: Self = this.set("itemID", js.undefined)
    @scala.inline
    def setItemProp(value: String): Self = this.set("itemProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemProp: Self = this.set("itemProp", js.undefined)
    @scala.inline
    def setItemRef(value: String): Self = this.set("itemRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemRef: Self = this.set("itemRef", js.undefined)
    @scala.inline
    def setItemRenderer(value: (/* item */ ValidMenuItem, /* key */ String) => ReactNode): Self = this.set("itemRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteItemRenderer: Self = this.set("itemRenderer", js.undefined)
    @scala.inline
    def setItemScope(value: Boolean): Self = this.set("itemScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemScope: Self = this.set("itemScope", js.undefined)
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setLast(value: Boolean): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    @scala.inline
    def setMenuLabel(value: String): Self = this.set("menuLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuLabel: Self = this.set("menuLabel", js.undefined)
    @scala.inline
    def setMenuLabelledBy(value: String): Self = this.set("menuLabelledBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuLabelledBy: Self = this.set("menuLabelledBy", js.undefined)
    @scala.inline
    def setMenuRenderer(value: (/* props */ InjectedMenuProps, /* items */ js.Array[ValidMenuItem]) => ReactNode): Self = this.set("menuRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMenuRenderer: Self = this.set("menuRenderer", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnAbort(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    @scala.inline
    def setOnAnimationEnd(value: AnimationEvent[HTMLButtonElement] => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    @scala.inline
    def setOnAnimationIteration(value: AnimationEvent[HTMLButtonElement] => Unit): Self = this.set("onAnimationIteration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    @scala.inline
    def setOnAnimationStart(value: AnimationEvent[HTMLButtonElement] => Unit): Self = this.set("onAnimationStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    @scala.inline
    def setOnAuxClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onAuxClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", js.undefined)
    @scala.inline
    def setOnBeforeInput(value: FormEvent[HTMLButtonElement] => Unit): Self = this.set("onBeforeInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", js.undefined)
    @scala.inline
    def setOnBlur(value: FocusEvent[HTMLButtonElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onCanPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onCanPlayThrough", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    @scala.inline
    def setOnChange(value: FormEvent[HTMLButtonElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnCompositionEnd(value: CompositionEvent[HTMLButtonElement] => Unit): Self = this.set("onCompositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    @scala.inline
    def setOnCompositionStart(value: CompositionEvent[HTMLButtonElement] => Unit): Self = this.set("onCompositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    @scala.inline
    def setOnCompositionUpdate(value: CompositionEvent[HTMLButtonElement] => Unit): Self = this.set("onCompositionUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    @scala.inline
    def setOnContextMenu(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnCopy(value: ClipboardEvent[HTMLButtonElement] => Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    @scala.inline
    def setOnCut(value: ClipboardEvent[HTMLButtonElement] => Unit): Self = this.set("onCut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    @scala.inline
    def setOnDrag(value: DragEvent[HTMLButtonElement] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragEnd(value: DragEvent[HTMLButtonElement] => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragEnter(value: DragEvent[HTMLButtonElement] => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragExit(value: DragEvent[HTMLButtonElement] => Unit): Self = this.set("onDragExit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    @scala.inline
    def setOnDragLeave(value: DragEvent[HTMLButtonElement] => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    @scala.inline
    def setOnDragOver(value: DragEvent[HTMLButtonElement] => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    @scala.inline
    def setOnDragStart(value: DragEvent[HTMLButtonElement] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDrop(value: DragEvent[HTMLButtonElement] => Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onDurationChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onEmptied", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onEncrypted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    @scala.inline
    def setOnEnded(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    @scala.inline
    def setOnError(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLButtonElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnInput(value: FormEvent[HTMLButtonElement] => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    @scala.inline
    def setOnInvalid(value: FormEvent[HTMLButtonElement] => Unit): Self = this.set("onInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLButtonElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyPress(value: KeyboardEvent[HTMLButtonElement] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[HTMLButtonElement] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnLoad(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onLoadStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onLoadedData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onLoadedMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    @scala.inline
    def setOnMouseDown(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseOut(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    @scala.inline
    def setOnMouseOver(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    @scala.inline
    def setOnMouseUp(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnPaste(value: ClipboardEvent[HTMLButtonElement] => Unit): Self = this.set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    @scala.inline
    def setOnPause(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPlay(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onPlaying", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    @scala.inline
    def setOnPointerCancel(value: PointerEvent[HTMLButtonElement] => Unit): Self = this.set("onPointerCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    @scala.inline
    def setOnPointerDown(value: PointerEvent[HTMLButtonElement] => Unit): Self = this.set("onPointerDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    @scala.inline
    def setOnPointerEnter(value: PointerEvent[HTMLButtonElement] => Unit): Self = this.set("onPointerEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    @scala.inline
    def setOnPointerLeave(value: PointerEvent[HTMLButtonElement] => Unit): Self = this.set("onPointerLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    @scala.inline
    def setOnPointerMove(value: PointerEvent[HTMLButtonElement] => Unit): Self = this.set("onPointerMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    @scala.inline
    def setOnPointerOut(value: PointerEvent[HTMLButtonElement] => Unit): Self = this.set("onPointerOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    @scala.inline
    def setOnPointerOver(value: PointerEvent[HTMLButtonElement] => Unit): Self = this.set("onPointerOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    @scala.inline
    def setOnPointerUp(value: PointerEvent[HTMLButtonElement] => Unit): Self = this.set("onPointerUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    @scala.inline
    def setOnProgress(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    @scala.inline
    def setOnReset(value: FormEvent[HTMLButtonElement] => Unit): Self = this.set("onReset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setOnScroll(value: UIEvent[HTMLButtonElement, NativeUIEvent] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    @scala.inline
    def setOnSelect(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnStalled(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onStalled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    @scala.inline
    def setOnSubmit(value: FormEvent[HTMLButtonElement] => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onSuspend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    @scala.inline
    def setOnTouchCancel(value: TouchEvent[HTMLButtonElement] => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[HTMLButtonElement] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchMove(value: TouchEvent[HTMLButtonElement] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    @scala.inline
    def setOnTouchStart(value: TouchEvent[HTMLButtonElement] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setOnTransitionEnd(value: TransitionEvent[HTMLButtonElement] => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    @scala.inline
    def setOnVisibilityChange(value: /* visible */ Boolean => Unit): Self = this.set("onVisibilityChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVisibilityChange: Self = this.set("onVisibilityChange", js.undefined)
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    @scala.inline
    def setOnWheel(value: WheelEvent[HTMLButtonElement] => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPortal(value: Boolean): Self = this.set("portal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortal: Self = this.set("portal", js.undefined)
    @scala.inline
    def setPortalIntoFunction0(value: () => HTMLElement | Null): Self = this.set("portalInto", js.Any.fromFunction0(value))
    @scala.inline
    def setPortalInto(value: PortalInto): Self = this.set("portalInto", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortalInto: Self = this.set("portalInto", js.undefined)
    @scala.inline
    def setPortalIntoNull: Self = this.set("portalInto", null)
    @scala.inline
    def setPortalIntoId(value: String): Self = this.set("portalIntoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortalIntoId: Self = this.set("portalIntoId", js.undefined)
    @scala.inline
    def setPositionOptions(value: MenuPositionOptions): Self = this.set("positionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionOptions: Self = this.set("positionOptions", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setRadioGroup(value: String): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", js.undefined)
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setRippleClassName(value: String): Self = this.set("rippleClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleClassName: Self = this.set("rippleClassName", js.undefined)
    @scala.inline
    def setRippleClassNames(value: CSSTransitionClassNames): Self = this.set("rippleClassNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleClassNames: Self = this.set("rippleClassNames", js.undefined)
    @scala.inline
    def setRippleContainerClassName(value: String): Self = this.set("rippleContainerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleContainerClassName: Self = this.set("rippleContainerClassName", js.undefined)
    @scala.inline
    def setRippleTimeout(value: TransitionTimeout): Self = this.set("rippleTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleTimeout: Self = this.set("rippleTimeout", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSecurity(value: String): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    @scala.inline
    def setSpellCheck(value: Booleanish): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuppressContentEditableWarning(value: Boolean): Self = this.set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressContentEditableWarning: Self = this.set("suppressContentEditableWarning", js.undefined)
    @scala.inline
    def setSuppressHydrationWarning(value: Boolean): Self = this.set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressHydrationWarning: Self = this.set("suppressHydrationWarning", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTheme(value: ButtonTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setThemeType(value: ButtonThemeType): Self = this.set("themeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeType: Self = this.set("themeType", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTranslate(value: yes | no): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setType(value: button | reset | submit): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeof(value: String): Self = this.set("typeof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", js.undefined)
    @scala.inline
    def setUnselectable(value: on | off): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVocab(value: String): Self = this.set("vocab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
  }
  
}

