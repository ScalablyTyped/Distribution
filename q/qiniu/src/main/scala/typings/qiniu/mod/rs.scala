package typings.qiniu.mod

import org.scalablytyped.runtime.StringDictionary
import typings.qiniu.anon.Accesskey
import typings.qiniu.anon.Allowedheader
import typings.qiniu.anon.CallbackUrl
import typings.qiniu.anon.Cond
import typings.qiniu.anon.Deleteafterdays
import typings.qiniu.anon.Force
import typings.qiniu.mod.auth.digest.Mac
import typings.qiniu.mod.conf.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rs {
  
  @JSImport("qiniu", "rs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("qiniu", "rs.BucketManager")
  @js.native
  open class BucketManager () extends StObject {
    def this(mac: Mac) = this()
    def this(mac: Unit, config: Config) = this()
    def this(mac: Mac, config: Config) = this()
    
    /**
      * 批量文件管理请求，支持stat，chgm，chtype，delete，copy，move
      * @param operations
      * @param callback
      */
    def batch(operations: Any, callback: callback): Unit = js.native
    
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
      * 设置文件删除的生命周期
      * @see https://developer.qiniu.com/kodo/api/1732/update-file-lifecycle
      *
      * @param bucket 空间名称
      * @param key 文件名称
      * @param days 有效期天数
      * @param callback
      */
    def deleteAfterDays(bucket: String, key: String, days: Double, callback: callback): Unit = js.native
    
    /**
      * 删除事件通知规则
      * https://developer.qiniu.com/kodo/8610/dev-event-notification
      *
      * @param bucket - 空间名
      * @param name - 规则名称
      * @param callbackFunc - 回调函数
      */
    def deleteBucketEvent(bucket: String, name: String, callbackFunc: callback): Unit = js.native
    
    /** rules/delete 删除 bucket 规则
      * @param bucket - 空间名
      * @param name - 规则名称 bucket 内唯一，长度小于50，不能为空，只能为字母、数字、下划线
      * @param callbackFunc - 回调函数
      */
    def deleteBucketLifecycleRule(bucket: String, name: String, callbackFunc: callback): Unit = js.native
    
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
      * 获取事件通知规则
      * https://developer.qiniu.com/kodo/8610/dev-event-notification
      *
      * @param bucket - 空间名
      * @param callbackFunc - 回调函数
      */
    def getBucketEvent(bucket: String, callbackFunc: callback): Unit = js.native
    
    /** rules/get - 获取 bucket 规则
      *  @param bucket - 空间名
      *  @param callbackFunc - 回调函数
      */
    def getBucketLifecycleRule(bucket: String, callbackFunc: callback): Unit = js.native
    
    /**
      * 获取 bucket 的 cors（跨域）规则
      * https://developer.qiniu.com/kodo/8539/set-the-cross-domain-resource-sharing
      * @param bucket - 空间名
      * @param callbackFunc - 回调函数
      */
    def getCorsRules(bucket: String, callbackFunc: callback): Unit = js.native
    
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
      * 添加事件通知
      * https://developer.qiniu.com/kodo/8610/dev-event-notification
      * @param bucket - 空间名
      * @param options - 配置项
      * @param options.name - 规则名称 bucket 内唯一，长度小于50，不能为空，只能为字母、数字、下划线
      * @param options.event - 事件类型，接受数组设置多个
      * @param options.callbackUrl - 事件通知回调 URL，接受数组设置多个，失败依次重试
      * @param options.prefix - 可选，文件配置的前缀
      * @param options.suffix - 可选，文件配置的后缀
      * @param options.access_key - 可选，设置的话会对通知请求用对应的ak、sk进行签名
      * @param options.host - 可选，通知请求的host
      * @param callbackFunc - 回调函数
      */
    def putBucketEvent(bucket: String, options: Accesskey, callbackFunc: callback): Unit = js.native
    
    /**
      * rules/add 增加 bucket 规则
      *
      * @param bucket - 空间名
      *
      * @param options - 配置项
      * @param options.name - 规则名称 bucket 内唯一，长度小于50，不能为空，只能为字母、数字、下划线
      * @param options.prefix - 同一个 bucket 里面前缀不能重复
      * @param options.to_line_after_days - 指定文件上传多少天后转低频存储。指定为0表示不转低频存储，小于0表示上传的文件立即变低频存储
      * @param options.to_archive_after_days - 指定文件上传多少天后转归档存储。指定为0表示不转归档存储，小于0表示上传的文件立即变归档存储
      * @param options.to_deep_archive_after_days - 指定文件上传多少天后转深度归档存储。指定为0表示不转深度归档存储，小于0表示上传的文件立即变深度归档存储
      * @param options.delete_after_days - 指定上传文件多少天后删除，指定为0表示不删除，大于0表示多少天后删除
      * @param options.history_delete_after_days - 指定文件成为历史版本多少天后删除，指定为0表示不删除，大于0表示多少天后删除
      * @param options.history_to_line_after_days - 指定文件成为历史版本多少天后转低频存储。指定为0表示不转低频存储
      *
      * @param callbackFunc - 回调函数
      */
    def putBucketLifecycleRule(bucket: String, options: Deleteafterdays, callbackFunc: callback): Unit = js.native
    
    /**
      * 设置 bucket 的 cors（跨域）规则
      * https://developer.qiniu.com/kodo/8539/set-the-cross-domain-resource-sharing
      * @param bucket - 空间名
      * @param body - 规则配置
      * @param body[].allowed_origin - 允许的域名
      * @param body[].allowed_method - 允许的请求方法；大小写不敏感
      * @param body[].allowed_header - 可选，允许的 header；默认不允许任何 header；大小写不敏感
      * @param body[].exposed_header - 可选，暴露的 header；默认 X-Log, X-Reqid；大小写不敏感
      * @param body[].max_age - 可选，结果可以缓存的时间；默认不缓存
      * @param callbackFunc - 回调函数
      */
    def putCorsRules(bucket: String, body: js.Array[Allowedheader], callbackFunc: callback): Unit = js.native
    
    /**
      * 解冻归档存储文件
      * @param entry
      * @param freezeAfterDays
      * @param callbackFunc
      */
    def restoreAr(entry: String, freezeAfterDays: Double, callbackFunc: callback): Unit = js.native
    
    /**
      * 设置文件的生命周期
      * @param { string } bucket - 空间名称
      * @param { string } key - 文件名称
      * @param { Object } options - 配置项
      * @param { number } options.toIaAfterDays - 多少天后将文件转为低频存储，设置为 -1 表示取消已设置的转低频存储的生命周期规则， 0 表示不修改转低频生命周期规则。
      * @param { number } options.toArchiveAfterDays - 多少天后将文件转为归档存储，设置为 -1 表示取消已设置的转归档存储的生命周期规则， 0 表示不修改转归档生命周期规则。
      * @param { number } options.toDeepArchiveAfterDays - 多少天后将文件转为深度归档存储，设置为 -1 表示取消已设置的转深度归档存储的生命周期规则， 0 表示不修改转深度归档生命周期规则。
      * @param { number } options.deleteAfterDays - 多少天后将文件删除，设置为 -1 表示取消已设置的删除存储的生命周期规则， 0 表示不修改删除存储的生命周期规则。
      * @param { Object } options.cond - 匹配条件，只有条件匹配才会设置成功
      * @param { string } options.cond.hash
      * @param { string } options.cond.mime
      * @param { number } options.cond.fsize
      * @param { number } options.cond.putTime
      * @param { function } callbackFunc - 回调函数
      */
    def setObjectLifeCycle(bucket: String, key: String, options: Cond, callbackFunc: callback): Any = js.native
    
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
    
    /**
      * 更新事件通知
      * https://developer.qiniu.com/kodo/8610/dev-event-notification
      * @param bucket - 空间名
      * @param options - 配置项
      * @param options.name - 规则名称 bucket 内唯一，长度小于50，不能为空，只能为字母、数字、下划线
      * @param options.event - 事件类型，接受数组设置多个
      * @param options.callbackUrl - 事件通知回调 URL，接受数组设置多个，失败依次重试
      * @param options.prefix - 可选，文件配置的前缀
      * @param options.suffix - 可选，文件配置的后缀
      * @param options.access_key - 可选，设置的话会对通知请求用对应的ak、sk进行签名
      * @param options.host - 可选，通知请求的host
      * @param callbackFunc - 回调函数
      */
    def updateBucketEvent(bucket: String, options: CallbackUrl, callbackFunc: callback): Unit = js.native
    
    /**
      * rules/update 更新 bucket 规则
      *
      * @param bucket - 空间名
      *
      * @param options - 配置项
      * @param options.name - 规则名称 bucket 内唯一，长度小于50，不能为空，只能为字母、数字、下划线
      * @param options.prefix - 同一个 bucket 里面前缀不能重复
      * @param options.to_line_after_days - 指定文件上传多少天后转低频存储。指定为0表示不转低频存储，小于0表示上传的文件立即变低频存储
      * @param options.to_archive_after_days - 指定文件上传多少天后转归档存储。指定为0表示不转归档存储，小于0表示上传的文件立即变归档存储
      * @param options.to_deep_archive_after_days - 指定文件上传多少天后转深度归档存储。指定为0表示不转深度归档存储，小于0表示上传的文件立即变深度归档存储
      * @param options.delete_after_days - 指定上传文件多少天后删除，指定为0表示不删除，大于0表示多少天后删除
      * @param options.history_delete_after_days - 指定文件成为历史版本多少天后删除，指定为0表示不删除，大于0表示多少天后删除
      * @param options.history_to_line_after_days - 指定文件成为历史版本多少天后转低频存储。指定为0表示不转低频存储
      *
      * @param callbackFunc - 回调函数
      */
    def updateBucketLifecycleRule(bucket: String, options: Deleteafterdays, callbackFunc: callback): Unit = js.native
  }
  
  @JSImport("qiniu", "rs.PutPolicy")
  @js.native
  open class PutPolicy () extends StObject {
    def this(options: PutPolicyOptions) = this()
    
    def getFlags(): Any = js.native
    
    def uploadToken(): String = js.native
    def uploadToken(mac: Mac): String = js.native
  }
  
  /**
    *
    * @param bucket
    * @param key
    * @param headers
    */
  inline def changeHeadersOp(bucket: String, key: String, headers: StringDictionary[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeHeadersOp")(bucket.asInstanceOf[js.Any], key.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    *
    * @param bucket
    * @param key
    * @param newMime
    */
  inline def changeMimeOp(bucket: String, key: String, newMime: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeMimeOp")(bucket.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newMime.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    *
    * @param bucket
    * @param key
    * @param newType
    */
  inline def changeTypeOp(bucket: String, key: String, newType: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeTypeOp")(bucket.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    *
    * @param srcBucket
    * @param srcKey
    * @param destBucket
    * @param destKey
    * @param options
    */
  inline def copyOp(srcBucket: String, srcKey: String, destBucket: String, destKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("copyOp")(srcBucket.asInstanceOf[js.Any], srcKey.asInstanceOf[js.Any], destBucket.asInstanceOf[js.Any], destKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def copyOp(srcBucket: String, srcKey: String, destBucket: String, destKey: String, options: Force): String = (^.asInstanceOf[js.Dynamic].applyDynamic("copyOp")(srcBucket.asInstanceOf[js.Any], srcKey.asInstanceOf[js.Any], destBucket.asInstanceOf[js.Any], destKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    *
    * @param bucket
    * @param key
    * @param days
    */
  inline def deleteAfterDaysOp(bucket: String, key: String, days: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteAfterDaysOp")(bucket.asInstanceOf[js.Any], key.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    *
    * @param bucket
    * @param key
    */
  inline def deleteOp(bucket: String, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteOp")(bucket.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    *
    * @param srcBucket
    * @param srcKey
    * @param destBucket
    * @param destKey
    * @param options
    */
  inline def moveOp(srcBucket: String, srcKey: String, destBucket: String, destKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("moveOp")(srcBucket.asInstanceOf[js.Any], srcKey.asInstanceOf[js.Any], destBucket.asInstanceOf[js.Any], destKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def moveOp(srcBucket: String, srcKey: String, destBucket: String, destKey: String, options: Force): String = (^.asInstanceOf[js.Dynamic].applyDynamic("moveOp")(srcBucket.asInstanceOf[js.Any], srcKey.asInstanceOf[js.Any], destBucket.asInstanceOf[js.Any], destKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    *
    * @param bucket
    * @param key
    */
  inline def statOp(bucket: String, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("statOp")(bucket.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.qiniu.qiniuStrings.put
    - typings.qiniu.qiniuStrings.mkfile
    - typings.qiniu.qiniuStrings.delete
    - typings.qiniu.qiniuStrings.copy
    - typings.qiniu.qiniuStrings.move
    - typings.qiniu.qiniuStrings.append
    - typings.qiniu.qiniuStrings.disable
    - typings.qiniu.qiniuStrings.enable
    - typings.qiniu.qiniuStrings.deleteMarkerCreate
    - typings.qiniu.qiniuStrings.predelete
    - typings.qiniu.qiniuStrings.restoreColoncompleted
  */
  trait BucketEventName extends StObject
  object BucketEventName {
    
    inline def append: typings.qiniu.qiniuStrings.append = "append".asInstanceOf[typings.qiniu.qiniuStrings.append]
    
    inline def copy: typings.qiniu.qiniuStrings.copy = "copy".asInstanceOf[typings.qiniu.qiniuStrings.copy]
    
    inline def delete: typings.qiniu.qiniuStrings.delete = "delete".asInstanceOf[typings.qiniu.qiniuStrings.delete]
    
    inline def deleteMarkerCreate: typings.qiniu.qiniuStrings.deleteMarkerCreate = "deleteMarkerCreate".asInstanceOf[typings.qiniu.qiniuStrings.deleteMarkerCreate]
    
    inline def disable: typings.qiniu.qiniuStrings.disable = "disable".asInstanceOf[typings.qiniu.qiniuStrings.disable]
    
    inline def enable: typings.qiniu.qiniuStrings.enable = "enable".asInstanceOf[typings.qiniu.qiniuStrings.enable]
    
    inline def mkfile: typings.qiniu.qiniuStrings.mkfile = "mkfile".asInstanceOf[typings.qiniu.qiniuStrings.mkfile]
    
    inline def move: typings.qiniu.qiniuStrings.move = "move".asInstanceOf[typings.qiniu.qiniuStrings.move]
    
    inline def predelete: typings.qiniu.qiniuStrings.predelete = "predelete".asInstanceOf[typings.qiniu.qiniuStrings.predelete]
    
    inline def put: typings.qiniu.qiniuStrings.put = "put".asInstanceOf[typings.qiniu.qiniuStrings.put]
    
    inline def restoreColoncompleted: typings.qiniu.qiniuStrings.restoreColoncompleted = "restore:completed".asInstanceOf[typings.qiniu.qiniuStrings.restoreColoncompleted]
  }
  
  trait ListPrefixOptions extends StObject {
    
    /**
      * 指定目录分隔符
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * 每次返回的最大列举文件数量
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * 上一次列举返回的位置标记
      */
    var marker: js.UndefOr[Any] = js.undefined
    
    /**
      * 列举的文件前缀
      */
    var prefix: js.UndefOr[String] = js.undefined
  }
  object ListPrefixOptions {
    
    inline def apply(): ListPrefixOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListPrefixOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListPrefixOptions] (val x: Self) extends AnyVal {
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMarker(value: Any): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  trait PutPolicyOptions extends StObject {
    
    var callbackBody: js.UndefOr[String] = js.undefined
    
    var callbackBodyType: js.UndefOr[String] = js.undefined
    
    var callbackFetchKey: js.UndefOr[Double] = js.undefined
    
    var callbackHost: js.UndefOr[String] = js.undefined
    
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    var deleteAfterDays: js.UndefOr[Double] = js.undefined
    
    var detectMime: js.UndefOr[Double] = js.undefined
    
    var endUser: js.UndefOr[String] = js.undefined
    
    var expires: js.UndefOr[Double] = js.undefined
    
    var fileType: js.UndefOr[Double] = js.undefined
    
    var fsizeLimit: js.UndefOr[Double] = js.undefined
    
    var fsizeMin: js.UndefOr[Double] = js.undefined
    
    var insertOnly: js.UndefOr[Double] = js.undefined
    
    var isPrefixalScope: js.UndefOr[Double] = js.undefined
    
    var mimeLimit: js.UndefOr[String] = js.undefined
    
    var persistentNotifyUrl: js.UndefOr[String] = js.undefined
    
    var persistentOps: js.UndefOr[String] = js.undefined
    
    var persistentPipeline: js.UndefOr[String] = js.undefined
    
    var returnBody: js.UndefOr[String] = js.undefined
    
    var returnUrl: js.UndefOr[String] = js.undefined
    
    var saveKey: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
  }
  object PutPolicyOptions {
    
    inline def apply(): PutPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutPolicyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PutPolicyOptions] (val x: Self) extends AnyVal {
      
      inline def setCallbackBody(value: String): Self = StObject.set(x, "callbackBody", value.asInstanceOf[js.Any])
      
      inline def setCallbackBodyType(value: String): Self = StObject.set(x, "callbackBodyType", value.asInstanceOf[js.Any])
      
      inline def setCallbackBodyTypeUndefined: Self = StObject.set(x, "callbackBodyType", js.undefined)
      
      inline def setCallbackBodyUndefined: Self = StObject.set(x, "callbackBody", js.undefined)
      
      inline def setCallbackFetchKey(value: Double): Self = StObject.set(x, "callbackFetchKey", value.asInstanceOf[js.Any])
      
      inline def setCallbackFetchKeyUndefined: Self = StObject.set(x, "callbackFetchKey", js.undefined)
      
      inline def setCallbackHost(value: String): Self = StObject.set(x, "callbackHost", value.asInstanceOf[js.Any])
      
      inline def setCallbackHostUndefined: Self = StObject.set(x, "callbackHost", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setDeleteAfterDays(value: Double): Self = StObject.set(x, "deleteAfterDays", value.asInstanceOf[js.Any])
      
      inline def setDeleteAfterDaysUndefined: Self = StObject.set(x, "deleteAfterDays", js.undefined)
      
      inline def setDetectMime(value: Double): Self = StObject.set(x, "detectMime", value.asInstanceOf[js.Any])
      
      inline def setDetectMimeUndefined: Self = StObject.set(x, "detectMime", js.undefined)
      
      inline def setEndUser(value: String): Self = StObject.set(x, "endUser", value.asInstanceOf[js.Any])
      
      inline def setEndUserUndefined: Self = StObject.set(x, "endUser", js.undefined)
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setFileType(value: Double): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      inline def setFsizeLimit(value: Double): Self = StObject.set(x, "fsizeLimit", value.asInstanceOf[js.Any])
      
      inline def setFsizeLimitUndefined: Self = StObject.set(x, "fsizeLimit", js.undefined)
      
      inline def setFsizeMin(value: Double): Self = StObject.set(x, "fsizeMin", value.asInstanceOf[js.Any])
      
      inline def setFsizeMinUndefined: Self = StObject.set(x, "fsizeMin", js.undefined)
      
      inline def setInsertOnly(value: Double): Self = StObject.set(x, "insertOnly", value.asInstanceOf[js.Any])
      
      inline def setInsertOnlyUndefined: Self = StObject.set(x, "insertOnly", js.undefined)
      
      inline def setIsPrefixalScope(value: Double): Self = StObject.set(x, "isPrefixalScope", value.asInstanceOf[js.Any])
      
      inline def setIsPrefixalScopeUndefined: Self = StObject.set(x, "isPrefixalScope", js.undefined)
      
      inline def setMimeLimit(value: String): Self = StObject.set(x, "mimeLimit", value.asInstanceOf[js.Any])
      
      inline def setMimeLimitUndefined: Self = StObject.set(x, "mimeLimit", js.undefined)
      
      inline def setPersistentNotifyUrl(value: String): Self = StObject.set(x, "persistentNotifyUrl", value.asInstanceOf[js.Any])
      
      inline def setPersistentNotifyUrlUndefined: Self = StObject.set(x, "persistentNotifyUrl", js.undefined)
      
      inline def setPersistentOps(value: String): Self = StObject.set(x, "persistentOps", value.asInstanceOf[js.Any])
      
      inline def setPersistentOpsUndefined: Self = StObject.set(x, "persistentOps", js.undefined)
      
      inline def setPersistentPipeline(value: String): Self = StObject.set(x, "persistentPipeline", value.asInstanceOf[js.Any])
      
      inline def setPersistentPipelineUndefined: Self = StObject.set(x, "persistentPipeline", js.undefined)
      
      inline def setReturnBody(value: String): Self = StObject.set(x, "returnBody", value.asInstanceOf[js.Any])
      
      inline def setReturnBodyUndefined: Self = StObject.set(x, "returnBody", js.undefined)
      
      inline def setReturnUrl(value: String): Self = StObject.set(x, "returnUrl", value.asInstanceOf[js.Any])
      
      inline def setReturnUrlUndefined: Self = StObject.set(x, "returnUrl", js.undefined)
      
      inline def setSaveKey(value: String): Self = StObject.set(x, "saveKey", value.asInstanceOf[js.Any])
      
      inline def setSaveKeyUndefined: Self = StObject.set(x, "saveKey", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
