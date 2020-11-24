package typings.qiniu.mod.rs

import org.scalablytyped.runtime.StringDictionary
import typings.qiniu.anon.Force
import typings.qiniu.mod.auth.digest.Mac
import typings.qiniu.mod.callback
import typings.qiniu.mod.conf.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("qiniu", "rs.BucketManager")
@js.native
class BucketManager () extends js.Object {
  def this(mac: Mac) = this()
  def this(mac: js.UndefOr[scala.Nothing], config: Config) = this()
  def this(mac: Mac, config: Config) = this()
  
  /**
    * 批量文件管理请求，支持stat，chgm，chtype，delete，copy，move
    * @param operations
    * @param callback
    */
  def batch(operations: js.Any, callback: callback): Unit = js.native
  
  /**
    * 修改文件的Headers
    * @see TODO
    *
    * @param bucket 空间名称
    * @param key 文件名称
    * @param headers Headers对象
    * @param callback
    */
  def changeHeaders(bucket: String, key: String, headers: StringDictionary[String], callback: callback): Unit = js.native
  
  /**
    * 修改文件的类型
    * @see https://developer.qiniu.com/kodo/api/1252/chgm
    *
    * @param bucket 空间名称
    * @param key 文件名称
    * @param newMime 新文件类型
    * @param callback
    */
  def changeMime(bucket: String, key: String, newMime: String, callback: callback): Unit = js.native
  
  /**
    * 修改文件的存储类型
    * @see https://developer.qiniu.com/kodo/api/3710/modify-the-file-type
    *
    * @param bucket 空间名称
    * @param key 文件名称
    * @param newType 0 表示标准存储；1 表示低频存储。
    * @param callback
    */
  def changeType(bucket: String, key: String, newType: Double, callback: callback): Unit = js.native
  
  var config: Config = js.native
  
  def copy(
    srcBucket: String,
    srcKey: String,
    destBucket: String,
    destKey: String,
    options: Null,
    callback: callback
  ): Unit = js.native
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
    srcBucket: String,
    srcKey: String,
    destBucket: String,
    destKey: String,
    options: Force,
    callback: callback
  ): Unit = js.native
  
  /**
    * 删除资源
    * @see https://developer.qiniu.com/kodo/api/1257/delete
    *
    * @param bucket 空间名称
    * @param key 文件名称
    * @param callback
    */
  def delete(bucket: String, key: String, callback: callback): Unit = js.native
  
  /**
    * 更新文件的生命周期
    * @see https://developer.qiniu.com/kodo/api/1732/update-file-lifecycle
    *
    * @param bucket 空间名称
    * @param key 文件名称
    * @param days 有效期天数
    * @param callback
    */
  def deleteAfterDays(bucket: String, key: String, days: Double, callback: callback): Unit = js.native
  
  /**
    * 抓取资源
    * @see https://developer.qiniu.com/kodo/api/1263/fetch
    *
    * @param resUrl 资源链接
    * @param bucket 空间名称
    * @param key 文件名称
    * @param callback
    */
  def fetch(resUrl: String, bucket: String, key: String, callback: callback): Unit = js.native
  
  /**
    * 设置空间镜像源
    * @see https://developer.qiniu.com/kodo/api/1370/mirror
    *
    * @param bucket 空间名称
    * @param srcSiteUrl 镜像源地址
    * @param srcHost 镜像Host
    * @param callback
    */
  def image(bucket: String, srcSiteUrl: String, srcHost: String, callback: callback): Unit = js.native
  
  def listPrefix(bucket: String, options: Null, callback: callback): Unit = js.native
  /**
    * 获取指定前缀的文件列表
    * @see https://developer.qiniu.com/kodo/api/1284/list
    *
    * @param bucket 空间名称
    * @param options 列举操作的可选参数
    * @param callback
    */
  def listPrefix(bucket: String, options: ListPrefixOptions, callback: callback): Unit = js.native
  
  var mac: Mac = js.native
  
  def move(
    srcBucket: String,
    srcKey: String,
    destBucket: String,
    destKey: String,
    options: Null,
    callback: callback
  ): Unit = js.native
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
    srcBucket: String,
    srcKey: String,
    destBucket: String,
    destKey: String,
    options: Force,
    callback: callback
  ): Unit = js.native
  
  /**
    * 更新镜像副本
    * @see https://developer.qiniu.com/kodo/api/1293/prefetch
    *
    * @param bucket 空间名称
    * @param key 文件名称
    * @param callback
    */
  def prefetch(bucket: String, key: String, callback: callback): Unit = js.native
  
  /**
    * 获取私有空间的下载链接
    * @param domain 空间绑定的域名，比如以http或https开头
    * @param fileName 原始文件名
    * @param deadline 文件有效期时间戳（单位秒）
    */
  def privateDownloadUrl(domain: String, fileName: String, deadline: Double): String = js.native
  
  /**
    * 获取公开空间的下载链接
    * @param domain 空间绑定的域名，比如以http或https开头
    * @param fileName 原始文件名
    */
  def publicDownloadUrl(domain: String, fileName: String): String = js.native
  
  /**
    * 获取资源信息
    * @see https://developer.qiniu.com/kodo/api/1308/stat
    *
    * @param bucket 空间名称
    * @param key 文件名称
    * @param callback
    */
  def stat(bucket: String, key: String, callback: callback): Unit = js.native
  
  /**
    * 取消设置空间镜像源
    * @see https://developer.qiniu.com/kodo/api/1370/mirror
    *
    * @param bucket 空间名称
    * @param callback
    */
  def unimage(bucket: String, callback: callback): Unit = js.native
}
