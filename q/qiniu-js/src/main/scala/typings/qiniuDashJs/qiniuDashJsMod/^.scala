package typings.qiniuDashJs.qiniuDashJsMod

import typings.qiniuDashJs.Anon_Dist
import typings.std.Blob
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compressImage(file: Blob, options: Partial[CompressOptions]): js.Promise[Anon_Dist] = js.native
  def createMkFileUrl(url: String, size: Double, key: String, putExtra: Partial[Extra]): String = js.native
  def exif(key: String, domain: String): js.Promise[ExtentInfo] = js.native
  def filterParams(params: js.Any): js.Array[js.Tuple2[String, _]] = js.native
  def getHeadersForChunkUpload(token: String): Headers = js.native
  def getHeadersForMkFile(token: String): Headers = js.native
  def getUploadUrl(config: Partial[Config], token: String): js.Promise[String] = js.native
  def imageInfo(key: String, domain: String): js.Promise[ImageInfo] = js.native
  def imageMogr2(optoins: Partial[ImageMogr2Options], key: String, domain: String): String = js.native
  def imageView2(options: Partial[ImageView2Options], key: String, domain: String): String = js.native
  def pipeline(
    fos: js.Array[
      WaterMarkFopOptions1 | WaterMarkFopOptions2 | ImageView2FopOptions | ImageMogr2FopOptions
    ],
    key: String,
    domain: String
  ): String = js.native
  def upload(
    file: Blob,
    key: js.UndefOr[scala.Nothing],
    token: String,
    putExtra: Partial[Extra],
    config: Partial[Config]
  ): Observable = js.native
  def upload(file: Blob, key: String, token: String, putExtra: Partial[Extra], config: Partial[Config]): Observable = js.native
  def upload(file: Blob, key: Null, token: String, putExtra: Partial[Extra], config: Partial[Config]): Observable = js.native
  def watermark(options: WaterMarkOptions1): String = js.native
  def watermark(options: WaterMarkOptions1, key: String): String = js.native
  def watermark(options: WaterMarkOptions1, key: String, domain: String): String = js.native
  def watermark(options: WaterMarkOptions2): String = js.native
  def watermark(options: WaterMarkOptions2, key: String): String = js.native
  def watermark(options: WaterMarkOptions2, key: String, domain: String): String = js.native
}

