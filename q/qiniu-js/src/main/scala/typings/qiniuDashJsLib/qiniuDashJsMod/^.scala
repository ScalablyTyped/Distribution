package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compressImage(file: stdLib.Blob, options: stdLib.Partial[qiniuDashJsLib.qiniuDashJsMod.CompressOptions]): js.Promise[qiniuDashJsLib.Anon_Dist] = js.native
  def createMkFileUrl(
    url: java.lang.String,
    size: scala.Double,
    key: java.lang.String,
    putExtra: stdLib.Partial[qiniuDashJsLib.qiniuDashJsMod.Extra]
  ): java.lang.String = js.native
  def exif(key: java.lang.String, domain: java.lang.String): js.Promise[qiniuDashJsLib.qiniuDashJsMod.ExtentInfo] = js.native
  def filterParams(params: js.Any): js.Array[js.Tuple2[java.lang.String, _]] = js.native
  def getHeadersForChunkUpload(token: java.lang.String): qiniuDashJsLib.qiniuDashJsMod.Headers = js.native
  def getHeadersForMkFile(token: java.lang.String): qiniuDashJsLib.qiniuDashJsMod.Headers = js.native
  def getUploadUrl(config: stdLib.Partial[qiniuDashJsLib.qiniuDashJsMod.Config], token: java.lang.String): js.Promise[java.lang.String] = js.native
  def imageInfo(key: java.lang.String, domain: java.lang.String): js.Promise[qiniuDashJsLib.qiniuDashJsMod.ImageInfo] = js.native
  def imageMogr2(
    optoins: stdLib.Partial[qiniuDashJsLib.qiniuDashJsMod.ImageMogr2Options],
    key: java.lang.String,
    domain: java.lang.String
  ): java.lang.String = js.native
  def imageView2(
    options: stdLib.Partial[qiniuDashJsLib.qiniuDashJsMod.ImageView2Options],
    key: java.lang.String,
    domain: java.lang.String
  ): java.lang.String = js.native
  def pipeline(
    fos: js.Array[
      qiniuDashJsLib.qiniuDashJsMod.WaterMarkFopOptions1 | qiniuDashJsLib.qiniuDashJsMod.WaterMarkFopOptions2 | qiniuDashJsLib.qiniuDashJsMod.ImageView2FopOptions | qiniuDashJsLib.qiniuDashJsMod.ImageMogr2FopOptions
    ],
    key: java.lang.String,
    domain: java.lang.String
  ): java.lang.String = js.native
  def upload(
    file: stdLib.Blob,
    key: java.lang.String,
    token: java.lang.String,
    putExtra: stdLib.Partial[qiniuDashJsLib.qiniuDashJsMod.Extra],
    config: stdLib.Partial[qiniuDashJsLib.qiniuDashJsMod.Config]
  ): qiniuDashJsLib.qiniuDashJsMod.Observable = js.native
  def upload(
    file: stdLib.Blob,
    key: js.UndefOr[scala.Nothing],
    token: java.lang.String,
    putExtra: stdLib.Partial[qiniuDashJsLib.qiniuDashJsMod.Extra],
    config: stdLib.Partial[qiniuDashJsLib.qiniuDashJsMod.Config]
  ): qiniuDashJsLib.qiniuDashJsMod.Observable = js.native
  def upload(
    file: stdLib.Blob,
    key: scala.Null,
    token: java.lang.String,
    putExtra: stdLib.Partial[qiniuDashJsLib.qiniuDashJsMod.Extra],
    config: stdLib.Partial[qiniuDashJsLib.qiniuDashJsMod.Config]
  ): qiniuDashJsLib.qiniuDashJsMod.Observable = js.native
  def watermark(options: qiniuDashJsLib.qiniuDashJsMod.WaterMarkOptions1): java.lang.String = js.native
  def watermark(options: qiniuDashJsLib.qiniuDashJsMod.WaterMarkOptions1, key: java.lang.String): java.lang.String = js.native
  def watermark(
    options: qiniuDashJsLib.qiniuDashJsMod.WaterMarkOptions1,
    key: java.lang.String,
    domain: java.lang.String
  ): java.lang.String = js.native
  def watermark(options: qiniuDashJsLib.qiniuDashJsMod.WaterMarkOptions2): java.lang.String = js.native
  def watermark(options: qiniuDashJsLib.qiniuDashJsMod.WaterMarkOptions2, key: java.lang.String): java.lang.String = js.native
  def watermark(
    options: qiniuDashJsLib.qiniuDashJsMod.WaterMarkOptions2,
    key: java.lang.String,
    domain: java.lang.String
  ): java.lang.String = js.native
}

