package typings.storybookTheming

import typings.emotionCore.mod.ClassNamesProps
import typings.emotionCore.mod.GlobalProps
import typings.emotionCore.mod.InterpolationWithTheme
import typings.emotionSerialize.mod.Interpolation
import typings.emotionSerialize.mod.Keyframes
import typings.emotionStyled.mod.CreateStyled
import typings.emotionUtils.mod.EmotionCache
import typings.emotionUtils.mod.SerializedStyles
import typings.react.mod.Attributes
import typings.react.mod.CElement
import typings.react.mod.ClassAttributes
import typings.react.mod.ClassType
import typings.react.mod.ClassicComponent
import typings.react.mod.ClassicComponentClass
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.FunctionComponent
import typings.react.mod.FunctionComponentElement
import typings.react.mod.HTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactSVGElement
import typings.react.mod.Ref
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.SVGElement
import typings.std.TemplateStringsArray
import typings.storybookTheming.anon.Background
import typings.storybookTheming.anon.Base
import typings.storybookTheming.anon.Black
import typings.storybookTheming.anon.Code
import typings.storybookTheming.anon.Typography
import typings.storybookTheming.createMod.Rest
import typings.storybookTheming.globalMod.Return
import typings.storybookTheming.storybookThemingStrings.input
import typings.storybookTheming.typesMod.Theme
import typings.storybookTheming.typesMod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/theming", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/theming", "CacheProvider")
  @js.native
  val CacheProvider: Provider[EmotionCache] = js.native
  
  inline def ClassNames[Theme](props: ClassNamesProps[Theme]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ClassNames")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def Global[Theme](props: GlobalProps[Theme]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Global")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@storybook/theming", "ThemeContext")
  @js.native
  val ThemeContext: Context[js.Object] = js.native
  
  object background {
    
    @JSImport("@storybook/theming", "background")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/theming", "background.app")
    @js.native
    def app: String = js.native
    inline def app_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("app")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.bar")
    @js.native
    def bar: String = js.native
    inline def bar_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bar")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.content")
    @js.native
    def content: String = js.native
    inline def content_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.critical")
    @js.native
    def critical: String = js.native
    inline def critical_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("critical")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.gridCellSize")
    @js.native
    def gridCellSize: Double = js.native
    inline def gridCellSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridCellSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.hoverable")
    @js.native
    def hoverable: String = js.native
    inline def hoverable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.negative")
    @js.native
    def negative: String = js.native
    inline def negative_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("negative")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.positive")
    @js.native
    def positive: String = js.native
    inline def positive_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positive")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.warning")
    @js.native
    def warning: String = js.native
    inline def warning_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  object color {
    
    @JSImport("@storybook/theming", "color")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/theming", "color.ancillary")
    @js.native
    def ancillary: String = js.native
    inline def ancillary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ancillary")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.border")
    @js.native
    def border: String = js.native
    inline def border_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("border")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.critical")
    @js.native
    def critical: String = js.native
    inline def critical_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("critical")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.dark")
    @js.native
    def dark: String = js.native
    inline def dark_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dark")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.darker")
    @js.native
    def darker: String = js.native
    inline def darker_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darker")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.darkest")
    @js.native
    def darkest: String = js.native
    inline def darkest_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkest")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.defaultText")
    @js.native
    def defaultText: String = js.native
    inline def defaultText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultText")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.gold")
    @js.native
    def gold: String = js.native
    inline def gold_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gold")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.green")
    @js.native
    def green: String = js.native
    inline def green_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.inverseText")
    @js.native
    def inverseText: String = js.native
    inline def inverseText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inverseText")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.light")
    @js.native
    def light: String = js.native
    inline def light_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.lighter")
    @js.native
    def lighter: String = js.native
    inline def lighter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lighter")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.lightest")
    @js.native
    def lightest: String = js.native
    inline def lightest_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightest")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.medium")
    @js.native
    def medium: String = js.native
    inline def medium_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("medium")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.mediumdark")
    @js.native
    def mediumdark: String = js.native
    inline def mediumdark_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumdark")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.mediumlight")
    @js.native
    def mediumlight: String = js.native
    inline def mediumlight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumlight")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.negative")
    @js.native
    def negative: String = js.native
    inline def negative_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("negative")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.orange")
    @js.native
    def orange: String = js.native
    inline def orange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orange")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.positive")
    @js.native
    def positive: String = js.native
    inline def positive_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positive")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.primary")
    @js.native
    def primary: String = js.native
    inline def primary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.purple")
    @js.native
    def purple: String = js.native
    inline def purple_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.seafoam")
    @js.native
    def seafoam: String = js.native
    inline def seafoam_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seafoam")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.secondary")
    @js.native
    def secondary: String = js.native
    inline def secondary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondary")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.tertiary")
    @js.native
    def tertiary: String = js.native
    inline def tertiary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tertiary")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.ultraviolet")
    @js.native
    def ultraviolet: String = js.native
    inline def ultraviolet_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ultraviolet")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.warning")
    @js.native
    def warning: String = js.native
    inline def warning_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  inline def convert(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")().asInstanceOf[Theme]
  inline def convert(inherit: ThemeVars): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(inherit.asInstanceOf[js.Any]).asInstanceOf[Theme]
  
  inline def create(): ThemeVars = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ThemeVars]
  inline def create(vars: Unit, rest: Rest): ThemeVars = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vars.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[ThemeVars]
  inline def create(vars: ThemeVars): ThemeVars = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(vars.asInstanceOf[js.Any]).asInstanceOf[ThemeVars]
  inline def create(vars: ThemeVars, rest: Rest): ThemeVars = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vars.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[ThemeVars]
  
  inline def createGlobal(hasColorBackgroundTypography: Background): Return = ^.asInstanceOf[js.Dynamic].applyDynamic("createGlobal")(hasColorBackgroundTypography.asInstanceOf[js.Any]).asInstanceOf[Return]
  
  inline def createReset(hasTypography: Typography): Return = ^.asInstanceOf[js.Dynamic].applyDynamic("createReset")(hasTypography.asInstanceOf[js.Any]).asInstanceOf[Return]
  
  inline def css(args: Interpolation[Unit]*): SerializedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(args.asInstanceOf[js.Any]).asInstanceOf[SerializedStyles]
  inline def css(template: TemplateStringsArray, args: Interpolation[Unit]*): SerializedStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("css")(template.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SerializedStyles]
  
  inline def darken(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ensure(input: ThemeVars): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("ensure")(input.asInstanceOf[js.Any]).asInstanceOf[Theme]
  
  @JSImport("@storybook/theming", "ignoreSsrWarning")
  @js.native
  val ignoreSsrWarning: /* "/ * emotion-disable-server-rendering-unsafe-selector-warning-please-do-not-use-this-the-warning-exists-for-a-reason * /" */ String = js.native
  
  inline def isPropValid(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropValid")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def jsx(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
    children: ReactNode*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def jsx(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def jsx(`type`: input, props: Unit, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def jsx[P /* <: js.Object */](`type`: String, props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def jsx[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def jsx[P /* <: js.Object */](`type`: String, props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) & P,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  inline def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Null,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  inline def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Unit,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  inline def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  inline def jsx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] & P,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  inline def jsx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: Null,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  inline def jsx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: Unit,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  inline def jsx[P /* <: js.Object */, T /* <: Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
  inline def jsx[P /* <: js.Object */, T /* <: Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
  inline def jsx[P /* <: js.Object */, T /* <: Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
  
  inline def jsx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
  inline def jsx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
  inline def jsx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
  
  inline def jsx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: ClassAttributes[T] & P,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  inline def jsx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: Null,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  inline def jsx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: Unit,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  
  inline def jsx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def jsx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def jsx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  inline def keyframes(args: Interpolation[Unit]*): Keyframes = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(args.asInstanceOf[js.Any]).asInstanceOf[Keyframes]
  inline def keyframes(template: TemplateStringsArray, args: Interpolation[Unit]*): Keyframes = (^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(template.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Keyframes]
  
  inline def lighten(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@storybook/theming", "styled")
  @js.native
  val styled: CreateStyled[Theme] = js.native
  
  object themes {
    
    @JSImport("@storybook/theming", "themes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/theming", "themes.dark")
    @js.native
    def dark: ThemeVars = js.native
    inline def dark_=(x: ThemeVars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dark")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "themes.light")
    @js.native
    def light: ThemeVars = js.native
    inline def light_=(x: ThemeVars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "themes.normal")
    @js.native
    def normal: ThemeVars = js.native
    inline def normal_=(x: ThemeVars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
  }
  
  object typography {
    
    @JSImport("@storybook/theming", "typography")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/theming", "typography.fonts")
    @js.native
    def fonts: Base = js.native
    inline def fonts_=(x: Base): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fonts")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "typography.size")
    @js.native
    def size: Code = js.native
    inline def size_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "typography.weight")
    @js.native
    def weight: Black = js.native
    inline def weight_=(x: Black): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weight")(x.asInstanceOf[js.Any])
  }
  
  inline def withEmotionCache[Props, RefType](
    func: js.Function3[/* props */ Props, /* context */ EmotionCache, /* ref */ Ref[RefType], ReactNode]
  ): SFC[Props & ClassAttributes[RefType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withEmotionCache")(func.asInstanceOf[js.Any]).asInstanceOf[SFC[Props & ClassAttributes[RefType]]]
  
  /* augmented module */
  object reactAugmentingMod {
    
    trait DOMAttributes[T] extends StObject {
      
      var css: js.UndefOr[InterpolationWithTheme[js.Any]] = js.undefined
    }
    object DOMAttributes {
      
      inline def apply[T](): typings.storybookTheming.mod.reactAugmentingMod.DOMAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.storybookTheming.mod.reactAugmentingMod.DOMAttributes[T]]
      }
      
      extension [Self <: typings.storybookTheming.mod.reactAugmentingMod.DOMAttributes[?], T](x: Self & typings.storybookTheming.mod.reactAugmentingMod.DOMAttributes[T]) {
        
        inline def setCss(value: InterpolationWithTheme[js.Any]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        inline def setCssFunction1(value: js.Any => Interpolation[Unit]): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
        
        inline def setCssNull: Self = StObject.set(x, "css", null)
        
        inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      }
    }
  }
}
