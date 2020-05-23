package typings.rebass.mod

import typings.csstype.mod.AlignSelfProperty
import typings.csstype.mod.DisplayProperty
import typings.csstype.mod.FlexProperty
import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontStyleProperty
import typings.csstype.mod.GlobalsNumber
import typings.csstype.mod.HeightProperty
import typings.csstype.mod.MaxHeightProperty
import typings.csstype.mod.MaxWidthProperty
import typings.csstype.mod.MinHeightProperty
import typings.csstype.mod.MinWidthProperty
import typings.csstype.mod.OverflowProperty
import typings.csstype.mod.OverflowXProperty
import typings.csstype.mod.OverflowYProperty
import typings.csstype.mod.TextAlignProperty
import typings.csstype.mod.VerticalAlignProperty
import typings.csstype.mod.WidthProperty
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
import typings.rebass.rebassStrings.fontWeights
import typings.rebass.rebassStrings.grammar
import typings.rebass.rebassStrings.grid
import typings.rebass.rebassStrings.horizontal
import typings.rebass.rebassStrings.inherit
import typings.rebass.rebassStrings.letterSpacings
import typings.rebass.rebassStrings.lineHeights
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
import typings.std.HTMLHeadingElement
import typings.styledComponents.styledComponentsMod.CSSObject
import typings.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import typings.styledSystem.mod.TLengthStyledSystem
import typings.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent rebass.rebass.BoxKnownProps */
/* Inlined parent styled-system.styled-system.FontFamilyProps<styled-system.styled-system.RequiredTheme> */
/* Inlined parent styled-system.styled-system.FontWeightProps<styled-system.styled-system.RequiredTheme, styled-system.styled-system.ThemeValue<'fontWeights', styled-system.styled-system.RequiredTheme, any>> */
/* Inlined parent styled-system.styled-system.FontStyleProps<styled-system.styled-system.RequiredTheme> */
/* Inlined parent styled-system.styled-system.TextAlignProps<styled-system.styled-system.RequiredTheme> */
/* Inlined parent styled-system.styled-system.LineHeightProps<styled-system.styled-system.RequiredTheme, styled-system.styled-system.ThemeValue<'lineHeights', styled-system.styled-system.RequiredTheme, any>> */
/* Inlined parent styled-system.styled-system.LetterSpacingProps<styled-system.styled-system.RequiredTheme, styled-system.styled-system.ThemeValue<'letterSpacings', styled-system.styled-system.RequiredTheme, any>> */
/* Inlined parent rebass.rebass.Omit<react.react.HTMLProps<std.HTMLHeadingElement>, keyof rebass.rebass.TextKnownProps> */
trait HeadingProps extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accept: js.UndefOr[String] = js.undefined
  var acceptCharset: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var action: js.UndefOr[String] = js.undefined
  /**
    * The align-self CSS property aligns flex items of the current flex line overriding the align-items value.
    *
    * If any of the item's cross-axis margin is set to auto, then align-self is ignored. In Grid layout align-self
    * aligns the item inside the grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-self)
    */
  var alignSelf: js.UndefOr[ResponsiveValue[AlignSelfProperty, RequiredTheme]] = js.undefined
  var allowFullScreen: js.UndefOr[Boolean] = js.undefined
  var allowTransparency: js.UndefOr[Boolean] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `aria-level`: js.UndefOr[Double] = js.undefined
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  var `aria-owns`: js.UndefOr[String] = js.undefined
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  var as: js.UndefOr[ElementType[_]] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.undefined
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
    */
  var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.undefined
  var capture: js.UndefOr[Boolean | String] = js.undefined
  var cellPadding: js.UndefOr[Double | String] = js.undefined
  var cellSpacing: js.UndefOr[Double | String] = js.undefined
  var challenge: js.UndefOr[String] = js.undefined
  var charSet: js.UndefOr[String] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var cite: js.UndefOr[String] = js.undefined
  var classID: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
    */
  var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var coords: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var dateTime: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[Boolean] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The display CSS property defines the display type of an element, which consists of the two basic qualities
    * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
    * and the inner display type defining how the children of the box are laid out.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var display: js.UndefOr[ResponsiveValue[DisplayProperty, RequiredTheme]] = js.undefined
  var download: js.UndefOr[js.Any] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  var encType: js.UndefOr[String] = js.undefined
  /**
    * The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in
    * its flex container. This is a shorthand property that sets flex-grow, flex-shrink, and flex-basis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex)
    */
  var flex: js.UndefOr[ResponsiveValue[FlexProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  var fontFamily: js.UndefOr[ResponsiveValue[FontFamilyProperty, RequiredTheme]] = js.undefined
  /**
    * The fontSize utility parses a component's `fontSize` prop and converts it into a CSS font-size declaration.
    *
    * - Numbers from 0-8 (or `theme.fontSizes.length`) are converted to values on the [font size scale](#default-theme).
    * - Numbers greater than `theme.fontSizes.length` are converted to raw pixel values.
    * - String values are passed as raw CSS values.
    * - And array values are converted into responsive values.
    *
    */
  var fontSize: js.UndefOr[ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, _], RequiredTheme]] = js.undefined
  /**
    * The font-style CSS property specifies whether a font should be styled with a normal, italic,
    * or oblique face from its font-family.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-style)
    */
  var fontStyle: js.UndefOr[ResponsiveValue[FontStyleProperty, RequiredTheme]] = js.undefined
  /**
    * The font-weight CSS property specifies the weight (or boldness) of the font.
    *
    * The font weights available to you will depend on the font-family you are using. Some fonts are only available in normal and bold.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight)
    */
  var fontWeight: js.UndefOr[ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, _], RequiredTheme]] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var formAction: js.UndefOr[String] = js.undefined
  var formEncType: js.UndefOr[String] = js.undefined
  var formMethod: js.UndefOr[String] = js.undefined
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  var formTarget: js.UndefOr[String] = js.undefined
  var frameBorder: js.UndefOr[Double | String] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  /**
    * The height CSS property specifies the height of an element. By default, the property defines the height of the
    * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
    */
  var height: js.UndefOr[ResponsiveValue[HeightProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var high: js.UndefOr[Double] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var hrefLang: js.UndefOr[String] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var httpEquiv: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var keyParams: js.UndefOr[String] = js.undefined
  var keyType: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  /**
    * The letter-spacing CSS property sets the spacing behavior between text characters.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing)
    */
  var letterSpacing: js.UndefOr[ResponsiveValue[ThemeValue[letterSpacings, RequiredTheme, _], RequiredTheme]] = js.undefined
  /**
    * The line-height CSS property sets the amount of space used for lines, such as in text. On block-level elements,
    * it specifies the minimum height of line boxes within the element.
    *
    * On non-replaced inline elements, it specifies the height that is used to calculate line box height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/line-height)
    */
  var lineHeight: js.UndefOr[ResponsiveValue[ThemeValue[lineHeights, RequiredTheme, _], RequiredTheme]] = js.undefined
  var list: js.UndefOr[String] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var low: js.UndefOr[Double] = js.undefined
  /** Margin on top, left, bottom and right */
  var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var manifest: js.UndefOr[String] = js.undefined
  /** Margin on top, left, bottom and right */
  var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on bottom */
  var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var marginHeight: js.UndefOr[Double] = js.undefined
  /** Margin on left */
  var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on right */
  var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on top */
  var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var marginWidth: js.UndefOr[Double] = js.undefined
  /** Margin on left and right */
  var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on top and bottom */
  var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var max: js.UndefOr[Double | String] = js.undefined
  /**
    * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
    * property from becoming larger than the value specified for max-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
    */
  var maxHeight: js.UndefOr[ResponsiveValue[MaxHeightProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * The max-width CSS property sets the maximum width of an element.
    * It prevents the used value of the width property from becoming larger than the value specified by max-width.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
    */
  var maxWidth: js.UndefOr[ResponsiveValue[MaxWidthProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  /** Margin on bottom */
  var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var mediaGroup: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[Double | String] = js.undefined
  /**
    * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
    * property from becoming smaller than the value specified for min-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var minHeight: js.UndefOr[ResponsiveValue[MinHeightProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  /**
    * The min-width CSS property sets the minimum width of an element.
    * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
    */
  var minWidth: js.UndefOr[ResponsiveValue[MinWidthProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  /** Margin on left */
  var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on right */
  var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on top */
  var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  /** Margin on left and right */
  var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Margin on top and bottom */
  var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noValidate: js.UndefOr[Boolean] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLHeadingElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLHeadingElement]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLHeadingElement]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLHeadingElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLHeadingElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLHeadingElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[HTMLHeadingElement]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLHeadingElement]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLHeadingElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLHeadingElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLHeadingElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLHeadingElement]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLHeadingElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLHeadingElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLHeadingElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[HTMLHeadingElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLHeadingElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLHeadingElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[HTMLHeadingElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLHeadingElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[HTMLHeadingElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[HTMLHeadingElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[HTMLHeadingElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLHeadingElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLHeadingElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[HTMLHeadingElement]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLHeadingElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLHeadingElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLHeadingElement]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLHeadingElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLHeadingElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLHeadingElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLHeadingElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLHeadingElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLHeadingElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLHeadingElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLHeadingElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLHeadingElement]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLHeadingElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLHeadingElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLHeadingElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLHeadingElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLHeadingElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLHeadingElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLHeadingElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[HTMLHeadingElement]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[HTMLHeadingElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[HTMLHeadingElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLHeadingElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLHeadingElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLHeadingElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLHeadingElement]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLHeadingElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLHeadingElement]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[HTMLHeadingElement]] = js.undefined
  /**
    * The opacity CSS property sets the transparency of an element or the degree to which content
    * behind an element is visible.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
    */
  var opacity: js.UndefOr[ResponsiveValue[GlobalsNumber, RequiredTheme]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var optimum: js.UndefOr[Double] = js.undefined
  /**
    * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
    * are sorted by ascending order value and then by their source code order.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
    */
  var order: js.UndefOr[ResponsiveValue[GlobalsNumber, RequiredTheme]] = js.undefined
  /**
    * The overflow CSS property sets what to do when an element's content is too big to fit in its block
    * formatting context. It is a shorthand for overflow-x and overflow-y.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
    */
  var overflow: js.UndefOr[ResponsiveValue[OverflowProperty, RequiredTheme]] = js.undefined
  /**
    * The overflow-x CSS property sets what shows when content overflows a block-level element's left
    * and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
    */
  var overflowX: js.UndefOr[ResponsiveValue[OverflowXProperty, RequiredTheme]] = js.undefined
  /**
    * The overflow-y CSS property sets what shows when content overflows a block-level element's top
    * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
    */
  var overflowY: js.UndefOr[ResponsiveValue[OverflowYProperty, RequiredTheme]] = js.undefined
  /** Padding on top, left, bottom and right */
  var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on top, left, bottom and right */
  var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on bottom */
  var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on left */
  var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on right */
  var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on top */
  var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on left and right */
  var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on top and bottom */
  var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  /** Padding on bottom */
  var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on left */
  var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var playsInline: js.UndefOr[Boolean] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  /** Padding on right */
  var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var preload: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  /** Padding on top */
  var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on left and right */
  var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  /** Padding on top and bottom */
  var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[Ref[_]] = js.undefined
  var rel: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var sandbox: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var scoped: js.UndefOr[Boolean] = js.undefined
  var scrolling: js.UndefOr[String] = js.undefined
  var seamless: js.UndefOr[Boolean] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[ResponsiveValue[HeightProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var span: js.UndefOr[Double] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcDoc: js.UndefOr[String] = js.undefined
  var srcLang: js.UndefOr[String] = js.undefined
  var srcSet: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  /**
    * The sx prop lets you style elements inline, using values from your theme.
    */
  var sx: js.UndefOr[SxStyleProp] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  /**
    * The text-align CSS property specifies the horizontal alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/text-align)
    */
  var textAlign: js.UndefOr[ResponsiveValue[TextAlignProperty, RequiredTheme]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var tx: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var useMap: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.undefined
  /**
    * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
    */
  var verticalAlign: js.UndefOr[ResponsiveValue[VerticalAlignProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
  /**
    *   The width utility parses a component's `width` prop and converts it into a CSS width declaration.
    *
    *   - Numbers from 0-1 are converted to percentage widths.
    *   - Numbers greater than 1 are converted to pixel values.
    *   - String values are passed as raw CSS values.
    *   - And arrays are converted to responsive width styles.
    */
  var width: js.UndefOr[ResponsiveValue[WidthProperty[TLengthStyledSystem], RequiredTheme]] = js.undefined
  var wmode: js.UndefOr[String] = js.undefined
  var wrap: js.UndefOr[String] = js.undefined
}

object HeadingProps {
  @scala.inline
  def apply(
    about: String = null,
    accept: String = null,
    acceptCharset: String = null,
    accessKey: String = null,
    action: String = null,
    alignSelf: js.UndefOr[Null | (ResponsiveValue[AlignSelfProperty, RequiredTheme])] = js.undefined,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    allowTransparency: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: js.UndefOr[Double] = js.undefined,
    `aria-colindex`: js.UndefOr[Double] = js.undefined,
    `aria-colspan`: js.UndefOr[Double] = js.undefined,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: js.UndefOr[Double] = js.undefined,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: js.UndefOr[Double] = js.undefined,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: js.UndefOr[Double] = js.undefined,
    `aria-rowindex`: js.UndefOr[Double] = js.undefined,
    `aria-rowspan`: js.UndefOr[Double] = js.undefined,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: js.UndefOr[Double] = js.undefined,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: js.UndefOr[Double] = js.undefined,
    `aria-valuemin`: js.UndefOr[Double] = js.undefined,
    `aria-valuenow`: js.UndefOr[Double] = js.undefined,
    `aria-valuetext`: String = null,
    as: ElementType[_] = null,
    async: js.UndefOr[Boolean] = js.undefined,
    autoCapitalize: String = null,
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    backgroundColor: js.UndefOr[Null | (ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme])] = js.undefined,
    bg: js.UndefOr[Null | (ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme])] = js.undefined,
    capture: Boolean | String = null,
    cellPadding: Double | String = null,
    cellSpacing: Double | String = null,
    challenge: String = null,
    charSet: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    cite: String = null,
    classID: String = null,
    className: String = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    color: js.UndefOr[Null | (ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme])] = js.undefined,
    cols: js.UndefOr[Double] = js.undefined,
    content: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    coords: String = null,
    crossOrigin: String = null,
    css: CSSObject | FlattenSimpleInterpolation | String = null,
    dangerouslySetInnerHTML: Html = null,
    data: String = null,
    datatype: String = null,
    dateTime: String = null,
    default: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    display: js.UndefOr[Null | (ResponsiveValue[DisplayProperty, RequiredTheme])] = js.undefined,
    download: js.Any = null,
    draggable: js.UndefOr[Booleanish] = js.undefined,
    encType: String = null,
    flex: js.UndefOr[Null | (ResponsiveValue[FlexProperty[TLengthStyledSystem], RequiredTheme])] = js.undefined,
    fontFamily: js.UndefOr[Null | (ResponsiveValue[FontFamilyProperty, RequiredTheme])] = js.undefined,
    fontSize: js.UndefOr[Null | (ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, _], RequiredTheme])] = js.undefined,
    fontStyle: js.UndefOr[Null | (ResponsiveValue[FontStyleProperty, RequiredTheme])] = js.undefined,
    fontWeight: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, _], RequiredTheme])
    ] = js.undefined,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    frameBorder: Double | String = null,
    headers: String = null,
    height: js.UndefOr[Null | (ResponsiveValue[HeightProperty[TLengthStyledSystem], RequiredTheme])] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    high: js.UndefOr[Double] = js.undefined,
    href: String = null,
    hrefLang: String = null,
    htmlFor: String = null,
    httpEquiv: String = null,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    integrity: String = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    key: Key = null,
    keyParams: String = null,
    keyType: String = null,
    kind: String = null,
    label: String = null,
    lang: String = null,
    letterSpacing: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[letterSpacings, RequiredTheme, _], RequiredTheme])
    ] = js.undefined,
    lineHeight: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[lineHeights, RequiredTheme, _], RequiredTheme])
    ] = js.undefined,
    list: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    low: js.UndefOr[Double] = js.undefined,
    m: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    manifest: String = null,
    margin: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    marginBottom: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    marginHeight: js.UndefOr[Double] = js.undefined,
    marginLeft: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    marginRight: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    marginTop: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    marginWidth: js.UndefOr[Double] = js.undefined,
    marginX: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    marginY: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    max: Double | String = null,
    maxHeight: js.UndefOr[Null | (ResponsiveValue[MaxHeightProperty[TLengthStyledSystem], RequiredTheme])] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Null | (ResponsiveValue[MaxWidthProperty[TLengthStyledSystem], RequiredTheme])] = js.undefined,
    mb: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    media: String = null,
    mediaGroup: String = null,
    method: String = null,
    min: Double | String = null,
    minHeight: js.UndefOr[Null | (ResponsiveValue[MinHeightProperty[TLengthStyledSystem], RequiredTheme])] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Null | (ResponsiveValue[MinWidthProperty[TLengthStyledSystem], RequiredTheme])] = js.undefined,
    ml: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    mr: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    mt: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    mx: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    my: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    name: String = null,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    onAbort: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLHeadingElement] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLHeadingElement] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLHeadingElement] => Unit = null,
    onAuxClick: MouseEvent[HTMLHeadingElement, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[HTMLHeadingElement] => Unit = null,
    onBlur: FocusEvent[HTMLHeadingElement] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onChange: FormEvent[HTMLHeadingElement] => Unit = null,
    onClick: MouseEvent[HTMLHeadingElement, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLHeadingElement] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLHeadingElement] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLHeadingElement] => Unit = null,
    onContextMenu: MouseEvent[HTMLHeadingElement, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLHeadingElement] => Unit = null,
    onCut: ClipboardEvent[HTMLHeadingElement] => Unit = null,
    onDoubleClick: MouseEvent[HTMLHeadingElement, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[HTMLHeadingElement] => Unit = null,
    onDragEnd: DragEvent[HTMLHeadingElement] => Unit = null,
    onDragEnter: DragEvent[HTMLHeadingElement] => Unit = null,
    onDragExit: DragEvent[HTMLHeadingElement] => Unit = null,
    onDragLeave: DragEvent[HTMLHeadingElement] => Unit = null,
    onDragOver: DragEvent[HTMLHeadingElement] => Unit = null,
    onDragStart: DragEvent[HTMLHeadingElement] => Unit = null,
    onDrop: DragEvent[HTMLHeadingElement] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onEmptied: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onEnded: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onError: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onFocus: FocusEvent[HTMLHeadingElement] => Unit = null,
    onInput: FormEvent[HTMLHeadingElement] => Unit = null,
    onInvalid: FormEvent[HTMLHeadingElement] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLHeadingElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLHeadingElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLHeadingElement] => Unit = null,
    onLoad: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onLoadStart: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onMouseDown: MouseEvent[HTMLHeadingElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLHeadingElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLHeadingElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLHeadingElement, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLHeadingElement, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLHeadingElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLHeadingElement, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLHeadingElement] => Unit = null,
    onPause: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onPlay: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onPlaying: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onPointerCancel: PointerEvent[HTMLHeadingElement] => Unit = null,
    onPointerDown: PointerEvent[HTMLHeadingElement] => Unit = null,
    onPointerEnter: PointerEvent[HTMLHeadingElement] => Unit = null,
    onPointerLeave: PointerEvent[HTMLHeadingElement] => Unit = null,
    onPointerMove: PointerEvent[HTMLHeadingElement] => Unit = null,
    onPointerOut: PointerEvent[HTMLHeadingElement] => Unit = null,
    onPointerOver: PointerEvent[HTMLHeadingElement] => Unit = null,
    onPointerUp: PointerEvent[HTMLHeadingElement] => Unit = null,
    onProgress: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onRateChange: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onReset: FormEvent[HTMLHeadingElement] => Unit = null,
    onScroll: UIEvent[HTMLHeadingElement, NativeUIEvent] => Unit = null,
    onSeeked: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onSeeking: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onSelect: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onStalled: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onSubmit: FormEvent[HTMLHeadingElement] => Unit = null,
    onSuspend: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onTouchCancel: TouchEvent[HTMLHeadingElement] => Unit = null,
    onTouchEnd: TouchEvent[HTMLHeadingElement] => Unit = null,
    onTouchMove: TouchEvent[HTMLHeadingElement] => Unit = null,
    onTouchStart: TouchEvent[HTMLHeadingElement] => Unit = null,
    onTransitionEnd: TransitionEvent[HTMLHeadingElement] => Unit = null,
    onVolumeChange: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onWaiting: SyntheticEvent[HTMLHeadingElement, Event] => Unit = null,
    onWheel: WheelEvent[HTMLHeadingElement] => Unit = null
  ): HeadingProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(alignSelf)) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTransparency)) __obj.updateDynamic("allowTransparency")(allowTransparency.get.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.get.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.get.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colcount`)) __obj.updateDynamic("aria-colcount")(`aria-colcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colindex`)) __obj.updateDynamic("aria-colindex")(`aria-colindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colspan`)) __obj.updateDynamic("aria-colspan")(`aria-colspan`.get.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.get.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.get.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.get.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.get.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-level`)) __obj.updateDynamic("aria-level")(`aria-level`.get.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.get.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-posinset`)) __obj.updateDynamic("aria-posinset")(`aria-posinset`.get.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.get.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.get.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowcount`)) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowindex`)) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowspan`)) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-setsize`)) __obj.updateDynamic("aria-setsize")(`aria-setsize`.get.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemax`)) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemin`)) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuenow`)) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.get.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundColor)) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bg)) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (challenge != null) __obj.updateDynamic("challenge")(challenge.asInstanceOf[js.Any])
    if (charSet != null) __obj.updateDynamic("charSet")(charSet.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (cite != null) __obj.updateDynamic("cite")(cite.asInstanceOf[js.Any])
    if (classID != null) __obj.updateDynamic("classID")(classID.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (coords != null) __obj.updateDynamic("coords")(coords.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (encType != null) __obj.updateDynamic("encType")(encType.asInstanceOf[js.Any])
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(fontFamily)) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(fontStyle)) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(fontWeight)) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.get.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (frameBorder != null) __obj.updateDynamic("frameBorder")(frameBorder.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(high)) __obj.updateDynamic("high")(high.get.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (httpEquiv != null) __obj.updateDynamic("httpEquiv")(httpEquiv.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.get.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(letterSpacing)) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(lineHeight)) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(low)) __obj.updateDynamic("low")(low.get.asInstanceOf[js.Any])
    if (!js.isUndefined(m)) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(marginBottom)) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(marginHeight)) __obj.updateDynamic("marginHeight")(marginHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeft)) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(marginRight)) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTop)) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (!js.isUndefined(marginWidth)) __obj.updateDynamic("marginWidth")(marginWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginX)) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (!js.isUndefined(marginY)) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(mb)) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(ml)) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (!js.isUndefined(mr)) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (!js.isUndefined(mt)) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mx)) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (!js.isUndefined(my)) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.get.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    __obj.asInstanceOf[HeadingProps]
  }
}

