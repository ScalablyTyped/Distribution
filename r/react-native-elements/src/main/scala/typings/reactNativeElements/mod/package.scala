package typings.reactNativeElements.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def ThemeContext: typings.react.mod.Context[typings.reactNativeElements.mod.ThemeProps[js.Object]] = typings.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ThemeContext").asInstanceOf[typings.react.mod.Context[typings.reactNativeElements.mod.ThemeProps[js.Object]]]

@scala.inline
def colors: typings.reactNativeElements.mod.Colors_ = typings.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].selectDynamic("colors").asInstanceOf[typings.reactNativeElements.mod.Colors_]

@scala.inline
def getIconType(`type`: typings.reactNativeElements.mod.IconType): js.Any = typings.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getIconType")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def normalize(size: scala.Double): scala.Double = typings.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(size.asInstanceOf[js.Any]).asInstanceOf[scala.Double]

@scala.inline
def registerCustomIconType(id: java.lang.String, font: js.Any): scala.Unit = (typings.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomIconType")(id.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def withBadge(): js.Function1[
/* WrappedComponent */ typings.react.mod.ComponentType[js.Object], 
typings.react.mod.ComponentType[js.Object]] = typings.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withBadge")().asInstanceOf[js.Function1[
/* WrappedComponent */ typings.react.mod.ComponentType[js.Object], 
typings.react.mod.ComponentType[js.Object]]]
@scala.inline
def withBadge(/**
  * Text value to be displayed by badge
  */
value: js.Function0[typings.react.mod.ReactNode]): js.Function1[
/* WrappedComponent */ typings.react.mod.ComponentType[js.Object], 
typings.react.mod.ComponentType[js.Object]] = typings.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withBadge")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* WrappedComponent */ typings.react.mod.ComponentType[js.Object], 
typings.react.mod.ComponentType[js.Object]]]
@scala.inline
def withBadge(
  /**
  * Text value to be displayed by badge
  */
value: js.Function0[typings.react.mod.ReactNode],
  /**
  * Options to configure the badge
  */
options: typings.reactNativeElements.anon.bottomnumberundefinedleft
): js.Function1[
/* WrappedComponent */ typings.react.mod.ComponentType[js.Object], 
typings.react.mod.ComponentType[js.Object]] = (typings.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withBadge")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* WrappedComponent */ typings.react.mod.ComponentType[js.Object], 
typings.react.mod.ComponentType[js.Object]]]
@scala.inline
def withBadge(
  /**
  * Text value to be displayed by badge
  */
value: scala.Unit,
  /**
  * Options to configure the badge
  */
options: typings.reactNativeElements.anon.bottomnumberundefinedleft
): js.Function1[
/* WrappedComponent */ typings.react.mod.ComponentType[js.Object], 
typings.react.mod.ComponentType[js.Object]] = (typings.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withBadge")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* WrappedComponent */ typings.react.mod.ComponentType[js.Object], 
typings.react.mod.ComponentType[js.Object]]]
@scala.inline
def withBadge(/**
  * Text value to be displayed by badge
  */
value: typings.react.mod.ReactNode): js.Function1[
/* WrappedComponent */ typings.react.mod.ComponentType[js.Object], 
typings.react.mod.ComponentType[js.Object]] = typings.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withBadge")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* WrappedComponent */ typings.react.mod.ComponentType[js.Object], 
typings.react.mod.ComponentType[js.Object]]]
@scala.inline
def withBadge(
  /**
  * Text value to be displayed by badge
  */
value: typings.react.mod.ReactNode,
  /**
  * Options to configure the badge
  */
options: typings.reactNativeElements.anon.bottomnumberundefinedleft
): js.Function1[
/* WrappedComponent */ typings.react.mod.ComponentType[js.Object], 
typings.react.mod.ComponentType[js.Object]] = (typings.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withBadge")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* WrappedComponent */ typings.react.mod.ComponentType[js.Object], 
typings.react.mod.ComponentType[js.Object]]]

@scala.inline
def withTheme[P, T](component: typings.react.mod.ComponentType[P & typings.reactNativeElements.mod.ThemeProps[T]]): typings.react.mod.ComponentClass[
typings.std.Omit[
  P, 
  /* keyof react-native-elements.react-native-elements.ThemeProps<T> */ typings.reactNativeElements.reactNativeElementsStrings.theme | typings.reactNativeElements.reactNativeElementsStrings.updateTheme | typings.reactNativeElements.reactNativeElementsStrings.replaceTheme
], 
typings.react.mod.ComponentState] = typings.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentClass[
typings.std.Omit[
  P, 
  /* keyof react-native-elements.react-native-elements.ThemeProps<T> */ typings.reactNativeElements.reactNativeElementsStrings.theme | typings.reactNativeElements.reactNativeElementsStrings.updateTheme | typings.reactNativeElements.reactNativeElementsStrings.replaceTheme
], 
typings.react.mod.ComponentState]]
@scala.inline
def withTheme[P, T](
  component: typings.react.mod.ComponentType[P & typings.reactNativeElements.mod.ThemeProps[T]],
  themeKey: java.lang.String
): typings.react.mod.ComponentClass[
typings.std.Omit[
  P, 
  /* keyof react-native-elements.react-native-elements.ThemeProps<T> */ typings.reactNativeElements.reactNativeElementsStrings.theme | typings.reactNativeElements.reactNativeElementsStrings.updateTheme | typings.reactNativeElements.reactNativeElementsStrings.replaceTheme
], 
typings.react.mod.ComponentState] = (typings.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(component.asInstanceOf[js.Any], themeKey.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ComponentClass[
typings.std.Omit[
  P, 
  /* keyof react-native-elements.react-native-elements.ThemeProps<T> */ typings.reactNativeElements.reactNativeElementsStrings.theme | typings.reactNativeElements.reactNativeElementsStrings.updateTheme | typings.reactNativeElements.reactNativeElementsStrings.replaceTheme
], 
typings.react.mod.ComponentState]]

type DividerProps = typings.reactNative.mod.ViewProperties

/* Rewritten from type alias, can be one of: 
  - typings.react.mod.ReactElement
  - typings.reactNativeElements.mod.TextProps
  - typings.reactNativeElements.mod.HeaderIcon
*/
type HeaderSubComponent = typings.reactNativeElements.mod._HeaderSubComponent | typings.react.mod.ReactElement

type IconNode = scala.Boolean | typings.react.mod.ReactElement | typings.reactNativeElements.anon.PartialIconProps

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeElements.reactNativeElementsStrings.material
  - typings.reactNativeElements.reactNativeElementsStrings.`material-community`
  - typings.reactNativeElements.reactNativeElementsStrings.`simple-line-icon`
  - typings.reactNativeElements.reactNativeElementsStrings.zocial
  - typings.reactNativeElements.reactNativeElementsStrings.`font-awesome`
  - typings.reactNativeElements.reactNativeElementsStrings.octicon
  - typings.reactNativeElements.reactNativeElementsStrings.ionicon
  - typings.reactNativeElements.reactNativeElementsStrings.foundation
  - typings.reactNativeElements.reactNativeElementsStrings.evilicon
  - typings.reactNativeElements.reactNativeElementsStrings.entypo
  - typings.reactNativeElements.reactNativeElementsStrings.antdesign
  - typings.reactNativeElements.reactNativeElementsStrings.`font-awesome-5`
  - java.lang.String
*/
type IconType = typings.reactNativeElements.mod._IconType | java.lang.String

type RecursivePartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-elements.react-native-elements.RecursivePartial<T[P]> * / object}
  */ typings.reactNativeElements.reactNativeElementsStrings.RecursivePartial & org.scalablytyped.runtime.TopLevel[js.Any]

type ReplaceTheme = js.Function1[
/* updates */ typings.reactNativeElements.anon.RecursivePartialFullTheme, 
scala.Unit]

type Theme[T] = typings.reactNativeElements.anon.PartialFullTheme & T

type TouchableComponent = typings.reactNative.mod.TouchableHighlightProps

type UpdateTheme = js.Function1[
/* updates */ typings.reactNativeElements.anon.RecursivePartialFullTheme, 
scala.Unit]
