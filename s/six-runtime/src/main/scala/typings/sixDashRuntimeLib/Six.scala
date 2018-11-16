package typings
package sixDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Six extends js.Object {
  /**
       * DataProvider类，所有的data-provider必须继承这个类
       */
  var DataProvider: sixDashRuntimeLib.SixNs.pluginsNs.dataProviderNs.DataProvider = js.native
  /**
       * NODE_ENV的缩短版
       *
       * production、prod => prod
       *
       * dev、develop、development => dev
       */
  val ENV: java.lang.String = js.native
  /**
       * process.env.NODE_ENV
       */
  val NODE_ENV: java.lang.String = js.native
  /**
       * Six的rootPath
       */
  val ROOT_PATH: java.lang.String = js.native
  /**
       * 发送请求的工具方法，会将用户的cookie和traceId透传过去
       */
  var http: sixDashRuntimeLib.SixNs.pluginsNs.http = js.native
  /**
       * 打日志方法
       */
  var log: sixDashRuntimeLib.SixNs.pluginsNs.log = js.native
  /**
       * Six的plugin的map
       */
  val plugins: sixDashRuntimeLib.SixNs.PluginsMap = js.native
  /**
       * 渲染函数
       */
  @JSName("render")
  var render_Original: sixDashRuntimeLib.SixNs.pluginsNs.viewNs.render = js.native
  /**
       * rpc调用工具方法，返回ThriftPool实例
       */
  @JSName("rpc")
  var rpc_Original: sixDashRuntimeLib.SixNs.pluginsNs.rpc = js.native
  /**
       * 时间统计工具
       */
  var time: sixDashRuntimeLib.SixNs.pluginsNs.timeNs.timmer = js.native
  /**
       * 执行某个data-provider，并返回执行之后的值
       */
  def dp(name: java.lang.String): js.Any = js.native
  /**
       * 针对这次请求生效的数据缓存 get
       */
  def get(key: java.lang.String): js.Any = js.native
  /**
       * 渲染函数
       */
  def render(name: java.lang.String): stdLib.Promise[_] = js.native
  /**
       * 渲染函数
       */
  def render(name: java.lang.String, runtimeConf: scala.Null, data: js.Object): stdLib.Promise[_] = js.native
  /**
       * 渲染函数
       */
  def render(name: java.lang.String, runtimeConf: sixDashRuntimeLib.SixNs.pluginsNs.viewNs.runtimeConf): stdLib.Promise[_] = js.native
  /**
       * 渲染函数
       */
  def render(
    name: java.lang.String,
    runtimeConf: sixDashRuntimeLib.SixNs.pluginsNs.viewNs.runtimeConf,
    data: js.Object
  ): stdLib.Promise[_] = js.native
  /**
       * rpc调用工具方法，返回ThriftPool实例
       */
  def rpc(config: js.Object): js.Object = js.native
  /**
       * 针对这次请求生效的数据缓存 set
       */
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
}

