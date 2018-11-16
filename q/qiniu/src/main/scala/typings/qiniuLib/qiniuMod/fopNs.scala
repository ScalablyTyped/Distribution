package typings
package qiniuLib.qiniuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "fop")
@js.native
object fopNs extends js.Object {
  @js.native
  class OperationManager () extends js.Object {
    def this(mac: qiniuLib.qiniuMod.authNs.digestNs.Mac) = this()
    def this(mac: qiniuLib.qiniuMod.authNs.digestNs.Mac, config: qiniuLib.qiniuMod.confNs.Config) = this()
    var config: qiniuLib.qiniuMod.confNs.Config = js.native
    var mac: qiniuLib.qiniuMod.authNs.digestNs.Mac = js.native
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
      bucket: java.lang.String,
      key: java.lang.String,
      fops: js.Array[java.lang.String],
      pipeline: java.lang.String,
      options: PfopOptions,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
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
      bucket: java.lang.String,
      key: java.lang.String,
      fops: js.Array[java.lang.String],
      pipeline: java.lang.String,
      options: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 查询持久化数据处理进度
             * @param persistentId pfop操作返回的持久化处理ID
             * @param callback
             */
    def prefop(persistentId: java.lang.String, callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
  }
  
  
  trait PfopOptions extends js.Object {
    /**
             * 结果是否强制覆盖已有的同名文件
             */
    var force: js.UndefOr[scala.Boolean] = js.undefined
    /**
             * 回调业务服务器，通知处理结果
             */
    var notifyURL: js.UndefOr[java.lang.String] = js.undefined
  }
  
}

