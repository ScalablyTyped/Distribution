package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def compressImage(file: typings.std.Blob, options: typings.qiniuJs.anon.PartialCompressOptions): js.Promise[typings.qiniuJs.anon.Dist] = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compressImage")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.qiniuJs.anon.Dist]]

inline def createMkFileUrl(
  url: java.lang.String,
  size: scala.Double,
  key: java.lang.String,
  putExtra: typings.qiniuJs.anon.PartialExtra
): java.lang.String = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMkFileUrl")(url.asInstanceOf[js.Any], size.asInstanceOf[js.Any], key.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def exif(key: java.lang.String, domain: java.lang.String): js.Promise[typings.qiniuJs.mod.ExtentInfo] = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exif")(key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.qiniuJs.mod.ExtentInfo]]

inline def filterParams(params: js.Any): js.Array[js.Tuple2[java.lang.String, js.Any]] = typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("filterParams")(params.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[java.lang.String, js.Any]]]

inline def getHeadersForChunkUpload(token: java.lang.String): typings.qiniuJs.mod.Headers = typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersForChunkUpload")(token.asInstanceOf[js.Any]).asInstanceOf[typings.qiniuJs.mod.Headers]

inline def getHeadersForMkFile(token: java.lang.String): typings.qiniuJs.mod.Headers = typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersForMkFile")(token.asInstanceOf[js.Any]).asInstanceOf[typings.qiniuJs.mod.Headers]

inline def getUploadUrl(config: typings.qiniuJs.anon.PartialConfig, token: java.lang.String): js.Promise[java.lang.String] = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getUploadUrl")(config.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]

inline def imageInfo(key: java.lang.String, domain: java.lang.String): js.Promise[typings.qiniuJs.mod.ImageInfo_] = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageInfo")(key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.qiniuJs.mod.ImageInfo_]]

inline def imageMogr2(
  optoins: typings.qiniuJs.anon.PartialImageMogr2Options,
  key: java.lang.String,
  domain: java.lang.String
): java.lang.String = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageMogr2")(optoins.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def imageView2(
  options: typings.qiniuJs.anon.PartialImageView2Options,
  key: java.lang.String,
  domain: java.lang.String
): java.lang.String = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageView2")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def pipeline(
  fos: js.Array[
  typings.qiniuJs.mod.WaterMarkFopOptions1 | typings.qiniuJs.mod.WaterMarkFopOptions2 | typings.qiniuJs.mod.ImageView2FopOptions | typings.qiniuJs.mod.ImageMogr2FopOptions
],
  key: java.lang.String,
  domain: java.lang.String
): java.lang.String = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(fos.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def upload(
  file: typings.std.Blob,
  key: java.lang.String,
  token: java.lang.String,
  putExtra: typings.qiniuJs.anon.PartialExtra,
  config: typings.qiniuJs.anon.PartialConfig
): typings.qiniuJs.mod.Observable = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.qiniuJs.mod.Observable]
inline def upload(
  file: typings.std.Blob,
  key: scala.Null,
  token: java.lang.String,
  putExtra: typings.qiniuJs.anon.PartialExtra,
  config: typings.qiniuJs.anon.PartialConfig
): typings.qiniuJs.mod.Observable = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.qiniuJs.mod.Observable]
inline def upload(
  file: typings.std.Blob,
  key: scala.Unit,
  token: java.lang.String,
  putExtra: typings.qiniuJs.anon.PartialExtra,
  config: typings.qiniuJs.anon.PartialConfig
): typings.qiniuJs.mod.Observable = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.qiniuJs.mod.Observable]

inline def watermark(options: typings.qiniuJs.mod.WaterMarkOptions1): java.lang.String = typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def watermark(options: typings.qiniuJs.mod.WaterMarkOptions1, key: java.lang.String): java.lang.String = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def watermark(options: typings.qiniuJs.mod.WaterMarkOptions1, key: java.lang.String, domain: java.lang.String): java.lang.String = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def watermark(options: typings.qiniuJs.mod.WaterMarkOptions1, key: scala.Unit, domain: java.lang.String): java.lang.String = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def watermark(options: typings.qiniuJs.mod.WaterMarkOptions2): java.lang.String = typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def watermark(options: typings.qiniuJs.mod.WaterMarkOptions2, key: java.lang.String): java.lang.String = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def watermark(options: typings.qiniuJs.mod.WaterMarkOptions2, key: java.lang.String, domain: java.lang.String): java.lang.String = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def watermark(options: typings.qiniuJs.mod.WaterMarkOptions2, key: scala.Unit, domain: java.lang.String): java.lang.String = (typings.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String]
