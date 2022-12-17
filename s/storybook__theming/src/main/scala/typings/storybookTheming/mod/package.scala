package typings.storybookTheming.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Attributes
import typings.react.mod.CElement
import typings.react.mod.ClassAttributes
import typings.react.mod.ClassType
import typings.react.mod.ClassicComponent
import typings.react.mod.ClassicComponentClass
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.FunctionComponentElement
import typings.react.mod.HTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactSVGElement
import typings.react.mod.SVGAttributes
import typings.react.mod.global.JSX.IntrinsicElements
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Element
import typings.std.Exclude
import typings.std.Extract
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Partial
import typings.std.Pick
import typings.std.PropertyKey
import typings.std.SVGElement
import typings.std.TemplateStringsArray
import typings.storybookTheming.`distTs3Dot9Modules@emotionCacheNodeModules@emotionUtilsTypesIndexMod`.EmotionCache
import typings.storybookTheming.`distTs3Dot9Modules@emotionCacheNodeModules@emotionUtilsTypesIndexMod`.SerializedStyles
import typings.storybookTheming.`distTs3Dot9Modules@emotionCacheTypesIndexMod`.Options
import typings.storybookTheming.`distTs3Dot9Modules@emotionReactNodeModules@emotionSerializeTypesIndexMod`.CSSInterpolation
import typings.storybookTheming.`distTs3Dot9Modules@emotionReactNodeModules@emotionSerializeTypesIndexMod`.Keyframes
import typings.storybookTheming.`distTs3Dot9Modules@emotionReactTypesIndexMod`.ClassNamesProps
import typings.storybookTheming.anon.Background
import typings.storybookTheming.anon.Styles
import typings.storybookTheming.anon.Typography
import typings.storybookTheming.mod.^
import typings.storybookTheming.storybookThemingStrings.input
import typings.storybookTheming.storybookThemingStrings.theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CacheProvider: Provider[EmotionCache] = ^.asInstanceOf[js.Dynamic].selectDynamic("CacheProvider").asInstanceOf[Provider[EmotionCache]]

inline def ClassNames(props: ClassNamesProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ClassNames")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]

inline def Global(props: Styles): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Global")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]

inline def ThemeProvider: typings.storybookTheming.`distTs3Dot9Modules@emotionReactTypesThemingMod`.ThemeProvider = ^.asInstanceOf[js.Dynamic].selectDynamic("ThemeProvider").asInstanceOf[typings.storybookTheming.`distTs3Dot9Modules@emotionReactTypesThemingMod`.ThemeProvider]

inline def convert(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")().asInstanceOf[Theme]
inline def convert(inherit: ThemeVars): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(inherit.asInstanceOf[js.Any]).asInstanceOf[Theme]

inline def create(): ThemeVars = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ThemeVars]
inline def create(vars: Unit, rest: Rest): ThemeVars = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vars.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[ThemeVars]
inline def create(vars: ThemeVars): ThemeVars = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(vars.asInstanceOf[js.Any]).asInstanceOf[ThemeVars]
inline def create(vars: ThemeVars, rest: Rest): ThemeVars = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vars.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[ThemeVars]

inline def createCache(options: Options): EmotionCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createCache")(options.asInstanceOf[js.Any]).asInstanceOf[EmotionCache]

inline def createGlobal(param0: Background): Return = ^.asInstanceOf[js.Dynamic].applyDynamic("createGlobal")(param0.asInstanceOf[js.Any]).asInstanceOf[Return]

inline def createReset(param0: Typography): Return = ^.asInstanceOf[js.Dynamic].applyDynamic("createReset")(param0.asInstanceOf[js.Any]).asInstanceOf[Return]

inline def css(args: CSSInterpolation*): SerializedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SerializedStyles]
inline def css(template: TemplateStringsArray, args: CSSInterpolation*): SerializedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(scala.List(template.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[SerializedStyles]

inline def darken(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any]).asInstanceOf[String]

inline def ensure(input: ThemeVars): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("ensure")(input.asInstanceOf[js.Any]).asInstanceOf[Theme]

inline def ignoreSsrWarning: /* "/ * emotion-disable-server-rendering-unsafe-selector-warning-please-do-not-use-this-the-warning-exists-for-a-reason * /" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ignoreSsrWarning").asInstanceOf[/* "/ * emotion-disable-server-rendering-unsafe-selector-warning-please-do-not-use-this-the-warning-exists-for-a-reason * /" */ String]

inline def isPropValid(string: PropertyKey): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropValid")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def jsx(
  `type`: input,
  props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
  children: ReactNode*
): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
inline def jsx(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
inline def jsx(`type`: input, props: Unit, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
inline def jsx[P /* <: js.Object */](`type`: String, props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def jsx[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def jsx[P /* <: js.Object */](`type`: String, props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def jsx[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
  props: (ClassAttributes[ClassicComponent[P, ComponentState]]) & P,
  children: ReactNode*
): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
inline def jsx[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
  props: Null,
  children: ReactNode*
): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
inline def jsx[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
  props: Unit,
  children: ReactNode*
): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
inline def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def jsx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def jsx[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typings.storybookTheming.storybookThemingStrings.a_, typings.storybookTheming.storybookThemingStrings.abbr, typings.storybookTheming.storybookThemingStrings.address */ Any,
  props: ClassAttributes[T] & P,
  children: ReactNode*
): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
inline def jsx[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typings.storybookTheming.storybookThemingStrings.a_, typings.storybookTheming.storybookThemingStrings.abbr, typings.storybookTheming.storybookThemingStrings.address */ Any,
  props: Null,
  children: ReactNode*
): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
inline def jsx[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typings.storybookTheming.storybookThemingStrings.a_, typings.storybookTheming.storybookThemingStrings.abbr, typings.storybookTheming.storybookThemingStrings.address */ Any,
  props: Unit,
  children: ReactNode*
): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]

inline def jsx_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
inline def jsx_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
inline def jsx_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]

inline def jsx_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
inline def jsx_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
inline def jsx_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]

inline def jsx_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.storybookTheming.storybookThemingStrings.animate, typings.storybookTheming.storybookThemingStrings.circle, typings.storybookTheming.storybookThemingStrings.clipPath */ Any,
  props: ClassAttributes[T] & P,
  children: ReactNode*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
inline def jsx_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.storybookTheming.storybookThemingStrings.animate, typings.storybookTheming.storybookThemingStrings.circle, typings.storybookTheming.storybookThemingStrings.clipPath */ Any,
  props: Null,
  children: ReactNode*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
inline def jsx_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.storybookTheming.storybookThemingStrings.animate, typings.storybookTheming.storybookThemingStrings.circle, typings.storybookTheming.storybookThemingStrings.clipPath */ Any,
  props: Unit,
  children: ReactNode*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]

inline def jsx_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def jsx_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]
inline def jsx_P_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement]

inline def keyframes(args: CSSInterpolation*): Keyframes = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Keyframes]
inline def keyframes(template: TemplateStringsArray, args: CSSInterpolation*): Keyframes = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(scala.List(template.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Keyframes]

inline def lighten(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any]).asInstanceOf[String]

inline def styled: CreateStyled[Theme] = ^.asInstanceOf[js.Dynamic].selectDynamic("styled").asInstanceOf[CreateStyled[Theme]]

inline def useTheme[TTheme](): TTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[TTheme]

inline def withTheme[C /* <: ComponentType[Any] */](component: C): FC[AddOptionalTo[LibraryManagedAttributes[C, ComponentPropsWithRef[C]], theme]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(component.asInstanceOf[js.Any]).asInstanceOf[FC[AddOptionalTo[LibraryManagedAttributes[C, ComponentPropsWithRef[C]], theme]]]

type AddOptionalTo[T, U] = (DistributiveOmit[T, U]) & (Partial[Pick[T, Extract[/* keyof T */ String, U]]])

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  object extends StyledInstanceTheme ? @storybook/theming.@storybook/theming.CreateStyledComponentBaseThemeless<InnerProps, ExtraProps> : @storybook/theming.@storybook/theming.CreateStyledComponentBaseThemed<InnerProps, ExtraProps, StyledInstanceTheme>
  }}}
  */
type CreateStyledComponentBase[InnerProps, ExtraProps, StyledInstanceTheme /* <: js.Object */] = CreateStyledComponentBaseThemeless[InnerProps, ExtraProps]

type CreateStyledComponentExtrinsic[Tag /* <: ComponentType[Any] */, ExtraProps, Theme /* <: js.Object */] = CreateStyledComponentBase[PropsOf[Tag], ExtraProps, Theme]

type CreateStyledComponentIntrinsic[Tag /* <: /* keyof @storybook/theming.@storybook/theming.JSXInEl */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.storybookTheming.storybookThemingStrings.a_, typings.storybookTheming.storybookThemingStrings.abbr, typings.storybookTheming.storybookThemingStrings.address */ Any */, ExtraProps, Theme /* <: js.Object */] = CreateStyledComponentBase[
/* import warning: importer.ImportType#apply Failed type conversion: @storybook/theming.@storybook/theming.JSXInEl[Tag] */ js.Any, 
ExtraProps, 
Theme]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends any ? std.Pick<T, std.Exclude<keyof T, U>> : never
  }}}
  */
type DistributiveOmit[T, U] = Pick[T, Exclude[/* keyof T */ String, U]]

type JSXInEl = IntrinsicElements

type Overwrapped[T, U] = Pick[T, Extract[/* keyof T */ String, /* keyof U */ String]]

type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.storybookTheming.storybookThemingStrings.a_, typings.storybookTheming.storybookThemingStrings.abbr, typings.storybookTheming.storybookThemingStrings.address */ Any */] = LibraryManagedAttributes[C, ComponentPropsWithRef[C]]

type Rest = StringDictionary[Any]

type Return = StringDictionary[StringDictionary[Value]]

type TextSize = Double | String

type Value = String | Double

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  P extends {  theme :infer Theme} ? P & {  theme :std.Exclude<Theme, undefined>} : P & {  theme :T}
  }}}
  */
type WithTheme_[P, T] = P & (/* import warning: importer.ImportType#apply Failed type conversion: {  theme :T} */ js.Any)
