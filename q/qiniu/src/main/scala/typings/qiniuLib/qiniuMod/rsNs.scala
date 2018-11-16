package typings
package qiniuLib.qiniuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "rs")
@js.native
object rsNs extends js.Object {
  @js.native
  class BucketManager () extends js.Object {
    def this(mac: qiniuLib.qiniuMod.authNs.digestNs.Mac) = this()
    def this(mac: qiniuLib.qiniuMod.authNs.digestNs.Mac, config: qiniuLib.qiniuMod.confNs.Config) = this()
    var config: qiniuLib.qiniuMod.confNs.Config = js.native
    var mac: qiniuLib.qiniuMod.authNs.digestNs.Mac = js.native
    /**
             * 批量文件管理请求，支持stat，chgm，chtype，delete，copy，move
             * @param operations
             * @param callback
             */
    def batch(operations: js.Any, callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
    /**
             * 修改文件的Headers
             * @see TODO
             *
             * @param bucket 空间名称
             * @param key 文件名称
             * @param headers Headers对象
             * @param callback
             */
    def changeHeaders(
      bucket: java.lang.String,
      key: java.lang.String,
      headers: ScalablyTyped.runtime.StringDictionary[java.lang.String],
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 修改文件的类型
             * @see https://developer.qiniu.com/kodo/api/1252/chgm
             *
             * @param bucket 空间名称
             * @param key 文件名称
             * @param newMime 新文件类型
             * @param callback
             */
    def changeMime(
      bucket: java.lang.String,
      key: java.lang.String,
      newMime: java.lang.String,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 修改文件的存储类型
             * @see https://developer.qiniu.com/kodo/api/3710/modify-the-file-type
             *
             * @param bucket 空间名称
             * @param key 文件名称
             * @param newType 0 表示标准存储；1 表示低频存储。
             * @param callback
             */
    def changeType(
      bucket: java.lang.String,
      key: java.lang.String,
      newType: scala.Double,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 复制文件
             * @see https://developer.qiniu.com/kodo/api/1254/copy
             *
             * @param srcBucket 源空间名称
             * @param srcKey 源文件名称
             * @param destBucket 目标空间名称
             * @param destKey 目标文件名称
             * @param options
             * @param callback
             */
    def copy(
      srcBucket: java.lang.String,
      srcKey: java.lang.String,
      destBucket: java.lang.String,
      destKey: java.lang.String,
      options: qiniuLib.Anon_Force,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 复制文件
             * @see https://developer.qiniu.com/kodo/api/1254/copy
             *
             * @param srcBucket 源空间名称
             * @param srcKey 源文件名称
             * @param destBucket 目标空间名称
             * @param destKey 目标文件名称
             * @param options
             * @param callback
             */
    def copy(
      srcBucket: java.lang.String,
      srcKey: java.lang.String,
      destBucket: java.lang.String,
      destKey: java.lang.String,
      options: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 删除资源
             * @see https://developer.qiniu.com/kodo/api/1257/delete
             *
             * @param bucket 空间名称
             * @param key 文件名称
             * @param callback
             */
    def delete(bucket: java.lang.String, key: java.lang.String, callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
    /**
             * 更新文件的生命周期
             * @see https://developer.qiniu.com/kodo/api/1732/update-file-lifecycle
             *
             * @param bucket 空间名称
             * @param key 文件名称
             * @param days 有效期天数
             * @param callback
             */
    def deleteAfterDays(
      bucket: java.lang.String,
      key: java.lang.String,
      days: scala.Double,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 抓取资源
             * @see https://developer.qiniu.com/kodo/api/1263/fetch
             *
             * @param resUrl 资源链接
             * @param bucket 空间名称
             * @param key 文件名称
             * @param callback
             */
    def fetch(
      resUrl: java.lang.String,
      bucket: java.lang.String,
      key: java.lang.String,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 设置空间镜像源
             * @see https://developer.qiniu.com/kodo/api/1370/mirror
             *
             * @param bucket 空间名称
             * @param srcSiteUrl 镜像源地址
             * @param srcHost 镜像Host
             * @param callback
             */
    def image(
      bucket: java.lang.String,
      srcSiteUrl: java.lang.String,
      srcHost: java.lang.String,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 获取指定前缀的文件列表
             * @see https://developer.qiniu.com/kodo/api/1284/list
             *
             * @param bucket 空间名称
             * @param options 列举操作的可选参数
             * @param callback
             */
    def listPrefix(bucket: java.lang.String, options: ListPrefixOptions, callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
    /**
             * 获取指定前缀的文件列表
             * @see https://developer.qiniu.com/kodo/api/1284/list
             *
             * @param bucket 空间名称
             * @param options 列举操作的可选参数
             * @param callback
             */
    def listPrefix(bucket: java.lang.String, options: scala.Null, callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
    /**
             * 移动或重命名文件，当bucketSrc==bucketDest相同的时候，就是重命名文件操作
             * @see https://developer.qiniu.com/kodo/api/1288/move
             *
             * @param srcBucket 源空间名称
             * @param srcKey 源文件名称
             * @param destBucket 目标空间名称
             * @param destKey 目标文件名称
             * @param options
             * @param callback
             */
    def move(
      srcBucket: java.lang.String,
      srcKey: java.lang.String,
      destBucket: java.lang.String,
      destKey: java.lang.String,
      options: qiniuLib.Anon_Force,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 移动或重命名文件，当bucketSrc==bucketDest相同的时候，就是重命名文件操作
             * @see https://developer.qiniu.com/kodo/api/1288/move
             *
             * @param srcBucket 源空间名称
             * @param srcKey 源文件名称
             * @param destBucket 目标空间名称
             * @param destKey 目标文件名称
             * @param options
             * @param callback
             */
    def move(
      srcBucket: java.lang.String,
      srcKey: java.lang.String,
      destBucket: java.lang.String,
      destKey: java.lang.String,
      options: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 更新镜像副本
             * @see https://developer.qiniu.com/kodo/api/1293/prefetch
             *
             * @param bucket 空间名称
             * @param key 文件名称
             * @param callback
             */
    def prefetch(bucket: java.lang.String, key: java.lang.String, callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
    /**
             * 获取私有空间的下载链接
             * @param domain 空间绑定的域名，比如以http或https开头
             * @param fileName 原始文件名
             * @param deadline 文件有效期时间戳（单位秒）
             */
    def privateDownloadUrl(domain: java.lang.String, fileName: java.lang.String, deadline: scala.Double): java.lang.String = js.native
    /**
             * 获取公开空间的下载链接
             * @param domain 空间绑定的域名，比如以http或https开头
             * @param fileName 原始文件名
             */
    def publicDownloadUrl(domain: java.lang.String, fileName: java.lang.String): java.lang.String = js.native
    /**
             * 获取资源信息
             * @see https://developer.qiniu.com/kodo/api/1308/stat
             *
             * @param bucket 空间名称
             * @param key 文件名称
             * @param callback
             */
    def stat(bucket: java.lang.String, key: java.lang.String, callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
    /**
             * 取消设置空间镜像源
             * @see https://developer.qiniu.com/kodo/api/1370/mirror
             *
             * @param bucket 空间名称
             * @param callback
             */
    def unimage(bucket: java.lang.String, callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
  }
  
  
  trait ListPrefixOptions extends js.Object {
    /**
             * 指定目录分隔符
             */
    var delimiter: js.UndefOr[java.lang.String] = js.undefined
    /**
             * 每次返回的最大列举文件数量
             */
    var limit: js.UndefOr[scala.Double] = js.undefined
    /**
             * 上一次列举返回的位置标记
             */
    var marker: js.UndefOr[js.Any] = js.undefined
    /**
             * 列举的文件前缀
             */
    var prefix: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  class PutPolicy () extends js.Object {
    def this(options: PutPolicyOptions) = this()
    def getFlags(): js.Any = js.native
    def uploadToken(): java.lang.String = js.native
    def uploadToken(mac: qiniuLib.qiniuMod.authNs.digestNs.Mac): java.lang.String = js.native
  }
  
  
  trait PutPolicyOptions extends js.Object {
    var callbackBody: js.UndefOr[java.lang.String] = js.undefined
    var callbackBodyType: js.UndefOr[java.lang.String] = js.undefined
    var callbackFetchKey: js.UndefOr[scala.Double] = js.undefined
    var callbackHost: js.UndefOr[java.lang.String] = js.undefined
    var callbackUrl: js.UndefOr[java.lang.String] = js.undefined
    var deleteAfterDays: js.UndefOr[scala.Double] = js.undefined
    var detectMime: js.UndefOr[scala.Double] = js.undefined
    var endUser: js.UndefOr[java.lang.String] = js.undefined
    var expires: js.UndefOr[scala.Double] = js.undefined
    var fileType: js.UndefOr[scala.Double] = js.undefined
    var fsizeLimit: js.UndefOr[scala.Double] = js.undefined
    var fsizeMin: js.UndefOr[scala.Double] = js.undefined
    var insertOnly: js.UndefOr[scala.Double] = js.undefined
    var isPrefixalScope: js.UndefOr[scala.Double] = js.undefined
    var mimeLimit: js.UndefOr[java.lang.String] = js.undefined
    var persistentNotifyUrl: js.UndefOr[java.lang.String] = js.undefined
    var persistentOps: js.UndefOr[java.lang.String] = js.undefined
    var persistentPipeline: js.UndefOr[java.lang.String] = js.undefined
    var returnBody: js.UndefOr[java.lang.String] = js.undefined
    var returnUrl: js.UndefOr[java.lang.String] = js.undefined
    var saveKey: js.UndefOr[java.lang.String] = js.undefined
    var scope: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
       *
       * @param bucket
       * @param key
       * @param headers
       */
  def changeHeadersOp(
    bucket: java.lang.String,
    key: java.lang.String,
    headers: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  ): java.lang.String = js.native
  /**
       *
       * @param bucket
       * @param key
       * @param newMime
       */
  def changeMimeOp(bucket: java.lang.String, key: java.lang.String, newMime: java.lang.String): java.lang.String = js.native
  /**
       *
       * @param bucket
       * @param key
       * @param newType
       */
  def changeTypeOp(bucket: java.lang.String, key: java.lang.String, newType: scala.Double): java.lang.String = js.native
  /**
       *
       * @param srcBucket
       * @param srcKey
       * @param destBucket
       * @param destKey
       * @param options
       */
  def copyOp(
    srcBucket: java.lang.String,
    srcKey: java.lang.String,
    destBucket: java.lang.String,
    destKey: java.lang.String
  ): java.lang.String = js.native
  /**
       *
       * @param srcBucket
       * @param srcKey
       * @param destBucket
       * @param destKey
       * @param options
       */
  def copyOp(
    srcBucket: java.lang.String,
    srcKey: java.lang.String,
    destBucket: java.lang.String,
    destKey: java.lang.String,
    options: qiniuLib.Anon_Force
  ): java.lang.String = js.native
  /**
       *
       * @param bucket
       * @param key
       * @param days
       */
  def deleteAfterDaysOp(bucket: java.lang.String, key: java.lang.String, days: scala.Double): java.lang.String = js.native
  /**
       *
       * @param bucket
       * @param key
       */
  def deleteOp(bucket: java.lang.String, key: java.lang.String): java.lang.String = js.native
  /**
       *
       * @param srcBucket
       * @param srcKey
       * @param destBucket
       * @param destKey
       * @param options
       */
  def moveOp(
    srcBucket: java.lang.String,
    srcKey: java.lang.String,
    destBucket: java.lang.String,
    destKey: java.lang.String
  ): java.lang.String = js.native
  /**
       *
       * @param srcBucket
       * @param srcKey
       * @param destBucket
       * @param destKey
       * @param options
       */
  def moveOp(
    srcBucket: java.lang.String,
    srcKey: java.lang.String,
    destBucket: java.lang.String,
    destKey: java.lang.String,
    options: qiniuLib.Anon_Force
  ): java.lang.String = js.native
  /**
       *
       * @param bucket
       * @param key
       */
  def statOp(bucket: java.lang.String, key: java.lang.String): java.lang.String = js.native
}

