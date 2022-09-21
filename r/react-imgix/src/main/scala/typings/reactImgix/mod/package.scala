package typings.reactImgix.mod

import typings.react.mod.Component
import typings.react.mod.FunctionComponent
import typings.react.mod.ImgHTMLAttributes
import typings.react.mod.PropsWithChildren
import typings.react.mod.SourceHTMLAttributes
import typings.reactImgix.mod.^
import typings.std.HTMLImageElement
import typings.std.HTMLSourceElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Background: FunctionComponent[PropsWithChildren[BackgroundProps]] = ^.asInstanceOf[js.Dynamic].selectDynamic("Background").asInstanceOf[FunctionComponent[PropsWithChildren[BackgroundProps]]]

inline def buildURL(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any]).asInstanceOf[String]
inline def buildURL(src: String, imgixParams: Unit, options: SharedImgixAndSourceProps): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildURL(src: String, imgixParams: ImgixParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildURL(src: String, imgixParams: ImgixParams, options: SharedImgixAndSourceProps): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

type Imgix = Component[SharedImgixAndSourceProps, js.Object, Any]

type ImgixHTMLAttributes = ImgHTMLAttributes[HTMLImageElement] | SourceHTMLAttributes[HTMLSourceElement] | (Record[String, String])

type ImgixParamType = String | Double | Boolean
