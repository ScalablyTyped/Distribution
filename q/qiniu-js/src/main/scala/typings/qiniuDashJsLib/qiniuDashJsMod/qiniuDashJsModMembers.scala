package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu-js", JSImport.Namespace)
@js.native
object qiniuDashJsModMembers extends js.Object {
  def compressImage(file: stdLib.Blob, options: stdLib.Partial[CompressOptions]): stdLib.Promise[qiniuDashJsLib.Anon_Dist] = js.native
  def createMkFileUrl(url: java.lang.String, size: scala.Double, key: java.lang.String, putExtra: stdLib.Partial[Extra]): java.lang.String = js.native
  def exif(key: java.lang.String, domain: java.lang.String): stdLib.Promise[ExtentInfo] = js.native
  def filterParams(params: js.Any): js.Array[js.Tuple2[java.lang.String, _]] = js.native
  def getHeadersForChunkUpload(token: java.lang.String): Headers = js.native
  def getHeadersForMkFile(token: java.lang.String): Headers = js.native
  def getUploadUrl(config: stdLib.Partial[Config], token: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def imageInfo(key: java.lang.String, domain: java.lang.String): stdLib.Promise[ImageInfo] = js.native
  def imageMogr2(optoins: stdLib.Partial[ImageMogr2Options], key: java.lang.String, domain: java.lang.String): java.lang.String = js.native
  def imageView2(options: stdLib.Partial[ImageView2Options], key: java.lang.String, domain: java.lang.String): java.lang.String = js.native
  def pipeline(
    fos: js.Array[
      WaterMarkFopOptions1 | WaterMarkFopOptions2 | ImageView2FopOptions | ImageMogr2FopOptions
    ],
    key: java.lang.String,
    domain: java.lang.String
  ): java.lang.String = js.native
  def upload(
    file: stdLib.Blob,
    key: java.lang.String,
    token: java.lang.String,
    putExtra: stdLib.Partial[Extra],
    config: stdLib.Partial[Config]
  ): Observable = js.native
  def upload(
    file: stdLib.Blob,
    key: js.UndefOr[scala.Nothing],
    token: java.lang.String,
    putExtra: stdLib.Partial[Extra],
    config: stdLib.Partial[Config]
  ): Observable = js.native
  def upload(
    file: stdLib.Blob,
    key: scala.Null,
    token: java.lang.String,
    putExtra: stdLib.Partial[Extra],
    config: stdLib.Partial[Config]
  ): Observable = js.native
  def watermark(options: WaterMarkOptions1): java.lang.String = js.native
  def watermark(options: WaterMarkOptions1, key: java.lang.String): java.lang.String = js.native
  def watermark(options: WaterMarkOptions1, key: java.lang.String, domain: java.lang.String): java.lang.String = js.native
  def watermark(options: WaterMarkOptions2): java.lang.String = js.native
  def watermark(options: WaterMarkOptions2, key: java.lang.String): java.lang.String = js.native
  def watermark(options: WaterMarkOptions2, key: java.lang.String, domain: java.lang.String): java.lang.String = js.native
}

