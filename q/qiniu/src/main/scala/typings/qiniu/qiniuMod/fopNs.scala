package typings.qiniu.qiniuMod

import typings.qiniu.qiniuMod.authNs.digestNs.Mac
import typings.qiniu.qiniuMod.confNs.Config
import typings.qiniu.qiniuMod.fopNs.PfopOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "fop")
@js.native
object fopNs extends js.Object {
  @js.native
  class OperationManager () extends js.Object {
    def this(mac: Mac) = this()
    def this(mac: Mac, config: Config) = this()
    var config: Config = js.native
    var mac: Mac = js.native
    def pfop(
      bucket: String,
      key: String,
      fops: js.Array[String],
      pipeline: String,
      options: Null,
      callback: callback
    ): Unit = js.native
    /**
      * 发送持久化数据处理请求
      * @param bucket 空间名称
      * @param key 文件名称
      * @param fops 处理指令集合
      * @param pipeline 处理队列名称
      * @param options
      * @param callback
      */
    def pfop(
      bucket: String,
      key: String,
      fops: js.Array[String],
      pipeline: String,
      options: PfopOptions,
      callback: callback
    ): Unit = js.native
    /**
      * 查询持久化数据处理进度
      * @param persistentId pfop操作返回的持久化处理ID
      * @param callback
      */
    def prefop(persistentId: String, callback: callback): Unit = js.native
  }
  
  trait PfopOptions extends js.Object {
    /**
      * 结果是否强制覆盖已有的同名文件
      */
    var force: js.UndefOr[Boolean] = js.undefined
    /**
      * 回调业务服务器，通知处理结果
      */
    var notifyURL: js.UndefOr[String] = js.undefined
  }
  
}

