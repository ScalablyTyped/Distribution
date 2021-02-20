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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/theming", "CacheProvider")
  @js.native
  val CacheProvider: Provider[EmotionCache] = js.native
  
  @JSImport("@storybook/theming", "ClassNames")
  @js.native
  def ClassNames[Theme](props: ClassNamesProps[Theme]): ReactElement = js.native
  
  @JSImport("@storybook/theming", "Global")
  @js.native
  def Global[Theme](props: GlobalProps[Theme]): ReactElement = js.native
  
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
    @scala.inline
    def app_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("app")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.bar")
    @js.native
    def bar: String = js.native
    @scala.inline
    def bar_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bar")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.content")
    @js.native
    def content: String = js.native
    @scala.inline
    def content_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.critical")
    @js.native
    def critical: String = js.native
    @scala.inline
    def critical_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("critical")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.gridCellSize")
    @js.native
    def gridCellSize: Double = js.native
    @scala.inline
    def gridCellSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridCellSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.hoverable")
    @js.native
    def hoverable: String = js.native
    @scala.inline
    def hoverable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.negative")
    @js.native
    def negative: String = js.native
    @scala.inline
    def negative_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("negative")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.positive")
    @js.native
    def positive: String = js.native
    @scala.inline
    def positive_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positive")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "background.warning")
    @js.native
    def warning: String = js.native
    @scala.inline
    def warning_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  object color {
    
    @JSImport("@storybook/theming", "color")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/theming", "color.ancillary")
    @js.native
    def ancillary: String = js.native
    @scala.inline
    def ancillary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ancillary")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.border")
    @js.native
    def border: String = js.native
    @scala.inline
    def border_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("border")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.critical")
    @js.native
    def critical: String = js.native
    @scala.inline
    def critical_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("critical")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.dark")
    @js.native
    def dark: String = js.native
    @scala.inline
    def dark_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dark")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.darker")
    @js.native
    def darker: String = js.native
    @scala.inline
    def darker_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darker")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.darkest")
    @js.native
    def darkest: String = js.native
    @scala.inline
    def darkest_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkest")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.defaultText")
    @js.native
    def defaultText: String = js.native
    @scala.inline
    def defaultText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultText")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.gold")
    @js.native
    def gold: String = js.native
    @scala.inline
    def gold_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gold")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.green")
    @js.native
    def green: String = js.native
    @scala.inline
    def green_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.inverseText")
    @js.native
    def inverseText: String = js.native
    @scala.inline
    def inverseText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inverseText")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.light")
    @js.native
    def light: String = js.native
    @scala.inline
    def light_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.lighter")
    @js.native
    def lighter: String = js.native
    @scala.inline
    def lighter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lighter")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.lightest")
    @js.native
    def lightest: String = js.native
    @scala.inline
    def lightest_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightest")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.medium")
    @js.native
    def medium: String = js.native
    @scala.inline
    def medium_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("medium")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.mediumdark")
    @js.native
    def mediumdark: String = js.native
    @scala.inline
    def mediumdark_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumdark")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.mediumlight")
    @js.native
    def mediumlight: String = js.native
    @scala.inline
    def mediumlight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumlight")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.negative")
    @js.native
    def negative: String = js.native
    @scala.inline
    def negative_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("negative")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.orange")
    @js.native
    def orange: String = js.native
    @scala.inline
    def orange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orange")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.positive")
    @js.native
    def positive: String = js.native
    @scala.inline
    def positive_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positive")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.primary")
    @js.native
    def primary: String = js.native
    @scala.inline
    def primary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.purple")
    @js.native
    def purple: String = js.native
    @scala.inline
    def purple_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.seafoam")
    @js.native
    def seafoam: String = js.native
    @scala.inline
    def seafoam_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seafoam")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.secondary")
    @js.native
    def secondary: String = js.native
    @scala.inline
    def secondary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondary")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.tertiary")
    @js.native
    def tertiary: String = js.native
    @scala.inline
    def tertiary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tertiary")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.ultraviolet")
    @js.native
    def ultraviolet: String = js.native
    @scala.inline
    def ultraviolet_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ultraviolet")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "color.warning")
    @js.native
    def warning: String = js.native
    @scala.inline
    def warning_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/theming", "convert")
  @js.native
  def convert(): Theme = js.native
  @JSImport("@storybook/theming", "convert")
  @js.native
  def convert(inherit: ThemeVars): Theme = js.native
  
  @JSImport("@storybook/theming", "create")
  @js.native
  def create(): ThemeVars = js.native
  @JSImport("@storybook/theming", "create")
  @js.native
  def create(vars: js.UndefOr[scala.Nothing], rest: Rest): ThemeVars = js.native
  @JSImport("@storybook/theming", "create")
  @js.native
  def create(vars: ThemeVars): ThemeVars = js.native
  @JSImport("@storybook/theming", "create")
  @js.native
  def create(vars: ThemeVars, rest: Rest): ThemeVars = js.native
  
  @JSImport("@storybook/theming", "createGlobal")
  @js.native
  def createGlobal(hasColorBackgroundTypography: Background): Return = js.native
  
  @JSImport("@storybook/theming", "createReset")
  @js.native
  def createReset(hasTypography: Typography): Return = js.native
  
  @JSImport("@storybook/theming", "css")
  @js.native
  def css(args: Interpolation[js.UndefOr[scala.Nothing]]*): SerializedStyles = js.native
  @JSImport("@storybook/theming", "css")
  @js.native
  def css(template: TemplateStringsArray, args: Interpolation[js.UndefOr[scala.Nothing]]*): SerializedStyles = js.native
  
  @JSImport("@storybook/theming", "darken")
  @js.native
  def darken(color: String): String = js.native
  
  @JSImport("@storybook/theming", "ensure")
  @js.native
  def ensure(input: ThemeVars): Theme = js.native
  
  @JSImport("@storybook/theming", "ignoreSsrWarning")
  @js.native
  val ignoreSsrWarning: /* "/ * emotion-disable-server-rendering-unsafe-selector-warning-please-do-not-use-this-the-warning-exists-for-a-reason * /" */ String = js.native
  
  @JSImport("@storybook/theming", "isPropValid")
  @js.native
  def isPropValid(string: String): Boolean = js.native
  
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] with ClassAttributes[HTMLInputElement],
    children: ReactNode*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx(`type`: input, props: js.UndefOr[scala.Nothing], children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: String, props: Attributes with P, children: ReactNode*): ReactElement = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) with P,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Null,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes with P, children: ReactNode*): ReactElement = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): FunctionComponentElement[P] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): FunctionComponentElement[P] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] with P, children: ReactNode*): DOMElement[P, T] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] with P,
    children: ReactNode*
  ): ReactSVGElement = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): ReactSVGElement = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: Null,
    children: ReactNode*
  ): ReactSVGElement = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: ReactNode*): CElement[P, T] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: js.UndefOr[scala.Nothing], children: ReactNode*): CElement[P, T] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode*): DOMElement[P, T] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: ClassAttributes[T] with P,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: Null,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): ReactElement = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  @JSImport("@storybook/theming", "jsx")
  @js.native
  def jsx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = js.native
  
  @JSImport("@storybook/theming", "keyframes")
  @js.native
  def keyframes(args: Interpolation[js.UndefOr[scala.Nothing]]*): Keyframes = js.native
  @JSImport("@storybook/theming", "keyframes")
  @js.native
  def keyframes(template: TemplateStringsArray, args: Interpolation[js.UndefOr[scala.Nothing]]*): Keyframes = js.native
  
  @JSImport("@storybook/theming", "lighten")
  @js.native
  def lighten(color: String): String = js.native
  
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
    @scala.inline
    def dark_=(x: ThemeVars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dark")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "themes.light")
    @js.native
    def light: ThemeVars = js.native
    @scala.inline
    def light_=(x: ThemeVars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "themes.normal")
    @js.native
    def normal: ThemeVars = js.native
    @scala.inline
    def normal_=(x: ThemeVars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
  }
  
  object typography {
    
    @JSImport("@storybook/theming", "typography")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/theming", "typography.fonts")
    @js.native
    def fonts: Base = js.native
    @scala.inline
    def fonts_=(x: Base): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fonts")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "typography.size")
    @js.native
    def size: Code = js.native
    @scala.inline
    def size_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming", "typography.weight")
    @js.native
    def weight: Black = js.native
    @scala.inline
    def weight_=(x: Black): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weight")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/theming", "withEmotionCache")
  @js.native
  def withEmotionCache[Props, RefType](
    func: js.Function3[/* props */ Props, /* context */ EmotionCache, /* ref */ Ref[RefType], ReactNode]
  ): SFC[Props with ClassAttributes[RefType]] = js.native
  
  /* augmented module */
  object reactAugmentingMod {
    
    @js.native
    trait DOMAttributes[T] extends StObject {
      
      var css: js.UndefOr[InterpolationWithTheme[_]] = js.native
    }
    object DOMAttributes {
      
      @scala.inline
      def apply[T](): typings.storybookTheming.mod.reactAugmentingMod.DOMAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.storybookTheming.mod.reactAugmentingMod.DOMAttributes[T]]
      }
      
      @scala.inline
      implicit class DOMAttributesMutableBuilder[Self <: typings.storybookTheming.mod.reactAugmentingMod.DOMAttributes[_], T] (val x: Self with typings.storybookTheming.mod.reactAugmentingMod.DOMAttributes[T]) extends AnyVal {
        
        @scala.inline
        def setCss(value: InterpolationWithTheme[_]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCssFunction1(value: _ => Interpolation[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCssNull: Self = StObject.set(x, "css", null)
        
        @scala.inline
        def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      }
    }
  }
}
