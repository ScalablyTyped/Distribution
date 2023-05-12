package typings.storybookTheming.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentProps
import typings.react.mod.FC
import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.react.mod.global.JSX.ElementAttributesProperty
import typings.react.mod.global.JSX.ElementChildrenAttribute
import typings.react.mod.global.JSX.ElementClass
import typings.react.mod.global.JSX.IntrinsicAttributes
import typings.react.mod.global.JSX.IntrinsicClassAttributes
import typings.react.mod.global.JSX.IntrinsicElements
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Exclude
import typings.std.Pick
import typings.std.TemplateStringsArray
import typings.storybookTheming.anon.Color
import typings.storybookTheming.anon.Typography
import typings.storybookTheming.distCreateC2b2ce6dMod.CSSInterpolation
import typings.storybookTheming.distCreateC2b2ce6dMod.EmotionCache
import typings.storybookTheming.distCreateC2b2ce6dMod.Keyframes
import typings.storybookTheming.distCreateC2b2ce6dMod.SerializedStyles
import typings.storybookTheming.distCreateC2b2ce6dMod.StorybookTheme
import typings.storybookTheming.distCreateC2b2ce6dMod.ThemeVars
import typings.storybookTheming.mod.^
import typings.storybookTheming.storybookThemingStrings.theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CacheProvider: Provider[EmotionCache] = ^.asInstanceOf[js.Dynamic].selectDynamic("CacheProvider").asInstanceOf[Provider[EmotionCache]]

/**
  * @desc
  * JSX generic are supported only after TS@2.9
  */
inline def ClassNames(props: ClassNamesProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ClassNames")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]

/**
  * @desc
  * JSX generic are supported only after TS@2.9
  */
inline def Global(props: GlobalProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Global")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]

inline def ThemeProvider: typings.storybookTheming.mod.ThemeProvider = ^.asInstanceOf[js.Dynamic].selectDynamic("ThemeProvider").asInstanceOf[typings.storybookTheming.mod.ThemeProvider]
type ThemeProvider = js.Function1[/* props */ ThemeProviderProps, ReactElement]

inline def convert(): StorybookTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")().asInstanceOf[StorybookTheme]
inline def convert(inherit: ThemeVars): StorybookTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(inherit.asInstanceOf[js.Any]).asInstanceOf[StorybookTheme]

inline def createCache(options: Options): EmotionCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createCache")(options.asInstanceOf[js.Any]).asInstanceOf[EmotionCache]

inline def createGlobal(param0: Color): Return = ^.asInstanceOf[js.Dynamic].applyDynamic("createGlobal")(param0.asInstanceOf[js.Any]).asInstanceOf[Return]

inline def createReset(param0: Typography): Return = ^.asInstanceOf[js.Dynamic].applyDynamic("createReset")(param0.asInstanceOf[js.Any]).asInstanceOf[Return]

inline def css(args: CSSInterpolation*): SerializedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SerializedStyles]
inline def css(template: TemplateStringsArray, args: CSSInterpolation*): SerializedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(scala.List(template.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[SerializedStyles]

inline def darken(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any]).asInstanceOf[String]

inline def ensure(input: ThemeVars): StorybookTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("ensure")(input.asInstanceOf[js.Any]).asInstanceOf[StorybookTheme]

inline def ignoreSsrWarning: /* "/ * emotion-disable-server-rendering-unsafe-selector-warning-please-do-not-use-this-the-warning-exists-for-a-reason * /" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ignoreSsrWarning").asInstanceOf[/* "/ * emotion-disable-server-rendering-unsafe-selector-warning-please-do-not-use-this-the-warning-exists-for-a-reason * /" */ String]

// Definitions by: Junyoung Clare Jang <https://github.com/Ailrun>
// TypeScript Version: 2.1
inline def isPropValid(prop: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropValid")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def keyframes(args: CSSInterpolation*): Keyframes = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Keyframes]
inline def keyframes(template: TemplateStringsArray, args: CSSInterpolation*): Keyframes = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(scala.List(template.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Keyframes]

inline def lighten(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any]).asInstanceOf[String]

inline def styled: CreateStyled = ^.asInstanceOf[js.Dynamic].selectDynamic("styled").asInstanceOf[CreateStyled]

inline def useTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[Theme]

inline def withTheme: typings.storybookTheming.mod.withTheme = ^.asInstanceOf[js.Dynamic].selectDynamic("withTheme").asInstanceOf[typings.storybookTheming.mod.withTheme]
type withTheme = js.Function1[
/* component */ Any, 
FC[(DistributiveOmit[PropsOf[Any], theme]) & typings.storybookTheming.anon.Theme]]

type ArrayClassNamesArg = js.Array[ClassNamesArg]

/** 
NOTE: Rewritten from type alias:
{{{
type ClassNamesArg = undefined | null | string | boolean | {[className: string] : boolean | null | undefined} | @storybook/theming.@storybook/theming.ArrayClassNamesArg
}}}
to avoid circular code involving: 
- @storybook/theming.@storybook/theming.ArrayClassNamesArg
- @storybook/theming.@storybook/theming.ClassNamesArg
*/
type ClassNamesArg = js.UndefOr[Null | String | Boolean | (StringDictionary[js.UndefOr[Boolean | Null]]) | Any]

// We need to use this version of Omit as it's distributive (Will preserve unions)
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends any ? std.Pick<T, std.Exclude<keyof T, U>> : never
  }}}
  */
type DistributiveOmit[T, U] = Pick[T, Exclude[/* keyof T */ String, U]]

/**
  * @desc Utility type for getting props type of React component.
  * It takes `defaultProps` into an account - making props with defaults optional.
  */
type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.storybookTheming.storybookThemingStrings.a_, typings.storybookTheming.storybookThemingStrings.abbr, typings.storybookTheming.storybookThemingStrings.address */ Any */] = LibraryManagedAttributes[C, ComponentProps[C]]

// unpack all here to avoid infinite self-referencing when defining our own JSX namespace
type ReactJSXElement = Element

type ReactJSXElementAttributesProperty = ElementAttributesProperty

type ReactJSXElementChildrenAttribute = ElementChildrenAttribute

type ReactJSXElementClass = ElementClass

type ReactJSXIntrinsicAttributes = IntrinsicAttributes

type ReactJSXIntrinsicClassAttributes[T] = IntrinsicClassAttributes[T]

type ReactJSXIntrinsicElements = IntrinsicElements

type ReactJSXLibraryManagedAttributes[C, P] = LibraryManagedAttributes[C, P]

type Return = StringDictionary[StringDictionary[Value]]

// Definitions by: Junyoung Clare Jang <https://github.com/Ailrun>
// tslint:disable-next-line: no-empty-interface
type Theme = StorybookTheme

type Value = String | Double
