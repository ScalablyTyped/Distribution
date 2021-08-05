package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Background: typings.react.mod.FunctionComponent[typings.react.mod.PropsWithChildren[typings.reactImgix.mod.BackgroundProps]] = typings.reactImgix.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Background").asInstanceOf[typings.react.mod.FunctionComponent[typings.react.mod.PropsWithChildren[typings.reactImgix.mod.BackgroundProps]]]

inline def buildURL(src: java.lang.String): java.lang.String = typings.reactImgix.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def buildURL(
  src: java.lang.String,
  imgixParams: scala.Unit,
  options: typings.reactImgix.mod.SharedImigixAndSourceProps
): java.lang.String = (typings.reactImgix.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def buildURL(src: java.lang.String, imgixParams: typings.reactImgix.mod.ImigixParams): java.lang.String = (typings.reactImgix.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def buildURL(
  src: java.lang.String,
  imgixParams: typings.reactImgix.mod.ImigixParams,
  options: typings.reactImgix.mod.SharedImigixAndSourceProps
): java.lang.String = (typings.reactImgix.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

type Imgix = typings.react.mod.Component[typings.reactImgix.mod.SharedImigixAndSourceProps, js.Object, js.Any]

type ImgixHTMLAttributes = typings.react.mod.ImgHTMLAttributes[typings.std.HTMLImageElement] | typings.react.mod.SourceHTMLAttributes[typings.std.HTMLSourceElement] | (typings.std.Record[java.lang.String, java.lang.String])

type ImgixParamType = java.lang.String | scala.Double | scala.Boolean
