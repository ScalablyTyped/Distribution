package typings.qiniuJs

import typings.qiniuJs.qiniuJsStrings.http
import typings.qiniuJs.qiniuJsStrings.https
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUploadHostsMod {
  
  @JSImport("qiniu-js/esm/upload/hosts", "Host")
  @js.native
  open class Host protected () extends StObject {
    def this(host: String, protocol: https | http) = this()
    
    /**
      * @param  {number} time 单位秒，默认 20s
      * @description 冻结该 host 对象，该 host 将在指定时间内不可用
      */
    def freeze(): Unit = js.native
    def freeze(time: Double): Unit = js.native
    
    /**
      * @description 获取解冻时间
      */
    def getUnfreezeTime(): js.UndefOr[Double] = js.native
    
    /**
      * @description 获取当前 host 的完整 url
      */
    def getUrl(): String = js.native
    
    var host: String = js.native
    
    /**
      * @description 当前 host 是否为冻结状态
      */
    def isFrozen(): Boolean = js.native
    
    var protocol: https | http = js.native
    
    /**
      * @description 解冻该 host
      */
    def unfreeze(): Unit = js.native
  }
  
  @JSImport("qiniu-js/esm/upload/hosts", "HostPool")
  @js.native
  /**
    * @param  {string[]} initHosts
    * @description 如果在构造时传入 initHosts，则该 host 池始终使用传入的 initHosts 做为可用的数据
    */
  open class HostPool () extends StObject {
    def this(initHosts: js.Array[String]) = this()
    
    /**
      * @description 缓存的 host 表，以 bucket 和 accessKey 作为 key
      */
    /* private */ var cachedHostsMap: Any = js.native
    
    /**
      * @param  {string} accessKey
      * @param  {string} bucketName
      * @param  {InternalConfig['upprotocol']} protocol
      * @returns  {Promise<Host | null>}
      * @description 获取一个可用的上传 Host，排除已冻结的
      */
    def getUp(accessKey: String, bucketName: String, protocol: https | http): js.Promise[Host | Null] = js.native
    
    /* private */ var initHosts: Any = js.native
    
    /**
      * @param  {string} accessKey
      * @param  {string} bucketName
      * @param  {InternalConfig['upprotocol']} protocol
      * @returns  {Promise<void>}
      * @description 刷新最新的 host 数据，如果用户在构造时该类时传入了 host 或者已经存在缓存则不会发起请求
      */
    /* private */ var refresh: Any = js.native
    
    /**
      * @param  {string} accessKey
      * @param  {string} bucketName
      * @param  {string[]} hosts
      * @param  {InternalConfig['upprotocol']} protocol
      * @returns  {void}
      * @description 注册可用 host
      */
    /* private */ var register: Any = js.native
  }
}
