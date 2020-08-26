package typings.qiniu.mod.fop

import typings.qiniu.mod.auth.digest.Mac
import typings.qiniu.mod.callback
import typings.qiniu.mod.conf.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "fop.OperationManager")
@js.native
class OperationManager () extends js.Object {
  def this(mac: Mac) = this()
  def this(mac: js.UndefOr[scala.Nothing], config: Config) = this()
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

