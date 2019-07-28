package typings.qlik.qlikMod

import typings.qlik.qlikMod.LanguageCodesNs.ALL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qlik", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def callRepository(path: String, method: String, body: String): js.Promise[_] = js.native
  def currApp(reference: js.Object): App = js.native
  def getAppList(callback: js.Array[App], config: GetAppConfig): Unit = js.native
  def getExtensionList(callback: js.Array[_]): js.Promise[_] = js.native
  def getGlobal(config: GetGlobalConfig): Global = js.native
  def openApp(appId: String, config: GetAppConfig): App = js.native
  def registerExtension(id: String, impl: Extension, metadata: js.Object): Unit = js.native
  def resize(): Unit = js.native
  def resize(ID: String): Unit = js.native
  def setLanguage(lang: ALL): Unit = js.native
  def setOnError(
    onError: js.Function1[/* error */ Error, Unit],
    onWarning: js.Function1[/* warning */ String, Unit]
  ): Unit = js.native
  def table(ext: js.Object): Unit = js.native
  def table(ext: js.Object, path: String): Unit = js.native
}

