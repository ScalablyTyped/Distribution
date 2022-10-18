package typings.reactNativeSvg.mod

import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNativeSvg.libTypescriptLocalSvgMod.LocalProps
import typings.reactNativeSvg.libTypescriptXmlMod.AstProps
import typings.reactNativeSvg.libTypescriptXmlMod.JsxAST
import typings.reactNativeSvg.libTypescriptXmlMod.Middleware
import typings.reactNativeSvg.libTypescriptXmlMod.UriProps
import typings.reactNativeSvg.libTypescriptXmlMod.XmlProps
import typings.reactNativeSvg.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def LocalSvg(props: LocalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LocalSvg")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def RNSVGCircle: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGCircle").asInstanceOf[ComponentType[Any]]

inline def RNSVGClipPath: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGClipPath").asInstanceOf[ComponentType[Any]]

inline def RNSVGDefs: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGDefs").asInstanceOf[ComponentType[Any]]

inline def RNSVGEllipse: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGEllipse").asInstanceOf[ComponentType[Any]]

inline def RNSVGForeignObject: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGForeignObject").asInstanceOf[ComponentType[Any]]

inline def RNSVGGroup: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGGroup").asInstanceOf[ComponentType[Any]]

inline def RNSVGImage: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGImage").asInstanceOf[ComponentType[Any]]

inline def RNSVGLine: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGLine").asInstanceOf[ComponentType[Any]]

inline def RNSVGLinearGradient: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGLinearGradient").asInstanceOf[ComponentType[Any]]

inline def RNSVGMarker: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGMarker").asInstanceOf[ComponentType[Any]]

inline def RNSVGMask: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGMask").asInstanceOf[ComponentType[Any]]

inline def RNSVGPath: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGPath").asInstanceOf[ComponentType[Any]]

inline def RNSVGPattern: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGPattern").asInstanceOf[ComponentType[Any]]

inline def RNSVGRadialGradient: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGRadialGradient").asInstanceOf[ComponentType[Any]]

inline def RNSVGRect: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGRect").asInstanceOf[ComponentType[Any]]

inline def RNSVGSvg: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGSvg").asInstanceOf[ComponentType[Any]]

inline def RNSVGSymbol: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGSymbol").asInstanceOf[ComponentType[Any]]

inline def RNSVGTSpan: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGTSpan").asInstanceOf[ComponentType[Any]]

inline def RNSVGText: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGText").asInstanceOf[ComponentType[Any]]

inline def RNSVGTextPath: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGTextPath").asInstanceOf[ComponentType[Any]]

inline def RNSVGUse: ComponentType[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("RNSVGUse").asInstanceOf[ComponentType[Any]]

inline def SvgAst(hasAstOverride: AstProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("SvgAst")(hasAstOverride.asInstanceOf[js.Any]).asInstanceOf[Element | Null]

inline def SvgCss(props: XmlProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SvgCss")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def SvgCssUri(props: UriProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SvgCssUri")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def SvgUri(props: UriProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SvgUri")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def SvgXml(props: XmlProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("SvgXml")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]

inline def inlineStyles: Middleware = ^.asInstanceOf[js.Dynamic].selectDynamic("inlineStyles").asInstanceOf[Middleware]

inline def loadLocalRawResource: js.Function1[/* source */ ImageSourcePropType, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("loadLocalRawResource").asInstanceOf[js.Function1[/* source */ ImageSourcePropType, js.Promise[Any]]]

inline def parse(source: String): JsxAST | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[JsxAST | Null]
inline def parse(source: String, middleware: Middleware): JsxAST | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[JsxAST | Null]
