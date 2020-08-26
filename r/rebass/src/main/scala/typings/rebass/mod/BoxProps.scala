package typings.rebass.mod

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
import typings.react.mod.Key
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
import typings.rebass.rebassStrings.`additions text`
import typings.rebass.rebassStrings.`inline`
import typings.rebass.rebassStrings.additions
import typings.rebass.rebassStrings.all
import typings.rebass.rebassStrings.ascending
import typings.rebass.rebassStrings.assertive
import typings.rebass.rebassStrings.both
import typings.rebass.rebassStrings.colors
import typings.rebass.rebassStrings.copy
import typings.rebass.rebassStrings.date
import typings.rebass.rebassStrings.decimal
import typings.rebass.rebassStrings.descending
import typings.rebass.rebassStrings.dialog
import typings.rebass.rebassStrings.email
import typings.rebass.rebassStrings.execute
import typings.rebass.rebassStrings.fontSizes
import typings.rebass.rebassStrings.grammar
import typings.rebass.rebassStrings.grid
import typings.rebass.rebassStrings.horizontal
import typings.rebass.rebassStrings.inherit
import typings.rebass.rebassStrings.link
import typings.rebass.rebassStrings.list
import typings.rebass.rebassStrings.listbox
import typings.rebass.rebassStrings.location
import typings.rebass.rebassStrings.menu
import typings.rebass.rebassStrings.mixed
import typings.rebass.rebassStrings.move
import typings.rebass.rebassStrings.no
import typings.rebass.rebassStrings.none
import typings.rebass.rebassStrings.numeric
import typings.rebass.rebassStrings.off
import typings.rebass.rebassStrings.on
import typings.rebass.rebassStrings.other
import typings.rebass.rebassStrings.page
import typings.rebass.rebassStrings.polite
import typings.rebass.rebassStrings.popup
import typings.rebass.rebassStrings.removals
import typings.rebass.rebassStrings.search
import typings.rebass.rebassStrings.space
import typings.rebass.rebassStrings.spelling
import typings.rebass.rebassStrings.step
import typings.rebass.rebassStrings.tel
import typings.rebass.rebassStrings.text
import typings.rebass.rebassStrings.time
import typings.rebass.rebassStrings.tree
import typings.rebass.rebassStrings.url
import typings.rebass.rebassStrings.vertical
import typings.rebass.rebassStrings.yes
import typings.std.Event
import typings.std.HTMLDivElement
import typings.styledComponents.styledComponentsMod.CSSObject
import typings.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import typings.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent rebass.rebass.BoxKnownProps */
/* Inlined parent rebass.rebass.Omit<react.react.HTMLProps<std.HTMLDivElement>, keyof rebass.rebass.BoxKnownProps> */
@js.native
trait BoxProps extends js.Object {
  var about: js.UndefOr[String] = js.native
  var accept: js.UndefOr[String] = js.native
  var acceptCharset: js.UndefOr[String] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var action: js.UndefOr[String] = js.native
  /**
    * The align-self CSS property aligns flex items of the current flex line overriding the align-items value.
    *
    * If any of the item's cross-axis margin is set to auto, then align-self is ignored. In Grid layout align-self
    * aligns the item inside the grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-self)
    */
  var alignSelf: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.AlignSelfProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  var allowFullScreen: js.UndefOr[Boolean] = js.native
  var allowTransparency: js.UndefOr[Boolean] = js.native
  var alt: js.UndefOr[String] = js.native
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
  var as: js.UndefOr[ElementType[_]] = js.native
  var async: js.UndefOr[Boolean] = js.native
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var autoPlay: js.UndefOr[Boolean] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
    */
  var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
  var capture: js.UndefOr[Boolean | String] = js.native
  var cellPadding: js.UndefOr[Double | String] = js.native
  var cellSpacing: js.UndefOr[Double | String] = js.native
  var challenge: js.UndefOr[String] = js.native
  var charSet: js.UndefOr[String] = js.native
  var checked: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var cite: js.UndefOr[String] = js.native
  var classID: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var colSpan: js.UndefOr[Double] = js.native
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
    */
  var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
  var cols: js.UndefOr[Double] = js.native
  var content: js.UndefOr[String] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var controls: js.UndefOr[Boolean] = js.native
  var coords: js.UndefOr[String] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  var data: js.UndefOr[String] = js.native
  var datatype: js.UndefOr[String] = js.native
  var dateTime: js.UndefOr[String] = js.native
  var default: js.UndefOr[Boolean] = js.native
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var defer: js.UndefOr[Boolean] = js.native
  var dir: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The display CSS property defines the display type of an element, which consists of the two basic qualities
    * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
    * and the inner display type defining how the children of the box are laid out.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var display: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.DisplayProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  var download: js.UndefOr[js.Any] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var encType: js.UndefOr[String] = js.native
  /**
    * The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in
    * its flex container. This is a shorthand property that sets flex-grow, flex-shrink, and flex-basis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex)
    */
  var flex: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FlexProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The fontSize utility parses a component's `fontSize` prop and converts it into a CSS font-size declaration.
    *
    * - Numbers from 0-8 (or `theme.fontSizes.length`) are converted to values on the [font size scale](#default-theme).
    * - Numbers greater than `theme.fontSizes.length` are converted to raw pixel values.
    * - String values are passed as raw CSS values.
    * - And array values are converted into responsive values.
    *
    */
  var fontSize: js.UndefOr[ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, _], RequiredTheme]] = js.native
  var form: js.UndefOr[String] = js.native
  var formAction: js.UndefOr[String] = js.native
  var formEncType: js.UndefOr[String] = js.native
  var formMethod: js.UndefOr[String] = js.native
  var formNoValidate: js.UndefOr[Boolean] = js.native
  var formTarget: js.UndefOr[String] = js.native
  var frameBorder: js.UndefOr[Double | String] = js.native
  var headers: js.UndefOr[String] = js.native
  /**
    * The height CSS property specifies the height of an element. By default, the property defines the height of the
    * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
    */
  var height: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var high: js.UndefOr[Double] = js.native
  var href: js.UndefOr[String] = js.native
  var hrefLang: js.UndefOr[String] = js.native
  var htmlFor: js.UndefOr[String] = js.native
  var httpEquiv: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  var integrity: js.UndefOr[String] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var key: js.UndefOr[Key] = js.native
  var keyParams: js.UndefOr[String] = js.native
  var keyType: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var list: js.UndefOr[String] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var low: js.UndefOr[Double] = js.native
  /** Margin on top, left, bottom and right */
  var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var manifest: js.UndefOr[String] = js.native
  /** Margin on top, left, bottom and right */
  var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on bottom */
  var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var marginHeight: js.UndefOr[Double] = js.native
  /** Margin on left */
  var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on right */
  var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top */
  var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var marginWidth: js.UndefOr[Double] = js.native
  /** Margin on left and right */
  var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top and bottom */
  var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var max: js.UndefOr[Double | String] = js.native
  /**
    * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
    * property from becoming larger than the value specified for max-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
    */
  var maxHeight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxHeightProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * The max-width CSS property sets the maximum width of an element.
    * It prevents the used value of the width property from becoming larger than the value specified by max-width.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
    */
  var maxWidth: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxWidthProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /** Margin on bottom */
  var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var media: js.UndefOr[String] = js.native
  var mediaGroup: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var min: js.UndefOr[Double | String] = js.native
  /**
    * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
    * property from becoming smaller than the value specified for min-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var minHeight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinHeightProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  var minLength: js.UndefOr[Double] = js.native
  /**
    * The min-width CSS property sets the minimum width of an element.
    * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
    */
  var minWidth: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinWidthProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /** Margin on left */
  var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on right */
  var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top */
  var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  /** Margin on left and right */
  var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top and bottom */
  var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var name: js.UndefOr[String] = js.native
  var noValidate: js.UndefOr[Boolean] = js.native
  var nonce: js.UndefOr[String] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onChange: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.native
  /**
    * The opacity CSS property sets the transparency of an element or the degree to which content
    * behind an element is visible.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
    */
  var opacity: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
      RequiredTheme
    ]
  ] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var optimum: js.UndefOr[Double] = js.native
  /**
    * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
    * are sorted by ascending order value and then by their source code order.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
    */
  var order: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The overflow CSS property sets what to do when an element's content is too big to fit in its block
    * formatting context. It is a shorthand for overflow-x and overflow-y.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
    */
  var overflow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The overflow-x CSS property sets what shows when content overflows a block-level element's left
    * and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
    */
  var overflowX: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowXProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The overflow-y CSS property sets what shows when content overflows a block-level element's top
    * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
    */
  var overflowY: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowYProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  /** Padding on top, left, bottom and right */
  var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top, left, bottom and right */
  var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on bottom */
  var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on left */
  var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on right */
  var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top */
  var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on left and right */
  var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top and bottom */
  var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var pattern: js.UndefOr[String] = js.native
  /** Padding on bottom */
  var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on left */
  var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var playsInline: js.UndefOr[Boolean] = js.native
  var poster: js.UndefOr[String] = js.native
  /** Padding on right */
  var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var prefix: js.UndefOr[String] = js.native
  var preload: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  /** Padding on top */
  var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on left and right */
  var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top and bottom */
  var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var ref: js.UndefOr[Ref[_]] = js.native
  var rel: js.UndefOr[String] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var reversed: js.UndefOr[Boolean] = js.native
  var role: js.UndefOr[String] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
  var rows: js.UndefOr[Double] = js.native
  var sandbox: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
  var scoped: js.UndefOr[Boolean] = js.native
  var scrolling: js.UndefOr[String] = js.native
  var seamless: js.UndefOr[Boolean] = js.native
  var security: js.UndefOr[String] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var shape: js.UndefOr[String] = js.native
  var size: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  var sizes: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var span: js.UndefOr[Double] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var src: js.UndefOr[String] = js.native
  var srcDoc: js.UndefOr[String] = js.native
  var srcLang: js.UndefOr[String] = js.native
  var srcSet: js.UndefOr[String] = js.native
  var start: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double | String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var summary: js.UndefOr[String] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  /**
    * The sx prop lets you style elements inline, using values from your theme.
    */
  var sx: js.UndefOr[SxStyleProp] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var target: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var tx: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var useMap: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
  var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.native
  /**
    * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
    */
  var verticalAlign: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.VerticalAlignProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  var vocab: js.UndefOr[String] = js.native
  /**
    *   The width utility parses a component's `width` prop and converts it into a CSS width declaration.
    *
    *   - Numbers from 0-1 are converted to percentage widths.
    *   - Numbers greater than 1 are converted to pixel values.
    *   - String values are passed as raw CSS values.
    *   - And arrays are converted to responsive width styles.
    */
  var width: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.WidthProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  var wmode: js.UndefOr[String] = js.native
  var wrap: js.UndefOr[String] = js.native
}

object BoxProps {
  @scala.inline
  def apply(): BoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxProps]
  }
  @scala.inline
  implicit class BoxPropsOps[Self <: BoxProps] (val x: Self) extends AnyVal {
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
    def setAbout(value: String): Self = this.set("about", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setAcceptCharset(value: String): Self = this.set("acceptCharset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptCharset: Self = this.set("acceptCharset", js.undefined)
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAlignSelfVarargs(value: (js.Any | Null)*): Self = this.set("alignSelf", js.Array(value :_*))
    @scala.inline
    def setAlignSelf(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.AlignSelfProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setAlignSelfNull: Self = this.set("alignSelf", null)
    @scala.inline
    def setAllowFullScreen(value: Boolean): Self = this.set("allowFullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFullScreen: Self = this.set("allowFullScreen", js.undefined)
    @scala.inline
    def setAllowTransparency(value: Boolean): Self = this.set("allowTransparency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTransparency: Self = this.set("allowTransparency", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
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
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
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
    def setAs(value: ElementType[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setAutoCapitalize(value: String): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoCorrect(value: String): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setAutoSave(value: String): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    @scala.inline
    def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = this.set("backgroundColor", js.Array(value :_*))
    @scala.inline
    def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBackgroundColorNull: Self = this.set("backgroundColor", null)
    @scala.inline
    def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = this.set("bg", js.Array(value :_*))
    @scala.inline
    def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = this.set("bg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    @scala.inline
    def setBgNull: Self = this.set("bg", null)
    @scala.inline
    def setCapture(value: Boolean | String): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setCellPadding(value: Double | String): Self = this.set("cellPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellPadding: Self = this.set("cellPadding", js.undefined)
    @scala.inline
    def setCellSpacing(value: Double | String): Self = this.set("cellSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellSpacing: Self = this.set("cellSpacing", js.undefined)
    @scala.inline
    def setChallenge(value: String): Self = this.set("challenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChallenge: Self = this.set("challenge", js.undefined)
    @scala.inline
    def setCharSet(value: String): Self = this.set("charSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharSet: Self = this.set("charSet", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCite(value: String): Self = this.set("cite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCite: Self = this.set("cite", js.undefined)
    @scala.inline
    def setClassID(value: String): Self = this.set("classID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassID: Self = this.set("classID", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorNull: Self = this.set("color", null)
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setCoords(value: String): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoords: Self = this.set("coords", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setCss(value: CSSObject | FlattenSimpleInterpolation | String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setDateTime(value: String): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTime: Self = this.set("dateTime", js.undefined)
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
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
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisplayVarargs(value: (js.Any | Null)*): Self = this.set("display", js.Array(value :_*))
    @scala.inline
    def setDisplay(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.DisplayProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setDisplayNull: Self = this.set("display", null)
    @scala.inline
    def setDownload(value: js.Any): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    @scala.inline
    def setDraggable(value: Booleanish): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEncType(value: String): Self = this.set("encType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncType: Self = this.set("encType", js.undefined)
    @scala.inline
    def setFlexVarargs(value: (js.Any | Null)*): Self = this.set("flex", js.Array(value :_*))
    @scala.inline
    def setFlex(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FlexProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    @scala.inline
    def setFlexNull: Self = this.set("flex", null)
    @scala.inline
    def setFontSizeVarargs(value: ((ThemeValue[fontSizes, RequiredTheme, js.Any]) | Null)*): Self = this.set("fontSize", js.Array(value :_*))
    @scala.inline
    def setFontSize(value: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, _], RequiredTheme]): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontSizeNull: Self = this.set("fontSize", null)
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
    def setFrameBorder(value: Double | String): Self = this.set("frameBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameBorder: Self = this.set("frameBorder", js.undefined)
    @scala.inline
    def setHeaders(value: String): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHeightVarargs(value: (js.Any | Null)*): Self = this.set("height", js.Array(value :_*))
    @scala.inline
    def setHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHeightNull: Self = this.set("height", null)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setHrefLang(value: String): Self = this.set("hrefLang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHrefLang: Self = this.set("hrefLang", js.undefined)
    @scala.inline
    def setHtmlFor(value: String): Self = this.set("htmlFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlFor: Self = this.set("htmlFor", js.undefined)
    @scala.inline
    def setHttpEquiv(value: String): Self = this.set("httpEquiv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpEquiv: Self = this.set("httpEquiv", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
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
    def setItemScope(value: Boolean): Self = this.set("itemScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemScope: Self = this.set("itemScope", js.undefined)
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeyParams(value: String): Self = this.set("keyParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyParams: Self = this.set("keyParams", js.undefined)
    @scala.inline
    def setKeyType(value: String): Self = this.set("keyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    @scala.inline
    def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("m", js.Array(value :_*))
    @scala.inline
    def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    @scala.inline
    def setMNull: Self = this.set("m", null)
    @scala.inline
    def setManifest(value: String): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
    @scala.inline
    def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("margin", js.Array(value :_*))
    @scala.inline
    def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMarginNull: Self = this.set("margin", null)
    @scala.inline
    def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("marginBottom", js.Array(value :_*))
    @scala.inline
    def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginBottomNull: Self = this.set("marginBottom", null)
    @scala.inline
    def setMarginHeight(value: Double): Self = this.set("marginHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginHeight: Self = this.set("marginHeight", js.undefined)
    @scala.inline
    def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("marginLeft", js.Array(value :_*))
    @scala.inline
    def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginLeftNull: Self = this.set("marginLeft", null)
    @scala.inline
    def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("marginRight", js.Array(value :_*))
    @scala.inline
    def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMarginRightNull: Self = this.set("marginRight", null)
    @scala.inline
    def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("marginTop", js.Array(value :_*))
    @scala.inline
    def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setMarginTopNull: Self = this.set("marginTop", null)
    @scala.inline
    def setMarginWidth(value: Double): Self = this.set("marginWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginWidth: Self = this.set("marginWidth", js.undefined)
    @scala.inline
    def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("marginX", js.Array(value :_*))
    @scala.inline
    def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("marginX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginX: Self = this.set("marginX", js.undefined)
    @scala.inline
    def setMarginXNull: Self = this.set("marginX", null)
    @scala.inline
    def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("marginY", js.Array(value :_*))
    @scala.inline
    def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("marginY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginY: Self = this.set("marginY", js.undefined)
    @scala.inline
    def setMarginYNull: Self = this.set("marginY", null)
    @scala.inline
    def setMax(value: Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxHeightVarargs(value: (js.Any | Null)*): Self = this.set("maxHeight", js.Array(value :_*))
    @scala.inline
    def setMaxHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxHeightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxHeightNull: Self = this.set("maxHeight", null)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMaxWidthVarargs(value: (js.Any | Null)*): Self = this.set("maxWidth", js.Array(value :_*))
    @scala.inline
    def setMaxWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxWidthProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMaxWidthNull: Self = this.set("maxWidth", null)
    @scala.inline
    def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("mb", js.Array(value :_*))
    @scala.inline
    def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("mb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMb: Self = this.set("mb", js.undefined)
    @scala.inline
    def setMbNull: Self = this.set("mb", null)
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setMediaGroup(value: String): Self = this.set("mediaGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaGroup: Self = this.set("mediaGroup", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMin(value: Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinHeightVarargs(value: (js.Any | Null)*): Self = this.set("minHeight", js.Array(value :_*))
    @scala.inline
    def setMinHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinHeightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinHeightNull: Self = this.set("minHeight", null)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setMinWidthVarargs(value: (js.Any | Null)*): Self = this.set("minWidth", js.Array(value :_*))
    @scala.inline
    def setMinWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinWidthProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setMinWidthNull: Self = this.set("minWidth", null)
    @scala.inline
    def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("ml", js.Array(value :_*))
    @scala.inline
    def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("ml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMl: Self = this.set("ml", js.undefined)
    @scala.inline
    def setMlNull: Self = this.set("ml", null)
    @scala.inline
    def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("mr", js.Array(value :_*))
    @scala.inline
    def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("mr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMr: Self = this.set("mr", js.undefined)
    @scala.inline
    def setMrNull: Self = this.set("mr", null)
    @scala.inline
    def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("mt", js.Array(value :_*))
    @scala.inline
    def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("mt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMt: Self = this.set("mt", js.undefined)
    @scala.inline
    def setMtNull: Self = this.set("mt", null)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("mx", js.Array(value :_*))
    @scala.inline
    def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("mx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMx: Self = this.set("mx", js.undefined)
    @scala.inline
    def setMxNull: Self = this.set("mx", null)
    @scala.inline
    def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("my", js.Array(value :_*))
    @scala.inline
    def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("my", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMy: Self = this.set("my", js.undefined)
    @scala.inline
    def setMyNull: Self = this.set("my", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNoValidate(value: Boolean): Self = this.set("noValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoValidate: Self = this.set("noValidate", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setOnAbort(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    @scala.inline
    def setOnAnimationEnd(value: AnimationEvent[HTMLDivElement] => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    @scala.inline
    def setOnAnimationIteration(value: AnimationEvent[HTMLDivElement] => Unit): Self = this.set("onAnimationIteration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    @scala.inline
    def setOnAnimationStart(value: AnimationEvent[HTMLDivElement] => Unit): Self = this.set("onAnimationStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    @scala.inline
    def setOnAuxClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onAuxClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", js.undefined)
    @scala.inline
    def setOnBeforeInput(value: FormEvent[HTMLDivElement] => Unit): Self = this.set("onBeforeInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", js.undefined)
    @scala.inline
    def setOnBlur(value: FocusEvent[HTMLDivElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onCanPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onCanPlayThrough", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    @scala.inline
    def setOnChange(value: FormEvent[HTMLDivElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnCompositionEnd(value: CompositionEvent[HTMLDivElement] => Unit): Self = this.set("onCompositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    @scala.inline
    def setOnCompositionStart(value: CompositionEvent[HTMLDivElement] => Unit): Self = this.set("onCompositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    @scala.inline
    def setOnCompositionUpdate(value: CompositionEvent[HTMLDivElement] => Unit): Self = this.set("onCompositionUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    @scala.inline
    def setOnContextMenu(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnCopy(value: ClipboardEvent[HTMLDivElement] => Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    @scala.inline
    def setOnCut(value: ClipboardEvent[HTMLDivElement] => Unit): Self = this.set("onCut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    @scala.inline
    def setOnDrag(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragEnd(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragEnter(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragExit(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragExit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    @scala.inline
    def setOnDragLeave(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    @scala.inline
    def setOnDragOver(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    @scala.inline
    def setOnDragStart(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDrop(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onDurationChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onEmptied", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onEncrypted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    @scala.inline
    def setOnEnded(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    @scala.inline
    def setOnError(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLDivElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnInput(value: FormEvent[HTMLDivElement] => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    @scala.inline
    def setOnInvalid(value: FormEvent[HTMLDivElement] => Unit): Self = this.set("onInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyPress(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnLoad(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onLoadStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onLoadedData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onLoadedMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    @scala.inline
    def setOnMouseDown(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseOut(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    @scala.inline
    def setOnMouseOver(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    @scala.inline
    def setOnMouseUp(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnPaste(value: ClipboardEvent[HTMLDivElement] => Unit): Self = this.set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    @scala.inline
    def setOnPause(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPlay(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onPlaying", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    @scala.inline
    def setOnPointerCancel(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    @scala.inline
    def setOnPointerDown(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    @scala.inline
    def setOnPointerEnter(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    @scala.inline
    def setOnPointerLeave(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    @scala.inline
    def setOnPointerMove(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    @scala.inline
    def setOnPointerOut(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    @scala.inline
    def setOnPointerOver(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    @scala.inline
    def setOnPointerUp(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    @scala.inline
    def setOnProgress(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    @scala.inline
    def setOnReset(value: FormEvent[HTMLDivElement] => Unit): Self = this.set("onReset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setOnScroll(value: UIEvent[HTMLDivElement, NativeUIEvent] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    @scala.inline
    def setOnSelect(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnStalled(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onStalled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    @scala.inline
    def setOnSubmit(value: FormEvent[HTMLDivElement] => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onSuspend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    @scala.inline
    def setOnTouchCancel(value: TouchEvent[HTMLDivElement] => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[HTMLDivElement] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchMove(value: TouchEvent[HTMLDivElement] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    @scala.inline
    def setOnTouchStart(value: TouchEvent[HTMLDivElement] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setOnTransitionEnd(value: TransitionEvent[HTMLDivElement] => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    @scala.inline
    def setOnWheel(value: WheelEvent[HTMLDivElement] => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    @scala.inline
    def setOpacityVarargs(value: (js.Any | Null)*): Self = this.set("opacity", js.Array(value :_*))
    @scala.inline
    def setOpacity(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
          RequiredTheme
        ]
    ): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOpacityNull: Self = this.set("opacity", null)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOptimum(value: Double): Self = this.set("optimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimum: Self = this.set("optimum", js.undefined)
    @scala.inline
    def setOrderVarargs(value: (js.Any | Null)*): Self = this.set("order", js.Array(value :_*))
    @scala.inline
    def setOrder(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
          RequiredTheme
        ]
    ): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setOrderNull: Self = this.set("order", null)
    @scala.inline
    def setOverflowVarargs(value: (js.Any | Null)*): Self = this.set("overflow", js.Array(value :_*))
    @scala.inline
    def setOverflow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setOverflowNull: Self = this.set("overflow", null)
    @scala.inline
    def setOverflowXVarargs(value: (js.Any | Null)*): Self = this.set("overflowX", js.Array(value :_*))
    @scala.inline
    def setOverflowX(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowXProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("overflowX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowX: Self = this.set("overflowX", js.undefined)
    @scala.inline
    def setOverflowXNull: Self = this.set("overflowX", null)
    @scala.inline
    def setOverflowYVarargs(value: (js.Any | Null)*): Self = this.set("overflowY", js.Array(value :_*))
    @scala.inline
    def setOverflowY(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowYProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("overflowY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowY: Self = this.set("overflowY", js.undefined)
    @scala.inline
    def setOverflowYNull: Self = this.set("overflowY", null)
    @scala.inline
    def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("p", js.Array(value :_*))
    @scala.inline
    def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    @scala.inline
    def setPNull: Self = this.set("p", null)
    @scala.inline
    def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("padding", js.Array(value :_*))
    @scala.inline
    def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPaddingNull: Self = this.set("padding", null)
    @scala.inline
    def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("paddingBottom", js.Array(value :_*))
    @scala.inline
    def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    @scala.inline
    def setPaddingBottomNull: Self = this.set("paddingBottom", null)
    @scala.inline
    def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("paddingLeft", js.Array(value :_*))
    @scala.inline
    def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    @scala.inline
    def setPaddingLeftNull: Self = this.set("paddingLeft", null)
    @scala.inline
    def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("paddingRight", js.Array(value :_*))
    @scala.inline
    def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    @scala.inline
    def setPaddingRightNull: Self = this.set("paddingRight", null)
    @scala.inline
    def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("paddingTop", js.Array(value :_*))
    @scala.inline
    def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    @scala.inline
    def setPaddingTopNull: Self = this.set("paddingTop", null)
    @scala.inline
    def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("paddingX", js.Array(value :_*))
    @scala.inline
    def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("paddingX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingX: Self = this.set("paddingX", js.undefined)
    @scala.inline
    def setPaddingXNull: Self = this.set("paddingX", null)
    @scala.inline
    def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("paddingY", js.Array(value :_*))
    @scala.inline
    def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("paddingY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingY: Self = this.set("paddingY", js.undefined)
    @scala.inline
    def setPaddingYNull: Self = this.set("paddingY", null)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("pb", js.Array(value :_*))
    @scala.inline
    def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("pb", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePb: Self = this.set("pb", js.undefined)
    @scala.inline
    def setPbNull: Self = this.set("pb", null)
    @scala.inline
    def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("pl", js.Array(value :_*))
    @scala.inline
    def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("pl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePl: Self = this.set("pl", js.undefined)
    @scala.inline
    def setPlNull: Self = this.set("pl", null)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaysInline(value: Boolean): Self = this.set("playsInline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaysInline: Self = this.set("playsInline", js.undefined)
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoster: Self = this.set("poster", js.undefined)
    @scala.inline
    def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("pr", js.Array(value :_*))
    @scala.inline
    def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("pr", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePr: Self = this.set("pr", js.undefined)
    @scala.inline
    def setPrNull: Self = this.set("pr", null)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPreload(value: String): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("pt", js.Array(value :_*))
    @scala.inline
    def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("pt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePt: Self = this.set("pt", js.undefined)
    @scala.inline
    def setPtNull: Self = this.set("pt", null)
    @scala.inline
    def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("px", js.Array(value :_*))
    @scala.inline
    def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("px", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePx: Self = this.set("px", js.undefined)
    @scala.inline
    def setPxNull: Self = this.set("px", null)
    @scala.inline
    def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("py", js.Array(value :_*))
    @scala.inline
    def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("py", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePy: Self = this.set("py", js.undefined)
    @scala.inline
    def setPyNull: Self = this.set("py", null)
    @scala.inline
    def setRadioGroup(value: String): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRel: Self = this.set("rel", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSandbox(value: String): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setScoped(value: Boolean): Self = this.set("scoped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoped: Self = this.set("scoped", js.undefined)
    @scala.inline
    def setScrolling(value: String): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    @scala.inline
    def setSeamless(value: Boolean): Self = this.set("seamless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeamless: Self = this.set("seamless", js.undefined)
    @scala.inline
    def setSecurity(value: String): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSizeVarargs(value: (js.Any | Null)*): Self = this.set("size", js.Array(value :_*))
    @scala.inline
    def setSize(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSizeNull: Self = this.set("size", null)
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    @scala.inline
    def setSpan(value: Double): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
    @scala.inline
    def setSpellCheck(value: Booleanish): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setSrcDoc(value: String): Self = this.set("srcDoc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcDoc: Self = this.set("srcDoc", js.undefined)
    @scala.inline
    def setSrcLang(value: String): Self = this.set("srcLang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcLang: Self = this.set("srcLang", js.undefined)
    @scala.inline
    def setSrcSet(value: String): Self = this.set("srcSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcSet: Self = this.set("srcSet", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStep(value: Double | String): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setSuppressContentEditableWarning(value: Boolean): Self = this.set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressContentEditableWarning: Self = this.set("suppressContentEditableWarning", js.undefined)
    @scala.inline
    def setSuppressHydrationWarning(value: Boolean): Self = this.set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressHydrationWarning: Self = this.set("suppressHydrationWarning", js.undefined)
    @scala.inline
    def setSx(value: SxStyleProp): Self = this.set("sx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSx: Self = this.set("sx", js.undefined)
    @scala.inline
    def setSxNull: Self = this.set("sx", null)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTranslate(value: yes | no): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setTx(value: String): Self = this.set("tx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTx: Self = this.set("tx", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
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
    def setUseMap(value: String): Self = this.set("useMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMap: Self = this.set("useMap", js.undefined)
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVariantVarargs(value: (String | Null)*): Self = this.set("variant", js.Array(value :_*))
    @scala.inline
    def setVariant(value: ResponsiveValue[String, RequiredTheme]): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
    @scala.inline
    def setVariantNull: Self = this.set("variant", null)
    @scala.inline
    def setVerticalAlignVarargs(value: (js.Any | Null)*): Self = this.set("verticalAlign", js.Array(value :_*))
    @scala.inline
    def setVerticalAlign(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.VerticalAlignProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setVerticalAlignNull: Self = this.set("verticalAlign", null)
    @scala.inline
    def setVocab(value: String): Self = this.set("vocab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
    @scala.inline
    def setWidthVarargs(value: (js.Any | Null)*): Self = this.set("width", js.Array(value :_*))
    @scala.inline
    def setWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.WidthProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWidthNull: Self = this.set("width", null)
    @scala.inline
    def setWmode(value: String): Self = this.set("wmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWmode: Self = this.set("wmode", js.undefined)
    @scala.inline
    def setWrap(value: String): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

