package typings.qiniu.mod

import typings.qiniu.mod.auth.digest.Mac
import typings.qiniu.mod.conf.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fop {
  
  @JSImport("qiniu", "fop.OperationManager")
  @js.native
  open class OperationManager () extends StObject {
    def this(mac: Mac) = this()
    def this(mac: Unit, config: Config) = this()
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
  
  trait PfopOptions extends StObject {
    
    /**
      * 结果是否强制覆盖已有的同名文件
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 回调业务服务器，通知处理结果
      */
    var notifyURL: js.UndefOr[String] = js.undefined
  }
  object PfopOptions {
    
    inline def apply(): PfopOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PfopOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PfopOptions] (val x: Self) extends AnyVal {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setNotifyURL(value: String): Self = StObject.set(x, "notifyURL", value.asInstanceOf[js.Any])
      
      inline def setNotifyURLUndefined: Self = StObject.set(x, "notifyURL", js.undefined)
    }
  }
}
