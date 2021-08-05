package typings.rebassForms

import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.ComponentType
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
import typings.rebass.mod.BaseProps
import typings.rebass.mod.SxProps
import typings.rebass.mod.SxStyleProp
import typings.rebassForms.rebassFormsStrings.`additions removals`
import typings.rebassForms.rebassFormsStrings.`additions text`
import typings.rebassForms.rebassFormsStrings.`inline`
import typings.rebassForms.rebassFormsStrings.`removals additions`
import typings.rebassForms.rebassFormsStrings.`removals text`
import typings.rebassForms.rebassFormsStrings.`text additions`
import typings.rebassForms.rebassFormsStrings.`text removals`
import typings.rebassForms.rebassFormsStrings.additions
import typings.rebassForms.rebassFormsStrings.all
import typings.rebassForms.rebassFormsStrings.ascending
import typings.rebassForms.rebassFormsStrings.assertive
import typings.rebassForms.rebassFormsStrings.both
import typings.rebassForms.rebassFormsStrings.button
import typings.rebassForms.rebassFormsStrings.colors
import typings.rebassForms.rebassFormsStrings.copy
import typings.rebassForms.rebassFormsStrings.date
import typings.rebassForms.rebassFormsStrings.decimal
import typings.rebassForms.rebassFormsStrings.descending
import typings.rebassForms.rebassFormsStrings.dialog
import typings.rebassForms.rebassFormsStrings.done
import typings.rebassForms.rebassFormsStrings.email
import typings.rebassForms.rebassFormsStrings.enter
import typings.rebassForms.rebassFormsStrings.execute
import typings.rebassForms.rebassFormsStrings.fontSizes
import typings.rebassForms.rebassFormsStrings.fontWeights
import typings.rebassForms.rebassFormsStrings.go
import typings.rebassForms.rebassFormsStrings.grammar
import typings.rebassForms.rebassFormsStrings.grid
import typings.rebassForms.rebassFormsStrings.horizontal
import typings.rebassForms.rebassFormsStrings.inherit
import typings.rebassForms.rebassFormsStrings.link
import typings.rebassForms.rebassFormsStrings.list
import typings.rebassForms.rebassFormsStrings.listbox
import typings.rebassForms.rebassFormsStrings.location
import typings.rebassForms.rebassFormsStrings.menu
import typings.rebassForms.rebassFormsStrings.mixed
import typings.rebassForms.rebassFormsStrings.move
import typings.rebassForms.rebassFormsStrings.next
import typings.rebassForms.rebassFormsStrings.no
import typings.rebassForms.rebassFormsStrings.none
import typings.rebassForms.rebassFormsStrings.numeric
import typings.rebassForms.rebassFormsStrings.off
import typings.rebassForms.rebassFormsStrings.on
import typings.rebassForms.rebassFormsStrings.other
import typings.rebassForms.rebassFormsStrings.page
import typings.rebassForms.rebassFormsStrings.polite
import typings.rebassForms.rebassFormsStrings.popup
import typings.rebassForms.rebassFormsStrings.previous
import typings.rebassForms.rebassFormsStrings.removals
import typings.rebassForms.rebassFormsStrings.reset
import typings.rebassForms.rebassFormsStrings.search
import typings.rebassForms.rebassFormsStrings.send
import typings.rebassForms.rebassFormsStrings.space
import typings.rebassForms.rebassFormsStrings.spelling
import typings.rebassForms.rebassFormsStrings.step
import typings.rebassForms.rebassFormsStrings.submit
import typings.rebassForms.rebassFormsStrings.tel
import typings.rebassForms.rebassFormsStrings.text
import typings.rebassForms.rebassFormsStrings.time
import typings.rebassForms.rebassFormsStrings.tree
import typings.rebassForms.rebassFormsStrings.url
import typings.rebassForms.rebassFormsStrings.vertical
import typings.rebassForms.rebassFormsStrings.yes
import typings.std.Event
import typings.std.Exclude
import typings.std.HTMLButtonElement
import typings.std.HTMLInputElement
import typings.std.HTMLLabelElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import typings.std.Pick
import typings.styledComponents.styledComponentsMod.CSSObject
import typings.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
import typings.styledSystem.mod.AlignItemsProps
import typings.styledSystem.mod.AlignSelfProps
import typings.styledSystem.mod.ColorProps
import typings.styledSystem.mod.FlexDirectionProps
import typings.styledSystem.mod.FlexProps
import typings.styledSystem.mod.FlexWrapProps
import typings.styledSystem.mod.FontSizeProps
import typings.styledSystem.mod.FontWeightProps
import typings.styledSystem.mod.JustifyContentProps
import typings.styledSystem.mod.LayoutProps
import typings.styledSystem.mod.OrderProps
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import typings.styledSystem.mod.SpaceProps
import typings.styledSystem.mod.ThemeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rebass/forms", "Checkbox")
  @js.native
  val Checkbox: ComponentType[CheckboxProps] = js.native
  
  @JSImport("@rebass/forms", "Input")
  @js.native
  val Input: ComponentType[InputProps] = js.native
  
  @JSImport("@rebass/forms", "Label")
  @js.native
  val Label: ComponentType[LabelProps] = js.native
  
  @JSImport("@rebass/forms", "Radio")
  @js.native
  val Radio: ComponentType[RadioProps] = js.native
  
  @JSImport("@rebass/forms", "Select")
  @js.native
  val Select: ComponentType[SelectProps] = js.native
  
  @JSImport("@rebass/forms", "Slider")
  @js.native
  val Slider: ComponentType[SliderProps] = js.native
  
  @JSImport("@rebass/forms", "Switch")
  @js.native
  val Switch: ComponentType[SwitchProps] = js.native
  
  @JSImport("@rebass/forms", "Textarea")
  @js.native
  val Textarea: ComponentType[TextareaProps] = js.native
  
  trait BoxKnownProps
    extends StObject
       with BaseProps
       with SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
       with LayoutProps[RequiredTheme]
       with FontSizeProps[RequiredTheme, ThemeValue[fontSizes, RequiredTheme, js.Any]]
       with FontWeightProps[RequiredTheme, ThemeValue[fontWeights, RequiredTheme, js.Any]]
       with ColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
       with FlexProps[
          RequiredTheme, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any
        ]
       with OrderProps[RequiredTheme]
       with AlignSelfProps[RequiredTheme]
       with SxProps {
    
    var tx: js.UndefOr[String] = js.undefined
    
    var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.undefined
  }
  object BoxKnownProps {
    
    inline def apply(): BoxKnownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxKnownProps]
    }
    
    extension [Self <: BoxKnownProps](x: Self) {
      
      inline def setTx(value: String): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
      
      inline def setTxUndefined: Self = StObject.set(x, "tx", js.undefined)
      
      inline def setVariant(value: ResponsiveValue[String, RequiredTheme]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantNull: Self = StObject.set(x, "variant", null)
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVariantVarargs(value: (String | Null)*): Self = StObject.set(x, "variant", js.Array(value :_*))
    }
  }
  
  /* Inlined parent @rebass/forms.@rebass/forms.BoxKnownProps */
  /* Inlined parent @rebass/forms.@rebass/forms.Omit<react.react.InputHTMLAttributes<std.HTMLInputElement>, keyof @rebass/forms.@rebass/forms.BoxKnownProps> */
  trait CheckboxProps extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accept: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
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
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
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
    
    var as: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
      */
    var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var capture: js.UndefOr[Boolean | String] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
      */
    var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The display CSS property defines the display type of an element, which consists of the two basic qualities
      * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
      * and the inner display type defining how the children of the box are laid out.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var display: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
    
    /**
      * The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in
      * its flex container. This is a shorthand property that sets flex-grow, flex-shrink, and flex-basis.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex)
      */
    var flex: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The fontSize utility parses a component's `fontSize` prop and converts it into a CSS font-size declaration.
      *
      * - Numbers from 0-8 (or `theme.fontSizes.length`) are converted to values on the [font size scale](#default-theme).
      * - Numbers greater than `theme.fontSizes.length` are converted to raw pixel values.
      * - String values are passed as raw CSS values.
      * - And array values are converted into responsive values.
      *
      */
    var fontSize: js.UndefOr[ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The font-weight CSS property specifies the weight (or boldness) of the font.
      *
      * The font weights available to you will depend on the font-family you are using. Some fonts are only available in normal and bold.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight)
      */
    var fontWeight: js.UndefOr[ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var formAction: js.UndefOr[String] = js.undefined
    
    var formEncType: js.UndefOr[String] = js.undefined
    
    var formMethod: js.UndefOr[String] = js.undefined
    
    var formNoValidate: js.UndefOr[Boolean] = js.undefined
    
    var formTarget: js.UndefOr[String] = js.undefined
    
    /**
      * The height CSS property specifies the height of an element. By default, the property defines the height of the
      * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
      */
    var height: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[js.Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on bottom */
    var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left */
    var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var max: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
      * property from becoming larger than the value specified for max-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
      */
    var maxHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The max-width CSS property sets the maximum width of an element.
      * It prevents the used value of the width property from becoming larger than the value specified by max-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
      */
    var maxWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on bottom */
    var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var min: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
      * property from becoming smaller than the value specified for min-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var minHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The min-width CSS property sets the minimum width of an element.
      * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
      */
    var minWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on left */
    var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /** Margin on left and right */
    var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * The opacity CSS property sets the transparency of an element or the degree to which content
      * behind an element is visible.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
      */
    var opacity: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
      * are sorted by ascending order value and then by their source code order.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
      */
    var order: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow CSS property sets what to do when an element's content is too big to fit in its block
      * formatting context. It is a shorthand for overflow-x and overflow-y.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
      */
    var overflow: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-x CSS property sets what shows when content overflows a block-level element's left
      * and right edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
      */
    var overflowX: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-y CSS property sets what shows when content overflows a block-level element's top
      * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
      */
    var overflowY: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on bottom */
    var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on right */
    var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top */
    var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    /** Padding on bottom */
    var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Padding on right */
    var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    /** Padding on top */
    var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[js.Any]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var step: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The sx prop lets you style elements inline, using values from your theme.
      */
    var sx: js.UndefOr[SxStyleProp] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var tx: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.undefined
    
    /**
      * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
      */
    var verticalAlign: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
  }
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    extension [Self <: CheckboxProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAlignSelf(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfNull: Self = StObject.set(x, "alignSelf", null)
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignSelfVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any) | Null)*
      ): Self = StObject.set(x, "alignSelf", js.Array(value :_*))
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      inline def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgNull: Self = StObject.set(x, "bg", null)
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      inline def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setCss(value: CSSObject | FlattenSimpleInterpolation | String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplay(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayNull: Self = StObject.set(x, "display", null)
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDisplayVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any) | Null)*
      ): Self = StObject.set(x, "display", js.Array(value :_*))
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEnterKeyHint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
      
      inline def setEnterKeyHintUndefined: Self = StObject.set(x, "enterKeyHint", js.undefined)
      
      inline def setFlex(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexNull: Self = StObject.set(x, "flex", null)
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "flex", js.Array(value :_*))
      
      inline def setFontSize(value: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontSizeVarargs(value: ((ThemeValue[fontSizes, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontSize", js.Array(value :_*))
      
      inline def setFontWeight(value: ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightNull: Self = StObject.set(x, "fontWeight", null)
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFontWeightVarargs(value: ((ThemeValue[fontWeights, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "height", js.Array(value :_*))
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
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
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMNull: Self = StObject.set(x, "m", null)
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      inline def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      inline def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      inline def setMarginNull: Self = StObject.set(x, "margin", null)
      
      inline def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      inline def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      inline def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      inline def setMarginXNull: Self = StObject.set(x, "marginX", null)
      
      inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      inline def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      inline def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      inline def setMarginYNull: Self = StObject.set(x, "marginY", null)
      
      inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      inline def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightNull: Self = StObject.set(x, "maxHeight", null)
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMaxWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthNull: Self = StObject.set(x, "maxWidth", null)
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMaxWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
      
      inline def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      inline def setMbNull: Self = StObject.set(x, "mb", null)
      
      inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      inline def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightNull: Self = StObject.set(x, "minHeight", null)
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minHeight", js.Array(value :_*))
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMinWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthNull: Self = StObject.set(x, "minWidth", null)
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMinWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minWidth", js.Array(value :_*))
      
      inline def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      inline def setMlNull: Self = StObject.set(x, "ml", null)
      
      inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      inline def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      inline def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      inline def setMrNull: Self = StObject.set(x, "mr", null)
      
      inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      inline def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      inline def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      inline def setMtNull: Self = StObject.set(x, "mt", null)
      
      inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      inline def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      inline def setMxNull: Self = StObject.set(x, "mx", null)
      
      inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      inline def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      inline def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyNull: Self = StObject.set(x, "my", null)
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLInputElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpacity(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpacityVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any) | Null)*
      ): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      inline def setOrder(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any) | Null)*
      ): Self = StObject.set(x, "order", js.Array(value :_*))
      
      inline def setOverflow(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowNull: Self = StObject.set(x, "overflow", null)
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflow", js.Array(value :_*))
      
      inline def setOverflowX(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXNull: Self = StObject.set(x, "overflowX", null)
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowXVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowX", js.Array(value :_*))
      
      inline def setOverflowY(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYNull: Self = StObject.set(x, "overflowY", null)
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setOverflowYVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowY", js.Array(value :_*))
      
      inline def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPNull: Self = StObject.set(x, "p", null)
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      inline def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      inline def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      inline def setPaddingNull: Self = StObject.set(x, "padding", null)
      
      inline def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      inline def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      inline def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXNull: Self = StObject.set(x, "paddingX", null)
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      inline def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYNull: Self = StObject.set(x, "paddingY", null)
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      inline def setPbNull: Self = StObject.set(x, "pb", null)
      
      inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      inline def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      inline def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      inline def setPlNull: Self = StObject.set(x, "pl", null)
      
      inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      inline def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      inline def setPrNull: Self = StObject.set(x, "pr", null)
      
      inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      inline def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtNull: Self = StObject.set(x, "pt", null)
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      inline def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPxNull: Self = StObject.set(x, "px", null)
      
      inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      inline def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      inline def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setPyNull: Self = StObject.set(x, "py", null)
      
      inline def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      inline def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSize(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "size", js.Array(value :_*))
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setSx(value: SxStyleProp): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTx(value: String): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
      
      inline def setTxUndefined: Self = StObject.set(x, "tx", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setVariant(value: ResponsiveValue[String, RequiredTheme]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantNull: Self = StObject.set(x, "variant", null)
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVariantVarargs(value: (String | Null)*): Self = StObject.set(x, "variant", js.Array(value :_*))
      
      inline def setVerticalAlign(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignNull: Self = StObject.set(x, "verticalAlign", null)
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setVerticalAlignVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "verticalAlign", js.Array(value :_*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "width", js.Array(value :_*))
    }
  }
  
  /* Inlined parent @rebass/forms.@rebass/forms.BoxKnownProps */
  /* Inlined parent @rebass/forms.@rebass/forms.Omit<react.react.InputHTMLAttributes<std.HTMLInputElement>, keyof @rebass/forms.@rebass/forms.BoxKnownProps> */
  trait InputProps extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accept: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
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
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
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
    
    var as: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
      */
    var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var capture: js.UndefOr[Boolean | String] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
      */
    var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The display CSS property defines the display type of an element, which consists of the two basic qualities
      * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
      * and the inner display type defining how the children of the box are laid out.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var display: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
    
    /**
      * The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in
      * its flex container. This is a shorthand property that sets flex-grow, flex-shrink, and flex-basis.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex)
      */
    var flex: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The fontSize utility parses a component's `fontSize` prop and converts it into a CSS font-size declaration.
      *
      * - Numbers from 0-8 (or `theme.fontSizes.length`) are converted to values on the [font size scale](#default-theme).
      * - Numbers greater than `theme.fontSizes.length` are converted to raw pixel values.
      * - String values are passed as raw CSS values.
      * - And array values are converted into responsive values.
      *
      */
    var fontSize: js.UndefOr[ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The font-weight CSS property specifies the weight (or boldness) of the font.
      *
      * The font weights available to you will depend on the font-family you are using. Some fonts are only available in normal and bold.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight)
      */
    var fontWeight: js.UndefOr[ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var formAction: js.UndefOr[String] = js.undefined
    
    var formEncType: js.UndefOr[String] = js.undefined
    
    var formMethod: js.UndefOr[String] = js.undefined
    
    var formNoValidate: js.UndefOr[Boolean] = js.undefined
    
    var formTarget: js.UndefOr[String] = js.undefined
    
    /**
      * The height CSS property specifies the height of an element. By default, the property defines the height of the
      * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
      */
    var height: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[js.Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on bottom */
    var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left */
    var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var max: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
      * property from becoming larger than the value specified for max-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
      */
    var maxHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The max-width CSS property sets the maximum width of an element.
      * It prevents the used value of the width property from becoming larger than the value specified by max-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
      */
    var maxWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on bottom */
    var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var min: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
      * property from becoming smaller than the value specified for min-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var minHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The min-width CSS property sets the minimum width of an element.
      * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
      */
    var minWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on left */
    var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /** Margin on left and right */
    var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * The opacity CSS property sets the transparency of an element or the degree to which content
      * behind an element is visible.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
      */
    var opacity: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
      * are sorted by ascending order value and then by their source code order.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
      */
    var order: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow CSS property sets what to do when an element's content is too big to fit in its block
      * formatting context. It is a shorthand for overflow-x and overflow-y.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
      */
    var overflow: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-x CSS property sets what shows when content overflows a block-level element's left
      * and right edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
      */
    var overflowX: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-y CSS property sets what shows when content overflows a block-level element's top
      * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
      */
    var overflowY: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on bottom */
    var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on right */
    var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top */
    var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    /** Padding on bottom */
    var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Padding on right */
    var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    /** Padding on top */
    var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[js.Any]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var step: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The sx prop lets you style elements inline, using values from your theme.
      */
    var sx: js.UndefOr[SxStyleProp] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var tx: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.undefined
    
    /**
      * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
      */
    var verticalAlign: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
  }
  object InputProps {
    
    inline def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    extension [Self <: InputProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAlignSelf(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfNull: Self = StObject.set(x, "alignSelf", null)
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignSelfVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any) | Null)*
      ): Self = StObject.set(x, "alignSelf", js.Array(value :_*))
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      inline def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgNull: Self = StObject.set(x, "bg", null)
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      inline def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setCss(value: CSSObject | FlattenSimpleInterpolation | String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplay(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayNull: Self = StObject.set(x, "display", null)
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDisplayVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any) | Null)*
      ): Self = StObject.set(x, "display", js.Array(value :_*))
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEnterKeyHint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
      
      inline def setEnterKeyHintUndefined: Self = StObject.set(x, "enterKeyHint", js.undefined)
      
      inline def setFlex(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexNull: Self = StObject.set(x, "flex", null)
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "flex", js.Array(value :_*))
      
      inline def setFontSize(value: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontSizeVarargs(value: ((ThemeValue[fontSizes, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontSize", js.Array(value :_*))
      
      inline def setFontWeight(value: ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightNull: Self = StObject.set(x, "fontWeight", null)
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFontWeightVarargs(value: ((ThemeValue[fontWeights, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "height", js.Array(value :_*))
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
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
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMNull: Self = StObject.set(x, "m", null)
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      inline def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      inline def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      inline def setMarginNull: Self = StObject.set(x, "margin", null)
      
      inline def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      inline def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      inline def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      inline def setMarginXNull: Self = StObject.set(x, "marginX", null)
      
      inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      inline def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      inline def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      inline def setMarginYNull: Self = StObject.set(x, "marginY", null)
      
      inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      inline def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightNull: Self = StObject.set(x, "maxHeight", null)
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMaxWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthNull: Self = StObject.set(x, "maxWidth", null)
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMaxWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
      
      inline def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      inline def setMbNull: Self = StObject.set(x, "mb", null)
      
      inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      inline def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightNull: Self = StObject.set(x, "minHeight", null)
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minHeight", js.Array(value :_*))
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMinWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthNull: Self = StObject.set(x, "minWidth", null)
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMinWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minWidth", js.Array(value :_*))
      
      inline def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      inline def setMlNull: Self = StObject.set(x, "ml", null)
      
      inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      inline def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      inline def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      inline def setMrNull: Self = StObject.set(x, "mr", null)
      
      inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      inline def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      inline def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      inline def setMtNull: Self = StObject.set(x, "mt", null)
      
      inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      inline def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      inline def setMxNull: Self = StObject.set(x, "mx", null)
      
      inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      inline def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      inline def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyNull: Self = StObject.set(x, "my", null)
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLInputElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpacity(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpacityVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any) | Null)*
      ): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      inline def setOrder(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any) | Null)*
      ): Self = StObject.set(x, "order", js.Array(value :_*))
      
      inline def setOverflow(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowNull: Self = StObject.set(x, "overflow", null)
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflow", js.Array(value :_*))
      
      inline def setOverflowX(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXNull: Self = StObject.set(x, "overflowX", null)
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowXVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowX", js.Array(value :_*))
      
      inline def setOverflowY(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYNull: Self = StObject.set(x, "overflowY", null)
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setOverflowYVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowY", js.Array(value :_*))
      
      inline def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPNull: Self = StObject.set(x, "p", null)
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      inline def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      inline def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      inline def setPaddingNull: Self = StObject.set(x, "padding", null)
      
      inline def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      inline def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      inline def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXNull: Self = StObject.set(x, "paddingX", null)
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      inline def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYNull: Self = StObject.set(x, "paddingY", null)
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      inline def setPbNull: Self = StObject.set(x, "pb", null)
      
      inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      inline def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      inline def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      inline def setPlNull: Self = StObject.set(x, "pl", null)
      
      inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      inline def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      inline def setPrNull: Self = StObject.set(x, "pr", null)
      
      inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      inline def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtNull: Self = StObject.set(x, "pt", null)
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      inline def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPxNull: Self = StObject.set(x, "px", null)
      
      inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      inline def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      inline def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setPyNull: Self = StObject.set(x, "py", null)
      
      inline def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      inline def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSize(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "size", js.Array(value :_*))
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setSx(value: SxStyleProp): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTx(value: String): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
      
      inline def setTxUndefined: Self = StObject.set(x, "tx", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setVariant(value: ResponsiveValue[String, RequiredTheme]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantNull: Self = StObject.set(x, "variant", null)
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVariantVarargs(value: (String | Null)*): Self = StObject.set(x, "variant", js.Array(value :_*))
      
      inline def setVerticalAlign(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignNull: Self = StObject.set(x, "verticalAlign", null)
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setVerticalAlignVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "verticalAlign", js.Array(value :_*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "width", js.Array(value :_*))
    }
  }
  
  trait LabelKnownProps
    extends StObject
       with BoxKnownProps
       with FlexWrapProps[RequiredTheme]
       with FlexDirectionProps[RequiredTheme]
       with AlignItemsProps[RequiredTheme]
       with JustifyContentProps[RequiredTheme]
  object LabelKnownProps {
    
    inline def apply(): LabelKnownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelKnownProps]
    }
  }
  
  /* Inlined parent @rebass/forms.@rebass/forms.LabelKnownProps */
  /* Inlined parent @rebass/forms.@rebass/forms.Omit<react.react.LabelHTMLAttributes<std.HTMLLabelElement>, keyof @rebass/forms.@rebass/forms.LabelKnownProps> */
  trait LabelProps extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    /**
      * The CSS align-items property sets the align-self value on all direct children as a group. The align-self
      * property sets the alignment of an item within its containing block.
      *
      * In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment
      * of items on the Block Axis within their grid area.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-items)
      */
    var alignItems: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignItems */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
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
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
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
    
    var as: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
      */
    var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
      */
    var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    /**
      * The display CSS property defines the display type of an element, which consists of the two basic qualities
      * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
      * and the inner display type defining how the children of the box are laid out.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var display: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in
      * its flex container. This is a shorthand property that sets flex-grow, flex-shrink, and flex-basis.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex)
      */
    var flex: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The flex-direction CSS property specifies how flex items are placed in the flex container defining the main
      * axis and the direction (normal or reversed).
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction)
      */
    var flexDirection: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The flex-wrap CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines.
      * If wrapping is allowed, it sets the direction that lines are stacked.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-wrap)
      */
    var flexWrap: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The fontSize utility parses a component's `fontSize` prop and converts it into a CSS font-size declaration.
      *
      * - Numbers from 0-8 (or `theme.fontSizes.length`) are converted to values on the [font size scale](#default-theme).
      * - Numbers greater than `theme.fontSizes.length` are converted to raw pixel values.
      * - String values are passed as raw CSS values.
      * - And array values are converted into responsive values.
      *
      */
    var fontSize: js.UndefOr[ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The font-weight CSS property specifies the weight (or boldness) of the font.
      *
      * The font weights available to you will depend on the font-family you are using. Some fonts are only available in normal and bold.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight)
      */
    var fontWeight: js.UndefOr[ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    /**
      * The height CSS property specifies the height of an element. By default, the property defines the height of the
      * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
      */
    var height: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var htmlFor: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[js.Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    /**
      * The CSS justify-content property defines how the browser distributes space between and around content items
      * along the main-axis of a flex container, and the inline axis of a grid container.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content)
      */
    var justifyContent: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on bottom */
    var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left */
    var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
      * property from becoming larger than the value specified for max-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
      */
    var maxHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The max-width CSS property sets the maximum width of an element.
      * It prevents the used value of the width property from becoming larger than the value specified by max-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
      */
    var maxWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on bottom */
    var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
      * property from becoming smaller than the value specified for min-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var minHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The min-width CSS property sets the minimum width of an element.
      * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
      */
    var minWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on left */
    var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLLabelElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLLabelElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLLabelElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLLabelElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLLabelElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLLabelElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLLabelElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLLabelElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLLabelElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLLabelElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLLabelElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLLabelElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLLabelElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLLabelElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLLabelElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLLabelElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLLabelElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLLabelElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLLabelElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLLabelElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLLabelElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLLabelElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLLabelElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLLabelElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLLabelElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLLabelElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLLabelElement]] = js.undefined
    
    /**
      * The opacity CSS property sets the transparency of an element or the degree to which content
      * behind an element is visible.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
      */
    var opacity: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
      * are sorted by ascending order value and then by their source code order.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
      */
    var order: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow CSS property sets what to do when an element's content is too big to fit in its block
      * formatting context. It is a shorthand for overflow-x and overflow-y.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
      */
    var overflow: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-x CSS property sets what shows when content overflows a block-level element's left
      * and right edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
      */
    var overflowX: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-y CSS property sets what shows when content overflows a block-level element's top
      * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
      */
    var overflowY: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on bottom */
    var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on right */
    var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top */
    var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on bottom */
    var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Padding on right */
    var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    /** Padding on top */
    var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[Ref[js.Any]] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The sx prop lets you style elements inline, using values from your theme.
      */
    var sx: js.UndefOr[SxStyleProp] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var tx: js.UndefOr[String] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.undefined
    
    /**
      * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
      */
    var verticalAlign: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
  }
  object LabelProps {
    
    inline def apply(): LabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelProps]
    }
    
    extension [Self <: LabelProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAlignItems(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignItems */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsNull: Self = StObject.set(x, "alignItems", null)
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAlignItemsVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignItems */ js.Any) | Null)*
      ): Self = StObject.set(x, "alignItems", js.Array(value :_*))
      
      inline def setAlignSelf(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfNull: Self = StObject.set(x, "alignSelf", null)
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignSelfVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any) | Null)*
      ): Self = StObject.set(x, "alignSelf", js.Array(value :_*))
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      inline def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgNull: Self = StObject.set(x, "bg", null)
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCss(value: CSSObject | FlattenSimpleInterpolation | String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisplay(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayNull: Self = StObject.set(x, "display", null)
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDisplayVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any) | Null)*
      ): Self = StObject.set(x, "display", js.Array(value :_*))
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFlex(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexDirection(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      inline def setFlexDirectionNull: Self = StObject.set(x, "flexDirection", null)
      
      inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      inline def setFlexDirectionVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ js.Any) | Null)*
      ): Self = StObject.set(x, "flexDirection", js.Array(value :_*))
      
      inline def setFlexNull: Self = StObject.set(x, "flex", null)
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "flex", js.Array(value :_*))
      
      inline def setFlexWrap(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapNull: Self = StObject.set(x, "flexWrap", null)
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setFlexWrapVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ js.Any) | Null)*
      ): Self = StObject.set(x, "flexWrap", js.Array(value :_*))
      
      inline def setFontSize(value: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontSizeVarargs(value: ((ThemeValue[fontSizes, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontSize", js.Array(value :_*))
      
      inline def setFontWeight(value: ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightNull: Self = StObject.set(x, "fontWeight", null)
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFontWeightVarargs(value: ((ThemeValue[fontWeights, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "height", js.Array(value :_*))
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
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
      
      inline def setJustifyContent(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentNull: Self = StObject.set(x, "justifyContent", null)
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setJustifyContentVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ js.Any) | Null)*
      ): Self = StObject.set(x, "justifyContent", js.Array(value :_*))
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMNull: Self = StObject.set(x, "m", null)
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      inline def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      inline def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      inline def setMarginNull: Self = StObject.set(x, "margin", null)
      
      inline def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      inline def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      inline def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      inline def setMarginXNull: Self = StObject.set(x, "marginX", null)
      
      inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      inline def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      inline def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      inline def setMarginYNull: Self = StObject.set(x, "marginY", null)
      
      inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      inline def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      inline def setMaxHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightNull: Self = StObject.set(x, "maxHeight", null)
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
      
      inline def setMaxWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthNull: Self = StObject.set(x, "maxWidth", null)
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMaxWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
      
      inline def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      inline def setMbNull: Self = StObject.set(x, "mb", null)
      
      inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      inline def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      inline def setMinHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightNull: Self = StObject.set(x, "minHeight", null)
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minHeight", js.Array(value :_*))
      
      inline def setMinWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthNull: Self = StObject.set(x, "minWidth", null)
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMinWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minWidth", js.Array(value :_*))
      
      inline def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      inline def setMlNull: Self = StObject.set(x, "ml", null)
      
      inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      inline def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      inline def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      inline def setMrNull: Self = StObject.set(x, "mr", null)
      
      inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      inline def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      inline def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      inline def setMtNull: Self = StObject.set(x, "mt", null)
      
      inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      inline def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      inline def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      inline def setMxNull: Self = StObject.set(x, "mx", null)
      
      inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      inline def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      inline def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyNull: Self = StObject.set(x, "my", null)
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      inline def setOnAbort(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLLabelElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLLabelElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLLabelElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLLabelElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLLabelElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLLabelElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLLabelElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLLabelElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLLabelElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLLabelElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLLabelElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLLabelElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLLabelElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLLabelElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpacity(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpacityVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any) | Null)*
      ): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      inline def setOrder(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any) | Null)*
      ): Self = StObject.set(x, "order", js.Array(value :_*))
      
      inline def setOverflow(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowNull: Self = StObject.set(x, "overflow", null)
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflow", js.Array(value :_*))
      
      inline def setOverflowX(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXNull: Self = StObject.set(x, "overflowX", null)
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowXVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowX", js.Array(value :_*))
      
      inline def setOverflowY(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYNull: Self = StObject.set(x, "overflowY", null)
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setOverflowYVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowY", js.Array(value :_*))
      
      inline def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPNull: Self = StObject.set(x, "p", null)
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      inline def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      inline def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      inline def setPaddingNull: Self = StObject.set(x, "padding", null)
      
      inline def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      inline def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      inline def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXNull: Self = StObject.set(x, "paddingX", null)
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      inline def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYNull: Self = StObject.set(x, "paddingY", null)
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      inline def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      inline def setPbNull: Self = StObject.set(x, "pb", null)
      
      inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      inline def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      inline def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      inline def setPlNull: Self = StObject.set(x, "pl", null)
      
      inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      inline def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      inline def setPrNull: Self = StObject.set(x, "pr", null)
      
      inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      inline def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtNull: Self = StObject.set(x, "pt", null)
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      inline def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPxNull: Self = StObject.set(x, "px", null)
      
      inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      inline def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      inline def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setPyNull: Self = StObject.set(x, "py", null)
      
      inline def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      inline def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSize(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "size", js.Array(value :_*))
      
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
      
      inline def setSx(value: SxStyleProp): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTx(value: String): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
      
      inline def setTxUndefined: Self = StObject.set(x, "tx", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setVariant(value: ResponsiveValue[String, RequiredTheme]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantNull: Self = StObject.set(x, "variant", null)
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVariantVarargs(value: (String | Null)*): Self = StObject.set(x, "variant", js.Array(value :_*))
      
      inline def setVerticalAlign(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignNull: Self = StObject.set(x, "verticalAlign", null)
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setVerticalAlignVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "verticalAlign", js.Array(value :_*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "width", js.Array(value :_*))
    }
  }
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  /* Inlined parent @rebass/forms.@rebass/forms.BoxKnownProps */
  /* Inlined parent @rebass/forms.@rebass/forms.Omit<react.react.InputHTMLAttributes<std.HTMLInputElement>, keyof @rebass/forms.@rebass/forms.BoxKnownProps> */
  trait RadioProps extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accept: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
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
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
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
    
    var as: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
      */
    var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var capture: js.UndefOr[Boolean | String] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
      */
    var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The display CSS property defines the display type of an element, which consists of the two basic qualities
      * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
      * and the inner display type defining how the children of the box are laid out.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var display: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
    
    /**
      * The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in
      * its flex container. This is a shorthand property that sets flex-grow, flex-shrink, and flex-basis.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex)
      */
    var flex: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The fontSize utility parses a component's `fontSize` prop and converts it into a CSS font-size declaration.
      *
      * - Numbers from 0-8 (or `theme.fontSizes.length`) are converted to values on the [font size scale](#default-theme).
      * - Numbers greater than `theme.fontSizes.length` are converted to raw pixel values.
      * - String values are passed as raw CSS values.
      * - And array values are converted into responsive values.
      *
      */
    var fontSize: js.UndefOr[ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The font-weight CSS property specifies the weight (or boldness) of the font.
      *
      * The font weights available to you will depend on the font-family you are using. Some fonts are only available in normal and bold.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight)
      */
    var fontWeight: js.UndefOr[ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var formAction: js.UndefOr[String] = js.undefined
    
    var formEncType: js.UndefOr[String] = js.undefined
    
    var formMethod: js.UndefOr[String] = js.undefined
    
    var formNoValidate: js.UndefOr[Boolean] = js.undefined
    
    var formTarget: js.UndefOr[String] = js.undefined
    
    /**
      * The height CSS property specifies the height of an element. By default, the property defines the height of the
      * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
      */
    var height: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[js.Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on bottom */
    var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left */
    var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var max: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
      * property from becoming larger than the value specified for max-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
      */
    var maxHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The max-width CSS property sets the maximum width of an element.
      * It prevents the used value of the width property from becoming larger than the value specified by max-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
      */
    var maxWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on bottom */
    var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var min: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
      * property from becoming smaller than the value specified for min-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var minHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The min-width CSS property sets the minimum width of an element.
      * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
      */
    var minWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on left */
    var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /** Margin on left and right */
    var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * The opacity CSS property sets the transparency of an element or the degree to which content
      * behind an element is visible.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
      */
    var opacity: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
      * are sorted by ascending order value and then by their source code order.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
      */
    var order: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow CSS property sets what to do when an element's content is too big to fit in its block
      * formatting context. It is a shorthand for overflow-x and overflow-y.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
      */
    var overflow: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-x CSS property sets what shows when content overflows a block-level element's left
      * and right edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
      */
    var overflowX: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-y CSS property sets what shows when content overflows a block-level element's top
      * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
      */
    var overflowY: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on bottom */
    var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on right */
    var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top */
    var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    /** Padding on bottom */
    var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Padding on right */
    var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    /** Padding on top */
    var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[js.Any]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var step: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The sx prop lets you style elements inline, using values from your theme.
      */
    var sx: js.UndefOr[SxStyleProp] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var tx: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.undefined
    
    /**
      * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
      */
    var verticalAlign: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
  }
  object RadioProps {
    
    inline def apply(): RadioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioProps]
    }
    
    extension [Self <: RadioProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAlignSelf(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfNull: Self = StObject.set(x, "alignSelf", null)
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignSelfVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any) | Null)*
      ): Self = StObject.set(x, "alignSelf", js.Array(value :_*))
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      inline def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgNull: Self = StObject.set(x, "bg", null)
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      inline def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setCss(value: CSSObject | FlattenSimpleInterpolation | String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplay(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayNull: Self = StObject.set(x, "display", null)
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDisplayVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any) | Null)*
      ): Self = StObject.set(x, "display", js.Array(value :_*))
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEnterKeyHint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
      
      inline def setEnterKeyHintUndefined: Self = StObject.set(x, "enterKeyHint", js.undefined)
      
      inline def setFlex(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexNull: Self = StObject.set(x, "flex", null)
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "flex", js.Array(value :_*))
      
      inline def setFontSize(value: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontSizeVarargs(value: ((ThemeValue[fontSizes, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontSize", js.Array(value :_*))
      
      inline def setFontWeight(value: ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightNull: Self = StObject.set(x, "fontWeight", null)
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFontWeightVarargs(value: ((ThemeValue[fontWeights, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "height", js.Array(value :_*))
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
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
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMNull: Self = StObject.set(x, "m", null)
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      inline def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      inline def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      inline def setMarginNull: Self = StObject.set(x, "margin", null)
      
      inline def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      inline def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      inline def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      inline def setMarginXNull: Self = StObject.set(x, "marginX", null)
      
      inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      inline def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      inline def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      inline def setMarginYNull: Self = StObject.set(x, "marginY", null)
      
      inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      inline def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightNull: Self = StObject.set(x, "maxHeight", null)
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMaxWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthNull: Self = StObject.set(x, "maxWidth", null)
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMaxWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
      
      inline def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      inline def setMbNull: Self = StObject.set(x, "mb", null)
      
      inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      inline def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightNull: Self = StObject.set(x, "minHeight", null)
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minHeight", js.Array(value :_*))
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMinWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthNull: Self = StObject.set(x, "minWidth", null)
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMinWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minWidth", js.Array(value :_*))
      
      inline def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      inline def setMlNull: Self = StObject.set(x, "ml", null)
      
      inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      inline def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      inline def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      inline def setMrNull: Self = StObject.set(x, "mr", null)
      
      inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      inline def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      inline def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      inline def setMtNull: Self = StObject.set(x, "mt", null)
      
      inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      inline def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      inline def setMxNull: Self = StObject.set(x, "mx", null)
      
      inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      inline def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      inline def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyNull: Self = StObject.set(x, "my", null)
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLInputElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpacity(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpacityVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any) | Null)*
      ): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      inline def setOrder(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any) | Null)*
      ): Self = StObject.set(x, "order", js.Array(value :_*))
      
      inline def setOverflow(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowNull: Self = StObject.set(x, "overflow", null)
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflow", js.Array(value :_*))
      
      inline def setOverflowX(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXNull: Self = StObject.set(x, "overflowX", null)
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowXVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowX", js.Array(value :_*))
      
      inline def setOverflowY(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYNull: Self = StObject.set(x, "overflowY", null)
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setOverflowYVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowY", js.Array(value :_*))
      
      inline def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPNull: Self = StObject.set(x, "p", null)
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      inline def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      inline def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      inline def setPaddingNull: Self = StObject.set(x, "padding", null)
      
      inline def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      inline def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      inline def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXNull: Self = StObject.set(x, "paddingX", null)
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      inline def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYNull: Self = StObject.set(x, "paddingY", null)
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      inline def setPbNull: Self = StObject.set(x, "pb", null)
      
      inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      inline def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      inline def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      inline def setPlNull: Self = StObject.set(x, "pl", null)
      
      inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      inline def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      inline def setPrNull: Self = StObject.set(x, "pr", null)
      
      inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      inline def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtNull: Self = StObject.set(x, "pt", null)
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      inline def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPxNull: Self = StObject.set(x, "px", null)
      
      inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      inline def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      inline def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setPyNull: Self = StObject.set(x, "py", null)
      
      inline def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      inline def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSize(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "size", js.Array(value :_*))
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setSx(value: SxStyleProp): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTx(value: String): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
      
      inline def setTxUndefined: Self = StObject.set(x, "tx", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setVariant(value: ResponsiveValue[String, RequiredTheme]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantNull: Self = StObject.set(x, "variant", null)
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVariantVarargs(value: (String | Null)*): Self = StObject.set(x, "variant", js.Array(value :_*))
      
      inline def setVerticalAlign(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignNull: Self = StObject.set(x, "verticalAlign", null)
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setVerticalAlignVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "verticalAlign", js.Array(value :_*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "width", js.Array(value :_*))
    }
  }
  
  /* Inlined parent @rebass/forms.@rebass/forms.BoxKnownProps */
  /* Inlined parent @rebass/forms.@rebass/forms.Omit<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, keyof @rebass/forms.@rebass/forms.BoxKnownProps> */
  trait SelectProps extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
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
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
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
    
    var as: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
      */
    var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
      */
    var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The display CSS property defines the display type of an element, which consists of the two basic qualities
      * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
      * and the inner display type defining how the children of the box are laid out.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var display: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in
      * its flex container. This is a shorthand property that sets flex-grow, flex-shrink, and flex-basis.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex)
      */
    var flex: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The fontSize utility parses a component's `fontSize` prop and converts it into a CSS font-size declaration.
      *
      * - Numbers from 0-8 (or `theme.fontSizes.length`) are converted to values on the [font size scale](#default-theme).
      * - Numbers greater than `theme.fontSizes.length` are converted to raw pixel values.
      * - String values are passed as raw CSS values.
      * - And array values are converted into responsive values.
      *
      */
    var fontSize: js.UndefOr[ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The font-weight CSS property specifies the weight (or boldness) of the font.
      *
      * The font weights available to you will depend on the font-family you are using. Some fonts are only available in normal and bold.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight)
      */
    var fontWeight: js.UndefOr[ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    /**
      * The height CSS property specifies the height of an element. By default, the property defines the height of the
      * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
      */
    var height: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[js.Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on bottom */
    var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left */
    var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
      * property from becoming larger than the value specified for max-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
      */
    var maxHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The max-width CSS property sets the maximum width of an element.
      * It prevents the used value of the width property from becoming larger than the value specified by max-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
      */
    var maxWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on bottom */
    var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
      * property from becoming smaller than the value specified for min-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var minHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The min-width CSS property sets the minimum width of an element.
      * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
      */
    var minWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on left */
    var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /** Margin on left and right */
    var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLSelectElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLSelectElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLSelectElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLSelectElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLSelectElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLSelectElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLSelectElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLSelectElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLSelectElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLSelectElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLSelectElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLSelectElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLSelectElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLSelectElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLSelectElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLSelectElement]] = js.undefined
    
    /**
      * The opacity CSS property sets the transparency of an element or the degree to which content
      * behind an element is visible.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
      */
    var opacity: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
      * are sorted by ascending order value and then by their source code order.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
      */
    var order: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow CSS property sets what to do when an element's content is too big to fit in its block
      * formatting context. It is a shorthand for overflow-x and overflow-y.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
      */
    var overflow: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-x CSS property sets what shows when content overflows a block-level element's left
      * and right edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
      */
    var overflowX: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-y CSS property sets what shows when content overflows a block-level element's top
      * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
      */
    var overflowY: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on bottom */
    var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on right */
    var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top */
    var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on bottom */
    var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Padding on right */
    var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    /** Padding on top */
    var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[Ref[js.Any]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The sx prop lets you style elements inline, using values from your theme.
      */
    var sx: js.UndefOr[SxStyleProp] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var tx: js.UndefOr[String] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.undefined
    
    /**
      * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
      */
    var verticalAlign: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
  }
  object SelectProps {
    
    inline def apply(): SelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectProps]
    }
    
    extension [Self <: SelectProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAlignSelf(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfNull: Self = StObject.set(x, "alignSelf", null)
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignSelfVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any) | Null)*
      ): Self = StObject.set(x, "alignSelf", js.Array(value :_*))
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      inline def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgNull: Self = StObject.set(x, "bg", null)
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCss(value: CSSObject | FlattenSimpleInterpolation | String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplay(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayNull: Self = StObject.set(x, "display", null)
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDisplayVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any) | Null)*
      ): Self = StObject.set(x, "display", js.Array(value :_*))
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFlex(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexNull: Self = StObject.set(x, "flex", null)
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "flex", js.Array(value :_*))
      
      inline def setFontSize(value: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontSizeVarargs(value: ((ThemeValue[fontSizes, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontSize", js.Array(value :_*))
      
      inline def setFontWeight(value: ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightNull: Self = StObject.set(x, "fontWeight", null)
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFontWeightVarargs(value: ((ThemeValue[fontWeights, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "height", js.Array(value :_*))
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
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
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMNull: Self = StObject.set(x, "m", null)
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      inline def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      inline def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      inline def setMarginNull: Self = StObject.set(x, "margin", null)
      
      inline def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      inline def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      inline def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      inline def setMarginXNull: Self = StObject.set(x, "marginX", null)
      
      inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      inline def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      inline def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      inline def setMarginYNull: Self = StObject.set(x, "marginY", null)
      
      inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      inline def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      inline def setMaxHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightNull: Self = StObject.set(x, "maxHeight", null)
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
      
      inline def setMaxWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthNull: Self = StObject.set(x, "maxWidth", null)
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMaxWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
      
      inline def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      inline def setMbNull: Self = StObject.set(x, "mb", null)
      
      inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      inline def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      inline def setMinHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightNull: Self = StObject.set(x, "minHeight", null)
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minHeight", js.Array(value :_*))
      
      inline def setMinWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthNull: Self = StObject.set(x, "minWidth", null)
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMinWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minWidth", js.Array(value :_*))
      
      inline def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      inline def setMlNull: Self = StObject.set(x, "ml", null)
      
      inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      inline def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      inline def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      inline def setMrNull: Self = StObject.set(x, "mr", null)
      
      inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      inline def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      inline def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      inline def setMtNull: Self = StObject.set(x, "mt", null)
      
      inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      inline def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      inline def setMxNull: Self = StObject.set(x, "mx", null)
      
      inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      inline def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      inline def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyNull: Self = StObject.set(x, "my", null)
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLSelectElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpacity(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpacityVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any) | Null)*
      ): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      inline def setOrder(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any) | Null)*
      ): Self = StObject.set(x, "order", js.Array(value :_*))
      
      inline def setOverflow(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowNull: Self = StObject.set(x, "overflow", null)
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflow", js.Array(value :_*))
      
      inline def setOverflowX(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXNull: Self = StObject.set(x, "overflowX", null)
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowXVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowX", js.Array(value :_*))
      
      inline def setOverflowY(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYNull: Self = StObject.set(x, "overflowY", null)
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setOverflowYVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowY", js.Array(value :_*))
      
      inline def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPNull: Self = StObject.set(x, "p", null)
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      inline def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      inline def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      inline def setPaddingNull: Self = StObject.set(x, "padding", null)
      
      inline def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      inline def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      inline def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXNull: Self = StObject.set(x, "paddingX", null)
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      inline def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYNull: Self = StObject.set(x, "paddingY", null)
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      inline def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      inline def setPbNull: Self = StObject.set(x, "pb", null)
      
      inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      inline def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      inline def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      inline def setPlNull: Self = StObject.set(x, "pl", null)
      
      inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      inline def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      inline def setPrNull: Self = StObject.set(x, "pr", null)
      
      inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      inline def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtNull: Self = StObject.set(x, "pt", null)
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      inline def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPxNull: Self = StObject.set(x, "px", null)
      
      inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      inline def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      inline def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setPyNull: Self = StObject.set(x, "py", null)
      
      inline def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      inline def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSize(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "size", js.Array(value :_*))
      
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
      
      inline def setSx(value: SxStyleProp): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTx(value: String): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
      
      inline def setTxUndefined: Self = StObject.set(x, "tx", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setVariant(value: ResponsiveValue[String, RequiredTheme]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantNull: Self = StObject.set(x, "variant", null)
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVariantVarargs(value: (String | Null)*): Self = StObject.set(x, "variant", js.Array(value :_*))
      
      inline def setVerticalAlign(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignNull: Self = StObject.set(x, "verticalAlign", null)
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setVerticalAlignVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "verticalAlign", js.Array(value :_*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "width", js.Array(value :_*))
    }
  }
  
  /* Inlined parent @rebass/forms.@rebass/forms.BoxKnownProps */
  /* Inlined parent @rebass/forms.@rebass/forms.Omit<react.react.InputHTMLAttributes<std.HTMLInputElement>, keyof @rebass/forms.@rebass/forms.BoxKnownProps> */
  trait SliderProps extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accept: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
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
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
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
    
    var as: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
      */
    var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var capture: js.UndefOr[Boolean | String] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
      */
    var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The display CSS property defines the display type of an element, which consists of the two basic qualities
      * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
      * and the inner display type defining how the children of the box are laid out.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var display: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
    
    /**
      * The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in
      * its flex container. This is a shorthand property that sets flex-grow, flex-shrink, and flex-basis.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex)
      */
    var flex: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The fontSize utility parses a component's `fontSize` prop and converts it into a CSS font-size declaration.
      *
      * - Numbers from 0-8 (or `theme.fontSizes.length`) are converted to values on the [font size scale](#default-theme).
      * - Numbers greater than `theme.fontSizes.length` are converted to raw pixel values.
      * - String values are passed as raw CSS values.
      * - And array values are converted into responsive values.
      *
      */
    var fontSize: js.UndefOr[ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The font-weight CSS property specifies the weight (or boldness) of the font.
      *
      * The font weights available to you will depend on the font-family you are using. Some fonts are only available in normal and bold.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight)
      */
    var fontWeight: js.UndefOr[ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var formAction: js.UndefOr[String] = js.undefined
    
    var formEncType: js.UndefOr[String] = js.undefined
    
    var formMethod: js.UndefOr[String] = js.undefined
    
    var formNoValidate: js.UndefOr[Boolean] = js.undefined
    
    var formTarget: js.UndefOr[String] = js.undefined
    
    /**
      * The height CSS property specifies the height of an element. By default, the property defines the height of the
      * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
      */
    var height: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[js.Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on bottom */
    var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left */
    var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var max: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
      * property from becoming larger than the value specified for max-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
      */
    var maxHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The max-width CSS property sets the maximum width of an element.
      * It prevents the used value of the width property from becoming larger than the value specified by max-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
      */
    var maxWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on bottom */
    var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var min: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
      * property from becoming smaller than the value specified for min-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var minHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The min-width CSS property sets the minimum width of an element.
      * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
      */
    var minWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on left */
    var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /** Margin on left and right */
    var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * The opacity CSS property sets the transparency of an element or the degree to which content
      * behind an element is visible.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
      */
    var opacity: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
      * are sorted by ascending order value and then by their source code order.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
      */
    var order: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow CSS property sets what to do when an element's content is too big to fit in its block
      * formatting context. It is a shorthand for overflow-x and overflow-y.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
      */
    var overflow: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-x CSS property sets what shows when content overflows a block-level element's left
      * and right edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
      */
    var overflowX: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-y CSS property sets what shows when content overflows a block-level element's top
      * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
      */
    var overflowY: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on bottom */
    var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on right */
    var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top */
    var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    /** Padding on bottom */
    var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Padding on right */
    var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    /** Padding on top */
    var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[js.Any]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var step: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The sx prop lets you style elements inline, using values from your theme.
      */
    var sx: js.UndefOr[SxStyleProp] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var tx: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.undefined
    
    /**
      * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
      */
    var verticalAlign: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
  }
  object SliderProps {
    
    inline def apply(): SliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderProps]
    }
    
    extension [Self <: SliderProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAlignSelf(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfNull: Self = StObject.set(x, "alignSelf", null)
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignSelfVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any) | Null)*
      ): Self = StObject.set(x, "alignSelf", js.Array(value :_*))
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      inline def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgNull: Self = StObject.set(x, "bg", null)
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      inline def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setCss(value: CSSObject | FlattenSimpleInterpolation | String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplay(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayNull: Self = StObject.set(x, "display", null)
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDisplayVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any) | Null)*
      ): Self = StObject.set(x, "display", js.Array(value :_*))
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEnterKeyHint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
      
      inline def setEnterKeyHintUndefined: Self = StObject.set(x, "enterKeyHint", js.undefined)
      
      inline def setFlex(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexNull: Self = StObject.set(x, "flex", null)
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "flex", js.Array(value :_*))
      
      inline def setFontSize(value: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontSizeVarargs(value: ((ThemeValue[fontSizes, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontSize", js.Array(value :_*))
      
      inline def setFontWeight(value: ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightNull: Self = StObject.set(x, "fontWeight", null)
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFontWeightVarargs(value: ((ThemeValue[fontWeights, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "height", js.Array(value :_*))
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
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
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMNull: Self = StObject.set(x, "m", null)
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      inline def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      inline def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      inline def setMarginNull: Self = StObject.set(x, "margin", null)
      
      inline def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      inline def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      inline def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      inline def setMarginXNull: Self = StObject.set(x, "marginX", null)
      
      inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      inline def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      inline def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      inline def setMarginYNull: Self = StObject.set(x, "marginY", null)
      
      inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      inline def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightNull: Self = StObject.set(x, "maxHeight", null)
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMaxWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthNull: Self = StObject.set(x, "maxWidth", null)
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMaxWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
      
      inline def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      inline def setMbNull: Self = StObject.set(x, "mb", null)
      
      inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      inline def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightNull: Self = StObject.set(x, "minHeight", null)
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minHeight", js.Array(value :_*))
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMinWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthNull: Self = StObject.set(x, "minWidth", null)
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMinWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minWidth", js.Array(value :_*))
      
      inline def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      inline def setMlNull: Self = StObject.set(x, "ml", null)
      
      inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      inline def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      inline def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      inline def setMrNull: Self = StObject.set(x, "mr", null)
      
      inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      inline def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      inline def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      inline def setMtNull: Self = StObject.set(x, "mt", null)
      
      inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      inline def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      inline def setMxNull: Self = StObject.set(x, "mx", null)
      
      inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      inline def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      inline def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyNull: Self = StObject.set(x, "my", null)
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLInputElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpacity(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpacityVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any) | Null)*
      ): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      inline def setOrder(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any) | Null)*
      ): Self = StObject.set(x, "order", js.Array(value :_*))
      
      inline def setOverflow(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowNull: Self = StObject.set(x, "overflow", null)
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflow", js.Array(value :_*))
      
      inline def setOverflowX(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXNull: Self = StObject.set(x, "overflowX", null)
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowXVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowX", js.Array(value :_*))
      
      inline def setOverflowY(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYNull: Self = StObject.set(x, "overflowY", null)
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setOverflowYVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowY", js.Array(value :_*))
      
      inline def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPNull: Self = StObject.set(x, "p", null)
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      inline def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      inline def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      inline def setPaddingNull: Self = StObject.set(x, "padding", null)
      
      inline def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      inline def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      inline def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXNull: Self = StObject.set(x, "paddingX", null)
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      inline def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYNull: Self = StObject.set(x, "paddingY", null)
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      inline def setPbNull: Self = StObject.set(x, "pb", null)
      
      inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      inline def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      inline def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      inline def setPlNull: Self = StObject.set(x, "pl", null)
      
      inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      inline def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      inline def setPrNull: Self = StObject.set(x, "pr", null)
      
      inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      inline def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtNull: Self = StObject.set(x, "pt", null)
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      inline def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPxNull: Self = StObject.set(x, "px", null)
      
      inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      inline def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      inline def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setPyNull: Self = StObject.set(x, "py", null)
      
      inline def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      inline def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSize(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "size", js.Array(value :_*))
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setSx(value: SxStyleProp): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTx(value: String): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
      
      inline def setTxUndefined: Self = StObject.set(x, "tx", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setVariant(value: ResponsiveValue[String, RequiredTheme]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantNull: Self = StObject.set(x, "variant", null)
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVariantVarargs(value: (String | Null)*): Self = StObject.set(x, "variant", js.Array(value :_*))
      
      inline def setVerticalAlign(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignNull: Self = StObject.set(x, "verticalAlign", null)
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setVerticalAlignVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "verticalAlign", js.Array(value :_*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "width", js.Array(value :_*))
    }
  }
  
  /* Inlined parent @rebass/forms.@rebass/forms.BoxKnownProps */
  /* Inlined parent @rebass/forms.@rebass/forms.Omit<react.react.ButtonHTMLAttributes<std.HTMLButtonElement>, keyof @rebass/forms.@rebass/forms.BoxKnownProps> */
  trait SwitchProps extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
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
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
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
    
    var as: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
      */
    var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
      */
    var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The display CSS property defines the display type of an element, which consists of the two basic qualities
      * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
      * and the inner display type defining how the children of the box are laid out.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var display: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in
      * its flex container. This is a shorthand property that sets flex-grow, flex-shrink, and flex-basis.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex)
      */
    var flex: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The fontSize utility parses a component's `fontSize` prop and converts it into a CSS font-size declaration.
      *
      * - Numbers from 0-8 (or `theme.fontSizes.length`) are converted to values on the [font size scale](#default-theme).
      * - Numbers greater than `theme.fontSizes.length` are converted to raw pixel values.
      * - String values are passed as raw CSS values.
      * - And array values are converted into responsive values.
      *
      */
    var fontSize: js.UndefOr[ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The font-weight CSS property specifies the weight (or boldness) of the font.
      *
      * The font weights available to you will depend on the font-family you are using. Some fonts are only available in normal and bold.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight)
      */
    var fontWeight: js.UndefOr[ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var formAction: js.UndefOr[String] = js.undefined
    
    var formEncType: js.UndefOr[String] = js.undefined
    
    var formMethod: js.UndefOr[String] = js.undefined
    
    var formNoValidate: js.UndefOr[Boolean] = js.undefined
    
    var formTarget: js.UndefOr[String] = js.undefined
    
    /**
      * The height CSS property specifies the height of an element. By default, the property defines the height of the
      * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
      */
    var height: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[js.Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on bottom */
    var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left */
    var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
      * property from becoming larger than the value specified for max-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
      */
    var maxHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The max-width CSS property sets the maximum width of an element.
      * It prevents the used value of the width property from becoming larger than the value specified by max-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
      */
    var maxWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on bottom */
    var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
      * property from becoming smaller than the value specified for min-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var minHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The min-width CSS property sets the minimum width of an element.
      * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
      */
    var minWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on left */
    var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLButtonElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLButtonElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLButtonElement]] = js.undefined
    
    /**
      * The opacity CSS property sets the transparency of an element or the degree to which content
      * behind an element is visible.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
      */
    var opacity: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
      * are sorted by ascending order value and then by their source code order.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
      */
    var order: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow CSS property sets what to do when an element's content is too big to fit in its block
      * formatting context. It is a shorthand for overflow-x and overflow-y.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
      */
    var overflow: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-x CSS property sets what shows when content overflows a block-level element's left
      * and right edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
      */
    var overflowX: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-y CSS property sets what shows when content overflows a block-level element's top
      * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
      */
    var overflowY: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on bottom */
    var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on right */
    var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top */
    var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on bottom */
    var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Padding on right */
    var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    /** Padding on top */
    var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[Ref[js.Any]] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The sx prop lets you style elements inline, using values from your theme.
      */
    var sx: js.UndefOr[SxStyleProp] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var tx: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[submit | reset | button] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.undefined
    
    /**
      * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
      */
    var verticalAlign: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
  }
  object SwitchProps {
    
    inline def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    extension [Self <: SwitchProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAlignSelf(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfNull: Self = StObject.set(x, "alignSelf", null)
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignSelfVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any) | Null)*
      ): Self = StObject.set(x, "alignSelf", js.Array(value :_*))
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      inline def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgNull: Self = StObject.set(x, "bg", null)
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCss(value: CSSObject | FlattenSimpleInterpolation | String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplay(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayNull: Self = StObject.set(x, "display", null)
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDisplayVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any) | Null)*
      ): Self = StObject.set(x, "display", js.Array(value :_*))
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFlex(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexNull: Self = StObject.set(x, "flex", null)
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "flex", js.Array(value :_*))
      
      inline def setFontSize(value: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontSizeVarargs(value: ((ThemeValue[fontSizes, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontSize", js.Array(value :_*))
      
      inline def setFontWeight(value: ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightNull: Self = StObject.set(x, "fontWeight", null)
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFontWeightVarargs(value: ((ThemeValue[fontWeights, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "height", js.Array(value :_*))
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
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
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMNull: Self = StObject.set(x, "m", null)
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      inline def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      inline def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      inline def setMarginNull: Self = StObject.set(x, "margin", null)
      
      inline def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      inline def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      inline def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      inline def setMarginXNull: Self = StObject.set(x, "marginX", null)
      
      inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      inline def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      inline def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      inline def setMarginYNull: Self = StObject.set(x, "marginY", null)
      
      inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      inline def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      inline def setMaxHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightNull: Self = StObject.set(x, "maxHeight", null)
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
      
      inline def setMaxWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthNull: Self = StObject.set(x, "maxWidth", null)
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMaxWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
      
      inline def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      inline def setMbNull: Self = StObject.set(x, "mb", null)
      
      inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      inline def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      inline def setMinHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightNull: Self = StObject.set(x, "minHeight", null)
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minHeight", js.Array(value :_*))
      
      inline def setMinWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthNull: Self = StObject.set(x, "minWidth", null)
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMinWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minWidth", js.Array(value :_*))
      
      inline def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      inline def setMlNull: Self = StObject.set(x, "ml", null)
      
      inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      inline def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      inline def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      inline def setMrNull: Self = StObject.set(x, "mr", null)
      
      inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      inline def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      inline def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      inline def setMtNull: Self = StObject.set(x, "mt", null)
      
      inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      inline def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      inline def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      inline def setMxNull: Self = StObject.set(x, "mx", null)
      
      inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      inline def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      inline def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyNull: Self = StObject.set(x, "my", null)
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLButtonElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpacity(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpacityVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any) | Null)*
      ): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      inline def setOrder(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any) | Null)*
      ): Self = StObject.set(x, "order", js.Array(value :_*))
      
      inline def setOverflow(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowNull: Self = StObject.set(x, "overflow", null)
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflow", js.Array(value :_*))
      
      inline def setOverflowX(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXNull: Self = StObject.set(x, "overflowX", null)
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowXVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowX", js.Array(value :_*))
      
      inline def setOverflowY(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYNull: Self = StObject.set(x, "overflowY", null)
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setOverflowYVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowY", js.Array(value :_*))
      
      inline def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPNull: Self = StObject.set(x, "p", null)
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      inline def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      inline def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      inline def setPaddingNull: Self = StObject.set(x, "padding", null)
      
      inline def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      inline def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      inline def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXNull: Self = StObject.set(x, "paddingX", null)
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      inline def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYNull: Self = StObject.set(x, "paddingY", null)
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      inline def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      inline def setPbNull: Self = StObject.set(x, "pb", null)
      
      inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      inline def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      inline def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      inline def setPlNull: Self = StObject.set(x, "pl", null)
      
      inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      inline def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      inline def setPrNull: Self = StObject.set(x, "pr", null)
      
      inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      inline def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtNull: Self = StObject.set(x, "pt", null)
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      inline def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPxNull: Self = StObject.set(x, "px", null)
      
      inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      inline def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      inline def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setPyNull: Self = StObject.set(x, "py", null)
      
      inline def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      inline def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSize(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "size", js.Array(value :_*))
      
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
      
      inline def setSx(value: SxStyleProp): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTx(value: String): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
      
      inline def setTxUndefined: Self = StObject.set(x, "tx", js.undefined)
      
      inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setVariant(value: ResponsiveValue[String, RequiredTheme]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantNull: Self = StObject.set(x, "variant", null)
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVariantVarargs(value: (String | Null)*): Self = StObject.set(x, "variant", js.Array(value :_*))
      
      inline def setVerticalAlign(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignNull: Self = StObject.set(x, "verticalAlign", null)
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setVerticalAlignVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "verticalAlign", js.Array(value :_*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "width", js.Array(value :_*))
    }
  }
  
  /* Inlined parent @rebass/forms.@rebass/forms.BoxKnownProps */
  /* Inlined parent @rebass/forms.@rebass/forms.Omit<react.react.TextareaHTMLAttributes<std.HTMLTextAreaElement>, keyof @rebass/forms.@rebass/forms.BoxKnownProps> */
  trait TextareaProps extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
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
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
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
    
    var as: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
      */
    var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
      * By default the raw value of the prop is returned.
      *
      * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
      * Array values are converted into responsive values.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
      */
    var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var dirName: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The display CSS property defines the display type of an element, which consists of the two basic qualities
      * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
      * and the inner display type defining how the children of the box are laid out.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var display: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in
      * its flex container. This is a shorthand property that sets flex-grow, flex-shrink, and flex-basis.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex)
      */
    var flex: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The fontSize utility parses a component's `fontSize` prop and converts it into a CSS font-size declaration.
      *
      * - Numbers from 0-8 (or `theme.fontSizes.length`) are converted to values on the [font size scale](#default-theme).
      * - Numbers greater than `theme.fontSizes.length` are converted to raw pixel values.
      * - String values are passed as raw CSS values.
      * - And array values are converted into responsive values.
      *
      */
    var fontSize: js.UndefOr[ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The font-weight CSS property specifies the weight (or boldness) of the font.
      *
      * The font weights available to you will depend on the font-family you are using. Some fonts are only available in normal and bold.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight)
      */
    var fontWeight: js.UndefOr[ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    /**
      * The height CSS property specifies the height of an element. By default, the property defines the height of the
      * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
      */
    var height: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[js.Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top, left, bottom and right */
    var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on bottom */
    var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left */
    var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
      * property from becoming larger than the value specified for max-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
      */
    var maxHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The max-width CSS property sets the maximum width of an element.
      * It prevents the used value of the width property from becoming larger than the value specified by max-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
      */
    var maxWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on bottom */
    var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /**
      * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
      * property from becoming smaller than the value specified for min-height.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
      */
    var minHeight: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The min-width CSS property sets the minimum width of an element.
      * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
      */
    var minWidth: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Margin on left */
    var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on right */
    var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top */
    var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on left and right */
    var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Margin on top and bottom */
    var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLTextAreaElement]] = js.undefined
    
    /**
      * The opacity CSS property sets the transparency of an element or the degree to which content
      * behind an element is visible.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
      */
    var opacity: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
      * are sorted by ascending order value and then by their source code order.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
      */
    var order: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow CSS property sets what to do when an element's content is too big to fit in its block
      * formatting context. It is a shorthand for overflow-x and overflow-y.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
      */
    var overflow: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-x CSS property sets what shows when content overflows a block-level element's left
      * and right edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
      */
    var overflowX: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /**
      * The overflow-y CSS property sets what shows when content overflows a block-level element's top
      * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
      */
    var overflowY: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top, left, bottom and right */
    var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on bottom */
    var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on right */
    var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top */
    var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on bottom */
    var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left */
    var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Padding on right */
    var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    /** Padding on top */
    var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on left and right */
    var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    /** Padding on top and bottom */
    var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[js.Any]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The sx prop lets you style elements inline, using values from your theme.
      */
    var sx: js.UndefOr[SxStyleProp] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var tx: js.UndefOr[String] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.undefined
    
    /**
      * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
      *
      * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
      */
    var verticalAlign: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
          RequiredTheme
        ]
      ] = js.undefined
    
    var wrap: js.UndefOr[String] = js.undefined
  }
  object TextareaProps {
    
    inline def apply(): TextareaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextareaProps]
    }
    
    extension [Self <: TextareaProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAlignSelf(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfNull: Self = StObject.set(x, "alignSelf", null)
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignSelfVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any) | Null)*
      ): Self = StObject.set(x, "alignSelf", js.Array(value :_*))
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      inline def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgNull: Self = StObject.set(x, "bg", null)
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCss(value: CSSObject | FlattenSimpleInterpolation | String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirName(value: String): Self = StObject.set(x, "dirName", value.asInstanceOf[js.Any])
      
      inline def setDirNameUndefined: Self = StObject.set(x, "dirName", js.undefined)
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplay(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayNull: Self = StObject.set(x, "display", null)
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDisplayVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any) | Null)*
      ): Self = StObject.set(x, "display", js.Array(value :_*))
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFlex(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexNull: Self = StObject.set(x, "flex", null)
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "flex", js.Array(value :_*))
      
      inline def setFontSize(value: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontSizeVarargs(value: ((ThemeValue[fontSizes, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontSize", js.Array(value :_*))
      
      inline def setFontWeight(value: ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightNull: Self = StObject.set(x, "fontWeight", null)
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFontWeightVarargs(value: ((ThemeValue[fontWeights, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "height", js.Array(value :_*))
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
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
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMNull: Self = StObject.set(x, "m", null)
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      inline def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      inline def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      inline def setMarginNull: Self = StObject.set(x, "margin", null)
      
      inline def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      inline def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      inline def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      inline def setMarginXNull: Self = StObject.set(x, "marginX", null)
      
      inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      inline def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      inline def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      inline def setMarginYNull: Self = StObject.set(x, "marginY", null)
      
      inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      inline def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      inline def setMaxHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightNull: Self = StObject.set(x, "maxHeight", null)
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthNull: Self = StObject.set(x, "maxWidth", null)
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMaxWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
      
      inline def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      inline def setMbNull: Self = StObject.set(x, "mb", null)
      
      inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      inline def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      inline def setMinHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightNull: Self = StObject.set(x, "minHeight", null)
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinHeightVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minHeight", js.Array(value :_*))
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthNull: Self = StObject.set(x, "minWidth", null)
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMinWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "minWidth", js.Array(value :_*))
      
      inline def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      inline def setMlNull: Self = StObject.set(x, "ml", null)
      
      inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      inline def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      inline def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      inline def setMrNull: Self = StObject.set(x, "mr", null)
      
      inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      inline def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      inline def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      inline def setMtNull: Self = StObject.set(x, "mt", null)
      
      inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      inline def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      inline def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      inline def setMxNull: Self = StObject.set(x, "mx", null)
      
      inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      inline def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      inline def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyNull: Self = StObject.set(x, "my", null)
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLTextAreaElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpacity(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpacityVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any) | Null)*
      ): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      inline def setOrder(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ js.Any) | Null)*
      ): Self = StObject.set(x, "order", js.Array(value :_*))
      
      inline def setOverflow(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowNull: Self = StObject.set(x, "overflow", null)
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflow", js.Array(value :_*))
      
      inline def setOverflowX(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXNull: Self = StObject.set(x, "overflowX", null)
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowXVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowX", js.Array(value :_*))
      
      inline def setOverflowY(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYNull: Self = StObject.set(x, "overflowY", null)
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setOverflowYVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any) | Null)*
      ): Self = StObject.set(x, "overflowY", js.Array(value :_*))
      
      inline def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPNull: Self = StObject.set(x, "p", null)
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      inline def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      inline def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      inline def setPaddingNull: Self = StObject.set(x, "padding", null)
      
      inline def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      inline def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      inline def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXNull: Self = StObject.set(x, "paddingX", null)
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      inline def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYNull: Self = StObject.set(x, "paddingY", null)
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      inline def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      inline def setPbNull: Self = StObject.set(x, "pb", null)
      
      inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      inline def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      inline def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      inline def setPlNull: Self = StObject.set(x, "pl", null)
      
      inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      inline def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      inline def setPrNull: Self = StObject.set(x, "pr", null)
      
      inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      inline def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtNull: Self = StObject.set(x, "pt", null)
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      inline def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPxNull: Self = StObject.set(x, "px", null)
      
      inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      inline def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      inline def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setPyNull: Self = StObject.set(x, "py", null)
      
      inline def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      inline def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSize(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "size", js.Array(value :_*))
      
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
      
      inline def setSx(value: SxStyleProp): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTx(value: String): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
      
      inline def setTxUndefined: Self = StObject.set(x, "tx", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setVariant(value: ResponsiveValue[String, RequiredTheme]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantNull: Self = StObject.set(x, "variant", null)
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVariantVarargs(value: (String | Null)*): Self = StObject.set(x, "variant", js.Array(value :_*))
      
      inline def setVerticalAlign(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignNull: Self = StObject.set(x, "verticalAlign", null)
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setVerticalAlignVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "verticalAlign", js.Array(value :_*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ js.Any) | Null)*
      ): Self = StObject.set(x, "width", js.Array(value :_*))
      
      inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
